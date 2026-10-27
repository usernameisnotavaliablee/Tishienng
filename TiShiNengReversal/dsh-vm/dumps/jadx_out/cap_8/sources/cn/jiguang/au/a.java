package cn.jiguang.au;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements java.util.concurrent.RejectedExecutionHandler {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f665b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.concurrent.ThreadPoolExecutor f666c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> f667d;

    a(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f665b = r1
            if (r2 > 0) goto La
            r1 = 3
            r0.a = r1
        La:
            r0.a = r2
            return
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(java.lang.Runnable r9, java.util.concurrent.ThreadPoolExecutor r10) {
            r8 = this;
            java.lang.String r10 = "JRejectedExecutionHandler"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "poolName: "
            r0.append(r1)
            java.lang.String r1 = r8.f665b
            r0.append(r1)
            java.lang.String r1 = ", Exceeded ThreadPoolExecutor pool size"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r10, r0)
            java.util.concurrent.ThreadPoolExecutor r10 = r8.f666c
            if (r10 != 0) goto L61
            monitor-enter(r8)
            java.util.concurrent.ThreadPoolExecutor r10 = r8.f666c     // Catch: java.lang.Throwable -> L5a
            if (r10 != 0) goto L5d
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L5a
            r10.<init>()     // Catch: java.lang.Throwable -> L5a
            r8.f667d = r10     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L5a
            int r1 = r8.a     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r6 = r8.f667d     // Catch: java.lang.Throwable -> L5a
            cn.jiguang.au.c r7 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r10.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r8.f665b     // Catch: java.lang.Throwable -> L5a
            r10.append(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "_rjt"
            r10.append(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L5a
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5a
            r3 = 3
            r2 = r1
            r0.<init>(r1, r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L5a
            r8.f666c = r0     // Catch: java.lang.Throwable -> L5a
            r10 = 1
            r0.allowCoreThreadTimeOut(r10)     // Catch: java.lang.Throwable -> L5a
            goto L5d
        L5a:
            r0 = move-exception
            r9 = r0
            goto L5f
        L5d:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5a
            goto L61
        L5f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5a
            throw r9
        L61:
            java.util.concurrent.ThreadPoolExecutor r10 = r8.f666c
            r10.execute(r9)
            return
    }
}
