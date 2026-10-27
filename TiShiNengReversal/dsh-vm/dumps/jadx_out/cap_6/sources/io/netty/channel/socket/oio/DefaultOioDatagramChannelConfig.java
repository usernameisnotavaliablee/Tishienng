package io.netty.channel.socket.oio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DefaultOioDatagramChannelConfig extends io.netty.channel.socket.DefaultDatagramChannelConfig implements io.netty.channel.socket.oio.OioDatagramChannelConfig {
    DefaultOioDatagramChannelConfig(io.netty.channel.socket.DatagramChannel r1, java.net.DatagramSocket r2) {
            r0 = this;
            r0.<init>(r1, r2)
            io.netty.channel.PreferHeapByteBufAllocator r1 = new io.netty.channel.PreferHeapByteBufAllocator
            io.netty.buffer.ByteBufAllocator r2 = r0.getAllocator()
            r1.<init>(r2)
            r0.setAllocator(r1)
            return
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_TIMEOUT
            if (r2 != r0) goto Ld
            int r2 = r1.getSoTimeout()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Ld:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 1
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_TIMEOUT
            r3 = 0
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.socket.oio.OioDatagramChannelConfig
    public int getSoTimeout() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket()     // Catch: java.io.IOException -> L9
            int r0 = r0.getSoTimeout()     // Catch: java.io.IOException -> L9
            return r0
        L9:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setBroadcast(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setBroadcast(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setBroadcast(boolean r1) {
            r0 = this;
            super.setBroadcast(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setInterface(java.net.InetAddress r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setInterface(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setInterface(java.net.InetAddress r1) {
            r0 = this;
            super.setInterface(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setLoopbackModeDisabled(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setLoopbackModeDisabled(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setLoopbackModeDisabled(boolean r1) {
            r0 = this;
            super.setLoopbackModeDisabled(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setNetworkInterface(java.net.NetworkInterface r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setNetworkInterface(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setNetworkInterface(java.net.NetworkInterface r1) {
            r0 = this;
            super.setNetworkInterface(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_TIMEOUT
            if (r2 != r0) goto L12
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSoTimeout(r2)
            r2 = 1
            return r2
        L12:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            super.setReceiveBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            super.setReuseAddress(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setSendBufferSize(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setSendBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setSendBufferSize(int r1) {
            r0 = this;
            super.setSendBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.socket.oio.OioDatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setSoTimeout(int r2) {
            r1 = this;
            java.net.DatagramSocket r0 = r1.javaSocket()     // Catch: java.io.IOException -> L8
            r0.setSoTimeout(r2)     // Catch: java.io.IOException -> L8
            return r1
        L8:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setTimeToLive(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setTimeToLive(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setTimeToLive(int r1) {
            r0 = this;
            super.setTimeToLive(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setTrafficClass(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setTrafficClass(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setTrafficClass(int r1) {
            r0 = this;
            super.setTrafficClass(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.socket.oio.OioDatagramChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.oio.OioDatagramChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
