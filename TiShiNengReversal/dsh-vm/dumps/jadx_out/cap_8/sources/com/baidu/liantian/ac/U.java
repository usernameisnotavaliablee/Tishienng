package com.baidu.liantian.ac;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class U extends java.lang.Thread {
    public static final int FROM_DAILY_ALARM = 6;
    public static final int FROM_DEFAULT = 0;
    public static final int FROM_HANDLE_REMOVE = 4;
    public static final int FROM_INIT = 1;
    public static final int FROM_INIT_ALARM = 2;
    public static final int FROM_NET_CHANGE = 3;
    public static final int FROM_OUT_FLASH = 5;
    public static final int NETWORK_TYPE_2G = 1;
    public static final int NETWORK_TYPE_3G = 2;
    public static final int NETWORK_TYPE_4G = 3;
    public static final int NETWORK_TYPE_MOBILE = 5;
    public static final int NETWORK_TYPE_UNCONNECTED = -1;
    public static final int NETWORK_TYPE_UNKNOWN = -2;
    public static final int NETWORK_TYPE_WIFI = 4;
    public static final int OUT_AES_FAIL = 8;
    public static final int OUT_FINISH = 1;
    public static final int OUT_NO_INTERNET = 3;
    public static final int OUT_NULL_APPKEY = 5;
    public static final int OUT_NULL_HOST_PKGINFO = 6;
    public static final int OUT_NULL_PLUGIN_JSON = 10;
    public static final int OUT_NULL_RESPONSE_JSON = 9;
    public static final int OUT_OTHER_THROWABLE = 11;
    public static final int OUT_PING_FAIL = 4;
    public static final int OUT_RESPONSE_EMPTY = 7;
    public static final int OUT_TIME_TOO_CLOSE = 2;
    public static final int OUT_UNSET = 0;
    public static final int TYPE_END = 1;
    public static final int TYPE_START = 0;
    public static final int UPGRADE_DECRYPT_FAIL = 7;
    public static final int UPGRADE_DOWNLOAD_FAIL = 4;
    public static final int UPGRADE_ERROR_CRASH_TIMES = 6;
    public static final int UPGRADE_LOAD_FAIL = 5;
    public static final int UPGRADE_MD5_FAIL = 8;
    public static final int UPGRADE_NETWORK_CHECK_FAIL = 3;
    public static final int UPGRADE_RESULT_EXCEPTION = 2;
    public static final int UPGRADE_RESULT_SUCCESS = 1;
    private static long sLastCheckTime;
    public static boolean sMonitorNetworkWhenUpgradeNoNet;
    private static volatile boolean sOutGoing;
    private static boolean sPidRegister;
    private static int sRetryDownoadHostCareApksTimesCount;
    private static int sRetryPingTimesCount;
    private static boolean sSetRetrmAlarm;
    private android.content.Context context;
    private com.baidu.liantian.core.d forHostAPP;
    private com.baidu.liantian.a.a loadedPluginDB;
    private java.util.Map<java.lang.Integer, java.lang.String> mCloudKeyMap;
    java.util.List<java.lang.Integer> mDownloadPluginsList;
    private int mEndReason;
    private int mFrom;
    private boolean mOut;
    private java.util.Map<java.lang.Integer, java.lang.String> mStartKeyMap;
    private int mStartNetwork;
    java.util.List<java.lang.Integer> mUnloadPluginsList;
    private java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U.UpgradeResult> mUpgradeResultMap;
    private com.baidu.liantian.e preference;
    private java.io.File tmpDir;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class UpgradeResult {
        int networkId;
        int resultId;
        final /* synthetic */ com.baidu.liantian.ac.U this$0;

        public UpgradeResult(com.baidu.liantian.ac.U r1, int r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.networkId = r2
                r0.resultId = r3
                return
        }
    }

    static {
            return
    }

    public U() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mFrom = r0
            r1.mEndReason = r0
            r1.mOut = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCloudKeyMap = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mUnloadPluginsList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mDownloadPluginsList = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mUpgradeResultMap = r0
            r0 = -2
            r1.mStartNetwork = r0
            return
    }

    public U(android.content.Context r3, int r4, boolean r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mFrom = r0
            r2.mEndReason = r0
            r2.mOut = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCloudKeyMap = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mUnloadPluginsList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mDownloadPluginsList = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mUpgradeResultMap = r0
            r0 = -2
            r2.mStartNetwork = r0
            r2.context = r3
            com.baidu.liantian.a.a r0 = com.baidu.liantian.a.a.a(r3)
            r2.loadedPluginDB = r0
            com.baidu.liantian.e r0 = new com.baidu.liantian.e
            r0.<init>(r3)
            r2.preference = r0
            com.baidu.liantian.core.d r0 = com.baidu.liantian.core.d.a(r3)
            r2.forHostAPP = r0
            java.io.File r0 = new java.io.File
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r1 = ".tmp_liantian"
            r0.<init>(r3, r1)
            r2.tmpDir = r0
            r2.mFrom = r4
            r2.mOut = r5
            return
    }

    private void handlePluginUpgrade(com.baidu.liantian.core.ApkInfo r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            java.lang.String r3 = "before update, time="
            java.lang.String r4 = "-"
            r6 = 3
            android.content.Context r9 = r0.context     // Catch: java.lang.Throwable -> L58
            int r9 = com.baidu.liantian.b.e.m(r9)     // Catch: java.lang.Throwable -> L58
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L58
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L58
            com.baidu.liantian.e r10 = r0.preference     // Catch: java.lang.Throwable -> L58
            java.util.List r10 = r10.p()     // Catch: java.lang.Throwable -> L58
            int r11 = r1.key     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L58
            boolean r11 = r10.contains(r11)     // Catch: java.lang.Throwable -> L58
            if (r11 != 0) goto L5b
            android.content.Context r11 = r0.context     // Catch: java.lang.Throwable -> L58
            int r12 = r1.network     // Catch: java.lang.Throwable -> L58
            boolean r11 = com.baidu.liantian.b.e.a(r11, r12)     // Catch: java.lang.Throwable -> L58
            if (r11 != 0) goto L5b
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r3 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L4c3
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> L58
            int r4 = r1.key     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L58
            if (r3 != 0) goto L4c3
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r3 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L58
            int r4 = r1.key     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L58
            com.baidu.liantian.ac.U$UpgradeResult r10 = new com.baidu.liantian.ac.U$UpgradeResult     // Catch: java.lang.Throwable -> L58
            r10.<init>(r0, r9, r6)     // Catch: java.lang.Throwable -> L58
            r3.put(r4, r10)     // Catch: java.lang.Throwable -> L58
            return
        L58:
            r3 = r2
            goto L42f
        L5b:
            java.io.File r11 = r0.tmpDir     // Catch: java.lang.Throwable -> L58
            boolean r11 = r11.exists()     // Catch: java.lang.Throwable -> L58
            if (r11 != 0) goto L68
            java.io.File r11 = r0.tmpDir     // Catch: java.lang.Throwable -> L58
            r11.mkdir()     // Catch: java.lang.Throwable -> L58
        L68:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L58
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L58
            r12.append(r13)     // Catch: java.lang.Throwable -> L58
            java.lang.String r13 = ", "
            r12.append(r13)     // Catch: java.lang.Throwable -> L58
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L58
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L58
            com.baidu.liantian.a.a r11 = r0.loadedPluginDB     // Catch: java.lang.Throwable -> L58
            int r12 = r1.key     // Catch: java.lang.Throwable -> L58
            com.baidu.liantian.core.ApkInfo r11 = r11.a(r12)     // Catch: java.lang.Throwable -> L58
            java.lang.String r12 = ",length"
            java.lang.String r13 = ", isFile="
            java.lang.String r14 = ", canRead="
            java.lang.String r15 = ", exists="
            if (r11 != 0) goto L97
            r16 = 2
            goto Ld6
        L97:
            r16 = 2
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.lang.String r11 = r11.pkgPath     // Catch: java.lang.Throwable -> L58
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = "origAPK path:"
            r11.<init>(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L58
            r11.append(r6)     // Catch: java.lang.Throwable -> L58
            r11.append(r15)     // Catch: java.lang.Throwable -> L58
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> L58
            r11.append(r6)     // Catch: java.lang.Throwable -> L58
            r11.append(r14)     // Catch: java.lang.Throwable -> L58
            boolean r6 = r5.canRead()     // Catch: java.lang.Throwable -> L58
            r11.append(r6)     // Catch: java.lang.Throwable -> L58
            r11.append(r13)     // Catch: java.lang.Throwable -> L58
            boolean r6 = r5.isFile()     // Catch: java.lang.Throwable -> L58
            r11.append(r6)     // Catch: java.lang.Throwable -> L58
            r11.append(r12)     // Catch: java.lang.Throwable -> L58
            long r5 = r5.length()     // Catch: java.lang.Throwable -> L58
            r11.append(r5)     // Catch: java.lang.Throwable -> L58
        Ld6:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.io.File r6 = r0.tmpDir     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r11.<init>()     // Catch: java.lang.Throwable -> L58
            int r8 = r1.key     // Catch: java.lang.Throwable -> L58
            r11.append(r8)     // Catch: java.lang.Throwable -> L58
            r11.append(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = r1.versionName     // Catch: java.lang.Throwable -> L58
            r11.append(r8)     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = ".tmp"
            r11.append(r8)     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = r11.toString()     // Catch: java.lang.Throwable -> L58
            r5.<init>(r6, r8)     // Catch: java.lang.Throwable -> L58
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.io.File r8 = r0.tmpDir     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r11.<init>()     // Catch: java.lang.Throwable -> L58
            int r7 = r1.key     // Catch: java.lang.Throwable -> L58
            r11.append(r7)     // Catch: java.lang.Throwable -> L58
            r11.append(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r7 = r1.versionName     // Catch: java.lang.Throwable -> L58
            r11.append(r7)     // Catch: java.lang.Throwable -> L58
            java.lang.String r7 = ".zip"
            r11.append(r7)     // Catch: java.lang.Throwable -> L58
            java.lang.String r7 = r11.toString()     // Catch: java.lang.Throwable -> L58
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L58
            com.baidu.liantian.b.m r7 = new com.baidu.liantian.b.m     // Catch: java.lang.Throwable -> L58
            android.content.Context r8 = r0.context     // Catch: java.lang.Throwable -> L58
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = r1.downloadURL     // Catch: java.lang.Throwable -> L58
            boolean r7 = r7.a(r8, r5)     // Catch: java.lang.Throwable -> L58
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L58
            if (r7 == 0) goto L1ba
            boolean r8 = r6.exists()     // Catch: java.lang.Throwable -> L58
            if (r8 == 0) goto L138
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L58
            r6.delete()     // Catch: java.lang.Throwable -> L58
        L138:
            com.baidu.liantian.jni.Asc r8 = new com.baidu.liantian.jni.Asc     // Catch: java.lang.Throwable -> L58
            r8.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r11 = r1.signMD5     // Catch: java.lang.Throwable -> L58
            int r11 = r11.length()     // Catch: java.lang.Throwable -> L58
            r18 = r7
            java.lang.String r7 = r1.signMD5     // Catch: java.lang.Throwable -> L58
            int r11 = r11 / 2
            r19 = r2
            r2 = 0
            java.lang.String r7 = r7.substring(r2, r11)     // Catch: java.lang.Throwable -> L171
            java.lang.String r2 = "utf-8"
            byte[] r2 = r7.getBytes(r2)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L171
            java.lang.String r7 = "12"
            com.baidu.liantian.b.e.f(r7)     // Catch: java.lang.Throwable -> L171
            int r7 = com.baidu.liantian.b.a.a(r5, r6, r2)     // Catch: java.lang.Throwable -> L171
            if (r7 == 0) goto L1b7
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L171
            boolean r7 = r6.exists()     // Catch: java.lang.Throwable -> L171
            if (r7 == 0) goto L175
            r6.delete()     // Catch: java.lang.Throwable -> L171
            goto L175
        L171:
            r3 = r19
            goto L42f
        L175:
            java.lang.String r7 = "13"
            com.baidu.liantian.b.e.f(r7)     // Catch: java.lang.Throwable -> L171
            java.lang.String r7 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L171
            java.lang.String r11 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L171
            int r2 = r8.df(r7, r11, r2)     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L1b7
            java.lang.String r2 = "14"
            com.baidu.liantian.b.e.f(r2)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L171
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L1b5
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L171
            int r7 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L171
            boolean r2 = r2.contains(r7)     // Catch: java.lang.Throwable -> L171
            if (r2 != 0) goto L1b5
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L171
            int r7 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.ac.U$UpgradeResult r8 = new com.baidu.liantian.ac.U$UpgradeResult     // Catch: java.lang.Throwable -> L171
            r11 = 7
            r8.<init>(r0, r9, r11)     // Catch: java.lang.Throwable -> L171
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L171
        L1b5:
            r18 = 0
        L1b7:
            r7 = r18
            goto L1e4
        L1ba:
            r19 = r2
            r18 = r7
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L1b7
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L171
            int r7 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L171
            boolean r2 = r2.contains(r7)     // Catch: java.lang.Throwable -> L171
            if (r2 != 0) goto L1b7
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L171
            int r7 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.ac.U$UpgradeResult r8 = new com.baidu.liantian.ac.U$UpgradeResult     // Catch: java.lang.Throwable -> L171
            r11 = 4
            r8.<init>(r0, r9, r11)     // Catch: java.lang.Throwable -> L171
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L171
            goto L1b7
        L1e4:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L171
            java.lang.String r2 = com.baidu.liantian.b.o.a(r6)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L171
            r5.delete()     // Catch: java.lang.Throwable -> L171
            if (r7 == 0) goto L2f1
            java.lang.String r5 = r1.apkMD5     // Catch: java.lang.Throwable -> L171
            boolean r2 = r5.equals(r2)     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L2f1
            java.lang.String r2 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L171
            r5 = 1
            com.baidu.liantian.b.e.a(r2, r5)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.e r2 = r0.preference     // Catch: java.lang.Throwable -> L171
            boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L246
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L171
            android.content.Context r5 = r0.context     // Catch: java.lang.Throwable -> L171
            java.io.File r5 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L171
            java.lang.String r7 = ".b_liantian"
            r2.<init>(r5, r7)     // Catch: java.lang.Throwable -> L171
            boolean r5 = r2.exists()     // Catch: java.lang.Throwable -> L171
            if (r5 != 0) goto L221
            r2.mkdir()     // Catch: java.lang.Throwable -> L171
        L221:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L171
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L171
            r7.<init>()     // Catch: java.lang.Throwable -> L171
            int r8 = r1.key     // Catch: java.lang.Throwable -> L171
            r7.append(r8)     // Catch: java.lang.Throwable -> L171
            r7.append(r4)     // Catch: java.lang.Throwable -> L171
            java.lang.String r4 = r1.versionName     // Catch: java.lang.Throwable -> L171
            r7.append(r4)     // Catch: java.lang.Throwable -> L171
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L171
            r5.<init>(r2, r4)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.b.e.a(r6, r5)     // Catch: java.lang.Throwable -> L171
            android.content.Context r2 = r0.context     // Catch: java.lang.Throwable -> L171
            int r4 = r1.key     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.c.a(r2, r4, r6, r5)     // Catch: java.lang.Throwable -> L171
        L246:
            java.lang.String r2 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L171
            r1.pkgPath = r2     // Catch: java.lang.Throwable -> L171
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L171
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L171
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L171
            r2.append(r3)     // Catch: java.lang.Throwable -> L171
            java.lang.String r3 = ", downloadAPK path:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L171
            java.lang.String r3 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L171
            r2.append(r3)     // Catch: java.lang.Throwable -> L171
            r2.append(r15)     // Catch: java.lang.Throwable -> L171
            boolean r3 = r6.exists()     // Catch: java.lang.Throwable -> L171
            r2.append(r3)     // Catch: java.lang.Throwable -> L171
            r2.append(r14)     // Catch: java.lang.Throwable -> L171
            boolean r3 = r6.canRead()     // Catch: java.lang.Throwable -> L171
            r2.append(r3)     // Catch: java.lang.Throwable -> L171
            r2.append(r13)     // Catch: java.lang.Throwable -> L171
            boolean r3 = r6.isFile()     // Catch: java.lang.Throwable -> L171
            r2.append(r3)     // Catch: java.lang.Throwable -> L171
            r2.append(r12)     // Catch: java.lang.Throwable -> L171
            long r3 = r6.length()     // Catch: java.lang.Throwable -> L171
            r2.append(r3)     // Catch: java.lang.Throwable -> L171
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.core.d r3 = r0.forHostAPP     // Catch: java.lang.Throwable -> L171
            boolean r2 = r3.a(r1, r2)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L171
            if (r2 != 0) goto L2c1
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L4c3
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L171
            int r3 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L171
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L171
            if (r2 != 0) goto L4c3
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L171
            int r3 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.ac.U$UpgradeResult r4 = new com.baidu.liantian.ac.U$UpgradeResult     // Catch: java.lang.Throwable -> L171
            r5 = 5
            r4.<init>(r0, r9, r5)     // Catch: java.lang.Throwable -> L171
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L171
            return
        L2c1:
            com.baidu.liantian.a.a r2 = r0.loadedPluginDB     // Catch: java.lang.Throwable -> L171
            int r3 = r1.key     // Catch: java.lang.Throwable -> L171
            int r2 = r2.g(r3)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L171
            r3 = 3
            if (r2 >= r3) goto L2dd
            r3 = -1
            if (r2 == r3) goto L2dd
            com.baidu.liantian.a.a r3 = r0.loadedPluginDB     // Catch: java.lang.Throwable -> L171
            int r4 = r1.key     // Catch: java.lang.Throwable -> L171
            r17 = 1
            int r2 = r2 + 1
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L171
        L2dd:
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L4c3
            int r3 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.ac.U$UpgradeResult r4 = new com.baidu.liantian.ac.U$UpgradeResult     // Catch: java.lang.Throwable -> L171
            r5 = 1
            r4.<init>(r0, r9, r5)     // Catch: java.lang.Throwable -> L171
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L171
            return
        L2f1:
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L317
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L171
            int r3 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L171
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L171
            if (r2 != 0) goto L317
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L171
            int r3 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L171
            com.baidu.liantian.ac.U$UpgradeResult r4 = new com.baidu.liantian.ac.U$UpgradeResult     // Catch: java.lang.Throwable -> L171
            r5 = 8
            r4.<init>(r0, r9, r5)     // Catch: java.lang.Throwable -> L171
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L171
        L317:
            int r2 = r0.mFrom     // Catch: java.lang.Throwable -> L171
            r5 = 1
            if (r2 == r5) goto L326
            r3 = 2
            if (r2 == r3) goto L326
            r3 = 3
            if (r2 != r3) goto L323
            goto L326
        L323:
            r3 = r19
            goto L379
        L326:
            int r2 = r1.key     // Catch: java.lang.Throwable -> L171
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L171
            boolean r2 = r10.contains(r2)     // Catch: java.lang.Throwable -> L171
            if (r2 == 0) goto L348
            boolean r2 = com.baidu.liantian.ac.U.sSetRetrmAlarm     // Catch: java.lang.Throwable -> L171
            if (r2 != 0) goto L348
            r17 = 1
            com.baidu.liantian.ac.U.sSetRetrmAlarm = r17     // Catch: java.lang.Throwable -> L171
            android.content.Context r2 = r0.context     // Catch: java.lang.Throwable -> L171
            int r3 = com.baidu.liantian.ac.U.sRetryDownoadHostCareApksTimesCount     // Catch: java.lang.Throwable -> L171
            r4 = 0
            com.baidu.liantian.b.b.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L171
            int r2 = com.baidu.liantian.ac.U.sRetryDownoadHostCareApksTimesCount     // Catch: java.lang.Throwable -> L171
            int r2 = r2 + 1
            com.baidu.liantian.ac.U.sRetryDownoadHostCareApksTimesCount = r2     // Catch: java.lang.Throwable -> L171
        L348:
            boolean r2 = com.baidu.liantian.ac.U.sMonitorNetworkWhenUpgradeNoNet     // Catch: java.lang.Throwable -> L171
            if (r2 != 0) goto L323
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L171
            r3 = r19
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42f
            com.baidu.liantian.LiantianReceiver r4 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L42f
            if (r4 != 0) goto L363
            com.baidu.liantian.LiantianReceiver r4 = new com.baidu.liantian.LiantianReceiver     // Catch: java.lang.Throwable -> L42f
            r4.<init>()     // Catch: java.lang.Throwable -> L42f
            com.baidu.liantian.LiantianReceiver r4 = r4.a()     // Catch: java.lang.Throwable -> L42f
            com.baidu.liantian.b.e.f5912f = r4     // Catch: java.lang.Throwable -> L42f
            goto L366
        L363:
            r4.a()     // Catch: java.lang.Throwable -> L42f
        L366:
            android.content.Context r4 = r0.context     // Catch: java.lang.Throwable -> L42f
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L42f
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L42f
            com.baidu.liantian.LiantianReceiver r5 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L42f
            r4.registerReceiver(r5, r2)     // Catch: java.lang.Throwable -> L42f
            r17 = 1
            com.baidu.liantian.ac.U.sMonitorNetworkWhenUpgradeNoNet = r17     // Catch: java.lang.Throwable -> L42f
        L379:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L42f
            com.baidu.liantian.e r2 = r0.preference     // Catch: java.lang.Throwable -> L42f
            android.content.SharedPreferences r7 = r2.a     // Catch: java.lang.Throwable -> L42f
            java.lang.String r8 = "pu_ap_fd"
            r9 = 0
            long r7 = r7.getLong(r8, r9)     // Catch: java.lang.Throwable -> L42f
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L394
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L42f
            r2.g()     // Catch: java.lang.Throwable -> L42f
        L394:
            long r4 = r4 - r7
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 <= 0) goto L402
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L42f
            r2.<init>()     // Catch: java.lang.Throwable -> L42f
            android.content.Context r4 = r0.context     // Catch: java.lang.Throwable -> L42f
            boolean r4 = com.baidu.liantian.b.e.e(r4)     // Catch: java.lang.Throwable -> L42f
            java.lang.String r5 = "1"
            java.lang.String r7 = "0"
            if (r4 == 0) goto L3cc
            com.baidu.liantian.e r4 = r0.preference     // Catch: java.lang.Throwable -> L42f
            int r4 = r4.h()     // Catch: java.lang.Throwable -> L42f
            r17 = 1
            int r4 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L42f
            r2.put(r7, r4)     // Catch: java.lang.Throwable -> L42f
            com.baidu.liantian.e r4 = r0.preference     // Catch: java.lang.Throwable -> L42f
            int r4 = r4.i()     // Catch: java.lang.Throwable -> L42f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L42f
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L42f
            goto L3ea
        L3cc:
            com.baidu.liantian.e r4 = r0.preference     // Catch: java.lang.Throwable -> L42f
            int r4 = r4.h()     // Catch: java.lang.Throwable -> L42f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L42f
            r2.put(r7, r4)     // Catch: java.lang.Throwable -> L42f
            com.baidu.liantian.e r4 = r0.preference     // Catch: java.lang.Throwable -> L42f
            int r4 = r4.i()     // Catch: java.lang.Throwable -> L42f
            r17 = 1
            int r4 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L42f
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> L42f
        L3ea:
            com.baidu.liantian.e r4 = r0.preference     // Catch: java.lang.Throwable -> L42f
            r5 = 0
            r4.a(r5)     // Catch: java.lang.Throwable -> L42f
            com.baidu.liantian.e r4 = r0.preference     // Catch: java.lang.Throwable -> L42f
            r4.b(r5)     // Catch: java.lang.Throwable -> L42f
            com.baidu.liantian.e r4 = r0.preference     // Catch: java.lang.Throwable -> L42f
            r4.g()     // Catch: java.lang.Throwable -> L42f
            android.content.Context r4 = r0.context     // Catch: java.lang.Throwable -> L42f
            java.lang.String r5 = "1003116"
            com.baidu.liantian.b.e.a(r4, r5, r2)     // Catch: java.lang.Throwable -> L42f
            goto L428
        L402:
            android.content.Context r2 = r0.context     // Catch: java.lang.Throwable -> L42f
            boolean r2 = com.baidu.liantian.b.e.e(r2)     // Catch: java.lang.Throwable -> L42f
            if (r2 == 0) goto L41b
            com.baidu.liantian.e r2 = r0.preference     // Catch: java.lang.Throwable -> L418
            int r4 = r2.h()     // Catch: java.lang.Throwable -> L418
            r17 = 1
            int r4 = r4 + 1
            r2.a(r4)     // Catch: java.lang.Throwable -> L42f
            goto L428
        L418:
            r17 = 1
            goto L42f
        L41b:
            r17 = 1
            com.baidu.liantian.e r2 = r0.preference     // Catch: java.lang.Throwable -> L42f
            int r4 = r2.i()     // Catch: java.lang.Throwable -> L42f
            int r4 = r4 + 1
            r2.b(r4)     // Catch: java.lang.Throwable -> L42f
        L428:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L42f
            r6.delete()     // Catch: java.lang.Throwable -> L42f
            return
        L42f:
            com.baidu.liantian.b.e.a()
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L45e
            if (r2 == 0) goto L461
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L45e
            int r4 = r1.key     // Catch: java.lang.Throwable -> L45e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L45e
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L45e
            if (r2 != 0) goto L461
            android.content.Context r2 = r0.context     // Catch: java.lang.Throwable -> L45e
            int r2 = com.baidu.liantian.b.e.m(r2)     // Catch: java.lang.Throwable -> L45e
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r4 = r0.mUpgradeResultMap     // Catch: java.lang.Throwable -> L45e
            int r5 = r1.key     // Catch: java.lang.Throwable -> L45e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L45e
            com.baidu.liantian.ac.U$UpgradeResult r6 = new com.baidu.liantian.ac.U$UpgradeResult     // Catch: java.lang.Throwable -> L45e
            r7 = 2
            r6.<init>(r0, r2, r7)     // Catch: java.lang.Throwable -> L45e
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L45e
            goto L461
        L45e:
            com.baidu.liantian.b.e.a()
        L461:
            com.baidu.liantian.e r2 = r0.preference     // Catch: java.lang.Throwable -> L4c4
            java.util.List r2 = r2.p()     // Catch: java.lang.Throwable -> L4c4
            int r4 = r0.mFrom     // Catch: java.lang.Throwable -> L4c4
            r5 = 1
            if (r4 == r5) goto L472
            r7 = 2
            if (r4 == r7) goto L472
            r5 = 3
            if (r4 != r5) goto L4c3
        L472:
            int r1 = r1.key     // Catch: java.lang.Throwable -> L4c4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L4c4
            boolean r1 = r2.contains(r1)     // Catch: java.lang.Throwable -> L4c4
            if (r1 == 0) goto L494
            boolean r1 = com.baidu.liantian.ac.U.sSetRetrmAlarm     // Catch: java.lang.Throwable -> L4c4
            if (r1 != 0) goto L494
            r17 = 1
            com.baidu.liantian.ac.U.sSetRetrmAlarm = r17     // Catch: java.lang.Throwable -> L4c4
            android.content.Context r1 = r0.context     // Catch: java.lang.Throwable -> L4c4
            int r2 = com.baidu.liantian.ac.U.sRetryDownoadHostCareApksTimesCount     // Catch: java.lang.Throwable -> L4c4
            r4 = 0
            com.baidu.liantian.b.b.a(r1, r2, r4)     // Catch: java.lang.Throwable -> L4c4
            int r1 = com.baidu.liantian.ac.U.sRetryDownoadHostCareApksTimesCount     // Catch: java.lang.Throwable -> L4c4
            int r1 = r1 + 1
            com.baidu.liantian.ac.U.sRetryDownoadHostCareApksTimesCount = r1     // Catch: java.lang.Throwable -> L4c4
        L494:
            boolean r1 = com.baidu.liantian.ac.U.sMonitorNetworkWhenUpgradeNoNet     // Catch: java.lang.Throwable -> L4c4
            if (r1 != 0) goto L4c3
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4c4
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L4c4
            com.baidu.liantian.LiantianReceiver r2 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L4c4
            if (r2 != 0) goto L4ad
            com.baidu.liantian.LiantianReceiver r2 = new com.baidu.liantian.LiantianReceiver     // Catch: java.lang.Throwable -> L4c4
            r2.<init>()     // Catch: java.lang.Throwable -> L4c4
            com.baidu.liantian.LiantianReceiver r2 = r2.a()     // Catch: java.lang.Throwable -> L4c4
            com.baidu.liantian.b.e.f5912f = r2     // Catch: java.lang.Throwable -> L4c4
            goto L4b0
        L4ad:
            r2.a()     // Catch: java.lang.Throwable -> L4c4
        L4b0:
            android.content.Context r2 = r0.context     // Catch: java.lang.Throwable -> L4c4
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L4c4
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L4c4
            com.baidu.liantian.LiantianReceiver r3 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L4c4
            r2.registerReceiver(r3, r1)     // Catch: java.lang.Throwable -> L4c4
            r17 = 1
            com.baidu.liantian.ac.U.sMonitorNetworkWhenUpgradeNoNet = r17     // Catch: java.lang.Throwable -> L4c4
        L4c3:
            return
        L4c4:
            com.baidu.liantian.b.e.a()
            return
    }

    private void handleThreadEnd(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = ""
            com.baidu.liantian.e r1 = r9.preference     // Catch: java.lang.Throwable -> L1c
            int r2 = r1.v()     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            int r2 = r2 + r3
            r1.g(r2)     // Catch: java.lang.Throwable -> L1c
            int r1 = r9.mEndReason     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1f
            com.baidu.liantian.e r2 = r9.preference     // Catch: java.lang.Throwable -> L1c
            int r4 = r2.a(r3, r1)     // Catch: java.lang.Throwable -> L1c
            int r4 = r4 + r3
            r2.a(r3, r1, r4)     // Catch: java.lang.Throwable -> L1c
            goto L1f
        L1c:
            com.baidu.liantian.b.e.a()
        L1f:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L122
            r1.<init>()     // Catch: java.lang.Throwable -> L122
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r9.mStartKeyMap     // Catch: java.lang.Throwable -> L122
            java.lang.String r3 = "1"
            if (r2 == 0) goto L3c
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L122
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L122
            java.lang.String r2 = "2"
            java.util.Map<java.lang.Integer, java.lang.String> r4 = r9.mStartKeyMap     // Catch: java.lang.Throwable -> L122
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L122
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L122
        L3c:
            java.lang.String r2 = "3"
            int r4 = r9.mFrom     // Catch: java.lang.Throwable -> L122
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L122
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L122
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r9.mCloudKeyMap     // Catch: java.lang.Throwable -> L122
            if (r2 == 0) goto L5f
            java.lang.String r4 = "4"
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L122
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L122
            java.lang.String r2 = "5"
            java.util.Map<java.lang.Integer, java.lang.String> r4 = r9.mCloudKeyMap     // Catch: java.lang.Throwable -> L122
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L122
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L122
        L5f:
            java.util.List<java.lang.Integer> r2 = r9.mUnloadPluginsList     // Catch: java.lang.Throwable -> L122
            if (r2 == 0) goto L68
            java.lang.String r4 = "6"
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L122
        L68:
            java.util.List<java.lang.Integer> r2 = r9.mDownloadPluginsList     // Catch: java.lang.Throwable -> L122
            if (r2 == 0) goto L71
            java.lang.String r4 = "7"
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L122
        L71:
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r2 = r9.mUpgradeResultMap     // Catch: java.lang.Throwable -> L122
            if (r2 == 0) goto Lc0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L122
            r2.<init>()     // Catch: java.lang.Throwable -> L122
            java.util.Map<java.lang.Integer, com.baidu.liantian.ac.U$UpgradeResult> r4 = r9.mUpgradeResultMap     // Catch: java.lang.Throwable -> L122
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L122
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L122
        L84:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L122
            if (r5 == 0) goto Lbb
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L122
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L122
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L122
            r6.<init>()     // Catch: java.lang.Throwable -> L122
            java.lang.Object r7 = r5.getKey()     // Catch: java.lang.Throwable -> L122
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L122
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L122
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L122
            com.baidu.liantian.ac.U$UpgradeResult r5 = (com.baidu.liantian.ac.U.UpgradeResult) r5     // Catch: java.lang.Throwable -> L122
            if (r5 == 0) goto Lb3
            int r8 = r5.networkId     // Catch: java.lang.Throwable -> L122
            r6.put(r3, r8)     // Catch: java.lang.Throwable -> L122
            java.lang.String r8 = "0"
            int r5 = r5.resultId     // Catch: java.lang.Throwable -> L122
            r6.put(r8, r5)     // Catch: java.lang.Throwable -> L122
        Lb3:
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L122
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L122
            goto L84
        Lbb:
            java.lang.String r3 = "8"
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L122
        Lc0:
            com.baidu.liantian.a.a r2 = r9.loadedPluginDB     // Catch: java.lang.Throwable -> L122
            java.util.Map r2 = r2.b()     // Catch: java.lang.Throwable -> L122
            java.lang.String r3 = "9"
            java.util.Set r4 = r2.keySet()     // Catch: java.lang.Throwable -> L122
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L122
            java.lang.String r3 = "10"
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L122
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L122
            java.lang.String r2 = "11"
            int r3 = r9.mEndReason     // Catch: java.lang.Throwable -> L122
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L122
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L122
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L122
            if (r2 != 0) goto L100
            java.lang.String r2 = "12"
            java.lang.String r3 = "\n"
            java.lang.String r10 = r10.replace(r3, r0)     // Catch: java.lang.Throwable -> L122
            java.lang.String r3 = "\t"
            java.lang.String r10 = r10.replace(r3, r0)     // Catch: java.lang.Throwable -> L122
            java.lang.String r3 = "\r"
            java.lang.String r10 = r10.replace(r3, r0)     // Catch: java.lang.Throwable -> L122
            r1.put(r2, r10)     // Catch: java.lang.Throwable -> L122
        L100:
            java.lang.String r10 = "13"
            int r0 = r9.mStartNetwork     // Catch: java.lang.Throwable -> L122
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L122
            r1.put(r10, r0)     // Catch: java.lang.Throwable -> L122
            java.lang.String r10 = "14"
            android.content.Context r0 = r9.context     // Catch: java.lang.Throwable -> L122
            int r0 = com.baidu.liantian.b.e.m(r0)     // Catch: java.lang.Throwable -> L122
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L122
            r1.put(r10, r0)     // Catch: java.lang.Throwable -> L122
            android.content.Context r10 = r9.context     // Catch: java.lang.Throwable -> L122
            java.lang.String r0 = "1003129"
            com.baidu.liantian.b.e.a(r10, r0, r1)     // Catch: java.lang.Throwable -> L122
            return
        L122:
            com.baidu.liantian.b.e.a()
            return
    }

    private void handleThreadStart() {
            r12 = this;
            r0 = 11
            r1 = 6
            r2 = 1
            r3 = 0
            com.baidu.liantian.e r4 = r12.preference     // Catch: java.lang.Throwable -> La8
            android.content.SharedPreferences r4 = r4.a     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "slruct"
            r6 = 0
            long r4 = r4.getLong(r5, r6)     // Catch: java.lang.Throwable -> La8
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La8
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto La0
            long r4 = r8 - r4
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto La0
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> La8
            r4.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "1"
            com.baidu.liantian.e r6 = r12.preference     // Catch: java.lang.Throwable -> La8
            int r6 = r6.u()     // Catch: java.lang.Throwable -> La8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> La8
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> La8
            com.baidu.liantian.e r5 = r12.preference     // Catch: java.lang.Throwable -> La8
            r5.f(r3)     // Catch: java.lang.Throwable -> La8
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8
            r5.<init>()     // Catch: java.lang.Throwable -> La8
            r6 = 1
        L41:
            if (r6 > r1) goto L58
            com.baidu.liantian.e r7 = r12.preference     // Catch: java.lang.Throwable -> La8
            int r7 = r7.a(r3, r6)     // Catch: java.lang.Throwable -> La8
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> La8
            r5.put(r10, r7)     // Catch: java.lang.Throwable -> La8
            com.baidu.liantian.e r7 = r12.preference     // Catch: java.lang.Throwable -> La8
            r7.a(r3, r6, r3)     // Catch: java.lang.Throwable -> La8
            int r6 = r6 + 1
            goto L41
        L58:
            java.lang.String r6 = "2"
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = "3"
            com.baidu.liantian.e r6 = r12.preference     // Catch: java.lang.Throwable -> La8
            int r6 = r6.v()     // Catch: java.lang.Throwable -> La8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> La8
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> La8
            com.baidu.liantian.e r5 = r12.preference     // Catch: java.lang.Throwable -> La8
            r5.g(r3)     // Catch: java.lang.Throwable -> La8
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8
            r5.<init>()     // Catch: java.lang.Throwable -> La8
            r6 = 1
        L77:
            if (r6 > r0) goto L8e
            com.baidu.liantian.e r7 = r12.preference     // Catch: java.lang.Throwable -> La8
            int r7 = r7.a(r2, r6)     // Catch: java.lang.Throwable -> La8
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> La8
            r5.put(r10, r7)     // Catch: java.lang.Throwable -> La8
            com.baidu.liantian.e r7 = r12.preference     // Catch: java.lang.Throwable -> La8
            r7.a(r2, r6, r3)     // Catch: java.lang.Throwable -> La8
            int r6 = r6 + 1
            goto L77
        L8e:
            java.lang.String r6 = "4"
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> La8
            android.content.Context r5 = r12.context     // Catch: java.lang.Throwable -> La8
            java.lang.String r6 = "1003128"
            com.baidu.liantian.b.e.a(r5, r6, r4)     // Catch: java.lang.Throwable -> La8
            com.baidu.liantian.e r4 = r12.preference     // Catch: java.lang.Throwable -> La8
            r4.c(r8)     // Catch: java.lang.Throwable -> La8
            goto Lce
        La0:
            if (r10 != 0) goto Lce
            com.baidu.liantian.e r4 = r12.preference     // Catch: java.lang.Throwable -> La8
            r4.c(r8)     // Catch: java.lang.Throwable -> La8
            goto Lce
        La8:
            com.baidu.liantian.e r4 = r12.preference     // Catch: java.lang.Throwable -> Lc8
            r4.f(r3)     // Catch: java.lang.Throwable -> Lc8
            com.baidu.liantian.e r4 = r12.preference     // Catch: java.lang.Throwable -> Lc8
            r4.g(r3)     // Catch: java.lang.Throwable -> Lc8
            r4 = 1
        Lb3:
            if (r4 > r1) goto Lbd
            com.baidu.liantian.e r5 = r12.preference     // Catch: java.lang.Throwable -> Lc8
            r5.a(r3, r4, r3)     // Catch: java.lang.Throwable -> Lc8
            int r4 = r4 + 1
            goto Lb3
        Lbd:
            r1 = 1
        Lbe:
            if (r1 > r0) goto Lcb
            com.baidu.liantian.e r4 = r12.preference     // Catch: java.lang.Throwable -> Lc8
            r4.a(r2, r1, r3)     // Catch: java.lang.Throwable -> Lc8
            int r1 = r1 + 1
            goto Lbe
        Lc8:
            com.baidu.liantian.b.e.a()
        Lcb:
            com.baidu.liantian.b.e.a()
        Lce:
            com.baidu.liantian.a.a r0 = r12.loadedPluginDB     // Catch: java.lang.Throwable -> Lf7
            java.util.Map r0 = r0.b()     // Catch: java.lang.Throwable -> Lf7
            r12.mStartKeyMap = r0     // Catch: java.lang.Throwable -> Lf7
            com.baidu.liantian.e r0 = r12.preference     // Catch: java.lang.Throwable -> Lf7
            int r1 = r0.u()     // Catch: java.lang.Throwable -> Lf7
            int r1 = r1 + r2
            r0.f(r1)     // Catch: java.lang.Throwable -> Lf7
            int r0 = r12.mFrom     // Catch: java.lang.Throwable -> Lf7
            if (r0 == 0) goto Lee
            com.baidu.liantian.e r1 = r12.preference     // Catch: java.lang.Throwable -> Lf7
            int r4 = r1.a(r3, r0)     // Catch: java.lang.Throwable -> Lf7
            int r4 = r4 + r2
            r1.a(r3, r0, r4)     // Catch: java.lang.Throwable -> Lf7
        Lee:
            android.content.Context r0 = r12.context     // Catch: java.lang.Throwable -> Lf7
            int r0 = com.baidu.liantian.b.e.m(r0)     // Catch: java.lang.Throwable -> Lf7
            r12.mStartNetwork = r0     // Catch: java.lang.Throwable -> Lf7
            return
        Lf7:
            com.baidu.liantian.b.e.a()
            return
    }

    public static void handleUploadPidChange(android.content.Context r7, android.content.Intent r8) {
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L79
            com.baidu.liantian.b.b.a(r7)     // Catch: java.lang.Throwable -> L79
            com.baidu.liantian.e r8 = new com.baidu.liantian.e     // Catch: java.lang.Throwable -> L79
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L79
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L79
            r0.<init>()     // Catch: java.lang.Throwable -> L79
            android.content.SharedPreferences r1 = r8.a     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "pdcgts"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Throwable -> L79
            com.baidu.liantian.b.e.i(r7)     // Catch: java.lang.Throwable -> L79
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L79
            r3 = 0
            if (r2 != 0) goto L44
            java.lang.String r2 = "_"
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Throwable -> L79
            int r2 = r1.length     // Catch: java.lang.Throwable -> L79
            r4 = 0
        L2c:
            if (r4 >= r2) goto L44
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L79
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L79
            if (r6 != 0) goto L41
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L3e
            r0.put(r5)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L79
        L41:
            int r4 = r4 + 1
            goto L2c
        L44:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L79
            r1.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "0"
            int r4 = r8.r()     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L79
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "1"
            int r4 = r8.t()     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L79
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "2"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L79
            r8.d(r3)     // Catch: java.lang.Throwable -> L79
            r8.e(r3)     // Catch: java.lang.Throwable -> L79
            r2 = 0
            r8.b(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r8 = "1003122"
            com.baidu.liantian.b.e.a(r7, r8, r1)     // Catch: java.lang.Throwable -> L79
            return
        L79:
            com.baidu.liantian.b.e.a()
            return
    }

    public void handleWork(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            r3.context = r4
            com.baidu.liantian.a.a r0 = com.baidu.liantian.a.a.a(r4)
            r3.loadedPluginDB = r0
            com.baidu.liantian.e r0 = new com.baidu.liantian.e
            r0.<init>(r4)
            r3.preference = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getFilesDir()
            java.lang.String r2 = ".tmp_liantian"
            r0.<init>(r1, r2)
            r3.tmpDir = r0
            com.baidu.liantian.core.d r4 = com.baidu.liantian.core.d.a(r4)
            r3.forHostAPP = r4
            java.lang.String r4 = "from"
            r0 = 0
            int r4 = r5.getIntExtra(r4, r0)
            r3.mFrom = r4
            com.baidu.liantian.b.a()
            r3.start()
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public synchronized void run() {
            r26 = this;
            r1 = r26
            monitor-enter(r26)
            r0 = 1
            boolean r2 = r1.mOut     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L14
            boolean r2 = com.baidu.liantian.ac.U.sOutGoing     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto Le
            monitor-exit(r26)
            return
        Le:
            com.baidu.liantian.ac.U.sOutGoing = r0     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L5a
        L14:
            r2 = 0
            java.lang.Class<com.baidu.liantian.ac.U> r3 = com.baidu.liantian.ac.U.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L94f
            super.run()     // Catch: java.lang.Throwable -> L45
            r1.handleThreadStart()     // Catch: java.lang.Throwable -> L45
            int r4 = r1.mFrom     // Catch: java.lang.Throwable -> L45
            r5 = 3
            r6 = 2
            r7 = 0
            if (r4 == r0) goto L5d
            if (r4 == r6) goto L5d
            if (r4 == r5) goto L5d
            boolean r4 = r1.mOut     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L5d
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            long r10 = com.baidu.liantian.ac.U.sLastCheckTime     // Catch: java.lang.Throwable -> L45
            long r8 = r8 - r10
            r10 = 600000(0x927c0, double:2.964394E-318)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L5d
            int r0 = r1.mEndReason     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L48
            r1.mEndReason = r6     // Catch: java.lang.Throwable -> L45
            r1.handleThreadEnd(r7)     // Catch: java.lang.Throwable -> L45
            goto L48
        L45:
            r0 = move-exception
            goto L976
        L48:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L45
            boolean r0 = r1.mOut     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L53
            boolean r0 = com.baidu.liantian.ac.U.sOutGoing     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L53
            com.baidu.liantian.ac.U.sOutGoing = r2     // Catch: java.lang.Throwable -> L55
        L53:
            monitor-exit(r26)
            return
        L55:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r26)
            return
        L5a:
            r0 = move-exception
            goto L9e0
        L5d:
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            boolean r4 = com.baidu.liantian.b.e.f(r4)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L6b
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.U.sLastCheckTime = r8     // Catch: java.lang.Throwable -> L45
        L6b:
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.b.a(r4, r2)     // Catch: java.lang.Throwable -> L45
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            r8 = 60000(0xea60, float:8.4078E-41)
            com.baidu.liantian.a.a r9 = com.baidu.liantian.a.a.a(r4)     // Catch: java.lang.Throwable -> Lac
            com.baidu.liantian.core.d r4 = com.baidu.liantian.core.d.a(r4)     // Catch: java.lang.Throwable -> Lac
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> Lac
            java.util.List r9 = r9.a()     // Catch: java.lang.Throwable -> Lac
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lac
        L88:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> Lac
            if (r10 == 0) goto Laf
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lac
            com.baidu.liantian.core.ApkInfo r10 = (com.baidu.liantian.core.ApkInfo) r10     // Catch: java.lang.Throwable -> Lac
            int r11 = r10.duration     // Catch: java.lang.Throwable -> Lac
            if (r11 == 0) goto L88
            long r12 = r10.startTime     // Catch: java.lang.Throwable -> Lac
            int r11 = r11 * r8
            long r14 = (long) r11     // Catch: java.lang.Throwable -> Lac
            long r12 = r12 + r14
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lac
            int r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r11 >= 0) goto L88
            java.lang.String r10 = r10.packageName     // Catch: java.lang.Throwable -> Lac
            r4.a(r10)     // Catch: java.lang.Throwable -> Lac
            goto L88
        Lac:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
        Laf:
            int r4 = r1.mFrom     // Catch: java.lang.Throwable -> L45
            if (r4 == r0) goto Lb5
            if (r4 != r5) goto Lc0
        Lb5:
            com.baidu.liantian.ac.U.sRetryPingTimesCount = r2     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.U.sRetryDownoadHostCareApksTimesCount = r2     // Catch: java.lang.Throwable -> L45
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.b.a(r4, r2, r0)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.U.sSetRetrmAlarm = r2     // Catch: java.lang.Throwable -> L45
        Lc0:
            int r4 = r1.mFrom     // Catch: java.lang.Throwable -> L45
            if (r4 != r6) goto Lc6
            com.baidu.liantian.ac.U.sSetRetrmAlarm = r2     // Catch: java.lang.Throwable -> L45
        Lc6:
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            boolean r4 = com.baidu.liantian.b.e.f(r4)     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L10e
            int r4 = r1.mFrom     // Catch: java.lang.Throwable -> L45
            if (r4 == r0) goto Ld6
            if (r4 == r6) goto Ld6
            if (r4 != r5) goto L100
        Ld6:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.U.sMonitorNetworkWhenUpgradeNoNet = r0     // Catch: java.lang.Throwable -> L45
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.LiantianReceiver r4 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto Lf1
            com.baidu.liantian.LiantianReceiver r4 = new com.baidu.liantian.LiantianReceiver     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.LiantianReceiver r4 = r4.a()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.f5912f = r4     // Catch: java.lang.Throwable -> L45
        Lf1:
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L45
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.LiantianReceiver r6 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L45
            r4.registerReceiver(r6, r0)     // Catch: java.lang.Throwable -> L45
        L100:
            int r0 = r1.mEndReason     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L106
            r1.mEndReason = r5     // Catch: java.lang.Throwable -> L45
        L106:
            android.accounts.NetworkErrorException r0 = new android.accounts.NetworkErrorException     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "no internet"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L10e:
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.U.sLastCheckTime = r9     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.LiantianReceiver r4 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L133
            boolean r4 = com.baidu.liantian.ac.U.sMonitorNetworkWhenUpgradeNoNet     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L120
            boolean r4 = com.baidu.liantian.b.e.a     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L133
        L120:
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L130
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L130
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L130
            com.baidu.liantian.LiantianReceiver r9 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L130
            r4.unregisterReceiver(r9)     // Catch: java.lang.Throwable -> L130
            goto L133
        L130:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
        L133:
            com.baidu.liantian.ac.U.sMonitorNetworkWhenUpgradeNoNet = r2     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.a = r2     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = com.baidu.liantian.b.e.b()     // Catch: java.lang.Throwable -> L45
            r4.append(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = "opmon"
            r4.append(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.m r9 = new com.baidu.liantian.b.m     // Catch: java.lang.Throwable -> L158
            android.content.Context r10 = r1.context     // Catch: java.lang.Throwable -> L158
            r9.<init>(r10, r2)     // Catch: java.lang.Throwable -> L158
            java.lang.String r9 = r9.a(r4)     // Catch: java.lang.Throwable -> L158
            goto L15c
        L158:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
            r9 = r7
        L15c:
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L1d7
            com.baidu.liantian.b.m r10 = new com.baidu.liantian.b.m     // Catch: java.lang.Throwable -> L16e
            android.content.Context r11 = r1.context     // Catch: java.lang.Throwable -> L16e
            r10.<init>(r11, r2)     // Catch: java.lang.Throwable -> L16e
            java.lang.String r9 = r10.a(r4)     // Catch: java.lang.Throwable -> L16e
            goto L171
        L16e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
        L171:
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L1d7
            int r4 = r1.mFrom     // Catch: java.lang.Throwable -> L45
            if (r4 == r0) goto L183
            if (r4 == r6) goto L183
            if (r4 != r5) goto L19d
            boolean r4 = com.baidu.liantian.ac.U.sSetRetrmAlarm     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L19d
        L183:
            com.baidu.liantian.e r4 = r1.preference     // Catch: java.lang.Throwable -> L45
            java.util.List r4 = r4.p()     // Catch: java.lang.Throwable -> L45
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L45
            if (r4 <= 0) goto L19d
            com.baidu.liantian.ac.U.sSetRetrmAlarm = r0     // Catch: java.lang.Throwable -> L45
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            int r5 = com.baidu.liantian.ac.U.sRetryPingTimesCount     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.b.a(r4, r5, r2)     // Catch: java.lang.Throwable -> L45
            int r4 = com.baidu.liantian.ac.U.sRetryPingTimesCount     // Catch: java.lang.Throwable -> L45
            int r4 = r4 + r0
            com.baidu.liantian.ac.U.sRetryPingTimesCount = r4     // Catch: java.lang.Throwable -> L45
        L19d:
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.LiantianReceiver r5 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L45
            if (r5 != 0) goto L1b4
            com.baidu.liantian.LiantianReceiver r5 = new com.baidu.liantian.LiantianReceiver     // Catch: java.lang.Throwable -> L45
            r5.<init>()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.LiantianReceiver r5 = r5.a()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.f5912f = r5     // Catch: java.lang.Throwable -> L45
            goto L1b7
        L1b4:
            r5.a()     // Catch: java.lang.Throwable -> L45
        L1b7:
            android.content.Context r5 = r1.context     // Catch: java.lang.Throwable -> L45
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L45
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.LiantianReceiver r6 = com.baidu.liantian.b.e.f5912f     // Catch: java.lang.Throwable -> L45
            r5.registerReceiver(r6, r4)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.U.sMonitorNetworkWhenUpgradeNoNet = r0     // Catch: java.lang.Throwable -> L45
            int r0 = r1.mEndReason     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L1cf
            r0 = 4
            r1.mEndReason = r0     // Catch: java.lang.Throwable -> L45
        L1cf:
            android.accounts.NetworkErrorException r0 = new android.accounts.NetworkErrorException     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "ping faild"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L1d7:
            com.baidu.liantian.ac.U.sRetryPingTimesCount = r2     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r4 = r1.preference     // Catch: java.lang.Throwable -> L45
            android.content.SharedPreferences r4 = r4.a     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = "appplg_te"
            r10 = 360(0x168, float:5.04E-43)
            int r4 = r4.getInt(r9, r10)     // Catch: java.lang.Throwable -> L45
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r9 = r1.preference     // Catch: java.lang.Throwable -> L45
            android.content.SharedPreferences r9 = r9.a     // Catch: java.lang.Throwable -> L45
            java.lang.String r13 = "plla_tm"
            r14 = 0
            long r16 = r9.getLong(r13, r14)     // Catch: java.lang.Throwable -> L45
            long r11 = r11 - r16
            int r4 = r4 * r8
            long r8 = (long) r4     // Catch: java.lang.Throwable -> L45
            int r4 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r4 <= 0) goto L2b7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = com.baidu.liantian.b.e.b()     // Catch: java.lang.Throwable -> L45
            r4.append(r8)     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = "p/1/stt"
            r4.append(r8)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b4
            r8.<init>()     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r9 = "a"
            java.lang.String r11 = "b"
            r8.put(r9, r11)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2b4
            android.content.Context r9 = r1.context     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = com.baidu.liantian.b.h.a(r9, r4, r8, r0)     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2b4
            if (r4 == 0) goto L2b7
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b4
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = "app"
            int r4 = r8.optInt(r4)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.e r9 = r1.preference     // Catch: java.lang.Throwable -> L2b4
            android.content.SharedPreferences$Editor r11 = r9.f5992c     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r12 = "appinv_t"
            r11.putInt(r12, r4)     // Catch: java.lang.Throwable -> L2b4
            android.content.SharedPreferences$Editor r4 = r9.f5992c     // Catch: java.lang.Throwable -> L2b4
            r4.commit()     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = "js"
            int r4 = r8.optInt(r4)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.e r9 = r1.preference     // Catch: java.lang.Throwable -> L2b4
            android.content.SharedPreferences$Editor r11 = r9.f5992c     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r12 = "appinv_js"
            r11.putInt(r12, r4)     // Catch: java.lang.Throwable -> L2b4
            android.content.SharedPreferences$Editor r4 = r9.f5992c     // Catch: java.lang.Throwable -> L2b4
            r4.commit()     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = "a"
            int r4 = r8.optInt(r4, r0)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.e r9 = r1.preference     // Catch: java.lang.Throwable -> L2b4
            android.content.SharedPreferences$Editor r11 = r9.f5992c     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r12 = "appinv_ky"
            r11.putInt(r12, r4)     // Catch: java.lang.Throwable -> L2b4
            android.content.SharedPreferences$Editor r4 = r9.f5992c     // Catch: java.lang.Throwable -> L2b4
            r4.commit()     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r4 = "pi"
            int r4 = r8.optInt(r4, r10)     // Catch: java.lang.Throwable -> L2b4
            java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.e r8 = r1.preference     // Catch: java.lang.Throwable -> L2b4
            android.content.SharedPreferences$Editor r9 = r8.f5992c     // Catch: java.lang.Throwable -> L2b4
            java.lang.String r10 = "appplg_te"
            r9.putInt(r10, r4)     // Catch: java.lang.Throwable -> L2b4
            android.content.SharedPreferences$Editor r4 = r8.f5992c     // Catch: java.lang.Throwable -> L2b4
            r4.commit()     // Catch: java.lang.Throwable -> L2b4
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r4 = r1.preference     // Catch: java.lang.Throwable -> L45
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            android.content.SharedPreferences$Editor r10 = r4.f5992c     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "plla_tm"
            r10.putLong(r11, r8)     // Catch: java.lang.Throwable -> L45
            android.content.SharedPreferences$Editor r4 = r4.f5992c     // Catch: java.lang.Throwable -> L45
            r4.commit()     // Catch: java.lang.Throwable -> L45
            goto L2b7
        L2b4:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
        L2b7:
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            java.lang.String[] r4 = com.baidu.liantian.b.e.h(r4)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r8 = r1.preference     // Catch: java.lang.Throwable -> L45
            android.content.SharedPreferences r8 = r8.a     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = "appinv_ky"
            int r8 = r8.getInt(r9, r0)     // Catch: java.lang.Throwable -> L45
            if (r8 != r0) goto L2fe
            if (r4 == 0) goto L2de
            int r8 = r4.length     // Catch: java.lang.Throwable -> L45
            if (r8 != r6) goto L2de
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L45
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L45
            if (r6 != 0) goto L2de
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L45
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L2fe
        L2de:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            boolean r4 = com.baidu.liantian.b.h.a(r4)     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L2fe
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L45
            boolean r0 = r1.mOut     // Catch: java.lang.Throwable -> L2f9
            if (r0 == 0) goto L2f7
            boolean r0 = com.baidu.liantian.ac.U.sOutGoing     // Catch: java.lang.Throwable -> L2f9
            if (r0 == 0) goto L2f7
            com.baidu.liantian.ac.U.sOutGoing = r2     // Catch: java.lang.Throwable -> L2f9
        L2f7:
            monitor-exit(r26)
            return
        L2f9:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r26)
            return
        L2fe:
            com.baidu.liantian.core.d r4 = r1.forHostAPP     // Catch: java.lang.Throwable -> L45
            android.content.Context r6 = r1.context     // Catch: java.lang.Throwable -> L45
            r4.b(r6)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r4 = r1.preference     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r4.e()     // Catch: java.lang.Throwable -> L45
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L31b
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.p(r4)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r4 = r1.preference     // Catch: java.lang.Throwable -> L45
            r4.e()     // Catch: java.lang.Throwable -> L45
        L31b:
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r4 = r1.preference     // Catch: java.lang.Throwable -> L45
            android.content.SharedPreferences r4 = r4.a     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "appinv_t"
            int r4 = r4.getInt(r6, r2)     // Catch: java.lang.Throwable -> L45
            if (r4 != r0) goto L32f
            android.content.Context r4 = r1.context     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.q(r4)     // Catch: java.lang.Throwable -> L45
        L32f:
            com.baidu.liantian.a.a r4 = r1.loadedPluginDB     // Catch: java.lang.Throwable -> L45
            r4.d()     // Catch: java.lang.Throwable -> L45
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            r4.<init>()     // Catch: java.lang.Throwable -> L45
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            r6.<init>()     // Catch: java.lang.Throwable -> L45
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            r8.<init>()     // Catch: java.lang.Throwable -> L45
            android.content.Context r9 = r1.context     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "pk"
            r8.put(r10, r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "pk"
            r6.put(r10, r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "dm"
            java.lang.String r11 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L45
            r6.put(r10, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "dm"
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "cuid"
            android.content.Context r11 = r1.context     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = com.baidu.liantian.b.g.a(r11)     // Catch: java.lang.Throwable -> L45
            r6.put(r10, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "al"
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L45
            r6.put(r10, r12)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "al"
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L45
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "3.1.6.7"
            java.lang.String r11 = "ev"
            r6.put(r11, r10)     // Catch: java.lang.Throwable -> L45
            android.content.Context r10 = r1.context     // Catch: java.lang.Throwable -> L45
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L45
            r11 = 64
            android.content.pm.PackageInfo r9 = r10.getPackageInfo(r9, r11)     // Catch: java.lang.Throwable -> L392
            goto L396
        L392:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
            r9 = r7
        L396:
            if (r9 == 0) goto L967
            java.lang.String r10 = "av"
            java.lang.String r11 = r9.versionName     // Catch: java.lang.Throwable -> L45
            r6.put(r10, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "av"
            java.lang.String r11 = r9.versionName     // Catch: java.lang.Throwable -> L45
            r8.put(r10, r11)     // Catch: java.lang.Throwable -> L45
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = r10.sourceDir     // Catch: java.lang.Throwable -> L45
            java.security.PublicKey r9 = com.baidu.liantian.b.e.a(r9, r10)     // Catch: java.lang.Throwable -> L45
            if (r9 == 0) goto L3ec
            byte[] r9 = r9.getEncoded()     // Catch: java.lang.Throwable -> L45
            if (r9 == 0) goto L3de
            android.content.Context r10 = r1.context     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.a(r10, r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "\n"
            java.lang.String r11 = ""
            java.lang.String r9 = r9.replace(r10, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "\r"
            java.lang.String r11 = ""
            java.lang.String r9 = r9.replace(r10, r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = com.baidu.liantian.b.o.a(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "sm"
            r6.put(r10, r9)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = "sm"
            r8.put(r10, r9)     // Catch: java.lang.Throwable -> L45
            goto L3ec
        L3de:
            java.lang.String r9 = "sm"
            java.lang.String r10 = ""
            r6.put(r9, r10)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = "sm"
            java.lang.String r10 = ""
            r8.put(r9, r10)     // Catch: java.lang.Throwable -> L45
        L3ec:
            java.lang.String r9 = "or"
            com.baidu.liantian.e r10 = r1.preference     // Catch: java.lang.Throwable -> L45
            android.content.SharedPreferences r10 = r10.a     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "opi"
            int r10 = r10.getInt(r11, r2)     // Catch: java.lang.Throwable -> L45
            r6.put(r9, r10)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = "pt"
            com.baidu.liantian.e r10 = r1.preference     // Catch: java.lang.Throwable -> L45
            long r10 = r10.f()     // Catch: java.lang.Throwable -> L45
            r6.put(r9, r10)     // Catch: java.lang.Throwable -> L45
            java.lang.String r9 = "device"
            r4.put(r9, r6)     // Catch: java.lang.Throwable -> L45
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L45
            r6.<init>()     // Catch: java.lang.Throwable -> L45
            r6.put(r8)     // Catch: java.lang.Throwable -> L45
            java.util.HashMap r8 = new java.util.HashMap     // Catch: java.lang.Throwable -> L45
            r8.<init>()     // Catch: java.lang.Throwable -> L45
            java.util.Map<java.lang.String, java.lang.String> r9 = com.baidu.liantian.b.e.f5913g     // Catch: java.lang.Throwable -> L45
            r8.putAll(r9)     // Catch: java.lang.Throwable -> L45
            java.util.Set r9 = r8.keySet()     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L45
        L425:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L447
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L45
            java.lang.Object r10 = r8.get(r10)     // Catch: java.lang.Throwable -> L45
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L45
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L43d
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L43d
            goto L441
        L43d:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
            r11 = r7
        L441:
            if (r11 == 0) goto L425
            r6.put(r11)     // Catch: java.lang.Throwable -> L45
            goto L425
        L447:
            java.lang.String r8 = "host_apps"
            r4.put(r8, r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r6.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = com.baidu.liantian.b.e.b()     // Catch: java.lang.Throwable -> L45
            r6.append(r8)     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = "p/1/pls"
            r6.append(r8)     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L45
            boolean r8 = com.baidu.liantian.ac.U.sPidRegister     // Catch: java.lang.Throwable -> L45
            if (r8 != 0) goto L481
            com.baidu.liantian.e r8 = r1.preference     // Catch: java.lang.Throwable -> L45
            int r9 = r8.t()     // Catch: java.lang.Throwable -> L45
            int r9 = r9 + r0
            r8.e(r9)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r8 = r1.preference     // Catch: java.lang.Throwable -> L45
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            r8.b(r9)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.U.sPidRegister = r0     // Catch: java.lang.Throwable -> L45
        L481:
            com.baidu.liantian.e r8 = r1.preference     // Catch: java.lang.Throwable -> L45
            int r9 = r8.r()     // Catch: java.lang.Throwable -> L45
            int r9 = r9 + r0
            r8.d(r9)     // Catch: java.lang.Throwable -> L45
            android.content.Context r8 = r1.context     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = com.baidu.liantian.b.h.a(r8, r6, r4, r0)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L49a
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L49a
            goto L49e
        L49a:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
            r6 = r7
        L49e:
            if (r6 != 0) goto L4b0
            int r0 = r1.mEndReason     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L4a8
            r0 = 9
            r1.mEndReason = r0     // Catch: java.lang.Throwable -> L45
        L4a8:
            android.accounts.NetworkErrorException r0 = new android.accounts.NetworkErrorException     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "response json is null"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L4b0:
            com.baidu.liantian.a.a r4 = r1.loadedPluginDB     // Catch: java.lang.Throwable -> L45
            java.util.List r4 = r4.a()     // Catch: java.lang.Throwable -> L45
            java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45
            r8.<init>()     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45
            r9.<init>()     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45
            r10.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = "product"
            org.json.JSONArray r11 = r6.optJSONArray(r11)     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = "pt"
            long r12 = r6.optLong(r12)     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L4f1
            int r16 = r11.length()     // Catch: java.lang.Throwable -> L45
            if (r16 <= 0) goto L4f1
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L4f1
            com.baidu.liantian.e r14 = r1.preference     // Catch: java.lang.Throwable -> L45
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L45
            r14.a(r11, r12)     // Catch: java.lang.Throwable -> L45
            android.content.Context r11 = r1.context     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.j(r11)     // Catch: java.lang.Throwable -> L45
        L4f1:
            java.lang.String r11 = "plugin"
            org.json.JSONObject r6 = r6.optJSONObject(r11)     // Catch: java.lang.Throwable -> L45
            if (r6 != 0) goto L509
            int r0 = r1.mEndReason     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L501
            r0 = 10
            r1.mEndReason = r0     // Catch: java.lang.Throwable -> L45
        L501:
            android.accounts.NetworkErrorException r0 = new android.accounts.NetworkErrorException     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "plugin json is null"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L509:
            java.util.Iterator r11 = r6.keys()     // Catch: java.lang.Throwable -> L45
        L50d:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r12 == 0) goto L7cb
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L45
            r15 = r12
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L45
            org.json.JSONObject r12 = r6.optJSONObject(r15)     // Catch: java.lang.Throwable -> L45
            java.lang.String r13 = "l"
            int r14 = r12.optInt(r13)     // Catch: java.lang.Throwable -> L45
            java.lang.String r13 = "v"
            java.lang.String r13 = r12.optString(r13)     // Catch: java.lang.Throwable -> L45
            java.util.Map<java.lang.Integer, java.lang.String> r7 = r1.mCloudKeyMap     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L535
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L45
            r7.put(r5, r13)     // Catch: java.lang.Throwable -> L45
        L535:
            java.lang.String r5 = "u"
            java.lang.String r17 = r12.optString(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "m"
            java.lang.String r5 = r12.optString(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = "sm"
            java.lang.String r7 = r12.optString(r7)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L54d
            java.lang.String r5 = r5.toLowerCase()     // Catch: java.lang.Throwable -> L45
        L54d:
            r18 = r5
            if (r7 == 0) goto L555
            java.lang.String r7 = r7.toLowerCase()     // Catch: java.lang.Throwable -> L45
        L555:
            java.lang.String r5 = "o"
            int r5 = r12.optInt(r5)     // Catch: java.lang.Throwable -> L45
            if (r5 != r0) goto L55f
            r5 = 1
            goto L560
        L55f:
            r5 = 0
        L560:
            java.lang.String r2 = "d"
            int r2 = r12.optInt(r2)     // Catch: java.lang.Throwable -> L45
            if (r2 != r0) goto L56b
            r16 = 1
            goto L56d
        L56b:
            r16 = 0
        L56d:
            java.lang.String r2 = "r"
            int r2 = r12.optInt(r2)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L597
            r20 = r6
            com.baidu.liantian.e r6 = r1.preference     // Catch: java.lang.Throwable -> L45
            r21 = r11
            android.content.SharedPreferences r11 = r6.a     // Catch: java.lang.Throwable -> L45
            r22 = r13
            java.lang.String r13 = "opi"
            r23 = r14
            r14 = 0
            int r11 = r11.getInt(r13, r14)     // Catch: java.lang.Throwable -> L45
            if (r2 <= r11) goto L59f
            android.content.SharedPreferences$Editor r11 = r6.f5992c     // Catch: java.lang.Throwable -> L45
            java.lang.String r13 = "opi"
            r11.putInt(r13, r2)     // Catch: java.lang.Throwable -> L45
            android.content.SharedPreferences$Editor r2 = r6.f5992c     // Catch: java.lang.Throwable -> L45
            r2.commit()     // Catch: java.lang.Throwable -> L45
            goto L59f
        L597:
            r20 = r6
            r21 = r11
            r22 = r13
            r23 = r14
        L59f:
            if (r5 == 0) goto L5af
            if (r16 == 0) goto L5af
            r10.add(r15)     // Catch: java.lang.Throwable -> L45
            r6 = r20
            r11 = r21
        L5aa:
            r2 = 0
            r5 = 3
            r7 = 0
            goto L50d
        L5af:
            android.content.pm.PackageInfo r2 = new android.content.pm.PackageInfo     // Catch: java.lang.Throwable -> L5f5
            r2.<init>()     // Catch: java.lang.Throwable -> L5f5
            java.lang.String r6 = "p"
            java.lang.String r6 = r12.optString(r6)     // Catch: java.lang.Throwable -> L5f5
            r2.packageName = r6     // Catch: java.lang.Throwable -> L5f5
            java.lang.String r6 = "v"
            java.lang.String r6 = r12.optString(r6)     // Catch: java.lang.Throwable -> L5f5
            r2.versionName = r6     // Catch: java.lang.Throwable -> L5f5
            android.content.pm.ApplicationInfo r6 = new android.content.pm.ApplicationInfo     // Catch: java.lang.Throwable -> L5f5
            r6.<init>()     // Catch: java.lang.Throwable -> L5f5
            java.lang.String r11 = "n"
            java.lang.String r11 = r12.optString(r11)     // Catch: java.lang.Throwable -> L5f5
            r6.className = r11     // Catch: java.lang.Throwable -> L5f5
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L5f5
            if (r11 != 0) goto L5f9
            java.lang.String r11 = r6.className     // Catch: java.lang.Throwable -> L5f5
            java.lang.String r13 = "."
            boolean r11 = r11.startsWith(r13)     // Catch: java.lang.Throwable -> L5f5
            if (r11 == 0) goto L5f9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f5
            r11.<init>()     // Catch: java.lang.Throwable -> L5f5
            r11.append(r15)     // Catch: java.lang.Throwable -> L5f5
            java.lang.String r13 = r6.className     // Catch: java.lang.Throwable -> L5f5
            r11.append(r13)     // Catch: java.lang.Throwable -> L5f5
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L5f5
            r6.className = r11     // Catch: java.lang.Throwable -> L5f5
            goto L5f9
        L5f5:
            r25 = r10
            goto L6b0
        L5f9:
            java.lang.String r11 = "t"
            int r11 = r12.optInt(r11)     // Catch: java.lang.Throwable -> L5f5
            r6.theme = r11     // Catch: java.lang.Throwable -> L5f5
            r2.applicationInfo = r6     // Catch: java.lang.Throwable -> L5f5
            java.lang.String r6 = "a"
            org.json.JSONArray r6 = r12.optJSONArray(r6)     // Catch: java.lang.Throwable -> L5f5
            if (r6 == 0) goto L6ad
            int r11 = r6.length()     // Catch: java.lang.Throwable -> L5f5
            if (r11 <= 0) goto L6ad
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f5
            r11.<init>()     // Catch: java.lang.Throwable -> L5f5
            r13 = 0
        L617:
            int r14 = r6.length()     // Catch: java.lang.Throwable -> L5f5
            if (r13 >= r14) goto L696
            org.json.JSONObject r14 = r6.getJSONObject(r13)     // Catch: java.lang.Throwable -> L689
            if (r14 == 0) goto L682
            r16 = r6
            android.content.pm.ActivityInfo r6 = new android.content.pm.ActivityInfo     // Catch: java.lang.Throwable -> L67d
            r6.<init>()     // Catch: java.lang.Throwable -> L67d
            r24 = r13
            java.lang.String r13 = "n"
            java.lang.String r13 = r14.optString(r13)     // Catch: java.lang.Throwable -> L65a
            r6.name = r13     // Catch: java.lang.Throwable -> L65a
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L65a
            if (r13 != 0) goto L65d
            java.lang.String r13 = r6.name     // Catch: java.lang.Throwable -> L65a
            r25 = r10
            java.lang.String r10 = "."
            boolean r10 = r13.startsWith(r10)     // Catch: java.lang.Throwable -> L68c
            if (r10 == 0) goto L65f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68c
            r10.<init>()     // Catch: java.lang.Throwable -> L68c
            r10.append(r15)     // Catch: java.lang.Throwable -> L68c
            java.lang.String r13 = r6.name     // Catch: java.lang.Throwable -> L68c
            r10.append(r13)     // Catch: java.lang.Throwable -> L68c
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L68c
            r6.name = r10     // Catch: java.lang.Throwable -> L68c
            goto L65f
        L65a:
            r25 = r10
            goto L68c
        L65d:
            r25 = r10
        L65f:
            r6.packageName = r15     // Catch: java.lang.Throwable -> L68c
            java.lang.String r10 = "t"
            int r10 = r14.optInt(r10)     // Catch: java.lang.Throwable -> L68c
            r6.theme = r10     // Catch: java.lang.Throwable -> L68c
            java.lang.String r10 = "l"
            int r10 = r14.optInt(r10)     // Catch: java.lang.Throwable -> L68c
            r6.labelRes = r10     // Catch: java.lang.Throwable -> L68c
            java.lang.String r10 = r6.name     // Catch: java.lang.Throwable -> L68c
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L68c
            if (r10 != 0) goto L68f
            r11.add(r6)     // Catch: java.lang.Throwable -> L68c
            goto L68f
        L67d:
            r25 = r10
            r24 = r13
            goto L68c
        L682:
            r16 = r6
            r25 = r10
            r24 = r13
            goto L68f
        L689:
            r16 = r6
            goto L67d
        L68c:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L6b0
        L68f:
            int r13 = r24 + 1
            r6 = r16
            r10 = r25
            goto L617
        L696:
            r25 = r10
            int r6 = r11.size()     // Catch: java.lang.Throwable -> L6b0
            if (r6 <= 0) goto L6b4
            int r6 = r11.size()     // Catch: java.lang.Throwable -> L6b0
            android.content.pm.ActivityInfo[] r6 = new android.content.pm.ActivityInfo[r6]     // Catch: java.lang.Throwable -> L6b0
            java.lang.Object[] r6 = r11.toArray(r6)     // Catch: java.lang.Throwable -> L6b0
            android.content.pm.ActivityInfo[] r6 = (android.content.pm.ActivityInfo[]) r6     // Catch: java.lang.Throwable -> L6b0
            r2.activities = r6     // Catch: java.lang.Throwable -> L6b0
            goto L6b4
        L6ad:
            r25 = r10
            goto L6b4
        L6b0:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L45
            r2 = 0
        L6b4:
            com.baidu.liantian.core.ApkInfo r13 = new com.baidu.liantian.core.ApkInfo     // Catch: java.lang.Throwable -> L45
            r16 = r22
            r14 = r23
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L45
            r23 = r14
            r13.isOnce = r5     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = "pr"
            int r5 = r12.getInt(r5)     // Catch: java.lang.Throwable -> L6ca
            r13.priority = r5     // Catch: java.lang.Throwable -> L6ca
            goto L6cd
        L6ca:
            r5 = -1
            r13.priority = r5     // Catch: java.lang.Throwable -> L45
        L6cd:
            java.lang.String r5 = "mem"
            int r5 = r12.optInt(r5)     // Catch: java.lang.Throwable -> L45
            if (r5 != r0) goto L6d7
            r5 = 1
            goto L6d8
        L6d7:
            r5 = 0
        L6d8:
            r13.isMem = r5     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L6de
            r13.cloudPkgInfo = r2     // Catch: java.lang.Throwable -> L45
        L6de:
            java.lang.String r2 = "e"
            org.json.JSONObject r2 = r12.optJSONObject(r2)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L6f6
            java.lang.String r5 = "d"
            int r5 = r2.optInt(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "n"
            int r2 = r2.optInt(r6)     // Catch: java.lang.Throwable -> L45
            r13.duration = r5     // Catch: java.lang.Throwable -> L45
            r13.network = r2     // Catch: java.lang.Throwable -> L45
        L6f6:
            java.lang.String r2 = "ext"
            org.json.JSONObject r2 = r12.optJSONObject(r2)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L740
            java.lang.String r5 = "a"
            int r2 = r2.optInt(r5)     // Catch: java.lang.Throwable -> L45
            if (r2 != r0) goto L740
            com.baidu.liantian.e r2 = r1.preference     // Catch: java.lang.Throwable -> L45
            java.util.List r2 = r2.p()     // Catch: java.lang.Throwable -> L45
            if (r23 <= 0) goto L740
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> L45
            boolean r5 = r2.contains(r5)     // Catch: java.lang.Throwable -> L45
            if (r5 != 0) goto L740
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> L45
            r2.add(r5)     // Catch: java.lang.Throwable -> L45
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L45
            int[] r5 = new int[r5]     // Catch: java.lang.Throwable -> L45
            r6 = 0
        L726:
            int r10 = r2.size()     // Catch: java.lang.Throwable -> L45
            if (r6 >= r10) goto L73b
            java.lang.Object r10 = r2.get(r6)     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L45
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L45
            r5[r6] = r10     // Catch: java.lang.Throwable -> L45
            int r6 = r6 + 1
            goto L726
        L73b:
            com.baidu.liantian.e r2 = r1.preference     // Catch: java.lang.Throwable -> L45
            r2.a(r5)     // Catch: java.lang.Throwable -> L45
        L740:
            r13.signMD5 = r7     // Catch: java.lang.Throwable -> L45
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L45
            r13.startTime = r5     // Catch: java.lang.Throwable -> L45
            int r2 = r4.indexOf(r13)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            if (r2 < 0) goto L7ba
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.core.ApkInfo r5 = (com.baidu.liantian.core.ApkInfo) r5     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = r13.versionName     // Catch: java.lang.Throwable -> L45
            java.lang.String r7 = r5.versionName     // Catch: java.lang.Throwable -> L45
            boolean r6 = com.baidu.liantian.b.e.c(r6, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L79b
            java.util.List<java.lang.Integer> r6 = com.baidu.liantian.core.d.f5953e     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L773
            if (r6 == 0) goto L79b
            int r7 = r13.key     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L45
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L45
            if (r6 != 0) goto L79b
        L773:
            int r6 = r5.priority     // Catch: java.lang.Throwable -> L45
            int r7 = r13.priority     // Catch: java.lang.Throwable -> L45
            if (r6 == r7) goto L780
            com.baidu.liantian.a.a r6 = r1.loadedPluginDB     // Catch: java.lang.Throwable -> L45
            int r10 = r13.key     // Catch: java.lang.Throwable -> L45
            r6.c(r10, r7)     // Catch: java.lang.Throwable -> L45
        L780:
            com.baidu.liantian.a.a r6 = r1.loadedPluginDB     // Catch: java.lang.Throwable -> L45
            int r5 = r5.key     // Catch: java.lang.Throwable -> L45
            boolean r5 = r6.e(r5)     // Catch: java.lang.Throwable -> L45
            if (r5 != 0) goto L7af
            r9.add(r13)     // Catch: java.lang.Throwable -> L45
            java.util.List<java.lang.Integer> r5 = r1.mDownloadPluginsList     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L7af
            int r6 = r13.key     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L45
            r5.add(r6)     // Catch: java.lang.Throwable -> L45
            goto L7af
        L79b:
            int r6 = r5.priority     // Catch: java.lang.Throwable -> L45
            int r7 = r13.priority     // Catch: java.lang.Throwable -> L45
            if (r6 == r7) goto L7ac
            r5.priority = r7     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.a.a r6 = r1.loadedPluginDB     // Catch: java.lang.Throwable -> L45
            int r7 = r13.key     // Catch: java.lang.Throwable -> L45
            int r10 = r13.priority     // Catch: java.lang.Throwable -> L45
            r6.c(r7, r10)     // Catch: java.lang.Throwable -> L45
        L7ac:
            r8.add(r5)     // Catch: java.lang.Throwable -> L45
        L7af:
            r4.remove(r2)     // Catch: java.lang.Throwable -> L45
        L7b2:
            r6 = r20
            r11 = r21
            r10 = r25
            goto L5aa
        L7ba:
            r9.add(r13)     // Catch: java.lang.Throwable -> L45
            java.util.List<java.lang.Integer> r2 = r1.mDownloadPluginsList     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L7b2
            int r5 = r13.key     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L45
            r2.add(r5)     // Catch: java.lang.Throwable -> L45
            goto L7b2
        L7cb:
            r25 = r10
            java.util.List<java.lang.Integer> r2 = com.baidu.liantian.core.d.f5953e     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L7d4
            r2.clear()     // Catch: java.lang.Throwable -> L45
        L7d4:
            java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r2 = r4.iterator()     // Catch: java.lang.Throwable -> L45
        L7de:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L80b
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.core.ApkInfo r4 = (com.baidu.liantian.core.ApkInfo) r4     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = r4.packageName     // Catch: java.lang.Throwable -> L45
            r6 = r25
            boolean r5 = r6.contains(r5)     // Catch: java.lang.Throwable -> L45
            if (r5 != 0) goto L808
            java.util.List<java.lang.Integer> r5 = r1.mUnloadPluginsList     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L801
            int r7 = r4.key     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L45
            r5.add(r7)     // Catch: java.lang.Throwable -> L45
        L801:
            com.baidu.liantian.core.d r5 = r1.forHostAPP     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r4.packageName     // Catch: java.lang.Throwable -> L45
            r5.a(r4)     // Catch: java.lang.Throwable -> L45
        L808:
            r25 = r6
            goto L7de
        L80b:
            android.content.Context r2 = r1.context     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.e.c(r2)     // Catch: java.lang.Throwable -> L45
            r8.toString()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            android.content.Context r2 = r1.context     // Catch: java.lang.Throwable -> L45
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L45
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.core.g r2 = com.baidu.liantian.core.g.a(r2)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r4 = r1.preference     // Catch: java.lang.Throwable -> L45
            java.util.List r4 = r4.q()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.e r5 = r1.preference     // Catch: java.lang.Throwable -> L45
            java.util.List r5 = r5.p()     // Catch: java.lang.Throwable -> L45
            r6 = 0
        L831:
            int r7 = r5.size()     // Catch: java.lang.Throwable -> L45
            if (r6 >= r7) goto L84b
            java.lang.Object r7 = r5.get(r6)     // Catch: java.lang.Throwable -> L45
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L45
            if (r7 != 0) goto L848
            java.lang.Object r7 = r5.get(r6)     // Catch: java.lang.Throwable -> L45
            r4.add(r7)     // Catch: java.lang.Throwable -> L45
        L848:
            int r6 = r6 + 1
            goto L831
        L84b:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45
            r5.<init>()     // Catch: java.lang.Throwable -> L45
            r5.addAll(r8)     // Catch: java.lang.Throwable -> L45
            r5.addAll(r9)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.ac.U$1 r6 = new com.baidu.liantian.ac.U$1     // Catch: java.lang.Throwable -> L45
            r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L45
            java.util.Collections.sort(r5, r6)     // Catch: java.lang.Throwable -> L45
            r4 = 0
        L85f:
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L45
            if (r4 >= r6) goto L946
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.core.ApkInfo r6 = (com.baidu.liantian.core.ApkInfo) r6     // Catch: java.lang.Throwable -> L45
            boolean r7 = r8.contains(r6)     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L92e
            java.lang.String r7 = r6.packageName     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.core.ApkInfo r7 = r2.d(r7)     // Catch: java.lang.Throwable -> L45
            if (r7 != 0) goto L92c
            com.baidu.liantian.a.a r7 = r1.loadedPluginDB     // Catch: java.lang.Throwable -> L45
            int r10 = r6.key     // Catch: java.lang.Throwable -> L45
            int r7 = r7.g(r10)     // Catch: java.lang.Throwable -> L45
            r10 = 3
            if (r7 != r10) goto L889
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
            r7 = 0
            goto L88a
        L889:
            r7 = 1
        L88a:
            com.baidu.liantian.e r11 = r1.preference     // Catch: java.lang.Throwable -> L45
            boolean r11 = r11.d()     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L8df
            if (r7 == 0) goto L8df
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L45
            android.content.Context r11 = r1.context     // Catch: java.lang.Throwable -> L45
            java.io.File r11 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = ".b_liantian"
            r7.<init>(r11, r12)     // Catch: java.lang.Throwable -> L45
            boolean r11 = r7.exists()     // Catch: java.lang.Throwable -> L45
            if (r11 != 0) goto L8aa
            r7.mkdir()     // Catch: java.lang.Throwable -> L45
        L8aa:
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = r6.pkgPath     // Catch: java.lang.Throwable -> L45
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L45
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r13.<init>()     // Catch: java.lang.Throwable -> L45
            int r14 = r6.key     // Catch: java.lang.Throwable -> L45
            r13.append(r14)     // Catch: java.lang.Throwable -> L45
            java.lang.String r14 = "-"
            r13.append(r14)     // Catch: java.lang.Throwable -> L45
            java.lang.String r14 = r6.versionName     // Catch: java.lang.Throwable -> L45
            r13.append(r14)     // Catch: java.lang.Throwable -> L45
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L45
            r12.<init>(r7, r13)     // Catch: java.lang.Throwable -> L45
            boolean r7 = com.baidu.liantian.b.e.a(r12)     // Catch: java.lang.Throwable -> L45
            if (r7 != 0) goto L8d7
            com.baidu.liantian.b.e.a(r11, r12)     // Catch: java.lang.Throwable -> L45
        L8d7:
            android.content.Context r7 = r1.context     // Catch: java.lang.Throwable -> L45
            int r13 = r6.key     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.c.a(r7, r13, r11, r12)     // Catch: java.lang.Throwable -> L45
            goto L921
        L8df:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L45
            android.content.Context r11 = r1.context     // Catch: java.lang.Throwable -> L45
            java.io.File r11 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = ".b_liantian"
            r7.<init>(r11, r12)     // Catch: java.lang.Throwable -> L45
            boolean r11 = r7.exists()     // Catch: java.lang.Throwable -> L45
            if (r11 == 0) goto L921
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r12.<init>()     // Catch: java.lang.Throwable -> L45
            int r13 = r6.key     // Catch: java.lang.Throwable -> L45
            r12.append(r13)     // Catch: java.lang.Throwable -> L45
            java.lang.String r13 = "-"
            r12.append(r13)     // Catch: java.lang.Throwable -> L45
            java.lang.String r13 = r6.versionName     // Catch: java.lang.Throwable -> L45
            r12.append(r13)     // Catch: java.lang.Throwable -> L45
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L45
            r11.<init>(r7, r12)     // Catch: java.lang.Throwable -> L45
            boolean r7 = com.baidu.liantian.b.e.a(r11)     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L921
            com.baidu.liantian.c.a(r11)     // Catch: java.lang.Throwable -> L45
            r11.delete()     // Catch: java.lang.Throwable -> L45
            r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L45
            com.baidu.liantian.b.a()     // Catch: java.lang.Throwable -> L45
        L921:
            com.baidu.liantian.core.d r7 = r1.forHostAPP     // Catch: java.lang.Throwable -> L45
            int r11 = r6.key     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = r6.versionName     // Catch: java.lang.Throwable -> L45
            r12 = 0
            r7.a(r11, r6, r12)     // Catch: java.lang.Throwable -> L45
            goto L942
        L92c:
            r10 = 3
            goto L942
        L92e:
            r10 = 3
            boolean r7 = r9.contains(r6)     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L942
            com.baidu.liantian.a.a r7 = r1.loadedPluginDB     // Catch: java.lang.Throwable -> L45
            int r11 = r6.key     // Catch: java.lang.Throwable -> L45
            boolean r7 = r7.e(r11)     // Catch: java.lang.Throwable -> L45
            if (r7 != 0) goto L942
            r1.handlePluginUpgrade(r6)     // Catch: java.lang.Throwable -> L45
        L942:
            int r4 = r4 + 1
            goto L85f
        L946:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L45
            int r2 = r1.mEndReason     // Catch: java.lang.Throwable -> L94f
            if (r2 != 0) goto L94d
            r1.mEndReason = r0     // Catch: java.lang.Throwable -> L94f
        L94d:
            r12 = 0
            goto L951
        L94f:
            r0 = move-exception
            goto L978
        L951:
            r1.handleThreadEnd(r12)     // Catch: java.lang.Throwable -> L94f
            boolean r0 = r1.mOut     // Catch: java.lang.Throwable -> L962
            if (r0 == 0) goto L960
            boolean r0 = com.baidu.liantian.ac.U.sOutGoing     // Catch: java.lang.Throwable -> L962
            if (r0 == 0) goto L960
            r19 = 0
            com.baidu.liantian.ac.U.sOutGoing = r19     // Catch: java.lang.Throwable -> L962
        L960:
            monitor-exit(r26)
            return
        L962:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r26)
            return
        L967:
            int r0 = r1.mEndReason     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L96e
            r0 = 6
            r1.mEndReason = r0     // Catch: java.lang.Throwable -> L45
        L96e:
            android.accounts.NetworkErrorException r0 = new android.accounts.NetworkErrorException     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "hostPkgInfo is null"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L976:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L94f
        L978:
            com.baidu.liantian.core.d r2 = r1.forHostAPP     // Catch: java.lang.Throwable -> L97e
            r2.b()     // Catch: java.lang.Throwable -> L97e
            goto L981
        L97e:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L9ce
        L981:
            int r2 = r1.mEndReason     // Catch: java.lang.Throwable -> L9b2
            if (r2 != 0) goto L9aa
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L9b2
            java.lang.String r3 = "response is empty"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L9b2
            if (r2 == 0) goto L995
            r2 = 7
            r1.mEndReason = r2     // Catch: java.lang.Throwable -> L9b2
            goto L9aa
        L995:
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L9b2
            java.lang.String r3 = "aes is fail"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L9b2
            if (r2 == 0) goto L9a6
            r2 = 8
            r1.mEndReason = r2     // Catch: java.lang.Throwable -> L9b2
            goto L9aa
        L9a6:
            r2 = 11
            r1.mEndReason = r2     // Catch: java.lang.Throwable -> L9b2
        L9aa:
            java.lang.String r2 = com.baidu.liantian.b.a(r0)     // Catch: java.lang.Throwable -> L9b2
            r1.handleThreadEnd(r2)     // Catch: java.lang.Throwable -> L9b2
            goto L9b5
        L9b2:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L9ce
        L9b5:
            r0.getMessage()     // Catch: java.lang.Throwable -> L9ce
            com.baidu.liantian.b.b()     // Catch: java.lang.Throwable -> L9ce
            boolean r0 = r1.mOut     // Catch: java.lang.Throwable -> L9c9
            if (r0 == 0) goto L9c7
            boolean r0 = com.baidu.liantian.ac.U.sOutGoing     // Catch: java.lang.Throwable -> L9c9
            if (r0 == 0) goto L9c7
            r19 = 0
            com.baidu.liantian.ac.U.sOutGoing = r19     // Catch: java.lang.Throwable -> L9c9
        L9c7:
            monitor-exit(r26)
            return
        L9c9:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r26)
            return
        L9ce:
            r0 = move-exception
            boolean r2 = r1.mOut     // Catch: java.lang.Throwable -> L9dc
            if (r2 == 0) goto L9df
            boolean r2 = com.baidu.liantian.ac.U.sOutGoing     // Catch: java.lang.Throwable -> L9dc
            if (r2 == 0) goto L9df
            r19 = 0
            com.baidu.liantian.ac.U.sOutGoing = r19     // Catch: java.lang.Throwable -> L9dc
            goto L9df
        L9dc:
            com.baidu.liantian.b.e.a()     // Catch: java.lang.Throwable -> L5a
        L9df:
            throw r0     // Catch: java.lang.Throwable -> L5a
        L9e0:
            monitor-exit(r26)     // Catch: java.lang.Throwable -> L5a
            throw r0
    }
}
