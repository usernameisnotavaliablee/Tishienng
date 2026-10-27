package com.qq.e.ads.nativ;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class NativeUnifiedADAppInfoImpl implements com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo {
    private final java.lang.String a;
    private final java.lang.String b;
    private final long c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final java.lang.String g;
    private final java.lang.String h;
    private final java.lang.String i;
    private final java.lang.String j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface Keys {
        public static final java.lang.String APP_NAME = "app_name";
        public static final java.lang.String AUTHOR_NAME = "author_name";
        public static final java.lang.String DESCRIPTION_URL = "description_url";
        public static final java.lang.String ICP_INFO_URL = "icp_info_url";
        public static final java.lang.String ICP_NUMBER = "icp_number";
        public static final java.lang.String PACKAGE_SIZE = "package_size";
        public static final java.lang.String PERMISSION_URL = "permission_url";
        public static final java.lang.String PRIVACY_AGREEMENT = "privacy_agreement";
        public static final java.lang.String SUITABLE_AGE = "suitable_age";
        public static final java.lang.String VERSION_NAME = "version_name";
    }

    public NativeUnifiedADAppInfoImpl(org.json.JSONObject r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "app_name"
            java.lang.String r0 = r3.optString(r0)
            r2.a = r0
            java.lang.String r0 = "author_name"
            java.lang.String r0 = r3.optString(r0)
            r2.b = r0
            java.lang.String r0 = "package_size"
            long r0 = r3.optLong(r0)
            r2.c = r0
            java.lang.String r0 = "permission_url"
            java.lang.String r0 = r3.optString(r0)
            r2.d = r0
            java.lang.String r0 = "privacy_agreement"
            java.lang.String r0 = r3.optString(r0)
            r2.e = r0
            java.lang.String r0 = "version_name"
            java.lang.String r0 = r3.optString(r0)
            r2.f = r0
            java.lang.String r0 = "description_url"
            java.lang.String r0 = r3.optString(r0)
            r2.g = r0
            java.lang.String r0 = "icp_number"
            java.lang.String r0 = r3.optString(r0)
            r2.h = r0
            java.lang.String r0 = "suitable_age"
            java.lang.String r0 = r3.optString(r0)
            r2.i = r0
            java.lang.String r0 = "icp_info_url"
            java.lang.String r3 = r3.optString(r0)
            r2.j = r3
            return
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public java.lang.String getAppName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public java.lang.String getAuthorName() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public java.lang.String getDescriptionUrl() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public java.lang.String getIcpInfoUrl() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public java.lang.String getIcpNumber() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public long getPackageSizeBytes() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public java.lang.String getPermissionsUrl() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public java.lang.String getPrivacyAgreement() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public java.lang.String getSuitableAge() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public java.lang.String getVersionName() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }
}
