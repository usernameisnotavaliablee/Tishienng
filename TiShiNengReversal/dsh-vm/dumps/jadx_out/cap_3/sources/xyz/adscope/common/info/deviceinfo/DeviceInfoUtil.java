package xyz.adscope.common.info.deviceinfo;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DeviceInfoUtil {
    private static java.lang.String a;
    private static java.lang.String b;




    public DeviceInfoUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.a
            return r0
    }

    private static java.lang.String a(android.content.Context r2) {
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> Lf
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> Lf
            java.util.Locale r2 = r2.locale     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.getCountry()     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            java.lang.String r2 = ""
            return r2
    }

    static /* synthetic */ java.lang.String a(java.lang.String r0) {
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.a = r0
            return r0
    }

    static /* synthetic */ java.lang.String b() {
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.b
            return r0
    }

    static /* synthetic */ java.lang.String b(java.lang.String r0) {
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.b = r0
            return r0
    }

    private static void b(android.content.Context r2) {
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil$3 r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoUtil$3     // Catch: java.lang.Throwable -> L9
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.getGAID(r2, r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            return
    }

    private static java.lang.String c() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3f
            r0.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = getBrand()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = getModel()     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = getHardDisk()     // Catch: java.lang.Exception -> L3f
            java.lang.String r4 = getOsVersion()     // Catch: java.lang.Exception -> L3f
            java.lang.String r5 = getFileMark()     // Catch: java.lang.Exception -> L3f
            java.lang.String r6 = getDeviceUpdateMark()     // Catch: java.lang.Exception -> L3f
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L3f
            r0.append(r1)     // Catch: java.lang.Exception -> L3f
            r0.append(r2)     // Catch: java.lang.Exception -> L3f
            r0.append(r3)     // Catch: java.lang.Exception -> L3f
            r0.append(r4)     // Catch: java.lang.Exception -> L3f
            r0.append(r5)     // Catch: java.lang.Exception -> L3f
            r0.append(r6)     // Catch: java.lang.Exception -> L3f
            r0.append(r7)     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = xyz.adscope.common.tool.security.MD5Util.md5(r0)     // Catch: java.lang.Exception -> L3f
            return r0
        L3f:
            java.lang.String r0 = ""
            return r0
    }

    private static void c(android.content.Context r2) {
            xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper r0 = new xyz.adscope.common.v2.dev.oaid.cn.oa.helpers.DevicesIDsHelper     // Catch: java.lang.Throwable -> Ld
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil$2 r1 = new xyz.adscope.common.info.deviceinfo.DeviceInfoUtil$2     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
            r0.getOAID(r2)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    private static void d(android.content.Context r2) {
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L1c
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L1c
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceIdentifier.register(r0)     // Catch: java.lang.Throwable -> L1c
            boolean r0 = xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.supportedOAID(r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1b
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil$1 r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoUtil$1     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            xyz.adscope.common.v2.dev.oaid.sm.oaid.DeviceID.getOAID(r2, r0)     // Catch: java.lang.Throwable -> L1c
        L1b:
            return
        L1c:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            return
    }

    public static int dip2px(android.content.Context r2, float r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L15
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L15
            float r2 = r2.density     // Catch: java.lang.Throwable -> L15
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            return r2
        L15:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "e : "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r3, r2)
            return r0
    }

    private static boolean e(android.content.Context r2) {
            r0 = 0
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L12
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> L12
            int r2 = r2.screenLayout     // Catch: java.lang.Throwable -> L12
            r2 = r2 & 15
            r1 = 3
            if (r2 < r1) goto L12
            r2 = 1
            return r2
        L12:
            return r0
    }

    private static /* synthetic */ void f(android.content.Context r0) {
            d(r0)
            c(r0)
            return
    }

    private static /* synthetic */ void g(android.content.Context r0) {
            b(r0)
            return
    }

    public static java.lang.String getAndroidVersion() {
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L14
            r1.append(r2)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "e : "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r2, r1)
            return r0
    }

    public static java.lang.String getBrand() {
            java.lang.String r0 = android.os.Build.BRAND
            return r0
    }

    public static java.lang.String getCarrier(android.content.Context r2) {
            java.lang.String r0 = "phone"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L5c
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L73
            int r0 = r2.getSimState()     // Catch: java.lang.Throwable -> L5c
            r1 = 5
            if (r1 != r0) goto L73
            java.lang.String r2 = r2.getSimOperator()     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L55
            java.lang.String r0 = "46000"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L4e
            java.lang.String r0 = "46002"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L4e
            java.lang.String r0 = "46007"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L30
            goto L4e
        L30:
            java.lang.String r0 = "46001"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L3f
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_CUCC     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r2.getValue()     // Catch: java.lang.Throwable -> L5c
            return r2
        L3f:
            java.lang.String r0 = "46003"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L73
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_CTCC     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r2.getValue()     // Catch: java.lang.Throwable -> L5c
            return r2
        L4e:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_CMCC     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r2.getValue()     // Catch: java.lang.Throwable -> L5c
            return r2
        L55:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_UNKNOWN     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r2.getValue()     // Catch: java.lang.Throwable -> L5c
            return r2
        L5c:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
        L73:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_UNKNOWN
            java.lang.String r2 = r2.getValue()
            return r2
    }

    public static int getConnectType(android.content.Context r2) {
            if (r2 != 0) goto L9
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_UNKNOWN     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L9:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L8f
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L8f
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L20
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L8f
            goto L21
        L20:
            r2 = 0
        L21:
            if (r2 != 0) goto L2a
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_UNKNOWN     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L2a:
            int r0 = r2.getType()     // Catch: java.lang.Throwable -> L8f
            r1 = 1
            if (r0 != r1) goto L38
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_WIFI     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L38:
            if (r0 != 0) goto L88
            int r0 = r2.getSubtype()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = r2.getSubtypeName()     // Catch: java.lang.Throwable -> L8f
            switch(r0) {
                case 1: goto L81;
                case 2: goto L81;
                case 3: goto L7a;
                case 4: goto L81;
                case 5: goto L7a;
                case 6: goto L7a;
                case 7: goto L81;
                case 8: goto L7a;
                case 9: goto L7a;
                case 10: goto L7a;
                case 11: goto L81;
                case 12: goto L7a;
                case 13: goto L73;
                case 14: goto L7a;
                case 15: goto L7a;
                case 16: goto L81;
                case 17: goto L7a;
                case 18: goto L73;
                case 19: goto L45;
                case 20: goto L6c;
                default: goto L45;
            }     // Catch: java.lang.Throwable -> L8f
        L45:
            java.lang.String r0 = "TD-SCDMA"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L65
            java.lang.String r0 = "WCDMA"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L65
            java.lang.String r0 = "CDMA2000"
            boolean r2 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L5e
            goto L65
        L5e:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_UNKNOWN     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L65:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_3G     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L6c:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_5G     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L73:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_4G     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L7a:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_3G     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L81:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_2G     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L88:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_UNKNOWN     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.getCode()     // Catch: java.lang.Throwable -> L8f
            return r2
        L8f:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_UNKNOWN
            int r2 = r2.getCode()
            return r2
    }

    public static java.lang.String getCountry(android.content.Context r0) {
            java.lang.String r0 = a(r0)
            return r0
    }

    public static int getCountryCN(android.content.Context r2) {
            java.lang.String r2 = a(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Le
            java.lang.String r2 = r2.toUpperCase()
        Le:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE.COUNTRY_CHINA_TYPE
            java.lang.String r1 = r0.getCountry()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1f
            int r2 = r0.getCode()
            return r2
        L1f:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE r2 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE.COUNTRY_OTHER_TYPE
            int r2 = r2.getCode()
            return r2
    }

    public static float getDensity(android.content.Context r2) {
            if (r2 == 0) goto L30
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L19
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch: java.lang.Throwable -> L19
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch: java.lang.Throwable -> L19
            r2.getMetrics(r0)     // Catch: java.lang.Throwable -> L19
            float r2 = r0.density     // Catch: java.lang.Throwable -> L19
            return r2
        L19:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
        L30:
            r2 = 0
            return r2
    }

    public static java.lang.String getDeviceBootMark() {
            java.lang.String r0 = ""
            return r0
        L3:
            r0 = 0
            return r0
    }

    public static java.lang.String getDeviceName(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "device_name"
            java.lang.String r2 = android.provider.Settings.Global.getString(r2, r0)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            java.lang.String r2 = ""
            return r2
    }

    public static int getDeviceType(android.content.Context r0) {
            boolean r0 = e(r0)
            if (r0 == 0) goto Ld
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE.TYPE_TABLET
            int r0 = r0.getCode()
            return r0
        Ld:
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE.TYPE_PHONE
            int r0 = r0.getCode()
            return r0
    }

    public static java.lang.String getDeviceUpdateMark() {
            xyz.adscope.common.info.deviceinfo.DeviceInfoSystemMark r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoSystemMark     // Catch: java.lang.Throwable -> La
            r0.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = r0.getDeviceUpdateMark()     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = 0
            return r0
    }

    public static java.lang.String getFileMark() {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L21
            r1 = 24
            if (r0 < r1) goto L38
            java.lang.String r0 = "ro.build.date.utc"
            r1 = -1
            long r0 = xyz.adscope.common.info.deviceinfo.SysProp.getLong(r0, r1)     // Catch: java.lang.Throwable -> L21
            java.io.File r2 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Throwable -> L21
            long r2 = r2.lastModified()     // Catch: java.lang.Throwable -> L21
            long r4 = android.os.Build.TIME     // Catch: java.lang.Throwable -> L21
            long r2 = java.lang.Math.max(r2, r4)     // Catch: java.lang.Throwable -> L21
            long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L21
            goto L3a
        L21:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r1, r0)
        L38:
            r0 = 0
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ""
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public static java.lang.String getGaid(android.content.Context r1) {
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.b     // Catch: java.lang.Throwable -> L14
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lb
            java.lang.String r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.b     // Catch: java.lang.Throwable -> L14
            return r1
        Lb:
            java.lang.String r0 = xyz.adscope.common.constants.CommonConstants.DEVICE_GAID_KEY     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = xyz.adscope.common.sp.CommonSpUtil.getString(r1, r0)     // Catch: java.lang.Throwable -> L14
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.b = r1     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String getHardDisk() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L2d
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L34
            android.os.StatFs r1 = new android.os.StatFs     // Catch: java.lang.Throwable -> L34
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L34
            int r0 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L34
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L34
            int r0 = r1.getBlockCount()     // Catch: java.lang.Throwable -> L34
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L34
            r1.getAvailableBlocks()     // Catch: java.lang.Throwable -> L34
            long r2 = r2 * r4
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L34
            return r0
        L2d:
            java.lang.String r0 = "DeviceInfoUtil"
            java.lang.String r1 = ""
            xyz.adscope.common.tool.LogUtil.i(r0, r1)     // Catch: java.lang.Throwable -> L34
        L34:
            java.lang.String r0 = "0"
            return r0
    }

    public static java.lang.String getHmsCoreVersion(android.content.Context r1) {
            java.lang.String r0 = "com.huawei.hwid"
            java.lang.String r1 = getVersionCode(r1, r0)
            return r1
    }

    public static java.lang.String getLanguage() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            return r0
    }

    public static java.lang.String getManufacturer() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            return r0
    }

    @android.annotation.TargetApi(3)
    public static android.app.ActivityManager.MemoryInfo getMemoryInfo(android.content.Context r2) {
            java.lang.String r0 = "activity"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L11
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Throwable -> L11
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            r2.getMemoryInfo(r0)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            r2 = 0
            return r2
    }

    public static java.lang.String getModel() {
            java.lang.String r0 = android.os.Build.MODEL
            return r0
    }

    public static java.lang.String getOaid(android.content.Context r1) {
            java.lang.String r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.a     // Catch: java.lang.Throwable -> L14
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lb
            java.lang.String r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.a     // Catch: java.lang.Throwable -> L14
            return r1
        Lb:
            java.lang.String r0 = xyz.adscope.common.constants.CommonConstants.DEVICE_OAID_KEY     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = xyz.adscope.common.sp.CommonSpUtil.getString(r1, r0)     // Catch: java.lang.Throwable -> L14
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.a = r1     // Catch: java.lang.Throwable -> L14
            return r1
        L14:
            java.lang.String r1 = ""
            return r1
    }

    public static int getOrientation(android.content.Context r2) {
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> Lb
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> Lb
            int r2 = r2.orientation     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            r2 = 0
            return r2
    }

    public static int getOs() {
            xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.OS_ANDROID
            int r0 = r0.getCode()
            return r0
    }

    public static java.lang.String getOsVersion() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            return r0
    }

    public static float getPPI(android.content.Context r2) {
            if (r2 == 0) goto L31
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1a
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch: java.lang.Throwable -> L1a
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch: java.lang.Throwable -> L1a
            r2.getMetrics(r0)     // Catch: java.lang.Throwable -> L1a
            int r2 = r0.densityDpi     // Catch: java.lang.Throwable -> L1a
            float r2 = (float) r2
            return r2
        L1a:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
        L31:
            r2 = 0
            return r2
    }

    public static java.lang.String getPhysicalMemory(android.content.Context r2) {
            android.app.ActivityManager$MemoryInfo r2 = getMemoryInfo(r2)     // Catch: java.lang.Throwable -> Lb
            long r0 = r2.totalMem     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            java.lang.String r2 = "0"
            return r2
    }

    public static float getPxRatio(android.content.Context r0) {
            float r0 = getDensity(r0)
            return r0
    }

    public static int getScreenHeight(android.content.Context r2) {
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> Lb
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> Lb
            int r2 = r2.heightPixels     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            r2 = 0
            return r2
    }

    public static int getScreenHeightDp(android.content.Context r2) {
            android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Throwable -> L10
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Throwable -> L10
            int r0 = r0.heightPixels     // Catch: java.lang.Throwable -> L10
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L10
            int r2 = px2dip(r2, r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            r2 = 0
            return r2
    }

    public static int getScreenWidth(android.content.Context r2) {
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> Lb
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> Lb
            int r2 = r2.widthPixels     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            r2 = 0
            return r2
    }

    public static int getScreenWidthDp(android.content.Context r2) {
            android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Throwable -> L22
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Throwable -> L22
            float r0 = r0.density     // Catch: java.lang.Throwable -> L22
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L22
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L22
            int r2 = r2.widthPixels     // Catch: java.lang.Throwable -> L22
            float r2 = (float) r2
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L1c
            r0 = 1065353216(0x3f800000, float:1.0)
        L1c:
            float r2 = r2 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
        L22:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            r2 = 0
            return r2
    }

    public static java.lang.String getSdkId(android.content.Context r2) {
            java.lang.String r0 = xyz.adscope.common.constants.CommonConstants.APP_SDK_ID
            java.lang.String r1 = ""
            java.lang.Object r0 = xyz.adscope.common.sp.CommonSpUtil.get(r2, r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L19
            java.lang.String r0 = c()
            java.lang.String r1 = xyz.adscope.common.constants.CommonConstants.APP_SDK_ID
            xyz.adscope.common.sp.CommonSpUtil.put(r2, r1, r0)
        L19:
            return r0
    }

    public static long getTimeStamp() {
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    public static java.lang.String getTimeZone() {
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch: java.lang.Throwable -> Lb
            r1 = 1
            r2 = 0
            java.lang.String r0 = r0.getDisplayName(r1, r2)     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getUserAgent(android.content.Context r1) {
            java.lang.String r0 = xyz.adscope.common.constants.CommonConstants.USER_AGENT_KEY
            java.lang.String r1 = xyz.adscope.common.sp.CommonSpUtil.getString(r1, r0)
            return r1
    }

    public static java.lang.String getVersionCode(android.content.Context r1, java.lang.String r2) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L12
            r0 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch: java.lang.Throwable -> L12
            int r1 = r1.versionCode     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            java.lang.String r1 = ""
            return r1
    }

    public static /* synthetic */ void h(android.content.Context r0) {
            f(r0)
            return
    }

    public static /* synthetic */ void i(android.content.Context r0) {
            g(r0)
            return
    }

    public static void initOaid(android.content.Context r2) {
            java.lang.String r0 = getOaid(r2)     // Catch: java.lang.Throwable -> L3c
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.a = r0     // Catch: java.lang.Throwable -> L3c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L13
            d(r2)     // Catch: java.lang.Throwable -> L3c
            c(r2)     // Catch: java.lang.Throwable -> L3c
            goto L1f
        L13:
            java.util.concurrent.ThreadPoolExecutor r0 = xyz.adscope.common.tool.thread.CommonThreadPool.getInitRequestPool()     // Catch: java.lang.Throwable -> L3c
            xyz.adscope.common.info.deviceinfo.a r1 = new xyz.adscope.common.info.deviceinfo.a     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            r0.execute(r1)     // Catch: java.lang.Throwable -> L3c
        L1f:
            java.lang.String r0 = getGaid(r2)     // Catch: java.lang.Throwable -> L3c
            xyz.adscope.common.info.deviceinfo.DeviceInfoUtil.b = r0     // Catch: java.lang.Throwable -> L3c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L2f
            b(r2)     // Catch: java.lang.Throwable -> L3c
            return
        L2f:
            java.util.concurrent.ThreadPoolExecutor r0 = xyz.adscope.common.tool.thread.CommonThreadPool.getInitRequestPool()     // Catch: java.lang.Throwable -> L3c
            xyz.adscope.common.info.deviceinfo.b r1 = new xyz.adscope.common.info.deviceinfo.b     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            r0.execute(r1)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r0, r2)
            return
    }

    public static int isDevelop(android.content.Context r5) {
            r0 = 0
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "development_settings_enabled"
            int r5 = android.provider.Settings.Global.getInt(r5, r1, r0)     // Catch: java.lang.Throwable -> L38
            r1 = 1
            if (r5 != r1) goto Lf
            return r1
        Lf:
            java.util.Enumeration r5 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L38
        L13:
            boolean r2 = r5.hasMoreElements()     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L38
            java.lang.Object r2 = r5.nextElement()     // Catch: java.lang.Throwable -> L38
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "tun0"
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L38
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L37
            java.lang.String r3 = "ppp0"
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L38
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L13
        L37:
            return r1
        L38:
            return r0
    }

    public static int px2dip(android.content.Context r2, float r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L14
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L14
            float r2 = r2.density     // Catch: java.lang.Throwable -> L14
            float r3 = r3 / r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            return r2
        L14:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "e : "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DeviceInfoUtil"
            xyz.adscope.common.tool.LogUtil.e(r3, r2)
            return r0
    }
}
