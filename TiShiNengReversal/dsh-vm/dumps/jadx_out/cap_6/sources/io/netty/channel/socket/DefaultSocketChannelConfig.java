package io.netty.channel.socket;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultSocketChannelConfig extends io.netty.channel.DefaultChannelConfig implements io.netty.channel.socket.SocketChannelConfig {
    private volatile boolean allowHalfClosure;
    protected final java.net.Socket javaSocket;

    public DefaultSocketChannelConfig(io.netty.channel.socket.SocketChannel r1, java.net.Socket r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L12
            r0.javaSocket = r2
            boolean r1 = io.netty.util.internal.PlatformDependent.canEnableTcpNoDelayByDefault()
            if (r1 == 0) goto L11
            r1 = 1
            r0.setTcpNoDelay(r1)     // Catch: java.lang.Exception -> L11
        L11:
            return
        L12:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "javaSocket"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto Ld
            int r2 = r1.getReceiveBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Ld:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L1a
            int r2 = r1.getSendBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L1a:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.TCP_NODELAY
            if (r2 != r0) goto L27
            boolean r2 = r1.isTcpNoDelay()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L27:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_KEEPALIVE
            if (r2 != r0) goto L34
            boolean r2 = r1.isKeepAlive()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L34:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L41
            boolean r2 = r1.isReuseAddress()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L41:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_LINGER
            if (r2 != r0) goto L4e
            int r2 = r1.getSoLinger()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L4e:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_TOS
            if (r2 != r0) goto L5b
            int r2 = r1.getTrafficClass()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L5b:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.ALLOW_HALF_CLOSURE
            if (r2 != r0) goto L68
            boolean r2 = r1.isAllowHalfClosure()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
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
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_RCVBUF
            r3 = 0
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_SNDBUF
            r3 = 1
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.TCP_NODELAY
            r3 = 2
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.SO_KEEPALIVE
            r3 = 3
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.SO_REUSEADDR
            r3 = 4
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_LINGER
            r3 = 5
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.IP_TOS
            r3 = 6
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.ALLOW_HALF_CLOSURE
            r3 = 7
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public int getReceiveBufferSize() {
            r2 = this;
            java.net.Socket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            int r0 = r0.getReceiveBufferSize()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public int getSendBufferSize() {
            r2 = this;
            java.net.Socket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            int r0 = r0.getSendBufferSize()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public int getSoLinger() {
            r2 = this;
            java.net.Socket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            int r0 = r0.getSoLinger()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public int getTrafficClass() {
            r2 = this;
            java.net.Socket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            int r0 = r0.getTrafficClass()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public boolean isAllowHalfClosure() {
            r1 = this;
            boolean r0 = r1.allowHalfClosure
            return r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public boolean isKeepAlive() {
            r2 = this;
            java.net.Socket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            boolean r0 = r0.getKeepAlive()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public boolean isReuseAddress() {
            r2 = this;
            java.net.Socket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            boolean r0 = r0.getReuseAddress()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public boolean isTcpNoDelay() {
            r2 = this;
            java.net.Socket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            boolean r0 = r0.getTcpNoDelay()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setAllowHalfClosure(boolean r1) {
            r0 = this;
            r0.allowHalfClosure = r1
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setKeepAlive(boolean r2) {
            r1 = this;
            java.net.Socket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
            r0.setKeepAlive(r2)     // Catch: java.net.SocketException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.socket.SocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto L11
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setReceiveBufferSize(r2)
            goto L72
        L11:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L1f
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSendBufferSize(r2)
            goto L72
        L1f:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.TCP_NODELAY
            if (r2 != r0) goto L2d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setTcpNoDelay(r2)
            goto L72
        L2d:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_KEEPALIVE
            if (r2 != r0) goto L3b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setKeepAlive(r2)
            goto L72
        L3b:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L49
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setReuseAddress(r2)
            goto L72
        L49:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_LINGER
            if (r2 != r0) goto L57
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSoLinger(r2)
            goto L72
        L57:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_TOS
            if (r2 != r0) goto L65
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTrafficClass(r2)
            goto L72
        L65:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.ALLOW_HALF_CLOSURE
            if (r2 != r0) goto L74
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setAllowHalfClosure(r2)
        L72:
            r2 = 1
            return r2
        L74:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setPerformancePreferences(int r2, int r3, int r4) {
            r1 = this;
            java.net.Socket r0 = r1.javaSocket
            r0.setPerformancePreferences(r2, r3, r4)
            return r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setReceiveBufferSize(int r2) {
            r1 = this;
            java.net.Socket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
            r0.setReceiveBufferSize(r2)     // Catch: java.net.SocketException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setReuseAddress(boolean r2) {
            r1 = this;
            java.net.Socket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
            r0.setReuseAddress(r2)     // Catch: java.net.SocketException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setSendBufferSize(int r2) {
            r1 = this;
            java.net.Socket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
            r0.setSendBufferSize(r2)     // Catch: java.net.SocketException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setSoLinger(int r3) {
            r2 = this;
            if (r3 >= 0) goto Lb
            java.net.Socket r3 = r2.javaSocket     // Catch: java.net.SocketException -> L9
            r0 = 0
            r3.setSoLinger(r0, r0)     // Catch: java.net.SocketException -> L9
            return r2
        L9:
            r3 = move-exception
            goto L12
        Lb:
            java.net.Socket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L9
            r1 = 1
            r0.setSoLinger(r1, r3)     // Catch: java.net.SocketException -> L9
            return r2
        L12:
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r3)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setTcpNoDelay(boolean r2) {
            r1 = this;
            java.net.Socket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
            r0.setTcpNoDelay(r2)     // Catch: java.net.SocketException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setTrafficClass(int r2) {
            r1 = this;
            java.net.Socket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
            r0.setTrafficClass(r2)     // Catch: java.net.SocketException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.socket.SocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.SocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
