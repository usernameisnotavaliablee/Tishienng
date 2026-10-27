package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class g implements java.lang.Thread.UncaughtExceptionHandler {
    private final android.content.Context a;
    private java.lang.Thread.UncaughtExceptionHandler b;
    private final xyz.adscope.common.v2.thread.pool.IBaseThreadPool c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends xyz.adscope.ad.g.c {
        final /* synthetic */ java.lang.Throwable c;
        final /* synthetic */ xyz.adscope.ad.g d;

        a(xyz.adscope.ad.g r1, java.lang.Thread r2, java.lang.Throwable r3, java.lang.Throwable r4) {
                r0 = this;
                r0.d = r1
                r0.c = r4
                r1 = 0
                r0.<init>(r2, r3, r1)
                return
        }

        @Override // xyz.adscope.ad.g.c
        void a(java.lang.Thread r2, java.lang.Throwable r3) {
                r1 = this;
                xyz.adscope.ad.g r3 = r1.d
                java.lang.Thread$UncaughtExceptionHandler r3 = xyz.adscope.ad.g.a(r3)
                if (r3 == 0) goto L14
                xyz.adscope.ad.g r3 = r1.d
                java.lang.Thread$UncaughtExceptionHandler r3 = xyz.adscope.ad.g.a(r3)
                java.lang.Throwable r0 = r1.c
                r3.uncaughtException(r2, r0)
                return
            L14:
                int r2 = android.os.Process.myPid()
                android.os.Process.killProcess(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements java.lang.Runnable {
        private final java.lang.Throwable a;
        private final android.content.Context b;
        private final xyz.adscope.ad.g.c c;

        private b(android.content.Context r1, java.lang.Throwable r2, xyz.adscope.ad.g.c r3) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.a = r2
                r0.c = r3
                return
        }

        /* synthetic */ b(android.content.Context r1, java.lang.Throwable r2, xyz.adscope.ad.g.c r3, xyz.adscope.ad.g.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private java.lang.String a() {
                r4 = this;
                android.content.Context r0 = r4.b
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
                java.lang.String r0 = "asnp_crash_%d.trace"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L41:
                return r1
        }

        private java.lang.String a(java.lang.Throwable r3) {
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

        private void a(java.lang.String r1, long r2, java.lang.String r4) {
                r0 = this;
                xyz.adscope.common.v2.persistent.file.FileUtils.storeCrashFormatFile(r1, r2, r4)
                return
        }

        private boolean a(java.lang.String r2) {
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

        private void b(java.lang.String r4) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L1c
                boolean r4 = r3.a(r4)
                if (r4 == 0) goto L1c
                android.content.Context r4 = r3.b
                java.lang.String r0 = xyz.adscope.ad.f0.a()
                java.lang.String r0 = xyz.adscope.ad.g.a(r0)
                java.lang.String r1 = "asnpCause"
                r2 = 1
                xyz.adscope.ad.i0.a(r4, r0, r1, r2)
            L1c:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                java.lang.Throwable r0 = r7.a
                java.lang.String r0 = r7.a(r0)
                r7.b(r0)
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.String r3 = r7.a()
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.io.IOException -> L29
                if (r4 != 0) goto L2d
                java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.io.IOException -> L29
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.io.IOException -> L29
                r6 = 0
                r5[r6] = r4     // Catch: java.io.IOException -> L29
                java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch: java.io.IOException -> L29
                r7.a(r3, r1, r0)     // Catch: java.io.IOException -> L29
                goto L2d
            L29:
                r0 = move-exception
                xyz.adscope.common.v2.log.SDKLog.stack(r0)
            L2d:
                xyz.adscope.ad.g$c r0 = r7.c
                xyz.adscope.ad.g.c.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class c {
        private final java.lang.Thread a;
        private final java.lang.Throwable b;

        private c(java.lang.Thread r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        /* synthetic */ c(java.lang.Thread r1, java.lang.Throwable r2, xyz.adscope.ad.g.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private void a() {
                r2 = this;
                java.lang.Thread r0 = r2.a
                java.lang.Throwable r1 = r2.b
                r2.a(r0, r1)
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.g.c r0) {
                r0.a()
                return
        }

        abstract void a(java.lang.Thread r1, java.lang.Throwable r2);
    }

    public g(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r1.a = r0
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            java.lang.Object r2 = r0.getOrCreateImplement(r2)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r2 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r2
            r1.c = r2
            return
    }

    private static java.io.File a(android.content.Context r2) {
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

    static /* synthetic */ java.lang.String a(java.lang.String r0) {
            java.lang.String r0 = b(r0)
            return r0
    }

    static /* synthetic */ java.lang.Thread.UncaughtExceptionHandler a(xyz.adscope.ad.g r0) {
            java.lang.Thread$UncaughtExceptionHandler r0 = r0.b
            return r0
    }

    private void a(java.lang.Throwable r4, xyz.adscope.ad.g.c r5) {
            r3 = this;
            xyz.adscope.ad.g$b r0 = new xyz.adscope.ad.g$b
            android.content.Context r1 = r3.a
            r2 = 0
            r0.<init>(r1, r4, r5, r2)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r4 = r3.c
            if (r4 == 0) goto Lf
            r4.executeLocalAsyncTask(r0)
        Lf:
            return
    }

    private static /* synthetic */ boolean a(java.io.File r1) {
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

    private static java.lang.String b(java.lang.String r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "asnpCrash_%s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    public static java.util.List<xyz.adscope.ad.m1> b(android.content.Context r7) {
            java.io.File r0 = a(r7)
            if (r0 == 0) goto L55
            boolean r1 = r0.exists()
            if (r1 == 0) goto L55
            xyz.adscope.ad.i7 r1 = new xyz.adscope.ad.i7
            r1.<init>()
            java.io.File[] r1 = r0.listFiles(r1)
            if (r1 == 0) goto L55
            int r2 = r1.length
            if (r2 <= 0) goto L55
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
            r4 = 0
        L21:
            if (r4 >= r3) goto L40
            r5 = r1[r4]
            boolean r6 = r5.exists()
            if (r6 == 0) goto L3d
            java.lang.String r5 = xyz.adscope.common.v2.persistent.file.FileUtils.readFileContent(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L3d
            xyz.adscope.ad.m1 r6 = new xyz.adscope.ad.m1
            r6.<init>(r5)
            r2.add(r6)
        L3d:
            int r4 = r4 + 1
            goto L21
        L40:
            xyz.adscope.ad.j7 r1 = new xyz.adscope.ad.j7
            r1.<init>(r0)
            xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager r0 = xyz.adscope.common.v2.thread.pool.ScopeThreadPoolManager.getInstance()
            java.lang.Object r7 = r0.getOrCreateImplement(r7)
            xyz.adscope.common.v2.thread.pool.IBaseThreadPool r7 = (xyz.adscope.common.v2.thread.pool.IBaseThreadPool) r7
            if (r7 == 0) goto L54
            r7.executeLocalAsyncTask(r1)
        L54:
            return r2
        L55:
            r7 = 0
            return r7
    }

    private static /* synthetic */ void b(java.io.File r1) {
            r0 = 0
            xyz.adscope.common.v2.persistent.file.FileUtils.deleteDirWithIgnore(r1, r0)
            return
    }

    private void b(java.lang.Throwable r3, xyz.adscope.ad.g.c r4) {
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
            r2.a(r3, r4)
            return
    }

    public static boolean c(android.content.Context r2) {
            java.lang.String r0 = xyz.adscope.ad.f0.a()
            java.lang.String r0 = b(r0)
            java.lang.String r1 = "asnpCause"
            boolean r2 = xyz.adscope.ad.i0.b(r2, r0, r1)
            return r2
    }

    public static /* synthetic */ boolean c(java.io.File r0) {
            boolean r0 = a(r0)
            return r0
    }

    public static /* synthetic */ void d(java.io.File r0) {
            b(r0)
            return
    }

    public void a() {
            r1 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r1.b = r0
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@androidx.annotation.NonNull java.lang.Thread r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r1 = this;
            xyz.adscope.ad.g$a r0 = new xyz.adscope.ad.g$a
            r0.<init>(r1, r2, r3, r3)
            r1.b(r3, r0)
            return
    }
}
