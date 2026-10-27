package com.umeng.commonsdk.statistics.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final java.lang.String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    private static final java.lang.String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    protected static final java.lang.String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";
    public static final java.lang.String MOBILE_NETWORK = "2G/3G";
    public static final java.lang.String UNKNOW = "";
    public static final java.lang.String WIFI = "Wi-Fi";
    private static com.umeng.commonsdk.statistics.common.DeviceTypeEnum deviceTypeEnum;
    private static volatile boolean hasReadAndroidID;
    private static volatile boolean hasReadIDFA;
    private static volatile boolean hasReadIMEI2;
    private static volatile boolean hasReadImeiOrMeid;
    private static volatile boolean hasReadImsi;
    private static volatile boolean hasReadMac;
    private static volatile boolean hasReadOAID;
    private static volatile boolean hasReadOperator;
    private static volatile boolean hasReadOperatorName;
    private static volatile boolean hasReadSerialNo;
    private static volatile boolean hasReadSimSerialNumber;
    private static volatile java.lang.String sAndroidID;
    private static volatile java.lang.String sAppName;
    private static volatile java.lang.String sAppPkgName;
    private static volatile java.lang.String sCustomAgt;
    private static volatile java.lang.String sIDFA;
    private static volatile java.lang.String sImei;
    private static volatile java.lang.String sImsi;
    private static volatile java.lang.String sMeid;
    private static volatile java.lang.String sOAID;
    private static volatile java.lang.String sOperator;
    private static volatile java.lang.String sOperatorName;
    private static volatile java.lang.String sSecondImei;
    private static volatile java.lang.String sSerialNo;
    private static volatile java.lang.String sSimSerialNumber;
    private static volatile java.lang.String sWifiMac;

    static {
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r0 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.DEFAULT
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r0
            java.lang.String r0 = ""
            com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImei = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImsi = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSerialNo = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sAndroidID = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sIDFA = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sOAID = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSecondImei = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumber = r0
            r1 = 0
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadSimSerialNumber = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadIMEI2 = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadSerialNo = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadAndroidID = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadMac = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImsi = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOAID = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadIDFA = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.sAppName = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sAppPkgName = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOperator = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.sOperator = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOperatorName = r1
            com.umeng.commonsdk.statistics.common.DeviceConfig.sOperatorName = r0
            com.umeng.commonsdk.statistics.common.DeviceConfig.sCustomAgt = r0
            return
    }

    public DeviceConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String byte2HexFormatted(byte[] r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8.length
            r2 = 2
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
        La:
            int r3 = r8.length
            if (r1 >= r3) goto L4a
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
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.toUpperCase(r4)
            r0.append(r3)
            int r3 = r8.length
            int r3 = r3 - r5
            if (r1 >= r3) goto L47
            r3 = 58
            r0.append(r3)
        L47:
            int r1 = r1 + 1
            goto La
        L4a:
            java.lang.String r8 = r0.toString()
            return r8
    }

    public static boolean checkPermission(android.content.Context r6, java.lang.String r7) {
            r0 = 0
            if (r6 != 0) goto L4
            goto L3e
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            r3 = 1
            if (r1 < r2) goto L2f
            java.lang.String r1 = "android.content.Context"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "checkSelfPermission"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2e
            r2[r0] = r7     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L2e
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L2e
            return r3
        L2e:
            return r0
        L2f:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            java.lang.String r6 = r6.getPackageName()
            int r6 = r1.checkPermission(r7, r6)
            if (r6 != 0) goto L3e
            return r3
        L3e:
            return r0
    }

    public static java.lang.String getAndroidId(android.content.Context r2) {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldCollectAid()
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.String r2 = "MobclickRT"
            java.lang.String r0 = "disallow read aid."
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)
            return r1
        Lf:
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sAndroidID
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.sAndroidID
            return r2
        L1a:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadAndroidID
            if (r0 == 0) goto L1f
            return r1
        L1f:
            java.lang.String r0 = "header_device_id_android_id"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L47
            if (r2 == 0) goto L47
            r0 = 1
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r1)     // Catch: java.lang.Throwable -> L39
            com.umeng.commonsdk.statistics.common.DeviceConfig.sAndroidID = r2     // Catch: java.lang.Throwable -> L39
        L36:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadAndroidID = r0
            goto L47
        L39:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L36
            java.lang.String r2 = "can't read android id"
            com.umeng.commonsdk.statistics.common.MLog.w(r2)     // Catch: java.lang.Throwable -> L43
            goto L36
        L43:
            r2 = move-exception
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadAndroidID = r0
            throw r2
        L47:
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.sAndroidID
            return r2
    }

    public static java.lang.String getAppHashKey(android.content.Context r3) {
            com.umeng.commonsdk.utils.b r0 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = getPackageName(r3)     // Catch: java.lang.Throwable -> L32
            r2 = 64
            android.content.pm.PackageInfo r3 = r0.a(r3, r1, r2)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L32
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.lang.Throwable -> L32
            int r0 = r3.length     // Catch: java.lang.Throwable -> L32
            if (r0 <= 0) goto L32
            r0 = 0
            r3 = r3[r0]     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "SHA"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L32
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.Throwable -> L32
            r1.update(r3)     // Catch: java.lang.Throwable -> L32
            byte[] r3 = r1.digest()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L32
            return r3
        L32:
            r3 = 0
            return r3
    }

    public static java.lang.String getAppMD5Signature(android.content.Context r3) {
            if (r3 != 0) goto L3
            goto L40
        L3:
            com.umeng.commonsdk.utils.b r0 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = getPackageName(r3)     // Catch: java.lang.Throwable -> L40
            r2 = 64
            android.content.pm.PackageInfo r3 = r0.a(r3, r1, r2)     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L40
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.lang.Throwable -> L40
            r0 = 0
            r3 = r3[r0]     // Catch: java.lang.Throwable -> L40
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.Throwable -> L40
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L40
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "X509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch: java.lang.Throwable -> L40
            java.security.cert.Certificate r3 = r3.generateCertificate(r0)     // Catch: java.lang.Throwable -> L40
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L40
            byte[] r3 = r3.getEncoded()     // Catch: java.lang.Throwable -> L40
            byte[] r3 = r0.digest(r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = byte2HexFormatted(r3)     // Catch: java.lang.Throwable -> L40
            return r3
        L40:
            r3 = 0
            return r3
    }

    public static java.lang.String getAppName(android.content.Context r3) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sAppName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sAppName
            return r3
        Lb:
            if (r3 != 0) goto Lf
            r3 = 0
            return r3
        Lf:
            com.umeng.commonsdk.utils.b r0 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L30
            r2 = 64
            android.content.pm.PackageInfo r0 = r0.a(r3, r1, r2)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L3a
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: java.lang.Throwable -> L30
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.CharSequence r3 = r0.loadLabel(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L30
            com.umeng.commonsdk.statistics.common.DeviceConfig.sAppName = r3     // Catch: java.lang.Throwable -> L30
            goto L3a
        L30:
            r3 = move-exception
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L3a
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG
            com.umeng.commonsdk.statistics.common.MLog.i(r0, r3)
        L3a:
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sAppName
            return r3
    }

    public static java.lang.String getAppSHA1Key(android.content.Context r3) {
            com.umeng.commonsdk.utils.b r0 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Exception -> L3d
            java.lang.String r1 = getPackageName(r3)     // Catch: java.lang.Exception -> L3d
            r2 = 64
            android.content.pm.PackageInfo r3 = r0.a(r3, r1, r2)     // Catch: java.lang.Exception -> L3d
            if (r3 == 0) goto L3d
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.lang.Exception -> L3d
            r0 = 0
            r3 = r3[r0]     // Catch: java.lang.Exception -> L3d
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.Exception -> L3d
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L3d
            r0.<init>(r3)     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = "X509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch: java.lang.Exception -> L3d
            java.security.cert.Certificate r3 = r3.generateCertificate(r0)     // Catch: java.lang.Exception -> L3d
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L3d
            byte[] r3 = r3.getEncoded()     // Catch: java.lang.Exception -> L3d
            byte[] r3 = r0.digest(r3)     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = byte2HexFormatted(r3)     // Catch: java.lang.Exception -> L3d
            return r3
        L3d:
            r3 = 0
            return r3
    }

    public static java.lang.String getAppVersionCode(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r0)
            return r0
    }

    public static java.lang.String getAppVersionName(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r0)
            return r0
    }

    public static java.lang.String getApplicationLable(android.content.Context r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.CharSequence r1 = r0.getApplicationLabel(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private static java.util.Properties getBuildProp() {
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L20
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L20
            java.io.File r4 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = "build.prop"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L20
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20
            r0.load(r2)     // Catch: java.lang.Throwable -> L1d
            r2.close()     // Catch: java.lang.Throwable -> L26
            return r0
        L1d:
            r1 = r2
            goto L21
        L20:
        L21:
            if (r1 == 0) goto L26
            r1.close()     // Catch: java.lang.Throwable -> L26
        L26:
            return r0
    }

    public static java.lang.String getCPU() {
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.io.FileNotFoundException -> L23
            java.lang.String r2 = "/proc/cpuinfo"
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L23
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1a
            r3 = 1024(0x400, float:1.435E-42)
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L1a
            r2.close()     // Catch: java.lang.Throwable -> L1a
            r1.close()     // Catch: java.lang.Throwable -> L1a
            goto L2b
        L1a:
            r1 = move-exception
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.io.FileNotFoundException -> L23
            java.lang.String r3 = "Could not read from file /proc/cpuinfo"
            com.umeng.commonsdk.statistics.common.MLog.e(r2, r3, r1)     // Catch: java.io.FileNotFoundException -> L23
            goto L2b
        L23:
            r1 = move-exception
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG
            java.lang.String r3 = "Could not open file /proc/cpuinfo"
            com.umeng.commonsdk.statistics.common.MLog.e(r2, r3, r1)
        L2b:
            if (r0 == 0) goto L3e
            r1 = 58
            int r1 = r0.indexOf(r1)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = r0.trim()
            return r0
        L3e:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getCustomAgt() {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sCustomAgt
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sCustomAgt
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            java.lang.String r1 = "Dalvik/"
            r0.append(r1)
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.append(r1)
            java.lang.String r1 = " (Linux; U; Android "
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.umeng.commonsdk.statistics.common.DeviceConfig.sCustomAgt = r0
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sCustomAgt
            return r0
    }

    public static java.lang.String getDBencryptID(android.content.Context r0) {
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.genId()
            return r0
    }

    public static java.lang.String getDeviceId(android.content.Context r2) {
            int r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.getDeviceType()
            r1 = 2
            if (r0 != r1) goto Lc
            java.lang.String r2 = getDeviceIdForBox(r2)
            return r2
        Lc:
            java.lang.String r2 = getDeviceIdForGeneral(r2)
            return r2
    }

    public static java.lang.String getDeviceIdForBox(android.content.Context r8) {
            java.lang.String r0 = ""
            if (r8 != 0) goto L5
            return r0
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1dd
            r2 = 0
            r3 = 1
            java.lang.String r4 = "getDeviceId, ANDROID_ID: "
            r5 = 23
            java.lang.String r6 = "getDeviceId, MAC: "
            java.lang.String r7 = "header_device_id_android_id"
            if (r1 >= r5) goto L84
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r7)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L3d
            java.lang.String r0 = getAndroidId(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.ANDROIDID     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L3d
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1dd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dd
            r5.<init>()     // Catch: java.lang.Throwable -> L1dd
            r5.append(r4)     // Catch: java.lang.Throwable -> L1dd
            r5.append(r0)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L1dd
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1dd
            r5[r2] = r4     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.MLog.i(r1, r5)     // Catch: java.lang.Throwable -> L1dd
        L3d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L83
            java.lang.String r0 = getMacBySystemInterface(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.MAC     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L67
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1dd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dd
            r4.<init>()     // Catch: java.lang.Throwable -> L1dd
            r4.append(r6)     // Catch: java.lang.Throwable -> L1dd
            r4.append(r0)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1dd
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1dd
            r3[r2] = r4     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.MLog.i(r1, r3)     // Catch: java.lang.Throwable -> L1dd
        L67:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L83
            java.lang.String r0 = getSerialNo()     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.SERIALNO     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L83
            java.lang.String r0 = getIMEI(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r8 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IMEI     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r8     // Catch: java.lang.Throwable -> L1dd
        L83:
            return r0
        L84:
            if (r1 != r5) goto L10e
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r7)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto Lb0
            java.lang.String r0 = getAndroidId(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.ANDROIDID     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto Lb0
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1dd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dd
            r5.<init>()     // Catch: java.lang.Throwable -> L1dd
            r5.append(r4)     // Catch: java.lang.Throwable -> L1dd
            r5.append(r0)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L1dd
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1dd
            r5[r2] = r4     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.MLog.i(r1, r5)     // Catch: java.lang.Throwable -> L1dd
        Lb0:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L10d
            java.lang.String r0 = getMacByJavaAPI()     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.MAC     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r4 == 0) goto Ld5
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.CHECK_DEVICE     // Catch: java.lang.Throwable -> L1dd
            if (r4 == 0) goto Lcf
            java.lang.String r0 = getMacShell()     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            goto Ld5
        Lcf:
            java.lang.String r0 = getMacBySystemInterface(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
        Ld5:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto Lf1
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1dd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dd
            r4.<init>()     // Catch: java.lang.Throwable -> L1dd
            r4.append(r6)     // Catch: java.lang.Throwable -> L1dd
            r4.append(r0)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1dd
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1dd
            r3[r2] = r4     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.MLog.i(r1, r3)     // Catch: java.lang.Throwable -> L1dd
        Lf1:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L10d
            java.lang.String r0 = getSerialNo()     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.SERIALNO     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L10d
            java.lang.String r0 = getIMEI(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r8 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IMEI     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r8     // Catch: java.lang.Throwable -> L1dd
        L10d:
            return r0
        L10e:
            r4 = 29
            if (r1 < r4) goto L15f
            java.lang.String r0 = getOaid(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.OAID     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L15e
            java.lang.String r0 = getIdfa(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IDFA     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L15e
            java.lang.String r0 = getAndroidId(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.ANDROIDID     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L15e
            java.lang.String r0 = getSerialNo()     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.SERIALNO     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L15e
            java.lang.String r0 = getMacByJavaAPI()     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.MAC     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r2 == 0) goto L15e
            java.lang.String r0 = getMacBySystemInterface(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
        L15e:
            return r0
        L15f:
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r7)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L18b
            java.lang.String r0 = getAndroidId(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.ANDROIDID     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L18b
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1dd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dd
            r4.<init>()     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r5 = "getDeviceId: ANDROID_ID: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1dd
            r4.append(r0)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1dd
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1dd
            r5[r2] = r4     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.MLog.i(r1, r5)     // Catch: java.lang.Throwable -> L1dd
        L18b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L1dd
            java.lang.String r0 = getSerialNo()     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.SERIALNO     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L1dd
            java.lang.String r0 = getIMEI(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IMEI     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L1dd
            java.lang.String r0 = getMacByJavaAPI()     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.MAC     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1dd
            if (r4 == 0) goto L1dd
            java.lang.String r0 = getMacBySystemInterface(r8)     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1dd
            boolean r8 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1dd
            if (r8 == 0) goto L1dd
            java.lang.String r8 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1dd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dd
            r1.<init>()     // Catch: java.lang.Throwable -> L1dd
            r1.append(r6)     // Catch: java.lang.Throwable -> L1dd
            r1.append(r0)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1dd
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1dd
            r3[r2] = r1     // Catch: java.lang.Throwable -> L1dd
            com.umeng.commonsdk.statistics.common.MLog.i(r8, r3)     // Catch: java.lang.Throwable -> L1dd
        L1dd:
            return r0
    }

    public static java.lang.String getDeviceIdForGeneral(android.content.Context r9) {
            java.lang.String r0 = ""
            if (r9 != 0) goto L5
            return r0
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1ca
            r2 = 0
            r3 = 1
            r4 = 23
            java.lang.String r5 = "getDeviceId, ANDROID_ID: "
            java.lang.String r6 = "header_device_id_android_id"
            if (r1 >= r4) goto L73
            java.lang.String r0 = getIMEI(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IMEI     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L72
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L2e
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1ca
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r8 = "No IMEI."
            r7[r2] = r8     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.MLog.w(r4, r7)     // Catch: java.lang.Throwable -> L1ca
        L2e:
            java.lang.String r0 = getMacBySystemInterface(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r4 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.MAC     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r4     // Catch: java.lang.Throwable -> L1ca
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r4 == 0) goto L72
            boolean r4 = com.umeng.commonsdk.config.FieldManager.allow(r6)     // Catch: java.lang.Throwable -> L1ca
            if (r4 == 0) goto L64
            java.lang.String r0 = getAndroidId(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r9 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.ANDROIDID     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r9     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L64
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r1.<init>()     // Catch: java.lang.Throwable -> L1ca
            r1.append(r5)     // Catch: java.lang.Throwable -> L1ca
            r1.append(r0)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1ca
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1ca
            r3[r2] = r1     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.MLog.i(r9, r3)     // Catch: java.lang.Throwable -> L1ca
        L64:
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r9 == 0) goto L72
            java.lang.String r0 = getSerialNo()     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r9 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.SERIALNO     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r9     // Catch: java.lang.Throwable -> L1ca
        L72:
            return r0
        L73:
            java.lang.String r7 = "getDeviceId, MAC: "
            if (r1 != r4) goto Lfd
            java.lang.String r0 = getIMEI(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IMEI     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto Lfc
            java.lang.String r0 = getMacByJavaAPI()     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.MAC     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r4 == 0) goto La4
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.CHECK_DEVICE     // Catch: java.lang.Throwable -> L1ca
            if (r4 == 0) goto L9e
            java.lang.String r0 = getMacShell()     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            goto La4
        L9e:
            java.lang.String r0 = getMacBySystemInterface(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
        La4:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto Lc0
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1ca
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r8.<init>()     // Catch: java.lang.Throwable -> L1ca
            r8.append(r7)     // Catch: java.lang.Throwable -> L1ca
            r8.append(r0)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L1ca
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1ca
            r8[r2] = r7     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.MLog.i(r4, r8)     // Catch: java.lang.Throwable -> L1ca
        Lc0:
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r4 == 0) goto Lfc
            boolean r4 = com.umeng.commonsdk.config.FieldManager.allow(r6)     // Catch: java.lang.Throwable -> L1ca
            if (r4 == 0) goto Lee
            java.lang.String r0 = getAndroidId(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r9 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.ANDROIDID     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r9     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto Lee
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r1.<init>()     // Catch: java.lang.Throwable -> L1ca
            r1.append(r5)     // Catch: java.lang.Throwable -> L1ca
            r1.append(r0)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1ca
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1ca
            r3[r2] = r1     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.MLog.i(r9, r3)     // Catch: java.lang.Throwable -> L1ca
        Lee:
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r9 == 0) goto Lfc
            java.lang.String r0 = getSerialNo()     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r9 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.SERIALNO     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r9     // Catch: java.lang.Throwable -> L1ca
        Lfc:
            return r0
        Lfd:
            r4 = 29
            if (r1 < r4) goto L14e
            java.lang.String r0 = getOaid(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.OAID     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L14d
            java.lang.String r0 = getIdfa(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IDFA     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L14d
            java.lang.String r0 = getAndroidId(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.ANDROIDID     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L14d
            java.lang.String r0 = getSerialNo()     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.SERIALNO     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L14d
            java.lang.String r0 = getMacByJavaAPI()     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.MAC     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r2 == 0) goto L14d
            java.lang.String r0 = getMacBySystemInterface(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
        L14d:
            return r0
        L14e:
            java.lang.String r0 = getIMEI(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IMEI     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L1ca
            java.lang.String r0 = getSerialNo()     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.SERIALNO     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L1ca
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r6)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L194
            java.lang.String r0 = getAndroidId(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.ANDROIDID     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L194
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1ca
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r4.<init>()     // Catch: java.lang.Throwable -> L1ca
            r4.append(r5)     // Catch: java.lang.Throwable -> L1ca
            r4.append(r0)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1ca
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1ca
            r5[r2] = r4     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.MLog.i(r1, r5)     // Catch: java.lang.Throwable -> L1ca
        L194:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r1 == 0) goto L1ca
            java.lang.String r0 = getMacByJavaAPI()     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.MAC     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ca
            if (r4 == 0) goto L1ca
            java.lang.String r0 = getMacBySystemInterface(r9)     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum = r1     // Catch: java.lang.Throwable -> L1ca
            boolean r9 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L1ca
            if (r9 == 0) goto L1ca
            java.lang.String r9 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L1ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ca
            r1.<init>()     // Catch: java.lang.Throwable -> L1ca
            r1.append(r7)     // Catch: java.lang.Throwable -> L1ca
            r1.append(r0)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1ca
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1ca
            r3[r2] = r1     // Catch: java.lang.Throwable -> L1ca
            com.umeng.commonsdk.statistics.common.MLog.i(r9, r3)     // Catch: java.lang.Throwable -> L1ca
        L1ca:
            return r0
    }

    public static java.lang.String getDeviceIdType() {
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.deviceTypeEnum
            java.lang.String r0 = r0.getDeviceIdType()
            return r0
    }

    public static java.lang.String getDeviceIdUmengMD5(android.content.Context r0) {
            java.lang.String r0 = getDeviceId(r0)
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.HelperUtils.getUmengMD5(r0)
            return r0
    }

    public static java.lang.String getDeviceType(android.content.Context r2) {
            java.lang.String r0 = "Phone"
            if (r2 != 0) goto L5
            goto L17
        L5:
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L17
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> L17
            int r2 = r2.screenLayout     // Catch: java.lang.Throwable -> L17
            r2 = r2 & 15
            r1 = 3
            if (r2 < r1) goto L17
            java.lang.String r2 = "Tablet"
            return r2
        L17:
            return r0
    }

    public static java.lang.String getDisplayResolution(android.content.Context r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "window"
            java.lang.Object r3 = r3.getSystemService(r2)     // Catch: java.lang.Throwable -> L3c
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L3c
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Throwable -> L3c
            r3.getMetrics(r1)     // Catch: java.lang.Throwable -> L3c
            int r3 = r1.widthPixels     // Catch: java.lang.Throwable -> L3c
            int r1 = r1.heightPixels     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L3c
            r2.append(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "*"
            r2.append(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L3c
            r2.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L3c
            return r3
        L3c:
            return r0
    }

    private static java.lang.String getEmuiVersion(java.util.Properties r2) {
            r0 = 0
            java.lang.String r1 = "ro.build.hw_emui_api_level"
            java.lang.String r2 = r2.getProperty(r1, r0)     // Catch: java.lang.Exception -> L8
            return r2
        L8:
            return r0
    }

    private static java.lang.String getFlymeVersion(java.util.Properties r1) {
            java.lang.String r0 = "ro.build.display.id"
            java.lang.String r1 = r1.getProperty(r0)     // Catch: java.lang.Throwable -> L20
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "flyme os"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L20
            java.lang.String r0 = " "
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Throwable -> L20
            r0 = 2
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L20
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static java.lang.String[] getGPU(javax.microedition.khronos.opengles.GL10 r2) {
            r0 = 7936(0x1f00, float:1.1121E-41)
            java.lang.String r0 = r2.glGetString(r0)     // Catch: java.lang.Throwable -> L11
            r1 = 7937(0x1f01, float:1.1122E-41)
            java.lang.String r2 = r2.glGetString(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r2 = new java.lang.String[]{r0, r2}     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L1d
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG
            java.lang.String r1 = "Could not read gpu infor:"
            com.umeng.commonsdk.statistics.common.MLog.e(r0, r1, r2)
        L1d:
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            return r2
    }

    public static android.app.Activity getGlobleActivity(android.content.Context r5) {
            r5 = 0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "currentActivityThread"
            java.lang.reflect.Method r1 = r0.getMethod(r1, r5)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r1.invoke(r5, r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "mActivities"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L57
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L57
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L57
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L57
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L57
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "paused"
            java.lang.reflect.Field r4 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L57
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> L57
            boolean r4 = r4.getBoolean(r1)     // Catch: java.lang.Throwable -> L57
            if (r4 != 0) goto L29
            java.lang.String r4 = "activity"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L57
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L57
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Throwable -> L57
            r5 = r1
            goto L29
        L57:
            return r5
    }

    private static java.lang.String getIMEI(android.content.Context r5) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            return r5
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid
            java.lang.String r1 = ""
            if (r0 == 0) goto L12
            return r1
        L12:
            java.lang.String r0 = "header_device_id_imei"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L69
            if (r5 != 0) goto L1d
            return r1
        L1d:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L69
            r2 = 1
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r5 = checkPermission(r5, r3)     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L56
            java.lang.String r1 = r0.getDeviceId()     // Catch: java.lang.Throwable -> L54
            boolean r5 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L56
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "getDeviceId, IMEI: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L54
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L54
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L54
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Throwable -> L54
            com.umeng.commonsdk.statistics.common.MLog.i(r5, r3)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L59
        L56:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid = r2
            goto L69
        L59:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L56
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.w(r0, r3, r5)     // Catch: java.lang.Throwable -> L65
            goto L56
        L65:
            r5 = move-exception
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid = r2
            throw r5
        L69:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImei = r1
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            return r5
    }

    public static java.lang.String getIdfa(android.content.Context r2) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sIDFA
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.sIDFA
            return r2
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadIDFA
            if (r0 == 0) goto L12
            java.lang.String r2 = ""
            return r2
        L12:
            r0 = 1
            java.lang.String r1 = "header_tracking_idfa"
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r1)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L21
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.a.a(r2)     // Catch: java.lang.Throwable -> L21
            com.umeng.commonsdk.statistics.common.DeviceConfig.sIDFA = r2     // Catch: java.lang.Throwable -> L21
        L21:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadIDFA = r0
            java.lang.String r2 = com.umeng.commonsdk.statistics.common.DeviceConfig.sIDFA
            return r2
    }

    public static java.lang.String getImei(android.content.Context r4) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            return r4
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid
            r1 = 0
            if (r0 == 0) goto L11
            return r1
        L11:
            r0 = 1
            java.lang.String r2 = "header_device_id_imei"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            if (r4 == 0) goto L35
            java.lang.String r2 = "phone"
            java.lang.Object r2 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L33
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r4 = checkPermission(r4, r3)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L35
            java.lang.String r1 = r2.getDeviceId()     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r4 = move-exception
            goto L38
        L35:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid = r0
            goto L44
        L38:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L35
            java.lang.String r2 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.w(r2, r4)     // Catch: java.lang.Throwable -> L42
            goto L35
        L42:
            r4 = move-exception
            goto L47
        L44:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImei = r1
            return r1
        L47:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid = r0
            throw r4
    }

    public static java.lang.String getImeiNew(android.content.Context r4) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImei
            return r4
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid
            r1 = 0
            if (r0 == 0) goto L11
            return r1
        L11:
            r0 = 1
            java.lang.String r2 = "header_device_id_imei"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L59
            if (r4 == 0) goto L59
            java.lang.String r2 = "phone"
            java.lang.Object r2 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L53
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L59
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r4 = checkPermission(r4, r3)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L59
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L53
            r3 = 26
            if (r4 < r3) goto L55
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "getImei"
            java.lang.reflect.Method r4 = r4.getMethod(r3, r1)     // Catch: java.lang.Throwable -> L48
            r4.setAccessible(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r4.invoke(r2, r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L48
            r1 = r4
        L48:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L59
            java.lang.String r1 = r2.getDeviceId()     // Catch: java.lang.Throwable -> L53
            goto L59
        L53:
            r4 = move-exception
            goto L5c
        L55:
            java.lang.String r1 = r2.getDeviceId()     // Catch: java.lang.Throwable -> L53
        L59:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid = r0
            goto L68
        L5c:
            boolean r2 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L59
            java.lang.String r2 = "No IMEI."
            com.umeng.commonsdk.statistics.common.MLog.w(r2, r4)     // Catch: java.lang.Throwable -> L66
            goto L59
        L66:
            r4 = move-exception
            goto L6b
        L68:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImei = r1
            return r1
        L6b:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid = r0
            throw r4
    }

    public static java.lang.String getImsi(android.content.Context r4) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImsi
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImsi
            return r4
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImsi
            r1 = 0
            if (r0 == 0) goto L11
            return r1
        L11:
            if (r4 != 0) goto L14
            return r1
        L14:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r2 = "internal_imsi"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)
            if (r2 == 0) goto L35
            r2 = 1
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            boolean r4 = checkPermission(r4, r3)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L33
            if (r0 == 0) goto L33
            java.lang.String r1 = r0.getSubscriberId()     // Catch: java.lang.Throwable -> L33
        L33:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImsi = r2
        L35:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sImsi = r1
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sImsi
            return r4
    }

    private static java.util.Locale getLocale(android.content.Context r3) {
            if (r3 != 0) goto L7
            java.util.Locale r3 = java.util.Locale.getDefault()
            return r3
        L7:
            android.content.res.Configuration r0 = new android.content.res.Configuration     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            r0.setToDefaults()     // Catch: java.lang.Throwable -> L19
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L19
            android.provider.Settings.System.getConfiguration(r3, r0)     // Catch: java.lang.Throwable -> L19
            java.util.Locale r3 = r0.locale     // Catch: java.lang.Throwable -> L19
            goto L27
        L19:
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "fail to read user config locale"
            r2 = 0
            r0[r2] = r1
            com.umeng.commonsdk.statistics.common.MLog.e(r3, r0)
            r3 = 0
        L27:
            if (r3 != 0) goto L2d
            java.util.Locale r3 = java.util.Locale.getDefault()
        L2d:
            return r3
    }

    public static java.lang.String[] getLocaleInfo(android.content.Context r5) {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "Unknown"
            r0[r1] = r2
            r3 = 1
            r0[r3] = r2
            if (r5 != 0) goto Le
            goto L37
        Le:
            java.util.Locale r5 = getLocale(r5)     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L23
            java.lang.String r4 = r5.getCountry()     // Catch: java.lang.Throwable -> L21
            r0[r1] = r4     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r5.getLanguage()     // Catch: java.lang.Throwable -> L21
            r0[r3] = r5     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r5 = move-exception
            goto L38
        L23:
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L21
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L2d
            r0[r1] = r2     // Catch: java.lang.Throwable -> L21
        L2d:
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L21
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L37
            r0[r3] = r2     // Catch: java.lang.Throwable -> L21
        L37:
            return r0
        L38:
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG
            java.lang.String r2 = "error in getLocaleInfo"
            com.umeng.commonsdk.statistics.common.MLog.e(r1, r2, r5)
            return r0
    }

    @android.annotation.SuppressLint({"DefaultLocale"})
    public static java.lang.String getMCCMNC(android.content.Context r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = getImsi(r5)     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto Lb
            return r0
        Lb:
            android.content.res.Resources r1 = r5.getResources()     // Catch: java.lang.Throwable -> L4d
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.mcc     // Catch: java.lang.Throwable -> L4d
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L4d
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch: java.lang.Throwable -> L4d
            int r5 = r5.mnc     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4d
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L4d
            r3 = 10
            if (r5 >= r3) goto L39
            java.lang.String r2 = "%02d"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L4d
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4d
            r4 = 0
            r3[r4] = r5     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L4d
        L39:
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L4d
            r5.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L4d
            r5.append(r1)     // Catch: java.lang.Throwable -> L4d
            r5.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4d
            return r5
        L4d:
            return r0
    }

    public static java.lang.String getMac(android.content.Context r3) {
            java.lang.String r0 = "header_device_id_mac"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L42
            if (r3 != 0) goto Ld
            goto L42
        Ld:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L42
            r2 = 23
            if (r0 >= r2) goto L18
            java.lang.String r3 = getMacBySystemInterface(r3)     // Catch: java.lang.Throwable -> L42
            return r3
        L18:
            if (r0 != r2) goto L33
            java.lang.String r1 = getMacByJavaAPI()     // Catch: java.lang.Throwable -> L42
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L32
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.CHECK_DEVICE     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L2d
            java.lang.String r3 = getMacShell()     // Catch: java.lang.Throwable -> L42
            return r3
        L2d:
            java.lang.String r3 = getMacBySystemInterface(r3)     // Catch: java.lang.Throwable -> L42
            return r3
        L32:
            return r1
        L33:
            java.lang.String r1 = getMacByJavaAPI()     // Catch: java.lang.Throwable -> L42
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L42
            java.lang.String r3 = getMacBySystemInterface(r3)     // Catch: java.lang.Throwable -> L42
            return r3
        L42:
            return r1
    }

    @android.annotation.TargetApi(9)
    private static java.lang.String getMacByJavaAPI() {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac
            return r0
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadMac
            java.lang.String r1 = ""
            if (r0 == 0) goto L12
            return r1
        L12:
            r0 = 1
            java.lang.String r2 = "header_device_id_mac"
            boolean r2 = com.umeng.commonsdk.config.FieldManager.allow(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L8b
            java.util.Enumeration r2 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L8b
        L1f:
            boolean r3 = r2.hasMoreElements()     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r2.nextElement()     // Catch: java.lang.Throwable -> L8b
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "wlan0"
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L8b
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L8b
            if (r4 != 0) goto L43
            java.lang.String r4 = "eth0"
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L8b
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L1f
        L43:
            byte[] r3 = r3.getHardwareAddress()     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L4c
            int r4 = r3.length     // Catch: java.lang.Throwable -> L8b
            if (r4 != 0) goto L4e
        L4c:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac = r1     // Catch: java.lang.Throwable -> L8b
        L4e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r4.<init>()     // Catch: java.lang.Throwable -> L8b
            int r5 = r3.length     // Catch: java.lang.Throwable -> L8b
            r6 = 0
            r7 = 0
        L56:
            if (r7 >= r5) goto L6e
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L8b
            java.lang.String r9 = "%02X:"
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)     // Catch: java.lang.Throwable -> L8b
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L8b
            r10[r6] = r8     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = java.lang.String.format(r9, r10)     // Catch: java.lang.Throwable -> L8b
            r4.append(r8)     // Catch: java.lang.Throwable -> L8b
            int r7 = r7 + 1
            goto L56
        L6e:
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L8b
            if (r3 <= 0) goto L7c
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L8b
            int r3 = r3 - r0
            r4.deleteCharAt(r3)     // Catch: java.lang.Throwable -> L8b
        L7c:
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L8b
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = r3.toLowerCase(r4)     // Catch: java.lang.Throwable -> L8b
            com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac = r3     // Catch: java.lang.Throwable -> L8b
            goto L1f
        L8b:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadMac = r0
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac
            return r0
    }

    private static java.lang.String getMacBySystemInterface(android.content.Context r5) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac
            return r5
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadMac
            java.lang.String r1 = ""
            if (r0 == 0) goto L12
            return r1
        L12:
            if (r5 != 0) goto L15
            return r1
        L15:
            r0 = 0
            r2 = 1
            java.lang.String r3 = "header_device_id_mac"
            boolean r3 = com.umeng.commonsdk.config.FieldManager.allow(r3)     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L52
            java.lang.String r3 = "wifi"
            java.lang.Object r3 = r5.getSystemService(r3)     // Catch: java.lang.Throwable -> L3c
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "android.permission.ACCESS_WIFI_STATE"
            boolean r5 = checkPermission(r5, r4)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L41
            if (r3 == 0) goto L3e
            android.net.wifi.WifiInfo r5 = r3.getConnectionInfo()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = r5.getMacAddress()     // Catch: java.lang.Throwable -> L3c
            com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac = r5     // Catch: java.lang.Throwable -> L3c
            goto L52
        L3c:
            r5 = move-exception
            goto L55
        L3e:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac = r1     // Catch: java.lang.Throwable -> L3c
            goto L52
        L41:
            boolean r5 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE"
            r3[r0] = r4     // Catch: java.lang.Throwable -> L3c
            com.umeng.commonsdk.statistics.common.MLog.w(r5, r3)     // Catch: java.lang.Throwable -> L3c
        L50:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac = r1     // Catch: java.lang.Throwable -> L3c
        L52:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadMac = r2
            goto L7a
        L55:
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L52
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r3.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = "Could not get mac address."
            r3.append(r4)     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L78
            r3.append(r5)     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L78
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L78
            r3[r0] = r5     // Catch: java.lang.Throwable -> L78
            com.umeng.commonsdk.statistics.common.MLog.w(r1, r3)     // Catch: java.lang.Throwable -> L78
            goto L52
        L78:
            r5 = move-exception
            goto L7d
        L7a:
            java.lang.String r5 = com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac
            return r5
        L7d:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadMac = r2
            throw r5
    }

    private static java.lang.String getMacShell() {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac
            return r0
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadMac
            if (r0 == 0) goto L12
            java.lang.String r0 = ""
            return r0
        L12:
            r0 = 1
            java.lang.String r1 = "header_device_id_mac"
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r1)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L43
            java.lang.String r1 = "/sys/class/net/wlan0/address"
            java.lang.String r2 = "/sys/class/net/eth0/address"
            java.lang.String r3 = "/sys/devices/virtual/net/wlan0/address"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L43
            r2 = 0
        L26:
            r3 = 3
            if (r2 >= r3) goto L43
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = reaMac(r3)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L40
            com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac = r3     // Catch: java.lang.Throwable -> L34
            goto L40
        L34:
            r3 = move-exception
            boolean r4 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L40
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "open file  Failed"
            com.umeng.commonsdk.statistics.common.MLog.e(r4, r5, r3)     // Catch: java.lang.Throwable -> L43
        L40:
            int r2 = r2 + 1
            goto L26
        L43:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadMac = r0
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sWifiMac
            return r0
    }

    public static java.lang.String getMeid(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r3.getSystemService(r1)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.String r1 = "internal_meid"
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r1)
            if (r1 == 0) goto L39
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = checkPermission(r3, r1)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L39
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L39
            r2 = 26
            if (r1 >= r2) goto L2a
            java.lang.String r0 = getIMEI(r3)     // Catch: java.lang.Throwable -> L39
            goto L39
        L2a:
            java.lang.String r0 = meid(r3)     // Catch: java.lang.Throwable -> L39
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L39
            java.lang.String r3 = getIMEI(r3)     // Catch: java.lang.Throwable -> L39
            r0 = r3
        L39:
            return r0
    }

    public static java.lang.String[] getNetworkAccessMode(android.content.Context r5) {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = ""
            r0[r1] = r2
            r3 = 1
            r0[r3] = r2
            if (r5 != 0) goto Le
            goto L51
        Le:
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r4 = checkPermission(r5, r4)     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L19
            r0[r1] = r2     // Catch: java.lang.Throwable -> L51
            return r0
        L19:
            java.lang.String r4 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r4)     // Catch: java.lang.Throwable -> L51
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L26
            r0[r1] = r2     // Catch: java.lang.Throwable -> L51
            return r0
        L26:
            android.net.NetworkInfo r2 = r5.getNetworkInfo(r3)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L39
            android.net.NetworkInfo$State r2 = r2.getState()     // Catch: java.lang.Throwable -> L51
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Throwable -> L51
            if (r2 != r4) goto L39
            java.lang.String r5 = "Wi-Fi"
            r0[r1] = r5     // Catch: java.lang.Throwable -> L51
            return r0
        L39:
            android.net.NetworkInfo r5 = r5.getNetworkInfo(r1)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L51
            android.net.NetworkInfo$State r2 = r5.getState()     // Catch: java.lang.Throwable -> L51
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTED     // Catch: java.lang.Throwable -> L51
            if (r2 != r4) goto L51
            java.lang.String r2 = "2G/3G"
            r0[r1] = r2     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r5.getSubtypeName()     // Catch: java.lang.Throwable -> L51
            r0[r3] = r5     // Catch: java.lang.Throwable -> L51
        L51:
            return r0
    }

    public static java.lang.String getNetworkOperatorName(android.content.Context r3) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOperatorName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOperatorName
            return r3
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOperatorName
            java.lang.String r1 = ""
            if (r0 == 0) goto L12
            return r1
        L12:
            if (r3 != 0) goto L15
            return r1
        L15:
            r0 = 1
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L2e
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r3 = checkPermission(r3, r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L2e
            if (r1 == 0) goto L2e
            java.lang.String r3 = r1.getNetworkOperatorName()     // Catch: java.lang.Throwable -> L2e
            com.umeng.commonsdk.statistics.common.DeviceConfig.sOperatorName = r3     // Catch: java.lang.Throwable -> L2e
        L2e:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOperatorName = r0
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOperatorName
            return r3
    }

    public static int getNetworkType(android.content.Context r2) {
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.Exception -> L17
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L17
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r2 = checkPermission(r2, r1)     // Catch: java.lang.Exception -> L17
            if (r2 == 0) goto L15
            int r2 = r0.getNetworkType()     // Catch: java.lang.Exception -> L17
            return r2
        L15:
            r2 = 0
            return r2
        L17:
            r2 = -100
            return r2
    }

    public static java.lang.String getOaid(android.content.Context r4) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOAID
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOAID
            return r4
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOAID
            java.lang.String r1 = ""
            if (r0 == 0) goto L12
            return r1
        L12:
            java.lang.String r0 = "header_device_oaid"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L2e
            r0 = 1
            java.lang.String r2 = com.umeng.commonsdk.statistics.idtracking.h.a     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L2c
            java.lang.String r2 = "key_umeng_sp_oaid"
            java.lang.String r4 = r4.getString(r2, r1)     // Catch: java.lang.Throwable -> L2c
            com.umeng.commonsdk.statistics.common.DeviceConfig.sOAID = r4     // Catch: java.lang.Throwable -> L2c
        L2c:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOAID = r0
        L2e:
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOAID
            return r4
    }

    public static java.lang.String getPackageName(android.content.Context r1) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sAppPkgName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.sAppPkgName
            return r1
        Lb:
            if (r1 != 0) goto Lf
            r1 = 0
            return r1
        Lf:
            java.lang.String r1 = r1.getPackageName()
            com.umeng.commonsdk.statistics.common.DeviceConfig.sAppPkgName = r1
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.sAppPkgName
            return r1
    }

    public static java.lang.String getRegisteredOperator(android.content.Context r3) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOperator
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOperator
            return r3
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOperator
            r1 = 0
            if (r0 == 0) goto L11
            return r1
        L11:
            if (r3 != 0) goto L14
            return r1
        L14:
            r0 = 1
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L2d
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r3 = checkPermission(r3, r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2d
            if (r1 == 0) goto L2d
            java.lang.String r3 = r1.getNetworkOperator()     // Catch: java.lang.Throwable -> L2d
            com.umeng.commonsdk.statistics.common.DeviceConfig.sOperator = r3     // Catch: java.lang.Throwable -> L2d
        L2d:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadOperator = r0
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sOperator
            return r3
    }

    public static int[] getResolutionArray(android.content.Context r9) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            r1 = 2
            int[] r1 = new int[r1]
            java.lang.String r2 = "window"
            java.lang.Object r9 = r9.getSystemService(r2)
            android.view.WindowManager r9 = (android.view.WindowManager) r9
            if (r9 == 0) goto L4b
            android.view.Display r9 = r9.getDefaultDisplay()
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
            r2.<init>()
            java.lang.String r3 = "android.view.Display"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "getRealMetrics"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L4b
            java.lang.Class<android.util.DisplayMetrics> r7 = android.util.DisplayMetrics.class
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4b
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4b
            r4[r8] = r2     // Catch: java.lang.Throwable -> L4b
            r3.invoke(r9, r4)     // Catch: java.lang.Throwable -> L4b
            int r9 = r2.widthPixels     // Catch: java.lang.Throwable -> L4b
            int r2 = r2.heightPixels     // Catch: java.lang.Throwable -> L4b
            if (r9 <= r2) goto L42
            r1[r8] = r2     // Catch: java.lang.Throwable -> L4b
            r1[r5] = r9     // Catch: java.lang.Throwable -> L4b
            goto L46
        L42:
            r1[r8] = r9     // Catch: java.lang.Throwable -> L4b
            r1[r5] = r2     // Catch: java.lang.Throwable -> L4b
        L46:
            r1[r8] = r9     // Catch: java.lang.Throwable -> L4b
            r1[r5] = r2     // Catch: java.lang.Throwable -> L4b
            return r1
        L4b:
            return r0
    }

    public static java.lang.String getSecondSimIMEi(android.content.Context r0) {
            r0 = 0
            return r0
    }

    public static java.lang.String getSerial() {
            java.lang.String r0 = getSerialNo()
            return r0
    }

    @android.annotation.TargetApi(9)
    private static java.lang.String getSerialNo() {
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getSid(android.content.Context r1) {
            com.umeng.analytics.pro.y r0 = com.umeng.analytics.pro.y.a()
            java.lang.String r1 = r0.d(r1)
            return r1
    }

    public static java.lang.String getSimICCID(android.content.Context r3) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumber
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumber
            return r3
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadSimSerialNumber
            r1 = 0
            if (r0 == 0) goto L11
            return r1
        L11:
            java.lang.String r0 = "inner_iccid"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L39
            r0 = 1
            if (r3 == 0) goto L37
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.checkPermission(r3, r2)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L37
            java.lang.String r2 = "phone"
            java.lang.Object r3 = r3.getSystemService(r2)     // Catch: java.lang.Throwable -> L37
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L31
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadSimSerialNumber = r0
            return r1
        L31:
            java.lang.String r3 = r3.getSimSerialNumber()     // Catch: java.lang.Throwable -> L37
            com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumber = r3     // Catch: java.lang.Throwable -> L37
        L37:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadSimSerialNumber = r0
        L39:
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.sSimSerialNumber
            return r3
    }

    public static java.lang.String getSubOSName(android.content.Context r2) {
            java.util.Properties r2 = getBuildProp()
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = r2.getProperty(r0)     // Catch: java.lang.Throwable -> L33
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L30
            boolean r1 = isFlyMe()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L19
            java.lang.String r2 = "Flyme"
            return r2
        L19:
            boolean r1 = isEmui(r2)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L22
            java.lang.String r2 = "Emui"
            return r2
        L22:
            java.lang.String r2 = getYunOSVersion(r2)     // Catch: java.lang.Throwable -> L33
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L2f
            java.lang.String r2 = "YunOS"
            return r2
        L2f:
            return r0
        L30:
            java.lang.String r2 = "MIUI"
            return r2
        L33:
            r2 = 0
            return r2
    }

    public static java.lang.String getSubOSVersion(android.content.Context r2) {
            java.util.Properties r2 = getBuildProp()
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = r2.getProperty(r0)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2c
            boolean r1 = isFlyMe()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L1b
            java.lang.String r0 = getFlymeVersion(r2)     // Catch: java.lang.Throwable -> L2c
            goto L2c
        L1b:
            boolean r1 = isEmui(r2)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L26
            java.lang.String r0 = getEmuiVersion(r2)     // Catch: java.lang.Throwable -> L2c
            goto L2c
        L26:
            java.lang.String r0 = getYunOSVersion(r2)     // Catch: java.lang.Throwable -> L2c
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    public static int getTimeZone(android.content.Context r3) {
            r0 = 8
            if (r3 != 0) goto L5
            return r0
        L5:
            java.util.Locale r3 = getLocale(r3)     // Catch: java.lang.Throwable -> L1c
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L24
            java.util.TimeZone r3 = r3.getTimeZone()     // Catch: java.lang.Throwable -> L1c
            int r3 = r3.getRawOffset()     // Catch: java.lang.Throwable -> L1c
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            int r3 = r3 / r1
            return r3
        L1c:
            r3 = move-exception
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.LOG_TAG
            java.lang.String r2 = "error in getTimeZone"
            com.umeng.commonsdk.statistics.common.MLog.i(r1, r2, r3)
        L24:
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

    public static boolean hasOpsPermission(android.content.Context r3) {
            java.lang.String r0 = "check_pus_permission"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L22
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "android:get_usage_stats"
            int r2 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = getPackageName(r3)     // Catch: java.lang.Throwable -> L22
            int r3 = r0.checkOpNoThrow(r1, r2, r3)     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L22
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    public static boolean hasRequestPermission(android.content.Context r4, java.lang.String r5) {
            java.lang.String r0 = "check_pus_permission"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            r1 = 0
            if (r0 == 0) goto L2a
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L2a
            r2 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String[] r4 = r4.requestedPermissions     // Catch: java.lang.Throwable -> L2a
            int r0 = r4.length     // Catch: java.lang.Throwable -> L2a
            r2 = 0
        L1b:
            if (r2 >= r0) goto L2a
            r3 = r4[r2]     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r3.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L27
            r4 = 1
            return r4
        L27:
            int r2 = r2 + 1
            goto L1b
        L2a:
            return r1
    }

    public static boolean isChineseAera(android.content.Context r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "country"
            java.lang.String r2 = ""
            java.lang.String r1 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r5, r1, r2)     // Catch: java.lang.Throwable -> L5e
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "cn"
            r4 = 1
            if (r2 != 0) goto L1d
            boolean r5 = r1.equals(r3)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L1c
            return r4
        L1c:
            return r0
        L1d:
            java.lang.String r1 = getImsi(r5)     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L36
            java.lang.String[] r5 = getLocaleInfo(r5)     // Catch: java.lang.Throwable -> L5e
            r5 = r5[r0]     // Catch: java.lang.Throwable -> L5e
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L5e
            boolean r5 = r5.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L5e
            return r4
        L36:
            android.content.res.Resources r1 = r5.getResources()     // Catch: java.lang.Throwable -> L5e
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L5e
            int r1 = r1.mcc     // Catch: java.lang.Throwable -> L5e
            r2 = 460(0x1cc, float:6.45E-43)
            if (r1 == r2) goto L5d
            r2 = 461(0x1cd, float:6.46E-43)
            if (r1 != r2) goto L49
            goto L5d
        L49:
            if (r1 != 0) goto L5e
            java.lang.String[] r5 = getLocaleInfo(r5)     // Catch: java.lang.Throwable -> L5e
            r5 = r5[r0]     // Catch: java.lang.Throwable -> L5e
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L5e
            boolean r5 = r5.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L5e
        L5d:
            return r4
        L5e:
            return r0
    }

    private static boolean isEmui(java.util.Properties r3) {
            r0 = 0
            java.lang.String r1 = "ro.build.hw_emui_api_level"
            r2 = 0
            java.lang.String r3 = r3.getProperty(r1, r2)     // Catch: java.lang.Exception -> Lc
            if (r3 == 0) goto Lc
            r3 = 1
            return r3
        Lc:
            return r0
    }

    private static boolean isFlyMe() {
            java.lang.Class<android.os.Build> r0 = android.os.Build.class
            java.lang.String r1 = "hasSmartBar"
            r2 = 0
            r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static boolean isHarmony(android.content.Context r4) {
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "config_os_brand"
            java.lang.String r2 = "string"
            java.lang.String r3 = "android"
            int r0 = r0.getIdentifier(r1, r2, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r4 = r4.getString(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "harmony"
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L19
            return r4
        L19:
            r4 = 0
            return r4
    }

    public static boolean isOnline(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = checkPermission(r2, r1)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L21
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L21
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L21
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L21
            boolean r2 = r2.isConnectedOrConnecting()     // Catch: java.lang.Throwable -> L21
            return r2
        L21:
            return r0
    }

    public static boolean isSystemApp(android.content.Context r3) {
            java.lang.String r0 = "check_system_app"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L21
            com.umeng.commonsdk.utils.b r0 = com.umeng.commonsdk.utils.b.a()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = getPackageName(r3)     // Catch: java.lang.Throwable -> L21
            r2 = 1048576(0x100000, float:1.469368E-39)
            android.content.pm.PackageInfo r3 = r0.a(r3, r1, r2)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L21
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Throwable -> L21
            int r3 = r3.flags     // Catch: java.lang.Throwable -> L21
            r0 = 1
            r3 = r3 & r0
            if (r3 == 0) goto L21
            return r0
        L21:
            r3 = 0
            return r3
    }

    public static boolean isWiFiAvailable(android.content.Context r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.lang.String[] r1 = getNetworkAccessMode(r1)
            r1 = r1[r0]
            java.lang.String r0 = "Wi-Fi"
            boolean r1 = r0.equals(r1)
            return r1
    }

    private static java.lang.String meid(android.content.Context r4) {
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid
            return r4
        Lb:
            boolean r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid
            r1 = 0
            if (r0 == 0) goto L11
            return r1
        L11:
            if (r4 != 0) goto L14
            return r1
        L14:
            r4 = 1
            java.lang.String r0 = "android.telephony.TelephonyManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "getMeid"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L31
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2f
            r1 = r0
            goto L31
        L2f:
            r0 = move-exception
            goto L34
        L31:
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid = r4
            goto L4d
        L34:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "meid:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L52
            r2.append(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L52
            com.umeng.commonsdk.statistics.common.ULog.e(r0)     // Catch: java.lang.Throwable -> L52
            goto L31
        L4d:
            com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid = r1
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.DeviceConfig.sMeid
            return r4
        L52:
            r0 = move-exception
            com.umeng.commonsdk.statistics.common.DeviceConfig.hasReadImeiOrMeid = r4
            throw r0
    }

    private static java.lang.String reaMac(java.lang.String r3) {
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L27
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L27
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1a
            r2 = 1024(0x400, float:1.435E-42)
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L18
            r1.close()     // Catch: java.lang.Throwable -> L14
        L14:
            r3.close()     // Catch: java.lang.Throwable -> L27
            goto L27
        L18:
            r2 = move-exception
            goto L1c
        L1a:
            r2 = move-exception
            r3 = r0
        L1c:
            r1.close()     // Catch: java.lang.Throwable -> L20
            goto L21
        L20:
        L21:
            if (r3 == 0) goto L26
            r3.close()     // Catch: java.lang.Throwable -> L26
        L26:
            throw r2     // Catch: java.lang.Throwable -> L27
        L27:
            return r0
    }

    private static int reflectMetrics(java.lang.Object r1, java.lang.String r2) {
            java.lang.Class<android.util.DisplayMetrics> r0 = android.util.DisplayMetrics.class
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> Lf
            int r1 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = -1
            return r1
    }
}
