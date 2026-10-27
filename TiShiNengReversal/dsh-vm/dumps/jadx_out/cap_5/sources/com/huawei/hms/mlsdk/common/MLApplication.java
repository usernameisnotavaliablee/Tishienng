package com.huawei.hms.mlsdk.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class MLApplication {
    public static final java.lang.String DEFAULT_APP_NAME = "_DEFAULT_";
    static final java.util.Map<java.lang.String, com.huawei.hms.mlsdk.common.MLApplication> INSTANCES = null;
    private static final java.lang.Object LOCK = null;
    private static final java.lang.String LOG_TAG = "MLApplication";
    public static final int REGION_DR_CHINA = 1002;
    public static final int REGION_DR_GERMAN = 1006;
    public static final int REGION_DR_RUSSIA = 1005;
    public static final int REGION_DR_SINGAPORE = 1007;
    public static final int REGION_DR_UNKNOWN = 1001;
    private static final java.util.Map<java.lang.Integer, java.lang.String> REGION_MAP = null;
    private java.lang.String accessToken;
    private java.lang.String apiKey;
    private final android.content.Context appContext;
    private final java.lang.String appName;
    private final com.huawei.hms.mlsdk.common.MLApplicationSetting appSetting;
    private boolean isAcessTokenSetByCP;
    private boolean setByCP;
    private int userRegion;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.hms.mlsdk.common.MLApplication.REGION_MAP = r0
            r1 = 1002(0x3ea, float:1.404E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "CN"
            r0.put(r1, r2)
            r1 = 1007(0x3ef, float:1.411E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SG"
            r0.put(r1, r2)
            r1 = 1006(0x3ee, float:1.41E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "DE"
            r0.put(r1, r2)
            r1 = 1005(0x3ed, float:1.408E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "RU"
            r0.put(r1, r2)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.huawei.hms.mlsdk.common.MLApplication.LOCK = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.huawei.hms.mlsdk.common.MLApplication.INSTANCES = r0
            return
    }

    protected MLApplication(android.content.Context r2, java.lang.String r3, com.huawei.hms.mlsdk.common.MLApplicationSetting r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.setByCP = r0
            r1.isAcessTokenSetByCP = r0
            r0 = 1001(0x3e9, float:1.403E-42)
            r1.userRegion = r0
            r1.appContext = r2
            r1.appName = r3
            r1.appSetting = r4
            return
    }

    private static android.app.Activity findActivity(android.content.Context r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L7
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L7:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            android.app.Activity r1 = findActivity(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }

    private static java.util.List<java.lang.String> getAllAppNames() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.huawei.hms.mlsdk.common.MLApplication> r2 = com.huawei.hms.mlsdk.common.MLApplication.INSTANCES     // Catch: java.lang.Throwable -> L1d
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1d
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            java.util.Collections.sort(r0)
            return r0
        L1d:
            r0 = move-exception
            goto L2d
        L1f:
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1d
            com.huawei.hms.mlsdk.common.MLApplication r3 = (com.huawei.hms.mlsdk.common.MLApplication) r3     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.getAppName()     // Catch: java.lang.Throwable -> L1d
            r0.add(r3)     // Catch: java.lang.Throwable -> L1d
            goto L12
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    public static java.util.List<com.huawei.hms.mlsdk.common.MLApplication> getAppList(android.content.Context r2) {
            java.lang.Object r2 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L10
            java.util.Map<java.lang.String, com.huawei.hms.mlsdk.common.MLApplication> r1 = com.huawei.hms.mlsdk.common.MLApplication.INSTANCES     // Catch: java.lang.Throwable -> L10
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L10
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public static com.huawei.hms.mlsdk.common.MLApplication getInstance() {
            java.lang.Object r0 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.huawei.hms.mlsdk.common.MLApplication> r1 = com.huawei.hms.mlsdk.common.MLApplication.INSTANCES     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "_DEFAULT_"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L26
            com.huawei.hms.mlsdk.common.MLApplication r1 = (com.huawei.hms.mlsdk.common.MLApplication) r1     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L28
            com.huawei.agconnect.d r1 = com.huawei.agconnect.d.b()     // Catch: java.lang.Throwable -> L26
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L26
            com.huawei.hms.mlsdk.common.MLApplication r1 = initialize(r1)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1e
            goto L28
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "Please call MLApplication.initialize(Context) to initialize application first."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            throw r1     // Catch: java.lang.Throwable -> L26
        L26:
            r1 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return r1
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    public static com.huawei.hms.mlsdk.common.MLApplication getInstance(java.lang.String r5) {
            java.lang.Object r0 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.huawei.hms.mlsdk.common.MLApplication> r1 = com.huawei.hms.mlsdk.common.MLApplication.INSTANCES     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Throwable -> Lf
            com.huawei.hms.mlsdk.common.MLApplication r5 = (com.huawei.hms.mlsdk.common.MLApplication) r5     // Catch: java.lang.Throwable -> Lf
            if (r5 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        Lf:
            r5 = move-exception
            goto L49
        L11:
            java.util.List r5 = getAllAppNames()     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L1e
            java.lang.String r5 = ""
            goto L35
        L1e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "Available app names: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r2, r5)     // Catch: java.lang.Throwable -> Lf
            r1.append(r5)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> Lf
        L35:
            java.util.Locale r1 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "application doesn't exist. current available application names:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lf
            r4 = 0
            r3[r4] = r5     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = java.lang.String.format(r1, r2, r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r5
    }

    public static java.lang.String getUniqueKey(java.lang.String r3, com.huawei.hms.mlsdk.common.MLApplicationSetting r4) {
            r0 = 11
            r1 = 0
            if (r3 == 0) goto L12
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            byte[] r3 = r3.getBytes(r2)
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)
            goto L13
        L12:
            r3 = r1
        L13:
            if (r4 == 0) goto L2b
            java.lang.String r2 = r4.getAppId()
            if (r2 == 0) goto L2b
            java.lang.String r4 = r4.getAppId()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            byte[] r4 = r4.getBytes(r1)
            java.lang.String r1 = android.util.Base64.encodeToString(r4, r0)
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "+"
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
    }

    public static com.huawei.hms.mlsdk.common.MLApplication initialize(android.content.Context r3) {
            java.lang.String r0 = "MLApplication"
            java.lang.String r1 = "initialize one para"
            com.huawei.hms.ml.common.utils.SmartLog.i(r0, r1)
            java.lang.Object r0 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r0)
            makeSureAGConnectInstanceInitialed(r3)     // Catch: java.lang.Throwable -> L1b
            java.util.Map<java.lang.String, com.huawei.hms.mlsdk.common.MLApplication> r1 = com.huawei.hms.mlsdk.common.MLApplication.INSTANCES     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "_DEFAULT_"
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            getInstance()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L2f
        L1d:
            com.huawei.hms.mlsdk.common.MLApplicationSetting$Factory r1 = new com.huawei.hms.mlsdk.common.MLApplicationSetting$Factory     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            r1.create()     // Catch: java.lang.Throwable -> L1b
            com.huawei.hms.mlsdk.common.MLApplicationSetting r1 = com.huawei.hms.mlsdk.common.MLApplicationSetting.fromResource(r3)     // Catch: java.lang.Throwable -> L1b
            com.huawei.hms.mlsdk.common.MLApplication r3 = initialize(r3, r1)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r3
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public static com.huawei.hms.mlsdk.common.MLApplication initialize(android.content.Context r2, com.huawei.hms.mlsdk.common.MLApplicationSetting r3) {
            java.lang.String r0 = "MLApplication"
            java.lang.String r1 = "initialize two para"
            com.huawei.hms.ml.common.utils.SmartLog.i(r0, r1)
            java.lang.String r0 = "_DEFAULT_"
            com.huawei.hms.mlsdk.common.MLApplication r2 = initialize(r2, r3, r0)
            return r2
    }

    public static com.huawei.hms.mlsdk.common.MLApplication initialize(android.content.Context r2, com.huawei.hms.mlsdk.common.MLApplicationSetting r3, java.lang.String r4) {
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 != 0) goto Lc
            r0 = r2
            goto L14
        Lc:
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
        L14:
            java.lang.Object r1 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r1)
            makeSureAGConnectInstanceInitialed(r0)     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto L2b
            com.huawei.hms.mlsdk.common.MLApplicationSetting$Factory r3 = new com.huawei.hms.mlsdk.common.MLApplicationSetting$Factory     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            r3.create()     // Catch: java.lang.Throwable -> L29
            com.huawei.hms.mlsdk.common.MLApplicationSetting r3 = com.huawei.hms.mlsdk.common.MLApplicationSetting.fromResource(r2)     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r2 = move-exception
            goto L48
        L2b:
            com.huawei.hms.mlsdk.common.MLApplication r2 = new com.huawei.hms.mlsdk.common.MLApplication     // Catch: java.lang.Throwable -> L29
            r2.<init>(r0, r4, r3)     // Catch: java.lang.Throwable -> L29
            java.util.Map<java.lang.String, com.huawei.hms.mlsdk.common.MLApplication> r3 = com.huawei.hms.mlsdk.common.MLApplication.INSTANCES     // Catch: java.lang.Throwable -> L29
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L29
            com.huawei.hms.ml.common.utils.ActivityMgr r3 = com.huawei.hms.ml.common.utils.ActivityMgr.INST     // Catch: java.lang.Throwable -> L29
            android.app.Activity r4 = r3.getCurrentActivity()     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L46
            boolean r4 = r0 instanceof android.app.Application     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L46
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L29
            r3.init(r0)     // Catch: java.lang.Throwable -> L29
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return r2
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r2
    }

    private static void makeSureAGConnectInstanceInitialed(android.content.Context r1) {
            com.huawei.agconnect.d r0 = com.huawei.agconnect.d.b()
            if (r0 != 0) goto L9
            com.huawei.agconnect.d.f(r1)
        L9:
            return
    }

    private static java.lang.String readManifest(android.content.Context r3) {
            java.lang.String r0 = "MLApplication"
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Exception -> L1a android.content.res.Resources.NotFoundException -> L20 android.content.pm.PackageManager.NameNotFoundException -> L26
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L1a android.content.res.Resources.NotFoundException -> L20 android.content.pm.PackageManager.NameNotFoundException -> L26
            r2 = 0
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch: java.lang.Exception -> L1a android.content.res.Resources.NotFoundException -> L20 android.content.pm.PackageManager.NameNotFoundException -> L26
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Exception -> L1a android.content.res.Resources.NotFoundException -> L20 android.content.pm.PackageManager.NameNotFoundException -> L26
            java.lang.CharSequence r3 = r3.loadLabel(r1)     // Catch: java.lang.Exception -> L1a android.content.res.Resources.NotFoundException -> L20 android.content.pm.PackageManager.NameNotFoundException -> L26
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L1a android.content.res.Resources.NotFoundException -> L20 android.content.pm.PackageManager.NameNotFoundException -> L26
            return r3
        L1a:
            java.lang.String r3 = "readManifest Exception"
            com.huawei.hms.ml.common.utils.SmartLog.e(r0, r3)
            goto L2b
        L20:
            java.lang.String r3 = "Resources NotFoundException"
            com.huawei.hms.ml.common.utils.SmartLog.e(r0, r3)
            goto L2b
        L26:
            java.lang.String r3 = "PackageManager NameNotFoundException"
            com.huawei.hms.ml.common.utils.SmartLog.e(r0, r3)
        L2b:
            java.lang.String r3 = ""
            return r3
    }

    public <T> T get(java.lang.Class<T> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.String getApiKey() {
            r3 = this;
            java.lang.String r0 = "MLApplication"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get ky flag: "
            r1.append(r2)
            boolean r2 = r3.setByCP
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.ml.common.utils.SmartLog.i(r0, r1)
            java.lang.Object r0 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r0)
            com.huawei.hms.mlsdk.common.MLApplication r1 = getInstance()     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.isSetByCP()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            java.lang.String r1 = r3.apiKey     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            java.lang.String r1 = r3.apiKey     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r1
        L33:
            r1 = move-exception
            goto L3d
        L35:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "please set your app apiKey"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L33
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r1
    }

    public android.content.Context getAppContext() {
            r1 = this;
            android.content.Context r0 = r1.appContext
            return r0
    }

    public java.lang.String getAppName() {
            r1 = this;
            java.lang.String r0 = r1.appName
            return r0
    }

    public com.huawei.hms.mlsdk.common.MLApplicationSetting getAppSetting() {
            r1 = this;
            com.huawei.hms.mlsdk.common.MLApplicationSetting r0 = r1.appSetting
            return r0
    }

    public java.lang.String getAuthorizationToken() {
            r3 = this;
            java.lang.Object r0 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r0)
            boolean r1 = r3.isAcessTokenSetByCP     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            java.lang.String r1 = r3.getApiKey()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            goto L23
        Lf:
            java.lang.String r1 = r3.accessToken     // Catch: java.lang.Throwable -> Ld
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L1b
            java.lang.String r1 = r3.accessToken     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        L1b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "access token is empty"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            throw r1     // Catch: java.lang.Throwable -> Ld
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public java.lang.String getCountryCode() {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.huawei.hms.mlsdk.common.MLApplication.REGION_MAP
            int r1 = r2.userRegion
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L1b
            int r1 = r2.userRegion
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public java.lang.String getUniqueKey() {
            r2 = this;
            java.lang.String r0 = r2.getAppName()
            com.huawei.hms.mlsdk.common.MLApplicationSetting r1 = r2.getAppSetting()
            java.lang.String r0 = getUniqueKey(r0, r1)
            return r0
    }

    public boolean isDefault() {
            r2 = this;
            java.lang.String r0 = "_DEFAULT_"
            java.lang.String r1 = r2.getAppName()
            boolean r0 = r0.equals(r1)
            return r0
    }

    public boolean isSetByCP() {
            r1 = this;
            boolean r0 = r1.setByCP
            return r0
    }

    public void setAccessToken(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "MLApplication"
            java.lang.String r1 = "set a tkn"
            com.huawei.hms.ml.common.utils.SmartLog.i(r0, r1)
            java.lang.Object r0 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r0)
            r2.accessToken = r3     // Catch: java.lang.Throwable -> L11
            r3 = 1
            r2.isAcessTokenSetByCP = r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    public void setApiKey(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "MLApplication"
            java.lang.String r1 = "set a ky"
            com.huawei.hms.ml.common.utils.SmartLog.i(r0, r1)
            java.lang.Object r0 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r0)
            r3.apiKey = r4     // Catch: java.lang.Throwable -> L24
            r1 = 1
            r3.setByCP = r1     // Catch: java.lang.Throwable -> L24
            boolean r2 = r3.isDefault()     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            com.huawei.hms.mlsdk.common.MLApplication r2 = getInstance()     // Catch: java.lang.Throwable -> L24
            r2.setApiKey(r4)     // Catch: java.lang.Throwable -> L24
            com.huawei.hms.mlsdk.common.MLApplication r4 = getInstance()     // Catch: java.lang.Throwable -> L24
            r4.setApiKeyByCP(r1)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r4 = move-exception
            goto L28
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public void setApiKeyByCP(boolean r1) {
            r0 = this;
            r0.setByCP = r1
            return
    }

    public void setUserRegion(int r4) throws java.lang.IllegalArgumentException {
            r3 = this;
            java.lang.String r0 = "MLApplication"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "set userRegion: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.ml.common.utils.SmartLog.i(r0, r1)
            java.lang.Object r0 = com.huawei.hms.mlsdk.common.MLApplication.LOCK
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.String> r1 = com.huawei.hms.mlsdk.common.MLApplication.REGION_MAP     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2b
            r3.userRegion = r4     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r4 = move-exception
            goto L33
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "region is not available"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r4
    }

    public android.os.Bundle toBundle() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.huawei.hms.mlsdk.common.MLApplicationSetting r1 = r4.getAppSetting()
            if (r1 == 0) goto L62
            com.huawei.hms.mlsdk.common.MLApplicationSetting r1 = r4.getAppSetting()
            java.lang.String r1 = r1.getAppId()
            java.lang.String r2 = "appid"
            r0.putString(r2, r1)
            android.content.Context r1 = r4.getAppContext()
            java.lang.String r1 = readManifest(r1)
            java.lang.String r2 = "appName"
            r0.putString(r2, r1)
            com.huawei.hms.mlsdk.common.MLApplicationSetting r1 = r4.getAppSetting()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "packageName"
            r0.putString(r2, r1)
            com.huawei.hms.mlsdk.common.MLApplicationSetting r1 = r4.getAppSetting()
            java.lang.String r1 = r1.getMLSdkVersion()
            java.lang.String r2 = "com.huawei.hms.client.service.name:ml-computer-vision"
            r0.putString(r2, r1)
            com.huawei.hms.mlsdk.common.MLApplicationSetting r1 = r4.getAppSetting()
            java.lang.Boolean r1 = r1.getAcceptHa()
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "openHa"
            r0.putBoolean(r2, r1)
            com.huawei.hms.ml.common.utils.CountryCodeBean r1 = new com.huawei.hms.ml.common.utils.CountryCodeBean
            android.content.Context r2 = r4.appContext
            r3 = 0
            r1.<init>(r2, r3)
            java.lang.String r1 = r1.getCountryCode()
            java.lang.String r2 = "countryCode"
            r0.putString(r2, r1)
            return r0
        L62:
            java.lang.String r1 = "MLApplication"
            java.lang.String r2 = "APP setting is null."
            com.huawei.hms.ml.common.utils.SmartLog.w(r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "appName="
            r0.append(r1)
            java.lang.String r1 = r2.appName
            r0.append(r1)
            java.lang.String r1 = ", appSetting="
            r0.append(r1)
            com.huawei.hms.mlsdk.common.MLApplicationSetting r1 = r2.appSetting
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
