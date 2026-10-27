package cn.jpush.android.helper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JCoreHelper {
    private static java.lang.Integer a;

    public JCoreHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(android.content.Context r2, java.lang.String r3, int r4, int r5, long r6, long r8, byte[] r10, boolean r11) {
            r0 = r6
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "cmd"
            r6.putInt(r7, r4)
            java.lang.String r4 = "ver"
            r6.putInt(r4, r5)
            java.lang.String r4 = "rid"
            r6.putLong(r4, r0)
            java.lang.String r4 = "timeout"
            r6.putLong(r4, r8)
            java.lang.String r4 = "body"
            r6.putByteArray(r4, r10)
            if (r11 == 0) goto L25
            r4 = 17
            goto L27
        L25:
            r4 = 16
        L27:
            r5 = 0
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r5 = 0
            cn.jiguang.api.JCoreManager.onEvent(r2, r3, r4, r5, r6, r7)
            return
    }

    public static java.lang.Boolean checkSdkBanned(android.content.Context r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r2 = "JPUSH"
            r3 = 82
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L15
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            return r7
        L15:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
    }

    public static void execue(android.content.Context r7, java.lang.String r8, java.lang.Runnable r9) {
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r9
            java.lang.String r2 = "JPUSH"
            r3 = 11
            r5 = 0
            r1 = r7
            r4 = r8
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static org.json.JSONObject fillBase(android.content.Context r7, org.json.JSONObject r8, java.lang.String r9) {
            r0 = 2
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r8 = 1
            r6[r8] = r9
            java.lang.String r2 = "JPUSH"
            r3 = 26
            java.lang.String r4 = ""
            r5 = 0
            r1 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r8 = r7 instanceof org.json.JSONObject
            if (r8 == 0) goto L1c
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            return r7
        L1c:
            r7 = 0
            return r7
    }

    public static void futureExecutor(android.content.Context r1, java.lang.Runnable r2) {
            java.lang.String r0 = "FUTURE"
            futureExecutor(r1, r0, r2)
            return
    }

    public static void futureExecutor(android.content.Context r6, java.lang.String r7, java.lang.Runnable r8) {
            int r0 = cn.jpush.android.m.a.f1834c
            r1 = 238(0xee, float:3.34E-43)
            if (r0 < r1) goto L17
            r7 = 1
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r7 = 0
            r5[r7] = r8
            java.lang.String r1 = "JPUSH"
            r2 = 76
            r3 = 0
            r4 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
        L17:
            r0 = r6
            execue(r0, r7, r8)
            return
    }

    public static boolean geoEnable(android.content.Context r10) {
            r0 = 1
            int r1 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L43
            r2 = 490(0x1ea, float:6.87E-43)
            r3 = 0
            if (r1 < r2) goto L2f
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L43
            r8.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r10 = "configID"
            r1 = 1502(0x5de, float:2.105E-42)
            r8.putInt(r10, r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r10 = "isFromJCore"
            r8.putBoolean(r10, r0)     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L43
            r4 = 0
            r5 = 0
            r6 = 116(0x74, float:1.63E-43)
            r7 = 0
            java.lang.Object r10 = cn.jiguang.api.JCoreManager.onEvent(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L43
            boolean r1 = r10 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L43
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L43
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L43
            return r10
        L2f:
            boolean r1 = cn.jpush.android.cache.a.s(r10)     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L43
            boolean r1 = cn.jpush.android.cache.a.o(r10)     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L43
            boolean r10 = cn.jpush.android.cache.a.q(r10)     // Catch: java.lang.Throwable -> L43
            if (r10 == 0) goto L42
            goto L43
        L42:
            return r3
        L43:
            return r0
    }

    public static java.lang.String getAppKey(android.content.Context r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r2 = 0
            r3 = 7
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L13
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L13:
            java.lang.String r7 = ""
            return r7
    }

    public static java.lang.String getDeviceId(android.content.Context r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r2 = 0
            r3 = 8
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L14
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L14:
            java.lang.String r7 = ""
            return r7
    }

    public static java.lang.Object getDyInfo(android.content.Context r7, int r8) {
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            java.lang.String r2 = "JPUSH"
            r3 = 64
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static int getJCoreSDKVersionInt() {
            java.lang.Integer r0 = cn.jpush.android.helper.JCoreHelper.a
            if (r0 == 0) goto L9
            int r0 = r0.intValue()
            return r0
        L9:
            r5 = 0
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 0
            r2 = 0
            r3 = 25
            r4 = 0
            java.lang.Object r1 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L22
            java.lang.Integer r1 = (java.lang.Integer) r1
            cn.jpush.android.helper.JCoreHelper.a = r1
            int r0 = r1.intValue()
        L22:
            return r0
    }

    public static int getJPushSDKVersionInt() {
            int r0 = cn.jpush.android.m.a.a
            return r0
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.Context r1, int r2) {
            if (r1 == 0) goto Lb
            java.lang.String r0 = r1.getPackageName()
            android.content.pm.PackageInfo r1 = getPackageInfo(r1, r0, r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.Context r10, java.lang.String r11, int r12) {
            java.lang.String r1 = "JCoreHelper"
            r2 = 0
            if (r10 == 0) goto L41
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L41
            if (r12 >= 0) goto Le
            goto L41
        Le:
            int r0 = cn.jiguang.internal.JConstants.SDK_VERSION_INT     // Catch: java.lang.Throwable -> L33
            r3 = 332(0x14c, float:4.65E-43)
            if (r0 < r3) goto L37
            java.lang.String r5 = "JPUSH"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L33
            r0 = 2
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L33
            r0 = 0
            r9[r0] = r11     // Catch: java.lang.Throwable -> L33
            r11 = 1
            r9[r11] = r12     // Catch: java.lang.Throwable -> L33
            r6 = 99
            r7 = 0
            r8 = 0
            r4 = r10
            java.lang.Object r10 = cn.jiguang.api.JCoreManager.onEvent(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L33
            boolean r11 = r10 instanceof android.content.pm.PackageInfo     // Catch: java.lang.Throwable -> L33
            if (r11 == 0) goto L36
            android.content.pm.PackageInfo r10 = (android.content.pm.PackageInfo) r10     // Catch: java.lang.Throwable -> L33
            return r10
        L33:
            r0 = move-exception
            r10 = r0
            goto L47
        L36:
            return r2
        L37:
            r4 = r10
            android.content.pm.PackageManager r10 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L33
            android.content.pm.PackageInfo r10 = r10.getPackageInfo(r11, r12)     // Catch: java.lang.Throwable -> L33
            return r10
        L41:
            java.lang.String r10 = "get p info failed, because param is illegal"
            cn.jpush.android.helper.Logger.d(r1, r10)     // Catch: java.lang.Throwable -> L33
            return r2
        L47:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "get p info failed, error: "
            r11.append(r12)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jpush.android.helper.Logger.w(r1, r10)
            return r2
    }

    public static java.lang.String getRegistrationID(android.content.Context r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r2 = "JPUSH"
            r3 = 4
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L14
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L14:
            java.lang.String r7 = ""
            return r7
    }

    public static long getUid(android.content.Context r7) {
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r1 = 0
            r6[r1] = r0
            r2 = 0
            r3 = 20
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L1c
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public static boolean isAuth(android.content.Context r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r2 = 0
            r3 = 98
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L18
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L18:
            r7 = 1
            return r7
    }

    public static boolean isContinueBusiness(android.content.Context r7) {
            int r0 = cn.jpush.android.m.a.f1834c
            r1 = 470(0x1d6, float:6.59E-43)
            if (r0 >= r1) goto L8
            r7 = 1
            return r7
        L8:
            r4 = 0
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r1 = 0
            r2 = 123(0x7b, float:1.72E-43)
            r3 = 0
            r0 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L20
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L20:
            return r6
    }

    public static boolean isIpv6Priority(android.content.Context r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r2 = "JPUSH"
            r3 = 121(0x79, float:1.7E-43)
            r4 = 0
            r5 = 0
            r1 = r7
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L19
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L19:
            return r0
    }

    public static void majorExecutor(android.content.Context r6, java.lang.String r7, java.lang.Runnable r8) {
            int r0 = cn.jpush.android.m.a.f1834c
            r1 = 238(0xee, float:3.34E-43)
            if (r0 < r1) goto L17
            r7 = 1
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r7 = 0
            r5[r7] = r8
            java.lang.String r1 = "JPUSH"
            r2 = 75
            r3 = 0
            r4 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
        L17:
            r0 = r6
            execue(r0, r7, r8)
            return
    }

    public static void netMonitor(android.content.Context r2, java.lang.String r3, java.lang.String r4, long r5, int r7) {
            r0 = r5
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r5 = "url"
            r6.putString(r5, r3)
            java.lang.String r3 = "type"
            r6.putString(r3, r4)
            java.lang.String r3 = "req"
            r6.putLong(r3, r0)
            java.lang.String r3 = "res"
            long r4 = (long) r7
            r6.putLong(r3, r4)
            r3 = 0
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r3 = "JPUSH"
            r4 = 122(0x7a, float:1.71E-43)
            r5 = 0
            cn.jiguang.api.JCoreManager.onEvent(r2, r3, r4, r5, r6, r7)
            return
    }

    public static void normalExecutor(android.content.Context r6, java.lang.String r7, java.lang.Runnable r8) {
            int r0 = cn.jpush.android.m.a.f1834c
            r1 = 238(0xee, float:3.34E-43)
            if (r0 < r1) goto L17
            r7 = 1
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r7 = 0
            r5[r7] = r8
            java.lang.String r1 = "JPUSH"
            r2 = 77
            r3 = 0
            r4 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
        L17:
            r0 = r6
            execue(r0, r7, r8)
            return
    }

    public static void openLog(android.content.Context r7, android.os.Bundle r8) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r2 = "JPUSH"
            r3 = 105(0x69, float:1.47E-43)
            r4 = 0
            r1 = r7
            r5 = r8
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void reportSdkType(android.content.Context r8, java.lang.String r9, int r10, int r11, int r12) {
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0 = 4
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r0 = 0
            r7[r0] = r9
            r9 = 1
            r7[r9] = r10
            r9 = 2
            r7[r9] = r11
            r9 = 3
            r7[r9] = r12
            java.lang.String r2 = "JCore"
            r3 = 72
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r8
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void runActionWithService(android.content.Context r7, java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r3 = 3
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void saEvent(android.content.Context r7, java.lang.String r8, java.lang.Object r9) {
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r9
            java.lang.String r2 = "JPUSH"
            r3 = 56
            r5 = 0
            r1 = r7
            r4 = r8
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void sendData(android.content.Context r10, java.lang.String r11, int r12, int r13, long r14, byte[] r16) {
            r6 = 0
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r8 = r16
            a(r0, r1, r2, r3, r4, r6, r8, r9)
            return
    }

    public static void sendRequest(android.content.Context r10, java.lang.String r11, int r12, int r13, long r14, long r16, byte[] r18) {
            r9 = 1
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r6 = r16
            r8 = r18
            a(r0, r1, r2, r3, r4, r6, r8, r9)
            return
    }

    public static void setChannel(android.content.Context r7, java.lang.String r8) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r2 = "JPUSH"
            r3 = 9
            r5 = 0
            r1 = r7
            r4 = r8
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void triggerSceneCheck(android.content.Context r8) {
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r1 = 0
            r7[r1] = r0
            java.lang.String r3 = "JPUSH"
            r4 = 29
            r5 = 0
            r6 = 0
            r2 = r8
            cn.jiguang.api.JCoreManager.onEvent(r2, r3, r4, r5, r6, r7)
            return
    }

    public static void updateDy(android.content.Context r7, int r8) {
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            java.lang.String r2 = "JPUSH"
            r3 = 65
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }
}
