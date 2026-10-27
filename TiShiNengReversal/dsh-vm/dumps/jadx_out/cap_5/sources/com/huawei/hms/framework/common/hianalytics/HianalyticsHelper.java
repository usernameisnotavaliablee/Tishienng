package com.huawei.hms.framework.common.hianalytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HianalyticsHelper {
    private static final java.lang.String l = "HianalyticsHelper";
    private static final java.lang.String m = "hms_hwid";
    private static final java.lang.String n = "_default_config_tag";
    private static final java.lang.String o = "user_experience_involved";
    private static final int p = 1;
    private static final int q = 1;

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static volatile com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r;
    private boolean a;
    private boolean b;
    private java.lang.String c;
    private com.huawei.hianalytics.process.HiAnalyticsInstance d;
    private boolean e;
    private java.util.concurrent.ExecutorService f;
    private com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.ReportCallBack g;
    private boolean h;
    private boolean i;
    private final int j;
    private boolean k;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class HianalyticsRunnable implements java.lang.Runnable {
        private final com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData a;
        private final java.lang.String b;

        HianalyticsRunnable(com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r0 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.getInstance()
                com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData r1 = r3.a
                java.util.LinkedHashMap r1 = r1.get()
                java.lang.String r2 = r3.b
                r0.onEvent(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ReportCallBack {
        void onReport(int r1, java.lang.String r2, java.util.LinkedHashMap<java.lang.String, java.lang.String> r3);
    }

    private HianalyticsHelper() {
            r6 = this;
            java.lang.String r0 = "HianalyticsHelper"
            r6.<init>()
            java.lang.String r1 = "hms_hwid"
            r6.c = r1
            r1 = 0
            r6.d = r1
            r1 = 0
            r6.e = r1
            java.lang.String r2 = "report_ha"
            java.util.concurrent.ExecutorService r2 = com.huawei.hms.framework.common.ExecutorsUtils.newSingleThreadExecutor(r2)
            r6.f = r2
            r2 = 1
            r6.h = r2
            r6.i = r2
            java.security.SecureRandom r3 = new java.security.SecureRandom
            r3.<init>()
            r4 = 1000(0x3e8, float:1.401E-42)
            int r3 = r3.nextInt(r4)
            r6.j = r3
            java.lang.String r3 = "_default_config_tag"
            com.huawei.hianalytics.process.HiAnalyticsManager.getInitFlag(r3)     // Catch: java.lang.Throwable -> L31
            r6.a = r2     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            java.lang.String r3 = "Hianalytics sdk not found"
            com.huawei.hms.framework.common.Logger.i(r0, r3)
            r6.a = r1
        L38:
            boolean r3 = r6.a
            if (r3 != 0) goto L43
            android.content.Context r3 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            r6.d(r3)
        L43:
            android.content.Context r3 = com.huawei.hms.framework.common.ContextHolder.getAppContext()     // Catch: java.lang.Exception -> L59
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> L59
            java.lang.String r4 = "com.huawei.works"
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: java.lang.Exception -> L59
            if (r3 == 0) goto L55
            r3 = 1
            goto L56
        L55:
            r3 = 0
        L56:
            r6.k = r3     // Catch: java.lang.Exception -> L59
            goto L5b
        L59:
            r6.k = r1
        L5b:
            boolean r3 = r6.a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r4 = r6.b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r3
            r5[r2] = r4
            java.lang.String r1 = "this time the ha %s, mini %s"
            com.huawei.hms.framework.common.Logger.v(r0, r1, r5)
            return
    }

    private boolean a(@androidx.annotation.NonNull android.content.Context r4, boolean r5, boolean r6) {
            r3 = this;
            java.lang.String r0 = "HianalyticsHelper"
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper$ReportCallBack r1 = r3.g
            r2 = 1
            if (r1 == 0) goto L8
            return r2
        L8:
            r1 = 0
            if (r5 == 0) goto L18
            if (r6 == 0) goto L11
            boolean r5 = r3.i
            if (r5 == 0) goto L17
        L11:
            if (r6 != 0) goto L18
            boolean r5 = r3.h
            if (r5 != 0) goto L18
        L17:
            return r1
        L18:
            boolean r5 = r3.b
            if (r5 == 0) goto L1d
            return r2
        L1d:
            boolean r5 = r3.a
            if (r5 != 0) goto L22
            return r1
        L22:
            boolean r5 = r3.e
            if (r5 == 0) goto L2b
            boolean r4 = r3.b()
            return r4
        L2b:
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "user_experience_involved"
            r6 = -1
            int r4 = android.provider.Settings.Secure.getInt(r4, r5, r6)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L43
            if (r4 != r2) goto L48
            boolean r4 = r3.b()     // Catch: java.lang.Throwable -> L3d java.lang.IllegalStateException -> L43
            return r4
        L3d:
            java.lang.String r4 = "the setting has other error"
            com.huawei.hms.framework.common.Logger.w(r0, r4)
            goto L48
        L43:
            java.lang.String r4 = "the setting has illegalStateException"
            com.huawei.hms.framework.common.Logger.w(r0, r4)
        L48:
            java.lang.String r4 = "user experience involved needs to be opened"
            com.huawei.hms.framework.common.Logger.i(r0, r4)
            return r1
    }

    private boolean b() {
            r3 = this;
            com.huawei.hianalytics.process.HiAnalyticsInstance r0 = r3.d
            r1 = 1
            if (r0 != 0) goto L23
            java.lang.String r0 = "_default_config_tag"
            boolean r2 = com.huawei.hianalytics.process.HiAnalyticsManager.getInitFlag(r0)
            if (r2 == 0) goto L14
            com.huawei.hianalytics.process.HiAnalyticsInstance r0 = com.huawei.hianalytics.process.HiAnalyticsManager.getInstanceByTag(r0)
            r3.d = r0
            goto L1c
        L14:
            java.lang.String r0 = r3.c
            com.huawei.hianalytics.process.HiAnalyticsInstance r0 = com.huawei.hianalytics.process.HiAnalyticsManager.getInstanceByTag(r0)
            r3.d = r0
        L1c:
            com.huawei.hianalytics.process.HiAnalyticsInstance r0 = r3.d
            if (r0 == 0) goto L21
            return r1
        L21:
            r0 = 0
            return r0
        L23:
            return r1
    }

    private void c(android.content.Context r4, java.lang.String r5, java.util.Map r6, int r7) {
            r3 = this;
            if (r4 == 0) goto L25
            if (r6 != 0) goto L5
            goto L25
        L5:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r6
            java.lang.String r1 = "HianalyticsHelper"
            java.lang.String r2 = "data = %s"
            com.huawei.hms.framework.common.Logger.v(r1, r2, r0)
            com.huawei.hms.support.hianalytics.HiAnalyticsUtils r0 = com.huawei.hms.support.hianalytics.HiAnalyticsUtils.getInstance()     // Catch: java.lang.Throwable -> L1a java.lang.NoSuchMethodError -> L20
            r0.onNewEvent(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1a java.lang.NoSuchMethodError -> L20
            return
        L1a:
            java.lang.String r4 = "the stats has other error,pls check it"
            com.huawei.hms.framework.common.Logger.i(r1, r4)
            goto L25
        L20:
            java.lang.String r4 = "may be you need upgrade stats sdk"
            com.huawei.hms.framework.common.Logger.w(r1, r4)
        L25:
            return
    }

    private void d(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "HianalyticsHelper"
            if (r2 != 0) goto La
            java.lang.String r2 = "the appContext hasn't init"
            com.huawei.hms.framework.common.Logger.i(r0, r2)
            return
        La:
            com.huawei.hms.utils.HMSBIInitializer r2 = com.huawei.hms.utils.HMSBIInitializer.getInstance(r2)     // Catch: java.lang.Throwable -> L15 java.lang.NoClassDefFoundError -> L1b
            r2.initBI()     // Catch: java.lang.Throwable -> L15 java.lang.NoClassDefFoundError -> L1b
            r2 = 1
            r1.b = r2     // Catch: java.lang.Throwable -> L15 java.lang.NoClassDefFoundError -> L1b
            return
        L15:
            java.lang.String r2 = "the hms base has other error!"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            goto L20
        L1b:
            java.lang.String r2 = "maybe you need add base sdk!"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
        L20:
            return
    }

    public static com.huawei.hms.framework.common.hianalytics.HianalyticsHelper getInstance() {
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r0 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.r
            if (r0 != 0) goto L19
            java.lang.Class<com.huawei.hms.framework.common.hianalytics.HianalyticsHelper> r0 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.class
            monitor-enter(r0)
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r1 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.r     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r1 = new com.huawei.hms.framework.common.hianalytics.HianalyticsHelper     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.r = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r0 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.r
            return r0
    }

    public void enablePrivacyPolicy(boolean r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void executeReportHa(com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData r3, java.lang.String r4) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.getReportExecutor()
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper$HianalyticsRunnable r1 = new com.huawei.hms.framework.common.hianalytics.HianalyticsHelper$HianalyticsRunnable
            r1.<init>(r3, r4)
            r0.execute(r1)
            return
    }

    public java.util.concurrent.ExecutorService getReportExecutor() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f
            return r0
    }

    public boolean inRate() {
            r1 = this;
            boolean r0 = r1.h
            return r0
    }

    public boolean isEnableReport(android.content.Context r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            boolean r3 = r2.a(r3, r0, r1)
            return r3
    }

    public boolean isEnableReportNoSeed(android.content.Context r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.a(r2, r0, r0)
            return r2
    }

    public boolean isQuicEnableReport(android.content.Context r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.a(r2, r0, r0)
            return r2
    }

    public void onEvent(java.util.LinkedHashMap<java.lang.String, java.lang.String> r2) {
            r1 = this;
            java.lang.String r0 = "url_request"
            r1.onEvent(r2, r0)
            return
    }

    public void onEvent(java.util.LinkedHashMap<java.lang.String, java.lang.String> r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.onEvent(r2, r3, r0)
            return
    }

    public void onEvent(java.util.LinkedHashMap<java.lang.String, java.lang.String> r6, java.lang.String r7, int r8) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L50
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            boolean r1 = r5.k
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "in_user"
            r6.put(r1, r0)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r6
            java.lang.String r3 = "HianalyticsHelper"
            java.lang.String r4 = "data = %s"
            com.huawei.hms.framework.common.Logger.v(r3, r4, r1)
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper$ReportCallBack r1 = r5.g
            if (r1 == 0) goto L30
            r1.onReport(r8, r7, r6)
            return
        L30:
            boolean r1 = r5.b
            if (r1 == 0) goto L3c
            android.content.Context r1 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            r5.c(r1, r7, r6, r8)
            goto L4c
        L3c:
            if (r8 != 0) goto L4c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r2] = r6
            java.lang.String r6 = "the base sdk isn't exsit, and reportType is %s"
            com.huawei.hms.framework.common.Logger.v(r3, r6, r7)
            return
        L4c:
            boolean r8 = r5.a
            if (r8 != 0) goto L51
        L50:
            return
        L51:
            com.huawei.hianalytics.process.HiAnalyticsInstance r8 = r5.d
            if (r8 == 0) goto L59
            r8.onEvent(r0, r7, r6)
            return
        L59:
            java.lang.String r6 = "the ha has error,has init but is null!"
            com.huawei.hms.framework.common.Logger.e(r3, r6)
            return
    }

    public void reportData(android.content.Context r1, java.util.LinkedHashMap<java.lang.String, java.lang.String> r2, java.lang.String r3, int r4) {
            r0 = this;
            boolean r1 = r0.isEnableReportNoSeed(r1)
            if (r1 != 0) goto L7
            return
        L7:
            r0.onEvent(r2, r3, r4)
            return
    }

    public void reportException(java.lang.Throwable r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "HianalyticsHelper"
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r1 = getInstance()
            android.content.Context r2 = com.huawei.hms.framework.common.ContextHolder.getAppContext()
            boolean r1 = r1.isEnableReportNoSeed(r2)
            if (r1 != 0) goto L11
            goto L35
        L11:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            java.util.concurrent.ExecutorService r2 = r4.f     // Catch: java.lang.Exception -> L24 java.util.concurrent.RejectedExecutionException -> L30
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper$1 r3 = new com.huawei.hms.framework.common.hianalytics.HianalyticsHelper$1     // Catch: java.lang.Exception -> L24 java.util.concurrent.RejectedExecutionException -> L30
            r3.<init>(r4, r1, r5, r6)     // Catch: java.lang.Exception -> L24 java.util.concurrent.RejectedExecutionException -> L30
            r2.submit(r3)     // Catch: java.lang.Exception -> L24 java.util.concurrent.RejectedExecutionException -> L30
            return
        L24:
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r1 = 0
            r6[r1] = r5
            java.lang.String r5 = "reportException error!"
            com.huawei.hms.framework.common.Logger.i(r0, r5, r6)
            goto L35
        L30:
            java.lang.String r5 = "reportException error RejectedExecutionException"
            com.huawei.hms.framework.common.Logger.i(r0, r5)
        L35:
            return
    }

    public void setHaTag(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setQuicRate(int r3) {
            r2 = this;
            r0 = 1
            if (r3 < 0) goto L15
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r1) goto L8
            goto L15
        L8:
            int r1 = r2.j
            if (r1 < r3) goto L12
            boolean r3 = r2.k
            if (r3 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            r2.i = r0
            return
        L15:
            r2.i = r0
            return
    }

    public void setRate(int r3) {
            r2 = this;
            r0 = 1
            if (r3 < 0) goto L3f
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r1) goto L8
            goto L3f
        L8:
            int r1 = r2.j
            if (r1 < r3) goto L12
            boolean r1 = r2.k
            if (r1 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            r2.h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bReportable = "
            r0.append(r1)
            boolean r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", inuser = "
            r0.append(r1)
            boolean r1 = r2.k
            r0.append(r1)
            java.lang.String r1 = ", rate = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "HianalyticsHelper"
            com.huawei.hms.framework.common.Logger.i(r0, r3)
            return
        L3f:
            r2.h = r0
            return
    }

    public void setReportCallback(com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.ReportCallBack r1) {
            r0 = this;
            r0.g = r1
            return
    }
}
