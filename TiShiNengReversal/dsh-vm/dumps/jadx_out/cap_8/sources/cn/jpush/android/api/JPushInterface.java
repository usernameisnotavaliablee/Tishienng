package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JPushInterface {
    public static final java.lang.String ACTION_CONNECTION_CHANGE = "cn.jpush.android.intent.CONNECTION";
    public static final java.lang.String ACTION_IN_APP_MSG_CLICK = "cn.jpush.android.intent.IN_APP_MSG_CLICK";
    public static final java.lang.String ACTION_IN_APP_MSG_SHOW = "cn.jpush.android.intent.IN_APP_MSG_SHOW";
    public static final java.lang.String ACTION_MESSAGE_RECEIVED = "cn.jpush.android.intent.MESSAGE_RECEIVED";
    public static final java.lang.String ACTION_NOTIFICATION_CLICK_ACTION = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION";
    public static final java.lang.String ACTION_NOTIFICATION_CLICK_ACTION_PROXY = "cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION_PROXY";
    public static final java.lang.String ACTION_NOTIFICATION_OPENED = "cn.jpush.android.intent.NOTIFICATION_OPENED";
    public static final java.lang.String ACTION_NOTIFICATION_RECEIVED = "cn.jpush.android.intent.NOTIFICATION_RECEIVED";
    public static final java.lang.String ACTION_NOTIFICATION_RECEIVED_PROXY = "cn.jpush.android.intent.NOTIFICATION_RECEIVED_PROXY";
    public static final java.lang.String ACTION_REGISTRATION_ID = "cn.jpush.android.intent.REGISTRATION";
    public static final java.lang.String ACTION_RICHPUSH_CALLBACK = "cn.jpush.android.intent.ACTION_RICHPUSH_CALLBACK";
    public static int DEFAULT_NOTIFICATION_NUM = 5;
    public static final java.lang.String EXTRA_ACTIVITY_PARAM = "cn.jpush.android.ACTIVITY_PARAM";
    public static final java.lang.String EXTRA_ALERT = "cn.jpush.android.ALERT";
    public static final java.lang.String EXTRA_ALERT_TYPE = "cn.jpush.android.ALERT_TYPE";
    public static final java.lang.String EXTRA_APP_KEY = "cn.jpush.android.APPKEY";
    public static final java.lang.String EXTRA_BIG_PIC_PATH = "cn.jpush.android.BIG_PIC_PATH";
    public static final java.lang.String EXTRA_BIG_TEXT = "cn.jpush.android.BIG_TEXT";
    public static final java.lang.String EXTRA_CONNECTION_CHANGE = "cn.jpush.android.CONNECTION_CHANGE";
    public static final java.lang.String EXTRA_CONTENT_TYPE = "cn.jpush.android.CONTENT_TYPE";
    public static final java.lang.String EXTRA_EXTRA = "cn.jpush.android.EXTRA";
    public static final java.lang.String EXTRA_INBOX = "cn.jpush.android.INBOX";
    public static final java.lang.String EXTRA_MESSAGE = "cn.jpush.android.MESSAGE";
    public static final java.lang.String EXTRA_MSG_ID = "cn.jpush.android.MSG_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_ACTION_EXTRA = "cn.jpush.android.NOTIFIACATION_ACTION_EXTRA";
    public static final java.lang.String EXTRA_NOTIFICATION_DEVELOPER_ARG0 = "cn.jpush.android.NOTIFICATION_DEVELOPER_ARG0";
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "cn.jpush.android.NOTIFICATION_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_LARGET_ICON = "cn.jpush.android.NOTIFICATION_LARGE_ICON";
    public static final java.lang.String EXTRA_NOTIFICATION_SMALL_ICON = "cn.jpush.android.NOTIFICATION_SMALL_ICON";
    public static final java.lang.String EXTRA_NOTIFICATION_TITLE = "cn.jpush.android.NOTIFICATION_CONTENT_TITLE";
    public static final java.lang.String EXTRA_NOTIFICATION_URL = "cn.jpush.android.NOTIFICATION_URL";
    public static final java.lang.String EXTRA_NOTI_CATEGORY = "cn.jpush.android.NOTI_CATEGORY";
    public static final java.lang.String EXTRA_NOTI_IMPORTANCE = "cn.jpush.android.NOTI_IMPORTANCE";
    public static final java.lang.String EXTRA_NOTI_PRIORITY = "cn.jpush.android.NOTI_PRIORITY";
    public static final java.lang.String EXTRA_NOTI_TYPE = "cn.jpush.android.NOTIFICATION_TYPE";
    public static final java.lang.String EXTRA_PUSH_ID = "cn.jpush.android.PUSH_ID";
    public static final java.lang.String EXTRA_REGISTRATION_ID = "cn.jpush.android.REGISTRATION_ID";
    public static final java.lang.String EXTRA_RICHPUSH_FILE_PATH = "cn.jpush.android.FILE_PATH";
    public static final java.lang.String EXTRA_RICHPUSH_FILE_TYPE = "cn.jpush.android.FILE_TYPE";
    public static final java.lang.String EXTRA_RICHPUSH_HTML_PATH = "cn.jpush.android.HTML_PATH";
    public static final java.lang.String EXTRA_RICHPUSH_HTML_RES = "cn.jpush.android.HTML_RES";
    public static final java.lang.String EXTRA_STATUS = "cn.jpush.android.STATUS";
    public static final java.lang.String EXTRA_TITLE = "cn.jpush.android.TITLE";
    public static final java.lang.String EXTRA_TYPE_PLATFORM = "cn.jpush.android.TYPE_PLATFORM";
    public static final java.lang.String PUSH_MESSAGE_PERMISSION_POSTFIX = ".permission.JPUSH_MESSAGE";
    private static final java.lang.Integer a = null;

    public static class ErrorCode {
        public static int ERROR_CODE_ALIAS_LIMIT = 6027;
        public static int ERROR_CODE_ALIAS_OPERATORING = 6022;
        public static int ERROR_CODE_APPKEY_NOT_AUTH_TO_SET_PROPERTY = 6036;
        public static int ERROR_CODE_BLACKLIST = 6015;
        public static int ERROR_CODE_GET_FAILED = 6019;
        public static int ERROR_CODE_INTERNEL_SERVER_ERROR = 6024;
        public static int ERROR_CODE_INVALIDREQ = 6017;
        public static int ERROR_CODE_INVALIDUSER = 6016;
        public static int ERROR_CODE_INVALID_MOBILENUMBER = 6023;
        public static int ERROR_CODE_MODE_NOT_MATCH = 6034;
        public static int ERROR_CODE_NOT_PULL_IN_BLOCK_LIST = 6035;
        public static int ERROR_CODE_NO_IN_APP_DATA = 6029;
        public static int ERROR_CODE_OVER_FREQUENCY = 6031;
        public static int ERROR_CODE_OVER_FREQUENCY_SRV = 6030;
        public static int ERROR_CODE_PROPERTIES_OPERATORING = 6038;
        public static int ERROR_CODE_PROPERTY_ERROR = 6037;
        public static int ERROR_CODE_SERVER_INTERNAL_ERROR = 6033;
        public static int ERROR_CODE_SERVER_UNAVAILABLE = 6020;
        public static int ERROR_CODE_STYLE_NOT_SUPPORT = 6032;
        public static int ERROR_CODE_TAG_OPERATORING = 6021;
        public static int ERROR_CODE_TOO_BUSY = 6014;
        public static int ERROR_CODE_TOO_LONG_MOBILENUMBER = 6025;
        public static int ERROR_CODE_TOO_MANY_TAGS = 6018;
        public static int HAS_IN_APP_DATA = 6028;
        public static int INCORRECT_TIME = 6013;
        public static int INVALID_ALIAS = 6003;
        public static int INVALID_JSON = 6010;
        public static int INVALID_TAGS = 6005;
        public static int INVOKE_TOO_SOON = 6011;
        public static int NULL_TAGANDALIAS = 6001;
        public static int PUSH_STOPED = 6012;
        public static int SUCCESS = 0;
        public static int TIMEOUT = 6002;
        public static int TOO_LONG_ALIAS = 6004;
        public static int TOO_LONG_TAGALIAS = 6008;
        public static int TOO_LONG_TAGS = 6006;
        public static int TOO_MANY_TAGS = 6007;
        public static int UNKNOWN_ERROR = 6009;

        static {
                return
        }

        public ErrorCode() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class InAppStyle {
        public static int STYLE_BANNER = 1;
        public static int STYLE_FLOAT = 4;
        public static int STYLE_MODAL = 2;

        static {
                return
        }

        public InAppStyle() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jpush.android.api.JPushInterface.a = r0
            java.lang.Class<cn.jpush.android.helper.b> r0 = cn.jpush.android.helper.b.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "JPUSH"
            cn.jiguang.api.JCoreManager.addDispatchAction(r1, r0)
            return
    }

    public JPushInterface() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addLocalNotification(android.content.Context r0, cn.jpush.android.data.JPushLocalNotification r1) {
            checkContext(r0)
            cn.jpush.android.v.d.a(r0, r1)
            return
    }

    public static void addTags(android.content.Context r6, int r7, java.util.Set<java.lang.String> r8) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r4 = 1
            r5 = 1
            r1 = r6
            r2 = r7
            r3 = r8
            r0.setTagsWithCallBack(r1, r2, r3, r4, r5)
            return
    }

    public static void attachBaseContext(android.content.Context r8) {
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "cn.jpush.android.dy.JPushThirdDyManager"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "attachBaseContext"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3b
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3b
            r3[r7] = r8     // Catch: java.lang.Throwable -> L3b
            r8 = 0
            r2.invoke(r8, r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r8 = "JPushInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r2.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "use time:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3b
            long r3 = r3 - r0
            r2.append(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3b
            cn.jpush.android.helper.Logger.d(r8, r0)     // Catch: java.lang.Throwable -> L3b
        L3b:
            return
    }

    private static void checkContext(android.content.Context r1) {
            if (r1 == 0) goto Ld
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            cn.jpush.android.local.JPushConstants.mApplicationContext = r1
            return
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "NULL context"
            r1.<init>(r0)
            throw r1
    }

    private static boolean checkLengthOfTags(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto Ld
            byte[] r3 = r3.getBytes()
            int r3 = r3.length
            goto Le
        Ld:
            r3 = 0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "tags length:"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "JPushInterface"
            cn.jpush.android.helper.Logger.v(r2, r0)
            r0 = 7000(0x1b58, float:9.809E-42)
            if (r3 > r0) goto L2a
            r3 = 1
            return r3
        L2a:
            return r1
    }

    public static void checkSupportVasMessage(android.content.Context r2, int r3) {
            checkContext(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "type"
            r0.putInt(r1, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "check_vas_integrate"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }

    public static void checkTagBindState(android.content.Context r7, int r8, java.lang.String r9) {
            checkContext(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L13
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r0.add(r9)
        L11:
            r4 = r0
            goto L15
        L13:
            r0 = 0
            goto L11
        L15:
            cn.jpush.android.local.ActionHelper r1 = cn.jpush.android.local.ActionHelper.getInstance()
            r5 = 1
            r6 = 6
            r2 = r7
            r3 = r8
            r1.setTagsWithCallBack(r2, r3, r4, r5, r6)
            return
    }

    public static void cleanProperties(android.content.Context r6, int r7) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = 3
            r5 = 2
            r1 = r6
            r2 = r7
            r0.setPropertyWithCallBack(r1, r2, r3, r4, r5)
            return
    }

    public static void cleanTags(android.content.Context r6, int r7) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 1
            r5 = 4
            r1 = r6
            r2 = r7
            r0.setTagsWithCallBack(r1, r2, r3, r4, r5)
            return
    }

    public static void clearAllNotifications(android.content.Context r3) {
            checkContext(r3)
            java.lang.String r0 = "JPUSH"
            java.lang.String r1 = "clear_all_notify"
            r2 = 0
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r0, r1, r2)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "third_all_notify"
            r0.doSingleAction(r3, r1, r2)
            return
    }

    public static void clearLocalNotifications(android.content.Context r0) {
            checkContext(r0)
            cn.jpush.android.v.d.a(r0)
            return
    }

    public static void clearNotificationById(android.content.Context r2, int r3) {
            checkContext(r2)
            if (r3 > 0) goto Ld
            java.lang.String r2 = "JPushInterface"
            java.lang.String r3 = "Invalid notificationId, Give up action.."
            cn.jpush.android.helper.Logger.ee(r2, r3)
            return
        Ld:
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r0.cancel(r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "id"
            r0.putInt(r1, r3)
            cn.jpush.android.local.ActionHelper r3 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "clear_by_id"
            r3.doSingleAction(r2, r1, r0)
            return
    }

    public static void deleteAlias(android.content.Context r6, int r7) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r4 = 2
            r5 = 3
            r3 = 0
            r1 = r6
            r2 = r7
            r0.setAliasWithCallBack(r1, r2, r3, r4, r5)
            return
    }

    public static void deleteGeofence(android.content.Context r2, java.lang.String r3) {
            checkContext(r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "id"
            r0.putString(r1, r3)
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "delete_geo_fence"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)
            return
    }

    public static void deleteProperties(android.content.Context r6, int r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r4 = 3
            r5 = 1
            r1 = r6
            r2 = r7
            r3 = r8
            r0.setPropertyWithCallBack(r1, r2, r3, r4, r5)
            return
    }

    public static void deleteTags(android.content.Context r6, int r7, java.util.Set<java.lang.String> r8) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r4 = 1
            r5 = 3
            r1 = r6
            r2 = r7
            r3 = r8
            r0.setTagsWithCallBack(r1, r2, r3, r4, r5)
            return
    }

    public static java.util.Set<java.lang.String> filterValidTags(java.util.Set<java.lang.String> r0) {
            java.util.Set r0 = cn.jpush.android.ab.b.a(r0)
            return r0
    }

    public static void getAlias(android.content.Context r6, int r7) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r4 = 2
            r5 = 5
            r3 = 0
            r1 = r6
            r2 = r7
            r0.setAliasWithCallBack(r1, r2, r3, r4, r5)
            return
    }

    public static void getAllTags(android.content.Context r6, int r7) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 1
            r5 = 5
            r1 = r6
            r2 = r7
            r0.setTagsWithCallBack(r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public static boolean getConnectionState(android.content.Context r3) {
            checkContext(r3)
            java.lang.String r0 = "get_connection"
            r1 = 0
            java.lang.String r2 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r2, r0, r1)
            boolean r3 = cn.jiguang.api.JCoreManager.getConnectionState(r3)
            return r3
    }

    public static java.lang.String getRegistrationID(android.content.Context r3) {
            checkContext(r3)
            java.lang.String r0 = "get_rid"
            r1 = 0
            java.lang.String r2 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r2, r0, r1)
            java.lang.String r3 = cn.jpush.android.helper.JCoreHelper.getRegistrationID(r3)
            return r3
    }

    public static java.lang.String getStringTags(java.util.Set<java.lang.String> r0) {
            java.lang.String r0 = cn.jpush.android.ab.b.b(r0)
            return r0
    }

    public static java.lang.String getUdid(android.content.Context r0) {
            checkContext(r0)
            java.lang.String r0 = cn.jpush.android.helper.JCoreHelper.getDeviceId(r0)
            return r0
    }

    public static void goToAppNotificationSettings(android.content.Context r3) {
            java.lang.String r0 = "go_settings"
            r1 = 0
            java.lang.String r2 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r2, r0, r1)
            boolean r0 = cn.jpush.android.x.b.e(r3)
            if (r0 != 0) goto L11
            cn.jpush.android.x.b.f(r3)
        L11:
            return
    }

    public static void init(android.content.Context r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action:init - jpush, SdkVersion:"
            r0.append(r1)
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.SDK_VERSION_NAME
            r0.append(r1)
            java.lang.String r1 = ", build id:"
            r0.append(r1)
            int r1 = cn.jpush.android.local.JPushConstants.BUILD_ID
            r0.append(r1)
            java.lang.String r1 = ", build type:"
            r0.append(r1)
            java.lang.String r1 = "release"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JPushInterface"
            cn.jpush.android.helper.Logger.ki(r1, r0)
            checkContext(r3)
            boolean r0 = cn.jpush.android.ad.a.h(r3)
            if (r0 != 0) goto L36
            return
        L36:
            java.lang.String r0 = "check config suceess!!! "
            cn.jpush.android.helper.Logger.kd(r1, r0)
            cn.jpush.android.local.JPushConstants.init(r3)
            cn.jiguang.api.JCoreManager.init(r3)
            java.lang.String r0 = "init"
            r1 = 0
            java.lang.String r2 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r2, r0, r1)
            return
    }

    public static void init(android.content.Context r2, cn.jpush.android.data.JPushConfig r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action:init - jpush, SdkVersion:"
            r0.append(r1)
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.SDK_VERSION_NAME
            r0.append(r1)
            java.lang.String r1 = ", build id:"
            r0.append(r1)
            int r1 = cn.jpush.android.local.JPushConstants.BUILD_ID
            r0.append(r1)
            java.lang.String r1 = ", build type:"
            r0.append(r1)
            java.lang.String r1 = "release"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JPushInterface"
            cn.jpush.android.helper.Logger.ki(r1, r0)
            checkContext(r2)
            boolean r0 = cn.jpush.android.ad.a.h(r2)
            if (r0 != 0) goto L36
            return
        L36:
            java.lang.String r0 = "check config suceess!!!"
            cn.jpush.android.helper.Logger.kd(r1, r0)
            if (r3 != 0) goto L43
            java.lang.String r2 = "JPushConfig is null, return"
            cn.jpush.android.helper.Logger.kw(r1, r2)
            return
        L43:
            cn.jpush.android.local.JPushConstants.init(r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "config"
            r0.putSerializable(r1, r3)
            java.lang.String r1 = r3.getjAppKey()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L61
            java.lang.String r3 = r3.getjAppKey()
            cn.jiguang.api.JCoreManager.register(r2, r3)
        L61:
            cn.jpush.android.local.ActionHelper r3 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "third_init"
            r3.doSingleAction(r2, r1, r0)
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "init"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)
            return
    }

    public static void initCrashHandler(android.content.Context r0) {
            checkContext(r0)
            cn.jiguang.api.JCoreManager.initCrashHandler(r0)
            return
    }

    public static int isNotificationEnabled(android.content.Context r3) {
            java.lang.String r0 = "is_enable"
            r1 = 0
            java.lang.String r2 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r2, r0, r1)
            int r3 = cn.jpush.android.x.b.d(r3)
            return r3
    }

    public static boolean isPushStopped(android.content.Context r3) {
            checkContext(r3)
            java.lang.String r0 = "check_stop"
            r1 = 0
            java.lang.String r2 = "JPUSH"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r2, r0, r1)
            boolean r3 = cn.jpush.android.cache.a.e(r3)
            return r3
    }

    public static void onFragmentPause(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "f_pause"
            cn.jpush.android.helper.JCoreHelper.saEvent(r2, r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L13
            java.lang.String r2 = "JPushInterface"
            java.lang.String r3 = "fragmentName can not null"
            cn.jpush.android.helper.Logger.ee(r2, r3)
            return
        L13:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "activity_name"
            r0.putString(r1, r3)
            java.lang.String r3 = "state"
            r1 = 0
            r0.putBoolean(r3, r1)
            cn.jpush.android.local.ActionHelper r3 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "sync_fragment_life"
            r3.doSingleAction(r2, r1, r0)
            return
    }

    public static void onFragmentResume(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "f_resume"
            cn.jpush.android.helper.JCoreHelper.saEvent(r2, r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L13
            java.lang.String r2 = "JPushInterface"
            java.lang.String r3 = "fragmentName can not null"
            cn.jpush.android.helper.Logger.ee(r2, r3)
            return
        L13:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "activity_name"
            r0.putString(r1, r3)
            java.lang.String r3 = "state"
            r1 = 1
            r0.putBoolean(r3, r1)
            cn.jpush.android.local.ActionHelper r3 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "sync_fragment_life"
            r3.doSingleAction(r2, r1, r0)
            return
    }

    public static void onKillProcess(android.content.Context r2) {
            java.lang.String r0 = "kill"
            r1 = 0
            cn.jpush.android.helper.JCoreHelper.saEvent(r2, r0, r1)
            return
    }

    public static void onPause(android.content.Context r2) {
            java.lang.String r0 = "pause"
            r1 = 0
            cn.jpush.android.helper.JCoreHelper.saEvent(r2, r0, r1)
            return
    }

    public static void onResume(android.content.Context r2) {
            java.lang.String r0 = "resume"
            r1 = 0
            cn.jpush.android.helper.JCoreHelper.saEvent(r2, r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void pullInAppMessage(android.content.Context r2, int r3) {
            checkContext(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "sequence"
            r0.putInt(r1, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "in_app_req"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }

    @java.lang.Deprecated
    public static void pullInAppMessage(android.content.Context r2, int r3, int r4) {
            checkContext(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "sequence"
            r0.putInt(r1, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "type"
            r0.putInt(r3, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "JPUSH"
            java.lang.String r4 = "in_app_req"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public static void pullInAppMessage(android.content.Context r2, int r3, java.lang.String r4) {
            checkContext(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "sequence"
            r0.putInt(r1, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "AdPositionKey"
            r0.putString(r3, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "JPUSH"
            java.lang.String r4 = "in_app_req"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    public static void pullInAppMessageWithParams(android.content.Context r2, cn.jpush.android.api.InAppSlotParams r3) {
            checkContext(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L13
            java.lang.String r1 = "inapp_param"
            java.lang.String r3 = r3.toJSONString()     // Catch: java.lang.Throwable -> L1a
            r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L1a
        L13:
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "in_app_req"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    public static void registerByKey(android.content.Context r2, java.lang.String r3) {
            checkContext(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "devKey is not valid - "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "JPushInterface"
            cn.jpush.android.helper.Logger.ee(r3, r2)
            return
        L20:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "dev_key"
            r0.putString(r1, r3)
            cn.jpush.android.local.ActionHelper r3 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "dy_register"
            r3.doSingleAction(r2, r1, r0)
            return
    }

    public static void removeLocalNotification(android.content.Context r0, long r1) {
            checkContext(r0)
            cn.jpush.android.v.d.a(r0, r1)
            return
    }

    public static void reportMessageOpened(android.content.Context r6, java.lang.String r7, byte r8) {
            checkContext(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L20
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "The msgId is not valid - "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "JPushInterface"
            cn.jpush.android.helper.Logger.ee(r7, r6)
            return
        L20:
            java.lang.String r1 = ""
            r3 = 1028(0x404, double:5.08E-321)
            r5 = r6
            r0 = r7
            r2 = r8
            cn.jpush.android.helper.c.a(r0, r1, r2, r3, r5)
            return
    }

    public static void reportNotificationOpened(android.content.Context r2, java.lang.String r3) {
            checkContext(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "The msgId is not valid - "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "JPushInterface"
            cn.jpush.android.helper.Logger.ee(r3, r2)
            return
        L20:
            r0 = 1028(0x404, double:5.08E-321)
            cn.jpush.android.helper.c.a(r3, r0, r2)
            return
    }

    public static void reportNotificationOpened(android.content.Context r0, java.lang.String r1, byte r2) {
            return
    }

    public static void reportNotificationOpened(android.content.Context r0, java.lang.String r1, byte r2, java.lang.String r3) {
            return
    }

    public static void reportWakedData(android.content.Context r0, android.os.Bundle r1, int r2) {
            checkContext(r0)
            cn.jiguang.api.JCoreManager.reportWakedData(r0, r1, r2)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            java.lang.String r0 = "JPushInterface"
            java.lang.String r1 = "not found [reportWakedData] in jcore"
            cn.jpush.android.helper.Logger.ee(r0, r1)
            return
    }

    public static void requestPermission(android.content.Context r1) {
            if (r1 != 0) goto La
            java.lang.String r1 = "JPushInterface"
            java.lang.String r0 = "[requestPermission] unexcepted - context was null"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            return
        La:
            cn.jiguang.api.JCoreManager.requestPermission(r1)
            return
    }

    public static void requestRequiredPermission(android.app.Activity r1) {
            if (r1 != 0) goto La
            java.lang.String r1 = "JPushInterface"
            java.lang.String r0 = "[requestRequiredPermission] unexcepted - context was null"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            return
        La:
            cn.jpush.android.ad.a.l(r1)
            return
    }

    public static void resumePush(android.content.Context r3) {
            java.lang.String r0 = "JPushInterface"
            java.lang.String r1 = "action:resumePush"
            cn.jpush.android.helper.Logger.kd(r0, r1)
            checkContext(r3)
            java.lang.String r0 = "JPUSH"
            java.lang.String r1 = "resume"
            r2 = 0
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r0, r1, r2)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r1 = "third_resume"
            r0.doSingleAction(r3, r1, r2)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r1 = 4
            r2 = 1
            r0.setPushStatusWithCallBack(r3, r1, r2)
            return
    }

    public static void setAlias(android.content.Context r6, int r7, java.lang.String r8) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r4 = 2
            r5 = 2
            r1 = r6
            r2 = r7
            r3 = r8
            r0.setAliasWithCallBack(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "current use set alias is:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "JPushInterface"
            cn.jpush.android.helper.Logger.kd(r7, r6)
            return
    }

    @java.lang.Deprecated
    public static void setAlias(android.content.Context r1, java.lang.String r2, cn.jpush.android.api.TagAliasCallback r3) {
            checkContext(r1)
            r0 = 0
            setAliasAndTags(r1, r2, r0, r3)
            return
    }

    @java.lang.Deprecated
    public static void setAliasAndTags(android.content.Context r7, java.lang.String r8, java.util.Set<java.lang.String> r9, cn.jpush.android.api.TagAliasCallback r10) {
            checkContext(r7)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.setAliasAndTagsWithCallBack(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void setBadgeNumber(android.content.Context r2, int r3) {
            android.content.Context r2 = cn.jpush.android.local.JPushConstants.getAppContext(r2)
            if (r3 >= 0) goto L7
            r3 = 0
        L7:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "num"
            r0.putInt(r1, r3)
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "set_badge"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)
            return
    }

    public static void setChannel(android.content.Context r0, java.lang.String r1) {
            cn.jpush.android.helper.JCoreHelper.setChannel(r0, r1)
            return
    }

    public static void setCollectControl(android.content.Context r6, cn.jpush.android.data.JPushCollectControl r7) {
            checkContext(r6)
            if (r7 == 0) goto L28
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L28
            r4.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = "enable_c_c"
            java.util.ArrayList r1 = r7.getEnableDatas()     // Catch: java.lang.Throwable -> L28
            r4.putIntegerArrayList(r0, r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = "disable_c_c"
            java.util.ArrayList r7 = r7.getDisableDatas()     // Catch: java.lang.Throwable -> L28
            r4.putIntegerArrayList(r0, r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "JPUSH"
            r7 = 0
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L28
            r2 = 111(0x6f, float:1.56E-43)
            r3 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    public static void setDaemonAction(java.lang.String r0) {
            return
    }

    public static void setDataInsightsEnable(android.content.Context r6, boolean r7) {
            java.lang.String r0 = "JPUSH"
            java.lang.String r1 = " jcore version="
            java.lang.String r2 = "JPushInterface"
            java.lang.String r3 = "enable_data_insights"
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L81
            r4.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "enable"
            r4.putBoolean(r5, r7)     // Catch: java.lang.Throwable -> L81
            r4.putBoolean(r3, r7)     // Catch: java.lang.Throwable -> L81
            cn.jpush.android.cache.a.g(r6, r7)     // Catch: java.lang.Throwable -> L81
            int r7 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L62
            r5 = 490(0x1ea, float:6.87E-43)
            if (r7 < r5) goto L42
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "setDataInsightsEnable   bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            r7.append(r4)     // Catch: java.lang.Throwable -> L62
            r7.append(r1)     // Catch: java.lang.Throwable -> L62
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L62
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.local.ActionHelper r7 = cn.jpush.android.local.ActionHelper.getInstance()     // Catch: java.lang.Throwable -> L62
            r7.doSingleAction(r6, r3, r4)     // Catch: java.lang.Throwable -> L62
            goto L81
        L42:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "setDataInsightsEnable  runActionWithService bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            r7.append(r4)     // Catch: java.lang.Throwable -> L62
            r7.append(r1)     // Catch: java.lang.Throwable -> L62
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L62
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r6, r0, r3, r4)     // Catch: java.lang.Throwable -> L62
            goto L81
        L62:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r7.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "setDataInsightsEnable  err runActionWithService bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L81
            r7.append(r4)     // Catch: java.lang.Throwable -> L81
            r7.append(r1)     // Catch: java.lang.Throwable -> L81
            int r1 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L81
            r7.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L81
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L81
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r6, r0, r3, r4)     // Catch: java.lang.Throwable -> L81
        L81:
            return
    }

    public static void setDebugMode(boolean r0) {
            cn.jiguang.api.JCoreManager.setDebugMode(r0)
            return
    }

    private static void setDefaultNotifactionNumber(android.content.Context r1) {
            int r0 = cn.jpush.android.api.JPushInterface.DEFAULT_NOTIFICATION_NUM
            setLatestNotificationNumber(r1, r0)
            return
    }

    public static void setDefaultPushNotificationBuilder(cn.jpush.android.api.PushNotificationBuilder r3) {
            if (r3 == 0) goto L25
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Integer r1 = cn.jpush.android.api.JPushInterface.a
            int r1 = r1.intValue()
            java.lang.String r2 = "buidler_id"
            r0.putInt(r2, r1)
            java.lang.String r1 = "buidler_string"
            java.lang.String r3 = r3.toString()
            r0.putString(r1, r3)
            android.content.Context r3 = cn.jpush.android.local.JPushConstants.mApplicationContext
            java.lang.String r1 = "JPUSH"
            java.lang.String r2 = "set_custom_notify"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r1, r2, r0)
            return
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "NULL notification"
            r3.<init>(r0)
            throw r3
    }

    public static void setGeofenceEnable(android.content.Context r6, boolean r7) {
            java.lang.String r0 = "JPUSH"
            java.lang.String r1 = " jcore version="
            java.lang.String r2 = "JPushInterface"
            java.lang.String r3 = "enable_geo_push"
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L81
            r4.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "enable"
            r4.putBoolean(r5, r7)     // Catch: java.lang.Throwable -> L81
            r4.putBoolean(r3, r7)     // Catch: java.lang.Throwable -> L81
            cn.jpush.android.cache.a.e(r6, r7)     // Catch: java.lang.Throwable -> L81
            int r7 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L62
            r5 = 490(0x1ea, float:6.87E-43)
            if (r7 < r5) goto L42
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "setGeofenceEnable  for 129 bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            r7.append(r4)     // Catch: java.lang.Throwable -> L62
            r7.append(r1)     // Catch: java.lang.Throwable -> L62
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L62
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.local.ActionHelper r7 = cn.jpush.android.local.ActionHelper.getInstance()     // Catch: java.lang.Throwable -> L62
            r7.doSingleAction(r6, r3, r4)     // Catch: java.lang.Throwable -> L62
            goto L81
        L42:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "setGeofenceEnable  runActionWithService bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            r7.append(r4)     // Catch: java.lang.Throwable -> L62
            r7.append(r1)     // Catch: java.lang.Throwable -> L62
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L62
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r6, r0, r3, r4)     // Catch: java.lang.Throwable -> L62
            goto L81
        L62:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r7.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "setGeofenceEnable  err runActionWithService bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L81
            r7.append(r4)     // Catch: java.lang.Throwable -> L81
            r7.append(r1)     // Catch: java.lang.Throwable -> L81
            int r1 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L81
            r7.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L81
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L81
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r6, r0, r3, r4)     // Catch: java.lang.Throwable -> L81
        L81:
            return
    }

    public static void setGeofenceInterval(android.content.Context r3, long r4) {
            checkContext(r3)
            r0 = 180000(0x2bf20, double:8.8932E-319)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L24
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L12
            goto L24
        L12:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "interval"
            r0.putLong(r1, r4)
            java.lang.String r4 = "JPUSH"
            java.lang.String r5 = "geo_interval"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r4, r5, r0)
            return
        L24:
            java.lang.String r3 = "JPushInterface"
            java.lang.String r4 = "Invalid interval, it should be a ms number between 3 mins and 1 day!"
            cn.jpush.android.helper.Logger.ee(r3, r4)
            return
    }

    public static void setHbPeriodEnable(android.content.Context r2, boolean r3) {
            checkContext(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "enable"
            r0.putBoolean(r1, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "set_hb_period_enable"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }

    public static void setLatestNotificationNumber(android.content.Context r2, int r3) {
            checkContext(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action:setLatestNotificationNumber : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JPushInterface"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            if (r3 > 0) goto L21
            java.lang.String r2 = "maxNum should > 0, Give up action.."
            cn.jpush.android.helper.Logger.ee(r1, r2)
            return
        L21:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "num"
            r0.putInt(r1, r3)
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "max_num"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)
            return
    }

    public static void setLinkMergeEnable(android.content.Context r6, boolean r7) {
            java.lang.String r0 = "JPUSH"
            java.lang.String r1 = " jcore version="
            java.lang.String r2 = "JPushInterface"
            java.lang.String r3 = "enable_link_push"
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "enable"
            r4.putBoolean(r5, r7)     // Catch: java.lang.Throwable -> L84
            r4.putBoolean(r3, r7)     // Catch: java.lang.Throwable -> L84
            cn.jpush.android.cache.a.f(r6, r7)     // Catch: java.lang.Throwable -> L84
            cn.jiguang.api.JCoreInterface.setWakeEnable(r6, r7)     // Catch: java.lang.Throwable -> L84
            int r7 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L65
            r5 = 490(0x1ea, float:6.87E-43)
            if (r7 < r5) goto L45
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r7.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "setLinkMergeEnable  for 129 bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L65
            r7.append(r4)     // Catch: java.lang.Throwable -> L65
            r7.append(r1)     // Catch: java.lang.Throwable -> L65
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L65
            r7.append(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L65
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L65
            cn.jpush.android.local.ActionHelper r7 = cn.jpush.android.local.ActionHelper.getInstance()     // Catch: java.lang.Throwable -> L65
            r7.doSingleAction(r6, r3, r4)     // Catch: java.lang.Throwable -> L65
            goto L84
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r7.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "setLinkMergeEnable  runActionWithService bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L65
            r7.append(r4)     // Catch: java.lang.Throwable -> L65
            r7.append(r1)     // Catch: java.lang.Throwable -> L65
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L65
            r7.append(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L65
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L65
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r6, r0, r3, r4)     // Catch: java.lang.Throwable -> L65
            goto L84
        L65:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r7.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "setLinkMergeEnable  err runActionWithService bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L84
            r7.append(r4)     // Catch: java.lang.Throwable -> L84
            r7.append(r1)     // Catch: java.lang.Throwable -> L84
            int r1 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L84
            r7.append(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L84
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L84
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r6, r0, r3, r4)     // Catch: java.lang.Throwable -> L84
        L84:
            return
    }

    public static void setMaxGeofenceNumber(android.content.Context r2, int r3) {
            checkContext(r2)
            r0 = 1
            if (r3 < r0) goto L1d
            r0 = 100
            if (r3 <= r0) goto Lb
            goto L1d
        Lb:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "num"
            r0.putInt(r1, r3)
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "geo_fence_max_num"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)
            return
        L1d:
            java.lang.String r2 = "JPushInterface"
            java.lang.String r3 = "Invalid maxNumber,it should be a number between 1 and 100!"
            cn.jpush.android.helper.Logger.ee(r2, r3)
            return
    }

    public static void setMobileNumber(android.content.Context r1, int r2, java.lang.String r3) {
            checkContext(r1)
            cn.jpush.android.helper.d r0 = cn.jpush.android.helper.d.a()
            r0.a(r1, r2, r3)
            return
    }

    public static void setNotificationCallBackEnable(android.content.Context r2, boolean r3) {
            java.lang.String r0 = "JPushInterface"
            java.lang.String r1 = "setNotificationCallBackEnable"
            cn.jpush.android.helper.Logger.dd(r0, r1)
            checkContext(r2)
            cn.jpush.android.cache.a.h(r2, r3)     // Catch: java.lang.Throwable -> L1e
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "enable"
            r0.putBoolean(r1, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "enable_notification_callback"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L1e
        L1e:
            return
    }

    public static void setPowerSaveMode(android.content.Context r0, boolean r1) {
            return
    }

    public static void setProperties(android.content.Context r6, int r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r4 = 3
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r0.setPropertyWithCallBack(r1, r2, r3, r4, r5)
            return
    }

    public static void setPushNotificationBuilder(java.lang.Integer r3, cn.jpush.android.api.PushNotificationBuilder r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action:setPushNotificationBuilder - id:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JPushInterface"
            cn.jpush.android.helper.Logger.vv(r1, r0)
            if (r4 == 0) goto L46
            int r0 = r3.intValue()
            r2 = 1
            if (r0 >= r2) goto L25
            java.lang.String r3 = "id should be larger than 0"
            cn.jpush.android.helper.Logger.ee(r1, r3)
            return
        L25:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "buidler_id"
            int r3 = r3.intValue()
            r0.putInt(r1, r3)
            java.lang.String r3 = "buidler_string"
            java.lang.String r4 = r4.toString()
            r0.putString(r3, r4)
            android.content.Context r3 = cn.jpush.android.local.JPushConstants.mApplicationContext
            java.lang.String r4 = "JPUSH"
            java.lang.String r1 = "set_custom_notify"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r4, r1, r0)
            return
        L46:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "NULL pushNotificationBuilder"
            r3.<init>(r4)
            throw r3
    }

    public static void setPushTime(android.content.Context r8, java.util.Set<java.lang.Integer> r9, int r10, int r11) {
            checkContext(r8)
            boolean r0 = cn.jpush.android.ad.a.a(r8)
            java.lang.String r1 = "JPushInterface"
            if (r0 != 0) goto L11
            java.lang.String r0 = "检测到当前没有网络。此动作将在有网络时自动继续执行。"
            cn.jpush.android.helper.Logger.dd(r1, r0)
        L11:
            java.lang.String r0 = "pushtime"
            java.lang.String r2 = "time"
            java.lang.String r3 = "JPUSH"
            if (r9 != 0) goto L27
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r10 = "0123456_0^23"
            r9.putString(r2, r10)
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r8, r3, r0, r9)
            return
        L27:
            int r4 = r9.size()
            if (r4 == 0) goto L98
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L34
            goto L98
        L34:
            if (r10 <= r11) goto L3c
            java.lang.String r8 = "Invalid time format - startHour should less than endHour"
            cn.jpush.android.helper.Logger.ee(r1, r8)
            return
        L3c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r9 = r9.iterator()
        L45:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L78
            java.lang.Object r5 = r9.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            r7 = 6
            if (r6 > r7) goto L63
            int r6 = r5.intValue()
            if (r6 >= 0) goto L5f
            goto L63
        L5f:
            r4.append(r5)
            goto L45
        L63:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid day format - "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            cn.jpush.android.helper.Logger.ee(r1, r8)
            return
        L78:
            java.lang.String r9 = "_"
            r4.append(r9)
            r4.append(r10)
            java.lang.String r9 = "^"
            r4.append(r9)
            r4.append(r11)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r10 = r4.toString()
            r9.putString(r2, r10)
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r8, r3, r0, r9)
            return
        L98:
            java.lang.String r9 = "disable_push"
            r10 = 0
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r8, r3, r9, r10)
            return
    }

    public static void setSilenceTime(android.content.Context r5, int r6, int r7, int r8, int r9) {
            checkContext(r5)
            java.lang.String r0 = "JPushInterface"
            if (r6 < 0) goto L64
            if (r7 < 0) goto L64
            if (r8 < 0) goto L64
            if (r9 < 0) goto L64
            r1 = 59
            if (r7 > r1) goto L64
            if (r9 > r1) goto L64
            r1 = 23
            if (r8 > r1) goto L64
            if (r6 <= r1) goto L1a
            goto L64
        L1a:
            java.lang.String r1 = "silenceTime"
            java.lang.String r2 = "JPUSH"
            java.lang.String r3 = "time"
            if (r6 != 0) goto L3b
            if (r7 != 0) goto L3b
            if (r8 != 0) goto L3b
            if (r9 != 0) goto L3b
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = ""
            r6.putString(r3, r7)
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r5, r2, r1, r6)
            java.lang.String r5 = "Remove the silence time!"
            cn.jpush.android.helper.Logger.dd(r0, r5)
            return
        L3b:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r4 = "startHour"
            r0.put(r4, r6)     // Catch: org.json.JSONException -> L63
            java.lang.String r6 = "startMins"
            r0.put(r6, r7)     // Catch: org.json.JSONException -> L63
            java.lang.String r6 = "endHour"
            r0.put(r6, r8)     // Catch: org.json.JSONException -> L63
            java.lang.String r6 = "endtMins"
            r0.put(r6, r9)     // Catch: org.json.JSONException -> L63
            android.os.Bundle r6 = new android.os.Bundle     // Catch: org.json.JSONException -> L63
            r6.<init>()     // Catch: org.json.JSONException -> L63
            java.lang.String r7 = r0.toString()     // Catch: org.json.JSONException -> L63
            r6.putString(r3, r7)     // Catch: org.json.JSONException -> L63
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r5, r2, r1, r6)     // Catch: org.json.JSONException -> L63
        L63:
            return
        L64:
            java.lang.String r5 = "Invalid parameter format, startHour and endHour should between 0 ~ 23, startMins and endMins should between 0 ~ 59. "
            cn.jpush.android.helper.Logger.ee(r0, r5)
            return
    }

    public static void setSmartPushEnable(android.content.Context r6, boolean r7) {
            java.lang.String r0 = "JPUSH"
            java.lang.String r1 = " jcore version="
            java.lang.String r2 = "JPushInterface"
            java.lang.String r3 = "enable_smart_push"
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L81
            r4.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "enable"
            r4.putBoolean(r5, r7)     // Catch: java.lang.Throwable -> L81
            r4.putBoolean(r3, r7)     // Catch: java.lang.Throwable -> L81
            cn.jpush.android.cache.a.i(r6, r7)     // Catch: java.lang.Throwable -> L81
            int r7 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L62
            r5 = 490(0x1ea, float:6.87E-43)
            if (r7 < r5) goto L42
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "setSmartPushEnable  for 129 bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            r7.append(r4)     // Catch: java.lang.Throwable -> L62
            r7.append(r1)     // Catch: java.lang.Throwable -> L62
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L62
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.local.ActionHelper r7 = cn.jpush.android.local.ActionHelper.getInstance()     // Catch: java.lang.Throwable -> L62
            r7.doSingleAction(r6, r3, r4)     // Catch: java.lang.Throwable -> L62
            goto L81
        L42:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "setSmartPushEnable  runActionWithService bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            r7.append(r4)     // Catch: java.lang.Throwable -> L62
            r7.append(r1)     // Catch: java.lang.Throwable -> L62
            int r5 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L62
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L62
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r6, r0, r3, r4)     // Catch: java.lang.Throwable -> L62
            goto L81
        L62:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r7.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "setSmartPushEnable  err runActionWithService bundle="
            r7.append(r5)     // Catch: java.lang.Throwable -> L81
            r7.append(r4)     // Catch: java.lang.Throwable -> L81
            r7.append(r1)     // Catch: java.lang.Throwable -> L81
            int r1 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L81
            r7.append(r1)     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L81
            cn.jpush.android.helper.Logger.d(r2, r7)     // Catch: java.lang.Throwable -> L81
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r6, r0, r3, r4)     // Catch: java.lang.Throwable -> L81
        L81:
            return
    }

    public static void setStatisticsEnable(boolean r0) {
            return
    }

    public static void setStatisticsSessionTimeout(long r0) {
            return
    }

    public static void setTags(android.content.Context r6, int r7, java.util.Set<java.lang.String> r8) {
            checkContext(r6)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r4 = 1
            r5 = 2
            r1 = r6
            r2 = r7
            r3 = r8
            r0.setTagsWithCallBack(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "current use set tags is:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "JPushInterface"
            cn.jpush.android.helper.Logger.kd(r7, r6)
            return
    }

    @java.lang.Deprecated
    public static void setTags(android.content.Context r1, java.util.Set<java.lang.String> r2, cn.jpush.android.api.TagAliasCallback r3) {
            checkContext(r1)
            r0 = 0
            setAliasAndTags(r1, r0, r2, r3)
            return
    }

    public static void setThirdPushEnable(android.content.Context r2, boolean r3) {
            cn.jpush.android.local.JPushConstants.THIRD_ENABLE = r3     // Catch: java.lang.Throwable -> L15
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "enable"
            r0.putBoolean(r1, r3)     // Catch: java.lang.Throwable -> L15
            cn.jpush.android.local.ActionHelper r3 = cn.jpush.android.local.ActionHelper.getInstance()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "third_enable"
            r3.doSingleAction(r2, r1, r0)     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    public static void setThirdToken(android.content.Context r2, java.lang.String r3) {
            boolean r0 = cn.jpush.android.local.JPushConstants.THIRD_ENABLE
            if (r0 != 0) goto Lc
            java.lang.String r2 = "JPushInterface"
            java.lang.String r3 = "thirdEnable is false,won't set third token"
            cn.jpush.android.helper.Logger.ee(r2, r3)
            return
        Lc:
            checkContext(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "third_token"
            r0.putString(r1, r3)     // Catch: java.lang.Throwable -> L22
            cn.jpush.android.local.ActionHelper r3 = cn.jpush.android.local.ActionHelper.getInstance()     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "set_third_token"
            r3.doSingleAction(r2, r1, r0)     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    public static void si(android.content.Context r2, android.os.Bundle r3) {
            checkContext(r2)
            java.lang.String r0 = "JPUSH"
            java.lang.String r1 = "si"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r0, r1, r3)
            return
    }

    public static void stopCrashHandler(android.content.Context r0) {
            checkContext(r0)
            cn.jiguang.api.JCoreManager.stopCrashHandler(r0)
            return
    }

    public static void stopPush(android.content.Context r3) {
            java.lang.String r0 = "JPushInterface"
            java.lang.String r1 = "action:stopPush"
            cn.jpush.android.helper.Logger.kd(r0, r1)
            checkContext(r3)
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            r1 = 4
            r2 = 0
            r0.setPushStatusWithCallBack(r3, r1, r2)
            return
    }

    private static void taq() {
            cn.jpush.android.local.JPushConstants.testAndroidQ()
            return
    }

    public static void triggerInAppMsgByEvent(android.content.Context r2, int r3, java.lang.String r4) {
            checkContext(r2)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "sequence"
            r0.putInt(r1, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "event_name"
            r0.putString(r3, r4)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "JPUSH"
            java.lang.String r4 = "trigger_in_app_event"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    @java.lang.Deprecated
    public void setAliasAndTags(android.content.Context r2, java.lang.String r3, java.util.Set<java.lang.String> r4) {
            r1 = this;
            checkContext(r2)
            r0 = 0
            setAliasAndTags(r2, r3, r4, r0)
            return
    }
}
