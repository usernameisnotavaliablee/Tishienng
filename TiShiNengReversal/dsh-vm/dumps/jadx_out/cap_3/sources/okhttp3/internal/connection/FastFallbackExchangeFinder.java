package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class FastFallbackExchangeFinder implements okhttp3.internal.connection.ExchangeFinder {
    private final long connectDelayNanos;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.BlockingQueue<okhttp3.internal.connection.RoutePlanner.ConnectResult> connectResults;
    private long nextTcpConnectAtNanos;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RoutePlanner routePlanner;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner.Plan> tcpConnectsInFlight;

    public FastFallbackExchangeFinder(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RoutePlanner r3, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r4) {
            r2 = this;
            java.lang.String r0 = "routePlanner"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.routePlanner = r3
            r2.taskRunner = r4
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 250(0xfa, double:1.235E-321)
            long r0 = r3.toNanos(r0)
            r2.connectDelayNanos = r0
            r0 = -9223372036854775808
            r2.nextTcpConnectAtNanos = r0
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.tcpConnectsInFlight = r3
            okhttp3.internal.concurrent.TaskRunner$Backend r3 = r4.getBackend()
            java.util.concurrent.LinkedBlockingDeque r4 = new java.util.concurrent.LinkedBlockingDeque
            r4.<init>()
            java.util.concurrent.BlockingQueue r3 = r3.decorate(r4)
            r2.connectResults = r3
            return
    }

    public static final /* synthetic */ java.util.concurrent.BlockingQueue access$getConnectResults$p(okhttp3.internal.connection.FastFallbackExchangeFinder r0) {
            java.util.concurrent.BlockingQueue<okhttp3.internal.connection.RoutePlanner$ConnectResult> r0 = r0.connectResults
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList access$getTcpConnectsInFlight$p(okhttp3.internal.connection.FastFallbackExchangeFinder r0) {
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r0 = r0.tcpConnectsInFlight
            return r0
    }

    private final okhttp3.internal.connection.RoutePlanner.ConnectResult awaitTcpConnect(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r0 = r2.tcpConnectsInFlight
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.concurrent.BlockingQueue<okhttp3.internal.connection.RoutePlanner$ConnectResult> r0 = r2.connectResults
            java.lang.Object r3 = r0.poll(r3, r5)
            okhttp3.internal.connection.RoutePlanner$ConnectResult r3 = (okhttp3.internal.connection.RoutePlanner.ConnectResult) r3
            if (r3 != 0) goto L15
            return r1
        L15:
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r4 = r2.tcpConnectsInFlight
            okhttp3.internal.connection.RoutePlanner$Plan r5 = r3.getPlan()
            r4.remove(r5)
            return r3
    }

    private final void cancelInFlightConnects() {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r0 = r3.tcpConnectsInFlight
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RoutePlanner$Plan r1 = (okhttp3.internal.connection.RoutePlanner.Plan) r1
            r1.mo5cancel()
            okhttp3.internal.connection.RoutePlanner$Plan r1 = r1.mo7retry()
            if (r1 != 0) goto L21
            goto Lb
        L21:
            okhttp3.internal.connection.RoutePlanner r2 = r3.getRoutePlanner()
            kotlin.collections.m r2 = r2.getDeferredPlans()
            r2.addLast(r1)
            goto Lb
        L2d:
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r0 = r3.tcpConnectsInFlight
            r0.clear()
            return
    }

    private final okhttp3.internal.connection.RoutePlanner.ConnectResult launchTcpConnect() {
            r11 = this;
            okhttp3.internal.connection.RoutePlanner r0 = r11.getRoutePlanner()
            r1 = 1
            r2 = 0
            boolean r0 = okhttp3.internal.connection.c.a(r0, r2, r1, r2)
            if (r0 == 0) goto L75
            okhttp3.internal.connection.RoutePlanner r0 = r11.getRoutePlanner()     // Catch: java.lang.Throwable -> L16
            okhttp3.internal.connection.RoutePlanner$Plan r0 = r0.plan()     // Catch: java.lang.Throwable -> L16
            r4 = r0
            goto L1d
        L16:
            r0 = move-exception
            okhttp3.internal.connection.FailedPlan r1 = new okhttp3.internal.connection.FailedPlan
            r1.<init>(r0)
            r4 = r1
        L1d:
            boolean r0 = r4.isReady()
            if (r0 == 0) goto L2d
            okhttp3.internal.connection.RoutePlanner$ConnectResult r3 = new okhttp3.internal.connection.RoutePlanner$ConnectResult
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L2d:
            boolean r0 = r4 instanceof okhttp3.internal.connection.FailedPlan
            if (r0 == 0) goto L38
            okhttp3.internal.connection.FailedPlan r4 = (okhttp3.internal.connection.FailedPlan) r4
            okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = r4.getResult()
            return r0
        L38:
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r0 = r11.tcpConnectsInFlight
            r0.add(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = okhttp3.internal._UtilJvmKt.okHttpName
            r0.append(r1)
            java.lang.String r1 = " connect "
            r0.append(r1)
            okhttp3.internal.connection.RoutePlanner r1 = r11.getRoutePlanner()
            okhttp3.Address r1 = r1.getAddress()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.redact()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            okhttp3.internal.concurrent.TaskRunner r1 = r11.taskRunner
            okhttp3.internal.concurrent.TaskQueue r5 = r1.newQueue()
            okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1 r6 = new okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
            r6.<init>(r0, r4, r11)
            r9 = 2
            r10 = 0
            r7 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r5, r6, r7, r9, r10)
        L75:
            return r2
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.connection.RealConnection find() {
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r2 = r9.tcpConnectsInFlight     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L20
            okhttp3.internal.connection.RoutePlanner r2 = r9.getRoutePlanner()     // Catch: java.lang.Throwable -> L1d
            r3 = 1
            boolean r2 = okhttp3.internal.connection.c.a(r2, r0, r3, r0)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L16
            goto L20
        L16:
            r9.cancelInFlightConnects()
            kotlin.jvm.internal.g0.m(r1)
            throw r1
        L1d:
            r0 = move-exception
            goto Lba
        L20:
            okhttp3.internal.connection.RoutePlanner r2 = r9.getRoutePlanner()     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r2.isCanceled()     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto Lb2
            okhttp3.internal.concurrent.TaskRunner r2 = r9.taskRunner     // Catch: java.lang.Throwable -> L1d
            okhttp3.internal.concurrent.TaskRunner$Backend r2 = r2.getBackend()     // Catch: java.lang.Throwable -> L1d
            long r2 = r2.nanoTime()     // Catch: java.lang.Throwable -> L1d
            long r4 = r9.nextTcpConnectAtNanos     // Catch: java.lang.Throwable -> L1d
            long r4 = r4 - r2
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r6 = r9.tcpConnectsInFlight     // Catch: java.lang.Throwable -> L1d
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r6 != 0) goto L49
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L46
            goto L49
        L46:
            r5 = r4
            r4 = r0
            goto L52
        L49:
            okhttp3.internal.connection.RoutePlanner$ConnectResult r4 = r9.launchTcpConnect()     // Catch: java.lang.Throwable -> L1d
            long r5 = r9.connectDelayNanos     // Catch: java.lang.Throwable -> L1d
            long r2 = r2 + r5
            r9.nextTcpConnectAtNanos = r2     // Catch: java.lang.Throwable -> L1d
        L52:
            if (r4 != 0) goto L5d
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1d
            okhttp3.internal.connection.RoutePlanner$ConnectResult r4 = r9.awaitTcpConnect(r5, r2)     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L5d
            goto L2
        L5d:
            boolean r2 = r4.isSuccess()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L8a
            r9.cancelInFlightConnects()     // Catch: java.lang.Throwable -> L1d
            okhttp3.internal.connection.RoutePlanner$Plan r2 = r4.getPlan()     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r2.isReady()     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L78
            okhttp3.internal.connection.RoutePlanner$Plan r2 = r4.getPlan()     // Catch: java.lang.Throwable -> L1d
            okhttp3.internal.connection.RoutePlanner$ConnectResult r4 = r2.mo14connectTlsEtc()     // Catch: java.lang.Throwable -> L1d
        L78:
            boolean r2 = r4.isSuccess()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L8a
            okhttp3.internal.connection.RoutePlanner$Plan r0 = r4.getPlan()     // Catch: java.lang.Throwable -> L1d
            okhttp3.internal.connection.RealConnection r0 = r0.mo6handleSuccess()     // Catch: java.lang.Throwable -> L1d
            r9.cancelInFlightConnects()
            return r0
        L8a:
            java.lang.Throwable r2 = r4.getThrowable()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L9f
            boolean r3 = r2 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L9e
            if (r1 != 0) goto L9a
            java.io.IOException r2 = (java.io.IOException) r2     // Catch: java.lang.Throwable -> L1d
            r1 = r2
            goto L9f
        L9a:
            kotlin.l.a(r1, r2)     // Catch: java.lang.Throwable -> L1d
            goto L9f
        L9e:
            throw r2     // Catch: java.lang.Throwable -> L1d
        L9f:
            okhttp3.internal.connection.RoutePlanner$Plan r2 = r4.getNextPlan()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L2
            okhttp3.internal.connection.RoutePlanner r3 = r9.getRoutePlanner()     // Catch: java.lang.Throwable -> L1d
            kotlin.collections.m r3 = r3.getDeferredPlans()     // Catch: java.lang.Throwable -> L1d
            r3.addFirst(r2)     // Catch: java.lang.Throwable -> L1d
            goto L2
        Lb2:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0     // Catch: java.lang.Throwable -> L1d
        Lba:
            r9.cancelInFlightConnects()
            throw r0
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.connection.RoutePlanner getRoutePlanner() {
            r1 = this;
            okhttp3.internal.connection.RoutePlanner r0 = r1.routePlanner
            return r0
    }
}
