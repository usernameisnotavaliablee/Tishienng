package com.bytedance.msdk.j.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m {
    private static final int ae = 0;
    private static boolean cw = false;
    private static final java.util.concurrent.ThreadPoolExecutor g = null;
    static final /* synthetic */ boolean j = true;
    private static android.os.Handler m;
    private static final java.util.concurrent.Executor oq = null;
    private static android.os.Handler r;
    private static final int tl = 0;
    private static android.os.HandlerThread up;
    private static final java.lang.Object xt = null;



    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.bytedance.msdk.j.up.m.xt = r0
            j()
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.bytedance.msdk.j.up.m.ae = r0
            r1 = 4
            int r0 = java.lang.Math.min(r0, r1)
            com.bytedance.msdk.j.up.m.tl = r0
            java.util.concurrent.ThreadPoolExecutor r0 = g()
            com.bytedance.msdk.j.up.m.g = r0
            java.util.concurrent.Executor r0 = oq()
            com.bytedance.msdk.j.up.m.oq = r0
            return
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.Executor ae() {
            java.util.concurrent.Executor r0 = com.bytedance.msdk.j.up.m.oq
            return r0
    }

    public static void cw(java.lang.Runnable r1) {
            boolean r0 = up()
            if (r0 == 0) goto La
            r1.run()
            return
        La:
            android.os.Handler r0 = r()
            r0.post(r1)
            return
    }

    public static boolean cw() {
            boolean r0 = tl()
            r1 = 0
            if (r0 == 0) goto L15
            android.os.HandlerThread r0 = com.bytedance.msdk.j.up.m.up
            android.os.Looper r0 = r0.getLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r0 != r2) goto L15
            r0 = 1
            return r0
        L15:
            return r1
    }

    private static java.util.concurrent.ThreadPoolExecutor g() {
            com.bytedance.sdk.component.oq.r.r r1 = new com.bytedance.sdk.component.oq.r.r
            int r2 = com.bytedance.msdk.j.up.m.tl
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r0 = 1024(0x400, float:1.435E-42)
            r7.<init>(r0)
            java.lang.String r0 = "gm_t_executor:"
            java.util.concurrent.ThreadFactory r8 = j(r0)
            com.bytedance.msdk.j.up.m$2 r9 = new com.bytedance.msdk.j.up.m$2
            r9.<init>()
            r4 = 30
            r3 = r2
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            r0 = 1
            r1.allowCoreThreadTimeOut(r0)     // Catch: java.lang.NoSuchMethodError -> L23 java.lang.Exception -> L28
            return r1
        L23:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            goto L30
        L28:
            r0 = move-exception
            java.lang.String r2 = "ThreadHelper"
            java.lang.String r3 = "stackerror:"
            com.bytedance.sdk.component.utils.vl.cw(r2, r3, r0)
        L30:
            return r1
    }

    public static java.util.concurrent.ExecutorService j(java.lang.String r9, int r10, java.util.concurrent.RejectedExecutionHandler r11) {
            com.bytedance.sdk.component.oq.r.r r0 = new com.bytedance.sdk.component.oq.r.r
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>(r10)
            java.lang.String r10 = "gm_t_single_"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r10.concat(r9)
            java.util.concurrent.ThreadFactory r7 = j(r9)
            r1 = 1
            r2 = 1
            r3 = 0
            r8 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static <T> java.util.concurrent.Future<T> j(java.util.concurrent.Callable<T> r2) {
            java.util.concurrent.ThreadPoolExecutor r0 = com.bytedance.msdk.j.up.m.g     // Catch: java.lang.Exception -> L7
            java.util.concurrent.Future r2 = r0.submit(r2)     // Catch: java.lang.Exception -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.String r0 = "ThreadHelper"
            java.lang.String r1 = "stackerror:"
            com.bytedance.sdk.component.utils.vl.cw(r0, r1, r2)
            r2 = 0
            return r2
    }

    public static <T> java.util.concurrent.FutureTask<T> j(java.util.concurrent.FutureTask<T> r1) {
            android.os.Handler r0 = r()
            r0.post(r1)
            return r1
    }

    public static java.util.concurrent.ThreadFactory j(java.lang.String r1) {
            com.bytedance.msdk.j.up.m$1 r0 = new com.bytedance.msdk.j.up.m$1
            r0.<init>(r1)
            return r0
    }

    public static void j() {
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "gm_t_main"
            r2 = -19
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1c
            com.bytedance.msdk.j.up.m.up = r0     // Catch: java.lang.Throwable -> L1c
            r0.start()     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L1c
            android.os.HandlerThread r1 = com.bytedance.msdk.j.up.m.up     // Catch: java.lang.Throwable -> L1c
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            com.bytedance.msdk.j.up.m.m = r0     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public static void j(java.lang.Runnable r1) {
            boolean r0 = tl()
            if (r0 == 0) goto L16
            boolean r0 = cw()
            if (r0 == 0) goto L10
            r1.run()
            return
        L10:
            android.os.Handler r0 = com.bytedance.msdk.j.up.m.m
            r0.post(r1)
            return
        L16:
            j()
            return
    }

    public static void j(java.lang.Runnable r1, long r2) {
            boolean r0 = tl()
            if (r0 == 0) goto Lc
            android.os.Handler r0 = com.bytedance.msdk.j.up.m.m
            r0.postDelayed(r1, r2)
            return
        Lc:
            j()
            return
    }

    private static boolean j(java.util.concurrent.Executor r1, java.lang.Runnable r2) {
            r1.execute(r2)     // Catch: java.lang.Exception -> L5
            r1 = 1
            return r1
        L5:
            r1 = move-exception
            java.lang.String r2 = "ThreadHelper"
            java.lang.String r0 = "stackerror:"
            com.bytedance.sdk.component.utils.vl.cw(r2, r0, r1)
            r1 = 0
            return r1
    }

    public static java.util.concurrent.Executor m() {
            java.util.concurrent.ThreadPoolExecutor r0 = com.bytedance.msdk.j.up.m.g
            return r0
    }

    private static java.util.concurrent.Executor oq() {
            com.bytedance.sdk.component.oq.r.r r0 = new com.bytedance.sdk.component.oq.r.r
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 256(0x100, float:3.59E-43)
            r6.<init>(r1)
            java.lang.String r1 = "gm_t_log_upload:"
            java.util.concurrent.ThreadFactory r7 = j(r1)
            java.util.concurrent.ThreadPoolExecutor$DiscardPolicy r8 = new java.util.concurrent.ThreadPoolExecutor$DiscardPolicy
            r8.<init>()
            r1 = 2
            r2 = 2
            r3 = 0
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static android.os.Handler r() {
            java.lang.Object r0 = com.bytedance.msdk.j.up.m.xt
            monitor-enter(r0)
            android.os.Handler r1 = com.bytedance.msdk.j.up.m.r     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L21
            boolean r1 = com.bytedance.msdk.j.up.m.cw     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.bytedance.msdk.j.up.m.r = r1     // Catch: java.lang.Throwable -> L17
            goto L21
        L17:
            r1 = move-exception
            goto L25
        L19:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "Did not yet override the UI thread"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L21:
            android.os.Handler r1 = com.bytedance.msdk.j.up.m.r     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public static void r(java.lang.Runnable r1) {
            java.util.concurrent.ThreadPoolExecutor r0 = com.bytedance.msdk.j.up.m.g
            j(r0, r1)
            return
    }

    private static boolean tl() {
            android.os.HandlerThread r0 = com.bytedance.msdk.j.up.m.up
            if (r0 == 0) goto L10
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L10
            android.os.Handler r0 = com.bytedance.msdk.j.up.m.m
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static boolean up() {
            android.os.Handler r0 = r()
            android.os.Looper r0 = r0.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static android.os.Looper xt() {
            boolean r0 = tl()
            if (r0 == 0) goto Ld
            android.os.HandlerThread r0 = com.bytedance.msdk.j.up.m.up
            android.os.Looper r0 = r0.getLooper()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static void xt(java.lang.Runnable r2) {
            boolean r0 = up()
            if (r0 == 0) goto La
            r2.run()
            return
        La:
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            r1 = 0
            r0.<init>(r2, r1)
            j(r0)
            r0.get()     // Catch: java.lang.Exception -> L17
            return
        L17:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Exception occured while waiting for runnable"
            r0.<init>(r1, r2)
            throw r0
    }

    public static void xt(java.lang.Runnable r1, long r2) {
            android.os.Handler r0 = r()
            r0.postDelayed(r1, r2)
            return
    }
}
