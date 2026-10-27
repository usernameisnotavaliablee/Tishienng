package com.huawei.hms.framework.common.hianalytics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class InitReport {
    private static final java.lang.String a = "HaReport";
    private static boolean b = false;
    private static final int c = 10;
    private static java.util.List<java.lang.Runnable> d;


    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.huawei.hms.framework.common.hianalytics.InitReport.d = r0
            return
    }

    public InitReport() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a() {
            java.lang.String r0 = "HaReport"
            java.util.List<java.lang.Runnable> r1 = com.huawei.hms.framework.common.hianalytics.InitReport.d     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
        L8:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r3 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.getInstance()     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
            java.util.concurrent.ExecutorService r3 = r3.getReportExecutor()     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
            r3.submit(r2)     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
            goto L8
        L20:
            java.util.List<java.lang.Runnable> r1 = com.huawei.hms.framework.common.hianalytics.InitReport.d     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
            r1.clear()     // Catch: java.lang.Exception -> L26 java.lang.NullPointerException -> L2c java.util.concurrent.RejectedExecutionException -> L32
            return
        L26:
            java.lang.String r1 = "submit failed because of some exception"
            com.huawei.hms.framework.common.Logger.e(r0, r1)
            goto L37
        L2c:
            java.lang.String r1 = "event is null occured"
            com.huawei.hms.framework.common.Logger.e(r0, r1)
            goto L37
        L32:
            java.lang.String r1 = "submit failed of rejected execution exception"
            com.huawei.hms.framework.common.Logger.e(r0, r1)
        L37:
            return
    }

    static /* synthetic */ void access$000() {
            a()
            return
    }

    public static void disableConnectNet() {
            r0 = 0
            com.huawei.hms.framework.common.hianalytics.InitReport.b = r0
            return
    }

    public static void enableConnectNet() {
            java.lang.String r0 = "HaReport"
            r1 = 1
            com.huawei.hms.framework.common.hianalytics.InitReport.b = r1
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r1 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.getInstance()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.RejectedExecutionException -> L1c
            java.util.concurrent.ExecutorService r1 = r1.getReportExecutor()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.RejectedExecutionException -> L1c
            com.huawei.hms.framework.common.hianalytics.InitReport$1 r2 = new com.huawei.hms.framework.common.hianalytics.InitReport$1     // Catch: java.lang.Throwable -> L16 java.util.concurrent.RejectedExecutionException -> L1c
            r2.<init>()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.RejectedExecutionException -> L1c
            r1.submit(r2)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.RejectedExecutionException -> L1c
            return
        L16:
            java.lang.String r1 = "the thread submit has fatal error!"
            com.huawei.hms.framework.common.Logger.e(r0, r1)
            goto L21
        L1c:
            java.lang.String r1 = "the thread submit has rejectedExecutionException!"
            com.huawei.hms.framework.common.Logger.e(r0, r1)
        L21:
            return
    }

    public static void reportWhenInit(java.lang.Runnable r2) {
            java.lang.String r0 = "HaReport"
            boolean r1 = com.huawei.hms.framework.common.hianalytics.InitReport.b
            if (r1 == 0) goto L1e
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r1 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.getInstance()     // Catch: java.lang.Throwable -> L12 java.util.concurrent.RejectedExecutionException -> L18
            java.util.concurrent.ExecutorService r1 = r1.getReportExecutor()     // Catch: java.lang.Throwable -> L12 java.util.concurrent.RejectedExecutionException -> L18
            r1.execute(r2)     // Catch: java.lang.Throwable -> L12 java.util.concurrent.RejectedExecutionException -> L18
            return
        L12:
            java.lang.String r2 = "the thread submit has fatal error!"
            com.huawei.hms.framework.common.Logger.e(r0, r2)
            goto L1d
        L18:
            java.lang.String r2 = "the thread submit has rejectedExecutionException!"
            com.huawei.hms.framework.common.Logger.e(r0, r2)
        L1d:
            return
        L1e:
            java.util.List<java.lang.Runnable> r0 = com.huawei.hms.framework.common.hianalytics.InitReport.d
            int r0 = r0.size()
            r1 = 10
            if (r0 <= r1) goto L30
            java.lang.String r2 = "TAG"
            java.lang.String r0 = "the event to be report when init exceed the limit!"
            com.huawei.hms.framework.common.Logger.e(r2, r0)
            return
        L30:
            java.util.List<java.lang.Runnable> r0 = com.huawei.hms.framework.common.hianalytics.InitReport.d
            r0.add(r2)
            return
    }
}
