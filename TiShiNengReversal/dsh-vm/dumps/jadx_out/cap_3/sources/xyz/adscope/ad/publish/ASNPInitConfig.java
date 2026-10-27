package xyz.adscope.ad.publish;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class ASNPInitConfig {
    public static final java.lang.String AD_SCOPE_ADN = "AdScopeADN";
    private final java.lang.String a;
    private final java.lang.String b;
    private final boolean c;
    private final boolean d;
    private final java.lang.String e;
    private final java.util.List<java.lang.String> f;
    private final int g;
    private final xyz.adscope.ad.publish.ASNPConstants.UiModel h;
    private final boolean i;
    private final xyz.adscope.ad.publish.IASNPCustomController j;
    private final java.util.Map<java.lang.String, java.lang.Object> k;
    private final java.util.Map<java.lang.String, java.lang.String> l;
    private final java.lang.String m;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.ad.publish.ASNPInitConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ASNPExtraConfig {
        public static final java.lang.String KEY_CUSTOM_USER_AGENT = "customUserAgent";
        public static final java.lang.String KEY_HANDLE_EXCEPTION = "isCanHandleUncaughtException";
        public static final java.lang.String KEY_INIT_NETWORK_OFF = "initOffLine";
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private final java.lang.String a;
        private java.lang.String b;
        private boolean c;
        private boolean d;
        private java.lang.String e;
        private final java.util.List<java.lang.String> f;
        private int g;
        private boolean h;
        private xyz.adscope.ad.publish.ASNPConstants.UiModel i;
        private xyz.adscope.ad.publish.IASNPCustomController j;
        private java.util.Map<java.lang.String, java.lang.Object> k;
        private java.lang.String l;
        private java.util.Map<java.lang.String, java.lang.String> m;

        public Builder(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.g = r0
                xyz.adscope.ad.publish.ASNPConstants$UiModel r0 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_LIGHT
                r1.i = r0
                r1.a = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.f = r2
                java.lang.String r0 = "CNY"
                r2.add(r0)
                return
        }

        static /* synthetic */ java.lang.String a(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        static /* synthetic */ java.util.Map c(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                java.util.Map<java.lang.String, java.lang.Object> r0 = r0.k
                return r0
        }

        static /* synthetic */ java.lang.String d(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                java.lang.String r0 = r0.l
                return r0
        }

        static /* synthetic */ java.util.Map e(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.m
                return r0
        }

        static /* synthetic */ boolean f(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                boolean r0 = r0.c
                return r0
        }

        static /* synthetic */ boolean g(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                boolean r0 = r0.d
                return r0
        }

        static /* synthetic */ java.lang.String h(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                java.lang.String r0 = r0.e
                return r0
        }

        static /* synthetic */ java.util.List i(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                java.util.List<java.lang.String> r0 = r0.f
                return r0
        }

        static /* synthetic */ int j(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                int r0 = r0.g
                return r0
        }

        static /* synthetic */ boolean k(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                boolean r0 = r0.h
                return r0
        }

        static /* synthetic */ xyz.adscope.ad.publish.IASNPCustomController l(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                xyz.adscope.ad.publish.IASNPCustomController r0 = r0.j
                return r0
        }

        static /* synthetic */ xyz.adscope.ad.publish.ASNPConstants.UiModel m(xyz.adscope.ad.publish.ASNPInitConfig.Builder r0) {
                xyz.adscope.ad.publish.ASNPConstants$UiModel r0 = r0.i
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder addCurrency(java.lang.String... r2) {
                r1 = this;
                if (r2 == 0) goto Lb
                java.util.List<java.lang.String> r0 = r1.f
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0.addAll(r2)
            Lb:
                return r1
        }

        public xyz.adscope.ad.publish.ASNPInitConfig build() {
                r2 = this;
                xyz.adscope.ad.publish.ASNPInitConfig r0 = new xyz.adscope.ad.publish.ASNPInitConfig
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setAdCustomController(xyz.adscope.ad.publish.IASNPCustomController r1) {
                r0 = this;
                r0.j = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setAppName(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setCountryCN(int r1) {
                r0 = this;
                r0.g = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setCustomExtra(java.lang.String r1) {
                r0 = this;
                r0.l = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setDebugSetting(boolean r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setExtraConfig(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                r0.k = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setIsTestAd(boolean r1) {
                r0 = this;
                r0.h = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setOptionFields(java.util.Map<java.lang.String, java.lang.String> r1) {
                r0 = this;
                r0.m = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setUiModel(xyz.adscope.ad.publish.ASNPConstants.UiModel r1) {
                r0 = this;
                r0.i = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setUseHttps(boolean r1) {
                r0 = this;
                r0.d = r1
                return r0
        }

        public xyz.adscope.ad.publish.ASNPInitConfig.Builder setUserId(java.lang.String r1) {
                r0 = this;
                r0.e = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OptionFieldKey {
        public static final java.lang.String KEY_COLOR_DARK = "darkColor";
        public static final java.lang.String KEY_COLOR_LIGHT = "lightColor";
    }

    private ASNPInitConfig(xyz.adscope.ad.publish.ASNPInitConfig.Builder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.a(r2)
            r1.a = r0
            java.lang.String r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.b(r2)
            r1.b = r0
            boolean r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.f(r2)
            r1.c = r0
            boolean r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.g(r2)
            r1.d = r0
            java.lang.String r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.h(r2)
            r1.e = r0
            java.util.List r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.i(r2)
            r1.f = r0
            int r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.j(r2)
            r1.g = r0
            boolean r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.k(r2)
            r1.i = r0
            xyz.adscope.ad.publish.IASNPCustomController r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.l(r2)
            r1.j = r0
            xyz.adscope.ad.publish.ASNPConstants$UiModel r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.m(r2)
            r1.h = r0
            java.util.Map r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.c(r2)
            r1.k = r0
            java.lang.String r0 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.d(r2)
            r1.m = r0
            java.util.Map r2 = xyz.adscope.ad.publish.ASNPInitConfig.Builder.e(r2)
            r1.l = r2
            return
    }

    /* synthetic */ ASNPInitConfig(xyz.adscope.ad.publish.ASNPInitConfig.Builder r1, xyz.adscope.ad.publish.ASNPInitConfig.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private boolean a() {
            r1 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r1.j
            if (r0 == 0) goto Ld
            boolean r0 = r0.isCanGatherOAID()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    private boolean b() {
            r1 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r1.j
            if (r0 == 0) goto Ld
            boolean r0 = r0.isSupportPersonalized()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public boolean canUpdateLocation() {
            r1 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r1.j
            if (r0 == 0) goto Ld
            boolean r0 = r0.isCanUpdateLocation()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public boolean canUseOAIDInfo() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Le
            boolean r0 = r1.b()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String getAppName() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public int getCCPAAuthorise() {
            r2 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r2.j
            if (r0 == 0) goto L10
            xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r0 = r0.getUnderageTag()
            int r0 = r0.getCode()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            r0 = 0
            return r0
    }

    public int getCOPPAAuthorise() {
            r2 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r2.j
            if (r0 == 0) goto L10
            xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r0 = r0.getUnderageTag()
            int r0 = r0.getCode()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            r0 = 0
            return r0
    }

    public int getCountryCN() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public java.util.List<java.lang.String> getCurrency() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f
            return r0
    }

    public java.lang.String getCustomGAID() {
            r1 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getGAID()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public xyz.adscope.ad.publish.loc.ASNPLocation getCustomLocation() {
            r1 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r1.j
            if (r0 == 0) goto L9
            xyz.adscope.ad.publish.loc.ASNPLocation r0 = r0.getASNPLocation()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String getCustomOAID() {
            r1 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getOAID()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getDarkColor() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.l
            if (r0 == 0) goto Ld
            java.lang.String r1 = "darkColor"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            java.lang.String r0 = ""
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getExtConfig() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.k
            return r0
    }

    public int getGDPRAuthorise() {
            r2 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r2.j
            if (r0 == 0) goto L10
            xyz.adscope.ad.publish.IASNPCustomController$UnderageTag r0 = r0.getUnderageTag()
            int r0 = r0.getCode()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            r0 = 0
            return r0
    }

    public boolean getIsTestAd() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public java.lang.String getLightColor() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.l
            if (r0 == 0) goto Ld
            java.lang.String r1 = "lightColor"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            java.lang.String r0 = ""
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getOptionFields() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.l
            return r0
    }

    public java.lang.String getOptionInfoJson() {
            r1 = this;
            java.lang.String r0 = r1.m
            return r0
    }

    public xyz.adscope.ad.publish.ASNPConstants.UiModel getUiModel() {
            r1 = this;
            xyz.adscope.ad.publish.ASNPConstants$UiModel r0 = r1.h
            return r0
    }

    public java.lang.String getUserId() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public boolean isDebugSetting() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    public boolean isSupportSensor() {
            r1 = this;
            xyz.adscope.ad.publish.IASNPCustomController r0 = r1.j
            if (r0 == 0) goto Ld
            boolean r0 = r0.isCanUseSensor()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public boolean isUseHttps() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }
}
