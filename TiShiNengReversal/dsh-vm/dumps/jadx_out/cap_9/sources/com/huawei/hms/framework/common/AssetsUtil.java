package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AssetsUtil {
    private static final java.lang.String a = "AssetsUtil";
    private static final java.lang.String b = "AssetsUtil_Operate";
    private static final java.util.concurrent.ExecutorService c = null;
    private static final int d = 5;


    static {
            java.lang.String r0 = "AssetsUtil_Operate"
            java.util.concurrent.ExecutorService r0 = com.huawei.hms.framework.common.ExecutorsUtils.newSingleThreadExecutor(r0)
            com.huawei.hms.framework.common.AssetsUtil.c = r0
            return
    }

    public AssetsUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String[] list(android.content.Context r5, java.lang.String r6) {
            r0 = 0
            java.lang.String r1 = "AssetsUtil"
            if (r5 != 0) goto Ld
            java.lang.String r5 = "context is null"
            com.huawei.hms.framework.common.Logger.w(r1, r5)
            java.lang.String[] r5 = new java.lang.String[r0]
            return r5
        Ld:
            java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask
            com.huawei.hms.framework.common.AssetsUtil$1 r3 = new com.huawei.hms.framework.common.AssetsUtil$1
            r3.<init>(r5, r6)
            r2.<init>(r3)
            java.util.concurrent.ExecutorService r5 = com.huawei.hms.framework.common.AssetsUtil.c
            r5.execute(r2)
            r5 = 1
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2b java.util.concurrent.ExecutionException -> L2d java.lang.InterruptedException -> L2f java.lang.Exception -> L31 java.util.concurrent.TimeoutException -> L3c
            r3 = 5
            java.lang.Object r6 = r2.get(r3, r6)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.ExecutionException -> L2d java.lang.InterruptedException -> L2f java.lang.Exception -> L31 java.util.concurrent.TimeoutException -> L3c
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L2b java.util.concurrent.ExecutionException -> L2d java.lang.InterruptedException -> L2f java.lang.Exception -> L31 java.util.concurrent.TimeoutException -> L3c
            r2.cancel(r5)
            return r6
        L2b:
            r6 = move-exception
            goto L5d
        L2d:
            r6 = move-exception
            goto L47
        L2f:
            r6 = move-exception
            goto L52
        L31:
            java.lang.String r6 = "get local config files from sp task occur unknown Exception"
            com.huawei.hms.framework.common.Logger.w(r1, r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2b
            r2.cancel(r5)
            return r6
        L3c:
            java.lang.String r6 = "get local config files from sp task timed out"
            com.huawei.hms.framework.common.Logger.w(r1, r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2b
            r2.cancel(r5)
            return r6
        L47:
            java.lang.String r3 = "get local config files from sp task failed"
            com.huawei.hms.framework.common.Logger.w(r1, r3, r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2b
            r2.cancel(r5)
            return r6
        L52:
            java.lang.String r3 = "get local config files from sp task interrupted"
            com.huawei.hms.framework.common.Logger.w(r1, r3, r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2b
            r2.cancel(r5)
            return r6
        L5d:
            r2.cancel(r5)
            throw r6
    }

    public static java.io.InputStream open(android.content.Context r2, java.lang.String r3) throws java.io.IOException {
            r0 = 0
            java.lang.String r1 = "AssetsUtil"
            if (r2 != 0) goto Lb
            java.lang.String r2 = "context is null"
            com.huawei.hms.framework.common.Logger.w(r1, r2)
            return r0
        Lb:
            android.content.res.AssetManager r2 = r2.getAssets()
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.RuntimeException -> L14
            return r2
        L14:
            r2 = move-exception
            java.lang.String r3 = "AssetManager has been destroyed"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r2)
            return r0
    }
}
