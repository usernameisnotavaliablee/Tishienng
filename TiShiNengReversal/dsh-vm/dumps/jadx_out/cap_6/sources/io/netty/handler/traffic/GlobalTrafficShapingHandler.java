package io.netty.handler.traffic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class GlobalTrafficShapingHandler extends io.netty.handler.traffic.AbstractTrafficShapingHandler {
    private final java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalTrafficShapingHandler.PerChannel> channelQueues;
    long maxGlobalWriteSize;
    private final java.util.concurrent.atomic.AtomicLong queuesSize;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PerChannel {
        long lastReadTimestamp;
        long lastWriteTimestamp;
        java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler.ToSend> messagesQueue;
        long queueSize;

        private PerChannel() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ PerChannel(io.netty.handler.traffic.GlobalTrafficShapingHandler.AnonymousClass1 r1) {
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

        /* synthetic */ ToSend(long r1, java.lang.Object r3, long r4, io.netty.channel.ChannelPromise r6, io.netty.handler.traffic.GlobalTrafficShapingHandler.AnonymousClass1 r7) {
                r0 = this;
                r0.<init>(r1, r3, r4, r6)
                return
        }
    }

    public GlobalTrafficShapingHandler(io.netty.util.concurrent.EventExecutor r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r2.channelQueues = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r2.queuesSize = r0
            r0 = 419430400(0x19000000, double:2.072261515E-315)
            r2.maxGlobalWriteSize = r0
            r2.createGlobalTrafficCounter(r3)
            return
    }

    public GlobalTrafficShapingHandler(java.util.concurrent.ScheduledExecutorService r1, long r2) {
            r0 = this;
            r0.<init>(r2)
            java.util.concurrent.ConcurrentMap r2 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r0.channelQueues = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            r0.queuesSize = r2
            r2 = 419430400(0x19000000, double:2.072261515E-315)
            r0.maxGlobalWriteSize = r2
            r0.createGlobalTrafficCounter(r1)
            return
    }

    public GlobalTrafficShapingHandler(java.util.concurrent.ScheduledExecutorService r1, long r2, long r4) {
            r0 = this;
            r0.<init>(r2, r4)
            java.util.concurrent.ConcurrentMap r2 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r0.channelQueues = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>()
            r0.queuesSize = r2
            r2 = 419430400(0x19000000, double:2.072261515E-315)
            r0.maxGlobalWriteSize = r2
            r0.createGlobalTrafficCounter(r1)
            return
    }

    public GlobalTrafficShapingHandler(java.util.concurrent.ScheduledExecutorService r8, long r9, long r11, long r13) {
            r7 = this;
            r0 = r7
            r1 = r9
            r3 = r11
            r5 = r13
            r0.<init>(r1, r3, r5)
            java.util.concurrent.ConcurrentMap r9 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r0.channelQueues = r9
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong
            r9.<init>()
            r0.queuesSize = r9
            r9 = 419430400(0x19000000, double:2.072261515E-315)
            r0.maxGlobalWriteSize = r9
            r7.createGlobalTrafficCounter(r8)
            return
    }

    public GlobalTrafficShapingHandler(java.util.concurrent.ScheduledExecutorService r10, long r11, long r13, long r15, long r17) {
            r9 = this;
            r0 = r9
            r1 = r11
            r3 = r13
            r5 = r15
            r7 = r17
            r0.<init>(r1, r3, r5, r7)
            java.util.concurrent.ConcurrentMap r11 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r9.channelQueues = r11
            java.util.concurrent.atomic.AtomicLong r11 = new java.util.concurrent.atomic.AtomicLong
            r11.<init>()
            r9.queuesSize = r11
            r11 = 419430400(0x19000000, double:2.072261515E-315)
            r9.maxGlobalWriteSize = r11
            r9.createGlobalTrafficCounter(r10)
            return
    }

    static /* synthetic */ void access$200(io.netty.handler.traffic.GlobalTrafficShapingHandler r0, io.netty.channel.ChannelHandlerContext r1, io.netty.handler.traffic.GlobalTrafficShapingHandler.PerChannel r2, long r3) {
            r0.sendAllValid(r1, r2, r3)
            return
    }

    private io.netty.handler.traffic.GlobalTrafficShapingHandler.PerChannel getOrSetPerChannel(io.netty.channel.ChannelHandlerContext r4) {
            r3 = this;
            io.netty.channel.Channel r4 = r4.channel()
            int r4 = r4.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel> r0 = r3.channelQueues
            java.lang.Object r0 = r0.get(r4)
            io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel r0 = (io.netty.handler.traffic.GlobalTrafficShapingHandler.PerChannel) r0
            if (r0 != 0) goto L34
            io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel r0 = new io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel
            r1 = 0
            r0.<init>(r1)
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.messagesQueue = r1
            r1 = 0
            r0.queueSize = r1
            long r1 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r0.lastReadTimestamp = r1
            r0.lastWriteTimestamp = r1
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel> r1 = r3.channelQueues
            r1.put(r4, r0)
        L34:
            return r0
    }

    private void sendAllValid(io.netty.channel.ChannelHandlerContext r6, io.netty.handler.traffic.GlobalTrafficShapingHandler.PerChannel r7, long r8) {
            r5 = this;
            monitor-enter(r7)
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend> r0 = r7.messagesQueue     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L35
            io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend r0 = (io.netty.handler.traffic.GlobalTrafficShapingHandler.ToSend) r0     // Catch: java.lang.Throwable -> L35
        L9:
            if (r0 == 0) goto L3c
            long r1 = r0.relativeTimeAction     // Catch: java.lang.Throwable -> L35
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 > 0) goto L37
            long r1 = r0.size     // Catch: java.lang.Throwable -> L35
            io.netty.handler.traffic.TrafficCounter r3 = r5.trafficCounter     // Catch: java.lang.Throwable -> L35
            r3.bytesRealWriteFlowControl(r1)     // Catch: java.lang.Throwable -> L35
            long r3 = r7.queueSize     // Catch: java.lang.Throwable -> L35
            long r3 = r3 - r1
            r7.queueSize = r3     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.atomic.AtomicLong r3 = r5.queuesSize     // Catch: java.lang.Throwable -> L35
            long r1 = -r1
            r3.addAndGet(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r0.toSend     // Catch: java.lang.Throwable -> L35
            io.netty.channel.ChannelPromise r0 = r0.promise     // Catch: java.lang.Throwable -> L35
            r6.write(r1, r0)     // Catch: java.lang.Throwable -> L35
            r7.lastWriteTimestamp = r8     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend> r0 = r7.messagesQueue     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L35
            io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend r0 = (io.netty.handler.traffic.GlobalTrafficShapingHandler.ToSend) r0     // Catch: java.lang.Throwable -> L35
            goto L9
        L35:
            r6 = move-exception
            goto L4c
        L37:
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend> r8 = r7.messagesQueue     // Catch: java.lang.Throwable -> L35
            r8.addFirst(r0)     // Catch: java.lang.Throwable -> L35
        L3c:
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend> r8 = r7.messagesQueue     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L47
            r5.releaseWriteSuspended(r6)     // Catch: java.lang.Throwable -> L35
        L47:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L35
            r6.flush()
            return
        L4c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L35
            throw r6
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    long checkWaitReadTime(io.netty.channel.ChannelHandlerContext r4, long r5, long r7) {
            r3 = this;
            io.netty.channel.Channel r4 = r4.channel()
            int r4 = r4.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel> r0 = r3.channelQueues
            java.lang.Object r4 = r0.get(r4)
            io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel r4 = (io.netty.handler.traffic.GlobalTrafficShapingHandler.PerChannel) r4
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

    void createGlobalTrafficCounter(java.util.concurrent.ScheduledExecutorService r7) {
            r6 = this;
            if (r7 == 0) goto L14
            io.netty.handler.traffic.TrafficCounter r0 = new io.netty.handler.traffic.TrafficCounter
            java.lang.String r3 = "GlobalTC"
            long r4 = r6.checkInterval
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4)
            r6.setTrafficCounter(r0)
            r0.start()
            return
        L14:
            r1 = r6
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "executor"
            r7.<init>(r0)
            throw r7
    }

    public long getMaxGlobalWriteSize() {
            r2 = this;
            long r0 = r2.maxGlobalWriteSize
            return r0
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.getOrSetPerChannel(r1)
            super.handlerAdded(r1)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r8) throws java.lang.Exception {
            r7 = this;
            io.netty.channel.Channel r0 = r8.channel()
            int r1 = r0.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel> r2 = r7.channelQueues
            java.lang.Object r1 = r2.remove(r1)
            io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel r1 = (io.netty.handler.traffic.GlobalTrafficShapingHandler.PerChannel) r1
            if (r1 == 0) goto L7e
            monitor-enter(r1)
            boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4f
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend> r0 = r1.messagesQueue     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L23:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L75
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L4d
            io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend r2 = (io.netty.handler.traffic.GlobalTrafficShapingHandler.ToSend) r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r3 = r2.toSend     // Catch: java.lang.Throwable -> L4d
            long r3 = r7.calculateSize(r3)     // Catch: java.lang.Throwable -> L4d
            io.netty.handler.traffic.TrafficCounter r5 = r7.trafficCounter     // Catch: java.lang.Throwable -> L4d
            r5.bytesRealWriteFlowControl(r3)     // Catch: java.lang.Throwable -> L4d
            long r5 = r1.queueSize     // Catch: java.lang.Throwable -> L4d
            long r5 = r5 - r3
            r1.queueSize = r5     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.atomic.AtomicLong r5 = r7.queuesSize     // Catch: java.lang.Throwable -> L4d
            long r3 = -r3
            r5.addAndGet(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r3 = r2.toSend     // Catch: java.lang.Throwable -> L4d
            io.netty.channel.ChannelPromise r2 = r2.promise     // Catch: java.lang.Throwable -> L4d
            r8.write(r3, r2)     // Catch: java.lang.Throwable -> L4d
            goto L23
        L4d:
            r8 = move-exception
            goto L7c
        L4f:
            java.util.concurrent.atomic.AtomicLong r0 = r7.queuesSize     // Catch: java.lang.Throwable -> L4d
            long r2 = r1.queueSize     // Catch: java.lang.Throwable -> L4d
            long r2 = -r2
            r0.addAndGet(r2)     // Catch: java.lang.Throwable -> L4d
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend> r0 = r1.messagesQueue     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L5d:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L75
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L4d
            io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend r2 = (io.netty.handler.traffic.GlobalTrafficShapingHandler.ToSend) r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r2.toSend     // Catch: java.lang.Throwable -> L4d
            boolean r3 = r2 instanceof io.netty.buffer.ByteBuf     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L5d
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2     // Catch: java.lang.Throwable -> L4d
            r2.release()     // Catch: java.lang.Throwable -> L4d
            goto L5d
        L75:
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend> r0 = r1.messagesQueue     // Catch: java.lang.Throwable -> L4d
            r0.clear()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            goto L7e
        L7c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            throw r8
        L7e:
            r7.releaseWriteSuspended(r8)
            r7.releaseReadSuspended(r8)
            super.handlerRemoved(r8)
            return
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    void informReadOperation(io.netty.channel.ChannelHandlerContext r2, long r3) {
            r1 = this;
            io.netty.channel.Channel r2 = r2.channel()
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel> r0 = r1.channelQueues
            java.lang.Object r2 = r0.get(r2)
            io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel r2 = (io.netty.handler.traffic.GlobalTrafficShapingHandler.PerChannel) r2
            if (r2 == 0) goto L18
            r2.lastReadTimestamp = r3
        L18:
            return
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

    public void setMaxGlobalWriteSize(long r1) {
            r0 = this;
            r0.maxGlobalWriteSize = r1
            return
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    void submitWrite(io.netty.channel.ChannelHandlerContext r15, java.lang.Object r16, long r17, long r19, long r21, io.netty.channel.ChannelPromise r23) {
            r14 = this;
            r5 = r17
            r1 = r21
            io.netty.channel.Channel r3 = r15.channel()
            int r3 = r3.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel> r4 = r14.channelQueues
            java.lang.Object r3 = r4.get(r3)
            io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel r3 = (io.netty.handler.traffic.GlobalTrafficShapingHandler.PerChannel) r3
            if (r3 != 0) goto L1e
            io.netty.handler.traffic.GlobalTrafficShapingHandler$PerChannel r3 = r14.getOrSetPerChannel(r15)
        L1e:
            r9 = r3
            monitor-enter(r9)
            r3 = 0
            int r7 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r7 != 0) goto L42
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend> r3 = r9.messagesQueue     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L42
            io.netty.handler.traffic.TrafficCounter r3 = r14.trafficCounter     // Catch: java.lang.Throwable -> L3e
            r3.bytesRealWriteFlowControl(r5)     // Catch: java.lang.Throwable -> L3e
            r4 = r16
            r7 = r23
            r15.write(r4, r7)     // Catch: java.lang.Throwable -> L3e
            r9.lastWriteTimestamp = r1     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r0 = move-exception
            r3 = r9
            goto Lb5
        L42:
            r4 = r16
            r7 = r23
            long r10 = r14.maxTime     // Catch: java.lang.Throwable -> L3e
            int r3 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r3 <= 0) goto L5a
            long r10 = r1 + r19
            long r12 = r9.lastWriteTimestamp     // Catch: java.lang.Throwable -> L3e
            long r10 = r10 - r12
            long r12 = r14.maxTime     // Catch: java.lang.Throwable -> L3e
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 <= 0) goto L5a
            long r10 = r14.maxTime     // Catch: java.lang.Throwable -> L3e
            goto L5c
        L5a:
            r10 = r19
        L5c:
            io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend r1 = new io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend     // Catch: java.lang.Throwable -> L3e
            long r2 = r10 + r21
            r8 = 0
            r1.<init>(r2, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayDeque<io.netty.handler.traffic.GlobalTrafficShapingHandler$ToSend> r2 = r9.messagesQueue     // Catch: java.lang.Throwable -> L3e
            r2.addLast(r1)     // Catch: java.lang.Throwable -> L3e
            long r2 = r9.queueSize     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 + r5
            r9.queueSize = r2     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicLong r2 = r14.queuesSize     // Catch: java.lang.Throwable -> L3e
            r2.addAndGet(r5)     // Catch: java.lang.Throwable -> L3e
            long r2 = r9.queueSize     // Catch: java.lang.Throwable -> L3e
            r16 = r14
            r17 = r15
            r20 = r2
            r18 = r10
            r16.checkWriteSuspend(r17, r18, r20)     // Catch: java.lang.Throwable -> L3e
            r10 = r18
            java.util.concurrent.atomic.AtomicLong r3 = r14.queuesSize     // Catch: java.lang.Throwable -> L3e
            long r3 = r3.get()     // Catch: java.lang.Throwable -> L3e
            long r5 = r14.maxGlobalWriteSize     // Catch: java.lang.Throwable -> L3e
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L91
            r3 = 1
            goto L92
        L91:
            r3 = 0
        L92:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L98
            r14.setUserDefinedWritability(r15, r7)
        L98:
            long r3 = r1.relativeTimeAction
            io.netty.util.concurrent.EventExecutor r1 = r15.executor()
            io.netty.handler.traffic.GlobalTrafficShapingHandler$1 r5 = new io.netty.handler.traffic.GlobalTrafficShapingHandler$1
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
        Lb5:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb7
            throw r0
        Lb7:
            r0 = move-exception
            goto Lb5
    }

    @Override // io.netty.handler.traffic.AbstractTrafficShapingHandler
    protected int userDefinedWritabilityIndex() {
            r1 = this;
            r0 = 2
            return r0
    }
}
