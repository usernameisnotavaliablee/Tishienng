package com.umeng.commonsdk.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"NewApi"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMUtils {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final java.lang.String KEY_APP_KEY = "appkey";
    private static final java.lang.String KEY_CHANNEL = "channel";
    private static final java.lang.String KEY_LAST_APP_KEY = "last_appkey";
    private static final java.lang.String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final java.lang.String KEY_SESSION_ID = "session_id";
    private static final java.lang.String KEY_SHARED_PREFERENCES_NAME = null;
    public static final java.lang.String MOBILE_NETWORK = "2G/3G";
    private static final java.lang.String SD_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";
    private static final java.lang.String SP_FILE_NAME = null;
    private static final java.lang.String TAG = "UMUtils";
    public static final java.lang.String UNKNOW = "";
    public static java.lang.String VALUE_ABTEST_VERSION = null;
    public static java.lang.String VALUE_ANALYTICS_VERSION = null;
    public static java.lang.String VALUE_ANTI_VERSION = null;
    public static java.lang.String VALUE_APM_VERSION = null;
    public static java.lang.String VALUE_ASMS_VERSION = null;
    public static java.lang.String VALUE_GAME_VERSION = null;
    public static java.lang.String VALUE_LINK_VERSION = null;
    public static java.lang.String VALUE_PUSH_VERSION = null;
    public static java.lang.String VALUE_REC_VERSION_NAME = null;
    public static java.lang.String VALUE_SHARE_VERSION = null;
    public static java.lang.String VALUE_SMS_VERSION = null;
    public static java.lang.String VALUE_VERIFY_VERSION = null;
    public static java.lang.String VALUE_VISUAL_VERSION = null;
    public static final java.lang.String WIFI = "Wi-Fi";
    private static final java.util.regex.Pattern pattern = null;
    private static volatile java.lang.String sAppVersionCode;
    private static volatile java.lang.String sAppVersionName;
    private static java.lang.Object spLock;

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "ucc"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.utils.UMUtils.KEY_SHARED_PREFERENCES_NAME = r0
            java.lang.String r0 = "UTDID\">([^<]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.umeng.commonsdk.utils.UMUtils.pattern = r0
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "usi"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.utils.UMUtils.SP_FILE_NAME = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.utils.UMUtils.spLock = r0
            java.lang.String r0 = ""
            com.umeng.commonsdk.utils.UMUtils.VALUE_ANALYTICS_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_GAME_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_PUSH_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_APM_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_VERIFY_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_SMS_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_VISUAL_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_LINK_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_ABTEST_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.VALUE_ANTI_VERSION = r0
            com.umeng.commonsdk.utils.UMUtils.sAppVersionName = r0
            com.umeng.commonsdk.utils.UMUtils.sAppVersionCode = r0
            return
    }

    public UMUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String MD5(java.lang.String r8) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            byte[] r1 = r8.getBytes()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            r2.reset()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            r2.update(r1)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            byte[] r1 = r2.digest()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            r2.<init>()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            r3 = 0
            r4 = 0
        L1f:
            int r5 = r1.length     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            if (r4 >= r5) goto L3b
            java.lang.String r5 = "%02X"
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            r7[r3] = r6     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            r2.append(r5)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            int r4 = r4 + 1
            goto L1f
        L39:
            r8 = move-exception
            goto L4b
        L3b:
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L40
            return r8
        L40:
            java.lang.String r1 = "[^[a-z][A-Z][0-9][.][_]]"
            java.lang.String r2 = ""
            java.lang.String r8 = r8.replaceAll(r1, r2)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L49
            return r8
        L49:
            r8 = move-exception
            goto L53
        L4b:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L52
            r8.toString()
        L52:
            return r0
        L53:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L5a
            r8.toString()
        L5a:
            return r0
    }

    @android.annotation.SuppressLint({"DefaultLocale"})
    private static java.lang.String byte2HexFormatted(byte[] r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8.length
            r2 = 2
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
        La:
            int r3 = r8.length
            if (r1 >= r3) goto L46
            r3 = r8[r1]
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r4 = r3.length()
            r5 = 1
            if (r4 != r5) goto L2b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "0"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        L2b:
            if (r4 <= r2) goto L33
            int r6 = r4 + (-2)
            java.lang.String r3 = r3.substring(r6, r4)
        L33:
            java.lang.String r3 = r3.toUpperCase()
            r0.append(r3)
            int r3 = r8.length
            int r3 = r3 - r5
            if (r1 >= r3) goto L43
            r3 = 58
            r0.append(r3)
        L43:
            int r1 = r1 + 1
            goto La
        L46:
            java.lang.String r8 = r0.toString()
            return r8
    }

    private static java.lang.String bytes2Hex(byte[] r5) {
            java.lang.String r0 = ""
            r1 = 0
        L3:
            int r2 = r5.length
            if (r1 >= r2) goto L38
            r2 = r5[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r3 = r2.length()
            r4 = 1
            if (r3 != r4) goto L26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "0"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            int r1 = r1 + 1
            goto L3
        L38:
            return r0
    }

    public static boolean checkAndroidManifest(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.Context r2 = r3.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r1.<init>(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.Context r3 = r3.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r3.getActivityInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r3 = 1
            return r3
        L23:
            return r0
    }

    public static boolean checkIntentFilterData(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.setAction(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "android.intent.category.DEFAULT"
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "android.intent.category.BROWSABLE"
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r2.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "tencent"
            r2.append(r3)     // Catch: java.lang.Throwable -> L74
            r2.append(r5)     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = ":"
            r2.append(r5)     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L74
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L74
            r1.setData(r5)     // Catch: java.lang.Throwable -> L74
            android.content.Context r5 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L74
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L74
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L74
            r2 = 64
            java.util.List r5 = r5.queryIntentActivities(r1, r2)     // Catch: java.lang.Throwable -> L74
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L74
            if (r1 <= 0) goto L74
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L74
        L4e:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L74
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L74
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1     // Catch: java.lang.Throwable -> L74
            android.content.pm.ActivityInfo r1 = r1.activityInfo     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L4e
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Throwable -> L74
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L74
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L4e
            r4 = 1
            return r4
        L74:
            return r0
    }

    public static boolean checkMetaData(android.content.Context r3, java.lang.String r4) {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            android.content.Context r3 = r3.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            if (r3 == 0) goto L2b
            android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            java.lang.Object r3 = r3.get(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            if (r3 == 0) goto L2b
            r3 = 1
            return r3
        L2b:
            return r1
    }

    public static boolean checkPath(java.lang.String r0) {
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean checkPermission(android.content.Context r6, java.lang.String r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 1
            if (r1 < r2) goto L34
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2f
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Exception -> L2f
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L2f
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2f
            r2[r0] = r7     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L2f
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> L2f
            int r6 = r7.intValue()     // Catch: java.lang.Exception -> L2f
            if (r6 != 0) goto L2e
            return r3
        L2e:
            return r0
        L2f:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r7)
            return r0
        L34:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            int r6 = r1.checkPermission(r7, r6)
            if (r6 != 0) goto L43
            return r3
        L43:
            return r0
    }

    public static boolean checkResource(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            android.content.Context r1 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L22
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L22
            int r2 = r1.getIdentifier(r3, r4, r2)     // Catch: java.lang.Throwable -> L22
            if (r2 > 0) goto L20
            return r0
        L20:
            r2 = 1
            return r2
        L22:
            return r0
    }

    public static java.lang.String encryptBySHA1(java.lang.String r2) {
            r0 = 0
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L22
            java.lang.String r1 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r1.update(r2)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            byte[] r2 = r1.digest()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.String r2 = bytes2Hex(r2)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            return r2
        L17:
            r2 = move-exception
            goto L1a
        L19:
            return r0
        L1a:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L21
            r2.toString()
        L21:
            return r0
        L22:
            r2 = move-exception
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L2a
            r2.toString()
        L2a:
            return r0
    }

    public static java.lang.String genId() {
            java.lang.String r0 = "1234567890"
            return r0
    }

    public static byte[] genIv() {
            byte[] r0 = getMiniArray()
            r1 = 16
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 10
            r1[r2] = r3
            r4 = 1
            r1[r4] = r4
            r5 = 10
            int r5 = r5 + r4
            byte r5 = (byte) r5
            r6 = 2
            r1[r6] = r5
            r5 = 3
            r7 = 5
            r1[r5] = r7
            r8 = 4
            r1[r8] = r8
            r9 = 10
            int r9 = r9 + r7
            byte r9 = (byte) r9
            r1[r7] = r9
            r7 = 6
            r9 = 7
            r1[r7] = r9
            r7 = 9
            r1[r9] = r7
            r9 = 8
            r10 = 23
            r1[r9] = r10
            r1[r7] = r5
            r2 = r0[r2]
            r1[r3] = r2
            r2 = 11
            r3 = r0[r4]
            r1[r2] = r3
            r2 = 12
            r3 = r0[r6]
            r1[r2] = r3
            r2 = 13
            r3 = r0[r5]
            r1[r2] = r3
            r2 = 14
            r0 = r0[r8]
            r1[r2] = r0
            int r0 = 100 - r7
            byte r0 = (byte) r0
            r2 = 15
            r1[r2] = r0
            return r1
    }

    public static java.lang.String[] getActiveUser(android.content.Context r0) {
            java.lang.String[] r0 = com.umeng.analytics.c.a(r0)
            return r0
    }

    public static java.lang.String getApmFlag() {
            java.lang.String r0 = "com.umeng.umcrash.UMCrash"
            java.lang.Class r0 = getClass(r0)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            java.lang.String r1 = "getUMAPMFlag"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1c
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getAppHashKey(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppHashKey(r0)
            return r0
    }

    public static java.lang.String getAppMD5Signature(android.content.Context r2) {
            java.lang.String r0 = ""
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppMD5Signature(r2)     // Catch: java.lang.Throwable -> L1a
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            java.lang.String r1 = ":"
            java.lang.String r0 = r2.replace(r1, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L1a
            return r2
        L17:
            r0 = r2
            goto L1a
        L19:
            return r2
        L1a:
            return r0
    }

    public static java.lang.String getAppName(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppName(r0)
            return r0
    }

    public static java.lang.String getAppSHA1Key(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppSHA1Key(r0)
            return r0
    }

    public static java.lang.String getAppVersinoCode(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = ""
            if (r3 == 0) goto L2d
            if (r4 != 0) goto L7
            goto L2d
        L7:
            com.umeng.commonsdk.utils.b r1 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            r2 = 64
            android.content.pm.PackageInfo r3 = r1.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            if (r3 == 0) goto L2d
            int r3 = r3.versionCode     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            return r3
        L1a:
            r3 = move-exception
            goto L1e
        L1c:
            r3 = move-exception
            goto L26
        L1e:
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r4 == 0) goto L2d
            r3.toString()
            goto L2d
        L26:
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r4 == 0) goto L2d
            r3.toString()
        L2d:
            return r0
    }

    public static java.lang.String getAppVersionCode(android.content.Context r4) {
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.sAppVersionCode
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.sAppVersionCode
            return r4
        Lb:
            java.lang.String r0 = ""
            if (r4 != 0) goto L10
            goto L2d
        L10:
            com.umeng.commonsdk.utils.b r1 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r3 = 64
            android.content.pm.PackageInfo r4 = r1.a(r4, r2, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            if (r4 == 0) goto L2d
            int r4 = r4.versionCode     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            com.umeng.commonsdk.utils.UMUtils.sAppVersionCode = r4     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            return r4
        L29:
            r4 = move-exception
            goto L2e
        L2b:
            r4 = move-exception
            goto L36
        L2d:
            return r0
        L2e:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L3d
            r4.toString()
            goto L3d
        L36:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L3d
            r4.toString()
        L3d:
            return r0
    }

    public static java.lang.String getAppVersionName(android.content.Context r4) {
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.sAppVersionName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.sAppVersionName
            return r4
        Lb:
            java.lang.String r0 = ""
            if (r4 != 0) goto L10
            goto L27
        L10:
            com.umeng.commonsdk.utils.b r1 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.Throwable -> L25
            r3 = 64
            android.content.pm.PackageInfo r4 = r1.a(r4, r2, r3)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L27
            java.lang.String r4 = r4.versionName     // Catch: java.lang.Throwable -> L25
            com.umeng.commonsdk.utils.UMUtils.sAppVersionName = r4     // Catch: java.lang.Throwable -> L25
            return r4
        L25:
            r4 = move-exception
            goto L28
        L27:
            return r0
        L28:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L2f
            r4.toString()
        L2f:
            return r0
    }

    public static java.lang.String getAppVersionName(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = ""
            if (r3 == 0) goto L21
            if (r4 != 0) goto L7
            goto L21
        L7:
            com.umeng.commonsdk.utils.b r1 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L16
            r2 = 64
            android.content.pm.PackageInfo r4 = r1.a(r3, r4, r2)     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L21
            java.lang.String r3 = r4.versionName     // Catch: java.lang.Throwable -> L16
            return r3
        L16:
            r4 = move-exception
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r1 == 0) goto L1e
            r4.toString()
        L1e:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r4)
        L21:
            return r0
    }

    public static java.lang.String getAppkey(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            if (r1 != 0) goto L13
            java.lang.String r3 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            return r3
        Lf:
            r1 = move-exception
            goto L1a
        L11:
            r1 = move-exception
            goto L25
        L13:
            java.lang.String r1 = "appkey"
            java.lang.String r3 = getMultiProcessSP(r3, r1)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            return r3
        L1a:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L21
            r1.toString()
        L21:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
        L25:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L2c
            r1.toString()
        L2c:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
    }

    public static java.lang.String getAppkeyByXML(android.content.Context r3) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L30
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r1)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L30
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "UMENG_APPKEY"
            java.lang.String r3 = r3.getString(r0)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L1f
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L30
            return r3
        L1f:
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L30
            java.lang.String r3 = "MobclickAgent"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml."
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Throwable -> L30
            com.umeng.commonsdk.statistics.common.MLog.i(r3, r0)     // Catch: java.lang.Throwable -> L30
        L30:
            r3 = 0
            return r3
    }

    public static java.util.Properties getBuildProp() {
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L25
            r0.load(r2)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L20
            r2.close()     // Catch: java.io.IOException -> L32
            return r0
        L1d:
            r0 = move-exception
            r1 = r2
            goto L27
        L20:
            r1 = r2
            goto L2d
        L23:
            r0 = move-exception
            goto L27
        L25:
            goto L2d
        L27:
            if (r1 == 0) goto L2c
            r1.close()     // Catch: java.io.IOException -> L2c
        L2c:
            throw r0
        L2d:
            if (r1 == 0) goto L32
            r1.close()     // Catch: java.io.IOException -> L32
        L32:
            return r0
    }

    public static java.lang.String getCPU() {
            java.lang.String r0 = ""
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e java.io.FileNotFoundException -> L29
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e java.io.FileNotFoundException -> L29
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e java.io.IOException -> L20
            r4 = 1024(0x400, float:1.435E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e java.io.IOException -> L20
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e java.io.IOException -> L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e java.io.IOException -> L20
            r2.close()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e java.io.IOException -> L20
            goto L31
        L1c:
            r1 = move-exception
            goto L44
        L1e:
            r1 = move-exception
            goto L4c
        L20:
            r2 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e java.io.FileNotFoundException -> L29
            if (r3 == 0) goto L31
            r2.toString()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e java.io.FileNotFoundException -> L29
            goto L31
        L29:
            r2 = move-exception
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r3 == 0) goto L31
            r2.toString()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
        L31:
            if (r1 == 0) goto L43
            r2 = 58
            int r2 = r1.indexOf(r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
        L43:
            return r0
        L44:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L4b
            r1.toString()
        L4b:
            return r0
        L4c:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L53
            r1.toString()
        L53:
            return r0
    }

    public static java.lang.String getChannel(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = com.umeng.commonsdk.UMConfigure.sChannel     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            if (r1 != 0) goto L13
            java.lang.String r3 = com.umeng.commonsdk.UMConfigure.sChannel     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            return r3
        Lf:
            r1 = move-exception
            goto L1a
        L11:
            r1 = move-exception
            goto L25
        L13:
            java.lang.String r1 = "channel"
            java.lang.String r3 = getMultiProcessSP(r3, r1)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11
            return r3
        L1a:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L21
            r1.toString()
        L21:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
        L25:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L2c
            r1.toString()
        L2c:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
    }

    public static java.lang.String getChannelByXML(android.content.Context r3) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L38
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r1)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L38
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L38
            java.lang.String r0 = "UMENG_CHANNEL"
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L38
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L27
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L38
            return r3
        L27:
            boolean r3 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L38
            java.lang.String r3 = "MobclickAgent"
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml."
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Throwable -> L38
            com.umeng.commonsdk.statistics.common.MLog.i(r3, r0)     // Catch: java.lang.Throwable -> L38
        L38:
            r3 = 0
            return r3
    }

    private static java.lang.Class<?> getClass(java.lang.String r0) {
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static java.lang.String getDeviceToken(android.content.Context r7) {
            r0 = 0
            if (r7 == 0) goto L40
            android.content.Context r7 = r7.getApplicationContext()
            android.content.Context r7 = com.stub.StubApp.getOrigApplicationContext(r7)
            java.lang.String r1 = "com.umeng.message.PushAgent"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "getInstance"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L40
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L40
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L40
            r3[r6] = r7     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L40
            java.lang.String r2 = "getRegistrationId"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L40
            java.lang.Object r7 = r1.invoke(r7, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L40
            boolean r1 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L40
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L40
            return r7
        L40:
            return r0
    }

    public static java.lang.String getDeviceType(android.content.Context r4) {
            java.lang.String r0 = "Phone"
            if (r4 != 0) goto L5
            return r0
        L5:
            r1 = 0
            android.content.res.Resources r2 = r4.getResources()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            int r2 = r2.screenLayout     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1a
            r2 = r2 & 15
            r3 = 3
            if (r2 < r3) goto L1c
            java.lang.String r4 = "Tablet"
            return r4
        L18:
            r0 = move-exception
            goto L1d
        L1a:
            r0 = move-exception
            goto L28
        L1c:
            return r0
        L1d:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L24
            r0.toString()
        L24:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r0)
            return r1
        L28:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L2f
            r0.toString()
        L2f:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r0)
            return r1
    }

    public static java.lang.String getDisplayResolution(android.content.Context r4) {
            java.lang.String r0 = ""
            if (r4 != 0) goto L5
            return r0
        L5:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r2 = "window"
            java.lang.Object r2 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r2 != 0) goto L15
            return r0
        L15:
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r2.getMetrics(r1)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            int r2 = r1.widthPixels     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            int r1 = r1.heightPixels     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r3.append(r1)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r1 = "*"
            r3.append(r1)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r3.append(r1)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            return r4
        L3d:
            r1 = move-exception
            goto L41
        L3f:
            r1 = move-exception
            goto L4c
        L41:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L48
            r1.toString()
        L48:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
        L4c:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L53
            r1.toString()
        L53:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
    }

    public static java.lang.String getFileMD5(java.io.File r7) {
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 0
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L3f
            boolean r3 = r7.isFile()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L41
            if (r3 != 0) goto L10
            java.lang.String r7 = ""
            return r7
        Le:
            r7 = move-exception
            goto L42
        L10:
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L41
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L41
            r4.<init>(r7)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L41
        L1b:
            r7 = 0
            int r5 = r4.read(r2, r7, r0)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L41
            r6 = -1
            if (r5 == r6) goto L27
            r3.update(r2, r7, r5)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L41
            goto L1b
        L27:
            r4.close()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L41
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L3f
            byte[] r2 = r3.digest()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L3f
            r3 = 1
            r0.<init>(r3, r2)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L3f
            java.lang.String r2 = "%1$032x"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L3f
            r3[r7] = r0     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L3f
            java.lang.String r7 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L3f
            return r7
        L3f:
            r7 = move-exception
            goto L4a
        L41:
            return r1
        L42:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L49
            r7.toString()
        L49:
            return r1
        L4a:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L51
            r7.toString()
        L51:
            return r1
    }

    private static java.lang.String getFlymeVersion(java.util.Properties r1) {
            java.lang.String r0 = "ro.build.display.id"
            java.lang.String r1 = r1.getProperty(r0)     // Catch: java.lang.Exception -> L20
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L20
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = "flyme os"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L20
            java.lang.String r0 = " "
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Exception -> L20
            r0 = 2
            r1 = r1[r0]     // Catch: java.lang.Exception -> L20
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static java.lang.String[] getGPU(javax.microedition.khronos.opengles.GL10 r3) {
            r0 = 7936(0x1f00, float:1.1121E-41)
            r1 = 0
            java.lang.String r0 = r3.glGetString(r0)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            r2 = 7937(0x1f01, float:1.1122E-41)
            java.lang.String r3 = r3.glGetString(r2)     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            java.lang.String[] r3 = new java.lang.String[]{r0, r3}     // Catch: java.lang.Throwable -> L12 java.lang.Exception -> L14
            return r3
        L12:
            r3 = move-exception
            goto L16
        L14:
            r3 = move-exception
            goto L20
        L16:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L1d
            r3.toString()
        L1d:
            java.lang.String[] r3 = new java.lang.String[r1]
            return r3
        L20:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L27
            r3.toString()
        L27:
            java.lang.String[] r3 = new java.lang.String[r1]
            return r3
    }

    public static java.lang.String getLastAppkey(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "last_appkey"
            java.lang.String r3 = getMultiProcessSP(r3, r1)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            return r3
        Lb:
            r1 = move-exception
            goto Lf
        Ld:
            r1 = move-exception
            goto L1a
        Lf:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L16
            r1.toString()
        L16:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
        L1a:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L21
            r1.toString()
        L21:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
    }

    public static java.util.Locale getLocale(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.content.res.Configuration r1 = new android.content.res.Configuration     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            r1.setToDefaults()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            android.content.ContentResolver r2 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            android.provider.Settings.System.getConfiguration(r2, r1)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.util.Locale r1 = r1.locale     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            goto L24
        L16:
            r1 = move-exception
            goto L2b
        L18:
            r1 = move-exception
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L21
            if (r2 == 0) goto L23
            r1.toString()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L21
            goto L23
        L21:
            r1 = move-exception
            goto L36
        L23:
            r1 = r0
        L24:
            if (r1 != 0) goto L2a
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L21
        L2a:
            return r1
        L2b:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L32
            r1.toString()
        L32:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
        L36:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L3d
            r1.toString()
        L3d:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
    }

    public static java.lang.String getMac(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "wifi"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.String r2 = "android.permission.ACCESS_WIFI_STATE"
            boolean r2 = checkPermission(r3, r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            if (r2 == 0) goto L24
            android.net.wifi.WifiInfo r1 = r1.getConnectionInfo()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.String r3 = r1.getMacAddress()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            return r3
        L20:
            r1 = move-exception
            goto L29
        L22:
            r1 = move-exception
            goto L34
        L24:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.String r3 = ""
            return r3
        L29:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L30
            r1.toString()
        L30:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
        L34:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L3b
            r1.toString()
        L3b:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
            return r0
    }

    private static byte[] getMiniArray() {
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [1, 6, 8, 12, 13} // fill-array
            return r0
    }

    public static java.lang.String getMultiProcessSP(android.content.Context r5, java.lang.String r6) {
            r0 = 0
            java.lang.Object r1 = com.umeng.commonsdk.utils.UMUtils.spLock     // Catch: java.lang.Throwable -> L59
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L55
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto Ld
            goto L55
        Ld:
            boolean r2 = isMainProgress(r5)     // Catch: java.lang.Throwable -> L23
            r3 = 0
            if (r2 == 0) goto L25
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L23
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.KEY_SHARED_PREFERENCES_NAME     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L23
            goto L4b
        L23:
            r5 = move-exception
            goto L57
        L25:
            java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r5)     // Catch: java.lang.Throwable -> L23
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L23
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r4.<init>()     // Catch: java.lang.Throwable -> L23
            r4.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "_"
            r4.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = com.umeng.commonsdk.utils.UMUtils.KEY_SHARED_PREFERENCES_NAME     // Catch: java.lang.Throwable -> L23
            r4.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L23
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L23
        L4b:
            if (r5 == 0) goto L53
            java.lang.String r5 = r5.getString(r6, r0)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            return r5
        L53:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            return r0
        L55:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            return r0
        L57:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r5
        L59:
            return r0
    }

    public static java.lang.String[] getNetworkAccessMode(android.content.Context r6) {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = ""
            r0[r1] = r2
            r3 = 1
            r0[r3] = r2
            if (r6 != 0) goto Le
            goto L6b
        Le:
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r4 = checkPermission(r6, r4)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 != 0) goto L1d
            r0[r1] = r2     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            return r0
        L19:
            r1 = move-exception
            goto L56
        L1b:
            r1 = move-exception
            goto L61
        L1d:
            java.lang.String r4 = "connectivity"
            java.lang.Object r4 = r6.getSystemService(r4)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 != 0) goto L2a
            r0[r1] = r2     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            return r0
        L2a:
            android.net.NetworkInfo r2 = r4.getNetworkInfo(r3)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r2 == 0) goto L3d
            android.net.NetworkInfo$State r2 = r2.getState()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            android.net.NetworkInfo$State r5 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r2 != r5) goto L3d
            java.lang.String r2 = "Wi-Fi"
            r0[r1] = r2     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            return r0
        L3d:
            android.net.NetworkInfo r2 = r4.getNetworkInfo(r1)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r2 == 0) goto L6b
            android.net.NetworkInfo$State r4 = r2.getState()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            android.net.NetworkInfo$State r5 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r4 != r5) goto L6b
            java.lang.String r4 = "2G/3G"
            r0[r1] = r4     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            java.lang.String r1 = r2.getSubtypeName()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r0[r3] = r1     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            return r0
        L56:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L5d
            r1.toString()
        L5d:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r1)
            goto L6b
        L61:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L68
            r1.toString()
        L68:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r1)
        L6b:
            return r0
    }

    public static java.lang.String getNetworkOperatorName(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getNetworkOperatorName(r0)
            return r0
    }

    public static java.lang.String getOaidRequiredTime(android.content.Context r2) {
            java.lang.String r0 = "header_device_oaid"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = com.umeng.commonsdk.statistics.idtracking.h.a     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1a
            java.lang.String r0 = "key_umeng_sp_oaid_required_time"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)     // Catch: java.lang.Throwable -> L1a
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public static java.lang.String getOperator(android.content.Context r1) {
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getRegisteredOperator(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Lc
            java.lang.String r1 = "Unknown"
        Lc:
            return r1
    }

    public static java.lang.String getRegisteredOperator(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getRegisteredOperator(r0)
            return r0
    }

    public static java.lang.String getSubOSName(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Properties r1 = getBuildProp()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L36
            java.lang.String r2 = "ro.miui.ui.version.name"
            java.lang.String r2 = r1.getProperty(r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r3 == 0) goto L2f
            boolean r3 = isFlyMe()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r3 == 0) goto L21
            java.lang.String r4 = "Flyme"
            return r4
        L1d:
            r1 = move-exception
            goto L38
        L1f:
            r1 = move-exception
            goto L32
        L21:
            java.lang.String r1 = getYunOSVersion(r1)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r1 != 0) goto L2e
            java.lang.String r4 = "YunOS"
            return r4
        L2e:
            return r2
        L2f:
            java.lang.String r4 = "MIUI"
            return r4
        L32:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L36
            return r0
        L36:
            r1 = move-exception
            goto L43
        L38:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L3f
            r1.toString()
        L3f:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
        L43:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L4a
            r1.toString()
        L4a:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
    }

    public static java.lang.String getSubOSVersion(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Properties r1 = getBuildProp()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2f
            java.lang.String r2 = "ro.miui.ui.version.name"
            java.lang.String r2 = r1.getProperty(r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L27
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L27
            if (r3 == 0) goto L29
            boolean r3 = isFlyMe()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L27
            if (r3 == 0) goto L22
            java.lang.String r4 = getFlymeVersion(r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L29
        L1e:
            r0 = r4
            goto L2e
        L20:
            r1 = move-exception
            goto L31
        L22:
            java.lang.String r4 = getYunOSVersion(r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L29
            goto L1e
        L27:
            r1 = move-exception
            goto L2b
        L29:
            r0 = r2
            goto L2e
        L2b:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L2f
        L2e:
            return r0
        L2f:
            r1 = move-exception
            goto L3c
        L31:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L38
            r1.toString()
        L38:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
        L3c:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r2 == 0) goto L43
            r1.toString()
        L43:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
            return r0
    }

    public static java.lang.String getSystemProperty(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "get"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L25
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L25
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L25
            r1[r5] = r7     // Catch: java.lang.Throwable -> L25
            r1[r6] = r8     // Catch: java.lang.Throwable -> L25
            r7 = 0
            java.lang.Object r7 = r0.invoke(r7, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L25
            return r7
        L25:
            return r8
    }

    public static int getTargetSdkVersion(android.content.Context r0) {
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L7
            int r0 = r0.targetSdkVersion     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static java.lang.String getUMId(android.content.Context r3) {
            r0 = 0
            if (r3 == 0) goto L16
            android.content.Context r1 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L12
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = "umid"
            java.lang.String r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r1, r2, r0)     // Catch: java.lang.Exception -> L12
            return r3
        L12:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
        L16:
            return r0
    }

    public static java.lang.String getUUIDForZid(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.SP_FILE_NAME
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            java.lang.String r0 = ""
            if (r2 == 0) goto L1a
            java.lang.String r1 = "session_id"
            java.lang.String r2 = r2.getString(r1, r0)
            return r2
        L1a:
            return r0
    }

    public static java.lang.String getUmengToken(android.content.Context r3) {
            r0 = 0
            if (r3 == 0) goto L16
            android.content.Context r1 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L12
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = "ztoken"
            java.lang.String r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r1, r2, r0)     // Catch: java.lang.Exception -> L12
            return r3
        L12:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)
        L16:
            return r0
    }

    private static java.lang.String getYunOSVersion(java.util.Properties r1) {
            java.lang.String r0 = "ro.yunos.version"
            java.lang.String r1 = r1.getProperty(r0)     // Catch: java.lang.Throwable -> Ld
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Ld
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static java.lang.String getZid(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            boolean r0 = com.umeng.commonsdk.UMConfigure.needSendZcfgEnv(r1)
            if (r0 != 0) goto L1b
            com.umeng.commonsdk.internal.b r1 = com.umeng.commonsdk.internal.b.a(r1)
            com.umeng.commonsdk.internal.c r1 = r1.a()
            java.lang.String r1 = r1.a()
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static boolean isAppInstalled(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            com.umeng.commonsdk.utils.b r1 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L10
            android.content.pm.PackageInfo r2 = r1.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            return r0
    }

    public static boolean isApplication(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L24
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L24
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Exception -> L24
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L24
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L24
            if (r0 != 0) goto L24
            java.lang.String r0 = "android.app.Application"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Exception -> L24
            if (r1 == 0) goto L24
            r1 = 1
            return r1
        L24:
            r1 = 0
            return r1
    }

    public static boolean isDebug(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo()     // Catch: java.lang.Exception -> L11
            int r2 = r1.flags     // Catch: java.lang.Exception -> L11
            r2 = r2 & 2
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            return r0
        L11:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r2, r1)
            return r0
    }

    private static boolean isFlyMe() {
            java.lang.Class<android.os.Build> r0 = android.os.Build.class
            java.lang.String r1 = "hasSmartBar"
            r2 = 0
            r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean isMainProgress(android.content.Context r2) {
            java.lang.String r0 = com.umeng.commonsdk.framework.UMFrUtils.getCurrentProcessName(r2)     // Catch: java.lang.Exception -> L24
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Exception -> L24
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L24
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L24
            if (r1 != 0) goto L24
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L24
            if (r1 != 0) goto L24
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Exception -> L24
            if (r2 == 0) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public static boolean isSdCardWrittenable() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private static java.lang.String parseId(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.util.regex.Pattern r1 = com.umeng.commonsdk.utils.UMUtils.pattern     // Catch: java.lang.Throwable -> L16
            java.util.regex.Matcher r2 = r1.matcher(r2)     // Catch: java.lang.Throwable -> L16
            boolean r1 = r2.find()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L16
            r1 = 1
            java.lang.String r2 = r2.group(r1)     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            return r0
    }

    private static java.lang.String readStreamToString(java.io.InputStream r4) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r4)
            r4 = 1024(0x400, float:1.435E-42)
            char[] r4 = new char[r4]
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
        Le:
            int r2 = r0.read(r4)
            r3 = -1
            if (r3 == r2) goto L1a
            r3 = 0
            r1.write(r4, r3, r2)
            goto Le
        L1a:
            java.lang.String r4 = r1.toString()
            return r4
    }

    private static void safeClose(java.io.InputStream r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Exception -> L5
        L5:
            return
    }

    public static void saveSDKComponent() {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "a"
            r0.append(r1)
            boolean r1 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            r2 = 2
            if (r1 == 0) goto L1a
            java.lang.String r1 = "统计SDK版本号: 9.6.5"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)
        L1a:
            java.lang.String r1 = "9.6.5"
            com.umeng.commonsdk.utils.UMUtils.VALUE_ANALYTICS_VERSION = r1
            java.lang.String r1 = com.umeng.commonsdk.internal.c.b()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L48
            com.umeng.commonsdk.utils.UMUtils.VALUE_ASMS_VERSION = r1
            boolean r3 = com.umeng.commonsdk.UMConfigure.isDebugLog()
            if (r3 == 0) goto L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ZID SDK版本号: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)
        L48:
            java.lang.String r1 = "com.umeng.analytics.game.GameSdkVersion"
            java.lang.Class r1 = getClass(r1)
            java.lang.String r3 = "SDK_VERSION"
            java.lang.String r4 = "g"
            if (r1 == 0) goto L89
            r0.append(r4)
            java.lang.reflect.Field r5 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r5.get(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L88
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L88
            if (r5 != 0) goto L89
            com.umeng.commonsdk.utils.UMUtils.VALUE_GAME_VERSION = r1     // Catch: java.lang.Throwable -> L88
            boolean r5 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L89
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r5.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = "游戏统计SDK版本号: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L88
            r5.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L88
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)     // Catch: java.lang.Throwable -> L88
            goto L89
        L88:
        L89:
            java.lang.String r1 = "com.umeng.vt.V"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto Lca
            java.lang.String r5 = "v"
            r0.append(r5)
            java.lang.String r5 = "VERSION"
            java.lang.reflect.Field r5 = r1.getDeclaredField(r5)     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r1 = r5.get(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc9
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lc9
            if (r5 != 0) goto Lca
            com.umeng.commonsdk.utils.UMUtils.VALUE_VISUAL_VERSION = r1     // Catch: java.lang.Throwable -> Lc9
            boolean r5 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> Lc9
            if (r5 == 0) goto Lca
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            r5.<init>()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = "可视化埋点SDK版本号: "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lc9
            r5.append(r1)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> Lc9
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)     // Catch: java.lang.Throwable -> Lc9
            goto Lca
        Lc9:
        Lca:
            java.lang.String r1 = "com.umeng.message.PushAgent"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L111
            java.lang.String r1 = "p"
            r0.append(r1)
            java.lang.String r1 = "com.umeng.message.MsgConstant"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L111
            java.lang.reflect.Field r3 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L110
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L110
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L110
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L110
            if (r3 != 0) goto L111
            com.umeng.commonsdk.utils.UMUtils.VALUE_PUSH_VERSION = r1     // Catch: java.lang.Throwable -> L110
            boolean r3 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L110
            if (r3 == 0) goto L111
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L110
            r3.<init>()     // Catch: java.lang.Throwable -> L110
            java.lang.String r5 = "推送SDK版本号: "
            r3.append(r5)     // Catch: java.lang.Throwable -> L110
            r3.append(r1)     // Catch: java.lang.Throwable -> L110
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L110
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L110
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)     // Catch: java.lang.Throwable -> L110
            goto L111
        L110:
        L111:
            java.lang.String r1 = "com.umeng.socialize.UMShareAPI"
            java.lang.Class r1 = getClass(r1)
            java.lang.String r3 = "getSdkVersion"
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L175
            java.lang.String r7 = "s"
            r0.append(r7)
            java.lang.String r7 = "com.umeng.a"
            java.lang.Class r7 = getClass(r7)
            if (r7 == 0) goto L15c
            java.lang.reflect.Field r4 = r7.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L15b
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L15b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L15b
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L15b
            if (r7 != 0) goto L15c
            com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION = r4     // Catch: java.lang.Throwable -> L15b
            boolean r7 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L15b
            if (r7 == 0) goto L15c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15b
            r7.<init>()     // Catch: java.lang.Throwable -> L15b
            java.lang.String r8 = "分享SDK版本号: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L15b
            r7.append(r4)     // Catch: java.lang.Throwable -> L15b
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L15b
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L15b
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r4)     // Catch: java.lang.Throwable -> L15b
            goto L15c
        L15b:
        L15c:
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L175
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> L174
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L174
            java.lang.Object r1 = r4.invoke(r1, r6)     // Catch: java.lang.Throwable -> L174
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L174
            com.umeng.commonsdk.utils.UMUtils.VALUE_SHARE_VERSION = r1     // Catch: java.lang.Throwable -> L174
            goto L175
        L174:
        L175:
            java.lang.String r1 = "com.umeng.error.UMError"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L182
            java.lang.String r1 = "e"
            r0.append(r1)
        L182:
            java.lang.String r1 = "com.umeng.umzid.ZIDManager"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L18f
            java.lang.String r1 = "z"
            r0.append(r1)
        L18f:
            java.lang.String r1 = "i"
            r0.append(r1)
            int r1 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE
            if (r1 == r5) goto L1a5
            java.lang.String r1 = "com.umeng.commonsdk.internal.UMOplus"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L1a5
            java.lang.String r1 = "o"
            r0.append(r1)
        L1a5:
            java.lang.String r1 = "com.umeng.airec.RecAgent"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L1ee
            java.lang.String r1 = "u"
            r0.append(r1)
            java.lang.String r1 = "com.umeng.airec.BuildConfig"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L1ee
            java.lang.String r4 = "VERSION_NAME"
            java.lang.reflect.Field r4 = r1.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L1ed
            java.lang.Object r1 = r4.get(r1)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1ed
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1ed
            if (r4 != 0) goto L1ee
            com.umeng.commonsdk.utils.UMUtils.VALUE_REC_VERSION_NAME = r1     // Catch: java.lang.Throwable -> L1ed
            boolean r4 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L1ed
            if (r4 == 0) goto L1ee
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ed
            r4.<init>()     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r7 = "智能推荐SDK版本号: "
            r4.append(r7)     // Catch: java.lang.Throwable -> L1ed
            r4.append(r1)     // Catch: java.lang.Throwable -> L1ed
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L1ed
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L1ed
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)     // Catch: java.lang.Throwable -> L1ed
            goto L1ee
        L1ed:
        L1ee:
            java.lang.String r1 = "com.umeng.umverify.UMVerifyHelper"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L1fb
            java.lang.String r1 = "n"
            r0.append(r1)
        L1fb:
            java.lang.String r1 = "com.umeng.sms.UMSMS"
            java.lang.Class r1 = getClass(r1)
            java.lang.String r4 = "getVersion"
            if (r1 == 0) goto L23c
            java.lang.String r7 = "m"
            r0.append(r7)
            java.lang.reflect.Method r7 = r1.getDeclaredMethod(r4, r6)     // Catch: java.lang.Throwable -> L23c
            if (r7 == 0) goto L23c
            java.lang.Object r1 = r7.invoke(r1, r6)     // Catch: java.lang.Throwable -> L23c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L23c
            boolean r7 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L23c
            if (r7 != 0) goto L23c
            com.umeng.commonsdk.utils.UMUtils.VALUE_SMS_VERSION = r1     // Catch: java.lang.Throwable -> L23c
            boolean r7 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L23c
            if (r7 == 0) goto L23c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23c
            r7.<init>()     // Catch: java.lang.Throwable -> L23c
            java.lang.String r8 = "短信验证码SDK版本号: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L23c
            r7.append(r1)     // Catch: java.lang.Throwable -> L23c
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L23c
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L23c
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)     // Catch: java.lang.Throwable -> L23c
        L23c:
            java.lang.String r1 = "com.umeng.umcrash.UMCrash"
            java.lang.Class r1 = getClass(r1)     // Catch: java.lang.Throwable -> L27f
            if (r1 == 0) goto L280
            java.lang.String r7 = "c"
            r0.append(r7)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r7 = "crashSdkVersion"
            java.lang.reflect.Field r7 = r1.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L27f
            r7.setAccessible(r5)     // Catch: java.lang.Throwable -> L27f
            java.lang.Object r1 = r7.get(r1)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L27f
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L27f
            if (r5 != 0) goto L280
            com.umeng.commonsdk.utils.UMUtils.VALUE_APM_VERSION = r1     // Catch: java.lang.Throwable -> L27f
            boolean r5 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L27f
            if (r5 == 0) goto L280
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27f
            r5.<init>()     // Catch: java.lang.Throwable -> L27f
            java.lang.String r7 = "APM SDK版本号: "
            r5.append(r7)     // Catch: java.lang.Throwable -> L27f
            r5.append(r1)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L27f
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L27f
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)     // Catch: java.lang.Throwable -> L27f
            goto L280
        L27f:
        L280:
            java.lang.String r1 = "com.umeng.umlink.MobclickLink"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L2c1
            java.lang.String r5 = "l"
            r0.append(r5)
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r4, r6)     // Catch: java.lang.Throwable -> L2c0
            if (r5 == 0) goto L2c1
            java.lang.Object r1 = r5.invoke(r1, r6)     // Catch: java.lang.Throwable -> L2c0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2c0
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2c0
            if (r5 != 0) goto L2c1
            com.umeng.commonsdk.utils.UMUtils.VALUE_LINK_VERSION = r1     // Catch: java.lang.Throwable -> L2c0
            boolean r5 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L2c0
            if (r5 == 0) goto L2c1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c0
            r5.<init>()     // Catch: java.lang.Throwable -> L2c0
            java.lang.String r7 = "ULink SDK版本号: "
            r5.append(r7)     // Catch: java.lang.Throwable -> L2c0
            r5.append(r1)     // Catch: java.lang.Throwable -> L2c0
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L2c0
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L2c0
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)     // Catch: java.lang.Throwable -> L2c0
            goto L2c1
        L2c0:
        L2c1:
            java.lang.String r1 = "com.umeng.cconfig.UMRemoteConfig"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L302
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r4, r6)     // Catch: java.lang.Throwable -> L301
            if (r4 == 0) goto L302
            java.lang.String r5 = "t"
            r0.append(r5)     // Catch: java.lang.Throwable -> L301
            java.lang.Object r1 = r4.invoke(r1, r6)     // Catch: java.lang.Throwable -> L301
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L301
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L301
            if (r4 != 0) goto L302
            com.umeng.commonsdk.utils.UMUtils.VALUE_ABTEST_VERSION = r1     // Catch: java.lang.Throwable -> L301
            boolean r4 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L301
            if (r4 == 0) goto L302
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L301
            r4.<init>()     // Catch: java.lang.Throwable -> L301
            java.lang.String r5 = "UABTEST SDK版本号: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L301
            r4.append(r1)     // Catch: java.lang.Throwable -> L301
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L301
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L301
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)     // Catch: java.lang.Throwable -> L301
            goto L302
        L301:
        L302:
            java.lang.String r1 = "com.uyumao.sdk.UYMManager"
            java.lang.Class r1 = getClass(r1)
            if (r1 == 0) goto L343
            java.lang.reflect.Method r3 = r1.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> L342
            if (r3 == 0) goto L343
            java.lang.String r4 = "r"
            r0.append(r4)     // Catch: java.lang.Throwable -> L342
            java.lang.Object r1 = r3.invoke(r1, r6)     // Catch: java.lang.Throwable -> L342
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L342
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L342
            if (r3 != 0) goto L343
            com.umeng.commonsdk.utils.UMUtils.VALUE_ANTI_VERSION = r1     // Catch: java.lang.Throwable -> L342
            boolean r3 = com.umeng.commonsdk.UMConfigure.isDebugLog()     // Catch: java.lang.Throwable -> L342
            if (r3 == 0) goto L343
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L342
            r3.<init>()     // Catch: java.lang.Throwable -> L342
            java.lang.String r4 = "ANTI SDK版本号: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L342
            r3.append(r1)     // Catch: java.lang.Throwable -> L342
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L342
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L342
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r2, r1)     // Catch: java.lang.Throwable -> L342
            goto L343
        L342:
        L343:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L351
            java.lang.String r0 = r0.toString()
            com.umeng.commonsdk.statistics.b.a = r0
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a
        L351:
            return
    }

    public static void setAppkey(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto L24
            if (r2 != 0) goto L5
            goto L24
        L5:
            java.lang.String r0 = "appkey"
            setMultiProcessSP(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            return
        Lb:
            r2 = move-exception
            goto Lf
        Ld:
            r2 = move-exception
            goto L1a
        Lf:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L16
            r2.toString()
        L16:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r2)
            goto L24
        L1a:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L21
            r2.toString()
        L21:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r2)
        L24:
            return
    }

    public static void setChannel(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto L24
            if (r2 != 0) goto L5
            goto L24
        L5:
            java.lang.String r0 = "channel"
            setMultiProcessSP(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            return
        Lb:
            r2 = move-exception
            goto Lf
        Ld:
            r2 = move-exception
            goto L1a
        Lf:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L16
            r2.toString()
        L16:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r2)
            goto L24
        L1a:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L21
            r2.toString()
        L21:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r2)
        L24:
            return
    }

    public static void setLastAppkey(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto L24
            if (r2 != 0) goto L5
            goto L24
        L5:
            java.lang.String r0 = "last_appkey"
            setMultiProcessSP(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> Ld
            return
        Lb:
            r2 = move-exception
            goto Lf
        Ld:
            r2 = move-exception
            goto L1a
        Lf:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L16
            r2.toString()
        L16:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r2)
            goto L24
        L1a:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L21
            r2.toString()
        L21:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r2)
        L24:
            return
    }

    public static void setMultiProcessSP(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            java.lang.Object r0 = com.umeng.commonsdk.utils.UMUtils.spLock     // Catch: java.lang.Throwable -> L5f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L5b
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L5b
            if (r6 != 0) goto Le
            goto L5b
        Le:
            boolean r1 = isMainProgress(r4)     // Catch: java.lang.Throwable -> L24
            r2 = 0
            if (r1 == 0) goto L26
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L24
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.KEY_SHARED_PREFERENCES_NAME     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L24
            goto L4c
        L24:
            r4 = move-exception
            goto L5d
        L26:
            java.lang.String r1 = com.umeng.commonsdk.framework.UMFrUtils.getSubProcessName(r4)     // Catch: java.lang.Throwable -> L24
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L24
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            r3.append(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "_"
            r3.append(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.KEY_SHARED_PREFERENCES_NAME     // Catch: java.lang.Throwable -> L24
            r3.append(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L24
        L4c:
            if (r4 == 0) goto L59
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r4 = r4.putString(r5, r6)     // Catch: java.lang.Throwable -> L24
            r4.commit()     // Catch: java.lang.Throwable -> L24
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
        L5f:
            return
    }

    public static void setUUIDForZid(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.SP_FILE_NAME
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            java.lang.String r0 = ""
        L1a:
            if (r2 == 0) goto L29
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r1 = "session_id"
            android.content.SharedPreferences$Editor r2 = r2.putString(r1, r0)
            r2.commit()
        L29:
            return
    }
}
