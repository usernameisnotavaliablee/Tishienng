package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class EpollDatagramChannelConfig extends io.netty.channel.epoll.EpollChannelConfig implements io.netty.channel.socket.DatagramChannelConfig {
    private static final io.netty.channel.RecvByteBufAllocator DEFAULT_RCVBUF_ALLOCATOR = null;
    private boolean activeOnOpen;

    static {
            io.netty.channel.FixedRecvByteBufAllocator r0 = new io.netty.channel.FixedRecvByteBufAllocator
            r1 = 2048(0x800, float:2.87E-42)
            r0.<init>(r1)
            io.netty.channel.epoll.EpollDatagramChannelConfig.DEFAULT_RCVBUF_ALLOCATOR = r0
            return
    }

    EpollDatagramChannelConfig(io.netty.channel.epoll.EpollDatagramChannel r1) {
            r0 = this;
            r0.<init>(r1)
            io.netty.channel.RecvByteBufAllocator r1 = io.netty.channel.epoll.EpollDatagramChannelConfig.DEFAULT_RCVBUF_ALLOCATOR
            r0.setRecvByteBufAllocator(r1)
            return
    }

    private void setActiveOnOpen(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            boolean r0 = r0.isRegistered()
            if (r0 != 0) goto Lb
            r1.activeOnOpen = r2
            return
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can only changed before channel was registered"
            r2.<init>(r0)
            throw r2
    }

    boolean getActiveOnOpen() {
            r1 = this;
            boolean r0 = r1.activeOnOpen
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public java.net.InetAddress getInterface() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            java.net.InetAddress r0 = r0.getInterface()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public java.net.NetworkInterface getNetworkInterface() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            java.net.NetworkInterface r0 = r0.getNetworkInterface()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r2) {
            r1 = this;
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_BROADCAST
            if (r2 != r0) goto Ld
            boolean r2 = r1.isBroadcast()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        Ld:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto L1a
            int r2 = r1.getReceiveBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L1a:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L27
            int r2 = r1.getSendBufferSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L27:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L34
            boolean r2 = r1.isReuseAddress()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L34:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_LOOP_DISABLED
            if (r2 != r0) goto L41
            boolean r2 = r1.isLoopbackModeDisabled()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L41:
            io.netty.channel.ChannelOption<java.net.InetAddress> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_ADDR
            if (r2 != r0) goto L4a
            java.net.InetAddress r2 = r1.getInterface()
            return r2
        L4a:
            io.netty.channel.ChannelOption<java.net.NetworkInterface> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_IF
            if (r2 != r0) goto L53
            java.net.NetworkInterface r2 = r1.getNetworkInterface()
            return r2
        L53:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_TTL
            if (r2 != r0) goto L60
            int r2 = r1.getTimeToLive()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L60:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_TOS
            if (r2 != r0) goto L6d
            int r2 = r1.getTrafficClass()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L6d:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION
            if (r2 != r0) goto L78
            boolean r2 = r1.activeOnOpen
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L78:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT
            if (r2 != r0) goto L85
            boolean r2 = r1.isReusePort()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L85:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT
            if (r2 != r0) goto L92
            boolean r2 = r1.isIpTransparent()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L92:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_FREEBIND
            if (r2 != r0) goto L9f
            boolean r2 = r1.isFreeBind()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L9f:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_RECVORIGDSTADDR
            if (r2 != r0) goto Lac
            boolean r2 = r1.isIpRecvOrigDestAddr()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        Lac:
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 14
            io.netty.channel.ChannelOption[] r1 = new io.netty.channel.ChannelOption[r1]
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.SO_BROADCAST
            r3 = 0
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_RCVBUF
            r3 = 1
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.SO_SNDBUF
            r3 = 2
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.SO_REUSEADDR
            r3 = 3
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.IP_MULTICAST_LOOP_DISABLED
            r3 = 4
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.net.InetAddress> r2 = io.netty.channel.ChannelOption.IP_MULTICAST_ADDR
            r3 = 5
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.net.NetworkInterface> r2 = io.netty.channel.ChannelOption.IP_MULTICAST_IF
            r3 = 6
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.IP_MULTICAST_TTL
            r3 = 7
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Integer> r2 = io.netty.channel.ChannelOption.IP_TOS
            r3 = 8
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION
            r3 = 9
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT
            r3 = 10
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.epoll.EpollChannelOption.IP_FREEBIND
            r3 = 11
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT
            r3 = 12
            r1[r3] = r2
            io.netty.channel.ChannelOption<java.lang.Boolean> r2 = io.netty.channel.epoll.EpollChannelOption.IP_RECVORIGDSTADDR
            r3 = 13
            r1[r3] = r2
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public int getReceiveBufferSize() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getReceiveBufferSize()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public int getSendBufferSize() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getSendBufferSize()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public int getTimeToLive() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getTimeToLive()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public int getTrafficClass() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            int r0 = r0.getTrafficClass()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public boolean isBroadcast() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isBroadcast()     // Catch: java.io.IOException -> Lb
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
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isIpFreeBind()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    public boolean isIpRecvOrigDestAddr() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isIpRecvOrigDestAddr()     // Catch: java.io.IOException -> Lb
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
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isIpTransparent()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public boolean isLoopbackModeDisabled() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isLoopbackModeDisabled()     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public boolean isReuseAddress() {
            r2 = this;
            io.netty.channel.Channel r0 = r2.channel     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isReuseAddress()     // Catch: java.io.IOException -> Lb
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
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> Lb
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> Lb
            boolean r0 = r0.isReusePort()     // Catch: java.io.IOException -> Lb
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
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setBroadcast(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setBroadcast(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setBroadcast(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setBroadcast(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setEpollMode(io.netty.channel.epoll.EpollMode r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setEpollMode(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setEpollMode(io.netty.channel.epoll.EpollMode r1) {
            r0 = this;
            super.setEpollMode(r1)
            return r0
    }

    public io.netty.channel.epoll.EpollDatagramChannelConfig setFreeBind(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setIpFreeBind(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setInterface(java.net.InetAddress r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setInterface(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setInterface(java.net.InetAddress r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setInterface(r1)
            return r1
    }

    public io.netty.channel.epoll.EpollDatagramChannelConfig setIpRecvOrigDestAddr(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setIpRecvOrigDestAddr(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    public io.netty.channel.epoll.EpollDatagramChannelConfig setIpTransparent(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setIpTransparent(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setLoopbackModeDisabled(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setLoopbackModeDisabled(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollDatagramChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setNetworkInterface(java.net.NetworkInterface r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setNetworkInterface(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setNetworkInterface(java.net.NetworkInterface r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setNetworkInterface(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_BROADCAST
            if (r2 != r0) goto L12
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setBroadcast(r2)
            goto Lc4
        L12:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto L21
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setReceiveBufferSize(r2)
            goto Lc4
        L21:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L30
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSendBufferSize(r2)
            goto Lc4
        L30:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L3f
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setReuseAddress(r2)
            goto Lc4
        L3f:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_LOOP_DISABLED
            if (r2 != r0) goto L4e
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setLoopbackModeDisabled(r2)
            goto Lc4
        L4e:
            io.netty.channel.ChannelOption<java.net.InetAddress> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_ADDR
            if (r2 != r0) goto L59
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            r1.setInterface(r3)
            goto Lc4
        L59:
            io.netty.channel.ChannelOption<java.net.NetworkInterface> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_IF
            if (r2 != r0) goto L63
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3
            r1.setNetworkInterface(r3)
            goto Lc4
        L63:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_TTL
            if (r2 != r0) goto L71
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTimeToLive(r2)
            goto Lc4
        L71:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_TOS
            if (r2 != r0) goto L7f
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTrafficClass(r2)
            goto Lc4
        L7f:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION
            if (r2 != r0) goto L8d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setActiveOnOpen(r2)
            goto Lc4
        L8d:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.unix.UnixChannelOption.SO_REUSEPORT
            if (r2 != r0) goto L9b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setReusePort(r2)
            goto Lc4
        L9b:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_FREEBIND
            if (r2 != r0) goto La9
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setFreeBind(r2)
            goto Lc4
        La9:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_TRANSPARENT
            if (r2 != r0) goto Lb7
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setIpTransparent(r2)
            goto Lc4
        Lb7:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.epoll.EpollChannelOption.IP_RECVORIGDSTADDR
            if (r2 != r0) goto Lc6
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setIpRecvOrigDestAddr(r2)
        Lc4:
            r2 = 1
            return r2
        Lc6:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setReceiveBufferSize(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setReceiveBufferSize(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setReceiveBufferSize(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setReceiveBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setReuseAddress(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setReuseAddress(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setReuseAddress(boolean r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setReuseAddress(r1)
            return r1
    }

    public io.netty.channel.epoll.EpollDatagramChannelConfig setReusePort(boolean r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setReusePort(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setSendBufferSize(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setSendBufferSize(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setSendBufferSize(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setSendBufferSize(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setTimeToLive(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTimeToLive(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setTimeToLive(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setTimeToLive(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setTrafficClass(int r2) {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.EpollDatagramChannel r0 = (io.netty.channel.epoll.EpollDatagramChannel) r0     // Catch: java.io.IOException -> La
            io.netty.channel.epoll.LinuxSocket r0 = r0.socket     // Catch: java.io.IOException -> La
            r0.setTrafficClass(r2)     // Catch: java.io.IOException -> La
            return r1
        La:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setTrafficClass(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setTrafficClass(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollDatagramChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.epoll.EpollDatagramChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.epoll.EpollChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.epoll.EpollDatagramChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }

    @Override // io.netty.channel.epoll.EpollChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.socket.DatagramChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.epoll.EpollDatagramChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }
}
