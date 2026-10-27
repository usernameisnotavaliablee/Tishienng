package com.huawei.hms.mlsdk.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AgConnectInfo {
    private java.lang.String apiKey;
    private java.lang.String appMLKitGrsPolicy;
    private java.lang.String applicationId;
    private java.lang.String certFingerprint;
    private java.util.List<java.lang.String> haCollectorUrls;
    private java.util.List<java.lang.String> mlServiceUrls;
    private java.lang.String packageName;
    private java.lang.String projectId;
    private java.lang.String region;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class AgConnectKey {
        public static final java.lang.String ANALYTICS_COLLECTOR_URL = "service/analytics/collector_url";
        public static final java.lang.String API_KEY = "client/api_key";
        public static final java.lang.String APPLICATION_ID = "client/app_id";
        public static final java.lang.String APP_MLKIT_GRS_POLICY = "processing_location_policy/mlkit";
        public static final java.lang.String ML_SERVICE_URL = "service/ml/mlservice_url";
        public static final java.lang.String PACKAGE_NAME = "client/package_name";
        public static final java.lang.String PROJECT_ID = "client/project_id";
        public static final java.lang.String REGION = "region";

        private AgConnectKey() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public AgConnectInfo() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public AgConnectInfo(android.content.Context r13) {
            r12 = this;
            r12.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.mlServiceUrls = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.haCollectorUrls = r0
            if (r13 != 0) goto L1b
            com.huawei.agconnect.d r13 = com.huawei.agconnect.d.b()
            android.content.Context r13 = r13.getContext()
        L1b:
            if (r13 == 0) goto L1dd
            i1.a r0 = i1.a.d(r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AGConnectServicesConfig: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = "context: "
            r1.append(r3)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "AgConnectInfo"
            com.huawei.hms.ml.common.utils.SmartLog.i(r3, r1)
            java.lang.String r1 = "region"
            java.lang.String r1 = r0.getString(r1)
            r12.region = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r4 = "region: "
            r1.append(r4)
            java.lang.String r4 = r12.region
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.ml.common.utils.SmartLog.i(r3, r1)
            java.lang.String r1 = "client/package_name"
            java.lang.String r1 = r0.getString(r1)
            r12.packageName = r1
            java.lang.String r4 = "packageName: "
            if (r1 != 0) goto L76
            java.lang.String r1 = r13.getPackageName()
            r12.packageName = r1
            goto L90
        L76:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r5 = r12.packageName
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.ml.common.utils.SmartLog.i(r3, r1)
        L90:
            java.lang.String r1 = "client/app_id"
            java.lang.String r1 = r0.getString(r1)
            r12.applicationId = r1
            if (r1 != 0) goto L9f
            java.lang.String r1 = r12.packageName
            r12.applicationId = r1
            goto Lb9
        L9f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r12.packageName
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.ml.common.utils.SmartLog.i(r3, r1)
        Lb9:
            java.lang.String r1 = "client/api_key"
            java.lang.String r1 = r0.getString(r1)
            r12.apiKey = r1
            if (r1 == 0) goto Lda
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r4 = "apiKey: apiKey is secret"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.ml.common.utils.SmartLog.i(r3, r1)
        Lda:
            java.lang.String r13 = r12.getRawSignature(r13)
            r12.certFingerprint = r13
            if (r13 == 0) goto Lf9
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            r13.append(r0)
            java.lang.String r1 = "certFingerprint: certFingerprint is secret"
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.huawei.hms.ml.common.utils.SmartLog.i(r3, r13)
        Lf9:
            java.lang.String r13 = "service/ml/mlservice_url"
            java.lang.String r13 = r0.getString(r13)
            java.lang.String r1 = "http://"
            r4 = 0
            java.lang.String r5 = ","
            java.lang.String r6 = "https://"
            if (r13 == 0) goto L156
            java.lang.String[] r13 = r13.split(r5)
            int r7 = r13.length
            r8 = 0
        L10e:
            if (r8 >= r7) goto L156
            r9 = r13[r8]
            java.lang.String r9 = r9.trim()
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r9 = r9.toLowerCase(r10)
            boolean r10 = r9.startsWith(r1)
            if (r10 != 0) goto L137
            boolean r10 = r9.startsWith(r6)
            if (r10 != 0) goto L137
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
        L137:
            java.lang.String r10 = "/"
            boolean r11 = r9.endsWith(r10)
            if (r11 != 0) goto L14e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = r11.toString()
        L14e:
            java.util.List<java.lang.String> r10 = r12.mlServiceUrls
            r10.add(r9)
            int r8 = r8 + 1
            goto L10e
        L156:
            java.lang.String r13 = "service/analytics/collector_url"
            java.lang.String r13 = r0.getString(r13)
            if (r13 == 0) goto L194
            java.lang.String[] r13 = r13.split(r5)
            int r5 = r13.length
        L163:
            if (r4 >= r5) goto L194
            r7 = r13[r4]
            java.lang.String r7 = r7.trim()
            java.util.Locale r8 = java.util.Locale.ENGLISH
            java.lang.String r7 = r7.toLowerCase(r8)
            boolean r8 = r7.startsWith(r1)
            if (r8 != 0) goto L18c
            boolean r8 = r7.startsWith(r6)
            if (r8 != 0) goto L18c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
        L18c:
            java.util.List<java.lang.String> r8 = r12.haCollectorUrls
            r8.add(r7)
            int r4 = r4 + 1
            goto L163
        L194:
            java.lang.String r13 = "client/project_id"
            java.lang.String r13 = r0.getString(r13)
            r12.projectId = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            r13.append(r0)
            java.lang.String r1 = "project_id: "
            r13.append(r1)
            java.lang.String r1 = r12.projectId
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.huawei.hms.ml.common.utils.SmartLog.i(r3, r13)
            java.lang.String r13 = "processing_location_policy/mlkit"
            java.lang.String r13 = r0.getString(r13)
            r12.appMLKitGrsPolicy = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            r13.append(r0)
            java.lang.String r0 = "processing_location_policy/mlkit: "
            r13.append(r0)
            java.lang.String r0 = r12.appMLKitGrsPolicy
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.huawei.hms.ml.common.utils.SmartLog.i(r3, r13)
            return
        L1dd:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Context not found."
            r13.<init>(r0)
            throw r13
    }

    private java.lang.String getRawSignature(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = ""
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
            r2 = 64
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L34
            if (r4 != 0) goto L13
            return r0
        L13:
            android.content.pm.Signature[] r4 = r4.signatures
            java.lang.String r1 = "AgConnectInfo"
            if (r4 == 0) goto L25
            int r2 = r4.length
            if (r2 <= 0) goto L25
            r2 = 0
            r4 = r4[r2]
            java.lang.String r2 = "signature is not null "
            com.huawei.hms.ml.common.utils.SmartLog.i(r1, r2)
            goto L2b
        L25:
            java.lang.String r4 = "signature is null "
            com.huawei.hms.ml.common.utils.SmartLog.i(r1, r4)
            r4 = 0
        L2b:
            if (r4 == 0) goto L34
            java.lang.String r0 = "SHA256"
            java.lang.String r4 = r3.getSignatureString(r4, r0)
            return r4
        L34:
            return r0
    }

    private final java.lang.String getSignatureString(android.content.pm.Signature r4, java.lang.String r5) {
            r3 = this;
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L5d
            r0.<init>()     // Catch: java.lang.Throwable -> L5d
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: java.lang.Throwable -> L5d
            r5.reset()     // Catch: java.lang.Throwable -> L5d
            r5.update(r4)     // Catch: java.lang.Throwable -> L5d
            byte[] r4 = r5.digest()     // Catch: java.lang.Throwable -> L5d
            r5 = 0
        L18:
            int r1 = r4.length     // Catch: java.lang.Throwable -> L5d
            if (r5 >= r1) goto L52
            r1 = r4[r5]     // Catch: java.lang.Throwable -> L5d
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Throwable -> L5d
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L5d
            r2 = 1
            if (r1 != r2) goto L3b
            java.lang.String r1 = "0"
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            r1 = r4[r5]     // Catch: java.lang.Throwable -> L5d
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Throwable -> L5d
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            goto L46
        L3b:
            r1 = r4[r5]     // Catch: java.lang.Throwable -> L5d
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Throwable -> L5d
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
        L46:
            int r1 = r4.length     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 - r2
            if (r5 == r1) goto L4f
            java.lang.String r1 = ":"
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
        L4f:
            int r5 = r5 + 1
            goto L18
        L52:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L5d
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = r4.toUpperCase(r5)     // Catch: java.lang.Throwable -> L5d
            return r4
        L5d:
            r4 = 0
            return r4
    }

    public java.lang.String getApiKey() {
            r1 = this;
            java.lang.String r0 = r1.apiKey
            return r0
    }

    public java.lang.String getAppMLKitGrsPolicy() {
            r1 = this;
            java.lang.String r0 = r1.appMLKitGrsPolicy
            return r0
    }

    public java.lang.String getApplicationId() {
            r1 = this;
            java.lang.String r0 = r1.applicationId
            return r0
    }

    public java.lang.String getCertFingerprint() {
            r1 = this;
            java.lang.String r0 = r1.certFingerprint
            return r0
    }

    public java.util.List<java.lang.String> getHaCollectorUrls() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.haCollectorUrls
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
}
