package io.netty.handler.traffic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class GlobalChannelTrafficShapingHandler extends io.netty.handler.traffic.AbstractTrafficShapingHandler {
    private static final float DEFAULT_ACCELERATION = -0.1f;
    private static final float DEFAULT_DEVIATION = 0.1f;
    private static final float DEFAULT_SLOWDOWN = 0.4f;
    private static final float MAX_DEVIATION = 0.4f;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private volatile float accelerationFactor;
    final java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel> channelQueues;
    private final java.util.concurrent.atomic.AtomicLong cumulativeReadBytes;
    private final java.util.concurrent.atomic.AtomicLong cumulativeWrittenBytes;
    private volatile float maxDeviation;
    volatile long maxGlobalWriteSize;
    private final java.util.concurrent.atomic.AtomicLong queuesSize;
    private volatile long readChannelLimit;
    private volatile boolean readDeviationActive;
    private volatile float slowDownFactor;
    private volatile long writeChannelLimit;
    private volatile boolean writeDeviationActive;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class PerChannel {
        io.netty.handler.traffic.TrafficCounter channelTrafficCounter;
        long lastReadTimestamp;
        long lastWriteTimestamp;
        java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.ToSend> messagesQueue;
        long queueSize;

        PerChannel() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ToSend {
        final io.netty.channel.ChannelPromise promise;
        final long relativeTimeAction;
        final long size;
        final java.lang.Object toSend;

        private ToSend(long r1, java.lang.Object r3, long r4, io.netty.channel.ChannelPromise r6) {
                r0 = this;
                r0.<init>()
                r0.relativeTimeAction = r1
                r0.toSend = r3
                r0.size = r4
                r0.promise = r6
                return
        }

        /* synthetic */ ToSend(long r1, java.lang.Object r3, long r4, io.netty.channel.ChannelPromise r6, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.AnonymousClass1 r7) {
                r0 = this;
                r0.<init>(r1, r3, r4, r6)
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler> r0 = io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.logger = r0
            return
    }

    public GlobalChannelTrafficShapingHandler(java.util.concurrent.ScheduledExecutorService r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r2.channelQueues = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r2.queuesSize = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r2.cumulativeWrittenBytes = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r2.cumulativeReadBytes = r0
            r0 = 419430400(0x19000000, double:2.072261515E-315)
            r2.maxGlobalWriteSize = r0
            r2.createGlobalTrafficCounter(r3)
            return
    }

    public GlobalChannelTrafficShapingHandler(java.util.concurrent.ScheduledExecutorService r1, long r2) {
            r0 = this;
            r0.<init>(r2)
            java.util.concurrent.ConcurrentMap r2 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r0.channelQueues = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            r0.queuesSize = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            r0.cumulativeWrittenBytes = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            r0.cumulativeReadBytes = r2
            r2 = 419430400(0x19000000, double:2.072261515E-315)
            r0.maxGlobalWriteSize = r2
            r0.createGlobalTrafficCounter(r1)
            return
    }

    public GlobalChannelTrafficShapingHandler(java.util.concurrent.ScheduledExecutorService r1, long r2, long r4, long r6, long r8) {
            r0 = this;
            r0.<init>(r2, r4)
            java.util.concurrent.ConcurrentMap r2 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r0.channelQueues = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            r0.queuesSize = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            r0.cumulativeWrittenBytes = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            r0.cumulativeReadBytes = r2
            r2 = 419430400(0x19000000, double:2.072261515E-315)
            r0.maxGlobalWriteSize = r2
            r0.writeChannelLimit = r6
            r0.readChannelLimit = r8
            r0.createGlobalTrafficCounter(r1)
            return
    }

    public GlobalChannelTrafficShapingHandler(java.util.concurrent.ScheduledExecutorService r8, long r9, long r11, long r13, long r15, long r17) {
            r7 = this;
            r0 = r7
            r1 = r9
            r3 = r11
            r5 = r17
            r0.<init>(r1, r3, r5)
            java.util.concurrent.ConcurrentMap r9 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r7.channelQueues = r9
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong
            r9.<init>()
            r7.queuesSize = r9
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong
            r9.<init>()
            r7.cumulativeWrittenBytes = r9
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong
            r9.<init>()
            r7.cumulativeReadBytes = r9
            r9 = 419430400(0x19000000, double:2.072261515E-315)
            r7.maxGlobalWriteSize = r9
            r7.writeChannelLimit = r13
            r9 = r15
            r7.readChannelLimit = r9
            r7.createGlobalTrafficCounter(r8)
            return
    }

    public GlobalChannelTrafficShapingHandler(java.util.concurrent.ScheduledExecutorService r10, long r11, long r13, long r15, long r17, long r19, long r21) {
            r9 = this;
            r0 = r9
            r1 = r11
            r3 = r13
            r5 = r19
            r7 = r21
            r0.<init>(r1, r3, r5, r7)
            java.util.concurrent.ConcurrentMap r11 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r9.channelQueues = r11
            java.util.concurrent.atomic.AtomicLong r11 = new java.util.concurrent.atomic.AtomicLong
            r11.<init>()
            r9.queuesSize = r11
            java.util.concurrent.atomic.AtomicLong r11 = new java.util.concurrent.atomic.AtomicLong
            r11.<init>()
            r9.cumulativeWrittenBytes = r11
            java.util.concurrent.atomic.AtomicLong r11 = new java.util.concurrent.atomic.AtomicLong
            r11.<init>()
            r9.cumulativeReadBytes = r11
            r11 = 419430400(0x19000000, double:2.072261515E-315)
            r9.maxGlobalWriteSize = r11
            r9.createGlobalTrafficCounter(r10)
            r10 = r15
            r9.writeChannelLimit = r10
            r10 = r17
            r9.readChannelLimit = r10
            return
    }

    static /* synthetic */ void access$100(io.netty.handler.traffic.GlobalChannelTrafficShapingHandler r0, io.netty.channel.ChannelHandlerContext r1, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel r2, long r3) {
            r0.sendAllValid(r1, r2, r3)
            return
    }

    private long computeBalancedWait(float r3, float r4, long r5) {
            r2 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L6
            goto L16
        L6:
            float r3 = r3 / r4
            float r4 = r2.maxDeviation
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L21
            r4 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2.maxDeviation
            float r4 = r4 - r0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L17
        L16:
            return r5
        L17:
            float r3 = r2.slowDownFactor
            r0 = 10
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 >= 0) goto L23
            r5 = r0
            goto L23
        L21:
            float r3 = r2.accelerationFactor
        L23:
            float r4 = (float) r5
            float r4 = r4 * r3
            long r3 = (long) r4
            return r3
    }

    private void computeDeviationCumulativeBytes() {
            r17 = this;
            r0 = r17
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r1 = r0.channelQueues
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r4
            r8 = r6
            r4 = r2
        L16:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L43
            java.lang.Object r10 = r1.next()
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r10 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r10
            io.netty.handler.traffic.TrafficCounter r11 = r10.channelTrafficCounter
            long r11 = r11.cumulativeWrittenBytes()
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 >= 0) goto L2d
            r2 = r11
        L2d:
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 <= 0) goto L32
            r6 = r11
        L32:
            io.netty.handler.traffic.TrafficCounter r10 = r10.channelTrafficCounter
            long r10 = r10.cumulativeReadBytes()
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 >= 0) goto L3d
            r4 = r10
        L3d:
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L16
            r8 = r10
            goto L16
        L43:
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r1 = r0.channelQueues
            int r1 = r1.size()
            r10 = 0
            r11 = 1
            if (r1 <= r11) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            r12 = 2
            if (r1 == 0) goto L5c
            long r14 = r4 / r12
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 >= 0) goto L5c
            r8 = 1
            goto L5d
        L5c:
            r8 = 0
        L5d:
            r0.readDeviationActive = r8
            if (r1 == 0) goto L68
            long r8 = r2 / r12
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L68
            r10 = 1
        L68:
            r0.writeDeviationActive = r10
            java.util.concurrent.atomic.AtomicLong r1 = r0.cumulativeWrittenBytes
            r1.set(r2)
            java.util.concurrent.atomic.AtomicLong r1 = r0.cumulativeReadBytes
            r1.set(r4)
            return
    }

    private io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel getOrSetPerChannel(io.netty.channel.ChannelHandlerContext r10) {
            r9 = this;
            io.netty.channel.Channel r0 = r10.channel()
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r1 = r9.channelQueues
            java.lang.Object r1 = r1.get(r0)
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r1 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r1
            if (r1 != 0) goto L58
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r1 = new io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel
            r1.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.messagesQueue = r2
            io.netty.handler.traffic.TrafficCounter r3 = new io.netty.handler.traffic.TrafficCounter
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "ChannelTC"
            r2.append(r4)
            io.netty.channel.Channel r10 = r10.channel()
            int r10 = r10.hashCode()
            r2.append(r10)
            java.lang.String r6 = r2.toString()
            long r7 = r9.checkInterval
            r5 = 0
            r4 = r9
            r3.<init>(r4, r5, r6, r7)
            r1.channelTrafficCounter = r3
            r2 = 0
            r1.queueSize = r2
            long r2 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r1.lastReadTimestamp = r2
            r1.lastWriteTimestamp = r2
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r10 = r4.channelQueues
            r10.put(r0, r1)
            return r1
        L58:
            r4 = r9
            return r1
    }

    private void sendAllValid(io.netty.channel.ChannelHandlerContext r6, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel r7, long r8) {
            r5 = this;
            monitor-enter(r7)
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend> r0 = r7.messagesQueue     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L3a
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend r0 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.ToSend) r0     // Catch: java.lang.Throwable -> L3a
        L9:
            if (r0 == 0) goto L41
            long r1 = r0.relativeTimeAction     // Catch: java.lang.Throwable -> L3a
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 > 0) goto L3c
            long r1 = r0.size     // Catch: java.lang.Throwable -> L3a
            io.netty.handler.traffic.TrafficCounter r3 = r5.trafficCounter     // Catch: java.lang.Throwable -> L3a
            r3.bytesRealWriteFlowControl(r1)     // Catch: java.lang.Throwable -> L3a
            io.netty.handler.traffic.TrafficCounter r3 = r7.channelTrafficCounter     // Catch: java.lang.Throwable -> L3a
            r3.bytesRealWriteFlowControl(r1)     // Catch: java.lang.Throwable -> L3a
            long r3 = r7.queueSize     // Catch: java.lang.Throwable -> L3a
            long r3 = r3 - r1
            r7.queueSize = r3     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.atomic.AtomicLong r3 = r5.queuesSize     // Catch: java.lang.Throwable -> L3a
            long r1 = -r1
            r3.addAndGet(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r0.toSend     // Catch: java.lang.Throwable -> L3a
            io.netty.channel.ChannelPromise r0 = r0.promise     // Catch: java.lang.Throwable -> L3a
            r6.write(r1, r0)     // Catch: java.lang.Throwable -> L3a
            r7.lastWriteTimestamp = r8     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend> r0 = r7.messagesQueue     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L3a
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend r0 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.ToSend) r0     // Catch: java.lang.Throwable -> L3a
            goto L9
        L3a:
            r6 = move-exception
            goto L51
        L3c:
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend> r8 = r7.messagesQueue     // Catch: java.lang.Throwable -> L3a
            r8.addFirst(r0)     // Catch: java.lang.Throwable -> L3a
        L41:
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend> r8 = r7.messagesQueue     // Catch: java.lang.Throwable -> L3a
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r8 == 0) goto L4c
            r5.releaseWriteSuspended(r6)     // Catch: java.lang.Throwable -> L3a
        L4c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3a
            r6.flush()
            return
        L51:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3a
            throw r6
    }

    public float accelerationFactor() {
            r1 = this;
            float r0 = r1.accelerationFactor
            return r0
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r17, java.lang.Object r18) throws java.lang.Exception {
            r16 = this;
            r0 = r16
            r6 = r18
            long r8 = r0.calculateSize(r6)
            long r14 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r1 = 0
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 <= 0) goto L11e
            io.netty.handler.traffic.TrafficCounter r7 = r0.trafficCounter
            long r10 = r0.getReadLimit()
            long r12 = r0.maxTime
            long r3 = r7.readTimeToWait(r8, r10, r12, r14)
            io.netty.channel.Channel r5 = r17.channel()
            int r5 = r5.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r7 = r0.channelQueues
            java.lang.Object r5 = r7.get(r5)
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r5 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r5
            if (r5 == 0) goto L61
            io.netty.handler.traffic.TrafficCounter r7 = r5.channelTrafficCounter
            long r10 = r0.readChannelLimit
            long r12 = r0.maxTime
            long r7 = r7.readTimeToWait(r8, r10, r12, r14)
            boolean r9 = r0.readDeviationActive
            if (r9 == 0) goto L60
            io.netty.handler.traffic.TrafficCounter r5 = r5.channelTrafficCounter
            long r9 = r5.cumulativeReadBytes()
            java.util.concurrent.atomic.AtomicLong r5 = r0.cumulativeReadBytes
            long r11 = r5.get()
            int r5 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r5 > 0) goto L53
            goto L54
        L53:
            r1 = r9
        L54:
            int r5 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r5 >= 0) goto L59
            r11 = r1
        L59:
            float r1 = (float) r1
            float r2 = (float) r11
            long r1 = r0.computeBalancedWait(r1, r2, r7)
            goto L61
        L60:
            r1 = r7
        L61:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L6a
            r2 = r3
            r1 = r17
            r4 = r14
            goto L6e
        L6a:
            r2 = r1
            r4 = r14
            r1 = r17
        L6e:
            long r2 = r0.checkWaitReadTime(r1, r2, r4)
            r14 = r4
            r4 = 10
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L120
            io.netty.channel.Channel r4 = r1.channel()
            io.netty.channel.ChannelConfig r5 = r4.config()
            io.netty.util.internal.logging.InternalLogger r7 = io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.logger
            boolean r8 = r7.isDebugEnabled()
            r9 = 58
            if (r8 == 0) goto Lb3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Read Suspend: "
            r8.append(r10)
            r8.append(r2)
            r8.append(r9)
            boolean r10 = r5.isAutoRead()
            r8.append(r10)
            r8.append(r9)
            boolean r10 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r1)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.debug(r8)
        Lb3:
            boolean r8 = r5.isAutoRead()
            if (r8 == 0) goto L120
            boolean r8 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r1)
            if (r8 == 0) goto L120
            r8 = 0
            r5.setAutoRead(r8)
            io.netty.util.AttributeKey<java.lang.Boolean> r8 = io.netty.handler.traffic.AbstractTrafficShapingHandler.READ_SUSPENDED
            io.netty.util.Attribute r8 = r4.attr(r8)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r8.set(r10)
            io.netty.util.AttributeKey<java.lang.Runnable> r8 = io.netty.handler.traffic.AbstractTrafficShapingHandler.REOPEN_TASK
            io.netty.util.Attribute r4 = r4.attr(r8)
            java.lang.Object r8 = r4.get()
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            if (r8 != 0) goto Le4
            io.netty.handler.traffic.AbstractTrafficShapingHandler$ReopenReadTimerTask r8 = new io.netty.handler.traffic.AbstractTrafficShapingHandler$ReopenReadTimerTask
            r8.<init>(r1)
            r4.set(r8)
        Le4:
            io.netty.util.concurrent.EventExecutor r4 = r1.executor()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.schedule(r8, r2, r10)
            boolean r4 = r7.isDebugEnabled()
            if (r4 == 0) goto L120
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Suspend final status => "
            r4.append(r8)
            boolean r5 = r5.isAutoRead()
            r4.append(r5)
            r4.append(r9)
            boolean r5 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r1)
            r4.append(r5)
            java.lang.String r5 = " will reopened at: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r7.debug(r2)
            goto L120
        L11e:
            r1 = r17
        L120:
            r0.informReadOperation(r1, r14)
            r17.fireChannelRead(r18)
            return
    }

    public java.util.Collection<io.netty.handler.traffic.TrafficCounter> channelTrafficCounters() {
            r1 = this;
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$1 r0 = new io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$1
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    protected long checkWaitReadTime(io.netty.channel.ChannelHandlerContext r4, long r5, long r7) {
            r3 = this;
            io.netty.channel.Channel r4 = r4.channel()
            int r4 = r4.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r0 = r3.channelQueues
            java.lang.Object r4 = r0.get(r4)
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r4 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r4
            if (r4 == 0) goto L29
            long r0 = r3.maxTime
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L29
            long r7 = r7 + r5
            long r0 = r4.lastReadTimestamp
            long r7 = r7 - r0
            long r0 = r3.maxTime
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 <= 0) goto L29
            long r4 = r3.maxTime
            return r4
        L29:
            return r5
    }

    public void configureChannel(long r1, long r3) {
            r0 = this;
            r0.writeChannelLimit = r1
            r0.readChannelLimit = r3
            long r1 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r3 = r0.channelQueues
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L24
            java.lang.Object r4 = r3.next()
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r4 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r4
            io.netty.handler.traffic.TrafficCounter r4 = r4.channelTrafficCounter
            r4.resetAccounting(r1)
            goto L12
        L24:
            return
    }

    void createGlobalTrafficCounter(java.util.concurrent.ScheduledExecutorService r10) {
            r9 = this;
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r1 = -1110651699(0xffffffffbdcccccd, float:-0.1)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r9.setMaxDeviation(r2, r0, r1)
            if (r10 == 0) goto L20
            io.netty.handler.traffic.GlobalChannelTrafficCounter r3 = new io.netty.handler.traffic.GlobalChannelTrafficCounter
            java.lang.String r6 = "GlobalChannelTC"
            long r7 = r9.checkInterval
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r6, r7)
            r9.setTrafficCounter(r3)
            r3.start()
            return
        L20:
            r4 = r9
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Executor must not be null"
            r10.<init>(r0)
            throw r10
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    protected void doAccounting(io.netty.handler.traffic.TrafficCounter r1) {
            r0 = this;
            r0.computeDeviationCumulativeBytes()
            super.doAccounting(r1)
            return
    }

    public long getMaxGlobalWriteSize() {
            r2 = this;
            long r0 = r2.maxGlobalWriteSize
            return r0
    }

    public long getReadChannelLimit() {
            r2 = this;
            long r0 = r2.readChannelLimit
            return r0
    }

    public long getWriteChannelLimit() {
            r2 = this;
            long r0 = r2.writeChannelLimit
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            r1.getOrSetPerChannel(r2)
            io.netty.handler.traffic.TrafficCounter r0 = r1.trafficCounter
            r0.resetCumulativeTime()
            super.handlerAdded(r2)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r8) throws java.lang.Exception {
            r7 = this;
            io.netty.handler.traffic.TrafficCounter r0 = r7.trafficCounter
            r0.resetCumulativeTime()
            io.netty.channel.Channel r0 = r8.channel()
            int r1 = r0.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r2 = r7.channelQueues
            java.lang.Object r1 = r2.remove(r1)
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r1 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r1
            if (r1 == 0) goto L88
            monitor-enter(r1)
            boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L59
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend> r0 = r1.messagesQueue     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L57
        L28:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L57
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend r2 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.ToSend) r2     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r2.toSend     // Catch: java.lang.Throwable -> L57
            long r3 = r7.calculateSize(r3)     // Catch: java.lang.Throwable -> L57
            io.netty.handler.traffic.TrafficCounter r5 = r7.trafficCounter     // Catch: java.lang.Throwable -> L57
            r5.bytesRealWriteFlowControl(r3)     // Catch: java.lang.Throwable -> L57
            io.netty.handler.traffic.TrafficCounter r5 = r1.channelTrafficCounter     // Catch: java.lang.Throwable -> L57
            r5.bytesRealWriteFlowControl(r3)     // Catch: java.lang.Throwable -> L57
            long r5 = r1.queueSize     // Catch: java.lang.Throwable -> L57
            long r5 = r5 - r3
            r1.queueSize = r5     // Catch: java.lang.Throwable -> L57
            java.util.concurrent.atomic.AtomicLong r5 = r7.queuesSize     // Catch: java.lang.Throwable -> L57
            long r3 = -r3
            r5.addAndGet(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r2.toSend     // Catch: java.lang.Throwable -> L57
            io.netty.channel.ChannelPromise r2 = r2.promise     // Catch: java.lang.Throwable -> L57
            r8.write(r3, r2)     // Catch: java.lang.Throwable -> L57
            goto L28
        L57:
            r8 = move-exception
            goto L86
        L59:
            java.util.concurrent.atomic.AtomicLong r0 = r7.queuesSize     // Catch: java.lang.Throwable -> L57
            long r2 = r1.queueSize     // Catch: java.lang.Throwable -> L57
            long r2 = -r2
            r0.addAndGet(r2)     // Catch: java.lang.Throwable -> L57
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend> r0 = r1.messagesQueue     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L57
        L67:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L57
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend r2 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.ToSend) r2     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r2.toSend     // Catch: java.lang.Throwable -> L57
            boolean r3 = r2 instanceof io.netty.buffer.ByteBuf     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L67
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2     // Catch: java.lang.Throwable -> L57
            r2.release()     // Catch: java.lang.Throwable -> L57
            goto L67
        L7f:
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend> r0 = r1.messagesQueue     // Catch: java.lang.Throwable -> L57
            r0.clear()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            goto L88
        L86:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r8
        L88:
            r7.releaseWriteSuspended(r8)
            r7.releaseReadSuspended(r8)
            super.handlerRemoved(r8)
            return
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    protected void informReadOperation(io.netty.channel.ChannelHandlerContext r2, long r3) {
            r1 = this;
            io.netty.channel.Channel r2 = r2.channel()
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r0 = r1.channelQueues
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r2 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r2
            if (r2 == 0) goto L18
            r2.lastReadTimestamp = r3
        L18:
            return
    }

    public float maxDeviation() {
            r1 = this;
            float r0 = r1.maxDeviation
            return r0
    }

    protected long maximumCumulativeReadBytes() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.cumulativeReadBytes
            long r0 = r0.get()
            return r0
    }

    protected long maximumCumulativeWrittenBytes() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.cumulativeWrittenBytes
            long r0 = r0.get()
            return r0
    }

    public long queuesSize() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r2.queuesSize
            long r0 = r0.get()
            return r0
    }

    public final void release() {
            r1 = this;
            io.netty.handler.traffic.TrafficCounter r0 = r1.trafficCounter
            r0.stop()
            return
    }

    public void setMaxDeviation(float r3, float r4, float r5) {
            r2 = this;
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L2b
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 < 0) goto L23
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L1b
            r2.maxDeviation = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r3
            r2.accelerationFactor = r5
            float r4 = r4 + r3
            r2.slowDownFactor = r4
            return
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "accelerationFactor must be <= 0"
            r3.<init>(r4)
            throw r3
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "slowDownFactor must be >= 0"
            r3.<init>(r4)
            throw r3
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "maxDeviation must be <= 0.4"
            r3.<init>(r4)
            throw r3
    }

    public void setMaxGlobalWriteSize(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L9
            r3.maxGlobalWriteSize = r4
            return
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "maxGlobalWriteSize must be positive"
            r4.<init>(r5)
            throw r4
    }

    public void setReadChannelLimit(long r3) {
            r2 = this;
            r2.readChannelLimit = r3
            long r3 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r0 = r2.channelQueues
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r1 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r1
            io.netty.handler.traffic.TrafficCounter r1 = r1.channelTrafficCounter
            r1.resetAccounting(r3)
            goto L10
        L22:
            return
    }

    public void setWriteChannelLimit(long r3) {
            r2 = this;
            r2.writeChannelLimit = r3
            long r3 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r0 = r2.channelQueues
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r1 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r1
            io.netty.handler.traffic.TrafficCounter r1 = r1.channelTrafficCounter
            r1.resetAccounting(r3)
            goto L10
        L22:
            return
    }

    public float slowDownFactor() {
            r1 = this;
            float r0 = r1.slowDownFactor
            return r0
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    protected void submitWrite(io.netty.channel.ChannelHandlerContext r15, java.lang.Object r16, long r17, long r19, long r21, io.netty.channel.ChannelPromise r23) {
            r14 = this;
            r5 = r17
            r1 = r21
            io.netty.channel.Channel r3 = r15.channel()
            int r3 = r3.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r4 = r14.channelQueues
            java.lang.Object r3 = r4.get(r3)
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r3 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r3
            if (r3 != 0) goto L1e
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r3 = r14.getOrSetPerChannel(r15)
        L1e:
            r9 = r3
            monitor-enter(r9)
            r3 = 0
            int r7 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r7 != 0) goto L47
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend> r3 = r9.messagesQueue     // Catch: java.lang.Throwable -> L43
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L47
            io.netty.handler.traffic.TrafficCounter r3 = r14.trafficCounter     // Catch: java.lang.Throwable -> L43
            r3.bytesRealWriteFlowControl(r5)     // Catch: java.lang.Throwable -> L43
            io.netty.handler.traffic.TrafficCounter r3 = r9.channelTrafficCounter     // Catch: java.lang.Throwable -> L43
            r3.bytesRealWriteFlowControl(r5)     // Catch: java.lang.Throwable -> L43
            r4 = r16
            r7 = r23
            r15.write(r4, r7)     // Catch: java.lang.Throwable -> L43
            r9.lastWriteTimestamp = r1     // Catch: java.lang.Throwable -> L43
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r0 = move-exception
            r3 = r9
            goto Lba
        L47:
            r4 = r16
            r7 = r23
            long r10 = r14.maxTime     // Catch: java.lang.Throwable -> L43
            int r3 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r3 <= 0) goto L5f
            long r10 = r1 + r19
            long r12 = r9.lastWriteTimestamp     // Catch: java.lang.Throwable -> L43
            long r10 = r10 - r12
            long r12 = r14.maxTime     // Catch: java.lang.Throwable -> L43
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 <= 0) goto L5f
            long r10 = r14.maxTime     // Catch: java.lang.Throwable -> L43
            goto L61
        L5f:
            r10 = r19
        L61:
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend r1 = new io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend     // Catch: java.lang.Throwable -> L43
            long r2 = r10 + r21
            r8 = 0
            r1.<init>(r2, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L43
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$ToSend> r2 = r9.messagesQueue     // Catch: java.lang.Throwable -> L43
            r2.addLast(r1)     // Catch: java.lang.Throwable -> L43
            long r2 = r9.queueSize     // Catch: java.lang.Throwable -> L43
            long r2 = r2 + r5
            r9.queueSize = r2     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.atomic.AtomicLong r2 = r14.queuesSize     // Catch: java.lang.Throwable -> L43
            r2.addAndGet(r5)     // Catch: java.lang.Throwable -> L43
            long r2 = r9.queueSize     // Catch: java.lang.Throwable -> L43
            r16 = r14
            r17 = r15
            r20 = r2
            r18 = r10
            r16.checkWriteSuspend(r17, r18, r20)     // Catch: java.lang.Throwable -> L43
            r10 = r18
            java.util.concurrent.atomic.AtomicLong r3 = r14.queuesSize     // Catch: java.lang.Throwable -> L43
            long r3 = r3.get()     // Catch: java.lang.Throwable -> L43
            long r5 = r14.maxGlobalWriteSize     // Catch: java.lang.Throwable -> L43
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L96
            r3 = 1
            goto L97
        L96:
            r3 = 0
        L97:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L9d
            r14.setUserDefinedWritability(r15, r7)
        L9d:
            long r3 = r1.relativeTimeAction
            io.netty.util.concurrent.EventExecutor r1 = r15.executor()
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$2 r5 = new io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$2
            r17 = r14
            r18 = r15
            r20 = r3
            r16 = r5
            r19 = r9
            r16.<init>(r17, r18, r19, r20)
            r0 = r16
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.schedule(r0, r10, r2)
            return
        Lba:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbc
            throw r0
        Lbc:
            r0 = move-exception
            goto Lba
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 340(0x154, float:4.76E-43)
            r0.<init>(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " Write Channel Limit: "
            r0.append(r1)
            long r1 = r3.writeChannelLimit
            r0.append(r1)
            java.lang.String r1 = " Read Channel Limit: "
            r0.append(r1)
            long r1 = r3.readChannelLimit
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    protected int userDefinedWritabilityIndex() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler, io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r19, java.lang.Object r20, io.netty.channel.ChannelPromise r21) throws java.lang.Exception {
            r18 = this;
            r0 = r18
            r2 = r20
            long r3 = r0.calculateSize(r2)
            long r7 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r12 = 0
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r4 = r3
            if (r1 <= 0) goto Lb9
            io.netty.handler.traffic.TrafficCounter r3 = r0.trafficCounter
            r10 = r7
            long r6 = r0.getWriteLimit()
            long r8 = r0.maxTime
            long r14 = r3.writeTimeToWait(r4, r6, r8, r10)
            io.netty.channel.Channel r1 = r19.channel()
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r3 = r0.channelQueues
            java.lang.Object r1 = r3.get(r1)
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r1 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r1
            if (r1 == 0) goto L66
            io.netty.handler.traffic.TrafficCounter r3 = r1.channelTrafficCounter
            long r6 = r0.writeChannelLimit
            long r8 = r0.maxTime
            long r6 = r3.writeTimeToWait(r4, r6, r8, r10)
            boolean r3 = r0.writeDeviationActive
            if (r3 == 0) goto L65
            io.netty.handler.traffic.TrafficCounter r1 = r1.channelTrafficCounter
            long r8 = r1.cumulativeWrittenBytes()
            java.util.concurrent.atomic.AtomicLong r1 = r0.cumulativeWrittenBytes
            long r16 = r1.get()
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r1 > 0) goto L55
            goto L56
        L55:
            r12 = r8
        L56:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 >= 0) goto L5c
            r8 = r12
            goto L5e
        L5c:
            r8 = r16
        L5e:
            float r1 = (float) r12
            float r3 = (float) r8
            long r12 = r0.computeBalancedWait(r1, r3, r6)
            goto L66
        L65:
            r12 = r6
        L66:
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r1 >= 0) goto L6b
            goto L6c
        L6b:
            r14 = r12
        L6c:
            r6 = 10
            int r1 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r1 < 0) goto Lb7
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.logger
            boolean r3 = r1.isDebugEnabled()
            if (r3 == 0) goto Lac
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Write suspend: "
            r3.append(r6)
            r3.append(r14)
            r6 = 58
            r3.append(r6)
            io.netty.channel.Channel r7 = r19.channel()
            io.netty.channel.ChannelConfig r7 = r7.config()
            boolean r7 = r7.isAutoRead()
            r3.append(r7)
            r3.append(r6)
            boolean r6 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r19)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r1.debug(r3)
        Lac:
            r1 = r19
            r9 = r21
            r3 = r4
            r7 = r10
            r5 = r14
            r0.submitWrite(r1, r2, r3, r5, r7, r9)
            return
        Lb7:
            r3 = r4
            goto Lbb
        Lb9:
            r10 = r7
            goto Lb7
        Lbb:
            r5 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r9 = r21
            r7 = r10
            r0.submitWrite(r1, r2, r3, r5, r7, r9)
            return
    }
}
