package io.netty.handler.traffic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractTrafficShapingHandler extends io.netty.channel.ChannelDuplexHandler {
    static final int CHANNEL_DEFAULT_USER_DEFINED_WRITABILITY_INDEX = 1;
    public static final long DEFAULT_CHECK_INTERVAL = 1000;
    static final long DEFAULT_MAX_SIZE = 4194304;
    public static final long DEFAULT_MAX_TIME = 15000;
    static final int GLOBALCHANNEL_DEFAULT_USER_DEFINED_WRITABILITY_INDEX = 3;
    static final int GLOBAL_DEFAULT_USER_DEFINED_WRITABILITY_INDEX = 2;
    static final long MINIMAL_WAIT = 10;
    static final io.netty.util.AttributeKey<java.lang.Boolean> READ_SUSPENDED = null;
    static final io.netty.util.AttributeKey<java.lang.Runnable> REOPEN_TASK = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    protected volatile long checkInterval;
    protected volatile long maxTime;
    volatile long maxWriteDelay;
    volatile long maxWriteSize;
    private volatile long readLimit;
    protected io.netty.handler.traffic.TrafficCounter trafficCounter;
    final int userDefinedWritabilityIndex;
    private volatile long writeLimit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ReopenReadTimerTask implements java.lang.Runnable {
        final io.netty.channel.ChannelHandlerContext ctx;

        ReopenReadTimerTask(io.netty.channel.ChannelHandlerContext r1) {
                r0 = this;
                r0.<init>()
                r0.ctx = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                io.netty.channel.ChannelHandlerContext r0 = r6.ctx
                io.netty.channel.Channel r0 = r0.channel()
                io.netty.channel.ChannelConfig r1 = r0.config()
                boolean r2 = r1.isAutoRead()
                r3 = 58
                if (r2 != 0) goto L59
                io.netty.channel.ChannelHandlerContext r2 = r6.ctx
                boolean r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r2)
                if (r2 == 0) goto L59
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.access$000()
                boolean r2 = r2.isDebugEnabled()
                if (r2 == 0) goto L4c
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.access$000()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Not unsuspend: "
                r4.append(r5)
                boolean r5 = r1.isAutoRead()
                r4.append(r5)
                r4.append(r3)
                io.netty.channel.ChannelHandlerContext r5 = r6.ctx
                boolean r5 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r2.debug(r4)
            L4c:
                io.netty.util.AttributeKey<java.lang.Boolean> r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.READ_SUSPENDED
                io.netty.util.Attribute r0 = r0.attr(r2)
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.set(r2)
                goto Le8
            L59:
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.access$000()
                boolean r2 = r2.isDebugEnabled()
                if (r2 == 0) goto Ld6
                boolean r2 = r1.isAutoRead()
                if (r2 == 0) goto La4
                io.netty.channel.ChannelHandlerContext r2 = r6.ctx
                boolean r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r2)
                if (r2 != 0) goto La4
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.access$000()
                boolean r2 = r2.isDebugEnabled()
                if (r2 == 0) goto Ld6
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.access$000()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Unsuspend: "
                r4.append(r5)
                boolean r5 = r1.isAutoRead()
                r4.append(r5)
                r4.append(r3)
                io.netty.channel.ChannelHandlerContext r5 = r6.ctx
                boolean r5 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r2.debug(r4)
                goto Ld6
            La4:
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.access$000()
                boolean r2 = r2.isDebugEnabled()
                if (r2 == 0) goto Ld6
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.access$000()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Normal unsuspend: "
                r4.append(r5)
                boolean r5 = r1.isAutoRead()
                r4.append(r5)
                r4.append(r3)
                io.netty.channel.ChannelHandlerContext r5 = r6.ctx
                boolean r5 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r2.debug(r4)
            Ld6:
                io.netty.util.AttributeKey<java.lang.Boolean> r2 = io.netty.handler.traffic.AbstractTrafficShapingHandler.READ_SUSPENDED
                io.netty.util.Attribute r2 = r0.attr(r2)
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                r2.set(r4)
                r2 = 1
                r1.setAutoRead(r2)
                r0.read()
            Le8:
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.traffic.AbstractTrafficShapingHandler.access$000()
                boolean r0 = r0.isDebugEnabled()
                if (r0 == 0) goto L11a
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.traffic.AbstractTrafficShapingHandler.access$000()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Unsuspend final status => "
                r2.append(r4)
                boolean r1 = r1.isAutoRead()
                r2.append(r1)
                r2.append(r3)
                io.netty.channel.ChannelHandlerContext r1 = r6.ctx
                boolean r1 = io.netty.handler.traffic.AbstractTrafficShapingHandler.isHandlerActive(r1)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.debug(r1)
            L11a:
                return
        }
    }

    static {
            java.lang.Class<io.netty.handler.traffic.AbstractTrafficShapingHandler> r0 = io.netty.handler.traffic.AbstractTrafficShapingHandler.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.traffic.AbstractTrafficShapingHandler.logger = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.getName()
            r1.append(r2)
            java.lang.String r2 = ".READ_SUSPENDED"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            io.netty.util.AttributeKey r1 = io.netty.util.AttributeKey.valueOf(r1)
            io.netty.handler.traffic.AbstractTrafficShapingHandler.READ_SUSPENDED = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = ".REOPEN_TASK"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            io.netty.util.AttributeKey r0 = io.netty.util.AttributeKey.valueOf(r0)
            io.netty.handler.traffic.AbstractTrafficShapingHandler.REOPEN_TASK = r0
            return
    }

    protected AbstractTrafficShapingHandler() {
            r9 = this;
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 15000(0x3a98, double:7.411E-320)
            r1 = 0
            r3 = 0
            r0 = r9
            r0.<init>(r1, r3, r5, r7)
            return
    }

    protected AbstractTrafficShapingHandler(long r10) {
            r9 = this;
            r3 = 0
            r7 = 15000(0x3a98, double:7.411E-320)
            r1 = 0
            r0 = r9
            r5 = r10
            r0.<init>(r1, r3, r5, r7)
            return
    }

    protected AbstractTrafficShapingHandler(long r10, long r12) {
            r9 = this;
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 15000(0x3a98, double:7.411E-320)
            r0 = r9
            r1 = r10
            r3 = r12
            r0.<init>(r1, r3, r5, r7)
            return
    }

    protected AbstractTrafficShapingHandler(long r10, long r12, long r14) {
            r9 = this;
            r7 = 15000(0x3a98, double:7.411E-320)
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            r0.<init>(r1, r3, r5, r7)
            return
    }

    protected AbstractTrafficShapingHandler(long r4, long r6, long r8, long r10) {
            r3 = this;
            r3.<init>()
            r0 = 15000(0x3a98, double:7.411E-320)
            r3.maxTime = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.checkInterval = r0
            r0 = 4000(0xfa0, double:1.9763E-320)
            r3.maxWriteDelay = r0
            r0 = 4194304(0x400000, double:2.0722615E-317)
            r3.maxWriteSize = r0
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L29
            int r0 = r3.userDefinedWritabilityIndex()
            r3.userDefinedWritabilityIndex = r0
            r3.writeLimit = r4
            r3.readLimit = r6
            r3.checkInterval = r8
            r3.maxTime = r10
            return
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "maxTime must be positive"
            r4.<init>(r5)
            throw r4
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.traffic.AbstractTrafficShapingHandler.logger
            return r0
    }

    protected static boolean isHandlerActive(io.netty.channel.ChannelHandlerContext r1) {
            io.netty.channel.Channel r1 = r1.channel()
            io.netty.util.AttributeKey<java.lang.Boolean> r0 = io.netty.handler.traffic.AbstractTrafficShapingHandler.READ_SUSPENDED
            io.netty.util.Attribute r1 = r1.attr(r0)
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L1d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 0
            return r1
        L1d:
            r1 = 1
            return r1
    }

    protected long calculateSize(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Lc
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3
            int r3 = r3.readableBytes()
        La:
            long r0 = (long) r3
            return r0
        Lc:
            boolean r0 = r3 instanceof io.netty.buffer.ByteBufHolder
            if (r0 == 0) goto L1b
            io.netty.buffer.ByteBufHolder r3 = (io.netty.buffer.ByteBufHolder) r3
            io.netty.buffer.ByteBuf r3 = r3.content()
            int r3 = r3.readableBytes()
            goto La
        L1b:
            r0 = -1
            return r0
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r12, java.lang.Object r13) throws java.lang.Exception {
            r11 = this;
            long r1 = r11.calculateSize(r13)
            long r7 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lc9
            io.netty.handler.traffic.TrafficCounter r0 = r11.trafficCounter
            long r3 = r11.readLimit
            long r5 = r11.maxTime
            long r5 = r0.readTimeToWait(r1, r3, r5, r7)
            r3 = r11
            r4 = r12
            long r0 = r3.checkWaitReadTime(r4, r5, r7)
            r5 = 10
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 < 0) goto Lcb
            io.netty.channel.Channel r12 = r4.channel()
            io.netty.channel.ChannelConfig r2 = r12.config()
            io.netty.util.internal.logging.InternalLogger r5 = io.netty.handler.traffic.AbstractTrafficShapingHandler.logger
            boolean r6 = r5.isDebugEnabled()
            r9 = 58
            if (r6 == 0) goto L5e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Read suspend: "
            r6.append(r10)
            r6.append(r0)
            r6.append(r9)
            boolean r10 = r2.isAutoRead()
            r6.append(r10)
            r6.append(r9)
            boolean r10 = isHandlerActive(r4)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r5.debug(r6)
        L5e:
            boolean r6 = r2.isAutoRead()
            if (r6 == 0) goto Lcb
            boolean r6 = isHandlerActive(r4)
            if (r6 == 0) goto Lcb
            r6 = 0
            r2.setAutoRead(r6)
            io.netty.util.AttributeKey<java.lang.Boolean> r6 = io.netty.handler.traffic.AbstractTrafficShapingHandler.READ_SUSPENDED
            io.netty.util.Attribute r6 = r12.attr(r6)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r6.set(r10)
            io.netty.util.AttributeKey<java.lang.Runnable> r6 = io.netty.handler.traffic.AbstractTrafficShapingHandler.REOPEN_TASK
            io.netty.util.Attribute r12 = r12.attr(r6)
            java.lang.Object r6 = r12.get()
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            if (r6 != 0) goto L8f
            io.netty.handler.traffic.AbstractTrafficShapingHandler$ReopenReadTimerTask r6 = new io.netty.handler.traffic.AbstractTrafficShapingHandler$ReopenReadTimerTask
            r6.<init>(r4)
            r12.set(r6)
        L8f:
            io.netty.util.concurrent.EventExecutor r12 = r4.executor()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r12.schedule(r6, r0, r10)
            boolean r12 = r5.isDebugEnabled()
            if (r12 == 0) goto Lcb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r6 = "Suspend final status => "
            r12.append(r6)
            boolean r2 = r2.isAutoRead()
            r12.append(r2)
            r12.append(r9)
            boolean r2 = isHandlerActive(r4)
            r12.append(r2)
            java.lang.String r2 = " will reopened at: "
            r12.append(r2)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r5.debug(r12)
            goto Lcb
        Lc9:
            r3 = r11
            r4 = r12
        Lcb:
            r11.informReadOperation(r4, r7)
            r4.fireChannelRead(r13)
            return
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRegistered(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            r1.setUserDefinedWritability(r2, r0)
            super.channelRegistered(r2)
            return
    }

    long checkWaitReadTime(io.netty.channel.ChannelHandlerContext r1, long r2, long r4) {
            r0 = this;
            return r2
    }

    void checkWriteSuspend(io.netty.channel.ChannelHandlerContext r4, long r5, long r7) {
            r3 = this;
            long r0 = r3.maxWriteSize
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            long r7 = r3.maxWriteDelay
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r5 = 0
            r3.setUserDefinedWritability(r4, r5)
            return
    }

    public void configure(long r3) {
            r2 = this;
            r2.checkInterval = r3
            io.netty.handler.traffic.TrafficCounter r3 = r2.trafficCounter
            if (r3 == 0) goto Lb
            long r0 = r2.checkInterval
            r3.configure(r0)
        Lb:
            return
    }

    public void configure(long r1, long r3) {
            r0 = this;
            r0.writeLimit = r1
            r0.readLimit = r3
            io.netty.handler.traffic.TrafficCounter r1 = r0.trafficCounter
            if (r1 == 0) goto Lf
            long r2 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r1.resetAccounting(r2)
        Lf:
            return
    }

    public void configure(long r1, long r3, long r5) {
            r0 = this;
            r0.configure(r1, r3)
            r0.configure(r5)
            return
    }

    protected void doAccounting(io.netty.handler.traffic.TrafficCounter r1) {
            r0 = this;
            return
    }

    public long getCheckInterval() {
            r2 = this;
            long r0 = r2.checkInterval
            return r0
    }

    public long getMaxTimeWait() {
            r2 = this;
            long r0 = r2.maxTime
            return r0
    }

    public long getMaxWriteDelay() {
            r2 = this;
            long r0 = r2.maxWriteDelay
            return r0
    }

    public long getMaxWriteSize() {
            r2 = this;
            long r0 = r2.maxWriteSize
            return r0
    }

    public long getReadLimit() {
            r2 = this;
            long r0 = r2.readLimit
            return r0
    }

    public long getWriteLimit() {
            r2 = this;
            long r0 = r2.writeLimit
            return r0
    }

    void informReadOperation(io.netty.channel.ChannelHandlerContext r1, long r2) {
            r0 = this;
            return
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void read(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            boolean r0 = isHandlerActive(r2)
            if (r0 == 0) goto L9
            r2.read()
        L9:
            return
    }

    void releaseReadSuspended(io.netty.channel.ChannelHandlerContext r3) {
            r2 = this;
            io.netty.channel.Channel r3 = r3.channel()
            io.netty.util.AttributeKey<java.lang.Boolean> r0 = io.netty.handler.traffic.AbstractTrafficShapingHandler.READ_SUSPENDED
            io.netty.util.Attribute r0 = r3.attr(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.set(r1)
            io.netty.channel.ChannelConfig r3 = r3.config()
            r0 = 1
            r3.setAutoRead(r0)
            return
    }

    void releaseWriteSuspended(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            r0 = 1
            r1.setUserDefinedWritability(r2, r0)
            return
    }

    public void setCheckInterval(long r2) {
            r1 = this;
            r1.checkInterval = r2
            io.netty.handler.traffic.TrafficCounter r0 = r1.trafficCounter
            if (r0 == 0) goto L9
            r0.configure(r2)
        L9:
            return
    }

    public void setMaxTimeWait(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L9
            r3.maxTime = r4
            return
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "maxTime must be positive"
            r4.<init>(r5)
            throw r4
    }

    public void setMaxWriteDelay(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L9
            r3.maxWriteDelay = r4
            return
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "maxWriteDelay must be positive"
            r4.<init>(r5)
            throw r4
    }

    public void setMaxWriteSize(long r1) {
            r0 = this;
            r0.maxWriteSize = r1
            return
    }

    public void setReadLimit(long r3) {
            r2 = this;
            r2.readLimit = r3
            io.netty.handler.traffic.TrafficCounter r3 = r2.trafficCounter
            if (r3 == 0) goto Ld
            long r0 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r3.resetAccounting(r0)
        Ld:
            return
    }

    void setTrafficCounter(io.netty.handler.traffic.TrafficCounter r1) {
            r0 = this;
            r0.trafficCounter = r1
            return
    }

    void setUserDefinedWritability(io.netty.channel.ChannelHandlerContext r2, boolean r3) {
            r1 = this;
            io.netty.channel.Channel r2 = r2.channel()
            io.netty.channel.Channel$Unsafe r2 = r2.unsafe()
            io.netty.channel.ChannelOutboundBuffer r2 = r2.outboundBuffer()
            if (r2 == 0) goto L13
            int r0 = r1.userDefinedWritabilityIndex
            r2.setUserDefinedWritability(r0, r3)
        L13:
            return
    }

    public void setWriteLimit(long r3) {
            r2 = this;
            r2.writeLimit = r3
            io.netty.handler.traffic.TrafficCounter r3 = r2.trafficCounter
            if (r3 == 0) goto Ld
            long r0 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r3.resetAccounting(r0)
        Ld:
            return
    }

    abstract void submitWrite(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2, long r3, long r5, long r7, io.netty.channel.ChannelPromise r9);

    @java.lang.Deprecated
    protected void submitWrite(io.netty.channel.ChannelHandlerContext r11, java.lang.Object r12, long r13, io.netty.channel.ChannelPromise r15) {
            r10 = this;
            long r3 = r10.calculateSize(r12)
            long r7 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r0 = r10
            r1 = r11
            r2 = r12
            r5 = r13
            r9 = r15
            r0.submitWrite(r1, r2, r3, r5, r7, r9)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 290(0x122, float:4.06E-43)
            r0.<init>(r1)
            java.lang.String r1 = "TrafficShaping with Write Limit: "
            r0.append(r1)
            long r1 = r3.writeLimit
            r0.append(r1)
            java.lang.String r1 = " Read Limit: "
            r0.append(r1)
            long r1 = r3.readLimit
            r0.append(r1)
            java.lang.String r1 = " CheckInterval: "
            r0.append(r1)
            long r1 = r3.checkInterval
            r0.append(r1)
            java.lang.String r1 = " maxDelay: "
            r0.append(r1)
            long r1 = r3.maxWriteDelay
            r0.append(r1)
            java.lang.String r1 = " maxSize: "
            r0.append(r1)
            long r1 = r3.maxWriteSize
            r0.append(r1)
            java.lang.String r1 = " and Counter: "
            r0.append(r1)
            io.netty.handler.traffic.TrafficCounter r1 = r3.trafficCounter
            if (r1 == 0) goto L46
            r0.append(r1)
            goto L4b
        L46:
            java.lang.String r1 = "none"
            r0.append(r1)
        L4b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public io.netty.handler.traffic.TrafficCounter trafficCounter() {
            r1 = this;
            io.netty.handler.traffic.TrafficCounter r0 = r1.trafficCounter
            return r0
    }

    protected int userDefinedWritabilityIndex() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void write(io.netty.channel.ChannelHandlerContext r11, java.lang.Object r12, io.netty.channel.ChannelPromise r13) throws java.lang.Exception {
            r10 = this;
            long r3 = r10.calculateSize(r12)
            long r7 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            io.netty.handler.traffic.TrafficCounter r0 = r10.trafficCounter
            r1 = r3
            long r3 = r10.writeLimit
            long r5 = r10.maxTime
            long r5 = r0.writeTimeToWait(r1, r3, r5, r7)
            r3 = 10
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L62
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.traffic.AbstractTrafficShapingHandler.logger
            boolean r3 = r0.isDebugEnabled()
            if (r3 == 0) goto L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Write suspend: "
            r3.append(r4)
            r3.append(r5)
            r4 = 58
            r3.append(r4)
            io.netty.channel.Channel r9 = r11.channel()
            io.netty.channel.ChannelConfig r9 = r9.config()
            boolean r9 = r9.isAutoRead()
            r3.append(r9)
            r3.append(r4)
            boolean r4 = isHandlerActive(r11)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.debug(r3)
        L59:
            r0 = r10
            r9 = r13
            r3 = r1
            r1 = r11
            r2 = r12
            r0.submitWrite(r1, r2, r3, r5, r7, r9)
            return
        L62:
            r3 = r1
            r9 = r13
            r1 = r11
            r2 = r12
            goto L6a
        L67:
            r1 = r11
            r2 = r12
            r9 = r13
        L6a:
            r5 = 0
            r0 = r10
            r0.submitWrite(r1, r2, r3, r5, r7, r9)
            return
    }
}
