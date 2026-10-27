package com.umeng.commonsdk.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMFrUtils {
    private static final java.lang.String KEY_LAST_INSTANT_SUCC_BUILD_TIME = "last_instant_build_time";
    private static final java.lang.String KEY_LAST_SUCC_BUILD_TIME = "last_successful_build_time";
    private static java.lang.String mDefaultEnvelopeDir;
    private static java.lang.String mDefaultEnvelopeDirPath;
    private static java.lang.Object mEnvelopeBuildTimeLock;
    private static java.lang.Object mEnvelopeFileLock;
    private static java.lang.String sCurrentProcessName;



    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeBuildTimeLock = r0
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "env"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.framework.UMFrUtils.mDefaultEnvelopeDir = r0
            r0 = 0
            com.umeng.commonsdk.framework.UMFrUtils.mDefaultEnvelopeDirPath = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeFileLock = r0
            java.lang.String r0 = ""
            com.umeng.commonsdk.framework.UMFrUtils.sCurrentProcessName = r0
            return
    }

    public UMFrUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean checkPermission(android.content.Context r7, java.lang.String r8) {
            r0 = 0
            if (r7 == 0) goto L4e
            android.content.Context r1 = r7.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 1
            if (r2 < r3) goto L3b
            java.lang.String r2 = "android.content.Context"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "checkSelfPermission"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r0] = r6     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            r3[r0] = r8     // Catch: java.lang.Throwable -> L36
            java.lang.Object r7 = r2.invoke(r7, r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L36
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L36
            if (r7 != 0) goto L35
            return r4
        L35:
            return r0
        L36:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r7)
            goto L4e
        L3b:
            android.content.pm.PackageManager r7 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r1.getPackageName()     // Catch: java.lang.Throwable -> L4a
            int r7 = r7.checkPermission(r8, r2)     // Catch: java.lang.Throwable -> L4a
            if (r7 != 0) goto L4e
            return r4
        L4a:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r7)
        L4e:
            return r0
    }

    public static int envelopeFileNumber(android.content.Context r4) {
            r0 = 0
            if (r4 == 0) goto L28
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = getEnvelopeDirPath(r4)     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeFileLock     // Catch: java.lang.Throwable -> L24
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L24
            boolean r3 = r1.isDirectory()     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L20
            java.lang.String[] r1 = r1.list()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            int r1 = r1.length     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r1 = move-exception
            goto L22
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            goto L28
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r1     // Catch: java.lang.Throwable -> L24
        L24:
            r1 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r1)
        L28:
            return r0
    }

    public static java.lang.String getCurrentProcessName(android.content.Context r4) {
            java.lang.String r0 = com.umeng.commonsdk.framework.UMFrUtils.sCurrentProcessName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L6b
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L13
            r1 = 28
            if (r0 < r1) goto L15
            java.lang.String r0 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Throwable -> L13
            goto L17
        L13:
            r0 = move-exception
            goto L60
        L15:
            java.lang.String r0 = ""
        L17:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L5d
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = getProcessName(r0)     // Catch: java.lang.Throwable -> L13
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L2e
            com.umeng.commonsdk.framework.UMFrUtils.sCurrentProcessName = r1     // Catch: java.lang.Throwable -> L13
            goto L6b
        L2e:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch: java.lang.Throwable -> L13
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L6b
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L6b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L13
            if (r2 <= 0) goto L6b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L13
        L48:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L13
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> L13
            int r3 = r2.pid     // Catch: java.lang.Throwable -> L13
            if (r3 != r0) goto L48
            java.lang.String r0 = r2.processName     // Catch: java.lang.Throwable -> L13
            com.umeng.commonsdk.framework.UMFrUtils.sCurrentProcessName = r0     // Catch: java.lang.Throwable -> L13
            goto L6b
        L5d:
            com.umeng.commonsdk.framework.UMFrUtils.sCurrentProcessName = r0     // Catch: java.lang.Throwable -> L13
            goto L6b
        L60:
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r0)
        L6b:
            java.lang.String r4 = com.umeng.commonsdk.framework.UMFrUtils.sCurrentProcessName
            return r4
    }

    private static long getDistanceDays(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            long r3 = r3 - r1
            goto L8
        L6:
            long r3 = r1 - r3
        L8:
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 / r1
            return r3
    }

    public static java.lang.String getEnvelopeDirPath(android.content.Context r3) {
            java.lang.Object r0 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeFileLock
            monitor-enter(r0)
            java.lang.String r1 = com.umeng.commonsdk.framework.UMFrUtils.mDefaultEnvelopeDirPath     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2d
            java.io.File r2 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L2d
            r1.append(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L2d
            r1.append(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "."
            r1.append(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.mDefaultEnvelopeDir     // Catch: java.lang.Throwable -> L2d
            r1.append(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2d
            com.umeng.commonsdk.framework.UMFrUtils.mDefaultEnvelopeDirPath = r1     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r1 = move-exception
            goto L48
        L2f:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = com.umeng.commonsdk.framework.UMFrUtils.mDefaultEnvelopeDirPath     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L4b
            boolean r1 = r1.mkdir()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L4b
            java.lang.String r1 = "--->>> Create Envelope Directory failed!!!"
            com.umeng.commonsdk.statistics.common.ULog.d(r1)     // Catch: java.lang.Throwable -> L2d
            goto L4b
        L48:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r3, r1)     // Catch: java.lang.Throwable -> L4f
        L4b:
            java.lang.String r3 = com.umeng.commonsdk.framework.UMFrUtils.mDefaultEnvelopeDirPath     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return r3
        L4f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r3
    }

    public static java.io.File getEnvelopeFile(android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = getEnvelopeDirPath(r3)
            r1.<init>(r3)
            java.lang.Object r3 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeFileLock
            monitor-enter(r3)
            java.io.File[] r1 = r1.listFiles()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            int r2 = r1.length     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L1a
            goto L29
        L1a:
            com.umeng.commonsdk.framework.UMFrUtils$2 r0 = new com.umeng.commonsdk.framework.UMFrUtils$2     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.util.Arrays.sort(r1, r0)     // Catch: java.lang.Throwable -> L27
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            return r0
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            return r0
        L2b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    public static long getLastInstantBuildTime(android.content.Context r4) {
            java.lang.Object r0 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeBuildTimeLock
            monitor-enter(r0)
            android.content.SharedPreferences r4 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "last_instant_build_time"
            r2 = 0
            long r1 = r4.getLong(r1, r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public static long getLastSuccessfulBuildTime(android.content.Context r4) {
            java.lang.Object r0 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeBuildTimeLock
            monitor-enter(r0)
            android.content.SharedPreferences r4 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "last_successful_build_time"
            r2 = 0
            long r1 = r4.getLong(r1, r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r4
    }

    public static java.lang.String getLegacyEnvelopeDir(android.content.Context r4) {
            java.lang.String r0 = getCurrentProcessName(r4)     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L35
            com.umeng.analytics.pro.au r1 = com.umeng.analytics.pro.au.b()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "lepd"
            java.lang.String r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L31
            r2 = 58
            r3 = 95
            java.lang.String r0 = r0.replace(r2, r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "--->>> getEnvelopeDir: use current process name as envelope directory."
            com.umeng.commonsdk.statistics.common.ULog.d(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            r2.append(r1)     // Catch: java.lang.Throwable -> L31
            r2.append(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L31
            return r4
        L31:
            r0 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r4, r0)
        L35:
            java.lang.String r4 = com.umeng.commonsdk.framework.UMFrUtils.mDefaultEnvelopeDir
            return r4
    }

    private static java.lang.String getProcessName(int r5) {
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L36
            r3.append(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "/cmdline"
            r3.append(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L36
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L36
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r1.readLine()     // Catch: java.lang.Throwable -> L30
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L32
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            goto L38
        L32:
            r1.close()     // Catch: java.lang.Throwable -> L35
        L35:
            return r5
        L36:
            r1 = r0
        L38:
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.lang.Throwable -> L3d
        L3d:
            return r0
    }

    public static java.lang.String getSubProcessName(android.content.Context r5) {
            java.lang.String r0 = ""
            java.lang.String r1 = getCurrentProcessName(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = ":"
            int r2 = r1.indexOf(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 < 0) goto L17
            int r3 = r2 + 1
            java.lang.String r0 = r1.substring(r3)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r1 = move-exception
            goto L38
        L17:
            if (r2 >= 0) goto L37
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L15
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L15
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L15
            if (r4 <= r3) goto L36
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L15
            int r2 = r2 + 1
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r1.substring(r2, r3)     // Catch: java.lang.Throwable -> L15
            return r5
        L36:
            return r1
        L37:
            return r0
        L38:
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r1)
            return r0
    }

    public static boolean hasEnvelopeFile(android.content.Context r6, com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType r7) {
            java.lang.String r0 = "a"
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r1 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL
            if (r7 != r1) goto L8
            java.lang.String r0 = "i"
        L8:
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r1 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_ZeroEnv
            if (r7 != r1) goto Le
            java.lang.String r0 = "z"
        Le:
            com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r1 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_Silent
            if (r7 != r1) goto L14
            java.lang.String r0 = "h"
        L14:
            java.lang.String r7 = getEnvelopeDirPath(r6)
            r1 = 0
            if (r7 == 0) goto L50
            java.io.File r2 = new java.io.File
            r2.<init>(r7)
            java.lang.Object r7 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeFileLock
            monitor-enter(r7)
            java.io.File[] r2 = r2.listFiles()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            int r3 = r2.length     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto L2d
            goto L47
        L2d:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L45
            r4 = 0
        L2f:
            if (r4 >= r3) goto L4c
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L45
            boolean r5 = r5.startsWith(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L42
            r6 = 1
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L40
            return r6
        L40:
            r6 = move-exception
            goto L4e
        L42:
            int r4 = r4 + 1
            goto L2f
        L45:
            r0 = move-exception
            goto L49
        L47:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L40
            return r1
        L49:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r0)     // Catch: java.lang.Throwable -> L40
        L4c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L40
            return r1
        L4e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L40
            throw r6
        L50:
            return r1
    }

    public static boolean isOnline(android.content.Context r1) {
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = checkPermission(r1, r0)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L29
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L1d
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L29
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L29
            boolean r1 = r0.isConnectedOrConnecting()     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            r0 = move-exception
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
        L29:
            r1 = 0
            return r1
    }

    public static boolean removeEnvelopeFile(java.io.File r3) {
            android.content.Context r0 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
            java.lang.Object r1 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeFileLock
            monitor-enter(r1)
            if (r3 == 0) goto L1b
            boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L1b
            boolean r3 = r3.delete()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            r3 = move-exception
            goto L1e
        L17:
            r3 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r0, r3)     // Catch: java.lang.Throwable -> L15
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            r3 = 1
            return r3
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    public static void removeRedundantEnvelopeFiles(android.content.Context r5, int r6) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = getEnvelopeDirPath(r5)
            r0.<init>(r1)
            java.lang.Object r1 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeFileLock
            monitor-enter(r1)
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L55
            int r2 = r0.length     // Catch: java.lang.Throwable -> L51
            if (r2 > r6) goto L16
            goto L55
        L16:
            com.umeng.commonsdk.framework.UMFrUtils$1 r2 = new com.umeng.commonsdk.framework.UMFrUtils$1     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
            java.util.Arrays.sort(r0, r2)     // Catch: java.lang.Throwable -> L51
            int r2 = r0.length     // Catch: java.lang.Throwable -> L51
            if (r2 <= r6) goto L53
            r2 = 0
        L22:
            int r3 = r0.length     // Catch: java.lang.Throwable -> L48
            int r3 = r3 - r6
            if (r2 >= r3) goto L53
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L48
            boolean r3 = r3.delete()     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L4a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "--->>> remove ["
            r3.append(r4)     // Catch: java.lang.Throwable -> L48
            r3.append(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = "] file fail."
            r3.append(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L48
            com.umeng.commonsdk.statistics.common.ULog.d(r3)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r6 = move-exception
            goto L4d
        L4a:
            int r2 = r2 + 1
            goto L22
        L4d:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r6)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r5 = move-exception
            goto L57
        L53:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            return
        L55:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            return
        L57:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r5
    }

    public static int saveEnvelopeFile(android.content.Context r5, java.lang.String r6, byte[] r7) {
            r0 = 101(0x65, float:1.42E-43)
            if (r7 != 0) goto L5
            return r0
        L5:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = getEnvelopeDirPath(r5)
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.Object r2 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeFileLock
            monitor-enter(r2)
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r4.write(r7)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r4.close()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            com.umeng.commonsdk.statistics.internal.a r7 = com.umeng.commonsdk.statistics.internal.a.a(r5)     // Catch: java.lang.Throwable -> L47
            boolean r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L47
            com.umeng.commonsdk.statistics.internal.a r0 = com.umeng.commonsdk.statistics.internal.a.a(r5)     // Catch: java.lang.Throwable -> L47
            boolean r6 = r0.b(r6)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L49
            updateLastSuccessfulBuildTime(r5)     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r5 = move-exception
            goto L74
        L49:
            if (r6 == 0) goto L4e
            updateLastInstantBuildTime(r5)     // Catch: java.lang.Throwable -> L47
        L4e:
            r5 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47
            return r5
        L51:
            r6 = move-exception
            r3 = r4
            goto L69
        L54:
            r6 = move-exception
            r3 = r4
            goto L5a
        L57:
            r6 = move-exception
            goto L69
        L59:
            r6 = move-exception
        L5a:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r6)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L67
            r3.close()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r6 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r6)     // Catch: java.lang.Throwable -> L47
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47
            return r0
        L69:
            if (r3 == 0) goto L73
            r3.close()     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r5, r7)     // Catch: java.lang.Throwable -> L47
        L73:
            throw r6     // Catch: java.lang.Throwable -> L47
        L74:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47
            throw r5
    }

    public static void syncLegacyEnvelopeIfNeeded(android.content.Context r8) {
            if (r8 != 0) goto L4
            goto L9f
        L4:
            java.lang.String r0 = getLegacyEnvelopeDir(r8)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L10
            goto L9f
        L10:
            java.lang.String r1 = com.umeng.commonsdk.framework.UMFrUtils.mDefaultEnvelopeDir     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L1a
            goto L9f
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r1.<init>()     // Catch: java.lang.Throwable -> L8b
            java.io.File r2 = r8.getFilesDir()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L8b
            r1.append(r2)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "/."
            r1.append(r2)     // Catch: java.lang.Throwable -> L8b
            r1.append(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L8b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L42
            goto L9f
        L42:
            java.io.File[] r0 = r1.listFiles()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L8d
            int r2 = r0.length     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L4c
            goto L8d
        L4c:
            java.lang.String r2 = getEnvelopeDirPath(r8)     // Catch: java.lang.Throwable -> L7b
            r3 = 0
        L51:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L7b
            if (r3 >= r4) goto L7d
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L7b
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r6.<init>()     // Catch: java.lang.Throwable -> L7b
            r6.append(r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = java.io.File.separator     // Catch: java.lang.Throwable -> L7b
            r6.append(r7)     // Catch: java.lang.Throwable -> L7b
            r7 = r0[r3]     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L7b
            r6.append(r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7b
            r4.renameTo(r5)     // Catch: java.lang.Throwable -> L7b
            int r3 = r3 + 1
            goto L51
        L7b:
            r0 = move-exception
            goto L87
        L7d:
            boolean r0 = r1.isDirectory()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L9f
            r1.delete()     // Catch: java.lang.Throwable -> L7b
            goto L9f
        L87:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r8, r0)     // Catch: java.lang.Throwable -> L8b
            goto L9f
        L8b:
            r0 = move-exception
            goto L9c
        L8d:
            boolean r0 = r1.isDirectory()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L9f
            r1.delete()     // Catch: java.lang.Throwable -> L97
            return
        L97:
            r0 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r8, r0)     // Catch: java.lang.Throwable -> L8b
            goto L9f
        L9c:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r8, r0)
        L9f:
            return
    }

    public static byte[] toByteArray(java.lang.String r11) throws java.io.IOException {
            android.content.Context r1 = com.umeng.commonsdk.framework.UMModuleRegister.getAppContext()
            java.lang.Object r2 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeFileLock
            monitor-enter(r2)
            r3 = 0
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L52
            java.lang.String r4 = "r"
            r0.<init>(r11, r4)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L52
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L52
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            long r9 = r5.size()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r7 = 0
            java.nio.MappedByteBuffer r11 = r5.map(r6, r7, r9)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            java.nio.MappedByteBuffer r11 = r11.load()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            long r3 = r5.size()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r0 = (int) r3     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            byte[] r3 = new byte[r0]     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r0 = r11.remaining()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            if (r0 <= 0) goto L41
            int r0 = r11.remaining()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r4 = 0
            r11.get(r3, r4, r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            goto L41
        L39:
            r0 = move-exception
            r11 = r0
            r3 = r5
            goto L58
        L3d:
            r0 = move-exception
            r11 = r0
            r3 = r5
            goto L54
        L41:
            r5.close()     // Catch: java.lang.Throwable -> L45
            goto L4a
        L45:
            r0 = move-exception
            r11 = r0
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r11)     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            return r3
        L4c:
            r0 = move-exception
            r11 = r0
            goto L61
        L4f:
            r0 = move-exception
            r11 = r0
            goto L58
        L52:
            r0 = move-exception
            r11 = r0
        L54:
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r11)     // Catch: java.lang.Throwable -> L4f
            throw r11     // Catch: java.lang.Throwable -> L4f
        L58:
            r3.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)     // Catch: java.lang.Throwable -> L4c
        L60:
            throw r11     // Catch: java.lang.Throwable -> L4c
        L61:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r11
    }

    private static void updateLastInstantBuildTime(android.content.Context r4) {
            java.lang.Object r0 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeBuildTimeLock
            monitor-enter(r0)
            android.content.SharedPreferences r4 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r4)     // Catch: java.lang.Throwable -> L1a
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "last_instant_build_time"
            android.content.SharedPreferences$Editor r4 = r4.putLong(r3, r1)     // Catch: java.lang.Throwable -> L1a
            r4.commit()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    private static void updateLastSuccessfulBuildTime(android.content.Context r4) {
            java.lang.Object r0 = com.umeng.commonsdk.framework.UMFrUtils.mEnvelopeBuildTimeLock
            monitor-enter(r0)
            android.content.SharedPreferences r4 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r4)     // Catch: java.lang.Throwable -> L1a
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "last_successful_build_time"
            android.content.SharedPreferences$Editor r4 = r4.putLong(r3, r1)     // Catch: java.lang.Throwable -> L1a
            r4.commit()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }
}
