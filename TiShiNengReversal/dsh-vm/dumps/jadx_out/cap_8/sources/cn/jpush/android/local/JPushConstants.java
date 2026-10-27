package cn.jpush.android.local;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JPushConstants {
    public static int BUILD_ID = 61;
    public static final java.lang.String ENCODING_UTF_8 = "UTF-8";
    public static final int FORE_GROUND = 0;
    public static final int FORE_GROUND_NO = 1;
    public static final int FORE_GROUND_UNKNOWN = -1;
    public static final java.lang.String HTTPS_PRE = "https://";
    public static final java.lang.String HTTP_PRE = "http://";
    public static final boolean IG = false;
    public static boolean IS_HB_PERIOD_ENABLE = true;
    public static java.lang.String SDK_NAME = "";
    public static final java.lang.String SDK_TYPE = "JPUSH";
    public static int SDK_VERSION_CODE = 570;
    public static java.lang.String SDK_VERSION_NAME = "5.7.0";
    public static boolean SUPPORT_DY = true;
    private static final java.lang.String TAG = "JPushConstants";
    public static boolean THIRD_ENABLE = true;
    private static final java.lang.String USER_MESSAGE_RECEIVER_ACTION = "cn.jpush.android.intent.RECEIVER_MESSAGE";
    private static android.os.Bundle configBundle = null;
    public static int isForeGround = -1;
    private static boolean isInitLife;
    private static java.lang.Boolean isSameProcessWithJCommonReceiver;
    private static boolean isTestAndroidQ;
    private static cn.jpush.android.service.JPushMessageReceiver jPushMessageReceiver;
    public static android.content.Context mApplicationContext;
    private static java.lang.String messageReceiverClass;
    private static java.lang.String messageReceiverProcess;
    private static boolean tcpConnected;

    public static class TEST_CONFIG {
        public static java.lang.String TEST_FILE_URL = "";
        public static java.lang.String TEST_FILE_VERSION = "";

        static {
                return
        }

        public TEST_CONFIG() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    public JPushConstants() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canGetLbsInBackGround(android.content.Context r6) {
            java.lang.String r0 = "canGetLbsInBackGround"
            r1 = 1
            boolean r0 = isAndroidQ(r6, r1, r0)
            if (r0 == 0) goto L2c
            int r0 = cn.jpush.android.local.JPushConstants.isForeGround
            r2 = 0
            java.lang.String r3 = "JPushConstants"
            java.lang.String r4 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            if (r0 != r1) goto L1e
            boolean r0 = cn.jpush.android.ad.a.a(r6, r4)
            if (r0 != 0) goto L1e
            java.lang.String r6 = "app is not in foreground and no android.permission.ACCESS_BACKGROUND_LOCATION"
        L1a:
            cn.jpush.android.helper.Logger.ww(r3, r6)
            return r2
        L1e:
            int r0 = cn.jpush.android.local.JPushConstants.isForeGround
            r5 = -1
            if (r0 != r5) goto L2c
            boolean r6 = cn.jpush.android.ad.a.a(r6, r4)
            if (r6 != 0) goto L2c
            java.lang.String r6 = "app is unkonwn foreground stat and no android.permission.ACCESS_BACKGROUND_LOCATION"
            goto L1a
        L2c:
            return r1
    }

    public static void changeForegroudStat(android.content.Context r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "changeForegroudStat:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JPushConstants"
            cn.jpush.android.helper.Logger.d(r1, r0)
            r0 = r3 ^ 1
            cn.jpush.android.local.JPushConstants.isForeGround = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "foreground"
            r0.putBoolean(r1, r3)
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "change_foreground"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)
            return
    }

    private static void defaultRegister(android.content.Context r5, cn.jpush.android.local.ActivityLifeCallBack r6) {
            boolean r0 = r5 instanceof android.app.Application
            if (r0 == 0) goto L74
            java.lang.String r0 = cn.jpush.android.ad.a.d(r5)
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r2 = "JPushConstants"
            r3 = 0
            if (r0 == 0) goto L53
            if (r1 == 0) goto L53
            java.lang.String r4 = r5.getPackageName()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L53
            r4 = r5
            android.app.Application r4 = (android.app.Application) r4
            r4.registerActivityLifecycleCallbacks(r6)
            int r4 = cn.jpush.android.local.ActivityLifeCallBack.activityTaskCount
            if (r4 != 0) goto L36
            android.app.Activity r5 = cn.jpush.android.ad.a.k(r5)
            if (r5 == 0) goto L36
            r6.onActivityCreated(r5, r3)
            r6.onActivityStarted(r5)
            r6.onActivityResumed(r5)
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "initPageLifecycle in main process, packageName:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ", currentProcessName:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            cn.jpush.android.helper.Logger.d(r2, r5)
            return
        L53:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "need not initPageLifecycle in other process :"
            r6.append(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            cn.jpush.android.helper.Logger.d(r2, r6)
            cn.jpush.android.d.d r6 = new cn.jpush.android.d.d
            r6.<init>()
            r0 = 1
            r6.r = r0
            java.lang.String r0 = "sync_reg_lifecycle"
            cn.jpush.android.x.b.a(r5, r0, r6, r3)
        L74:
            return
    }

    public static android.content.Context getAppContext(android.content.Context r1) {
            android.content.Context r0 = cn.jpush.android.local.JPushConstants.mApplicationContext
            if (r0 != 0) goto L10
            if (r1 == 0) goto L10
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            cn.jpush.android.local.JPushConstants.mApplicationContext = r1
        L10:
            android.content.Context r1 = cn.jpush.android.local.JPushConstants.mApplicationContext
            return r1
    }

    public static android.os.Bundle getBundle() {
            android.os.Bundle r0 = cn.jpush.android.local.JPushConstants.configBundle
            return r0
    }

    public static java.lang.String getMessageReceiverClass(android.content.Context r12) {
            java.lang.String r0 = " at "
            java.lang.Class<cn.jpush.android.service.JPushMessageReceiver> r1 = cn.jpush.android.service.JPushMessageReceiver.class
            java.lang.String r2 = "JPushConstants"
            java.lang.String r3 = cn.jpush.android.local.JPushConstants.messageReceiverClass
            if (r3 == 0) goto Lb
            return r3
        Lb:
            java.lang.String r3 = r12.getPackageName()     // Catch: java.lang.Throwable -> L5c
            android.content.pm.ComponentInfo r3 = cn.jpush.android.ad.a.a(r12, r3, r1)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5c
            java.lang.String r4 = r3.name     // Catch: java.lang.Throwable -> L5c
            cn.jpush.android.local.JPushConstants.messageReceiverClass = r4     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r3.processName     // Catch: java.lang.Throwable -> L5c
            cn.jpush.android.local.JPushConstants.messageReceiverProcess = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r3.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "found messageServiceClass :"
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = cn.jpush.android.local.JPushConstants.messageReceiverClass     // Catch: java.lang.Throwable -> L5c
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c
            r3.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = cn.jpush.android.local.JPushConstants.messageReceiverProcess     // Catch: java.lang.Throwable -> L5c
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = " by getComponentInfo"
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            cn.jpush.android.helper.Logger.ii(r2, r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = cn.jpush.android.local.JPushConstants.messageReceiverProcess     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5c
            java.lang.String r4 = cn.jpush.android.ad.a.d(r12)     // Catch: java.lang.Throwable -> L5c
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5c
            java.lang.String r3 = cn.jpush.android.local.JPushConstants.messageReceiverClass     // Catch: java.lang.Throwable -> L5c
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Throwable -> L5c
            cn.jpush.android.service.JPushMessageReceiver r3 = (cn.jpush.android.service.JPushMessageReceiver) r3     // Catch: java.lang.Throwable -> L5c
            cn.jpush.android.local.JPushConstants.jPushMessageReceiver = r3     // Catch: java.lang.Throwable -> L5c
        L5c:
            java.lang.String r3 = cn.jpush.android.local.JPushConstants.messageReceiverClass     // Catch: java.lang.Throwable -> L113
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L113
            if (r3 == 0) goto L12c
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L113
            r3.<init>()     // Catch: java.lang.Throwable -> L113
            java.lang.String r4 = "cn.jpush.android.intent.RECEIVER_MESSAGE"
            r3.setAction(r4)     // Catch: java.lang.Throwable -> L113
            java.lang.String r4 = r12.getPackageName()     // Catch: java.lang.Throwable -> L113
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L113
            android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch: java.lang.Throwable -> L113
            java.lang.Class r5 = r4.getClass()     // Catch: java.lang.Throwable -> L113
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L113
            java.lang.String r7 = "cXVlcnlCcm9hZGNhc3RSZWNlaXZlcnM="
            r8 = 2
            byte[] r7 = android.util.Base64.decode(r7, r8)     // Catch: java.lang.Throwable -> L113
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L113
            java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L113
            java.lang.Class<android.content.Intent> r9 = android.content.Intent.class
            r10 = 0
            r7[r10] = r9     // Catch: java.lang.Throwable -> L113
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L113
            r11 = 1
            r7[r11] = r9     // Catch: java.lang.Throwable -> L113
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L113
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L113
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L113
            r7[r10] = r3     // Catch: java.lang.Throwable -> L113
            r7[r11] = r6     // Catch: java.lang.Throwable -> L113
            java.lang.Object r3 = r5.invoke(r4, r7)     // Catch: java.lang.Throwable -> L113
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L113
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L113
        Lad:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L113
            if (r4 == 0) goto L12c
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L113
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4     // Catch: java.lang.Throwable -> L113
            android.content.pm.ActivityInfo r5 = r4.activityInfo     // Catch: java.lang.Throwable -> L113
            if (r5 == 0) goto Lad
            java.lang.String r5 = r5.name     // Catch: java.lang.Throwable -> L113
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L113
            if (r6 != 0) goto Lad
            java.lang.Class r6 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L113
            boolean r7 = r1.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L113
            if (r7 == 0) goto Lad
            cn.jpush.android.local.JPushConstants.messageReceiverClass = r5     // Catch: java.lang.Throwable -> L113
            android.content.pm.ActivityInfo r1 = r4.activityInfo     // Catch: java.lang.Throwable -> L113
            java.lang.String r1 = r1.processName     // Catch: java.lang.Throwable -> L113
            cn.jpush.android.local.JPushConstants.messageReceiverProcess = r1     // Catch: java.lang.Throwable -> L113
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L113
            r1.<init>()     // Catch: java.lang.Throwable -> L113
            java.lang.String r3 = "found messageReceiverClass :"
            r1.append(r3)     // Catch: java.lang.Throwable -> L113
            java.lang.String r3 = cn.jpush.android.local.JPushConstants.messageReceiverClass     // Catch: java.lang.Throwable -> L113
            r1.append(r3)     // Catch: java.lang.Throwable -> L113
            r1.append(r0)     // Catch: java.lang.Throwable -> L113
            java.lang.String r0 = cn.jpush.android.local.JPushConstants.messageReceiverProcess     // Catch: java.lang.Throwable -> L113
            r1.append(r0)     // Catch: java.lang.Throwable -> L113
            java.lang.String r0 = " by getCommonReceiverNames"
            r1.append(r0)     // Catch: java.lang.Throwable -> L113
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L113
            cn.jpush.android.helper.Logger.ii(r2, r0)     // Catch: java.lang.Throwable -> L113
            java.lang.String r0 = cn.jpush.android.local.JPushConstants.messageReceiverProcess     // Catch: java.lang.Throwable -> L111
            if (r0 == 0) goto L12c
            java.lang.String r12 = cn.jpush.android.ad.a.d(r12)     // Catch: java.lang.Throwable -> L111
            boolean r12 = r0.equals(r12)     // Catch: java.lang.Throwable -> L111
            if (r12 == 0) goto L12c
            java.lang.Object r12 = r6.newInstance()     // Catch: java.lang.Throwable -> L111
            cn.jpush.android.service.JPushMessageReceiver r12 = (cn.jpush.android.service.JPushMessageReceiver) r12     // Catch: java.lang.Throwable -> L111
            cn.jpush.android.local.JPushConstants.jPushMessageReceiver = r12     // Catch: java.lang.Throwable -> L111
            goto L12c
        L111:
            goto L12c
        L113:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getUserServiceClass failed:"
            r0.append(r1)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            cn.jpush.android.helper.Logger.d(r2, r12)
        L12c:
            java.lang.String r12 = cn.jpush.android.local.JPushConstants.messageReceiverClass
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r0 = ""
            if (r12 == 0) goto L138
            cn.jpush.android.local.JPushConstants.messageReceiverClass = r0
        L138:
            java.lang.String r12 = cn.jpush.android.local.JPushConstants.messageReceiverProcess
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L142
            cn.jpush.android.local.JPushConstants.messageReceiverProcess = r0
        L142:
            java.lang.String r12 = cn.jpush.android.local.JPushConstants.messageReceiverClass
            return r12
    }

    public static cn.jpush.android.service.JPushMessageReceiver getPushMessageReceiver(android.content.Context r0) {
            android.content.Context r0 = getAppContext(r0)
            getMessageReceiverClass(r0)
            cn.jpush.android.service.JPushMessageReceiver r0 = cn.jpush.android.local.JPushConstants.jPushMessageReceiver
            return r0
    }

    public static void init(android.content.Context r0) {
            initPageLifecycle(r0)
            return
    }

    private static void initPageLifecycle(android.content.Context r3) {
            java.lang.String r0 = "JPushConstants"
            if (r3 != 0) goto La
            java.lang.String r3 = "[initPageLifecycle] context is null"
            cn.jpush.android.helper.Logger.w(r0, r3)
            return
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initPageLifecycle init, isInitLife: "
            r1.append(r2)
            boolean r2 = cn.jpush.android.local.JPushConstants.isInitLife
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            cn.jpush.android.helper.Logger.d(r0, r1)
            boolean r1 = cn.jpush.android.local.JPushConstants.isInitLife
            if (r1 == 0) goto L25
            goto L60
        L25:
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r1 = 1
            cn.jpush.android.local.JPushConstants.isInitLife = r1     // Catch: java.lang.Throwable -> L47
            cn.jpush.android.local.ActivityLifeCallBack r1 = new cn.jpush.android.local.ActivityLifeCallBack     // Catch: java.lang.Throwable -> L47
            r1.<init>()     // Catch: java.lang.Throwable -> L47
            cn.jiguang.api.JCoreManager.addActivityLifeCallback(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "initPageLifecycle init to JCore "
            cn.jpush.android.helper.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L3e
            goto L60
        L3e:
            defaultRegister(r3, r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "initPageLifecycle init to JPush "
            cn.jpush.android.helper.Logger.d(r0, r3)     // Catch: java.lang.Throwable -> L47
            goto L60
        L47:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "registerActivityLifecycleCallbacks failed:"
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jpush.android.helper.Logger.ww(r0, r3)
        L60:
            return
    }

    public static boolean isAndroidQ(android.content.Context r3, boolean r4, java.lang.String r5) {
            r0 = 0
            r1 = 1
            r2 = 28
            if (r4 != 0) goto L15
            boolean r3 = cn.jpush.android.local.JPushConstants.isTestAndroidQ
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
            boolean r4 = cn.jpush.android.local.JPushConstants.isTestAndroidQ
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
            java.lang.String r4 = "JPushConstants"
            cn.jpush.android.helper.Logger.d(r4, r3)
        L43:
            return r0
    }

    public static boolean isSameProcessWithJCommonService(android.content.Context r3) {
            java.lang.String r0 = "JPushConstants"
            java.lang.Boolean r1 = cn.jpush.android.local.JPushConstants.isSameProcessWithJCommonReceiver     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lb
            return r3
        Lb:
            r3 = move-exception
            goto L43
        Ld:
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.messageReceiverProcess     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto L14
            getMessageReceiverClass(r3)     // Catch: java.lang.Throwable -> Lb
        L14:
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lb
            java.lang.Class<cn.jpush.android.service.JCommonService> r2 = cn.jpush.android.service.JCommonService.class
            android.content.pm.ComponentInfo r3 = cn.jpush.android.ad.a.a(r3, r1, r2)     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L5b
            java.lang.String r3 = r3.processName     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.messageReceiverProcess     // Catch: java.lang.Throwable -> Lb
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L34
            java.lang.String r3 = "same process with JCommonService"
            cn.jpush.android.helper.Logger.dd(r0, r3)     // Catch: java.lang.Throwable -> Lb
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lb
        L31:
            cn.jpush.android.local.JPushConstants.isSameProcessWithJCommonReceiver = r3     // Catch: java.lang.Throwable -> Lb
            goto L3c
        L34:
            java.lang.String r3 = "is not same process with JCommonService"
            cn.jpush.android.helper.Logger.dd(r0, r3)     // Catch: java.lang.Throwable -> Lb
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lb
            goto L31
        L3c:
            java.lang.Boolean r3 = cn.jpush.android.local.JPushConstants.isSameProcessWithJCommonReceiver     // Catch: java.lang.Throwable -> Lb
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lb
            return r3
        L43:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "call isSameProcessWithJCommonService failed:"
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            cn.jpush.android.helper.Logger.w(r0, r3)
        L5b:
            r3 = 0
            return r3
    }

    public static boolean isTcpConnected() {
            boolean r0 = cn.jpush.android.local.JPushConstants.tcpConnected
            return r0
    }

    public static void setBundle(android.os.Bundle r0) {
            cn.jpush.android.local.JPushConstants.configBundle = r0
            return
    }

    public static void setTcpConnected(boolean r0) {
            cn.jpush.android.local.JPushConstants.tcpConnected = r0
            return
    }

    public static void testAndroidQ() {
            return
    }
}
