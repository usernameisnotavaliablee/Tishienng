package io.netty.channel.udt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultUdtServerChannelConfig extends io.netty.channel.udt.DefaultUdtChannelConfig implements io.netty.channel.udt.UdtServerChannelConfig {
    private volatile int backlog;

    public DefaultUdtServerChannelConfig(io.netty.channel.udt.UdtChannel r1, com.barchart.udt.nio.ChannelUDT r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 64
            r0.backlog = r1
            if (r3 == 0) goto Lc
            r0.apply(r2)
        Lc:
            return
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig
    protected void apply(com.barchart.udt.nio.ChannelUDT r1) throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // io.netty.channel.udt.UdtServerChannelConfig
    public int getBacklog() {
            r1 = this;
            int r0 = r1.backlog
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_BACKLOG
            if (r2 != r0) goto Ld
            int r2 = r1.getBacklog()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Ld:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 1
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_BACKLOG
            r3 = 0
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.udt.UdtServerChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setBacklog(int r1) {
            r0 = this;
            r0.backlog = r1
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.udt.UdtServerChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_BACKLOG
            if (r2 != r0) goto L12
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setBacklog(r2)
            r2 = 1
            return r2
        L12:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setProtocolReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setProtocolReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setProtocolReceiveBufferSize(int r1) {
            r0 = this;
            super.setProtocolReceiveBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setProtocolSendBufferSize(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setProtocolSendBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setProtocolSendBufferSize(int r1) {
            r0 = this;
            super.setProtocolSendBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            super.setReceiveBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            super.setReuseAddress(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setSendBufferSize(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setSendBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setSendBufferSize(int r1) {
            r0 = this;
            super.setSendBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setSoLinger(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setSoLinger(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setSoLinger(int r1) {
            r0 = this;
            super.setSoLinger(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setSystemReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setSystemReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setSystemReceiveBufferSize(int r1) {
            r0 = this;
            super.setSystemReceiveBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setSystemSendBufferSize(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setSystemSendBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setSystemSendBufferSize(int r1) {
            r0 = this;
            super.setSystemSendBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.udt.UdtChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtServerChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.udt.DefaultUdtChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtServerChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
