package com.umeng.commonsdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMConfigure {
    public static com.umeng.analytics.MobclickAgent.PageMode AUTO_ACTIVITY_PAGE_COLLECTION = null;
    private static final java.lang.String[] BUSINESS_TYPE = null;
    public static final int DEVICE_TYPE_BOX = 2;
    public static final int DEVICE_TYPE_PHONE = 1;
    private static final java.lang.String KEY_FILE_NAME_APPKEY = "APPKEY";
    private static final java.lang.String KEY_FILE_NAME_LOG = "LOG";
    private static final java.lang.String KEY_METHOD_NAME_PUSH_SETCHANNEL = "setMessageChannel";
    private static final java.lang.String KEY_METHOD_NAME_PUSH_SET_SECRET = "setSecret";
    private static final java.lang.String KEY_METHOD_NAME_SETAPPKEY = "setAppkey";
    private static final java.lang.String KEY_METHOD_NAME_SETCHANNEL = "setChannel";
    private static final java.lang.String KEY_METHOD_NAME_SETDEBUGMODE = "setDebugMode";
    private static java.lang.Object PreInitLock = null;
    private static final java.lang.String TAG = "UMConfigure";
    private static final java.lang.String WRAPER_TYPE_COCOS2DX_X = "Cocos2d-x";
    private static final java.lang.String WRAPER_TYPE_COCOS2DX_XLUA = "Cocos2d-x_lua";
    private static final java.lang.String WRAPER_TYPE_FLUTTER = "flutter";
    private static final java.lang.String WRAPER_TYPE_HYBRID = "hybrid";
    private static final java.lang.String WRAPER_TYPE_NATIVE = "native";
    private static final java.lang.String WRAPER_TYPE_PHONEGAP = "phonegap";
    private static final java.lang.String WRAPER_TYPE_REACTNATIVE = "react-native";
    private static final java.lang.String WRAPER_TYPE_UNITY = "Unity";
    private static final java.lang.String WRAPER_TYPE_WEEX = "weex";
    private static boolean debugLog;
    private static boolean isFinish;
    public static boolean isInit;
    private static java.lang.Object lock;
    private static java.lang.Object lockObject;
    private static com.umeng.commonsdk.listener.OnGetOaidListener mOnGetOaidListener;
    private static int policyGrantInvokedFlag;
    private static int policyGrantResult;
    private static boolean preInitComplete;
    private static int preInitInvokedFlag;
    public static java.lang.String sAppkey;
    public static java.lang.String sChannel;
    private static boolean shouldCheckShareSdk;
    private static boolean shouldCollectAid;
    private static volatile boolean shouldOutputRT;
    public static com.umeng.commonsdk.debug.UMLog umDebugLog;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BS_TYPE extends java.lang.Enum<com.umeng.commonsdk.UMConfigure.BS_TYPE> {
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE ABTEST = null;
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE APM = null;
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE GAME = null;
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE PUSH = null;
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE SHARE = null;
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE ULINK = null;
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE UREC = null;
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE USMS = null;
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE UVERIFY = null;
        public static final com.umeng.commonsdk.UMConfigure.BS_TYPE ZID = null;
        private static final /* synthetic */ com.umeng.commonsdk.UMConfigure.BS_TYPE[] a = null;

        static {
                com.umeng.commonsdk.UMConfigure$BS_TYPE r0 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                java.lang.String r1 = "APM"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.APM = r0
                com.umeng.commonsdk.UMConfigure$BS_TYPE r1 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                java.lang.String r3 = "PUSH"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.PUSH = r1
                com.umeng.commonsdk.UMConfigure$BS_TYPE r3 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                java.lang.String r5 = "SHARE"
                r6 = 2
                r3.<init>(r5, r6)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.SHARE = r3
                com.umeng.commonsdk.UMConfigure$BS_TYPE r5 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                java.lang.String r7 = "ULINK"
                r8 = 3
                r5.<init>(r7, r8)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.ULINK = r5
                com.umeng.commonsdk.UMConfigure$BS_TYPE r7 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                java.lang.String r9 = "UVERIFY"
                r10 = 4
                r7.<init>(r9, r10)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.UVERIFY = r7
                com.umeng.commonsdk.UMConfigure$BS_TYPE r9 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                java.lang.String r11 = "USMS"
                r12 = 5
                r9.<init>(r11, r12)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.USMS = r9
                com.umeng.commonsdk.UMConfigure$BS_TYPE r11 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                java.lang.String r13 = "UREC"
                r14 = 6
                r11.<init>(r13, r14)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.UREC = r11
                com.umeng.commonsdk.UMConfigure$BS_TYPE r13 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                java.lang.String r15 = "ABTEST"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.ABTEST = r13
                com.umeng.commonsdk.UMConfigure$BS_TYPE r15 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                r17 = 7
                java.lang.String r2 = "GAME"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.GAME = r15
                com.umeng.commonsdk.UMConfigure$BS_TYPE r2 = new com.umeng.commonsdk.UMConfigure$BS_TYPE
                r19 = 8
                java.lang.String r4 = "ZID"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                com.umeng.commonsdk.UMConfigure.BS_TYPE.ZID = r2
                r4 = 10
                com.umeng.commonsdk.UMConfigure$BS_TYPE[] r4 = new com.umeng.commonsdk.UMConfigure.BS_TYPE[r4]
                r4[r16] = r0
                r4[r18] = r1
                r4[r20] = r3
                r4[r8] = r5
                r4[r10] = r7
                r4[r12] = r9
                r4[r14] = r11
                r4[r17] = r13
                r4[r19] = r15
                r4[r6] = r2
                com.umeng.commonsdk.UMConfigure.BS_TYPE.a = r4
                return
        }

        BS_TYPE(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.commonsdk.UMConfigure.BS_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.commonsdk.UMConfigure$BS_TYPE> r0 = com.umeng.commonsdk.UMConfigure.BS_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.commonsdk.UMConfigure$BS_TYPE r1 = (com.umeng.commonsdk.UMConfigure.BS_TYPE) r1
                return r1
        }

        public static com.umeng.commonsdk.UMConfigure.BS_TYPE[] values() {
                com.umeng.commonsdk.UMConfigure$BS_TYPE[] r0 = com.umeng.commonsdk.UMConfigure.BS_TYPE.a
                java.lang.Object r0 = r0.clone()
                com.umeng.commonsdk.UMConfigure$BS_TYPE[] r0 = (com.umeng.commonsdk.UMConfigure.BS_TYPE[]) r0
                return r0
        }
    }

    static {
            com.umeng.commonsdk.debug.UMLog r0 = new com.umeng.commonsdk.debug.UMLog
            r0.<init>()
            com.umeng.commonsdk.UMConfigure.umDebugLog = r0
            r0 = 0
            com.umeng.commonsdk.UMConfigure.preInitComplete = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            com.umeng.commonsdk.UMConfigure.PreInitLock = r1
            java.lang.String r1 = ""
            com.umeng.commonsdk.UMConfigure.sAppkey = r1
            com.umeng.commonsdk.UMConfigure.sChannel = r1
            com.umeng.commonsdk.UMConfigure.isInit = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            com.umeng.commonsdk.UMConfigure.lock = r1
            com.umeng.commonsdk.UMConfigure.preInitInvokedFlag = r0
            com.umeng.commonsdk.UMConfigure.policyGrantInvokedFlag = r0
            com.umeng.commonsdk.UMConfigure.policyGrantResult = r0
            r1 = 1
            com.umeng.commonsdk.UMConfigure.shouldCheckShareSdk = r1
            com.umeng.commonsdk.UMConfigure.shouldCollectAid = r1
            com.umeng.commonsdk.UMConfigure.shouldOutputRT = r0
            com.umeng.analytics.MobclickAgent$PageMode r1 = com.umeng.analytics.MobclickAgent.PageMode.AUTO
            com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION = r1
            java.lang.String r10 = "game"
            java.lang.String r11 = "zid"
            java.lang.String r2 = "apm"
            java.lang.String r3 = "push"
            java.lang.String r4 = "share"
            java.lang.String r5 = "ulink"
            java.lang.String r6 = "uverify"
            java.lang.String r7 = "usms"
            java.lang.String r8 = "urec"
            java.lang.String r9 = "abtest"
            java.lang.String[] r1 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            com.umeng.commonsdk.UMConfigure.BUSINESS_TYPE = r1
            com.umeng.commonsdk.UMConfigure.isFinish = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.UMConfigure.lockObject = r0
            return
    }

    public UMConfigure() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.umeng.commonsdk.listener.OnGetOaidListener access$000() {
            com.umeng.commonsdk.listener.OnGetOaidListener r0 = com.umeng.commonsdk.UMConfigure.mOnGetOaidListener
            return r0
    }

    private static boolean checkShareSdk(java.lang.Class<?> r1) {
            java.lang.String r0 = "isZyb"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static void deleteModuleTag(com.umeng.commonsdk.UMConfigure.BS_TYPE r3, java.lang.String r4) {
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto La
            return
        La:
            java.lang.String r0 = r4.trim()     // Catch: java.lang.Throwable -> L43
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L43
            int r0 = r0.length     // Catch: java.lang.Throwable -> L43
            r1 = 64
            if (r0 <= r1) goto L18
            return
        L18:
            int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = ""
            java.lang.String[] r1 = com.umeng.commonsdk.UMConfigure.BUSINESS_TYPE     // Catch: java.lang.Throwable -> L43
            int r2 = r1.length     // Catch: java.lang.Throwable -> L43
            if (r3 >= r2) goto L25
            r0 = r1[r3]     // Catch: java.lang.Throwable -> L43
        L25:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L2c
            return
        L2c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            r3.append(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "_"
            r3.append(r0)     // Catch: java.lang.Throwable -> L43
            r3.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L43
            com.umeng.commonsdk.statistics.TagHelper.deleteModuleTag(r3)     // Catch: java.lang.Throwable -> L43
        L43:
            return
    }

    private static void disableAidCollect() {
            java.lang.String r0 = "com.umeng.socialize.UMShareAPI"
            java.lang.Class r0 = getClass(r0)     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Lb
            r0 = 0
            com.umeng.commonsdk.UMConfigure.shouldCollectAid = r0     // Catch: java.lang.Throwable -> Lb
        Lb:
            return
    }

    public static void enableAzxSwitch(boolean r0) {
            com.umeng.ccg.b.a(r0)
            return
    }

    private static java.lang.Class<?> getClass(java.lang.String r0) {
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static java.lang.String getCurrentActivityName() {
            com.umeng.analytics.vshelper.PageNameMonitor r0 = com.umeng.analytics.vshelper.PageNameMonitor.getInstance()
            java.lang.String r0 = r0.getCurrentActivityName()
            return r0
    }

    private static java.lang.Object getDecInstanceObject(java.lang.Class<?> r2) {
            r0 = 0
            if (r2 == 0) goto L14
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L8
            goto La
        L8:
            r2 = r0
        La:
            if (r2 == 0) goto L14
            r1 = 1
            r2.setAccessible(r1)
            java.lang.Object r0 = r2.newInstance(r0)     // Catch: java.lang.Throwable -> L14
        L14:
            return r0
    }

    private static java.lang.reflect.Method getDecMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class<?>[] r3) {
            r0 = 0
            if (r1 == 0) goto Lf
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L8
            goto L9
        L8:
        L9:
            if (r0 == 0) goto Lf
            r1 = 1
            r0.setAccessible(r1)
        Lf:
            return r0
    }

    public static boolean getInitStatus() {
            java.lang.Object r0 = com.umeng.commonsdk.UMConfigure.lockObject
            monitor-enter(r0)
            boolean r1 = com.umeng.commonsdk.UMConfigure.isFinish     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private static java.util.Map<java.lang.String, java.lang.String> getModuleTags() {
            java.util.Map r0 = com.umeng.commonsdk.statistics.TagHelper.getModuleTags()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static void getOaid(android.content.Context r1, com.umeng.commonsdk.listener.OnGetOaidListener r2) {
            if (r1 != 0) goto L3
            return
        L3:
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.commonsdk.UMConfigure.mOnGetOaidListener = r2
            java.lang.Thread r2 = new java.lang.Thread
            com.umeng.commonsdk.UMConfigure$4 r0 = new com.umeng.commonsdk.UMConfigure$4
            r0.<init>(r1)
            r2.<init>(r0)
            r2.start()
            return
    }

    public static java.lang.String[] getTestDeviceInfo(android.content.Context r3) {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r3 == 0) goto L13
            java.lang.String r1 = com.umeng.commonsdk.statistics.common.DeviceConfig.getDeviceIdForGeneral(r3)     // Catch: java.lang.Exception -> L13
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMac(r3)     // Catch: java.lang.Exception -> L13
            r1 = 1
            r0[r1] = r3     // Catch: java.lang.Exception -> L13
        L13:
            return r0
    }

    public static java.lang.String getUMIDString(android.content.Context r0) {
            if (r0 == 0) goto Lf
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getUMId(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static java.lang.String getUmengZID(android.content.Context r0) {
            if (r0 == 0) goto Lf
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r0 = com.umeng.commonsdk.utils.UMUtils.getZid(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private static void ignoreSdkCheck(android.content.Context r0) {
            r0 = 0
            com.umeng.commonsdk.UMConfigure.shouldCheckShareSdk = r0
            return
    }

    public static void init(android.content.Context r1, int r2, java.lang.String r3) {
            r0 = 0
            init(r1, r0, r0, r2, r3)
            return
    }

    public static void init(android.content.Context r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14) {
            r0 = 0
            r1 = 0
            r2 = 1
            boolean r3 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r3 == 0) goto L10
            int r3 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            goto L10
        La:
            r11 = move-exception
            goto L3f5
        Ld:
            r11 = move-exception
            goto L3fd
        L10:
            if (r10 != 0) goto L13
            return
        L13:
            boolean r3 = com.umeng.commonsdk.UMConfigure.isInit     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r3 == 0) goto L18
            return
        L18:
            android.content.Context r3 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            com.umeng.commonsdk.service.UMGlobalContext.getInstance(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            boolean r4 = com.umeng.commonsdk.utils.c.a()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r4 == 0) goto L49
            boolean r13 = isPreInit()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r13 != 0) goto L3a
            preInitInternal(r3, r11, r12)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            boolean r11 = isPreInit()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 != 0) goto L3a
            goto L44e
        L3a:
            com.umeng.commonsdk.internal.b r11 = com.umeng.commonsdk.internal.b.a(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            com.umeng.commonsdk.internal.c r11 = r11.a()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            r12 = 32802(0x8022, float:4.5965E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r12, r11, r1)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            return
        L49:
            java.lang.String r4 = "com.umeng.umzid.ZIDManager"
            java.lang.Class r4 = getClass(r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L5a
            com.umeng.commonsdk.UMConfigure$1 r4 = new com.umeng.commonsdk.UMConfigure$1     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5a
            r4.start()     // Catch: java.lang.Throwable -> L5a
            return
        L5a:
            java.lang.String r4 = "com.umeng.message.PushAgent"
            java.lang.Class r4 = getClass(r4)     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L74
            boolean r4 = checkShareSdk(r4)     // Catch: java.lang.Throwable -> L74
            if (r4 != 0) goto L74
            boolean r4 = com.umeng.commonsdk.UMConfigure.shouldCheckShareSdk     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L74
            com.umeng.commonsdk.UMConfigure$2 r4 = new com.umeng.commonsdk.UMConfigure$2     // Catch: java.lang.Throwable -> L74
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L74
            r4.start()     // Catch: java.lang.Throwable -> L74
        L74:
            java.lang.String r4 = "com.umeng.socialize.UMShareAPI"
            java.lang.Class r4 = getClass(r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8e
            boolean r4 = checkShareSdk(r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L8e
            boolean r4 = com.umeng.commonsdk.UMConfigure.shouldCheckShareSdk     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8e
            com.umeng.commonsdk.UMConfigure$3 r4 = new com.umeng.commonsdk.UMConfigure$3     // Catch: java.lang.Throwable -> L8e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L8e
            r4.start()     // Catch: java.lang.Throwable -> L8e
        L8e:
            boolean r4 = isPreInit()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r4 != 0) goto L9f
            preInitInternal(r3, r11, r12)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            boolean r11 = isPreInit()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 != 0) goto L9f
            goto L44e
        L9f:
            com.umeng.commonsdk.framework.UMEnvelopeBuild.registerNetReceiver(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            java.lang.String r11 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            com.umeng.commonsdk.utils.UMUtils.setAppkey(r3, r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            java.lang.String r11 = com.umeng.commonsdk.utils.UMUtils.getLastAppkey(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            java.lang.String r12 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            r4 = 2
            if (r12 != 0) goto Ld2
            java.lang.String r12 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            boolean r12 = r12.equals(r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r12 != 0) goto Ld2
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 != 0) goto Lcd
            boolean r11 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 == 0) goto Lcd
            java.lang.String r11 = "AppKey改变!!!"
            java.lang.String r12 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r4, r12)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
        Lcd:
            java.lang.String r11 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            com.umeng.commonsdk.utils.UMUtils.setLastAppkey(r3, r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
        Ld2:
            boolean r11 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            r12 = 3
            if (r11 == 0) goto L106
            java.lang.String r11 = com.umeng.commonsdk.utils.UMUtils.getAppkeyByXML(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            java.lang.String r5 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r5 != 0) goto L106
            boolean r5 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r5 != 0) goto L106
            java.lang.String r5 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            boolean r5 = r5.equals(r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r5 != 0) goto L106
            java.lang.String r5 = "@"
            java.lang.String r6 = "#"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            java.lang.String r6 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            java.lang.String[] r11 = new java.lang.String[]{r6, r11}     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            java.lang.String r6 = "请注意：您init接口中设置的AppKey是@，manifest中设置的AppKey是#，init接口设置的AppKey会覆盖manifest中设置的AppKey"
            java.lang.String r7 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r6, r12, r7, r5, r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
        L106:
            java.lang.String r11 = com.umeng.commonsdk.UMConfigure.sChannel     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            com.umeng.commonsdk.utils.UMUtils.setChannel(r3, r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            java.lang.Class<com.umeng.analytics.MobclickAgent> r11 = com.umeng.analytics.MobclickAgent.class
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L185
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Throwable -> L185
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L185
            if (r5 == 0) goto L14e
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L185
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L185
            r6[r0] = r3     // Catch: java.lang.Throwable -> L185
            r5.invoke(r11, r6)     // Catch: java.lang.Throwable -> L185
            java.lang.String r5 = "header_first_resume"
            boolean r5 = com.umeng.commonsdk.config.FieldManager.allow(r5)     // Catch: java.lang.Throwable -> L185
            if (r5 == 0) goto L13c
            java.lang.String r5 = "MobclickRT"
            java.lang.String r6 = "--->>> FirstResumeTrigger enabled."
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r6)     // Catch: java.lang.Throwable -> L185
            com.umeng.analytics.pro.l r5 = com.umeng.analytics.pro.l.a(r3)     // Catch: java.lang.Throwable -> L185
            r5.b(r3)     // Catch: java.lang.Throwable -> L185
            goto L143
        L13c:
            java.lang.String r5 = "MobclickRT"
            java.lang.String r6 = "--->>> FirstResumeTrigger disabled."
            com.umeng.commonsdk.debug.UMRTLog.i(r5, r6)     // Catch: java.lang.Throwable -> L185
        L143:
            boolean r5 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> L185
            if (r5 == 0) goto L14e
            java.lang.String r5 = "统计SDK初始化成功"
            java.lang.String r6 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r5, r4, r6)     // Catch: java.lang.Throwable -> L185
        L14e:
            java.lang.String r5 = "com.umeng.analytics.game.UMGameAgent"
            java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L185
            java.lang.String r5 = "setGameScenarioType"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L185
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Throwable -> L185
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L185
            if (r5 == 0) goto L16b
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L185
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L185
            r6[r0] = r3     // Catch: java.lang.Throwable -> L185
            r5.invoke(r11, r6)     // Catch: java.lang.Throwable -> L185
        L16b:
            java.lang.String r11 = com.umeng.commonsdk.statistics.b.a     // Catch: java.lang.Throwable -> L185
            java.lang.String r5 = "e"
            int r11 = r11.indexOf(r5)     // Catch: java.lang.Throwable -> L185
            if (r11 < 0) goto L185
            java.lang.Class<com.umeng.analytics.MobclickAgent> r11 = com.umeng.analytics.MobclickAgent.class
            java.lang.String r5 = "disableExceptionCatch"
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r1)     // Catch: java.lang.Throwable -> L185
            if (r5 == 0) goto L185
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L185
            r5.invoke(r11, r1)     // Catch: java.lang.Throwable -> L185
        L185:
            java.lang.String r11 = "com.umeng.message.PushAgent"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L1a3
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1a3
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Throwable -> L1a3
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L1a3
            if (r5 == 0) goto L1a3
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L1a3
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1a3
            r6[r0] = r3     // Catch: java.lang.Throwable -> L1a3
            r5.invoke(r11, r6)     // Catch: java.lang.Throwable -> L1a3
        L1a3:
            java.lang.String r11 = "com.umeng.message.MessageSharedPrefs"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.String r5 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            if (r5 == 0) goto L235
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            r6[r0] = r3     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.Object r5 = r5.invoke(r11, r6)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            if (r5 == 0) goto L235
            java.lang.String r6 = "setMessageAppKey"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r0] = r8     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.reflect.Method r6 = r11.getDeclaredMethod(r6, r7)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            if (r6 == 0) goto L1e6
            r6.setAccessible(r2)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.String r8 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            r7[r0] = r8     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            r6.invoke(r5, r7)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            boolean r6 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            if (r6 == 0) goto L1e6
            java.lang.String r6 = "PUSH AppKey设置成功"
            java.lang.String r7 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r6, r4, r7)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
        L1e6:
            java.lang.String r6 = "setMessageChannel"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r0] = r8     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.reflect.Method r6 = r11.getDeclaredMethod(r6, r7)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            if (r6 == 0) goto L20b
            r6.setAccessible(r2)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.String r8 = com.umeng.commonsdk.UMConfigure.sChannel     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            r7[r0] = r8     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            r6.invoke(r5, r7)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            boolean r6 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            if (r6 == 0) goto L20b
            java.lang.String r6 = "PUSH Channel设置成功"
            java.lang.String r7 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r6, r4, r7)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
        L20b:
            boolean r6 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            if (r6 == 0) goto L212
            goto L235
        L212:
            java.lang.String r6 = "setMessageAppSecret"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r0] = r8     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r6, r7)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            if (r11 == 0) goto L235
            r11.setAccessible(r2)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            r6[r0] = r14     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            r11.invoke(r5, r6)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            boolean r11 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
            if (r11 == 0) goto L235
            java.lang.String r11 = "PUSH Secret设置成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r4, r5)     // Catch: java.lang.Throwable -> La java.lang.Exception -> L235
        L235:
            java.lang.String r11 = "com.umeng.socialize.UMShareAPI"
            java.lang.Class r11 = getClass(r11)     // Catch: java.lang.Throwable -> L26f
            java.lang.String r5 = "APPKEY"
            java.lang.String r6 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L26f
            setFile(r11, r5, r6)     // Catch: java.lang.Throwable -> L26f
            if (r11 == 0) goto L26f
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L26f
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Throwable -> L26f
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r2] = r7     // Catch: java.lang.Throwable -> L26f
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L26f
            if (r5 == 0) goto L26f
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L26f
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L26f
            r6[r0] = r3     // Catch: java.lang.Throwable -> L26f
            java.lang.String r7 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L26f
            r6[r2] = r7     // Catch: java.lang.Throwable -> L26f
            r5.invoke(r11, r6)     // Catch: java.lang.Throwable -> L26f
            boolean r11 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> L26f
            if (r11 == 0) goto L26f
            java.lang.String r11 = "Share AppKey设置成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r4, r5)     // Catch: java.lang.Throwable -> L26f
        L26f:
            com.umeng.commonsdk.statistics.AnalyticsConstants.setDeviceType(r13)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            java.lang.String r11 = "com.umeng.error.UMError"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L29b
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L29b
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Throwable -> L29b
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L29b
            if (r5 == 0) goto L29b
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L29b
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L29b
            r6[r0] = r3     // Catch: java.lang.Throwable -> L29b
            r5.invoke(r11, r6)     // Catch: java.lang.Throwable -> L29b
            boolean r11 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> L29b
            if (r11 == 0) goto L29b
            java.lang.String r11 = "错误分析SDK初始化成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r4, r5)     // Catch: java.lang.Throwable -> L29b
        L29b:
            java.lang.String r11 = "com.umeng.umefs.UMEfs"
            java.lang.Class r11 = getClass(r11)     // Catch: java.lang.Throwable -> L2fa
            if (r11 != 0) goto L2fa
            java.lang.String r11 = "com.umeng.umcrash.UMCrash"
            java.lang.Class r11 = getClass(r11)     // Catch: java.lang.Throwable -> L2fa
            if (r11 == 0) goto L2fa
            int r5 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE     // Catch: java.lang.Throwable -> L2fa
            if (r5 != r2) goto L2c9
            java.lang.String r5 = "useIntlServices"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2fa
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L2fa
            r6[r0] = r7     // Catch: java.lang.Throwable -> L2fa
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L2fa
            if (r5 == 0) goto L2c9
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L2fa
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2fa
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2fa
            r6[r0] = r7     // Catch: java.lang.Throwable -> L2fa
            r5.invoke(r11, r6)     // Catch: java.lang.Throwable -> L2fa
        L2c9:
            java.lang.String r5 = "init"
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch: java.lang.Throwable -> L2fa
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r0] = r7     // Catch: java.lang.Throwable -> L2fa
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r2] = r7     // Catch: java.lang.Throwable -> L2fa
            r6[r4] = r7     // Catch: java.lang.Throwable -> L2fa
            java.lang.reflect.Method r5 = r11.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L2fa
            if (r5 == 0) goto L2fa
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L2fa
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L2fa
            r6[r0] = r3     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r7 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L2fa
            r6[r2] = r7     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r7 = com.umeng.commonsdk.UMConfigure.sChannel     // Catch: java.lang.Throwable -> L2fa
            r6[r4] = r7     // Catch: java.lang.Throwable -> L2fa
            r5.invoke(r11, r6)     // Catch: java.lang.Throwable -> L2fa
            boolean r11 = com.umeng.commonsdk.UMConfigure.debugLog     // Catch: java.lang.Throwable -> L2fa
            if (r11 == 0) goto L2fa
            java.lang.String r11 = "APM SDK初始化成功"
            java.lang.String r5 = ""
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r11, r4, r5)     // Catch: java.lang.Throwable -> L2fa
        L2fa:
            java.lang.String r11 = "com.umeng.vt.facade.EventFacade"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L33a
            java.lang.String r5 = "init"
            r6 = 5
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L33a
            java.lang.Class<android.app.Application> r8 = android.app.Application.class
            r7[r0] = r8     // Catch: java.lang.Throwable -> L33a
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r2] = r8     // Catch: java.lang.Throwable -> L33a
            r7[r4] = r8     // Catch: java.lang.Throwable -> L33a
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L33a
            r7[r12] = r9     // Catch: java.lang.Throwable -> L33a
            r9 = 4
            r7[r9] = r8     // Catch: java.lang.Throwable -> L33a
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r5, r7)     // Catch: java.lang.Throwable -> L33a
            if (r11 == 0) goto L33a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L33a
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L33a
            r5[r0] = r3     // Catch: java.lang.Throwable -> L33a
            java.lang.String r6 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L33a
            r5[r2] = r6     // Catch: java.lang.Throwable -> L33a
            java.lang.String r6 = com.umeng.commonsdk.UMConfigure.sChannel     // Catch: java.lang.Throwable -> L33a
            r5[r4] = r6     // Catch: java.lang.Throwable -> L33a
            r5[r12] = r13     // Catch: java.lang.Throwable -> L33a
            r5[r9] = r14     // Catch: java.lang.Throwable -> L33a
            r11.invoke(r1, r5)     // Catch: java.lang.Throwable -> L33a
            java.lang.String r11 = "MobclickRT"
            java.lang.String r12 = "--->>>初始化 EventFacade 成功."
            com.umeng.commonsdk.debug.UMRTLog.i(r11, r12)     // Catch: java.lang.Throwable -> L33a
        L33a:
            java.lang.String r11 = "com.umeng.vt.common.VTTracker"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L364
            java.lang.String r12 = "init"
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L364
            java.lang.Class<android.app.Application> r14 = android.app.Application.class
            r13[r0] = r14     // Catch: java.lang.Throwable -> L364
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r13[r2] = r14     // Catch: java.lang.Throwable -> L364
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r12, r13)     // Catch: java.lang.Throwable -> L364
            if (r11 == 0) goto L364
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L364
            r12[r0] = r3     // Catch: java.lang.Throwable -> L364
            java.lang.String r13 = com.umeng.commonsdk.UMConfigure.sAppkey     // Catch: java.lang.Throwable -> L364
            r12[r2] = r13     // Catch: java.lang.Throwable -> L364
            r11.invoke(r1, r12)     // Catch: java.lang.Throwable -> L364
            java.lang.String r11 = "MobclickRT"
            java.lang.String r12 = "--->>>初始化 VTTracker 成功."
            com.umeng.commonsdk.debug.UMRTLog.i(r11, r12)     // Catch: java.lang.Throwable -> L364
        L364:
            java.lang.Object r11 = com.umeng.commonsdk.UMConfigure.lockObject     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            monitor-enter(r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            com.umeng.commonsdk.UMConfigure.isFinish = r2     // Catch: java.lang.Throwable -> L3f2
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3f2
            boolean r11 = needCheckPolicyResult(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 == 0) goto L3a0
            java.lang.Object r11 = com.umeng.commonsdk.UMConfigure.lock     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            monitor-enter(r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L39b
            r12.<init>()     // Catch: java.lang.Throwable -> L39b
            java.lang.String r13 = "preInitInvoked"
            int r14 = com.umeng.commonsdk.UMConfigure.preInitInvokedFlag     // Catch: java.lang.Throwable -> L39b
            r12.put(r13, r14)     // Catch: java.lang.Throwable -> L39b
            java.lang.String r13 = "policyGrantInvoked"
            int r14 = com.umeng.commonsdk.UMConfigure.policyGrantInvokedFlag     // Catch: java.lang.Throwable -> L39b
            r12.put(r13, r14)     // Catch: java.lang.Throwable -> L39b
            java.lang.String r13 = "policyGrantResult"
            int r14 = com.umeng.commonsdk.UMConfigure.policyGrantResult     // Catch: java.lang.Throwable -> L39b
            r12.put(r13, r14)     // Catch: java.lang.Throwable -> L39b
            com.umeng.commonsdk.internal.b r13 = com.umeng.commonsdk.internal.b.a(r3)     // Catch: java.lang.Throwable -> L39b
            com.umeng.commonsdk.internal.c r13 = r13.a()     // Catch: java.lang.Throwable -> L39b
            r14 = 32793(0x8019, float:4.5953E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r14, r13, r12)     // Catch: java.lang.Throwable -> L39b
        L39b:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L39d
            goto L3a0
        L39d:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L39d
            throw r12     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
        L3a0:
            boolean r11 = needSendZcfgEnv(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 == 0) goto L3bc
            java.lang.String r11 = "MobclickRT"
            java.lang.String r12 = "--->>> 走零号报文发送逻辑"
            com.umeng.commonsdk.debug.UMRTLog.e(r11, r12)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            com.umeng.commonsdk.internal.b r11 = com.umeng.commonsdk.internal.b.a(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            com.umeng.commonsdk.internal.c r11 = r11.a()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            r12 = 32781(0x800d, float:4.5936E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r12, r11, r1)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            goto L3e8
        L3bc:
            boolean r11 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 == 0) goto L3e8
            java.lang.String r11 = "MobclickRT"
            java.lang.String r12 = "--->>> 走正常逻辑."
            com.umeng.commonsdk.debug.UMRTLog.e(r11, r12)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            boolean r11 = com.umeng.commonsdk.config.FieldManager.b()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 == 0) goto L3dd
            com.umeng.commonsdk.internal.b r11 = com.umeng.commonsdk.internal.b.a(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            com.umeng.commonsdk.internal.c r11 = r11.a()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            r12 = 32791(0x8017, float:4.595E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r12, r11, r1)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
        L3dd:
            java.lang.String r11 = "header_device_oaid"
            boolean r11 = com.umeng.commonsdk.config.FieldManager.allow(r11)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 == 0) goto L3e8
            com.umeng.commonsdk.internal.c.a(r3, r0)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
        L3e8:
            boolean r11 = isDebugLog()     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            if (r11 == 0) goto L404
            com.umeng.commonsdk.UMConfigureInternation.doSelfCheck(r3)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
            goto L404
        L3f2:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3f2
            throw r12     // Catch: java.lang.Throwable -> La java.lang.Exception -> Ld
        L3f5:
            boolean r12 = com.umeng.commonsdk.UMConfigure.debugLog
            if (r12 == 0) goto L404
            r11.toString()
            goto L404
        L3fd:
            boolean r12 = com.umeng.commonsdk.UMConfigure.debugLog
            if (r12 == 0) goto L404
            r11.toString()
        L404:
            android.content.Context r11 = r10.getApplicationContext()     // Catch: java.lang.Exception -> L439
            android.content.Context r11 = com.stub.StubApp.getOrigApplicationContext(r11)     // Catch: java.lang.Exception -> L439
            java.lang.String r12 = "com.umeng.cconfig.UMRemoteConfig"
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Exception -> L439
            java.lang.String r13 = "getInstance"
            java.lang.reflect.Method r13 = r12.getDeclaredMethod(r13, r1)     // Catch: java.lang.Exception -> L439
            if (r13 == 0) goto L43a
            java.lang.Object r13 = r13.invoke(r12, r1)     // Catch: java.lang.Exception -> L439
            if (r13 == 0) goto L43a
            java.lang.String r14 = "init"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L439
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r0] = r4     // Catch: java.lang.Exception -> L439
            java.lang.reflect.Method r12 = r12.getDeclaredMethod(r14, r3)     // Catch: java.lang.Exception -> L439
            if (r12 == 0) goto L43a
            r12.setAccessible(r2)     // Catch: java.lang.Exception -> L439
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L439
            r14[r0] = r11     // Catch: java.lang.Exception -> L439
            r12.invoke(r13, r14)     // Catch: java.lang.Exception -> L439
            goto L43a
        L439:
        L43a:
            com.umeng.commonsdk.internal.b r11 = com.umeng.commonsdk.internal.b.a(r10)
            com.umeng.commonsdk.internal.c r11 = r11.a()
            r12 = 32804(0x8024, float:4.5968E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r10, r12, r11, r1)
            boolean r10 = com.umeng.commonsdk.UMConfigure.isInit
            if (r10 != 0) goto L44e
            com.umeng.commonsdk.UMConfigure.isInit = r2
        L44e:
            return
    }

    private static void invoke(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object[] r2) {
            if (r0 == 0) goto L7
            if (r1 == 0) goto L7
            r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    private static void invoke(java.lang.reflect.Method r1, java.lang.Object[] r2) {
            if (r1 == 0) goto L6
            r0 = 0
            r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    public static boolean isDebugLog() {
            boolean r0 = com.umeng.commonsdk.UMConfigure.debugLog
            return r0
    }

    private static java.lang.Boolean isInForeground() {
            boolean r0 = com.umeng.analytics.vshelper.b.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    private static boolean isPreInit() {
            java.lang.Object r0 = com.umeng.commonsdk.UMConfigure.PreInitLock
            monitor-enter(r0)
            boolean r1 = com.umeng.commonsdk.UMConfigure.preInitComplete     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private static boolean isSilentMode() {
            boolean r0 = com.umeng.commonsdk.utils.c.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "--->>> isSilentMode() return: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r1)
            return r0
    }

    private static boolean needCheckPolicyResult(android.content.Context r2) {
            java.io.File r2 = r2.getFilesDir()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = com.umeng.analytics.pro.bm.m
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L2b
            r2 = 0
            return r2
        L2b:
            r2 = 1
            return r2
    }

    public static boolean needSendZcfgEnv(android.content.Context r2) {
            java.io.File r2 = r2.getFilesDir()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = com.umeng.analytics.pro.bm.l
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L2b
            r2 = 0
            return r2
        L2b:
            r2 = 1
            return r2
    }

    public static void preInit(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.Object r0 = com.umeng.commonsdk.UMConfigure.lock
            monitor-enter(r0)
            r1 = 1
            com.umeng.commonsdk.UMConfigure.preInitInvokedFlag = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            preInitInternal(r2, r3, r4)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    private static void preInitInternal(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            if (r3 != 0) goto L3
            return
        L3:
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.String r0 = "1"
            java.lang.String r1 = "debug.umeng.rtlog"
            java.lang.String r2 = "0"
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getSystemProperty(r1, r2)
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto L1e
            com.umeng.commonsdk.UMConfigure.shouldOutputRT = r1
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L28
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getAppkeyByXML(r3)
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L32
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getChannelByXML(r3)
        L32:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L3a
            java.lang.String r5 = "Unknown"
        L3a:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L41
            goto L6f
        L41:
            com.umeng.commonsdk.UMConfigure.sAppkey = r4
            com.umeng.commonsdk.UMConfigure.sChannel = r5
            com.umeng.commonsdk.service.UMGlobalContext.getInstance(r3)
            com.umeng.analytics.pro.l.a(r3)
            boolean r4 = needSendZcfgEnv(r3)
            if (r4 != 0) goto L58
            com.umeng.commonsdk.config.FieldManager r4 = com.umeng.commonsdk.config.FieldManager.a()
            r4.a(r3)
        L58:
            java.lang.Object r3 = com.umeng.commonsdk.UMConfigure.PreInitLock
            monitor-enter(r3)
            com.umeng.commonsdk.UMConfigure.preInitComplete = r1     // Catch: java.lang.Throwable -> L70
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            boolean r3 = com.umeng.commonsdk.utils.c.a()
            boolean r4 = com.umeng.commonsdk.UMConfigure.debugLog
            if (r4 == 0) goto L6f
            if (r3 == 0) goto L6f
            java.lang.String r3 = "MobclickRT"
            java.lang.String r4 = "--->>> 当前处于静默模式!"
            com.umeng.commonsdk.debug.UMRTLog.i(r3, r4)
        L6f:
            return
        L70:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            throw r4
    }

    public static void registerActionInfo(com.umeng.ccg.ActionInfo r0) {
            com.umeng.ccg.CcgAgent.registerActionInfo(r0)
            return
    }

    public static void resetStorePath() {
            java.lang.String r0 = "um_"
            resetStorePrefix(r0)
            return
    }

    public static void resetStorePrefix(java.lang.String r1) {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            r0.a(r1)
            return
    }

    private static void setCheckDevice(boolean r0) {
            com.umeng.commonsdk.statistics.AnalyticsConstants.CHECK_DEVICE = r0
            return
    }

    public static void setDomain(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            com.umeng.commonsdk.statistics.UMServerURL.DEFAULT_URL = r1
            com.umeng.commonsdk.statistics.UMServerURL.SECONDARY_URL = r1
            return
    }

    public static void setEncryptEnabled(boolean r0) {
            com.umeng.commonsdk.statistics.b.a(r0)
            return
    }

    private static void setFile(java.lang.Class<?> r0, java.lang.String r1, java.lang.String r2) {
            if (r0 == 0) goto L9
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L9
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L9
        L9:
            return
    }

    private static void setFile(java.lang.Class<?> r0, java.lang.String r1, boolean r2) {
            if (r0 == 0) goto Ld
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> Ld
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> Ld
            r0.set(r1, r2)     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    private static void setLatencyWindow(long r0) {
            int r1 = (int) r0
            int r1 = r1 * 1000
            com.umeng.commonsdk.statistics.a.c = r1
            return
    }

    public static void setLogEnabled(boolean r7) {
            com.umeng.commonsdk.UMConfigure.debugLog = r7     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            com.umeng.commonsdk.statistics.common.MLog.DEBUG = r7     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.String r0 = "com.umeng.message.PushAgent"
            java.lang.Class r0 = getClass(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.Object r1 = getDecInstanceObject(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.String r2 = "setDebugMode"
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            r6 = 0
            r5[r6] = r3     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.reflect.Method r0 = getDecMethod(r0, r2, r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            r5[r6] = r2     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            invoke(r0, r1, r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.String r0 = "com.umeng.socialize.Config"
            java.lang.Class r0 = getClass(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.String r1 = "DEBUG"
            setFile(r0, r1, r7)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.String r0 = "com.umeng.umcrash.UMCrash"
            java.lang.Class r0 = getClass(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.String r1 = "setDebug"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            r2[r6] = r3     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.reflect.Method r0 = getDecMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            r1[r6] = r7     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            invoke(r0, r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L57
            return
        L4e:
            r7 = move-exception
            boolean r0 = com.umeng.commonsdk.UMConfigure.debugLog
            if (r0 == 0) goto L5f
            r7.toString()
            goto L5f
        L57:
            r7 = move-exception
            boolean r0 = com.umeng.commonsdk.UMConfigure.debugLog
            if (r0 == 0) goto L5f
            r7.toString()
        L5f:
            return
    }

    private static void setModuleTag(com.umeng.commonsdk.UMConfigure.BS_TYPE r3, java.lang.String r4, java.lang.String r5) {
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L57
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L10
            goto L57
        L10:
            java.lang.String r0 = r4.trim()     // Catch: java.lang.Throwable -> L57
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L57
            int r0 = r0.length     // Catch: java.lang.Throwable -> L57
            r1 = 64
            if (r0 <= r1) goto L1e
            return
        L1e:
            java.lang.String r0 = r5.trim()     // Catch: java.lang.Throwable -> L57
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L57
            int r0 = r0.length     // Catch: java.lang.Throwable -> L57
            r1 = 128(0x80, float:1.8E-43)
            if (r0 <= r1) goto L2c
            return
        L2c:
            int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = ""
            java.lang.String[] r1 = com.umeng.commonsdk.UMConfigure.BUSINESS_TYPE     // Catch: java.lang.Throwable -> L57
            int r2 = r1.length     // Catch: java.lang.Throwable -> L57
            if (r3 >= r2) goto L39
            r0 = r1[r3]     // Catch: java.lang.Throwable -> L57
        L39:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L40
            return
        L40:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            r3.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "_"
            r3.append(r0)     // Catch: java.lang.Throwable -> L57
            r3.append(r4)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L57
            com.umeng.commonsdk.statistics.TagHelper.setModuleTag(r3, r5)     // Catch: java.lang.Throwable -> L57
        L57:
            return
    }

    public static void setProcessEvent(boolean r0) {
            com.umeng.commonsdk.statistics.AnalyticsConstants.SUB_PROCESS_EVENT = r0
            return
    }

    private static void setWraperType(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            goto L7d
        L8:
            java.lang.String r0 = "native"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L16
            com.umeng.commonsdk.stateless.a.a = r0
            com.umeng.commonsdk.statistics.a.a = r0
            goto L7d
        L16:
            java.lang.String r0 = "Cocos2d-x"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L23
            com.umeng.commonsdk.stateless.a.a = r0
            com.umeng.commonsdk.statistics.a.a = r0
            goto L7d
        L23:
            java.lang.String r0 = "Cocos2d-x_lua"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L30
            com.umeng.commonsdk.stateless.a.a = r0
            com.umeng.commonsdk.statistics.a.a = r0
            goto L7d
        L30:
            java.lang.String r0 = "Unity"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L3d
            com.umeng.commonsdk.stateless.a.a = r0
            com.umeng.commonsdk.statistics.a.a = r0
            goto L7d
        L3d:
            java.lang.String r0 = "react-native"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L4a
            com.umeng.commonsdk.stateless.a.a = r0
            com.umeng.commonsdk.statistics.a.a = r0
            goto L7d
        L4a:
            java.lang.String r0 = "phonegap"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L57
            com.umeng.commonsdk.stateless.a.a = r0
            com.umeng.commonsdk.statistics.a.a = r0
            goto L7d
        L57:
            java.lang.String r0 = "weex"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L64
            com.umeng.commonsdk.stateless.a.a = r0
            com.umeng.commonsdk.statistics.a.a = r0
            goto L7d
        L64:
            java.lang.String r0 = "hybrid"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L71
            com.umeng.commonsdk.stateless.a.a = r0
            com.umeng.commonsdk.statistics.a.a = r0
            goto L7d
        L71:
            java.lang.String r0 = "flutter"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7d
            com.umeng.commonsdk.stateless.a.a = r0
            com.umeng.commonsdk.statistics.a.a = r0
        L7d:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L84
            return
        L84:
            com.umeng.commonsdk.stateless.a.b = r3
            com.umeng.commonsdk.statistics.a.b = r3
            return
    }

    public static boolean shouldCollectAid() {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldCollectAid
            return r0
    }

    public static boolean shouldOutput() {
            boolean r0 = com.umeng.commonsdk.UMConfigure.shouldOutputRT
            return r0
    }

    public static void submitPolicyGrantResult(android.content.Context r3, boolean r4) {
            com.umeng.commonsdk.internal.b r0 = com.umeng.commonsdk.internal.b.a(r3)
            com.umeng.commonsdk.internal.c r0 = r0.a()
            r1 = 0
            r2 = 32800(0x8020, float:4.5963E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r2, r0, r1)
            java.lang.Object r0 = com.umeng.commonsdk.UMConfigure.lock
            monitor-enter(r0)
            r1 = 1
            com.umeng.commonsdk.UMConfigure.policyGrantInvokedFlag = r1     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L1c
            com.umeng.commonsdk.UMConfigure.policyGrantResult = r1     // Catch: java.lang.Throwable -> L1a
            goto L1f
        L1a:
            r3 = move-exception
            goto L35
        L1c:
            r4 = 2
            com.umeng.commonsdk.UMConfigure.policyGrantResult = r4     // Catch: java.lang.Throwable -> L1a
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            com.umeng.commonsdk.internal.b r4 = com.umeng.commonsdk.internal.b.a(r3)
            com.umeng.commonsdk.internal.c r4 = r4.a()
            int r0 = com.umeng.commonsdk.UMConfigure.policyGrantResult
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 32792(0x8018, float:4.5951E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r1, r4, r0)
            return
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }
}
