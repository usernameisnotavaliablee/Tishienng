package xyz.adscope.common.v2.crash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class ScopeCrashHandler implements java.lang.Thread.UncaughtExceptionHandler, xyz.adscope.common.v2.crash.IScopeCrashHandler {
    static final java.lang.String AMPS_CRASH_ATTENTION = "xyz.adscope.amps";
    static final java.lang.String ASNP_CRASH_ATTENTION = "xyz.adscope.ad";
    private static final java.lang.String CRASH_FILE_DIR = "/AdScope/crash/log/";
    private static final java.lang.String CRASH_FILE_PATTERN = "scope_crash_%d.trace";
    private static final java.lang.String CRASH_FILE_SUFFIX = ".trace";
    static final java.lang.String FOUNDATION_CRASH_ATTENTION = "xyz.adscope.common";
    private static final java.lang.String SP_FILE_CRASH = "ScopeCrash_%s";
    private static final java.lang.String SP_KEY_ASNP_CAUSE = "ScopeCause";
    private static final java.lang.String TAG = "ASNPCrashHandler";
    private boolean hasCallRegister;
    private final android.content.Context mContext;
    private java.lang.Thread.UncaughtExceptionHandler mDefaultHandler;
    private final xyz.adscope.common.v2.thread.pool.IBaseThreadPool mThreadPool;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class CrashWriteTask implements java.lang.Runnable {
        private final android.content.Context mContext;
        private final java.lang.Throwable mException;
        private final xyz.adscope.common.v2.crash.ScopeCrashHandler.HandleFinished mHandleCallback;

        private CrashWriteTask(android.content.Context r1, java.lang.Throwable r2, xyz.adscope.common.v2.crash.ScopeCrashHandler.HandleFinished r3) {
                r0 = this;
                r0.<init>()
                r0.mContext = r1
                r0.mException = r2
                r0.mHandleCallback = r3
                return
        }

        /* synthetic */ CrashWriteTask(android.content.Context r1, java.lang.Throwable r2, xyz.adscope.common.v2.crash.ScopeCrashHandler.HandleFinished r3, xyz.adscope.common.v2.crash.ScopeCrashHandler.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private java.lang.String dumpStackTrace(java.lang.Throwable r3) {
                r2 = this;
                java.io.StringWriter r0 = new java.io.StringWriter
                r0.<init>()
                java.io.PrintWriter r1 = new java.io.PrintWriter
                r1.<init>(r0)
                r3.getClass()
                java.lang.Throwable r3 = r3.getCause()
            L11:
                if (r3 == 0) goto L18
                java.lang.Throwable r3 = r3.getCause()
                goto L11
            L18:
                r1.close()
                java.lang.String r3 = r0.toString()
                return r3
        }

        private java.lang.String generateCrashFilePathFormat() {
                r4 = this;
                android.content.Context r0 = r4.mContext
                java.io.File r0 = xyz.adscope.common.v2.persistent.file.FileUtils.getAppRootDir(r0)
                java.lang.String r1 = ""
                if (r0 == 0) goto L41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = r0.getPath()
                r2.append(r0)
                java.lang.String r0 = "/AdScope/crash/log/"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.io.File r2 = new java.io.File
                r2.<init>(r0)
                boolean r3 = r2.exists()
                if (r3 != 0) goto L2f
                r2.mkdirs()     // Catch: java.lang.Exception -> L2e
                goto L2f
            L2e:
                return r1
            L2f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = "scope_crash_%d.trace"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L41:
                return r1
        }

        private boolean isCrashBySDK(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "xyz.adscope.ad"
                boolean r0 = r2.contains(r0)
                if (r0 != 0) goto L13
                java.lang.String r0 = "xyz.adscope.common"
                boolean r2 = r2.contains(r0)
                if (r2 == 0) goto L11
                goto L13
            L11:
                r2 = 0
                return r2
            L13:
                r2 = 1
                return r2
        }

        private void storeCrashFile(java.lang.String r1, long r2, java.lang.String r4) {
                r0 = this;
                xyz.adscope.common.v2.persistent.file.FileUtils.storeCrashFormatFile(r1, r2, r4)
                return
        }

        private void updateAsnpCauseCrashTag(java.lang.String r4) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L1a
                boolean r4 = r3.isCrashBySDK(r4)
                if (r4 == 0) goto L1a
                android.content.Context r4 = r3.mContext
                java.lang.String r0 = "v2"
                java.lang.String r0 = xyz.adscope.common.v2.crash.ScopeCrashHandler.access$400(r0)
                java.lang.String r1 = "ScopeCause"
                r2 = 1
                xyz.adscope.common.v2.persistent.sp.CommonSpHelper.putBoolean(r4, r0, r1, r2)
            L1a:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                java.lang.Throwable r0 = r7.mException
                java.lang.String r0 = r7.dumpStackTrace(r0)
                r7.updateAsnpCauseCrashTag(r0)
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.String r3 = r7.generateCrashFilePathFormat()
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.io.IOException -> L29
                if (r4 != 0) goto L2d
                java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.io.IOException -> L29
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.io.IOException -> L29
                r6 = 0
                r5[r6] = r4     // Catch: java.io.IOException -> L29
                java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch: java.io.IOException -> L29
                r7.storeCrashFile(r3, r1, r0)     // Catch: java.io.IOException -> L29
                goto L2d
            L29:
                r0 = move-exception
                xyz.adscope.common.v2.log.SDKLog.stack(r0)
            L2d:
                xyz.adscope.common.v2.crash.ScopeCrashHandler$HandleFinished r0 = r7.mHandleCallback
                xyz.adscope.common.v2.crash.ScopeCrashHandler.HandleFinished.access$300(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class HandleFinished {
        private final java.lang.Throwable mEx;
        private final java.lang.Thread mThread;

        private HandleFinished(java.lang.Thread r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.mThread = r1
                r0.mEx = r2
                return
        }

        /* synthetic */ HandleFinished(java.lang.Thread r1, java.lang.Throwable r2, xyz.adscope.common.v2.crash.ScopeCrashHandler.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ void access$300(xyz.adscope.common.v2.crash.ScopeCrashHandler.HandleFinished r0) {
                r0.handleFinish()
                return
        }

        private void handleFinish() {
                r2 = this;
                java.lang.Thread r0 = r2.mThread
                java.lang.Throwable r1 = r2.mEx
                r2.onFinished(r0, r1)
                return
        }

        abstract void onFinished(java.lang.Thread r1, java.lang.Throwable r2);
    }

    ScopeCrashHandler(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.hasCallRegister = r0
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r1.mContext = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            java.lang.Object r2 = r0.getOrCreateImplement(r2)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r2 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r2
            r1.mThreadPool = r2
            return
    }

    public static /* synthetic */ boolean a(java.io.File r1) {
            java.lang.String r1 = r1.getName()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L14
            java.lang.String r0 = ".trace"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    static /* synthetic */ java.lang.Thread.UncaughtExceptionHandler access$100(xyz.adscope.common.v2.crash.ScopeCrashHandler r0) {
            java.lang.Thread$UncaughtExceptionHandler r0 = r0.mDefaultHandler
            return r0
    }

    static /* synthetic */ java.lang.String access$400(java.lang.String r0) {
            java.lang.String r0 = getCrashSpFileName(r0)
            return r0
    }

    private void asyncWriteException(java.lang.Throwable r4, xyz.adscope.common.v2.crash.ScopeCrashHandler.HandleFinished r5) {
            r3 = this;
            xyz.adscope.common.v2.crash.ScopeCrashHandler$CrashWriteTask r0 = new xyz.adscope.common.v2.crash.ScopeCrashHandler$CrashWriteTask
            android.content.Context r1 = r3.mContext
            r2 = 0
            r0.<init>(r1, r4, r5, r2)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r4 = r3.mThreadPool
            if (r4 == 0) goto Lf
            r4.executeLocalAsyncTask(r0)
        Lf:
            return
    }

    public static /* synthetic */ void b(java.io.File r1) {
            r0 = 0
            xyz.adscope.common.v2.persistent.file.FileUtils.deleteDirWithIgnore(r1, r0)
            return
    }

    public static java.io.File getCrashFileDir(android.content.Context r2) {
            java.io.File r2 = xyz.adscope.common.v2.persistent.file.FileUtils.getAppRootDir(r2)
            if (r2 == 0) goto L2d
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = "/AdScope/crash/log/"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L2d
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L2d
            return r0
        L2d:
            r2 = 0
            return r2
    }

    private static java.lang.String getCrashSpFileName(java.lang.String r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "ScopeCrash_%s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    private void scopeHandleUncaughtException(java.lang.Throwable r3, xyz.adscope.common.v2.crash.ScopeCrashHandler.HandleFinished r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handle uncaught exception..."
            r0.append(r1)
            java.lang.String r1 = r3.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ASNPCrashHandler"
            xyz.adscope.common.v2.log.SDKLog.e(r1, r0)
            r2.asyncWriteException(r3, r4)
            return
    }

    @Override // xyz.adscope.common.v2.crash.IScopeCrashHandler
    public java.util.List<xyz.adscope.common.v2.crash.ScopeCrashLog> getUnReportCrash(android.content.Context r10, java.lang.String r11) {
            r9 = this;
            java.io.File r11 = getCrashFileDir(r10)
            r0 = 0
            if (r11 == 0) goto L5a
            boolean r1 = r11.exists()
            if (r1 == 0) goto L5a
            xyz.adscope.common.v2.crash.a r1 = new xyz.adscope.common.v2.crash.a
            r1.<init>()
            java.io.File[] r1 = r11.listFiles(r1)
            if (r1 == 0) goto L5a
            int r2 = r1.length
            if (r2 <= 0) goto L5a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
            r4 = 0
        L22:
            if (r4 >= r3) goto L45
            r5 = r1[r4]
            boolean r6 = r5.exists()
            if (r6 == 0) goto L42
            java.lang.String r6 = xyz.adscope.common.v2.persistent.file.FileUtils.readFileContent(r5)
            long r7 = r5.lastModified()
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L42
            xyz.adscope.common.v2.crash.ScopeCrashLog r5 = new xyz.adscope.common.v2.crash.ScopeCrashLog
            r5.<init>(r0, r6, r7)
            r2.add(r5)
        L42:
            int r4 = r4 + 1
            goto L22
        L45:
            xyz.adscope.common.v2.crash.b r0 = new xyz.adscope.common.v2.crash.b
            r0.<init>(r11)
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r11 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            java.lang.Object r10 = r11.getOrCreateImplement(r10)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r10 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r10
            if (r10 == 0) goto L59
            r10.executeLocalAsyncTask(r0)
        L59:
            return r2
        L5a:
            return r0
    }

    @Override // xyz.adscope.common.v2.crash.IScopeCrashHandler
    public boolean hasASNPCausedCrash(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r3 = getCrashSpFileName(r3)
            java.lang.String r0 = "ScopeCause"
            boolean r2 = xyz.adscope.common.v2.persistent.sp.CommonSpHelper.getBoolean(r2, r3, r0)
            return r2
    }

    @Override // xyz.adscope.common.v2.crash.IScopeCrashHandler
    public void registerCrashHandler(boolean r2) {
            r1 = this;
            boolean r0 = r1.hasCallRegister
            if (r0 == 0) goto L5
            goto L13
        L5:
            r0 = 1
            r1.hasCallRegister = r0
            if (r2 == 0) goto L13
            java.lang.Thread$UncaughtExceptionHandler r2 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r1.mDefaultHandler = r2
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
        L13:
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@androidx.annotation.NonNull java.lang.Thread r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r1 = this;
            xyz.adscope.common.v2.crash.ScopeCrashHandler$1 r0 = new xyz.adscope.common.v2.crash.ScopeCrashHandler$1
            r0.<init>(r1, r2, r3, r3)
            r1.scopeHandleUncaughtException(r3, r0)
            return
    }
}
