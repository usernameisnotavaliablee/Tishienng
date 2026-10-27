package cn.jiguang.ab;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class p {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ThreadPoolExecutor f321b;

    /* renamed from: c, reason: collision with root package name */
    private final android.os.Handler f322c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f323d;

    /* renamed from: e, reason: collision with root package name */
    private final cn.jiguang.ab.a<java.lang.Object> f324e;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f325f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.Object f326g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.concurrent.CountDownLatch f327h;



    static class a extends android.os.Handler {
        private final java.util.concurrent.ExecutorService a;

        a(java.util.concurrent.ExecutorService r2) {
                r1 = this;
                android.os.Looper r0 = cn.jiguang.ab.p.c()
                r1.<init>(r0)
                r1.a = r2
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                java.lang.String r0 = "Step"
                java.util.concurrent.ExecutorService r1 = r3.a     // Catch: java.lang.Throwable -> L14
                boolean r1 = r1.isShutdown()     // Catch: java.lang.Throwable -> L14
                if (r1 != 0) goto L16
                java.util.concurrent.ExecutorService r1 = r3.a     // Catch: java.lang.Throwable -> L14
                java.lang.Object r4 = r4.obj     // Catch: java.lang.Throwable -> L14
                java.util.concurrent.Callable r4 = (java.util.concurrent.Callable) r4     // Catch: java.lang.Throwable -> L14
                r1.submit(r4)     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r4 = move-exception
                goto L1c
            L16:
                java.lang.String r4 = "executor is shutdown"
                cn.jiguang.w.f.i(r0, r4)     // Catch: java.lang.Throwable -> L14
                return
            L1c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "handleMessage e:"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                cn.jiguang.w.f.l(r0, r4)
                return
        }
    }

    public p(int r12, int r13, cn.jiguang.ab.a<java.lang.Object> r14, java.lang.String r15) {
            r11 = this;
            r11.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r11.f323d = r0
            r2 = 0
            r11.f325f = r2
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r1)
            r11.f327h = r0
            r11.a = r13
            r11.f324e = r14
            cn.jiguang.ab.p$1 r2 = new cn.jiguang.ab.p$1
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            cn.jiguang.au.c r10 = new cn.jiguang.au.c
            r10.<init>(r15)
            r6 = 0
            r5 = r12
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            r3.f321b = r2
            cn.jiguang.ab.p$a r12 = new cn.jiguang.ab.p$a
            r12.<init>(r2)
            r3.f322c = r12
            return
    }

    static /* synthetic */ android.os.Handler a(cn.jiguang.ab.p r0) {
            android.os.Handler r0 = r0.f322c
            return r0
    }

    private synchronized long b(long r4) {
            r3 = this;
            monitor-enter(r3)
            long r0 = r3.f325f     // Catch: java.lang.Throwable -> L12
            long r0 = r0 + r4
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L12
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L14
            r3.f325f = r4     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)
            r4 = -1
            return r4
        L12:
            r4 = move-exception
            goto L18
        L14:
            r3.f325f = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)
            return r0
        L18:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b(cn.jiguang.ab.p r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f323d
            return r0
    }

    static /* synthetic */ android.os.Looper c() {
            android.os.Looper r0 = d()
            return r0
    }

    static /* synthetic */ java.util.concurrent.CountDownLatch c(cn.jiguang.ab.p r0) {
            java.util.concurrent.CountDownLatch r0 = r0.f327h
            return r0
    }

    private static android.os.Looper d() {
            cn.jiguang.ab.p$2 r0 = new cn.jiguang.ab.p$2
            java.lang.String r1 = "jg_step_thread"
            r0.<init>(r1)
            r0.start()
            android.os.Looper r0 = r0.getLooper()
            if (r0 != 0) goto L14
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L14:
            return r0
    }

    public synchronized java.lang.Object a(long r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.a()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            java.lang.Object r4 = r3.f326g     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r3)
            return r4
        Lb:
            r4 = move-exception
            goto L43
        Ld:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f323d     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L18
            monitor-exit(r3)
            r4 = 0
            return r4
        L18:
            r0 = -1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L26
            java.util.concurrent.CountDownLatch r0 = r3.f327h     // Catch: java.lang.Throwable -> Lb java.lang.InterruptedException -> L2b
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lb java.lang.InterruptedException -> L2b
            r0.await(r4, r1)     // Catch: java.lang.Throwable -> Lb java.lang.InterruptedException -> L2b
            goto L2b
        L26:
            java.util.concurrent.CountDownLatch r4 = r3.f327h     // Catch: java.lang.Throwable -> Lb java.lang.InterruptedException -> L2b
            r4.await()     // Catch: java.lang.Throwable -> Lb java.lang.InterruptedException -> L2b
        L2b:
            java.util.concurrent.CountDownLatch r4 = r3.f327h     // Catch: java.lang.Throwable -> Lb
            long r4 = r4.getCount()     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L3f
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> Lb
            r5 = 1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb
            r3.f327h = r4     // Catch: java.lang.Throwable -> Lb
        L3f:
            java.lang.Object r4 = r3.f326g     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r3)
            return r4
        L43:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r4
    }

    public void a(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto L7
            goto L22
        L7:
            if (r2 == 0) goto L22
            r1.f326g = r2
            java.util.concurrent.CountDownLatch r0 = r1.f327h
            r0.countDown()
            cn.jiguang.ab.a<java.lang.Object> r0 = r1.f324e
            if (r0 == 0) goto L17
            r0.a(r2)
        L17:
            r2 = 1
            r1.a(r2)
            java.lang.String r2 = "Step"
            java.lang.String r0 = "done!"
            cn.jiguang.w.f.c(r2, r0)
        L22:
            return
    }

    public void a(java.util.concurrent.Callable<?> r6) {
            r5 = this;
            int r0 = r5.a     // Catch: java.lang.Throwable -> L28
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L28
            long r0 = r5.b(r0)     // Catch: java.lang.Throwable -> L28
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L13
            java.util.concurrent.ThreadPoolExecutor r0 = r5.f321b     // Catch: java.lang.Throwable -> L28
            r0.submit(r6)     // Catch: java.lang.Throwable -> L28
            goto L22
        L13:
            android.os.Message r2 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L28
            r3 = 233(0xe9, float:3.27E-43)
            r2.what = r3     // Catch: java.lang.Throwable -> L28
            r2.obj = r6     // Catch: java.lang.Throwable -> L28
            android.os.Handler r6 = r5.f322c     // Catch: java.lang.Throwable -> L28
            r6.sendMessageAtTime(r2, r0)     // Catch: java.lang.Throwable -> L28
        L22:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f323d     // Catch: java.lang.Throwable -> L28
            r0 = 0
            r6.set(r0)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    public void a(boolean r3) {
            r2 = this;
            android.os.Handler r0 = r2.f322c
            r1 = 233(0xe9, float:3.27E-43)
            r0.removeMessages(r1)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.f321b
            boolean r0 = r0.isShutdown()
            if (r0 != 0) goto L1c
            if (r3 == 0) goto L17
            java.util.concurrent.ThreadPoolExecutor r3 = r2.f321b
            r3.shutdownNow()
            goto L1c
        L17:
            java.util.concurrent.ThreadPoolExecutor r3 = r2.f321b
            r3.shutdown()
        L1c:
            android.os.Handler r3 = r2.f322c     // Catch: java.lang.Throwable -> L25
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> L25
            r3.quit()     // Catch: java.lang.Throwable -> L25
        L25:
            java.lang.String r3 = "Step"
            java.lang.String r0 = "StepParallelScheduler stop !"
            cn.jiguang.w.f.c(r3, r0)
            return
    }

    public boolean a() {
            r1 = this;
            java.lang.Object r0 = r1.f326g
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void b() {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r2.f321b     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.util.concurrent.BlockingQueue r0 = r0.getQueue()     // Catch: java.lang.Throwable -> L13
            r0.clear()     // Catch: java.lang.Throwable -> L13
            android.os.Handler r0 = r2.f322c     // Catch: java.lang.Throwable -> L13
            r1 = 233(0xe9, float:3.27E-43)
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            goto L16
        L15:
            return
        L16:
            r0.toString()
            return
    }
}
