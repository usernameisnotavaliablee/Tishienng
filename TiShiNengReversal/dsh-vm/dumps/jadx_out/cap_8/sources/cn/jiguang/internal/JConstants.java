package cn.jiguang.internal;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JConstants {
    public static final byte AES_CBC = 1;
    public static java.lang.String APP_KEY = "";
    public static boolean AT_I = false;
    public static boolean CMD_TO_PRINT_ALL_LOG = false;
    public static final java.lang.String DATA_PROVIDER_SUFFIX = ".DataProvider";
    public static final long DAY = 86400000;
    public static boolean DEBUG_MODE = false;
    public static int DEFAULT_ALARM_DELAY = 0;
    public static int DEFAULT_HEARTBEAT_INTERVAL = 0;
    public static final java.lang.String ENCODING_UTF_8 = "UTF-8";
    public static final long HOUR = 3600000;
    public static final boolean INTERNAL_USE = false;
    public static final boolean IS_FOR_GOOGLE_PLAY_USE = false;
    public static final boolean IS_FOR_GOOGLE_PURE_USE = false;
    public static final boolean IS_FOR_JBASIC = false;
    public static final boolean LOG_ENABLE = true;
    public static final int LOG_ENABLED_LEVEL = 2;
    public static final boolean LOG_FILE_ENABLE = true;
    public static final long MIN = 60000;
    public static final boolean REPORT_SUPPORT_HTTP = false;
    public static final boolean REPORT_USE_HTTPS = true;
    public static java.lang.String SDK_NAME = null;
    public static final java.lang.String SDK_TYPE = "JCore";
    public static java.lang.String SDK_VERSION = null;
    public static int SDK_VERSION_INT = 0;
    public static final long SECOND = 1000;
    public static final byte SM4_CBC = 2;
    public static final boolean SUPPORT_DY = true;
    private static final java.lang.String TAG = "JConstants";
    public static java.util.LinkedList<java.lang.String> TUU = null;
    public static final java.lang.String USER_SERVICE_ACTION = "cn.jiguang.user.service.action";
    public static java.util.concurrent.atomic.AtomicBoolean isCallInit;
    public static boolean isInstrumentationHookFailed;
    private static boolean isTestAndroidQ;
    public static cn.jiguang.api.JAnalyticsAction jAnalyticsAction;
    private static final java.util.concurrent.atomic.AtomicReference<android.content.Context> mApplicationContext = null;
    public static byte tcpAlgorithm;
    public static int tcpSessionId;
    public static java.lang.String testBannedConfigUrl;
    public static java.lang.String testCountry;
    private static boolean testEnv;
    public static java.lang.String testJOperateBaseUrl;
    public static java.lang.String testLimitConfigUrl;

    static {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            cn.jiguang.internal.JConstants.TUU = r0
            r0 = 0
            cn.jiguang.internal.JConstants.AT_I = r0
            java.lang.String r1 = ""
            cn.jiguang.internal.JConstants.SDK_NAME = r1
            java.lang.String r2 = "5.3.1"
            cn.jiguang.internal.JConstants.SDK_VERSION = r2
            r2 = 531(0x213, float:7.44E-43)
            cn.jiguang.internal.JConstants.SDK_VERSION_INT = r2
            cn.jiguang.internal.JConstants.DEBUG_MODE = r0
            cn.jiguang.internal.JConstants.CMD_TO_PRINT_ALL_LOG = r0
            r2 = 1
            cn.jiguang.internal.JConstants.isInstrumentationHookFailed = r2
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            cn.jiguang.internal.JConstants.isCallInit = r3
            r3 = 285(0x11d, float:4.0E-43)
            cn.jiguang.internal.JConstants.DEFAULT_HEARTBEAT_INTERVAL = r3
            int r3 = r3 + 5
            cn.jiguang.internal.JConstants.DEFAULT_ALARM_DELAY = r3
            cn.jiguang.internal.JConstants.tcpAlgorithm = r2
            cn.jiguang.internal.JConstants.testEnv = r0
            cn.jiguang.internal.JConstants.testCountry = r1
            cn.jiguang.internal.JConstants.testBannedConfigUrl = r1
            cn.jiguang.internal.JConstants.testLimitConfigUrl = r1
            cn.jiguang.internal.JConstants.isTestAndroidQ = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            cn.jiguang.internal.JConstants.mApplicationContext = r0
            return
    }

    public JConstants() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context getAppContext() {
            r0 = 0
            android.content.Context r0 = getAppContext(r0)
            return r0
    }

    public static android.content.Context getAppContext(android.content.Context r2) {
            java.util.concurrent.atomic.AtomicReference<android.content.Context> r0 = cn.jiguang.internal.JConstants.mApplicationContext
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 != 0) goto L1d
            if (r2 == 0) goto L15
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            goto L19
        L15:
            android.app.Application r2 = cn.jiguang.av.r.a()
        L19:
            r0.set(r2)
            return r2
        L1d:
            return r1
    }

    public static boolean isAndroidQ(android.content.Context r3, boolean r4, java.lang.String r5) {
            r0 = 0
            r1 = 1
            r2 = 28
            if (r4 != 0) goto L15
            boolean r3 = cn.jiguang.internal.JConstants.isTestAndroidQ
            if (r3 == 0) goto L10
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L2b
        Le:
            r0 = 1
            goto L2b
        L10:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 <= r2) goto L2b
            goto Le
        L15:
            boolean r4 = cn.jiguang.internal.JConstants.isTestAndroidQ
            if (r4 == 0) goto L1e
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L2b
            goto L22
        L1e:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 <= r2) goto L2b
        L22:
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            if (r3 <= r2) goto L2b
            goto Le
        L2b:
            if (r0 == 0) goto L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "is Android Q, msg: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "JConstants"
            cn.jiguang.w.f.c(r4, r3)
        L43:
            return r0
    }

    public static boolean isTestEnv() {
            r0 = 0
            return r0
    }

    public static void setTestEnv(boolean r0) {
            return
    }

    public static void testAndroidQ() {
            java.lang.String r0 = "JConstants"
            java.lang.String r1 = "call testAndroidQ"
            cn.jiguang.w.f.c(r0, r1)
            r0 = 1
            cn.jiguang.internal.JConstants.isTestAndroidQ = r0
            return
    }
}
