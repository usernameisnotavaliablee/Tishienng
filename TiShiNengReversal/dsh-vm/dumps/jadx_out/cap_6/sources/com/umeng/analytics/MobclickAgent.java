package com.umeng.analytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MobclickAgent {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum EScenarioType extends java.lang.Enum<com.umeng.analytics.MobclickAgent.EScenarioType> {
        public static final com.umeng.analytics.MobclickAgent.EScenarioType E_UM_GAME = null;
        public static final com.umeng.analytics.MobclickAgent.EScenarioType E_UM_NORMAL = null;
        private static final /* synthetic */ com.umeng.analytics.MobclickAgent.EScenarioType[] b = null;
        private int a;

        static {
                com.umeng.analytics.MobclickAgent$EScenarioType r0 = new com.umeng.analytics.MobclickAgent$EScenarioType
                java.lang.String r1 = "E_UM_NORMAL"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.umeng.analytics.MobclickAgent.EScenarioType.E_UM_NORMAL = r0
                com.umeng.analytics.MobclickAgent$EScenarioType r1 = new com.umeng.analytics.MobclickAgent$EScenarioType
                java.lang.String r3 = "E_UM_GAME"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.umeng.analytics.MobclickAgent.EScenarioType.E_UM_GAME = r1
                r3 = 2
                com.umeng.analytics.MobclickAgent$EScenarioType[] r3 = new com.umeng.analytics.MobclickAgent.EScenarioType[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.umeng.analytics.MobclickAgent.EScenarioType.b = r3
                return
        }

        EScenarioType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        public static com.umeng.analytics.MobclickAgent.EScenarioType valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.analytics.MobclickAgent$EScenarioType> r0 = com.umeng.analytics.MobclickAgent.EScenarioType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.analytics.MobclickAgent$EScenarioType r1 = (com.umeng.analytics.MobclickAgent.EScenarioType) r1
                return r1
        }

        public static com.umeng.analytics.MobclickAgent.EScenarioType[] values() {
                com.umeng.analytics.MobclickAgent$EScenarioType[] r0 = com.umeng.analytics.MobclickAgent.EScenarioType.b
                java.lang.Object r0 = r0.clone()
                com.umeng.analytics.MobclickAgent$EScenarioType[] r0 = (com.umeng.analytics.MobclickAgent.EScenarioType[]) r0
                return r0
        }

        public int toValue() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum PageMode extends java.lang.Enum<com.umeng.analytics.MobclickAgent.PageMode> {
        public static final com.umeng.analytics.MobclickAgent.PageMode AUTO = null;
        public static final com.umeng.analytics.MobclickAgent.PageMode LEGACY_AUTO = null;
        public static final com.umeng.analytics.MobclickAgent.PageMode LEGACY_MANUAL = null;
        public static final com.umeng.analytics.MobclickAgent.PageMode MANUAL = null;
        private static final /* synthetic */ com.umeng.analytics.MobclickAgent.PageMode[] a = null;

        static {
                com.umeng.analytics.MobclickAgent$PageMode r0 = new com.umeng.analytics.MobclickAgent$PageMode
                java.lang.String r1 = "AUTO"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.analytics.MobclickAgent.PageMode.AUTO = r0
                com.umeng.analytics.MobclickAgent$PageMode r1 = new com.umeng.analytics.MobclickAgent$PageMode
                java.lang.String r3 = "MANUAL"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.analytics.MobclickAgent.PageMode.MANUAL = r1
                com.umeng.analytics.MobclickAgent$PageMode r3 = new com.umeng.analytics.MobclickAgent$PageMode
                java.lang.String r5 = "LEGACY_AUTO"
                r6 = 2
                r3.<init>(r5, r6)
                com.umeng.analytics.MobclickAgent.PageMode.LEGACY_AUTO = r3
                com.umeng.analytics.MobclickAgent$PageMode r5 = new com.umeng.analytics.MobclickAgent$PageMode
                java.lang.String r7 = "LEGACY_MANUAL"
                r8 = 3
                r5.<init>(r7, r8)
                com.umeng.analytics.MobclickAgent.PageMode.LEGACY_MANUAL = r5
                r7 = 4
                com.umeng.analytics.MobclickAgent$PageMode[] r7 = new com.umeng.analytics.MobclickAgent.PageMode[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.umeng.analytics.MobclickAgent.PageMode.a = r7
                return
        }

        PageMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.analytics.MobclickAgent.PageMode valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.analytics.MobclickAgent$PageMode> r0 = com.umeng.analytics.MobclickAgent.PageMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.analytics.MobclickAgent$PageMode r1 = (com.umeng.analytics.MobclickAgent.PageMode) r1
                return r1
        }

        public static com.umeng.analytics.MobclickAgent.PageMode[] values() {
                com.umeng.analytics.MobclickAgent$PageMode[] r0 = com.umeng.analytics.MobclickAgent.PageMode.a
                java.lang.Object r0 = r0.clone()
                com.umeng.analytics.MobclickAgent$PageMode[] r0 = (com.umeng.analytics.MobclickAgent.PageMode[]) r0
                return r0
        }
    }

    public MobclickAgent() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearPreProperties(android.content.Context r1) {
            com.umeng.analytics.b r0 = getAgent()
            r0.g(r1)
            return
    }

    public static void disable() {
            r0 = 0
            com.umeng.analytics.AnalyticsConfig.enable = r0
            return
    }

    private static void disableExceptionCatch() {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r1 = 0
            r0.a(r1)
            r0 = 1
            com.umeng.analytics.AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW = r0
            return
    }

    @java.lang.Deprecated
    public static void enableEncrypt(boolean r0) {
            return
    }

    public static com.umeng.analytics.b getAgent() {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            return r0
    }

    public static org.json.JSONObject getPreProperties(android.content.Context r1) {
            com.umeng.analytics.b r0 = getAgent()
            org.json.JSONObject r1 = r0.h(r1)
            return r1
    }

    private static void init(android.content.Context r1) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r1)
            return
    }

    public static void onEvent(android.content.Context r7, java.lang.String r8) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r4 = -1
            r6 = 1
            r3 = 0
            r1 = r7
            r2 = r8
            r0.a(r1, r2, r3, r4, r6)
            return
    }

    public static void onEvent(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto Lf
            java.lang.String r7 = com.umeng.analytics.pro.j.k
            r8 = 0
            java.lang.String r9 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r7, r8, r9)
            return
        Lf:
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r4 = -1
            r6 = 1
            r1 = r7
            r2 = r8
            r3 = r9
            r0.a(r1, r2, r3, r4, r6)
            return
    }

    public static void onEvent(android.content.Context r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            if (r8 != 0) goto Lb
            java.lang.String r6 = com.umeng.analytics.pro.j.a
            r7 = 0
            java.lang.String r8 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r6, r7, r8)
            return
        Lb:
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r8)
            r4 = -1
            r1 = r6
            r2 = r7
            r0.a(r1, r2, r3, r4)
            return
    }

    public static void onEventObject(android.content.Context r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            if (r8 != 0) goto Lb
            java.lang.String r6 = com.umeng.analytics.pro.j.a
            r7 = 0
            java.lang.String r8 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r6, r7, r8)
            return
        Lb:
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r4 = -1
            r1 = r6
            r2 = r7
            r3 = r8
            r0.a(r1, r2, r3, r4)
            return
    }

    public static void onEventValue(android.content.Context r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, int r10) {
            if (r9 != 0) goto L9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r4 = r9
            goto Lf
        L9:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r9)
            r4 = r0
        Lf:
            java.lang.String r9 = "__ct__"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4.put(r9, r10)
            com.umeng.analytics.b r1 = com.umeng.analytics.b.a()
            r5 = -1
            r2 = r7
            r3 = r8
            r1.a(r2, r3, r4, r5)
            return
    }

    private static void onGKVEvent(android.content.Context r1, java.lang.String r2, java.util.HashMap<java.lang.String, java.lang.Object> r3) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r1, r2, r3)
            return
    }

    public static void onKillProcess(android.content.Context r1) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.d(r1)
            return
    }

    public static void onPageEnd(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Le
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.b(r2)
            return
        Le:
            java.lang.String r2 = com.umeng.analytics.pro.j.D
            r0 = 0
            java.lang.String r1 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r2, r0, r1)
            return
    }

    public static void onPageStart(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Le
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r2)
            return
        Le:
            java.lang.String r2 = com.umeng.analytics.pro.j.C
            r0 = 0
            java.lang.String r1 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r2, r0, r1)
            return
    }

    public static void onPause(android.content.Context r1) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.c(r1)
            return
    }

    public static void onProfileSignIn(java.lang.String r1) {
            java.lang.String r0 = "_adhoc"
            onProfileSignIn(r0, r1)
            return
    }

    public static void onProfileSignIn(java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = "\\|"
            r2 = 0
            if (r0 == 0) goto Lf
            java.lang.String r4 = com.umeng.analytics.pro.j.t
            com.umeng.commonsdk.debug.UMLog.aq(r4, r2, r1)
            return
        Lf:
            int r0 = r5.length()
            r3 = 64
            if (r0 <= r3) goto L1d
            java.lang.String r4 = com.umeng.analytics.pro.j.u
            com.umeng.commonsdk.debug.UMLog.aq(r4, r2, r1)
            return
        L1d:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L2d
            com.umeng.analytics.b r4 = com.umeng.analytics.b.a()
            java.lang.String r0 = "_adhoc"
            r4.a(r0, r5)
            return
        L2d:
            int r0 = r4.length()
            r3 = 32
            if (r0 <= r3) goto L3b
            java.lang.String r4 = com.umeng.analytics.pro.j.v
            com.umeng.commonsdk.debug.UMLog.aq(r4, r2, r1)
            return
        L3b:
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r4, r5)
            return
    }

    public static void onProfileSignOff() {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.j()
            return
    }

    public static void onResume(android.content.Context r2) {
            if (r2 != 0) goto Lb
            java.lang.String r2 = com.umeng.analytics.pro.j.n
            r0 = 0
            java.lang.String r1 = "\\|"
            com.umeng.commonsdk.debug.UMLog.aq(r2, r0, r1)
            return
        Lb:
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.b(r2)
            return
    }

    public static void registerPreProperties(android.content.Context r1, org.json.JSONObject r2) {
            com.umeng.analytics.b r0 = getAgent()
            r0.a(r1, r2)
            return
    }

    public static void reportError(android.content.Context r6, java.lang.String r7) {
            java.lang.String r6 = "com.umeng.umcrash.UMCrash"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "generateCustomLog"
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L27
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L27
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r0, r2)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L27
            r1[r4] = r7     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = "DEFAULT"
            r1[r5] = r7     // Catch: java.lang.Throwable -> L27
            r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L27
        L27:
            return
    }

    public static void reportError(android.content.Context r6, java.lang.Throwable r7) {
            java.lang.String r6 = "com.umeng.umcrash.UMCrash"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "generateCustomLog"
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L29
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r0, r2)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L29
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L29
            r1[r4] = r7     // Catch: java.lang.Throwable -> L29
            java.lang.String r7 = "DEFAULT"
            r1[r5] = r7     // Catch: java.lang.Throwable -> L29
            r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }

    public static void setCatchUncaughtExceptions(boolean r1) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r1)
            return
    }

    @java.lang.Deprecated
    public static void setCheckDevice(boolean r0) {
            return
    }

    @java.lang.Deprecated
    public static void setDebugMode(boolean r0) {
            return
    }

    public static void setFirstLaunchEvent(android.content.Context r1, java.util.List<java.lang.String> r2) {
            com.umeng.analytics.b r0 = getAgent()
            r0.a(r1, r2)
            return
    }

    private static void setGameScenarioType(android.content.Context r2) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            com.umeng.analytics.MobclickAgent$EScenarioType r1 = com.umeng.analytics.MobclickAgent.EScenarioType.E_UM_GAME
            r0.a(r2, r1)
            return
    }

    @java.lang.Deprecated
    public static void setLatencyWindow(long r0) {
            return
    }

    public static void setLocation(double r1, double r3) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r1, r3)
            return
    }

    public static void setOpenGLContext(javax.microedition.khronos.opengles.GL10 r1) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r1)
            return
    }

    public static void setPageCollectionMode(com.umeng.analytics.MobclickAgent.PageMode r0) {
            com.umeng.commonsdk.UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION = r0
            return
    }

    @java.lang.Deprecated
    public static void setScenarioType(android.content.Context r0, com.umeng.analytics.MobclickAgent.EScenarioType r1) {
            return
    }

    public static void setSecret(android.content.Context r1, java.lang.String r2) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.c(r1, r2)
            return
    }

    public static void setSessionContinueMillis(long r3) {
            r0 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            goto L8
        L7:
            r3 = r0
        L8:
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r3)
            return
    }

    private static void setSysListener(com.umeng.common.ISysListener r1) {
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r1)
            return
    }

    public static void unregisterPreProperty(android.content.Context r1, java.lang.String r2) {
            com.umeng.analytics.b r0 = getAgent()
            r0.f(r1, r2)
            return
    }

    public static void userProfile(java.lang.String r5, java.lang.Object r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lc
            java.lang.String r5 = "userProfile: key is null or empty, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r5)
            return
        Lc:
            java.lang.String r0 = "_"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L1a
            java.lang.String r5 = "userProfile: The user-defined key cannot start with an underscore, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r5)
            return
        L1a:
            r0 = 0
            char r1 = r5.charAt(r0)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 == 0) goto L2b
            java.lang.String r5 = "userProfile: The user-defined key cannot start with an number, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r5)
            return
        L2b:
            char[] r1 = r5.toCharArray()
            int r2 = r1.length
        L30:
            if (r0 >= r2) goto L5a
            char r3 = r1[r0]
            r4 = 97
            if (r3 < r4) goto L3d
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 > r4) goto L3d
            goto L51
        L3d:
            r4 = 65
            if (r3 < r4) goto L46
            r4 = 90
            if (r3 > r4) goto L46
            goto L51
        L46:
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 == 0) goto L4d
            goto L51
        L4d:
            r4 = 95
            if (r3 != r4) goto L54
        L51:
            int r0 = r0 + 1
            goto L30
        L54:
            java.lang.String r5 = "userProfile: The user-defined key contains invalid characters, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r5)
            return
        L5a:
            if (r6 != 0) goto L62
            java.lang.String r5 = "userProfile: value is null, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r5)
            return
        L62:
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.a(r5, r6)
            return
    }

    public static void userProfileEMail(java.lang.String r1) {
            if (r1 != 0) goto L8
            java.lang.String r1 = "userProfileEMail: email value is null, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r1)
            return
        L8:
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.d(r1)
            return
    }

    public static void userProfileMobile(java.lang.String r1) {
            if (r1 != 0) goto L8
            java.lang.String r1 = "userProfileMobile: mobile value is null, please check!"
            com.umeng.commonsdk.statistics.common.MLog.e(r1)
            return
        L8:
            com.umeng.analytics.b r0 = com.umeng.analytics.b.a()
            r0.c(r1)
            return
    }
}
