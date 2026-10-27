package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultChannelConfig implements io.netty.channel.ChannelConfig {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.DefaultChannelConfig> AUTOREAD_UPDATER = null;
    private static final int DEFAULT_CONNECT_TIMEOUT = 30000;
    private static final io.netty.channel.MessageSizeEstimator DEFAULT_MSG_SIZE_ESTIMATOR = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.channel.DefaultChannelConfig, io.netty.channel.WriteBufferWaterMark> WATERMARK_UPDATER = null;
    private volatile io.netty.buffer.ByteBufAllocator allocator;
    private volatile boolean autoClose;
    private volatile int autoRead;
    protected final io.netty.channel.Channel channel;
    private volatile int connectTimeoutMillis;
    private volatile io.netty.channel.MessageSizeEstimator msgSizeEstimator;
    private volatile boolean pinEventExecutor;
    private volatile io.netty.channel.RecvByteBufAllocator rcvBufAllocator;
    private volatile io.netty.channel.WriteBufferWaterMark writeBufferWaterMark;
    private volatile int writeSpinCount;

    static {
            io.netty.channel.MessageSizeEstimator r0 = io.netty.channel.DefaultMessageSizeEstimator.DEFAULT
            io.netty.channel.DefaultChannelConfig.DEFAULT_MSG_SIZE_ESTIMATOR = r0
            java.lang.String r0 = "autoRead"
            java.lang.Class<io.netty.channel.DefaultChannelConfig> r1 = io.netty.channel.DefaultChannelConfig.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            io.netty.channel.DefaultChannelConfig.AUTOREAD_UPDATER = r0
            java.lang.Class<io.netty.channel.WriteBufferWaterMark> r0 = io.netty.channel.WriteBufferWaterMark.class
            java.lang.String r2 = "writeBufferWaterMark"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            io.netty.channel.DefaultChannelConfig.WATERMARK_UPDATER = r0
            return
    }

    public DefaultChannelConfig(io.netty.channel.Channel r2) {
            r1 = this;
            io.netty.channel.AdaptiveRecvByteBufAllocator r0 = new io.netty.channel.AdaptiveRecvByteBufAllocator
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    protected DefaultChannelConfig(io.netty.channel.Channel r3, io.netty.channel.RecvByteBufAllocator r4) {
            r2 = this;
            r2.<init>()
            io.netty.buffer.ByteBufAllocator r0 = io.netty.buffer.ByteBufAllocator.DEFAULT
            r2.allocator = r0
            io.netty.channel.MessageSizeEstimator r0 = io.netty.channel.DefaultChannelConfig.DEFAULT_MSG_SIZE_ESTIMATOR
            r2.msgSizeEstimator = r0
            r0 = 30000(0x7530, float:4.2039E-41)
            r2.connectTimeoutMillis = r0
            r0 = 16
            r2.writeSpinCount = r0
            r0 = 1
            r2.autoRead = r0
            r2.autoClose = r0
            io.netty.channel.WriteBufferWaterMark r1 = io.netty.channel.WriteBufferWaterMark.DEFAULT
            r2.writeBufferWaterMark = r1
            r2.pinEventExecutor = r0
            io.netty.channel.ChannelMetadata r0 = r3.metadata()
            r2.setRecvByteBufAllocator(r4, r0)
            r2.channel = r3
            return
    }

    private boolean getPinEventExecutorPerGroup() {
            r1 = this;
            boolean r0 = r1.pinEventExecutor
            return r0
    }

    private io.netty.channel.ChannelConfig setPinEventExecutorPerGroup(boolean r1) {
            r0 = this;
            r0.pinEventExecutor = r1
            return r0
    }

    private void setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r2, io.netty.channel.ChannelMetadata r3) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.channel.MaxMessagesRecvByteBufAllocator
            if (r0 == 0) goto Lf
            r0 = r2
            io.netty.channel.MaxMessagesRecvByteBufAllocator r0 = (io.netty.channel.MaxMessagesRecvByteBufAllocator) r0
            int r3 = r3.defaultMaxMessagesPerRead()
            r0.maxMessagesPerRead(r3)
            goto L11
        Lf:
            if (r2 == 0) goto L15
        L11:
            r1.setRecvByteBufAllocator(r2)
            return
        L15:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "allocator"
            r2.<init>(r3)
            throw r2
    }

    protected void autoReadCleared() {
            r0 = this;
            return
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.buffer.ByteBufAllocator getAllocator() {
            r1 = this;
            io.netty.buffer.ByteBufAllocator r0 = r1.allocator
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public int getConnectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public int getMaxMessagesPerRead() {
            r3 = this;
            io.netty.channel.RecvByteBufAllocator r0 = r3.getRecvByteBufAllocator()     // Catch: java.lang.ClassCastException -> Lb
            io.netty.channel.MaxMessagesRecvByteBufAllocator r0 = (io.netty.channel.MaxMessagesRecvByteBufAllocator) r0     // Catch: java.lang.ClassCastException -> Lb
            int r0 = r0.maxMessagesPerRead()     // Catch: java.lang.ClassCastException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator"
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.MessageSizeEstimator getMessageSizeEstimator() {
            r1 = this;
            io.netty.channel.MessageSizeEstimator r0 = r1.msgSizeEstimator
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            if (r2 == 0) goto L90
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.CONNECT_TIMEOUT_MILLIS
            if (r2 != r0) goto Lf
            int r2 = r1.getConnectTimeoutMillis()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Lf:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.MAX_MESSAGES_PER_READ
            if (r2 != r0) goto L1c
            int r2 = r1.getMaxMessagesPerRead()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L1c:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.WRITE_SPIN_COUNT
            if (r2 != r0) goto L29
            int r2 = r1.getWriteSpinCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L29:
            io.netty.channel.ChannelOption<io.netty.buffer.ByteBufAllocator> r0 = io.netty.channel.ChannelOption.ALLOCATOR
            if (r2 != r0) goto L32
            io.netty.buffer.ByteBufAllocator r2 = r1.getAllocator()
            return r2
        L32:
            io.netty.channel.ChannelOption<io.netty.channel.RecvByteBufAllocator> r0 = io.netty.channel.ChannelOption.RCVBUF_ALLOCATOR
            if (r2 != r0) goto L3b
            io.netty.channel.RecvByteBufAllocator r2 = r1.getRecvByteBufAllocator()
            return r2
        L3b:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.AUTO_READ
            if (r2 != r0) goto L48
            boolean r2 = r1.isAutoRead()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L48:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.AUTO_CLOSE
            if (r2 != r0) goto L55
            boolean r2 = r1.isAutoClose()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L55:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.WRITE_BUFFER_HIGH_WATER_MARK
            if (r2 != r0) goto L62
            int r2 = r1.getWriteBufferHighWaterMark()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L62:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.WRITE_BUFFER_LOW_WATER_MARK
            if (r2 != r0) goto L6f
            int r2 = r1.getWriteBufferLowWaterMark()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L6f:
            io.netty.channel.ChannelOption<io.netty.channel.WriteBufferWaterMark> r0 = io.netty.channel.ChannelOption.WRITE_BUFFER_WATER_MARK
            if (r2 != r0) goto L78
            io.netty.channel.WriteBufferWaterMark r2 = r1.getWriteBufferWaterMark()
            return r2
        L78:
            io.netty.channel.ChannelOption<io.netty.channel.MessageSizeEstimator> r0 = io.netty.channel.ChannelOption.MESSAGE_SIZE_ESTIMATOR
            if (r2 != r0) goto L81
            io.netty.channel.MessageSizeEstimator r2 = r1.getMessageSizeEstimator()
            return r2
        L81:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SINGLE_EVENTEXECUTOR_PER_GROUP
            if (r2 != r0) goto L8e
            boolean r2 = r1.getPinEventExecutorPerGroup()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L8e:
            r2 = 0
            return r2
        L90:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "option"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r3 = this;
            r0 = 12
            io.netty.channel.ChannelOption[] r0 = new io.netty.channel.ChannelOption[r0]
            io.netty.channel.ChannelOption<java.lang.Integer> r1 = io.netty.channel.ChannelOption.CONNECT_TIMEOUT_MILLIS
            r2 = 0
            r0[r2] = r1
            io.netty.channel.ChannelOption<java.lang.Integer> r1 = io.netty.channel.ChannelOption.MAX_MESSAGES_PER_READ
            r2 = 1
            r0[r2] = r1
            io.netty.channel.ChannelOption<java.lang.Integer> r1 = io.netty.channel.ChannelOption.WRITE_SPIN_COUNT
            r2 = 2
            r0[r2] = r1
            io.netty.channel.ChannelOption<io.netty.buffer.ByteBufAllocator> r1 = io.netty.channel.ChannelOption.ALLOCATOR
            r2 = 3
            r0[r2] = r1
            io.netty.channel.ChannelOption<java.lang.Boolean> r1 = io.netty.channel.ChannelOption.AUTO_READ
            r2 = 4
            r0[r2] = r1
            io.netty.channel.ChannelOption<java.lang.Boolean> r1 = io.netty.channel.ChannelOption.AUTO_CLOSE
            r2 = 5
            r0[r2] = r1
            io.netty.channel.ChannelOption<io.netty.channel.RecvByteBufAllocator> r1 = io.netty.channel.ChannelOption.RCVBUF_ALLOCATOR
            r2 = 6
            r0[r2] = r1
            io.netty.channel.ChannelOption<java.lang.Integer> r1 = io.netty.channel.ChannelOption.WRITE_BUFFER_HIGH_WATER_MARK
            r2 = 7
            r0[r2] = r1
            io.netty.channel.ChannelOption<java.lang.Integer> r1 = io.netty.channel.ChannelOption.WRITE_BUFFER_LOW_WATER_MARK
            r2 = 8
            r0[r2] = r1
            io.netty.channel.ChannelOption<io.netty.channel.WriteBufferWaterMark> r1 = io.netty.channel.ChannelOption.WRITE_BUFFER_WATER_MARK
            r2 = 9
            r0[r2] = r1
            io.netty.channel.ChannelOption<io.netty.channel.MessageSizeEstimator> r1 = io.netty.channel.ChannelOption.MESSAGE_SIZE_ESTIMATOR
            r2 = 10
            r0[r2] = r1
            io.netty.channel.ChannelOption<java.lang.Boolean> r1 = io.netty.channel.ChannelOption.SINGLE_EVENTEXECUTOR_PER_GROUP
            r2 = 11
            r0[r2] = r1
            r1 = 0
            java.util.Map r0 = r3.getOptions(r1, r0)
            return r0
    }

    protected java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions(java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> r5, io.netty.channel.ChannelOption<?>... r6) {
            r4 = this;
            if (r5 != 0) goto L7
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap
            r5.<init>()
        L7:
            int r0 = r6.length
            r1 = 0
        L9:
            if (r1 >= r0) goto L17
            r2 = r6[r1]
            java.lang.Object r3 = r4.getOption(r2)
            r5.put(r2, r3)
            int r1 = r1 + 1
            goto L9
        L17:
            return r5
    }

    @Override // io.netty.channel.ChannelConfig
    public <T extends io.netty.channel.RecvByteBufAllocator> T getRecvByteBufAllocator() {
            r1 = this;
            io.netty.channel.RecvByteBufAllocator r0 = r1.rcvBufAllocator
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public int getWriteBufferHighWaterMark() {
            r1 = this;
            io.netty.channel.WriteBufferWaterMark r0 = r1.writeBufferWaterMark
            int r0 = r0.high()
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public int getWriteBufferLowWaterMark() {
            r1 = this;
            io.netty.channel.WriteBufferWaterMark r0 = r1.writeBufferWaterMark
            int r0 = r0.low()
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.WriteBufferWaterMark getWriteBufferWaterMark() {
            r1 = this;
            io.netty.channel.WriteBufferWaterMark r0 = r1.writeBufferWaterMark
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public int getWriteSpinCount() {
            r1 = this;
            int r0 = r1.writeSpinCount
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public boolean isAutoClose() {
            r1 = this;
            boolean r0 = r1.autoClose
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public boolean isAutoRead() {
            r2 = this;
            int r0 = r2.autoRead
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.allocator = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "allocator"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            r0.autoClose = r1
            return r0
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setAutoRead(boolean r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.channel.DefaultChannelConfig> r0 = io.netty.channel.DefaultChannelConfig.AUTOREAD_UPDATER
            int r0 = r0.getAndSet(r2, r3)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r3 == 0) goto L15
            if (r1 != 0) goto L15
            io.netty.channel.Channel r3 = r2.channel
            r3.read()
            return r2
        L15:
            if (r3 != 0) goto L1c
            if (r1 == 0) goto L1c
            r2.autoReadCleared()
        L1c:
            return r2
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r2) {
            r1 = this;
            java.lang.String r0 = "connectTimeoutMillis"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r2, r0)
            r1.connectTimeoutMillis = r2
            return r1
    }

    @Override // io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r3) {
            r2 = this;
            io.netty.channel.RecvByteBufAllocator r0 = r2.getRecvByteBufAllocator()     // Catch: java.lang.ClassCastException -> La
            io.netty.channel.MaxMessagesRecvByteBufAllocator r0 = (io.netty.channel.MaxMessagesRecvByteBufAllocator) r0     // Catch: java.lang.ClassCastException -> La
            r0.maxMessagesPerRead(r3)     // Catch: java.lang.ClassCastException -> La
            return r2
        La:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.msgSizeEstimator = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "estimator"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.CONNECT_TIMEOUT_MILLIS
            if (r2 != r0) goto L12
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setConnectTimeoutMillis(r2)
            goto L9d
        L12:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.MAX_MESSAGES_PER_READ
            if (r2 != r0) goto L21
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setMaxMessagesPerRead(r2)
            goto L9d
        L21:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.WRITE_SPIN_COUNT
            if (r2 != r0) goto L30
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setWriteSpinCount(r2)
            goto L9d
        L30:
            io.netty.channel.ChannelOption<io.netty.buffer.ByteBufAllocator> r0 = io.netty.channel.ChannelOption.ALLOCATOR
            if (r2 != r0) goto L3a
            io.netty.buffer.ByteBufAllocator r3 = (io.netty.buffer.ByteBufAllocator) r3
            r1.setAllocator(r3)
            goto L9d
        L3a:
            io.netty.channel.ChannelOption<io.netty.channel.RecvByteBufAllocator> r0 = io.netty.channel.ChannelOption.RCVBUF_ALLOCATOR
            if (r2 != r0) goto L44
            io.netty.channel.RecvByteBufAllocator r3 = (io.netty.channel.RecvByteBufAllocator) r3
            r1.setRecvByteBufAllocator(r3)
            goto L9d
        L44:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.AUTO_READ
            if (r2 != r0) goto L52
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setAutoRead(r2)
            goto L9d
        L52:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.AUTO_CLOSE
            if (r2 != r0) goto L60
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setAutoClose(r2)
            goto L9d
        L60:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.WRITE_BUFFER_HIGH_WATER_MARK
            if (r2 != r0) goto L6e
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setWriteBufferHighWaterMark(r2)
            goto L9d
        L6e:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.WRITE_BUFFER_LOW_WATER_MARK
            if (r2 != r0) goto L7c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setWriteBufferLowWaterMark(r2)
            goto L9d
        L7c:
            io.netty.channel.ChannelOption<io.netty.channel.WriteBufferWaterMark> r0 = io.netty.channel.ChannelOption.WRITE_BUFFER_WATER_MARK
            if (r2 != r0) goto L86
            io.netty.channel.WriteBufferWaterMark r3 = (io.netty.channel.WriteBufferWaterMark) r3
            r1.setWriteBufferWaterMark(r3)
            goto L9d
        L86:
            io.netty.channel.ChannelOption<io.netty.channel.MessageSizeEstimator> r0 = io.netty.channel.ChannelOption.MESSAGE_SIZE_ESTIMATOR
            if (r2 != r0) goto L90
            io.netty.channel.MessageSizeEstimator r3 = (io.netty.channel.MessageSizeEstimator) r3
            r1.setMessageSizeEstimator(r3)
            goto L9d
        L90:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SINGLE_EVENTEXECUTOR_PER_GROUP
            if (r2 != r0) goto L9f
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setPinEventExecutorPerGroup(r2)
        L9d:
            r2 = 1
            return r2
        L9f:
            r2 = 0
            return r2
    }

    @Override // io.netty.channel.ChannelConfig
    public boolean setOptions(java.util.Map<io.netty.channel.ChannelOption<?>, ?> r4) {
            r3 = this;
            if (r4 == 0) goto L2a
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r0 = 1
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            io.netty.channel.ChannelOption r2 = (io.netty.channel.ChannelOption) r2
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r3.setOption(r2, r1)
            if (r1 != 0) goto Lb
            r0 = 0
            goto Lb
        L29:
            return r0
        L2a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "options"
            r4.<init>(r0)
            throw r4
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r2) {
            r1 = this;
            java.lang.String r0 = "allocator"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.RecvByteBufAllocator r2 = (io.netty.channel.RecvByteBufAllocator) r2
            r1.rcvBufAllocator = r2
            return r1
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r6) {
            r5 = this;
            java.lang.String r0 = "writeBufferHighWaterMark"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r6, r0)
        L5:
            io.netty.channel.WriteBufferWaterMark r0 = r5.writeBufferWaterMark
            int r1 = r0.low()
            if (r6 < r1) goto L20
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.channel.DefaultChannelConfig, io.netty.channel.WriteBufferWaterMark> r1 = io.netty.channel.DefaultChannelConfig.WATERMARK_UPDATER
            io.netty.channel.WriteBufferWaterMark r2 = new io.netty.channel.WriteBufferWaterMark
            int r3 = r0.low()
            r4 = 0
            r2.<init>(r3, r6, r4)
            boolean r0 = androidx.concurrent.futures.a.a(r1, r5, r0, r2)
            if (r0 == 0) goto L5
            return r5
        L20:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "writeBufferHighWaterMark cannot be less than writeBufferLowWaterMark ("
            r2.append(r3)
            int r0 = r0.low()
            r2.append(r0)
            java.lang.String r0 = "): "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6)
            throw r1
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r6) {
            r5 = this;
            java.lang.String r0 = "writeBufferLowWaterMark"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r6, r0)
        L5:
            io.netty.channel.WriteBufferWaterMark r0 = r5.writeBufferWaterMark
            int r1 = r0.high()
            if (r6 > r1) goto L20
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.channel.DefaultChannelConfig, io.netty.channel.WriteBufferWaterMark> r1 = io.netty.channel.DefaultChannelConfig.WATERMARK_UPDATER
            io.netty.channel.WriteBufferWaterMark r2 = new io.netty.channel.WriteBufferWaterMark
            int r3 = r0.high()
            r4 = 0
            r2.<init>(r6, r3, r4)
            boolean r0 = androidx.concurrent.futures.a.a(r1, r5, r0, r2)
            if (r0 == 0) goto L5
            return r5
        L20:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark ("
            r2.append(r3)
            int r0 = r0.high()
            r2.append(r0)
            java.lang.String r0 = "): "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6)
            throw r1
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r2) {
            r1 = this;
            java.lang.String r0 = "writeBufferWaterMark"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.WriteBufferWaterMark r2 = (io.netty.channel.WriteBufferWaterMark) r2
            r1.writeBufferWaterMark = r2
            return r1
    }

    @Override // io.netty.channel.ChannelConfig
    public io.netty.channel.ChannelConfig setWriteSpinCount(int r2) {
            r1 = this;
            java.lang.String r0 = "writeSpinCount"
            io.netty.util.internal.ObjectUtil.checkPositive(r2, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto Lc
            int r2 = r2 + (-1)
        Lc:
            r1.writeSpinCount = r2
            return r1
    }

    protected <T> void validate(io.netty.channel.ChannelOption<T> r1, T r2) {
            r0 = this;
            if (r1 == 0) goto L6
            r1.validate(r2)
            return
        L6:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "option"
            r1.<init>(r2)
            throw r1
    }
}
