package xyz.adscope.common.analyse2.base.model.init;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AnalyseInitConfigModel extends xyz.adscope.common.analyse2.base.model.AnalyseBasicReceiveLog {
    private xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.c a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "access_key")
    private final java.lang.String accessKey;
    private xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.f b;
    private xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.b c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "config_version_md5")
    private java.lang.String configVersionMd5;
    private xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.e d;
    private xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.d e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lastUpdateTime")
    private java.lang.String lastUpdateTime;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "log_version")
    private final java.lang.String logVersion;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "app_id")
    private java.lang.String mAppID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "custom_id")
    private java.lang.String mBizID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "hex_id")
    private java.lang.String mHex;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "start_id")
    private java.lang.String mStartID;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "sdk")
    private xyz.adscope.common.analyse2.base.model.init.AnalyseSDKModel sdkModel;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "logStrategy")
    private xyz.adscope.common.analyse2.base.model.init.AnalyseLogStrategyModel strategyModel;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "user")
    private xyz.adscope.common.analyse2.base.model.init.AnalyseUserModel userModel;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b extends xyz.adscope.common.a {

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "app_version")
        private java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "app_name")
        private java.lang.String b;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "bundle_id")
        private java.lang.String c;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "install_time")
        private java.lang.String d;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "update_time")
        private java.lang.String e;

        private b(android.content.Context r5) {
                r4 = this;
                r4.<init>()
                java.lang.String r0 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppName(r5)
                r4.b = r0
                java.lang.String r0 = xyz.adscope.common.v2.dev.info.PackageUtil.getAppVersionName(r5)
                r4.a = r0
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

        /* synthetic */ b(android.content.Context r1, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c extends xyz.adscope.common.a {

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "version")
        private java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "custom_data")
        private java.lang.String b;

        private c(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        /* synthetic */ c(java.lang.String r1, java.lang.String r2, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class d extends xyz.adscope.common.a {

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "device_name")
        private java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "device_type")
        private java.lang.String b;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "said")
        private java.lang.String c;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "os")
        private java.lang.String d;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "country")
        private java.lang.String e;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "zone")
        private java.lang.String f;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lang")
        private java.lang.String g;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "connection_type")
        private java.lang.String h;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "carrier")
        private java.lang.String i;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "osv")
        private java.lang.String j;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "oaid")
        private java.lang.String k;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "model")
        private java.lang.String l;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "w")
        private java.lang.String m;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "h")
        private java.lang.String n;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "make")
        private java.lang.String o;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "brand")
        private java.lang.String p;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "update_mark")
        private java.lang.String q;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "file_mark")
        private java.lang.String r;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "hard_disk_size")
        private java.lang.String s;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "user_agent")
        private java.lang.String t;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "physical_memory")
        private java.lang.String u;

        private d(xyz.adscope.common.v2.dev.IDeviceInterface r3, java.lang.String r4, java.lang.String r5) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r3.getDeviceName()
                r2.a = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r3.getDeviceType()
                r0.append(r1)
                java.lang.String r1 = ""
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.b = r0
                r2.c = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                int r0 = r3.getOs()
                r5.append(r0)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r2.d = r5
                java.lang.String r5 = r3.getCountryCode()
                r2.e = r5
                java.lang.String r5 = r3.getTimeZone()
                r2.f = r5
                java.lang.String r5 = r3.getLanguage()
                r2.g = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                int r0 = r3.getConnectType()
                r5.append(r0)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r2.h = r5
                java.lang.String r5 = r3.getCarrier()
                r2.i = r5
                java.lang.String r5 = r3.getAndroidRelease()
                r2.j = r5
                r2.k = r4
                java.lang.String r4 = r3.getModel()
                r2.l = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                int r5 = r3.getScreenWidthPX()
                r4.append(r5)
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                r2.m = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                int r5 = r3.getScreenHeightPX()
                r4.append(r5)
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                r2.n = r4
                java.lang.String r4 = r3.getManufacturer()
                r2.o = r4
                java.lang.String r4 = r3.getBrand()
                r2.p = r4
                java.lang.String r4 = r3.getDeviceUpdateMark()
                r2.q = r4
                java.lang.String r4 = r3.getFileMark()
                r2.r = r4
                java.lang.String r4 = r3.getHardDisk()
                r2.s = r4
                java.lang.String r4 = r3.getUserAgent()
                r2.t = r4
                java.lang.String r3 = r3.getPhysicalMemory()
                r2.u = r3
                return
        }

        /* synthetic */ d(xyz.adscope.common.v2.dev.IDeviceInterface r1, java.lang.String r2, java.lang.String r3, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class e extends xyz.adscope.common.a {

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "version")
        private java.lang.String a;

        private e(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ e(java.lang.String r1, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class f extends xyz.adscope.common.a {

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "user_id")
        private java.lang.String a;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "user_custom_data")
        private java.lang.String b;

        @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "lmt")
        private java.lang.String c;

        private f(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        /* synthetic */ f(java.lang.String r1, java.lang.String r2, java.lang.String r3, xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }
    }

    public AnalyseInitConfigModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "1.9.0"
            r0.logVersion = r1
            java.lang.String r1 = "sdk"
            r0.accessKey = r1
            return
    }

    public org.json.JSONObject a(android.content.Context r6) {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r5.mHex     // Catch: java.lang.Throwable -> L23
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r0.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r5.mStartID     // Catch: java.lang.Throwable -> L23
            int r1 = xyz.adscope.common.v2.tool.str.SerialUtil.generateCRCHex(r1)     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = ""
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r5.mHex = r0     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r6 = move-exception
            goto Lfd
        L26:
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$c r0 = r5.a     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 != 0) goto L48
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$c r0 = new xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$c     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.analyse2.base.model.init.AnalyseLogStrategyModel r2 = r5.strategyModel     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L36
            java.lang.String r2 = r2.f()     // Catch: java.lang.Throwable -> L23
            goto L38
        L36:
            java.lang.String r2 = ""
        L38:
            xyz.adscope.common.analyse2.base.model.init.AnalyseLogStrategyModel r3 = r5.strategyModel     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L41
            java.lang.String r3 = r3.d()     // Catch: java.lang.Throwable -> L23
            goto L43
        L41:
            java.lang.String r3 = ""
        L43:
            r0.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L23
            r5.a = r0     // Catch: java.lang.Throwable -> L23
        L48:
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$f r0 = r5.b     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L74
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$f r0 = new xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$f     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.analyse2.base.model.init.AnalyseUserModel r2 = r5.userModel     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L57
            java.lang.String r2 = r2.e()     // Catch: java.lang.Throwable -> L23
            goto L59
        L57:
            java.lang.String r2 = ""
        L59:
            xyz.adscope.common.analyse2.base.model.init.AnalyseUserModel r3 = r5.userModel     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L62
            java.lang.String r3 = r3.d()     // Catch: java.lang.Throwable -> L23
            goto L64
        L62:
            java.lang.String r3 = ""
        L64:
            xyz.adscope.common.analyse2.base.model.init.AnalyseUserModel r4 = r5.userModel     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L6d
            java.lang.String r4 = r4.f()     // Catch: java.lang.Throwable -> L23
            goto L6f
        L6d:
            java.lang.String r4 = ""
        L6f:
            r0.<init>(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L23
            r5.b = r0     // Catch: java.lang.Throwable -> L23
        L74:
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$b r0 = r5.c     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L7f
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$b r0 = new xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$b     // Catch: java.lang.Throwable -> L23
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L23
            r5.c = r0     // Catch: java.lang.Throwable -> L23
        L7f:
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$e r0 = r5.d     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L95
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$e r0 = new xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$e     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.analyse2.base.model.init.AnalyseSDKModel r2 = r5.sdkModel     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L8e
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L23
            goto L90
        L8e:
            java.lang.String r2 = ""
        L90:
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L23
            r5.d = r0     // Catch: java.lang.Throwable -> L23
        L95:
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$d r0 = r5.e     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Lc0
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$d r0 = new xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$d     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.v2.dev.DeviceObtainManager r2 = xyz.adscope.common.v2.dev.DeviceObtainManager.getInstance()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r6 = r2.getOrCreateImplement(r6)     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.v2.dev.IDeviceInterface r6 = (xyz.adscope.common.v2.dev.IDeviceInterface) r6     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.analyse2.base.model.init.AnalyseUserModel r2 = r5.userModel     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto Lae
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L23
            goto Lb0
        Lae:
            java.lang.String r2 = ""
        Lb0:
            xyz.adscope.common.analyse2.base.model.init.AnalyseUserModel r3 = r5.userModel     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto Lb9
            java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L23
            goto Lbb
        Lb9:
            java.lang.String r3 = ""
        Lbb:
            r0.<init>(r6, r2, r3, r1)     // Catch: java.lang.Throwable -> L23
            r5.e = r0     // Catch: java.lang.Throwable -> L23
        Lc0:
            org.json.JSONObject r6 = super.a()     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "device"
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$d r1 = r5.e     // Catch: java.lang.Throwable -> L23
            org.json.JSONObject r1 = r1.getAnalyseJsonObject()     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r6, r0, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "app"
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$b r1 = r5.c     // Catch: java.lang.Throwable -> L23
            org.json.JSONObject r1 = r1.getAnalyseJsonObject()     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r6, r0, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "user"
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$f r1 = r5.b     // Catch: java.lang.Throwable -> L23
            org.json.JSONObject r1 = r1.getAnalyseJsonObject()     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r6, r0, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "sdk"
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$e r1 = r5.d     // Catch: java.lang.Throwable -> L23
            org.json.JSONObject r1 = r1.getAnalyseJsonObject()     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r6, r0, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "configuration"
            xyz.adscope.common.analyse2.base.model.init.AnalyseInitConfigModel$c r1 = r5.a     // Catch: java.lang.Throwable -> L23
            org.json.JSONObject r1 = r1.getAnalyseJsonObject()     // Catch: java.lang.Throwable -> L23
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r6, r0, r1)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            return r6
        Lfd:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r6
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.mStartID
            return r0
    }

    public xyz.adscope.common.analyse2.base.model.init.AnalyseLogStrategyModel c() {
            r1 = this;
            xyz.adscope.common.analyse2.base.model.init.AnalyseLogStrategyModel r0 = r1.strategyModel
            return r0
    }
}
