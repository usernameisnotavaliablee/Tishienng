package com.huawei.hms.mlsdk.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class MLApplicationSetting {
    private final java.lang.Boolean acceptHa;
    private final java.lang.String apiKey;
    private final java.lang.String appId;
    private final java.lang.String appMLKitGrsPolicy;
    private final java.lang.String certFingerprint;
    private final java.util.Map<java.lang.String, java.lang.Object> extProperties;
    private final java.util.List<java.lang.String> haCollectorUrls;
    private final java.lang.String mlSdkVersion;
    private final java.util.List<java.lang.String> mlServiceUrls;
    private final java.lang.String packageName;
    private final java.lang.String projectId;
    private final java.lang.String region;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.mlsdk.common.MLApplicationSetting$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BundleKeyConstants {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class AppInfo {
            public static final java.lang.String APPID = "appid";
            public static final java.lang.String APP_NAME = "appName";
            public static final java.lang.String COUNTRY_CODE = "countryCode";
            public static final java.lang.String ML_SDK_VERSION = "com.huawei.hms.client.service.name:ml-computer-vision";
            public static final java.lang.String OPEN_HA = "openHa";
            public static final java.lang.String PACKAGE_NAME = "packageName";

            public AppInfo() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public BundleKeyConstants() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Factory {
        private java.lang.Boolean acceptHa;
        private java.lang.String apiKey;
        private java.lang.String appId;
        private java.lang.String appMLKitGrsPolicy;
        private java.lang.String certFingerprint;
        private java.util.Map<java.lang.String, java.lang.Object> extProperties;
        private java.util.List<java.lang.String> haCollectorUrls;
        private java.lang.String mlSdkVersion;
        private java.util.List<java.lang.String> mlServiceUrls;
        private java.lang.String packageName;
        private java.lang.String projectId;
        private java.lang.String region;

        public Factory() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mlServiceUrls = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.haCollectorUrls = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.extProperties = r0
                return
        }

        public Factory(com.huawei.hms.mlsdk.common.MLApplicationSetting r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mlServiceUrls = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.haCollectorUrls = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.extProperties = r0
                java.lang.String r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$000(r2)
                r1.appId = r0
                java.lang.String r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$100(r2)
                r1.apiKey = r0
                java.lang.String r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$200(r2)
                r1.packageName = r0
                java.lang.String r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$300(r2)
                r1.certFingerprint = r0
                java.lang.String r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$400(r2)
                r1.region = r0
                java.lang.String r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$500(r2)
                r1.mlSdkVersion = r0
                java.lang.Boolean r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$600(r2)
                r1.acceptHa = r0
                java.util.List r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$700(r2)
                r1.mlServiceUrls = r0
                java.util.List r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$800(r2)
                r1.haCollectorUrls = r0
                java.util.Map r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$900(r2)
                r1.extProperties = r0
                java.lang.String r0 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$1000(r2)
                r1.appMLKitGrsPolicy = r0
                java.lang.String r2 = com.huawei.hms.mlsdk.common.MLApplicationSetting.access$1100(r2)
                r1.projectId = r2
                return
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting create() {
                r14 = this;
                com.huawei.hms.mlsdk.common.MLApplicationSetting r0 = new com.huawei.hms.mlsdk.common.MLApplicationSetting
                java.lang.String r1 = r14.appId
                java.lang.String r2 = r14.apiKey
                java.lang.String r3 = r14.packageName
                java.lang.String r4 = r14.certFingerprint
                java.lang.String r5 = r14.mlSdkVersion
                java.lang.Boolean r6 = r14.acceptHa
                java.lang.String r7 = r14.region
                java.util.List<java.lang.String> r8 = r14.mlServiceUrls
                java.util.List<java.lang.String> r9 = r14.haCollectorUrls
                java.util.Map<java.lang.String, java.lang.Object> r10 = r14.extProperties
                java.lang.String r11 = r14.appMLKitGrsPolicy
                java.lang.String r12 = r14.projectId
                r13 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r0
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setAcceptHa(java.lang.Boolean r1) {
                r0 = this;
                r0.acceptHa = r1
                return r0
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setApiKey(java.lang.String r1) {
                r0 = this;
                r0.apiKey = r1
                return r0
        }

        public void setAppMLKitGrsPolicy(java.lang.String r1) {
                r0 = this;
                r0.appMLKitGrsPolicy = r1
                return
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setApplicationId(java.lang.String r1) {
                r0 = this;
                r0.appId = r1
                return r0
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setCertFingerprint(java.lang.String r1) {
                r0 = this;
                r0.certFingerprint = r1
                return r0
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setExtProperties(java.lang.String r2, java.lang.Object r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.extProperties
                if (r0 != 0) goto Lb
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.extProperties = r0
            Lb:
                java.util.Map<java.lang.String, java.lang.Object> r0 = r1.extProperties
                r0.put(r2, r3)
                return r1
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setHaCollectorUrls(java.util.List<java.lang.String> r1) {
                r0 = this;
                if (r1 != 0) goto L7
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L7:
                r0.haCollectorUrls = r1
                return r0
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setMLSdkVersion(java.lang.String r1) {
                r0 = this;
                r0.mlSdkVersion = r1
                return r0
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setMLServiceUrls(java.util.List<java.lang.String> r1) {
                r0 = this;
                if (r1 != 0) goto L7
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L7:
                r0.mlServiceUrls = r1
                return r0
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setPackageName(java.lang.String r1) {
                r0 = this;
                r0.packageName = r1
                return r0
        }

        public void setProjectId(java.lang.String r1) {
                r0 = this;
                r0.projectId = r1
                return
        }

        public com.huawei.hms.mlsdk.common.MLApplicationSetting.Factory setRegion(java.lang.String r1) {
                r0 = this;
                r0.region = r1
                return r0
        }
    }

    private MLApplicationSetting(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Boolean r6, java.lang.String r7, java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, java.util.Map<java.lang.String, java.lang.Object> r10, java.lang.String r11, java.lang.String r12) {
            r0 = this;
            r0.<init>()
            r0.appId = r1
            r0.apiKey = r2
            r0.packageName = r3
            r0.certFingerprint = r4
            r0.mlSdkVersion = r5
            r0.acceptHa = r6
            r0.region = r7
            r0.mlServiceUrls = r8
            r0.haCollectorUrls = r9
            r0.extProperties = r10
            r0.appMLKitGrsPolicy = r11
            r0.projectId = r12
            return
    }

    /* synthetic */ MLApplicationSetting(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Boolean r6, java.lang.String r7, java.util.List r8, java.util.List r9, java.util.Map r10, java.lang.String r11, java.lang.String r12, com.huawei.hms.mlsdk.common.MLApplicationSetting.AnonymousClass1 r13) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    static /* synthetic */ java.lang.String access$000(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.lang.String r0 = r0.appId
            return r0
    }

    static /* synthetic */ java.lang.String access$100(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.lang.String r0 = r0.apiKey
            return r0
    }

    static /* synthetic */ java.lang.String access$1000(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.lang.String r0 = r0.appMLKitGrsPolicy
            return r0
    }

    static /* synthetic */ java.lang.String access$1100(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.lang.String r0 = r0.projectId
            return r0
    }

    static /* synthetic */ java.lang.String access$200(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.lang.String r0 = r0.packageName
            return r0
    }

    static /* synthetic */ java.lang.String access$300(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.lang.String r0 = r0.certFingerprint
            return r0
    }

    static /* synthetic */ java.lang.String access$400(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.lang.String r0 = r0.region
            return r0
    }

    static /* synthetic */ java.lang.String access$500(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.lang.String r0 = r0.mlSdkVersion
            return r0
    }

    static /* synthetic */ java.lang.Boolean access$600(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.lang.Boolean r0 = r0.acceptHa
            return r0
    }

    static /* synthetic */ java.util.List access$700(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.util.List<java.lang.String> r0 = r0.mlServiceUrls
            return r0
    }

    static /* synthetic */ java.util.List access$800(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.util.List<java.lang.String> r0 = r0.haCollectorUrls
            return r0
    }

    static /* synthetic */ java.util.Map access$900(com.huawei.hms.mlsdk.common.MLApplicationSetting r0) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.extProperties
            return r0
    }

    private boolean equal(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            if (r1 == r2) goto Ld
            if (r1 == 0) goto Lb
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public static com.huawei.hms.mlsdk.common.MLApplicationSetting fromResource(android.content.Context r15) {
            com.huawei.hms.mlsdk.common.AgConnectInfo r0 = new com.huawei.hms.mlsdk.common.AgConnectInfo
            r0.<init>(r15)
            java.lang.String r1 = ""
            java.lang.String r2 = "com.huawei.hms.client.service.name:ml-computer-vision"
            java.lang.String r1 = getMetadata(r15, r2, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L19
            java.lang.String r1 = "UNKNOWN"
            java.lang.String r1 = getKitMetadata(r15, r2, r1)
        L19:
            r7 = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            android.content.ContentResolver r15 = r15.getContentResolver()
            java.lang.String r2 = "hw_app_analytics_state"
            r3 = 0
            int r15 = android.provider.Settings.Secure.getInt(r15, r2, r3)
            r2 = 1
            if (r15 != r2) goto L2c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L2c:
            r8 = r1
            com.huawei.hms.mlsdk.common.MLApplicationSetting r2 = new com.huawei.hms.mlsdk.common.MLApplicationSetting
            java.lang.String r3 = r0.getApplicationId()
            java.lang.String r4 = r0.getApiKey()
            java.lang.String r5 = r0.getPackageName()
            java.lang.String r6 = r0.getCertFingerprint()
            java.lang.String r9 = r0.getRegion()
            java.util.List r10 = r0.getMLServiceUrls()
            java.util.List r11 = r0.getHaCollectorUrls()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.lang.String r13 = r0.getAppMLKitGrsPolicy()
            java.lang.String r14 = r0.getProjectId()
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r2
    }

    private static java.lang.String getKitMetadata(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: java.lang.UnsupportedOperationException -> L1d
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.UnsupportedOperationException -> L1d
            java.lang.String r2 = r2.sourceDir     // Catch: java.lang.UnsupportedOperationException -> L1d
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r2 = r0.getPackageArchiveInfo(r2, r1)     // Catch: java.lang.UnsupportedOperationException -> L1d
            if (r2 == 0) goto L1d
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch: java.lang.UnsupportedOperationException -> L1d
            android.os.Bundle r2 = r2.metaData     // Catch: java.lang.UnsupportedOperationException -> L1d
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.UnsupportedOperationException -> L1d
            return r2
        L1d:
            return r4
    }

    private static java.lang.String getMetadata(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            if (r2 == 0) goto L17
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            return r2
        L17:
            return r4
    }

    private int hashCode(java.lang.Object... r1) {
            r0 = this;
            int r1 = java.util.Arrays.hashCode(r1)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.huawei.hms.mlsdk.common.MLApplicationSetting
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.huawei.hms.mlsdk.common.MLApplicationSetting r4 = (com.huawei.hms.mlsdk.common.MLApplicationSetting) r4
            java.lang.String r0 = r3.appId
            java.lang.String r2 = r4.appId
            boolean r0 = r3.equal(r0, r2)
            if (r0 == 0) goto L1e
            java.lang.String r0 = r3.apiKey
            java.lang.String r4 = r4.apiKey
            boolean r4 = r3.equal(r0, r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public java.lang.Boolean getAcceptHa() {
            r1 = this;
            java.lang.Boolean r0 = r1.acceptHa
            return r0
    }

    public java.lang.String getApiKey() {
            r1 = this;
            java.lang.String r0 = r1.apiKey
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public java.lang.String getAppMLKitGrsPolicy() {
            r1 = this;
            java.lang.String r0 = r1.appMLKitGrsPolicy
            return r0
    }

    public java.lang.String getCertFingerprint() {
            r1 = this;
            java.lang.String r0 = r1.certFingerprint
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getExtProperties() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.extProperties
            return r0
    }

    public java.util.List<java.lang.String> getHaConnectorUrls() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.haCollectorUrls
            return r0
    }

    public java.lang.String getMLSdkVersion() {
            r1 = this;
            java.lang.String r0 = r1.mlSdkVersion
            return r0
    }

    public java.util.List<java.lang.String> getMLServiceUrls() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mlServiceUrls
            return r0
    }

    public java.lang.String getPackageName() {
            r1 = this;
            java.lang.String r0 = r1.packageName
            return r0
    }

    public java.lang.String getProjectId() {
            r1 = this;
            java.lang.String r0 = r1.projectId
            return r0
    }

    public java.lang.String getRegion() {
            r1 = this;
            java.lang.String r0 = r1.region
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.appId
            java.lang.String r1 = r4.apiKey
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = r4.hashCode(r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "appId="
            r0.append(r1)
            java.lang.String r1 = r2.appId
            r0.append(r1)
            java.lang.String r1 = ", packageName="
            r0.append(r1)
            java.lang.String r1 = r2.packageName
            r0.append(r1)
            java.lang.String r1 = ", mlSdkVersion="
            r0.append(r1)
            java.lang.String r1 = r2.mlSdkVersion
            r0.append(r1)
            java.lang.String r1 = ", acceptHa="
            r0.append(r1)
            java.lang.Boolean r1 = r2.acceptHa
            r0.append(r1)
            java.lang.String r1 = ", region="
            r0.append(r1)
            java.lang.String r1 = r2.region
            r0.append(r1)
            java.lang.String r1 = ", mlServiceUrls="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.mlServiceUrls
            r0.append(r1)
            java.lang.String r1 = ", haCollectorUrls="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.haCollectorUrls
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
