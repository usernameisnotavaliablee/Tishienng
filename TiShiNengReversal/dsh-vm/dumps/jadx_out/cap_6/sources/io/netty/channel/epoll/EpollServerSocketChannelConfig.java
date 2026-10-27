package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollServerSocketChannelConfig extends io.netty.channel.epoll.EpollServerChannelConfig implements io.netty.channel.socket.ServerSocketChannelConfig {
    EpollServerSocketChannelConfig(io.netty.channel.epoll.EpollServerSocketChannel r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.setReuseAddress(r1)
            return
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT
            if (r2 != r0) goto Ld
            boolean r2 = r1.isReusePort()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        Ld:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_FREEBIND
            if (r2 != r0) goto L1a
            boolean r2 = r1.isFreeBind()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L1a:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT
            if (r2 != r0) goto L27
            boolean r2 = r1.isIpTransparent()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L27:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_DEFER_ACCEPT
            if (r2 != r0) goto L34
            int r2 = r1.getTcpDeferAccept()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L34:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 4
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT
            r3 = 0
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.epoll.EpollChannelOption.IP_FREEBIND
            r3 = 1
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT
            r3 = 2
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.epoll.EpollChannelOption.TCP_DEFER_ACCEPT
            r3 = 3
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    public int getTcpDeferAccept() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollServerSocketChannel r0 = (io.netty.channel.epoll.EpollServerSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getTcpDeferAccept()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public boolean isFreeBind() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollServerSocketChannel r0 = (io.netty.channel.epoll.EpollServerSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isIpFreeBind()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public boolean isIpTransparent() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollServerSocketChannel r0 = (io.netty.channel.epoll.EpollServerSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isIpTransparent()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public boolean isReusePort() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollServerSocketChannel r0 = (io.netty.channel.epoll.EpollServerSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isReusePort()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setBacklog(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setBacklog(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setBacklog(int r1) {
            r0 = this;
            super.setBacklog(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setBacklog(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setBacklog(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    public io.netty.channel.epoll.EpollServerSocketChannelConfig setFreeBind(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollServerSocketChannel r0 = (io.netty.channel.epoll.EpollServerSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setIpFreeBind(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    public io.netty.channel.epoll.EpollServerSocketChannelConfig setIpTransparent(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollServerSocketChannel r0 = (io.netty.channel.epoll.EpollServerSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setIpTransparent(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT
            if (r2 != r0) goto L11
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setReusePort(r2)
            goto L44
        L11:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_FREEBIND
            if (r2 != r0) goto L1f
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setFreeBind(r2)
            goto L44
        L1f:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT
            if (r2 != r0) goto L2d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setIpTransparent(r2)
            goto L44
        L2d:
            io.netty.channel.ChannelOption<java.util.Map<java.net.InetAddress, byte[]>> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_MD5SIG
            if (r2 != r0) goto L37
            java.util.Map r3 = (java.util.Map) r3
            r1.setTcpMd5Sig(r3)
            goto L44
        L37:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_DEFER_ACCEPT
            if (r2 != r0) goto L46
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTcpDeferAccept(r2)
        L44:
            r2 = 1
            return r2
        L46:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setPerformancePreferences(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setPerformancePreferences(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            super.setReceiveBufferSize(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            super.setReuseAddress(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.socket.ServerSocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    public io.netty.channel.epoll.EpollServerSocketChannelConfig setReusePort(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollServerSocketChannel r0 = (io.netty.channel.epoll.EpollServerSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setReusePort(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    public io.netty.channel.epoll.EpollServerSocketChannelConfig setTcpDeferAccept(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollServerSocketChannel r0 = (io.netty.channel.epoll.EpollServerSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpDeferAccept(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    public io.netty.channel.epoll.EpollServerSocketChannelConfig setTcpMd5Sig(java.util.Map<java.net.InetAddress, byte[]> r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> L8
            io.netty.channel.epoll.EpollServerSocketChannel r0 = (io.netty.channel.epoll.EpollServerSocketChannel) r0     // Catch: java.io.IOException -> L8
            r0.setTcpMd5Sig(r2)     // Catch: java.io.IOException -> L8
            return r1
        L8:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollServerChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollServerSocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollServerChannelConfig, io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.ServerSocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollServerSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }
}
