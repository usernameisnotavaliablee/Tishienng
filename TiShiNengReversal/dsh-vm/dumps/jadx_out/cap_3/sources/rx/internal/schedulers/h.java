package rx.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class h extends rx.h.a implements rx.m {
    private static final java.lang.String c = "rx.scheduler.jdk6.purge-frequency-millis";
    private static final java.lang.String d = "rx.scheduler.jdk6.purge-force";
    private static final java.lang.String e = "RxSchedulerPurge-";
    private static final boolean f = false;
    public static final int g = 0;
    private static final java.util.concurrent.ConcurrentHashMap<java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor> h = null;
    private static final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> i = null;
    private static volatile java.lang.Object j;
    private static final java.lang.Object k = null;
    private final java.util.concurrent.ScheduledExecutorService a;
    volatile boolean b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.lang.Runnable {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                rx.internal.schedulers.h.s()
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.schedulers.h.k = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            rx.internal.schedulers.h.h = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            rx.internal.schedulers.h.i = r0
            java.lang.String r0 = "rx.scheduler.jdk6.purge-frequency-millis"
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            rx.internal.schedulers.h.g = r0
            java.lang.String r0 = "rx.scheduler.jdk6.purge-force"
            boolean r0 = java.lang.Boolean.getBoolean(r0)
            int r1 = rx.internal.util.i.a()
            if (r0 != 0) goto L37
            if (r1 == 0) goto L35
            r0 = 21
            if (r1 < r0) goto L37
        L35:
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            rx.internal.schedulers.h.f = r0
            return
    }

    public h(java.util.concurrent.ThreadFactory r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r0, r2)
            boolean r0 = N(r2)
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof java.util.concurrent.ScheduledThreadPoolExecutor
            if (r0 == 0) goto L18
            r0 = r2
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = (java.util.concurrent.ScheduledThreadPoolExecutor) r0
            A(r0)
        L18:
            r1.a = r2
            return
    }

    public static void A(java.util.concurrent.ScheduledThreadPoolExecutor r10) {
        L0:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = rx.internal.schedulers.h.i
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto Lb
            goto L2c
        Lb:
            rx.internal.util.RxThreadFactory r1 = new rx.internal.util.RxThreadFactory
            java.lang.String r2 = "RxSchedulerPurge-"
            r1.<init>(r2)
            r2 = 1
            java.util.concurrent.ScheduledExecutorService r3 = java.util.concurrent.Executors.newScheduledThreadPool(r2, r1)
            r1 = 0
            boolean r0 = androidx.camera.view.p.a(r0, r1, r3)
            if (r0 == 0) goto L32
            rx.internal.schedulers.h$a r4 = new rx.internal.schedulers.h$a
            r4.<init>()
            int r0 = rx.internal.schedulers.h.g
            long r5 = (long) r0
            long r7 = (long) r0
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.scheduleAtFixedRate(r4, r5, r7, r9)
        L2c:
            java.util.concurrent.ConcurrentHashMap<java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor> r0 = rx.internal.schedulers.h.h
            r0.putIfAbsent(r10, r10)
            return
        L32:
            r3.shutdownNow()
            goto L0
    }

    public static boolean N(java.util.concurrent.ScheduledExecutorService r5) {
            boolean r0 = rx.internal.schedulers.h.f
            r1 = 0
            if (r0 == 0) goto L41
            boolean r0 = r5 instanceof java.util.concurrent.ScheduledThreadPoolExecutor
            if (r0 == 0) goto L1f
            java.lang.Object r0 = rx.internal.schedulers.h.j
            java.lang.Object r2 = rx.internal.schedulers.h.k
            if (r0 != r2) goto L10
            return r1
        L10:
            if (r0 != 0) goto L1c
            java.lang.reflect.Method r0 = j(r5)
            if (r0 == 0) goto L19
            r2 = r0
        L19:
            rx.internal.schedulers.h.j = r2
            goto L23
        L1c:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L23
        L1f:
            java.lang.reflect.Method r0 = j(r5)
        L23:
            if (r0 == 0) goto L41
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.IllegalArgumentException -> L30 java.lang.IllegalAccessException -> L32 java.lang.reflect.InvocationTargetException -> L34
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.IllegalArgumentException -> L30 java.lang.IllegalAccessException -> L32 java.lang.reflect.InvocationTargetException -> L34
            r3[r1] = r4     // Catch: java.lang.IllegalArgumentException -> L30 java.lang.IllegalAccessException -> L32 java.lang.reflect.InvocationTargetException -> L34
            r0.invoke(r5, r3)     // Catch: java.lang.IllegalArgumentException -> L30 java.lang.IllegalAccessException -> L32 java.lang.reflect.InvocationTargetException -> L34
            return r2
        L30:
            r5 = move-exception
            goto L36
        L32:
            r5 = move-exception
            goto L3a
        L34:
            r5 = move-exception
            goto L3e
        L36:
            rx.plugins.c.I(r5)
            goto L41
        L3a:
            rx.plugins.c.I(r5)
            goto L41
        L3e:
            rx.plugins.c.I(r5)
        L41:
            return r1
    }

    public static void g(java.util.concurrent.ScheduledExecutorService r1) {
            java.util.concurrent.ConcurrentHashMap<java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor> r0 = rx.internal.schedulers.h.h
            r0.remove(r1)
            return
    }

    static java.lang.reflect.Method j(java.util.concurrent.ScheduledExecutorService r7) {
            java.lang.Class r7 = r7.getClass()
            java.lang.reflect.Method[] r7 = r7.getMethods()
            int r0 = r7.length
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L2d
            r3 = r7[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "setRemoveOnCancelPolicy"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2a
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r5 = r4.length
            r6 = 1
            if (r5 != r6) goto L2a
            r4 = r4[r1]
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r4 != r5) goto L2a
            return r3
        L2a:
            int r2 = r2 + 1
            goto Lb
        L2d:
            r7 = 0
            return r7
    }

    static void s() {
            java.util.concurrent.ConcurrentHashMap<java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor> r0 = rx.internal.schedulers.h.h     // Catch: java.lang.Throwable -> L25
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L25
        La:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = (java.util.concurrent.ScheduledThreadPoolExecutor) r1     // Catch: java.lang.Throwable -> L25
            boolean r2 = r1.isShutdown()     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L20
            r1.purge()     // Catch: java.lang.Throwable -> L25
            goto La
        L20:
            r0.remove()     // Catch: java.lang.Throwable -> L25
            goto La
        L24:
            return
        L25:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            rx.plugins.c.I(r0)
            return
    }

    public rx.internal.schedulers.ScheduledAction B(rx.functions.a r4, long r5, java.util.concurrent.TimeUnit r7) {
            r3 = this;
            rx.functions.a r4 = rx.plugins.c.P(r4)
            rx.internal.schedulers.ScheduledAction r0 = new rx.internal.schedulers.ScheduledAction
            r0.<init>(r4)
            r1 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 > 0) goto L16
            java.util.concurrent.ScheduledExecutorService r4 = r3.a
            java.util.concurrent.Future r4 = r4.submit(r0)
            goto L1c
        L16:
            java.util.concurrent.ScheduledExecutorService r4 = r3.a
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r0, r5, r7)
        L1c:
            r0.add(r4)
            return r0
    }

    public rx.internal.schedulers.ScheduledAction G(rx.functions.a r4, long r5, java.util.concurrent.TimeUnit r7, rx.internal.util.m r8) {
            r3 = this;
            rx.functions.a r4 = rx.plugins.c.P(r4)
            rx.internal.schedulers.ScheduledAction r0 = new rx.internal.schedulers.ScheduledAction
            r0.<init>(r4, r8)
            r8.a(r0)
            r1 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 > 0) goto L19
            java.util.concurrent.ScheduledExecutorService r4 = r3.a
            java.util.concurrent.Future r4 = r4.submit(r0)
            goto L1f
        L19:
            java.util.concurrent.ScheduledExecutorService r4 = r3.a
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r0, r5, r7)
        L1f:
            r0.add(r4)
            return r0
    }

    public rx.internal.schedulers.ScheduledAction H(rx.functions.a r4, long r5, java.util.concurrent.TimeUnit r7, rx.subscriptions.b r8) {
            r3 = this;
            rx.functions.a r4 = rx.plugins.c.P(r4)
            rx.internal.schedulers.ScheduledAction r0 = new rx.internal.schedulers.ScheduledAction
            r0.<init>(r4, r8)
            r8.a(r0)
            r1 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 > 0) goto L19
            java.util.concurrent.ScheduledExecutorService r4 = r3.a
            java.util.concurrent.Future r4 = r4.submit(r0)
            goto L1f
        L19:
            java.util.concurrent.ScheduledExecutorService r4 = r3.a
            java.util.concurrent.ScheduledFuture r4 = r4.schedule(r0, r5, r7)
        L1f:
            r0.add(r4)
            return r0
    }

    public rx.m d(rx.functions.a r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            rx.m r4 = r3.e(r4, r0, r2)
            return r4
    }

    public rx.m e(rx.functions.a r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto L9
            rx.m r2 = rx.subscriptions.f.e()
            return r2
        L9:
            rx.internal.schedulers.ScheduledAction r2 = r1.B(r2, r3, r5)
            return r2
    }

    public boolean isUnsubscribed() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public void unsubscribe() {
            r1 = this;
            r0 = 1
            r1.b = r0
            java.util.concurrent.ScheduledExecutorService r0 = r1.a
            r0.shutdownNow()
            java.util.concurrent.ScheduledExecutorService r0 = r1.a
            g(r0)
            return
    }
}
