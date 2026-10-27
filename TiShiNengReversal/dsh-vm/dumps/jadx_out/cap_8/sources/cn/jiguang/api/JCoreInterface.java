package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JCoreInterface {
    public static java.lang.String DAEMON_ACTION = "cn.jpush.android.intent.DaemonService";
    private static final java.lang.String TAG = "JCoreInterface";
    private static android.content.Context mApplicationContext;

    static {
            return
    }

    public JCoreInterface() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void asyncExecute(java.lang.Runnable r6, int... r7) {
            r7 = 1
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r7 = 0
            r5[r7] = r6
            r0 = 0
            r1 = 0
            r2 = 12
            r3 = 0
            r4 = 0
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    public static boolean canCallDirect() {
            r0 = 0
            return r0
    }

    public static void ci(android.content.Context r7, boolean r8) {
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void enableSDKLocalLog(android.content.Context r6, boolean r7, boolean r8) {
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r0 = "enable"
            r4.putBoolean(r0, r7)
            java.lang.String r7 = "upload"
            r4.putBoolean(r7, r8)
            r7 = 0
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            r3 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void execute(java.lang.String r6, java.lang.Runnable r7, int... r8) {
            r8 = 1
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r8 = 0
            r5[r8] = r7
            r0 = 0
            r1 = 0
            r2 = 11
            r4 = 0
            r3 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    public static org.json.JSONObject fillBaseReport(org.json.JSONObject r7, java.lang.String r8) {
            r0 = 2
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r7
            r7 = 1
            r6[r7] = r8
            r1 = 0
            r2 = 0
            r3 = 26
            r4 = 0
            r5 = 0
            java.lang.Object r7 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r8 = r7 instanceof org.json.JSONObject
            if (r8 == 0) goto L1a
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            return r7
        L1a:
            r7 = 0
            return r7
    }

    public static java.lang.String getAccountId() {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 0
            r2 = 0
            r3 = 5
            r4 = 0
            r5 = 0
            java.lang.Object r0 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L13
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L13:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getAppKey() {
            android.content.Context r0 = cn.jiguang.api.JCoreInterface.mApplicationContext
            r1 = 0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r2 = 7
            r3 = 0
            r4 = 0
            java.lang.Object r0 = cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L14
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L14:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getChannel() {
            android.content.Context r0 = cn.jiguang.api.JCoreInterface.mApplicationContext
            r1 = 0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r2 = 6
            r3 = 0
            r4 = 0
            java.lang.Object r0 = cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L14
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L14:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String getCommonConfigAppkey() {
            android.content.Context r0 = cn.jiguang.api.JCoreInterface.mApplicationContext
            r1 = 0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r2 = 7
            r3 = 0
            r4 = 0
            java.lang.Object r0 = cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L14
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L14:
            java.lang.String r0 = ""
            return r0
    }

    public static boolean getConnectionState(android.content.Context r0) {
            android.content.Context r0 = cn.jiguang.api.JCoreInterface.mApplicationContext
            boolean r0 = cn.jiguang.api.JCoreManager.getConnectionState(r0)
            return r0
    }

    public static java.lang.String getDaemonAction() {
            java.lang.String r0 = cn.jiguang.api.JCoreInterface.DAEMON_ACTION
            return r0
    }

    public static boolean getDebugMode() {
            boolean r0 = cn.jiguang.api.JCoreManager.getDebugMode()
            return r0
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

    public static java.lang.String getHttpConfig(android.content.Context r0, java.lang.String r1) {
            java.lang.String r0 = ""
            return r0
    }

    public static int getJCoreSDKVersionInt() {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 0
            r2 = 0
            r3 = 25
            r4 = 0
            r5 = 0
            java.lang.Object r1 = cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L17
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
        L17:
            return r0
    }

    public static long getNextRid() {
            android.content.Context r0 = cn.jiguang.api.JCoreInterface.mApplicationContext
            long r0 = cn.jiguang.at.e.b(r0)
            return r0
    }

    public static java.lang.String getRegistrationID(android.content.Context r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r2 = 0
            r3 = 4
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

    public static long getReportTime() {
            android.content.Context r0 = cn.jiguang.api.JCoreInterface.mApplicationContext
            r1 = 0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r2 = 19
            r3 = 0
            r4 = 0
            java.lang.Object r0 = cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L19
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L19:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            return r0
    }

    public static boolean getRuningFlag() {
            java.lang.String r0 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "nubia"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static int getSid() {
            r0 = 0
            return r0
    }

    public static long getUid() {
            android.content.Context r0 = cn.jiguang.api.JCoreInterface.mApplicationContext
            r1 = 0
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r2 = 20
            r3 = 0
            r4 = 0
            java.lang.Object r0 = cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L19
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L19:
            r0 = 0
            return r0
    }

    public static boolean init(android.content.Context r0, boolean r1) {
            if (r0 == 0) goto L4
            cn.jiguang.api.JCoreInterface.mApplicationContext = r0
        L4:
            cn.jiguang.api.JCoreManager.init(r0)
            r0 = 1
            return r0
    }

    public static void initAction(java.lang.String r1, java.lang.Class<? extends cn.jiguang.api.JAction> r2) {
            cn.jiguang.at.a r0 = cn.jiguang.at.a.a()
            java.lang.String r2 = r2.getName()
            r0.a(r1, r2)
            return
    }

    public static void initActionExtra(java.lang.String r1, java.lang.Class<? extends cn.jiguang.api.JActionExtra> r2) {
            cn.jiguang.at.a r0 = cn.jiguang.at.a.a()
            java.lang.String r2 = r2.getName()
            r0.b(r1, r2)
            return
    }

    public static void initCrashHandler(android.content.Context r0) {
            cn.jiguang.api.JCoreManager.initCrashHandler(r0)
            return
    }

    public static boolean isTcpConnected() {
            android.content.Context r0 = cn.jiguang.api.JCoreInterface.mApplicationContext
            boolean r0 = cn.jiguang.api.JCoreManager.getConnectionState(r0)
            return r0
    }

    public static boolean isValidRegistered() {
            android.content.Context r0 = cn.jiguang.api.JCoreInterface.mApplicationContext
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r1 = 0
            r2 = 21
            r3 = 0
            r4 = 0
            java.lang.Object r0 = cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L19
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            return r6
    }

    public static void onFragmentPause(android.content.Context r7, java.lang.String r8) {
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r2 = r0.name()
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r3 = 56
            java.lang.String r4 = "f_pause"
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void onFragmentResume(android.content.Context r7, java.lang.String r8) {
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r2 = r0.name()
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r3 = 56
            java.lang.String r4 = "f_resume"
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void onKillProcess(android.content.Context r7) {
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r2 = r0.name()
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r3 = 56
            java.lang.String r4 = "kill"
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void onPause(android.content.Context r7) {
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r2 = r0.name()
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r3 = 56
            java.lang.String r4 = "pause"
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void onResume(android.content.Context r7) {
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r2 = r0.name()
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r3 = 56
            java.lang.String r4 = "resume"
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void processCtrlReport(int r7) {
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r7
            r1 = 0
            r2 = 0
            r3 = 24
            r4 = 0
            r5 = 0
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void putSingleExecutor(java.lang.String r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 0
            r2 = 0
            r3 = 13
            r5 = 0
            r4 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static java.lang.String readNewLogs(android.content.Context r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r2 = 0
            r3 = 131(0x83, float:1.84E-43)
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

    public static void register(android.content.Context r2) {
            java.lang.String r0 = "JCoreInterface"
            java.lang.String r1 = "Action - init registerOnly:"
            cn.jiguang.at.d.b(r0, r1)
            if (r2 == 0) goto Lb
            cn.jiguang.api.JCoreInterface.mApplicationContext = r2
        Lb:
            cn.jiguang.api.JCoreManager.init(r2)
            return
    }

    public static void report(android.content.Context r6, org.json.JSONObject r7, boolean r8) {
            r8 = 1
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r8 = 0
            r5[r8] = r7
            java.lang.String r1 = "JSupport"
            r2 = 14
            r3 = 0
            r4 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    public static boolean reportHttpData(android.content.Context r7, java.lang.Object r8, java.lang.String r9) {
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 0
            r6[r1] = r8
            r3 = 14
            r4 = 0
            r5 = 0
            r1 = r7
            r2 = r9
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static void requestPermission(android.content.Context r0) {
            cn.jiguang.api.JCoreManager.requestPermission(r0)
            return
    }

    public static void restart(android.content.Context r6, java.lang.String r7, android.os.Bundle r8, boolean r9) {
            r8 = 0
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r2 = 1
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    private static void send(android.content.Context r9, java.lang.String r10, int r11, byte[] r12, int r13, boolean r14) {
            if (r12 == 0) goto L7c
            int r11 = r12.length     // Catch: java.lang.Throwable -> L60
            r0 = 24
            if (r11 <= r0) goto L7c
            byte[] r11 = new byte[r0]     // Catch: java.lang.Throwable -> L60
            int r1 = r12.length     // Catch: java.lang.Throwable -> L60
            int r1 = r1 - r0
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L60
            r2 = 0
            java.lang.System.arraycopy(r12, r2, r11, r2, r0)     // Catch: java.lang.Throwable -> L60
            int r3 = r12.length     // Catch: java.lang.Throwable -> L60
            int r3 = r3 - r0
            java.lang.System.arraycopy(r12, r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L60
            cn.jiguang.at.c r12 = new cn.jiguang.at.c     // Catch: java.lang.Throwable -> L60
            r0 = 1
            r12.<init>(r0, r11)     // Catch: java.lang.Throwable -> L60
            android.os.Bundle r7 = new android.os.Bundle     // Catch: java.lang.Throwable -> L60
            r7.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r11 = "cmd"
            int r0 = r12.a()     // Catch: java.lang.Throwable -> L60
            r7.putInt(r11, r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r11 = "ver"
            int r0 = r12.e()     // Catch: java.lang.Throwable -> L60
            r7.putInt(r11, r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r11 = "rid"
            java.lang.Long r12 = r12.b()     // Catch: java.lang.Throwable -> L60
            long r3 = r12.longValue()     // Catch: java.lang.Throwable -> L60
            r7.putLong(r11, r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r11 = "timeout"
            long r12 = (long) r13     // Catch: java.lang.Throwable -> L60
            r7.putLong(r11, r12)     // Catch: java.lang.Throwable -> L60
            java.lang.String r11 = "body"
            r7.putByteArray(r11, r1)     // Catch: java.lang.Throwable -> L60
            if (r14 == 0) goto L53
            r11 = 17
            r5 = 17
            goto L57
        L53:
            r11 = 50
            r5 = 50
        L57:
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L60
            r6 = 0
            r3 = r9
            r4 = r10
            cn.jiguang.api.JCoreManager.onEvent(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L60
            return
        L60:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "send failed:"
            r10.append(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "JCoreInterface"
            cn.jiguang.at.d.e(r10, r9)
        L7c:
            return
    }

    public static void sendAction(android.content.Context r7, java.lang.String r8, android.os.Bundle r9) {
            if (r9 == 0) goto L2b
            java.lang.String r0 = "action"
            java.lang.String r4 = r9.getString(r0)     // Catch: java.lang.Throwable -> L13
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L13
            r3 = 3
            r1 = r7
            r2 = r8
            r5 = r9
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "sendAction failed:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "JCoreInterface"
            cn.jiguang.at.d.e(r8, r7)
        L2b:
            return
    }

    public static void sendData(android.content.Context r6, java.lang.String r7, int r8, byte[] r9) {
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            send(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void sendRequestData(android.content.Context r6, java.lang.String r7, int r8, byte[] r9) {
            r2 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r4 = r8
            r3 = r9
            send(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void setAccountId(java.lang.String r7) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r1 = 0
            r2 = 0
            r3 = 22
            r5 = 0
            r4 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void setAnalysisAction(cn.jiguang.api.JAnalyticsAction r0) {
            if (r0 == 0) goto L5
            cn.jiguang.api.JCoreManager.setAnalysisAction(r0)
        L5:
            return
    }

    public static void setCanLaunchedStoppedService(boolean r0) {
            return
    }

    public static void setCountryCode(android.content.Context r7, java.lang.String r8) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r2 = 0
            r3 = 128(0x80, float:1.8E-43)
            r5 = 0
            r1 = r7
            r4 = r8
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void setDaemonAction(java.lang.String r0) {
            cn.jiguang.api.JCoreInterface.DAEMON_ACTION = r0
            return
    }

    public static void setDebugMode(boolean r0) {
            cn.jiguang.api.JCoreManager.setDebugMode(r0)
            return
    }

    public static void setHeartbeatInterval(android.content.Context r6, int r7) {
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r0 = "heartbeat_interval"
            r4.putInt(r0, r7)
            r7 = 0
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r1 = 0
            r2 = 55
            r3 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public static void setImLBSEnable(android.content.Context r2, boolean r3) {
            java.lang.String r0 = "JCoreInterface"
            java.lang.String r1 = "action - setImLBSEnable-control"
            cn.jiguang.at.d.b(r0, r1)
            cn.jiguang.api.JCoreManager.setLBSEnable(r2, r3)
            return
    }

    public static void setLocationReportDelay(android.content.Context r6, long r7) {
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 1
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r8 = 0
            r5[r8] = r7
            r1 = 0
            r2 = 28
            r3 = 0
            r4 = 0
            r0 = r6
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void setPowerSaveMode(android.content.Context r0, boolean r1) {
            return
    }

    public static void setTestConn(boolean r0) {
            return
    }

    public static void setTestConnIPPort(java.lang.String r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Action - setTestConnIPPort ip:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " port:"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "JCoreInterface"
            cn.jiguang.at.d.b(r3, r2)
            return
    }

    public static void setWakeEnable(android.content.Context r7, boolean r8) {
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r2 = 0
            r3 = 73
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static android.os.Bundle si(android.content.Context r1, int r2, android.os.Bundle r3) {
            if (r1 == 0) goto Lc
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            cn.jiguang.api.JCoreInterface.mApplicationContext = r0
        Lc:
            android.os.Bundle r1 = cn.jiguang.at.b.a(r1, r2, r3)
            return r1
    }

    public static void stop(android.content.Context r6, java.lang.String r7, android.os.Bundle r8) {
            r8 = 0
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void stopCrashHandler(android.content.Context r0) {
            cn.jiguang.api.JCoreManager.stopCrashHandler(r0)
            return
    }

    public static void testCountryCode(android.content.Context r7, java.lang.String r8) {
            r0 = 0
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r2 = 0
            r3 = 23
            r5 = 0
            r1 = r7
            r4 = r8
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void triggerSceneCheck(android.content.Context r7, int r8) {
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r8
            r2 = 0
            r3 = 29
            r4 = 0
            r5 = 0
            r1 = r7
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)
            return
    }
}
