package io.netty.channel.socket;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultDatagramChannelConfig extends io.netty.channel.DefaultChannelConfig implements io.netty.channel.socket.DatagramChannelConfig {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private volatile boolean activeOnOpen;
    private final java.net.DatagramSocket javaSocket;

    static {
            java.lang.Class<io.netty.channel.socket.DefaultDatagramChannelConfig> r0 = io.netty.channel.socket.DefaultDatagramChannelConfig.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.socket.DefaultDatagramChannelConfig.logger = r0
            return
    }

    public DefaultDatagramChannelConfig(io.netty.channel.socket.DatagramChannel r3, java.net.DatagramSocket r4) {
            r2 = this;
            io.netty.channel.FixedRecvByteBufAllocator r0 = new io.netty.channel.FixedRecvByteBufAllocator
            r1 = 2048(0x800, float:2.87E-42)
            r0.<init>(r1)
            r2.<init>(r3, r0)
            if (r4 == 0) goto Lf
            r2.javaSocket = r4
            return
        Lf:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "javaSocket"
            r3.<init>(r4)
            throw r3
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

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public java.net.InetAddress getInterface() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket
            boolean r1 = r0 instanceof java.net.MulticastSocket
            if (r1 == 0) goto L14
            java.net.MulticastSocket r0 = (java.net.MulticastSocket) r0     // Catch: java.net.SocketException -> Ld
            java.net.InetAddress r0 = r0.getInterface()     // Catch: java.net.SocketException -> Ld
            return r0
        Ld:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public java.net.NetworkInterface getNetworkInterface() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket
            boolean r1 = r0 instanceof java.net.MulticastSocket
            if (r1 == 0) goto L14
            java.net.MulticastSocket r0 = (java.net.MulticastSocket) r0     // Catch: java.net.SocketException -> Ld
            java.net.NetworkInterface r0 = r0.getNetworkInterface()     // Catch: java.net.SocketException -> Ld
            return r0
        Ld:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
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
            java.lang.Object r2 = super.getOption(r2)
            return r2
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r4 = this;
            java.util.Map r0 = super.getOptions()
            r1 = 10
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
            java.util.Map r0 = r4.getOptions(r0, r1)
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public int getReceiveBufferSize() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            int r0 = r0.getReceiveBufferSize()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public int getSendBufferSize() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            int r0 = r0.getSendBufferSize()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public int getTimeToLive() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket
            boolean r1 = r0 instanceof java.net.MulticastSocket
            if (r1 == 0) goto L14
            java.net.MulticastSocket r0 = (java.net.MulticastSocket) r0     // Catch: java.io.IOException -> Ld
            int r0 = r0.getTimeToLive()     // Catch: java.io.IOException -> Ld
            return r0
        Ld:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public int getTrafficClass() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            int r0 = r0.getTrafficClass()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public boolean isBroadcast() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            boolean r0 = r0.getBroadcast()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public boolean isLoopbackModeDisabled() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket
            boolean r1 = r0 instanceof java.net.MulticastSocket
            if (r1 == 0) goto L14
            java.net.MulticastSocket r0 = (java.net.MulticastSocket) r0     // Catch: java.net.SocketException -> Ld
            boolean r0 = r0.getLoopbackMode()     // Catch: java.net.SocketException -> Ld
            return r0
        Ld:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public boolean isReuseAddress() {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket     // Catch: java.net.SocketException -> L7
            boolean r0 = r0.getReuseAddress()     // Catch: java.net.SocketException -> L7
            return r0
        L7:
            r0 = move-exception
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            r1.<init>(r0)
            throw r1
    }

    protected final java.net.DatagramSocket javaSocket() {
            r1 = this;
            java.net.DatagramSocket r0 = r1.javaSocket
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setAllocator(io.netty.buffer.ByteBufAllocator r1) {
            r0 = this;
            super.setAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setAutoClose(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setAutoClose(boolean r1) {
            r0 = this;
            super.setAutoClose(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setBroadcast(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L3e
            java.net.DatagramSocket r0 = r3.javaSocket     // Catch: java.net.SocketException -> L3c
            java.net.InetAddress r0 = r0.getLocalAddress()     // Catch: java.net.SocketException -> L3c
            boolean r0 = r0.isAnyLocalAddress()     // Catch: java.net.SocketException -> L3c
            if (r0 != 0) goto L3e
            boolean r0 = io.netty.util.internal.PlatformDependent.isWindows()     // Catch: java.net.SocketException -> L3c
            if (r0 != 0) goto L3e
            boolean r0 = io.netty.util.internal.PlatformDependent.maybeSuperUser()     // Catch: java.net.SocketException -> L3c
            if (r0 != 0) goto L3e
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.socket.DefaultDatagramChannelConfig.logger     // Catch: java.net.SocketException -> L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.net.SocketException -> L3c
            r1.<init>()     // Catch: java.net.SocketException -> L3c
            java.lang.String r2 = "A non-root user can't receive a broadcast packet if the socket is not bound to a wildcard address; setting the SO_BROADCAST flag anyway as requested on the socket which is bound to "
            r1.append(r2)     // Catch: java.net.SocketException -> L3c
            java.net.DatagramSocket r2 = r3.javaSocket     // Catch: java.net.SocketException -> L3c
            java.net.SocketAddress r2 = r2.getLocalSocketAddress()     // Catch: java.net.SocketException -> L3c
            r1.append(r2)     // Catch: java.net.SocketException -> L3c
            r2 = 46
            r1.append(r2)     // Catch: java.net.SocketException -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.net.SocketException -> L3c
            r0.warn(r1)     // Catch: java.net.SocketException -> L3c
            goto L3e
        L3c:
            r4 = move-exception
            goto L44
        L3e:
            java.net.DatagramSocket r0 = r3.javaSocket     // Catch: java.net.SocketException -> L3c
            r0.setBroadcast(r4)     // Catch: java.net.SocketException -> L3c
            return r3
        L44:
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r4)
            throw r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setConnectTimeoutMillis(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setConnectTimeoutMillis(int r1) {
            r0 = this;
            super.setConnectTimeoutMillis(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setInterface(java.net.InetAddress r3) {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket
            boolean r1 = r0 instanceof java.net.MulticastSocket
            if (r1 == 0) goto L13
            java.net.MulticastSocket r0 = (java.net.MulticastSocket) r0     // Catch: java.net.SocketException -> Lc
            r0.setInterface(r3)     // Catch: java.net.SocketException -> Lc
            return r2
        Lc:
            r3 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r3)
            throw r0
        L13:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setLoopbackModeDisabled(boolean r3) {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket
            boolean r1 = r0 instanceof java.net.MulticastSocket
            if (r1 == 0) goto L13
            java.net.MulticastSocket r0 = (java.net.MulticastSocket) r0     // Catch: java.net.SocketException -> Lc
            r0.setLoopbackMode(r3)     // Catch: java.net.SocketException -> Lc
            return r2
        Lc:
            r3 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r3)
            throw r0
        L13:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setMaxMessagesPerRead(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @java.lang.Deprecated
    public io.netty.channel.socket.DatagramChannelConfig setMaxMessagesPerRead(int r1) {
            r0 = this;
            super.setMaxMessagesPerRead(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setMessageSizeEstimator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setMessageSizeEstimator(io.netty.channel.MessageSizeEstimator r1) {
            r0 = this;
            super.setMessageSizeEstimator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setNetworkInterface(java.net.NetworkInterface r3) {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket
            boolean r1 = r0 instanceof java.net.MulticastSocket
            if (r1 == 0) goto L13
            java.net.MulticastSocket r0 = (java.net.MulticastSocket) r0     // Catch: java.net.SocketException -> Lc
            r0.setNetworkInterface(r3)     // Catch: java.net.SocketException -> Lc
            return r2
        Lc:
            r3 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r3)
            throw r0
        L13:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r2, T r3) {
            r1 = this;
            r1.validate(r2, r3)
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_BROADCAST
            if (r2 != r0) goto L12
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setBroadcast(r2)
            goto L88
        L12:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_RCVBUF
            if (r2 != r0) goto L21
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setReceiveBufferSize(r2)
            goto L88
        L21:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.SO_SNDBUF
            if (r2 != r0) goto L2f
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setSendBufferSize(r2)
            goto L88
        L2f:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.SO_REUSEADDR
            if (r2 != r0) goto L3d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setReuseAddress(r2)
            goto L88
        L3d:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_LOOP_DISABLED
            if (r2 != r0) goto L4b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setLoopbackModeDisabled(r2)
            goto L88
        L4b:
            io.netty.channel.ChannelOption<java.net.InetAddress> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_ADDR
            if (r2 != r0) goto L55
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            r1.setInterface(r3)
            goto L88
        L55:
            io.netty.channel.ChannelOption<java.net.NetworkInterface> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_IF
            if (r2 != r0) goto L5f
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3
            r1.setNetworkInterface(r3)
            goto L88
        L5f:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_MULTICAST_TTL
            if (r2 != r0) goto L6d
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTimeToLive(r2)
            goto L88
        L6d:
            io.netty.channel.ChannelOption<java.lang.Integer> r0 = io.netty.channel.ChannelOption.IP_TOS
            if (r2 != r0) goto L7b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r1.setTrafficClass(r2)
            goto L88
        L7b:
            io.netty.channel.ChannelOption<java.lang.Boolean> r0 = io.netty.channel.ChannelOption.DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION
            if (r2 != r0) goto L8a
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            r1.setActiveOnOpen(r2)
        L88:
            r2 = 1
            return r2
        L8a:
            boolean r2 = super.setOption(r2, r3)
            return r2
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setReceiveBufferSize(int r2) {
            r1 = this;
            java.net.DatagramSocket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
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
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setRecvByteBufAllocator(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setRecvByteBufAllocator(io.netty.channel.RecvByteBufAllocator r1) {
            r0 = this;
            super.setRecvByteBufAllocator(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setReuseAddress(boolean r2) {
            r1 = this;
            java.net.DatagramSocket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
            r0.setReuseAddress(r2)     // Catch: java.net.SocketException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setSendBufferSize(int r2) {
            r1 = this;
            java.net.DatagramSocket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
            r0.setSendBufferSize(r2)     // Catch: java.net.SocketException -> L6
            return r1
        L6:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setTimeToLive(int r3) {
            r2 = this;
            java.net.DatagramSocket r0 = r2.javaSocket
            boolean r1 = r0 instanceof java.net.MulticastSocket
            if (r1 == 0) goto L13
            java.net.MulticastSocket r0 = (java.net.MulticastSocket) r0     // Catch: java.io.IOException -> Lc
            r0.setTimeToLive(r3)     // Catch: java.io.IOException -> Lc
            return r2
        Lc:
            r3 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r3)
            throw r0
        L13:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
    }

    @Override // io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setTrafficClass(int r2) {
            r1 = this;
            java.net.DatagramSocket r0 = r1.javaSocket     // Catch: java.net.SocketException -> L6
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
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setWriteBufferHighWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setWriteBufferHighWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferHighWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setWriteBufferLowWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setWriteBufferLowWaterMark(int r1) {
            r0 = this;
            super.setWriteBufferLowWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setWriteBufferWaterMark(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setWriteBufferWaterMark(io.netty.channel.WriteBufferWaterMark r1) {
            r0 = this;
            super.setWriteBufferWaterMark(r1)
            return r0
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setWriteSpinCount(r1)
            return r1
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setWriteSpinCount(int r1) {
            r0 = this;
            super.setWriteSpinCount(r1)
            return r0
    }
}
