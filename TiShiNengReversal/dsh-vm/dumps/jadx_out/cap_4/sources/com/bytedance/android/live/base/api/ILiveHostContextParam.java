package com.bytedance.android.live.base.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface ILiveHostContextParam {

    public static class Builder {
        private int aid;
        private int appIcon;
        private java.lang.String appName;
        private java.lang.String channel;
        private java.lang.String cjAppId;
        private java.lang.String cjMerchantId;
        private java.lang.String clientKey;
        private android.app.Application context;
        private java.lang.String ecHostAppId;
        private java.util.Map<java.lang.String, java.lang.String> feParamsExtra;
        private java.lang.String generalAppId;
        private com.bytedance.android.live.base.api.ILiveHostActionParam hostActionParam;
        private java.util.HashMap<java.lang.String, java.lang.String> hostInitExtra;
        private com.bytedance.android.live.base.api.IHostPermission hostPermission;
        private com.bytedance.android.livehostapi.platform.IHostTokenInjectionAuth injectionAuth;
        private boolean isBoe;
        private boolean isDebug;
        private com.bytedance.android.live.base.api.MethodChannelService methodChannelService;
        private java.lang.String nativeLibraryDir;
        private org.json.JSONObject paramsExtraSettings;
        private java.lang.String partner;
        private java.lang.String partnerSecret;
        private boolean runInLiveProcess;
        private java.lang.String ttSDKAppId;
        private java.lang.String ttSDKCertAssetsPath;
        private com.bytedance.android.live.base.api.param.IUserIdGetter userIdGetter;
        private java.lang.String version;
        private int versionCode;



        public Builder() {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.cjAppId = r0
                r2.cjMerchantId = r0
                r2.nativeLibraryDir = r0
                r1 = 0
                r2.feParamsExtra = r1
                r2.ecHostAppId = r1
                r2.clientKey = r0
                r2.paramsExtraSettings = r1
                r2.hostInitExtra = r1
                r2.injectionAuth = r1
                com.bytedance.android.live.base.api.ILiveHostContextParam$Builder$1 r0 = new com.bytedance.android.live.base.api.ILiveHostContextParam$Builder$1
                r0.<init>(r2)
                r2.userIdGetter = r0
                com.bytedance.android.live.base.api.DefaultHostPermission r0 = new com.bytedance.android.live.base.api.DefaultHostPermission
                r0.<init>()
                r2.hostPermission = r0
                return
        }

        static /* synthetic */ com.bytedance.android.live.base.api.ILiveHostContextParam.Builder access$000(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0, com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r1) {
                com.bytedance.android.live.base.api.ILiveHostContextParam$Builder r0 = r0.copy(r1)
                return r0
        }

        static /* synthetic */ com.bytedance.android.live.base.api.MethodChannelService access$100(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                com.bytedance.android.live.base.api.MethodChannelService r0 = r0.methodChannelService
                return r0
        }

        static /* synthetic */ com.bytedance.android.livehostapi.platform.IHostTokenInjectionAuth access$1000(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                com.bytedance.android.livehostapi.platform.IHostTokenInjectionAuth r0 = r0.injectionAuth
                return r0
        }

        static /* synthetic */ int access$1100(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                int r0 = r0.appIcon
                return r0
        }

        static /* synthetic */ boolean access$1200(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                boolean r0 = r0.isDebug
                return r0
        }

        static /* synthetic */ boolean access$1300(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                boolean r0 = r0.isBoe
                return r0
        }

        static /* synthetic */ java.lang.String access$1400(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.generalAppId
                return r0
        }

        static /* synthetic */ java.lang.String access$1500(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.ttSDKAppId
                return r0
        }

        static /* synthetic */ java.lang.String access$1600(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.ttSDKCertAssetsPath
                return r0
        }

        static /* synthetic */ com.bytedance.android.live.base.api.ILiveHostActionParam access$1700(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                com.bytedance.android.live.base.api.ILiveHostActionParam r0 = r0.hostActionParam
                return r0
        }

        static /* synthetic */ java.lang.String access$1800(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.cjAppId
                return r0
        }

        static /* synthetic */ java.lang.String access$1900(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.cjMerchantId
                return r0
        }

        static /* synthetic */ java.util.HashMap access$200(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.hostInitExtra
                return r0
        }

        static /* synthetic */ java.lang.String access$2000(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.nativeLibraryDir
                return r0
        }

        static /* synthetic */ com.bytedance.android.live.base.api.param.IUserIdGetter access$2100(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                com.bytedance.android.live.base.api.param.IUserIdGetter r0 = r0.userIdGetter
                return r0
        }

        static /* synthetic */ java.lang.String access$2200(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.partner
                return r0
        }

        static /* synthetic */ java.lang.String access$2300(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.partnerSecret
                return r0
        }

        static /* synthetic */ java.util.Map access$2400(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.feParamsExtra
                return r0
        }

        static /* synthetic */ java.lang.String access$2500(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.ecHostAppId
                return r0
        }

        static /* synthetic */ java.lang.String access$2600(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.clientKey
                return r0
        }

        static /* synthetic */ boolean access$2700(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                boolean r0 = r0.runInLiveProcess
                return r0
        }

        static /* synthetic */ org.json.JSONObject access$2800(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                org.json.JSONObject r0 = r0.paramsExtraSettings
                return r0
        }

        static /* synthetic */ com.bytedance.android.live.base.api.IHostPermission access$2900(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                com.bytedance.android.live.base.api.IHostPermission r0 = r0.hostPermission
                return r0
        }

        static /* synthetic */ int access$300(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                int r0 = r0.aid
                return r0
        }

        static /* synthetic */ java.lang.String access$400(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.appName
                return r0
        }

        static /* synthetic */ android.app.Application access$500(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                android.app.Application r0 = r0.context
                return r0
        }

        static /* synthetic */ android.content.pm.PackageInfo access$600(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0, android.app.Application r1) {
                android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1)
                return r0
        }

        static /* synthetic */ java.lang.String access$700(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.channel
                return r0
        }

        static /* synthetic */ java.lang.String access$800(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                java.lang.String r0 = r0.version
                return r0
        }

        static /* synthetic */ int access$900(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r0) {
                int r0 = r0.versionCode
                return r0
        }

        private com.bytedance.android.live.base.api.ILiveHostContextParam.Builder copy(com.bytedance.android.live.base.api.ILiveHostContextParam.Builder r8) {
                r7 = this;
                com.bytedance.android.live.base.api.ILiveHostContextParam$Builder r0 = new com.bytedance.android.live.base.api.ILiveHostContextParam$Builder
                r0.<init>()
                java.lang.Class<com.bytedance.android.live.base.api.ILiveHostContextParam$Builder> r1 = com.bytedance.android.live.base.api.ILiveHostContextParam.Builder.class
                java.lang.reflect.Field[] r1 = r1.getDeclaredFields()
                int r2 = r1.length
                r3 = 0
            Ld:
                if (r3 >= r2) goto L28
                r4 = r1[r3]
                boolean r5 = r4.isAccessible()
                if (r5 != 0) goto L1b
                r6 = 1
                r4.setAccessible(r6)
            L1b:
                java.lang.Object r6 = r4.get(r8)
                r4.set(r0, r6)
                r4.setAccessible(r5)
                int r3 = r3 + 1
                goto Ld
            L28:
                return r0
        }

        private android.content.pm.PackageInfo getPackageInfo(android.app.Application r3) {
                r2 = this;
                android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
                java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
                r1 = 0
                android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
                return r3
            Le:
                r3 = move-exception
                com.bytedance.sdk.openadsdk.api.m.j(r3)
                r3 = 0
                return r3
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder addHostInitExtra(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                if (r2 == 0) goto L12
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.hostInitExtra
                if (r0 != 0) goto Ld
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.hostInitExtra = r0
            Ld:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.hostInitExtra
                r0.putAll(r2)
            L12:
                return r1
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam build() {
                r1 = this;
                com.bytedance.android.live.base.api.ILiveHostContextParam$Builder$2 r0 = new com.bytedance.android.live.base.api.ILiveHostContextParam$Builder$2
                r0.<init>(r1, r1)
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder provideMethodChannel(com.bytedance.android.live.base.api.MethodChannelService r1) {
                r0 = this;
                r0.methodChannelService = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setAid(int r1) {
                r0 = this;
                r0.aid = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setAppIcon(int r1) {
                r0 = this;
                r0.appIcon = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setAppName(java.lang.String r1) {
                r0 = this;
                r0.appName = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setChannel(java.lang.String r1) {
                r0 = this;
                r0.channel = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setCjAppId(java.lang.String r1) {
                r0 = this;
                r0.cjAppId = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setCjMerchantId(java.lang.String r1) {
                r0 = this;
                r0.cjMerchantId = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setClientKey(java.lang.String r1) {
                r0 = this;
                r0.clientKey = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setContext(android.app.Application r1) {
                r0 = this;
                r0.context = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setECHostAppId(java.lang.String r1) {
                r0 = this;
                r0.ecHostAppId = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setFeParamsExtra(java.util.Map<java.lang.String, java.lang.String> r1) {
                r0 = this;
                r0.feParamsExtra = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setGeneralAppId(java.lang.String r1) {
                r0 = this;
                r0.generalAppId = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setHostActionParam(com.bytedance.android.live.base.api.ILiveHostActionParam r1) {
                r0 = this;
                r0.hostActionParam = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setHostPermission(com.bytedance.android.live.base.api.IHostPermission r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r0.hostPermission = r1
            L4:
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setInjectionAuth(com.bytedance.android.livehostapi.platform.IHostTokenInjectionAuth r1) {
                r0 = this;
                r0.injectionAuth = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setIsBoe(boolean r1) {
                r0 = this;
                r0.isBoe = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setIsDebug(boolean r1) {
                r0 = this;
                r0.isDebug = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setNativeLibraryDir(java.lang.String r1) {
                r0 = this;
                r0.nativeLibraryDir = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setParamsExtraSettings(org.json.JSONObject r1) {
                r0 = this;
                r0.paramsExtraSettings = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setPartner(java.lang.String r1) {
                r0 = this;
                r0.partner = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setPartnerSecret(java.lang.String r1) {
                r0 = this;
                r0.partnerSecret = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setRunInLiveProcess(boolean r1) {
                r0 = this;
                r0.runInLiveProcess = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setTtSDKAppId(java.lang.String r1) {
                r0 = this;
                r0.ttSDKAppId = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setTtSDKCertAssetsPath(java.lang.String r1) {
                r0 = this;
                r0.ttSDKCertAssetsPath = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setUserIdGetter(com.bytedance.android.live.base.api.param.IUserIdGetter r1) {
                r0 = this;
                r0.userIdGetter = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setVersion(java.lang.String r1) {
                r0 = this;
                r0.version = r1
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveHostContextParam.Builder setVersionCode(int r1) {
                r0 = this;
                r0.versionCode = r1
                return r0
        }
    }

    int getAid();

    int getAppIcon();

    java.lang.String getAppName();

    java.lang.String getCJAppId();

    java.lang.String getCJMerchantId();

    java.lang.String getChannel();

    java.lang.String getClientKey();

    android.app.Application getContext();

    boolean getDebug();

    java.lang.String getECHostAppId();

    java.util.Map<java.lang.String, java.lang.String> getFEParamsExtra();

    java.lang.String getGeneralAppId();

    com.bytedance.android.live.base.api.ILiveHostActionParam getHostAction();

    java.util.Map<java.lang.String, java.lang.String> getHostInitExtra();

    com.bytedance.android.live.base.api.IHostPermission getHostPermission();

    java.lang.String getNativeLibraryDir();

    org.json.JSONObject getParamsExtraSettings();

    java.lang.String getPartner();

    java.lang.String getPartnerSecret();

    boolean getRunInLiveProcess();

    java.lang.String getTtSDKAppId();

    java.lang.String getTtSDKCertAssetsPath();

    java.lang.String getVersion();

    int getVersionCode();

    com.bytedance.android.livehostapi.platform.IHostTokenInjectionAuth injectAccount();

    boolean isBoe();

    com.bytedance.android.live.base.api.MethodChannelService provideMethodChannel();

    com.bytedance.android.live.base.api.param.IUserIdGetter provideUserIdGetter();

    com.bytedance.android.live.base.api.ILiveHostContextParam.Builder toBuilder();
}
