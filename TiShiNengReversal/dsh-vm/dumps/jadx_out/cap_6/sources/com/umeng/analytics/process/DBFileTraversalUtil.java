package com.umeng.analytics.process;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DBFileTraversalUtil {
    private static java.util.concurrent.ExecutorService a;
    private static com.umeng.commonsdk.utils.FileLockUtil b;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();
    }

    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.umeng.analytics.process.DBFileTraversalUtil.a = r0
            com.umeng.commonsdk.utils.FileLockUtil r0 = new com.umeng.commonsdk.utils.FileLockUtil
            r0.<init>()
            com.umeng.analytics.process.DBFileTraversalUtil.b = r0
            return
    }

    public DBFileTraversalUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.umeng.commonsdk.utils.FileLockUtil a() {
            com.umeng.commonsdk.utils.FileLockUtil r0 = com.umeng.analytics.process.DBFileTraversalUtil.b
            return r0
    }

    public static void traverseDBFiles(java.lang.String r2, com.umeng.commonsdk.utils.FileLockCallback r3, com.umeng.analytics.process.DBFileTraversalUtil.a r4) {
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L1b
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L1b
            java.util.concurrent.ExecutorService r2 = com.umeng.analytics.process.DBFileTraversalUtil.a
            com.umeng.analytics.process.DBFileTraversalUtil$1 r1 = new com.umeng.analytics.process.DBFileTraversalUtil$1
            r1.<init>(r0, r3, r4)
            r2.execute(r1)
        L1b:
            return
    }
}
