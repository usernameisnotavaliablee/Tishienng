package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DeviceUtil {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.dev.info.DeviceUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SystemMarkHelper {
        private final xyz.adscope.common.v2.dev.info.DevSysMark mSystemMark;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static class InstanceHolder {
            private static final xyz.adscope.common.v2.dev.info.DeviceUtil.SystemMarkHelper instance = null;

            static {
                    xyz.adscope.common.v2.dev.info.DeviceUtil$SystemMarkHelper r0 = new xyz.adscope.common.v2.dev.info.DeviceUtil$SystemMarkHelper
                    r1 = 0
                    r0.<init>(r1)
                    xyz.adscope.common.v2.dev.info.DeviceUtil.SystemMarkHelper.InstanceHolder.instance = r0
                    return
            }

            private InstanceHolder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static /* synthetic */ xyz.adscope.common.v2.dev.info.DeviceUtil.SystemMarkHelper access$100() {
                    xyz.adscope.common.v2.dev.info.DeviceUtil$SystemMarkHelper r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.SystemMarkHelper.InstanceHolder.instance
                    return r0
            }
        }

        private SystemMarkHelper() {
                r1 = this;
                r1.<init>()
                xyz.adscope.common.v2.dev.info.DevSysMark r0 = new xyz.adscope.common.v2.dev.info.DevSysMark
                r0.<init>()
                r1.mSystemMark = r0
                return
        }

        /* synthetic */ SystemMarkHelper(xyz.adscope.common.v2.dev.info.DeviceUtil.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static xyz.adscope.common.v2.dev.info.DeviceUtil.SystemMarkHelper getInstance() {
                xyz.adscope.common.v2.dev.info.DeviceUtil$SystemMarkHelper r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.SystemMarkHelper.InstanceHolder.access$100()
                return r0
        }

        java.lang.String getUpdateMark() {
                r1 = this;
                xyz.adscope.common.v2.dev.info.DevSysMark r0 = r1.mSystemMark
                java.lang.String r0 = r0.getSysUpdateMark()
                return r0
        }
    }

    private DeviceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getAndroidRelease() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            return r0
    }

    public static int getAndroidVersion() {
            int r0 = android.os.Build.VERSION.SDK_INT
            return r0
    }

    public static java.lang.String getBrand() {
            java.lang.String r0 = android.os.Build.BRAND
            return r0
    }

    public static java.lang.String getCarrier(android.content.Context r3) {
            java.lang.String r0 = "UNKNOW"
            java.lang.String r1 = "phone"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L59
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L59
            int r1 = r3.getSimState()     // Catch: java.lang.Throwable -> L59
            r2 = 5
            if (r2 != r1) goto L59
            java.lang.String r3 = r3.getSimOperator()     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L59
            int r1 = r3.hashCode()     // Catch: java.lang.Throwable -> L59
            r2 = 49679477(0x2f60c75, float:3.6153601E-37)
            if (r1 == r2) goto L4e
            switch(r1) {
                case 49679470: goto L45;
                case 49679471: goto L3a;
                case 49679472: goto L31;
                case 49679473: goto L26;
                default: goto L25;
            }     // Catch: java.lang.Throwable -> L59
        L25:
            goto L59
        L26:
            java.lang.String r1 = "46003"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L59
            java.lang.String r3 = "CTCC"
            return r3
        L31:
            java.lang.String r1 = "46002"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L59
            goto L56
        L3a:
            java.lang.String r1 = "46001"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L59
            java.lang.String r3 = "CUCC"
            return r3
        L45:
            java.lang.String r1 = "46000"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L59
            goto L56
        L4e:
            java.lang.String r1 = "46007"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L59
        L56:
            java.lang.String r3 = "CMCC"
            return r3
        L59:
            return r0
    }

    public static int getCountryCN(android.content.Context r2) {
            java.lang.String r2 = getCountryCode(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Le
            java.lang.String r2 = r2.toUpperCase()
        Le:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType r0 = xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.COUNTRY_CHINA_TYPE
            java.lang.String r1 = r0.getCountry()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L1f
            int r2 = r0.getCode()
            return r2
        L1f:
            xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType r2 = xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.COUNTRY_OTHER_TYPE
            int r2 = r2.getCode()
            return r2
    }

    public static java.lang.String getCountryCode(android.content.Context r2) {
            if (r2 == 0) goto L37
            android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L37
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L37
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L37
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L37
            r1 = 24
            if (r0 < r1) goto L2e
            android.os.LocaleList r2 = androidx.appcompat.app.c.a(r2)     // Catch: java.lang.Throwable -> L37
            boolean r0 = androidx.appcompat.app.s.a(r2)     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L37
            r0 = 0
            java.util.Locale r2 = androidx.core.os.f.a(r2, r0)     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L37
            java.lang.String r2 = r2.getCountry()     // Catch: java.lang.Throwable -> L37
            return r2
        L2e:
            java.util.Locale r2 = r2.locale     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L37
            java.lang.String r2 = r2.getCountry()     // Catch: java.lang.Throwable -> L37
            return r2
        L37:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String getDeviceName(android.content.Context r3) {
            if (r3 == 0) goto L22
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L22
            r1 = 25
            java.lang.String r2 = "device_name"
            if (r0 < r1) goto L19
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = android.provider.Settings.Global.getString(r3, r2)     // Catch: java.lang.Throwable -> L22
            return r3
        L19:
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = android.provider.Settings.Global.getString(r3, r2)     // Catch: java.lang.Throwable -> L22
            return r3
        L22:
            java.lang.String r3 = ""
            return r3
    }

    public static int getDeviceType(android.content.Context r0) {
            boolean r0 = isTablet(r0)
            if (r0 == 0) goto L9
            r0 = 101(0x65, float:1.42E-43)
            return r0
        L9:
            r0 = 100
            return r0
    }

    public static java.lang.String getDeviceUpdateMark() {
            xyz.adscope.common.v2.dev.info.DeviceUtil$SystemMarkHelper r0 = xyz.adscope.common.v2.dev.info.DeviceUtil.SystemMarkHelper.getInstance()
            java.lang.String r0 = r0.getUpdateMark()
            return r0
    }

    public static long getFileMark() {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L21
            r1 = 24
            if (r0 < r1) goto L21
            java.lang.String r0 = "ro.build.date.utc"
            r1 = -1
            long r0 = xyz.adscope.common.v2.dev.info.SystemPropertiesUtil.getLong(r0, r1)     // Catch: java.lang.Throwable -> L21
            java.io.File r2 = android.os.Environment.getRootDirectory()     // Catch: java.lang.Throwable -> L21
            long r2 = r2.lastModified()     // Catch: java.lang.Throwable -> L21
            long r4 = android.os.Build.TIME     // Catch: java.lang.Throwable -> L21
            long r2 = java.lang.Math.max(r2, r4)     // Catch: java.lang.Throwable -> L21
            long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            r0 = 0
            return r0
    }

    public static java.lang.String getHardDisk() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L28
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L28
            android.os.StatFs r1 = new android.os.StatFs     // Catch: java.lang.Throwable -> L28
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L28
            long r2 = r1.getBlockSizeLong()     // Catch: java.lang.Throwable -> L28
            long r0 = r1.getBlockCountLong()     // Catch: java.lang.Throwable -> L28
            long r2 = r2 * r0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L28
            return r0
        L28:
            java.lang.String r0 = "0"
            return r0
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

    private static android.app.ActivityManager.MemoryInfo getMemoryInfo(android.content.Context r1) {
            if (r1 == 0) goto L15
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            if (r1 == 0) goto L15
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            r1.getMemoryInfo(r0)
            return r0
        L15:
            r1 = 0
            return r1
    }

    public static java.lang.String getModel() {
            java.lang.String r0 = android.os.Build.MODEL
            return r0
    }

    public static int getOS() {
            r0 = 2
            return r0
    }

    public static java.lang.String getPhysicalMemory(android.content.Context r2) {
            android.app.ActivityManager$MemoryInfo r2 = getMemoryInfo(r2)
            if (r2 == 0) goto Ld
            long r0 = r2.totalMem
            java.lang.String r2 = java.lang.String.valueOf(r0)
            return r2
        Ld:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String getTimeZone() {
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            if (r0 == 0) goto Ld
            r1 = 1
            r2 = 0
            java.lang.String r0 = r0.getDisplayName(r1, r2)
            return r0
        Ld:
            java.lang.String r0 = ""
            return r0
    }

    public static boolean isTablet(android.content.Context r2) {
            r0 = 0
            if (r2 == 0) goto L1c
            android.content.res.Resources r1 = r2.getResources()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1c
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L1c
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1c
            int r2 = r2.screenLayout     // Catch: java.lang.Throwable -> L1c
            r2 = r2 & 15
            r1 = 3
            if (r2 < r1) goto L1c
            r2 = 1
            return r2
        L1c:
            return r0
    }
}
