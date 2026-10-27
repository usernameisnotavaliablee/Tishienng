package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JCoreManager {
    private static int DEFAULT_CMD = 0;
    private static final java.lang.String TAG = "JCoreManager";
    private static final java.util.concurrent.atomic.AtomicBoolean isInited = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            cn.jiguang.api.JCoreManager.isInited = r0
            r0 = -1
            cn.jiguang.api.JCoreManager.DEFAULT_CMD = r0
            return
    }

    public JCoreManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addActivityLifeCallback(android.app.Application.ActivityLifecycleCallbacks r0) {
            cn.jiguang.d.a.a(r0)
            return
    }

    public static void addDispatchAction(java.lang.String r0, java.lang.String r1) {
            cn.jiguang.d.a.a(r0, r1)
            return
    }

    public static void changeLiveStatus(boolean r0) {
            return
    }

    public static android.content.Context getAppContext(android.content.Context r0) {
            android.content.Context r0 = cn.jiguang.internal.JConstants.getAppContext(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean getConnectionState(android.content.Context r9) {
            cn.jiguang.internal.JCoreInternalHelper r0 = cn.jiguang.internal.JCoreInternalHelper.getInstance()
            r8 = 0
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r2 = "JCore"
            r3 = 67
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            java.lang.Object r9 = r0.onEvent(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r9 instanceof java.lang.Boolean
            if (r0 == 0) goto L1e
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L1e:
            return r8
    }

    public static boolean getDebugMode() {
            boolean r0 = cn.jiguang.internal.JConstants.DEBUG_MODE
            return r0
    }

    public static long getStartId(android.content.Context r2) {
            cn.jiguang.internal.JCoreInternalHelper r2 = cn.jiguang.internal.JCoreInternalHelper.getInstance()
            long r0 = r2.getStartId()
            return r0
    }

    public static void init(android.content.Context r1) {
            r0 = 0
            init(r1, r0)
            return
    }

    public static void init(android.content.Context r8, int r9, android.os.Bundle r10) {
            android.content.Context r1 = cn.jiguang.internal.JConstants.getAppContext(r8)
            if (r1 != 0) goto L8
            goto L87
        L8:
            boolean r8 = cn.jiguang.av.b.a()
            java.lang.String r0 = "JCoreManager"
            if (r8 != 0) goto L17
            java.lang.String r8 = "user don't auth, so return init"
            cn.jiguang.w.f.l(r0, r8)
            return
        L17:
            java.util.concurrent.atomic.AtomicBoolean r8 = cn.jiguang.internal.JConstants.isCallInit
            r2 = 1
            r8.set(r2)
            if (r10 != 0) goto L24
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
        L24:
            r6 = r10
            java.lang.String r8 = "jg_init_start_time"
            long r3 = java.lang.System.currentTimeMillis()
            r6.putLong(r8, r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "init cmd:"
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            cn.jiguang.w.f.d(r0, r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = cn.jiguang.api.JCoreManager.isInited
            boolean r10 = r8.get()
            r0 = 0
            if (r10 != 0) goto L72
            r8.set(r2)
            boolean r9 = cn.jiguang.v.h.a(r1)     // Catch: java.lang.Throwable -> L87
            if (r9 == 0) goto L5d
            r8.set(r0)     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.atomic.AtomicBoolean r8 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L87
            r8.set(r0)     // Catch: java.lang.Throwable -> L87
            return
        L5d:
            cn.jiguang.d.a.a(r1)     // Catch: java.lang.Throwable -> L87
            r8 = 0
            cn.jiguang.internal.JCoreInternalHelper r0 = cn.jiguang.internal.JCoreInternalHelper.getInstance()     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "JCore"
            java.lang.String r5 = "tcp_a1"
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L87
            r3 = 10
            r4 = 1
            r0.onEvent(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L87
            return
        L72:
            r8 = 0
            r10 = 96
            if (r10 != r9) goto L87
            cn.jiguang.internal.JCoreInternalHelper r0 = cn.jiguang.internal.JCoreInternalHelper.getInstance()
            java.lang.String r5 = "tcp_a1"
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r2 = "JCore"
            r3 = 10
            r4 = 1
            r0.onEvent(r1, r2, r3, r4, r5, r6, r7)
        L87:
            return
    }

    public static void init(android.content.Context r1, android.os.Bundle r2) {
            int r0 = cn.jiguang.api.JCoreManager.DEFAULT_CMD
            init(r1, r0, r2)
            return
    }

    public static void initCrashHandler(android.content.Context r8) {
            r0 = 0
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r2 = "JCore"
            r3 = 70
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r8
            onEvent(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static boolean isInternal() {
            r0 = 0
            return r0
    }

    public static boolean isTestEnv() {
            boolean r0 = cn.jiguang.internal.JConstants.isTestEnv()
            return r0
    }

    public static java.lang.Object onEvent(android.content.Context r8, java.lang.String r9, int r10, java.lang.String r11, android.os.Bundle r12, java.lang.Object... r13) {
            switch(r10) {
                case 4: goto Lc;
                case 5: goto Lc;
                case 6: goto Lc;
                case 7: goto Lc;
                case 8: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto Lc;
                case 18: goto Lc;
                case 19: goto Lc;
                case 20: goto Lc;
                case 21: goto Lc;
                case 25: goto Lc;
                case 26: goto Lc;
                case 32: goto Lc;
                case 33: goto Lc;
                case 34: goto Lc;
                case 42: goto Lc;
                case 43: goto Lc;
                case 45: goto Lc;
                case 46: goto Lc;
                case 47: goto Lc;
                case 49: goto Lc;
                case 52: goto Lc;
                case 53: goto Lc;
                case 58: goto Lc;
                case 60: goto Lc;
                case 63: goto Lc;
                case 64: goto Lc;
                case 67: goto Lc;
                case 68: goto Lc;
                case 69: goto Lc;
                case 75: goto Lc;
                case 76: goto Lc;
                case 77: goto Lc;
                case 78: goto Lc;
                case 82: goto Lc;
                case 83: goto Lc;
                case 90: goto Lc;
                case 91: goto Lc;
                case 92: goto Lc;
                case 94: goto Lc;
                case 95: goto Lc;
                case 96: goto Lc;
                case 97: goto Lc;
                case 98: goto Lc;
                case 99: goto Lc;
                case 100: goto Lc;
                case 101: goto Lc;
                case 102: goto Lc;
                case 103: goto Lc;
                case 104: goto Lc;
                case 108: goto Lc;
                case 109: goto Lc;
                case 110: goto Lc;
                case 119: goto Lc;
                case 120: goto Lc;
                case 121: goto Lc;
                case 123: goto Lc;
                case 130: goto Lc;
                case 133: goto Lc;
                default: goto L3;
            }
        L3:
            r0 = 1
            r4 = 1
        L5:
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            goto Lf
        Lc:
            r0 = 0
            r4 = 0
            goto L5
        Lf:
            java.lang.Object r8 = onEvent(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static java.lang.Object onEvent(android.content.Context r9, java.lang.String r10, int r11, boolean r12, java.lang.String r13, android.os.Bundle r14, java.lang.Object... r15) {
            r0 = 96
            if (r0 != r11) goto L29
            r0 = 0
            r0 = r15[r0]     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "JCoreManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "saveAuth："
            r2.append(r3)     // Catch: java.lang.Throwable -> L28
            r2.append(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L28
            cn.jiguang.w.f.d(r1, r2)     // Catch: java.lang.Throwable -> L28
            r1 = 1
            cn.jiguang.av.b.a(r0, r1)     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
        L29:
            java.util.List<java.lang.Integer> r0 = cn.jiguang.c.b.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L38
            init(r9, r11, r14)
        L38:
            cn.jiguang.internal.JCoreInternalHelper r1 = cn.jiguang.internal.JCoreInternalHelper.getInstance()
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Object r9 = r1.onEvent(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static void register(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            register(r1, r2, r0)     // Catch: java.lang.Throwable -> L4
        L4:
            return
    }

    public static void register(android.content.Context r10, java.lang.String r11, android.os.Bundle r12) {
            java.lang.String r0 = cn.jiguang.v.a.b(r10)     // Catch: java.lang.Throwable -> L76
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "JCoreManager"
            if (r1 != 0) goto L19
            boolean r0 = r0.equals(r11)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L13
            goto L19
        L13:
            java.lang.String r0 = "[register] not same appkey with manifest,please check it"
            cn.jiguang.w.f.j(r2, r0)     // Catch: java.lang.Throwable -> L76
            goto L1b
        L19:
            cn.jiguang.internal.JConstants.APP_KEY = r11     // Catch: java.lang.Throwable -> L76
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r0.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "[register]  appkey ="
            r0.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = cn.jiguang.internal.JConstants.APP_KEY     // Catch: java.lang.Throwable -> L76
            r0.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = " originKep="
            r0.append(r1)     // Catch: java.lang.Throwable -> L76
            r0.append(r11)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L76
            cn.jiguang.w.f.e(r2, r0)     // Catch: java.lang.Throwable -> L76
            boolean r0 = cn.jiguang.v.h.a(r10)     // Catch: java.lang.Throwable -> L76
            r1 = 0
            if (r0 == 0) goto L46
            java.util.concurrent.atomic.AtomicBoolean r10 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L76
            r10.set(r1)     // Catch: java.lang.Throwable -> L76
            return
        L46:
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L76
            r2 = 1
            r0.set(r2)     // Catch: java.lang.Throwable -> L76
            cn.jiguang.d.a.a(r10)     // Catch: java.lang.Throwable -> L76
            if (r12 != 0) goto L56
            android.os.Bundle r12 = new android.os.Bundle     // Catch: java.lang.Throwable -> L76
            r12.<init>()     // Catch: java.lang.Throwable -> L76
        L56:
            r8 = r12
            java.lang.String r12 = "appkey"
            r8.putString(r12, r11)     // Catch: java.lang.Throwable -> L76
            java.lang.String r11 = "jg_init_start_time"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L76
            r8.putLong(r11, r2)     // Catch: java.lang.Throwable -> L76
            cn.jiguang.internal.JCoreInternalHelper r2 = cn.jiguang.internal.JCoreInternalHelper.getInstance()     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "JCore"
            java.lang.String r7 = "a5"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L76
            r5 = 10
            r6 = 1
            r3 = r10
            r2.onEvent(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L76
        L76:
            return
    }

    public static void removeActivityLifeCallback(android.app.Application.ActivityLifecycleCallbacks r0) {
            cn.jiguang.d.a.b(r0)
            return
    }

    public static void reportWakedData(android.content.Context r6, android.os.Bundle r7, int r8) {
            java.lang.String r0 = "JCoreManager"
            if (r6 != 0) goto La
            java.lang.String r6 = "[reportWakedData] context was null"
            cn.jiguang.w.f.j(r0, r6)
            return
        La:
            if (r7 != 0) goto L12
            java.lang.String r6 = "[reportWakedData] bundle was null"
            cn.jiguang.w.f.j(r0, r6)
            return
        L12:
            java.lang.String r1 = "type"
            r2 = -1
            int r3 = r7.getInt(r1, r2)
            if (r3 != r2) goto L1c
            goto L1d
        L1c:
            r8 = r3
        L1d:
            r2 = 1
            if (r8 == r2) goto L47
            r2 = 2
            if (r8 == r2) goto L47
            r2 = 4
            if (r8 == r2) goto L47
            r2 = 8
            if (r8 == r2) goto L47
            r2 = 16
            if (r8 == r2) goto L47
            r2 = 32
            if (r8 == r2) goto L47
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[reportWakedData] wrong type:"
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            cn.jiguang.w.f.j(r0, r6)
            return
        L47:
            r7.putInt(r1, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "action - reportWakedData"
            r8.append(r1)
            java.lang.String r1 = r7.toString()
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            cn.jiguang.w.f.c(r0, r8)
            r8 = 0
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r1 = 0
            r2 = 74
            r3 = 0
            r0 = r6
            r4 = r7
            onEvent(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void requestPermission(android.content.Context r9) {
            java.lang.String r0 = "JCoreManager"
            if (r9 != 0) goto La
            java.lang.String r9 = "[requestPermission] context was null"
        L6:
            cn.jiguang.w.f.j(r0, r9)
            return
        La:
            boolean r1 = r9 instanceof android.app.Activity
            if (r1 != 0) goto L11
            java.lang.String r9 = "[requestPermission] context must instanceof Activity"
            goto L6
        L11:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L1a
            java.lang.String r9 = "[requestPermission] android.os.Build.VERSION.SDK_INT<23"
            goto L6
        L1a:
            android.content.pm.ApplicationInfo r3 = r9.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            if (r3 >= r2) goto L25
            java.lang.String r9 = "[requestPermission] app targetSdkVersion<23"
            goto L6
        L25:
            if (r1 < r2) goto Lbe
            android.content.pm.ApplicationInfo r1 = r9.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            if (r1 < r2) goto Lbe
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.lang.Exception -> L58
            r1.<init>()     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r1.add(r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            r1.add(r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            r1.add(r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            r1.add(r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = "will request background location permission"
            r3 = 0
            boolean r2 = cn.jiguang.internal.JConstants.isAndroidQ(r9, r3, r2)     // Catch: java.lang.Exception -> L58
            if (r2 == 0) goto L5a
            java.lang.String r2 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            r1.add(r2)     // Catch: java.lang.Exception -> L58
            goto L5a
        L58:
            r9 = move-exception
            goto Lab
        L5a:
            java.util.List r1 = cn.jiguang.av.p.a(r9, r1)     // Catch: java.lang.Exception -> L58
            if (r1 == 0) goto Lbe
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L58
            if (r2 == 0) goto L67
            goto Lbe
        L67:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L58
            r2.<init>()     // Catch: java.lang.Exception -> L58
            java.lang.String r4 = "lackPermissions:"
            r2.append(r4)     // Catch: java.lang.Exception -> L58
            r2.append(r1)     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L58
            cn.jiguang.w.f.a(r0, r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = "android.app.Activity"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r4 = "requestPermissions"
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L58
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r6[r3] = r7     // Catch: java.lang.Exception -> L58
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L58
            r8 = 1
            r6[r8] = r7     // Catch: java.lang.Exception -> L58
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r6)     // Catch: java.lang.Exception -> L58
            int r4 = r1.size()     // Catch: java.lang.Exception -> L58
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L58
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch: java.lang.Exception -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L58
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L58
            r5[r3] = r1     // Catch: java.lang.Exception -> L58
            r5[r8] = r4     // Catch: java.lang.Exception -> L58
            r2.invoke(r9, r5)     // Catch: java.lang.Exception -> L58
            return
        Lab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#unexcepted - requestPermission e:"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            goto L6
        Lbe:
            return
    }

    public static void setAnalysisAction(cn.jiguang.api.JAnalyticsAction r0) {
            cn.jiguang.internal.JConstants.jAnalyticsAction = r0
            return
    }

    public static void setDebugMode(boolean r0) {
            cn.jiguang.internal.JConstants.DEBUG_MODE = r0
            return
    }

    public static void setLBSEnable(android.content.Context r8, boolean r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action - setLBSEnable-control:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreManager"
            cn.jiguang.w.f.c(r1, r0)
            java.lang.String r0 = "Since the SDK has provided a new geographical location control interface, part of the control logic has become invalid, and this interface will be gradually deprecated. Please adapt to the new interface as soon as possible."
            cn.jiguang.w.f.j(r1, r0)
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L30
            cn.jiguang.e.a r2 = cn.jiguang.e.a.ap()     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L30
            cn.jiguang.e.a r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L30
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r1]     // Catch: java.lang.Throwable -> L30
            r3[r0] = r2     // Catch: java.lang.Throwable -> L30
            cn.jiguang.e.b.a(r8, r3)     // Catch: java.lang.Throwable -> L30
        L30:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r9
            r3 = 0
            r4 = 27
            r5 = 0
            r6 = 0
            r2 = r8
            onEvent(r2, r3, r4, r5, r6, r7)
            return
    }

    public static void setSDKConfigs(android.content.Context r8, android.os.Bundle r9) {
            cn.jiguang.internal.JCoreInternalHelper r0 = cn.jiguang.internal.JCoreInternalHelper.getInstance()
            r1 = 0
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r2 = "JCore"
            r3 = 55
            r4 = 1
            r5 = 0
            r1 = r8
            r6 = r9
            r0.onEvent(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void setStartId(android.content.Context r1) {
            cn.jiguang.internal.JCoreInternalHelper r0 = cn.jiguang.internal.JCoreInternalHelper.getInstance()
            r0.setStartId(r1)
            return
    }

    public static void stopCrashHandler(android.content.Context r8) {
            r0 = 0
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r2 = "JCore"
            r3 = 71
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r8
            onEvent(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void unRegister(android.content.Context r10) {
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit
            r1 = 1
            r0.set(r1)
            cn.jiguang.d.a.a(r10)
            cn.jiguang.internal.JCoreInternalHelper r2 = cn.jiguang.internal.JCoreInternalHelper.getInstance()
            r0 = 0
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r4 = "JCore"
            r5 = 10
            r6 = 1
            java.lang.String r7 = "tcp_a23"
            r8 = 0
            r3 = r10
            r2.onEvent(r3, r4, r5, r6, r7, r8, r9)
            return
    }
}
