package io.netty.channel.rxtx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DefaultRxtxChannelConfig extends io.netty.channel.DefaultChannelConfig implements io.netty.channel.rxtx.RxtxChannelConfig {
    private volatile int baudrate;
    private volatile io.netty.channel.rxtx.RxtxChannelConfig.Databits databits;
    private volatile boolean dtr;
    private volatile io.netty.channel.rxtx.RxtxChannelConfig.Paritybit paritybit;
    private volatile int readTimeout;
    private volatile boolean rts;
    private volatile io.netty.channel.rxtx.RxtxChannelConfig.Stopbits stopbits;
    private volatile int waitTime;

    DefaultRxtxChannelConfig(io.netty.channel.rxtx.RxtxChannel r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 115200(0x1c200, float:1.6143E-40)
            r1.baudrate = r2
            io.netty.channel.rxtx.RxtxChannelConfig$Stopbits r2 = io.netty.channel.rxtx.RxtxChannelConfig.Stopbits.STOPBITS_1
            r1.stopbits = r2
            io.netty.channel.rxtx.RxtxChannelConfig$Databits r2 = io.netty.channel.rxtx.RxtxChannelConfig.Databits.DATABITS_8
            r1.databits = r2
            io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r2 = io.netty.channel.rxtx.RxtxChannelConfig.Paritybit.NONE
            r1.paritybit = r2
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.readTimeout = r2
            io.netty.channel.PreferHeapByteBufAllocator r2 = new io.netty.channel.PreferHeapByteBufAllocator
            io.netty.buffer.ByteBufAllocator r0 = r1.getAllocator()
            r2.<init>(r0)
            r1.setAllocator(r2)
            return
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public int getBaudrate() {
            r1 = this;
            int r0 = r1.baudrate
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig.Databits getDatabits() {
            r1 = this;
            io.netty.channel.rxtx.RxtxChannelConfig$Databits r0 = r1.databits
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.rxtx.RxtxChannelOption.BAUD_RATE
            if (r2 != r0) goto Ld
            int r2 = r1.getBaudrate()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Ld:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.rxtx.RxtxChannelOption.DTR
            if (r2 != r0) goto L1a
            boolean r2 = r1.isDtr()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L1a:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.rxtx.RxtxChannelOption.RTS
            if (r2 != r0) goto L27
            boolean r2 = r1.isRts()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L27:
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Stopbits> r0 = io.netty.channel.rxtx.RxtxChannelOption.STOP_BITS
            if (r2 != r0) goto L30
            io.netty.channel.rxtx.RxtxChannelConfig$Stopbits r2 = r1.getStopbits()
            return r2
        L30:
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Databits> r0 = io.netty.channel.rxtx.RxtxChannelOption.DATA_BITS
            if (r2 != r0) goto L39
            io.netty.channel.rxtx.RxtxChannelConfig$Databits r2 = r1.getDatabits()
            return r2
        L39:
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Paritybit> r0 = io.netty.channel.rxtx.RxtxChannelOption.PARITY_BIT
            if (r2 != r0) goto L42
            io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r2 = r1.getParitybit()
            return r2
        L42:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.rxtx.RxtxChannelOption.WAIT_TIME
            if (r2 != r0) goto L4f
            int r2 = r1.getWaitTimeMillis()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L4f:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.rxtx.RxtxChannelOption.READ_TIMEOUT
            if (r2 != r0) goto L5c
            int r2 = r1.getReadTimeout()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L5c:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 7
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.rxtx.RxtxChannelOption.BAUD_RATE
            r3 = 0
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.rxtx.RxtxChannelOption.DTR
            r3 = 1
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.rxtx.RxtxChannelOption.RTS
            r3 = 2
            r1[r3] = r2
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Stopbits> r2 = io.netty.channel.rxtx.RxtxChannelOption.STOP_BITS
            r3 = 3
            r1[r3] = r2
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Databits> r2 = io.netty.channel.rxtx.RxtxChannelOption.DATA_BITS
            r3 = 4
            r1[r3] = r2
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Paritybit> r2 = io.netty.channel.rxtx.RxtxChannelOption.PARITY_BIT
            r3 = 5
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.rxtx.RxtxChannelOption.WAIT_TIME
            r3 = 6
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig.Paritybit getParitybit() {
            r1 = this;
            io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r0 = r1.paritybit
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public int getReadTimeout() {
            r1 = this;
            int r0 = r1.readTimeout
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig.Stopbits getStopbits() {
            r1 = this;
            io.netty.channel.rxtx.RxtxChannelConfig$Stopbits r0 = r1.stopbits
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public int getWaitTimeMillis() {
            r1 = this;
            int r0 = r1.waitTime
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public boolean isDtr() {
            r1 = this;
            boolean r0 = r1.dtr
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public boolean isRts() {
            r1 = this;
            boolean r0 = r1.rts
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setBaudrate(int r1) {
            r0 = this;
            r0.baudrate = r1
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setDatabits(io.netty.channel.rxtx.RxtxChannelConfig.Databits r1) {
            r0 = this;
            r0.databits = r1
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setDtr(boolean r1) {
            r0 = this;
            r0.dtr = r1
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.rxtx.RxtxChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.rxtx.RxtxChannelOption.BAUD_RATE
            if (r2 != r0) goto L11
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setBaudrate(r2)
            goto L66
        L11:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.rxtx.RxtxChannelOption.DTR
            if (r2 != r0) goto L1f
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setDtr(r2)
            goto L66
        L1f:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.rxtx.RxtxChannelOption.RTS
            if (r2 != r0) goto L2d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setRts(r2)
            goto L66
        L2d:
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Stopbits> r0 = io.netty.channel.rxtx.RxtxChannelOption.STOP_BITS
            if (r2 != r0) goto L37
            io.netty.channel.rxtx.RxtxChannelConfig$Stopbits r3 = (io.netty.channel.rxtx.RxtxChannelConfig.Stopbits) r3
            r1.setStopbits(r3)
            goto L66
        L37:
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Databits> r0 = io.netty.channel.rxtx.RxtxChannelOption.DATA_BITS
            if (r2 != r0) goto L41
            io.netty.channel.rxtx.RxtxChannelConfig$Databits r3 = (io.netty.channel.rxtx.RxtxChannelConfig.Databits) r3
            r1.setDatabits(r3)
            goto L66
        L41:
            io.netty.channel.ChannelOption<io.netty.channel.rxtx.RxtxChannelConfig$Paritybit> r0 = io.netty.channel.rxtx.RxtxChannelOption.PARITY_BIT
            if (r2 != r0) goto L4b
            io.netty.channel.rxtx.RxtxChannelConfig$Paritybit r3 = (io.netty.channel.rxtx.RxtxChannelConfig.Paritybit) r3
            r1.setParitybit(r3)
            goto L66
        L4b:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.rxtx.RxtxChannelOption.WAIT_TIME
            if (r2 != r0) goto L59
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setWaitTimeMillis(r2)
            goto L66
        L59:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.rxtx.RxtxChannelOption.READ_TIMEOUT
            if (r2 != r0) goto L68
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setReadTimeout(r2)
        L66:
            r2 = 1
            return r2
        L68:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setParitybit(io.netty.channel.rxtx.RxtxChannelConfig.Paritybit r1) {
            r0 = this;
            r0.paritybit = r1
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setReadTimeout(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.readTimeout = r2
            return r1
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "readTime must be >= 0"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setRts(boolean r1) {
            r0 = this;
            r0.rts = r1
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setStopbits(io.netty.channel.rxtx.RxtxChannelConfig.Stopbits r1) {
            r0 = this;
            r0.stopbits = r1
            return r0
    }

    @Override // io.netty.channel.rxtx.RxtxChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setWaitTimeMillis(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.waitTime = r2
            return r1
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wait time must be >= 0"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.rxtx.RxtxChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.rxtx.RxtxChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
