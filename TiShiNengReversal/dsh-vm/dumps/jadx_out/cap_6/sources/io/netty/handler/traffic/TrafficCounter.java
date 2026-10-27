package io.netty.handler.traffic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TrafficCounter {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    final java.util.concurrent.atomic.AtomicLong checkInterval;
    private final java.util.concurrent.atomic.AtomicLong cumulativeReadBytes;
    private final java.util.concurrent.atomic.AtomicLong cumulativeWrittenBytes;
    private final java.util.concurrent.atomic.AtomicLong currentReadBytes;
    private final java.util.concurrent.atomic.AtomicLong currentWrittenBytes;
    final java.util.concurrent.ScheduledExecutorService executor;
    private long lastCumulativeTime;
    private volatile long lastReadBytes;
    private long lastReadThroughput;
    private volatile long lastReadingTime;
    final java.util.concurrent.atomic.AtomicLong lastTime;
    private long lastWriteThroughput;
    private volatile long lastWritingTime;
    private volatile long lastWrittenBytes;
    java.lang.Runnable monitor;
    volatile boolean monitorActive;
    final java.lang.String name;
    private long readingTime;
    private long realWriteThroughput;
    private final java.util.concurrent.atomic.AtomicLong realWrittenBytes;
    volatile java.util.concurrent.ScheduledFuture<?> scheduledFuture;
    final io.netty.handler.traffic.AbstractTrafficShapingHandler trafficShapingHandler;
    private long writingTime;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.traffic.TrafficCounter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class TrafficMonitoringTask implements java.lang.Runnable {
        final /* synthetic */ io.netty.handler.traffic.TrafficCounter this$0;

        private TrafficMonitoringTask(io.netty.handler.traffic.TrafficCounter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ TrafficMonitoringTask(io.netty.handler.traffic.TrafficCounter r1, io.netty.handler.traffic.TrafficCounter.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                io.netty.handler.traffic.TrafficCounter r0 = r3.this$0
                boolean r0 = r0.monitorActive
                if (r0 != 0) goto L7
                goto L19
            L7:
                io.netty.handler.traffic.TrafficCounter r0 = r3.this$0
                long r1 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
                r0.resetAccounting(r1)
                io.netty.handler.traffic.TrafficCounter r0 = r3.this$0
                io.netty.handler.traffic.AbstractTrafficShapingHandler r1 = r0.trafficShapingHandler
                if (r1 == 0) goto L19
                r1.doAccounting(r0)
            L19:
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.traffic.TrafficCounter> r0 = io.netty.handler.traffic.TrafficCounter.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.traffic.TrafficCounter.logger = r0
            return
    }

    public TrafficCounter(io.netty.handler.traffic.AbstractTrafficShapingHandler r4, java.util.concurrent.ScheduledExecutorService r5, java.lang.String r6, long r7) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.currentWrittenBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.currentReadBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.cumulativeWrittenBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.cumulativeReadBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.lastTime = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.realWrittenBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.<init>(r1)
            r3.checkInterval = r0
            if (r4 == 0) goto L4c
            if (r6 == 0) goto L44
            r3.trafficShapingHandler = r4
            r3.executor = r5
            r3.name = r6
            r3.init(r7)
            return
        L44:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "name"
            r4.<init>(r5)
            throw r4
        L4c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "trafficShapingHandler"
            r4.<init>(r5)
            throw r4
    }

    public TrafficCounter(java.util.concurrent.ScheduledExecutorService r4, java.lang.String r5, long r6) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.currentWrittenBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.currentReadBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.cumulativeWrittenBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.cumulativeReadBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.lastTime = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r3.realWrittenBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.<init>(r1)
            r3.checkInterval = r0
            if (r5 == 0) goto L43
            r0 = 0
            r3.trafficShapingHandler = r0
            r3.executor = r4
            r3.name = r5
            r3.init(r6)
            return
        L43:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "name"
            r4.<init>(r5)
            throw r4
    }

    private void init(long r3) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.lastCumulativeTime = r0
            long r0 = milliSecondFromNano()
            r2.writingTime = r0
            r2.readingTime = r0
            r2.lastWritingTime = r0
            long r0 = r2.writingTime
            r2.lastReadingTime = r0
            r2.configure(r3)
            return
    }

    public static long milliSecondFromNano() {
            long r0 = java.lang.System.nanoTime()
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            return r0
    }

    void bytesRealWriteFlowControl(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.realWrittenBytes
            r0.addAndGet(r2)
            return
    }

    void bytesRecvFlowControl(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.currentReadBytes
            r0.addAndGet(r2)
            java.util.concurrent.atomic.AtomicLong r0 = r1.cumulativeReadBytes
            r0.addAndGet(r2)
            return
    }

    void bytesWriteFlowControl(long r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.currentWrittenBytes
            r0.addAndGet(r2)
            java.util.concurrent.atomic.AtomicLong r0 = r1.cumulativeWrittenBytes
            r0.addAndGet(r2)
            return
    }

    public long checkInterval() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.checkInterval
            long r0 = r0.get()
            return r0
    }

    public void configure(long r4) {
            r3 = this;
            r0 = 10
            long r4 = r4 / r0
            long r4 = r4 * r0
            java.util.concurrent.atomic.AtomicLong r0 = r3.checkInterval
            long r0 = r0.getAndSet(r4)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L28
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L22
            r3.stop()
            java.util.concurrent.atomic.AtomicLong r4 = r3.lastTime
            long r0 = milliSecondFromNano()
            r4.set(r0)
            return
        L22:
            r3.stop()
            r3.start()
        L28:
            return
    }

    public long cumulativeReadBytes() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.cumulativeReadBytes
            long r0 = r0.get()
            return r0
    }

    public long cumulativeWrittenBytes() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.cumulativeWrittenBytes
            long r0 = r0.get()
            return r0
    }

    public long currentReadBytes() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.currentReadBytes
            long r0 = r0.get()
            return r0
    }

    public long currentWrittenBytes() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.currentWrittenBytes
            long r0 = r0.get()
            return r0
    }

    public long getRealWriteThroughput() {
            r2 = this;
            long r0 = r2.realWriteThroughput
            return r0
    }

    public java.util.concurrent.atomic.AtomicLong getRealWrittenBytes() {
            r1 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r1.realWrittenBytes
            return r0
    }

    public long lastCumulativeTime() {
            r2 = this;
            long r0 = r2.lastCumulativeTime
            return r0
    }

    public long lastReadBytes() {
            r2 = this;
            long r0 = r2.lastReadBytes
            return r0
    }

    public long lastReadThroughput() {
            r2 = this;
            long r0 = r2.lastReadThroughput
            return r0
    }

    public long lastTime() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.lastTime
            long r0 = r0.get()
            return r0
    }

    public long lastWriteThroughput() {
            r2 = this;
            long r0 = r2.lastWriteThroughput
            return r0
    }

    public long lastWrittenBytes() {
            r2 = this;
            long r0 = r2.lastWrittenBytes
            return r0
    }

    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @java.lang.Deprecated
    public long readTimeToWait(long r10, long r12, long r14) {
            r9 = this;
            long r7 = milliSecondFromNano()
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            long r10 = r0.readTimeToWait(r1, r3, r5, r7)
            return r10
    }

    public long readTimeToWait(long r23, long r25, long r27, long r29) {
            r22 = this;
            r0 = r22
            r1 = r29
            r22.bytesRecvFlowControl(r23)
            r3 = 0
            int r5 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r5 == 0) goto L11
            int r5 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r5 != 0) goto L15
        L11:
            r20 = r3
            goto Lf0
        L15:
            java.util.concurrent.atomic.AtomicLong r5 = r0.lastTime
            long r5 = r5.get()
            java.util.concurrent.atomic.AtomicLong r7 = r0.currentReadBytes
            long r7 = r7.get()
            long r9 = r0.readingTime
            long r11 = r0.lastReadBytes
            long r13 = r1 - r5
            r23 = r5
            long r5 = r0.lastReadingTime
            long r5 = r5 - r23
            long r5 = java.lang.Math.max(r5, r3)
            java.lang.String r15 = "Time: "
            r16 = 1000(0x3e8, double:4.94E-321)
            r18 = 10
            r20 = r3
            int r4 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r4 <= 0) goto L93
            long r16 = r16 * r7
            long r16 = r16 / r25
            long r16 = r16 - r13
            long r11 = r16 + r5
            int r4 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r4 <= 0) goto L8c
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.traffic.TrafficCounter.logger
            boolean r16 = r4.isDebugEnabled()
            if (r16 == 0) goto L77
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            r3.append(r11)
            r15 = 58
            r3.append(r15)
            r3.append(r7)
            r3.append(r15)
            r3.append(r13)
            r3.append(r15)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.debug(r3)
        L77:
            int r3 = (r11 > r27 ? 1 : (r11 == r27 ? 0 : -1))
            if (r3 <= 0) goto L84
            long r3 = r1 + r11
            long r3 = r3 - r9
            int r5 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r5 <= 0) goto L84
            r11 = r27
        L84:
            long r1 = r1 + r11
            long r1 = java.lang.Math.max(r9, r1)
            r0.readingTime = r1
            return r11
        L8c:
            long r1 = java.lang.Math.max(r9, r1)
            r0.readingTime = r1
            return r20
        L93:
            long r7 = r7 + r11
            java.util.concurrent.atomic.AtomicLong r3 = r0.checkInterval
            long r3 = r3.get()
            long r13 = r13 + r3
            long r16 = r16 * r7
            long r16 = r16 / r25
            long r16 = r16 - r13
            long r3 = r16 + r5
            int r11 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r11 <= 0) goto Lea
            io.netty.util.internal.logging.InternalLogger r11 = io.netty.handler.traffic.TrafficCounter.logger
            boolean r12 = r11.isDebugEnabled()
            if (r12 == 0) goto Ld5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r15)
            r12.append(r3)
            r15 = 58
            r12.append(r15)
            r12.append(r7)
            r12.append(r15)
            r12.append(r13)
            r12.append(r15)
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            r11.debug(r5)
        Ld5:
            int r5 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r5 <= 0) goto Le2
            long r5 = r1 + r3
            long r5 = r5 - r9
            int r7 = (r5 > r27 ? 1 : (r5 == r27 ? 0 : -1))
            if (r7 <= 0) goto Le2
            r3 = r27
        Le2:
            long r1 = r1 + r3
            long r1 = java.lang.Math.max(r9, r1)
            r0.readingTime = r1
            return r3
        Lea:
            long r1 = java.lang.Math.max(r9, r1)
            r0.readingTime = r1
        Lf0:
            return r20
    }

    synchronized void resetAccounting(long r7) {
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicLong r0 = r6.lastTime     // Catch: java.lang.Throwable -> L4d
            long r0 = r0.getAndSet(r7)     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 - r0
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            monitor-exit(r6)
            return
        L10:
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.traffic.TrafficCounter.logger     // Catch: java.lang.Throwable -> L4d
            boolean r3 = r2.isDebugEnabled()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4f
            long r3 = r6.checkInterval()     // Catch: java.lang.Throwable -> L4d
            r5 = 1
            long r3 = r3 << r5
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L4f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r3.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = "Acct schedule not ok: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4d
            r3.append(r7)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = " > 2*"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4d
            long r4 = r6.checkInterval()     // Catch: java.lang.Throwable -> L4d
            r3.append(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = " from "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r6.name     // Catch: java.lang.Throwable -> L4d
            r3.append(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4d
            r2.debug(r3)     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            r7 = move-exception
            goto L90
        L4f:
            java.util.concurrent.atomic.AtomicLong r2 = r6.currentReadBytes     // Catch: java.lang.Throwable -> L4d
            long r2 = r2.getAndSet(r0)     // Catch: java.lang.Throwable -> L4d
            r6.lastReadBytes = r2     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.atomic.AtomicLong r2 = r6.currentWrittenBytes     // Catch: java.lang.Throwable -> L4d
            long r2 = r2.getAndSet(r0)     // Catch: java.lang.Throwable -> L4d
            r6.lastWrittenBytes = r2     // Catch: java.lang.Throwable -> L4d
            long r2 = r6.lastReadBytes     // Catch: java.lang.Throwable -> L4d
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r2 = r2 / r7
            r6.lastReadThroughput = r2     // Catch: java.lang.Throwable -> L4d
            long r2 = r6.lastWrittenBytes     // Catch: java.lang.Throwable -> L4d
            long r2 = r2 * r4
            long r2 = r2 / r7
            r6.lastWriteThroughput = r2     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.atomic.AtomicLong r2 = r6.realWrittenBytes     // Catch: java.lang.Throwable -> L4d
            long r0 = r2.getAndSet(r0)     // Catch: java.lang.Throwable -> L4d
            long r0 = r0 * r4
            long r0 = r0 / r7
            r6.realWriteThroughput = r0     // Catch: java.lang.Throwable -> L4d
            long r7 = r6.lastWritingTime     // Catch: java.lang.Throwable -> L4d
            long r0 = r6.writingTime     // Catch: java.lang.Throwable -> L4d
            long r7 = java.lang.Math.max(r7, r0)     // Catch: java.lang.Throwable -> L4d
            r6.lastWritingTime = r7     // Catch: java.lang.Throwable -> L4d
            long r7 = r6.lastReadingTime     // Catch: java.lang.Throwable -> L4d
            long r0 = r6.readingTime     // Catch: java.lang.Throwable -> L4d
            long r7 = java.lang.Math.max(r7, r0)     // Catch: java.lang.Throwable -> L4d
            r6.lastReadingTime = r7     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r6)
            return
        L90:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4d
            throw r7
    }

    public void resetCumulativeTime() {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r3.lastCumulativeTime = r0
            java.util.concurrent.atomic.AtomicLong r0 = r3.cumulativeReadBytes
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicLong r0 = r3.cumulativeWrittenBytes
            r0.set(r1)
            return
    }

    public synchronized void start() {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.monitorActive     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L7
            monitor-exit(r8)
            return
        L7:
            java.util.concurrent.atomic.AtomicLong r0 = r8.lastTime     // Catch: java.lang.Throwable -> L38
            long r1 = milliSecondFromNano()     // Catch: java.lang.Throwable -> L38
            r0.set(r1)     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.atomic.AtomicLong r0 = r8.checkInterval     // Catch: java.lang.Throwable -> L38
            long r5 = r0.get()     // Catch: java.lang.Throwable -> L38
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3a
            java.util.concurrent.ScheduledExecutorService r0 = r8.executor     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            r0 = 1
            r8.monitorActive = r0     // Catch: java.lang.Throwable -> L38
            io.netty.handler.traffic.TrafficCounter$TrafficMonitoringTask r2 = new io.netty.handler.traffic.TrafficCounter$TrafficMonitoringTask     // Catch: java.lang.Throwable -> L38
            r0 = 0
            r2.<init>(r8, r0)     // Catch: java.lang.Throwable -> L38
            r8.monitor = r2     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.ScheduledExecutorService r1 = r8.executor     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L38
            r3 = 0
            java.util.concurrent.ScheduledFuture r0 = r1.scheduleAtFixedRate(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L38
            r8.scheduledFuture = r0     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r0 = move-exception
            goto L3c
        L3a:
            monitor-exit(r8)
            return
        L3c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    public synchronized void stop() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.monitorActive     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            r0 = 0
            r2.monitorActive = r0     // Catch: java.lang.Throwable -> L19
            long r0 = milliSecondFromNano()     // Catch: java.lang.Throwable -> L19
            r2.resetAccounting(r0)     // Catch: java.lang.Throwable -> L19
            io.netty.handler.traffic.AbstractTrafficShapingHandler r0 = r2.trafficShapingHandler     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            r0.doAccounting(r2)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r0 = move-exception
            goto L27
        L1b:
            java.util.concurrent.ScheduledFuture<?> r0 = r2.scheduledFuture     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L25
            java.util.concurrent.ScheduledFuture<?> r0 = r2.scheduledFuture     // Catch: java.lang.Throwable -> L19
            r1 = 1
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L19
        L25:
            monitor-exit(r2)
            return
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 165(0xa5, float:2.31E-43)
            r0.<init>(r1)
            java.lang.String r1 = "Monitor "
            r0.append(r1)
            java.lang.String r1 = r6.name
            r0.append(r1)
            java.lang.String r1 = " Current Speed Read: "
            r0.append(r1)
            long r1 = r6.lastReadThroughput
            r3 = 10
            long r1 = r1 >> r3
            r0.append(r1)
            java.lang.String r1 = " KB/s, "
            r0.append(r1)
            java.lang.String r2 = "Asked Write: "
            r0.append(r2)
            long r4 = r6.lastWriteThroughput
            long r4 = r4 >> r3
            r0.append(r4)
            r0.append(r1)
            java.lang.String r2 = "Real Write: "
            r0.append(r2)
            long r4 = r6.realWriteThroughput
            long r4 = r4 >> r3
            r0.append(r4)
            r0.append(r1)
            java.lang.String r1 = "Current Read: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicLong r1 = r6.currentReadBytes
            long r1 = r1.get()
            long r1 = r1 >> r3
            r0.append(r1)
            java.lang.String r1 = " KB, "
            r0.append(r1)
            java.lang.String r2 = "Current asked Write: "
            r0.append(r2)
            java.util.concurrent.atomic.AtomicLong r2 = r6.currentWrittenBytes
            long r4 = r2.get()
            long r4 = r4 >> r3
            r0.append(r4)
            r0.append(r1)
            java.lang.String r1 = "Current real Write: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicLong r1 = r6.realWrittenBytes
            long r1 = r1.get()
            long r1 = r1 >> r3
            r0.append(r1)
            java.lang.String r1 = " KB"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @java.lang.Deprecated
    public long writeTimeToWait(long r10, long r12, long r14) {
            r9 = this;
            long r7 = milliSecondFromNano()
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            long r10 = r0.writeTimeToWait(r1, r3, r5, r7)
            return r10
    }

    public long writeTimeToWait(long r23, long r25, long r27, long r29) {
            r22 = this;
            r0 = r22
            r1 = r29
            r22.bytesWriteFlowControl(r23)
            r3 = 0
            int r5 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r5 == 0) goto L11
            int r5 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r5 != 0) goto L15
        L11:
            r20 = r3
            goto Led
        L15:
            java.util.concurrent.atomic.AtomicLong r5 = r0.lastTime
            long r5 = r5.get()
            java.util.concurrent.atomic.AtomicLong r7 = r0.currentWrittenBytes
            long r7 = r7.get()
            long r9 = r0.lastWrittenBytes
            long r11 = r0.writingTime
            long r13 = r0.lastWritingTime
            long r13 = r13 - r5
            long r13 = java.lang.Math.max(r13, r3)
            long r5 = r1 - r5
            java.lang.String r15 = "Time: "
            r16 = 1000(0x3e8, double:4.94E-321)
            r18 = 10
            r20 = r3
            int r4 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r4 <= 0) goto L90
            long r16 = r16 * r7
            long r16 = r16 / r25
            long r16 = r16 - r5
            long r9 = r16 + r13
            int r4 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r4 <= 0) goto L89
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.handler.traffic.TrafficCounter.logger
            boolean r16 = r4.isDebugEnabled()
            if (r16 == 0) goto L74
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            r3.append(r9)
            r15 = 58
            r3.append(r15)
            r3.append(r7)
            r3.append(r15)
            r3.append(r5)
            r3.append(r15)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r4.debug(r3)
        L74:
            int r3 = (r9 > r27 ? 1 : (r9 == r27 ? 0 : -1))
            if (r3 <= 0) goto L81
            long r3 = r1 + r9
            long r3 = r3 - r11
            int r5 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r5 <= 0) goto L81
            r9 = r27
        L81:
            long r1 = r1 + r9
            long r1 = java.lang.Math.max(r11, r1)
            r0.writingTime = r1
            return r9
        L89:
            long r1 = java.lang.Math.max(r11, r1)
            r0.writingTime = r1
            return r20
        L90:
            long r7 = r7 + r9
            java.util.concurrent.atomic.AtomicLong r3 = r0.checkInterval
            long r3 = r3.get()
            long r5 = r5 + r3
            long r16 = r16 * r7
            long r16 = r16 / r25
            long r16 = r16 - r5
            long r3 = r16 + r13
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r9 <= 0) goto Le7
            io.netty.util.internal.logging.InternalLogger r9 = io.netty.handler.traffic.TrafficCounter.logger
            boolean r10 = r9.isDebugEnabled()
            if (r10 == 0) goto Ld2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            r10.append(r3)
            r15 = 58
            r10.append(r15)
            r10.append(r7)
            r10.append(r15)
            r10.append(r5)
            r10.append(r15)
            r10.append(r13)
            java.lang.String r5 = r10.toString()
            r9.debug(r5)
        Ld2:
            int r5 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r5 <= 0) goto Ldf
            long r5 = r1 + r3
            long r5 = r5 - r11
            int r7 = (r5 > r27 ? 1 : (r5 == r27 ? 0 : -1))
            if (r7 <= 0) goto Ldf
            r3 = r27
        Ldf:
            long r1 = r1 + r3
            long r1 = java.lang.Math.max(r11, r1)
            r0.writingTime = r1
            return r3
        Le7:
            long r1 = java.lang.Math.max(r11, r1)
            r0.writingTime = r1
        Led:
            return r20
    }
}
