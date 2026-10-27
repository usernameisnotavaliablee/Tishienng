package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollSocketChannelConfig extends io.netty.channel.epoll.EpollChannelConfig implements io.netty.channel.socket.SocketChannelConfig {
    private volatile boolean allowHalfClosure;

    EpollSocketChannelConfig(io.netty.channel.epoll.EpollSocketChannel r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = io.netty.util.internal.PlatformDependent.canEnableTcpNoDelayByDefault()
            if (r1 == 0) goto Ld
            r1 = 1
            r0.setTcpNoDelay(r1)
        Ld:
            r0.calculateMaxBytesPerGatheringWrite()
            return
    }

    private void calculateMaxBytesPerGatheringWrite() {
            r2 = this;
            int r0 = r2.getSendBufferSize()
            int r0 = r0 << 1
            if (r0 <= 0) goto L12
            int r0 = r2.getSendBufferSize()
            int r0 = r0 << 1
            long r0 = (long) r0
            r2.setMaxBytesPerGatheringWrite(r0)
        L12:
            return
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r3) {
            r2 = this;
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r3 != r0) goto Ld
            int r3 = r2.getReceiveBufferSize()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        Ld:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r3 != r0) goto L1a
            int r3 = r2.getSendBufferSize()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L1a:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.TCP_NODELAY
            if (r3 != r0) goto L27
            boolean r3 = r2.isTcpNoDelay()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L27:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_KEEPALIVE
            if (r3 != r0) goto L34
            boolean r3 = r2.isKeepAlive()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L34:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r3 != r0) goto L41
            boolean r3 = r2.isReuseAddress()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L41:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_LINGER
            if (r3 != r0) goto L4e
            int r3 = r2.getSoLinger()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L4e:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_TOS
            if (r3 != r0) goto L5b
            int r3 = r2.getTrafficClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L5b:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.ALLOW_HALF_CLOSURE
            if (r3 != r0) goto L68
            boolean r3 = r2.isAllowHalfClosure()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L68:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_CORK
            if (r3 != r0) goto L75
            boolean r3 = r2.isTcpCork()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L75:
            io.netty.channel.ChannelOption<java.lang.Long> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_NOTSENT_LOWAT
            if (r3 != r0) goto L82
            long r0 = r2.getTcpNotSentLowAt()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L82:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_KEEPIDLE
            if (r3 != r0) goto L8f
            int r3 = r2.getTcpKeepIdle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L8f:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_KEEPINTVL
            if (r3 != r0) goto L9c
            int r3 = r2.getTcpKeepIntvl()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L9c:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_KEEPCNT
            if (r3 != r0) goto La9
            int r3 = r2.getTcpKeepCnt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        La9:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_USER_TIMEOUT
            if (r3 != r0) goto Lb6
            int r3 = r2.getTcpUserTimeout()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        Lb6:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_QUICKACK
            if (r3 != r0) goto Lc3
            boolean r3 = r2.isTcpQuickAck()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        Lc3:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT
            if (r3 != r0) goto Ld0
            boolean r3 = r2.isIpTransparent()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        Ld0:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_FASTOPEN_CONNECT
            if (r3 != r0) goto Ldd
            boolean r3 = r2.isTcpFastOpenConnect()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        Ldd:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.SO_BUSY_POLL
            if (r3 != r0) goto Lea
            int r3 = r2.getSoBusyPoll()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        Lea:
            java.lang.Object r3 = super.getOption(r3)
            return r3
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 18
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
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.epoll.EpollChannelOption.TCP_CORK
            r3 = 8
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Long> r2 = io.netty.channel.epoll.EpollChannelOption.TCP_NOTSENT_LOWAT
            r3 = 9
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.epoll.EpollChannelOption.TCP_KEEPCNT
            r3 = 10
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.epoll.EpollChannelOption.TCP_KEEPIDLE
            r3 = 11
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.epoll.EpollChannelOption.TCP_KEEPINTVL
            r3 = 12
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.util.Map<java.net.InetAddress, byte[]>> r2 = io.netty.channel.epoll.EpollChannelOption.TCP_MD5SIG
            r3 = 13
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.epoll.EpollChannelOption.TCP_QUICKACK
            r3 = 14
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT
            r3 = 15
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.epoll.EpollChannelOption.TCP_FASTOPEN_CONNECT
            r3 = 16
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.epoll.EpollChannelOption.SO_BUSY_POLL
            r3 = 17
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public int getReceiveBufferSize() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getReceiveBufferSize()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public int getSendBufferSize() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getSendBufferSize()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public int getSoBusyPoll() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getSoBusyPoll()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public int getSoLinger() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getSoLinger()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public int getTcpKeepCnt() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getTcpKeepCnt()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public int getTcpKeepIdle() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getTcpKeepIdle()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public int getTcpKeepIntvl() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getTcpKeepIntvl()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public long getTcpNotSentLowAt() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            long r0 = r0.getTcpNotSentLowAt()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public int getTcpUserTimeout() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getTcpUserTimeout()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public int getTrafficClass() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getTrafficClass()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
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

    public boolean isIpTransparent() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isIpTransparent()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public boolean isKeepAlive() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isKeepAlive()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public boolean isReuseAddress() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isReuseAddress()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public boolean isTcpCork() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isTcpCork()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public boolean isTcpFastOpenConnect() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isTcpFastOpenConnect()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public boolean isTcpNoDelay() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isTcpNoDelay()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public boolean isTcpQuickAck() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isTcpQuickAck()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setAllowHalfClosure(boolean r1) {
            r0 = this;
            r0.allowHalfClosure = r1
            return r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setAllowHalfClosure(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setAllowHalfClosure(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setEpollMode(io.netty.channel.epoll.EpollMode r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setEpollMode(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setEpollMode(io.netty.channel.epoll.EpollMode r1) {
            r0 = this;
            super.setEpollMode(r1)
            return r0
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setIpTransparent(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setIpTransparent(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setKeepAlive(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setKeepAlive(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setKeepAlive(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setKeepAlive(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollSocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto L12
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setReceiveBufferSize(r2)
            goto L113
        L12:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L21
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSendBufferSize(r2)
            goto L113
        L21:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.TCP_NODELAY
            if (r2 != r0) goto L30
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setTcpNoDelay(r2)
            goto L113
        L30:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_KEEPALIVE
            if (r2 != r0) goto L3f
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setKeepAlive(r2)
            goto L113
        L3f:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L4e
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setReuseAddress(r2)
            goto L113
        L4e:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_LINGER
            if (r2 != r0) goto L5d
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSoLinger(r2)
            goto L113
        L5d:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_TOS
            if (r2 != r0) goto L6c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTrafficClass(r2)
            goto L113
        L6c:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.ALLOW_HALF_CLOSURE
            if (r2 != r0) goto L7b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setAllowHalfClosure(r2)
            goto L113
        L7b:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_CORK
            if (r2 != r0) goto L8a
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setTcpCork(r2)
            goto L113
        L8a:
            io.netty.channel.ChannelOption<java.lang.Long> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_NOTSENT_LOWAT
            if (r2 != r0) goto L99
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.setTcpNotSentLowAt(r2)
            goto L113
        L99:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_KEEPIDLE
            if (r2 != r0) goto La8
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTcpKeepIdle(r2)
            goto L113
        La8:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_KEEPCNT
            if (r2 != r0) goto Lb6
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTcpKeepCnt(r2)
            goto L113
        Lb6:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_KEEPINTVL
            if (r2 != r0) goto Lc4
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTcpKeepIntvl(r2)
            goto L113
        Lc4:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_USER_TIMEOUT
            if (r2 != r0) goto Ld2
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTcpUserTimeout(r2)
            goto L113
        Ld2:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT
            if (r2 != r0) goto Le0
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setIpTransparent(r2)
            goto L113
        Le0:
            io.netty.channel.ChannelOption<java.util.Map<java.net.InetAddress, byte[]>> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_MD5SIG
            if (r2 != r0) goto Lea
            java.util.Map r3 = (java.util.Map) r3
            r1.setTcpMd5Sig(r3)
            goto L113
        Lea:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_QUICKACK
            if (r2 != r0) goto Lf8
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setTcpQuickAck(r2)
            goto L113
        Lf8:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.TCP_FASTOPEN_CONNECT
            if (r2 != r0) goto L106
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setTcpFastOpenConnect(r2)
            goto L113
        L106:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.epoll.EpollChannelOption.SO_BUSY_POLL
            if (r2 != r0) goto L115
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSoBusyPoll(r2)
        L113:
            r2 = 1
            return r2
        L115:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setPerformancePreferences(int r1, int r2, int r3) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setPerformancePreferences(r1, r2, r3)
            return r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setReceiveBufferSize(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setReceiveBufferSize(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setReuseAddress(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setReuseAddress(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setSendBufferSize(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> Ld
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> Ld
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Ld
            r0.setSendBufferSize(r2)     // Catch: java.io.IOException -> Ld
            r1.calculateMaxBytesPerGatheringWrite()     // Catch: java.io.IOException -> Ld
            return r1
        Ld:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setSendBufferSize(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setSendBufferSize(r1)
            return r1
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setSoBusyPoll(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setSoBusyPoll(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setSoLinger(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setSoLinger(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setSoLinger(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setSoLinger(r1)
            return r1
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpCork(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpCork(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpFastOpenConnect(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpFastOpenConnect(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpKeepCnt(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpKeepCnt(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpKeepCntl(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setTcpKeepCnt(r1)
            return r1
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpKeepIdle(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpKeepIdle(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpKeepIntvl(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpKeepIntvl(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpMd5Sig(java.util.Map<java.net.InetAddress, byte[]> r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> L8
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> L8
            r0.setTcpMd5Sig(r2)     // Catch: java.io.IOException -> L8
            return r1
        L8:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpNoDelay(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpNoDelay(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setTcpNoDelay(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setTcpNoDelay(r1)
            return r1
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpNotSentLowAt(long r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpNotSentLowAt(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r3 = new io.netty.channel.ChannelException
            r3.<init>(r2)
            throw r3
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpQuickAck(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpQuickAck(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    public io.netty.channel.epoll.EpollSocketChannelConfig setTcpUserTimeout(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTcpUserTimeout(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setTrafficClass(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollSocketChannel r0 = (io.netty.channel.epoll.EpollSocketChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTrafficClass(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.SocketChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setTrafficClass(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setTrafficClass(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollSocketChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollSocketChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollSocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.SocketChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollSocketChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }
}
