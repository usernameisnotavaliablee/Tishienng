package io.netty.channel.udt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultUdtChannelConfig extends io.netty.channel.DefaultChannelConfig implements io.netty.channel.udt.UdtChannelConfig {
    private static final int K = 1024;
    private static final int M = 1048576;
    private volatile int allocatorReceiveBufferSize;
    private volatile int allocatorSendBufferSize;
    private volatile int protocolReceiveBufferSize;
    private volatile int protocolSendBufferSize;
    private volatile boolean reuseAddress;
    private volatile int soLinger;
    private volatile int systemReceiveBufferSize;
    private volatile int systemSendBufferSize;

    public DefaultUdtChannelConfig(io.netty.channel.udt.UdtChannel r1, com.barchart.udt.nio.ChannelUDT r2, boolean r3) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1)
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r0.protocolReceiveBufferSize = r1
            r0.protocolSendBufferSize = r1
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0.systemReceiveBufferSize = r1
            r0.systemSendBufferSize = r1
            r1 = 131072(0x20000, float:1.83671E-40)
            r0.allocatorReceiveBufferSize = r1
            r0.allocatorSendBufferSize = r1
            r1 = 1
            r0.reuseAddress = r1
            if (r3 == 0) goto L1d
            r0.apply(r2)
        L1d:
            return
    }

    protected void apply(com.barchart.udt.nio.ChannelUDT r3) throws java.io.IOException {
            r2 = this;
            com.barchart.udt.SocketUDT r3 = r3.socketUDT()
            boolean r0 = r2.isReuseAddress()
            r3.setReuseAddress(r0)
            int r0 = r2.getSendBufferSize()
            r3.setSendBufferSize(r0)
            int r0 = r2.getSoLinger()
            if (r0 > 0) goto L1d
            r0 = 0
            r3.setSoLinger(r0, r0)
            goto L25
        L1d:
            r0 = 1
            int r1 = r2.getSoLinger()
            r3.setSoLinger(r0, r1)
        L25:
            com.barchart.udt.OptionUDT r0 = com.barchart.udt.OptionUDT.Protocol_Receive_Buffer_Size
            int r1 = r2.getProtocolReceiveBufferSize()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.setOption(r0, r1)
            com.barchart.udt.OptionUDT r0 = com.barchart.udt.OptionUDT.Protocol_Send_Buffer_Size
            int r1 = r2.getProtocolSendBufferSize()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.setOption(r0, r1)
            com.barchart.udt.OptionUDT r0 = com.barchart.udt.OptionUDT.System_Receive_Buffer_Size
            int r1 = r2.getSystemReceiveBufferSize()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.setOption(r0, r1)
            com.barchart.udt.OptionUDT r0 = com.barchart.udt.OptionUDT.System_Send_Buffer_Size
            int r1 = r2.getSystemSendBufferSize()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.setOption(r0, r1)
            return
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.udt.UdtChannelOption.PROTOCOL_RECEIVE_BUFFER_SIZE
            if (r2 != r0) goto Ld
            int r2 = r1.getProtocolReceiveBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Ld:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.udt.UdtChannelOption.PROTOCOL_SEND_BUFFER_SIZE
            if (r2 != r0) goto L1a
            int r2 = r1.getProtocolSendBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L1a:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.udt.UdtChannelOption.SYSTEM_RECEIVE_BUFFER_SIZE
            if (r2 != r0) goto L27
            int r2 = r1.getSystemReceiveBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L27:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.udt.UdtChannelOption.SYSTEM_SEND_BUFFER_SIZE
            if (r2 != r0) goto L34
            int r2 = r1.getSystemSendBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L34:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto L41
            int r2 = r1.getReceiveBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L41:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L4e
            int r2 = r1.getSendBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L4e:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L5b
            boolean r2 = r1.isReuseAddress()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L5b:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_LINGER
            if (r2 != r0) goto L68
            int r2 = r1.getSoLinger()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L68:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 8
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.udt.UdtChannelOption.PROTOCOL_RECEIVE_BUFFER_SIZE
            r3 = 0
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.udt.UdtChannelOption.PROTOCOL_SEND_BUFFER_SIZE
            r3 = 1
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.udt.UdtChannelOption.SYSTEM_RECEIVE_BUFFER_SIZE
            r3 = 2
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.udt.UdtChannelOption.SYSTEM_SEND_BUFFER_SIZE
            r3 = 3
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_RCVBUF
            r3 = 4
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_SNDBUF
            r3 = 5
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.SO_REUSEADDR
            r3 = 6
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_LINGER
            r3 = 7
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public int getProtocolReceiveBufferSize() {
            r1 = this;
            int r0 = r1.protocolReceiveBufferSize
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public int getProtocolSendBufferSize() {
            r1 = this;
            int r0 = r1.protocolSendBufferSize
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public int getReceiveBufferSize() {
            r1 = this;
            int r0 = r1.allocatorReceiveBufferSize
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public int getSendBufferSize() {
            r1 = this;
            int r0 = r1.allocatorSendBufferSize
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public int getSoLinger() {
            r1 = this;
            int r0 = r1.soLinger
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public int getSystemReceiveBufferSize() {
            r1 = this;
            int r0 = r1.systemReceiveBufferSize
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public int getSystemSendBufferSize() {
            r1 = this;
            int r0 = r1.systemSendBufferSize
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public boolean isReuseAddress() {
            r1 = this;
            boolean r0 = r1.reuseAddress
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.udt.UdtChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.udt.UdtChannelOption.PROTOCOL_RECEIVE_BUFFER_SIZE
            if (r2 != r0) goto L11
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setProtocolReceiveBufferSize(r2)
            goto L72
        L11:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.udt.UdtChannelOption.PROTOCOL_SEND_BUFFER_SIZE
            if (r2 != r0) goto L1f
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setProtocolSendBufferSize(r2)
            goto L72
        L1f:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.udt.UdtChannelOption.SYSTEM_RECEIVE_BUFFER_SIZE
            if (r2 != r0) goto L2d
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSystemReceiveBufferSize(r2)
            goto L72
        L2d:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.udt.UdtChannelOption.SYSTEM_SEND_BUFFER_SIZE
            if (r2 != r0) goto L3b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSystemSendBufferSize(r2)
            goto L72
        L3b:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto L49
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setReceiveBufferSize(r2)
            goto L72
        L49:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L57
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSendBufferSize(r2)
            goto L72
        L57:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L65
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setReuseAddress(r2)
            goto L72
        L65:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_LINGER
            if (r2 != r0) goto L74
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSoLinger(r2)
        L72:
            r2 = 1
            return r2
        L74:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setProtocolReceiveBufferSize(int r1) {
            r0 = this;
            r0.protocolReceiveBufferSize = r1
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setProtocolSendBufferSize(int r1) {
            r0 = this;
            r0.protocolSendBufferSize = r1
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            r0.allocatorReceiveBufferSize = r1
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            r0.reuseAddress = r1
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setSendBufferSize(int r1) {
            r0 = this;
            r0.allocatorSendBufferSize = r1
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setSoLinger(int r1) {
            r0 = this;
            r0.soLinger = r1
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setSystemReceiveBufferSize(int r1) {
            r0 = this;
            r0.systemSendBufferSize = r1
            return r0
    }

    @Override // io.netty.channel.udt.UdtChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setSystemSendBufferSize(int r1) {
            r0 = this;
            r0.systemReceiveBufferSize = r1
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.udt.UdtChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.udt.UdtChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
