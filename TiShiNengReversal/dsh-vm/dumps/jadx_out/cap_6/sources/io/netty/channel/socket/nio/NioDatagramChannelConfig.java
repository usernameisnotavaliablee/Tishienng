package io.netty.channel.socket.nio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class NioDatagramChannelConfig extends io.netty.channel.socket.DefaultDatagramChannelConfig {
    private static final java.lang.reflect.Method GET_OPTION = null;
    private static final java.lang.Object IP_MULTICAST_IF = null;
    private static final java.lang.Object IP_MULTICAST_LOOP = null;
    private static final java.lang.Object IP_MULTICAST_TTL = null;
    private static final java.lang.reflect.Method SET_OPTION = null;
    private final java.nio.channels.DatagramChannel javaChannel;

    static {
            java.lang.Class<java.nio.channels.DatagramChannel> r0 = java.nio.channels.DatagramChannel.class
            java.lang.ClassLoader r0 = io.netty.util.internal.PlatformDependent.getClassLoader(r0)
            r1 = 1
            r2 = 0
            java.lang.String r3 = "java.net.SocketOption"
            java.lang.Class r3 = java.lang.Class.forName(r3, r1, r0)     // Catch: java.lang.Exception -> Lf
            goto L10
        Lf:
            r3 = r2
        L10:
            java.lang.String r4 = "java.net.StandardSocketOptions"
            java.lang.Class r4 = java.lang.Class.forName(r4, r1, r0)     // Catch: java.lang.Exception -> L17
            goto L19
        L17:
            r4 = r2
        L19:
            if (r3 == 0) goto L92
            java.lang.String r5 = "IP_MULTICAST_TTL"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L89
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.Exception -> L89
            java.lang.String r6 = "IP_MULTICAST_IF"
            java.lang.reflect.Field r6 = r4.getDeclaredField(r6)     // Catch: java.lang.Exception -> L80
            java.lang.Object r6 = r6.get(r2)     // Catch: java.lang.Exception -> L80
            java.lang.String r7 = "IP_MULTICAST_LOOP"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r7)     // Catch: java.lang.Exception -> L77
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Exception -> L77
            java.lang.String r7 = "java.nio.channels.NetworkChannel"
            java.lang.Class r0 = java.lang.Class.forName(r7, r1, r0)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r0 = r2
        L42:
            if (r0 != 0) goto L48
            r0 = r2
            r1 = r0
        L46:
            r2 = r5
            goto L96
        L48:
            java.lang.String r2 = "getOption"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6e
            r8 = 0
            r7[r8] = r3     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r7)     // Catch: java.lang.Exception -> L6e
            java.lang.String r7 = "setOption"
            r9 = 2
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch: java.lang.Exception -> L65
            r9[r8] = r3     // Catch: java.lang.Exception -> L65
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r9[r1] = r3     // Catch: java.lang.Exception -> L65
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r7, r9)     // Catch: java.lang.Exception -> L65
            r1 = r0
            r0 = r2
            goto L46
        L65:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "cannot locate the setOption() method"
            r1.<init>(r2, r0)
            throw r1
        L6e:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "cannot locate the getOption() method"
            r1.<init>(r2, r0)
            throw r1
        L77:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "cannot locate the IP_MULTICAST_LOOP field"
            r1.<init>(r2, r0)
            throw r1
        L80:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "cannot locate the IP_MULTICAST_IF field"
            r1.<init>(r2, r0)
            throw r1
        L89:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "cannot locate the IP_MULTICAST_TTL field"
            r1.<init>(r2, r0)
            throw r1
        L92:
            r0 = r2
            r1 = r0
            r4 = r1
            r6 = r4
        L96:
            io.netty.channel.socket.nio.NioDatagramChannelConfig.IP_MULTICAST_TTL = r2
            io.netty.channel.socket.nio.NioDatagramChannelConfig.IP_MULTICAST_IF = r6
            io.netty.channel.socket.nio.NioDatagramChannelConfig.IP_MULTICAST_LOOP = r4
            io.netty.channel.socket.nio.NioDatagramChannelConfig.GET_OPTION = r0
            io.netty.channel.socket.nio.NioDatagramChannelConfig.SET_OPTION = r1
            return
    }

    NioDatagramChannelConfig(io.netty.channel.socket.nio.NioDatagramChannel r2, java.nio.channels.DatagramChannel r3) {
            r1 = this;
            java.net.DatagramSocket r0 = r3.socket()
            r1.<init>(r2, r0)
            r1.javaChannel = r3
            return
    }

    private java.lang.Object getOption0(java.lang.Object r5) {
            r4 = this;
            java.lang.reflect.Method r0 = io.netty.channel.socket.nio.NioDatagramChannelConfig.GET_OPTION
            if (r0 == 0) goto L18
            java.nio.channels.DatagramChannel r1 = r4.javaChannel     // Catch: java.lang.Exception -> L11
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L11
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Exception -> L11
            java.lang.Object r5 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L11
            return r5
        L11:
            r5 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r5)
            throw r0
        L18:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>()
            throw r5
    }

    private void setOption0(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            java.lang.reflect.Method r0 = io.netty.channel.socket.nio.NioDatagramChannelConfig.SET_OPTION
            if (r0 == 0) goto L1a
            java.nio.channels.DatagramChannel r1 = r4.javaChannel     // Catch: java.lang.Exception -> L13
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L13
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Exception -> L13
            r5 = 1
            r2[r5] = r6     // Catch: java.lang.Exception -> L13
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L13
            return
        L13:
            r5 = move-exception
            io.netty.channel.ChannelException r6 = new io.netty.channel.ChannelException
            r6.<init>(r5)
            throw r6
        L1a:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>()
            throw r5
    }

    @Override // io.netty.channel.DefaultChannelConfig
    protected void autoReadCleared() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            io.netty.channel.socket.nio.NioDatagramChannel r0 = (io.netty.channel.socket.nio.NioDatagramChannel) r0
            r0.clearReadPending0()
            return
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public java.net.InetAddress getInterface() {
            r2 = this;
            java.net.NetworkInterface r0 = r2.getNetworkInterface()
            if (r0 == 0) goto L17
            java.util.Enumeration r0 = io.netty.util.internal.SocketUtils.addressesFromNetworkInterface(r0)
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L17
            java.lang.Object r0 = r0.nextElement()
            java.net.InetAddress r0 = (java.net.InetAddress) r0
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public java.net.NetworkInterface getNetworkInterface() {
            r1 = this;
            java.lang.Object r0 = io.netty.channel.socket.nio.NioDatagramChannelConfig.IP_MULTICAST_IF
            java.lang.Object r0 = r1.getOption0(r0)
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(io.netty.channel.ChannelOption<T> r3) {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L14
            boolean r0 = r3 instanceof io.netty.channel.socket.nio.NioChannelOption
            if (r0 == 0) goto L14
            java.nio.channels.DatagramChannel r0 = r2.javaChannel
            io.netty.channel.socket.nio.NioChannelOption r3 = (io.netty.channel.socket.nio.NioChannelOption) r3
            java.lang.Object r3 = io.netty.channel.socket.nio.NioChannelOption.getOption(r0, r3)
            return r3
        L14:
            java.lang.Object r3 = super.getOption(r3)
            return r3
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public java.util.Map<io.netty.channel.ChannelOption<?>, java.lang.Object> getOptions() {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L16
            java.util.Map r0 = super.getOptions()
            java.nio.channels.DatagramChannel r1 = r2.javaChannel
            io.netty.channel.ChannelOption[] r1 = io.netty.channel.socket.nio.NioChannelOption.getOptions(r1)
            java.util.Map r0 = r2.getOptions(r0, r1)
            return r0
        L16:
            java.util.Map r0 = super.getOptions()
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public int getTimeToLive() {
            r1 = this;
            java.lang.Object r0 = io.netty.channel.socket.nio.NioDatagramChannelConfig.IP_MULTICAST_TTL
            java.lang.Object r0 = r1.getOption0(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public boolean isLoopbackModeDisabled() {
            r1 = this;
            java.lang.Object r0 = io.netty.channel.socket.nio.NioDatagramChannelConfig.IP_MULTICAST_LOOP
            java.lang.Object r0 = r1.getOption0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            io.netty.channel.socket.DatagramChannelConfig r1 = r0.setAutoRead(r1)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setAutoRead(boolean r1) {
            r0 = this;
            super.setAutoRead(r1)
            return r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setInterface(java.net.InetAddress r2) {
            r1 = this;
            java.net.NetworkInterface r2 = java.net.NetworkInterface.getByInetAddress(r2)     // Catch: java.net.SocketException -> L8
            r1.setNetworkInterface(r2)     // Catch: java.net.SocketException -> L8
            return r1
        L8:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r2)
            throw r0
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setLoopbackModeDisabled(boolean r2) {
            r1 = this;
            java.lang.Object r0 = io.netty.channel.socket.nio.NioDatagramChannelConfig.IP_MULTICAST_LOOP
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setOption0(r0, r2)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setNetworkInterface(java.net.NetworkInterface r2) {
            r1 = this;
            java.lang.Object r0 = io.netty.channel.socket.nio.NioDatagramChannelConfig.IP_MULTICAST_IF
            r1.setOption0(r0, r2)
            return r1
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(io.netty.channel.ChannelOption<T> r3, T r4) {
            r2 = this;
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L14
            boolean r0 = r3 instanceof io.netty.channel.socket.nio.NioChannelOption
            if (r0 == 0) goto L14
            java.nio.channels.DatagramChannel r0 = r2.javaChannel
            io.netty.channel.socket.nio.NioChannelOption r3 = (io.netty.channel.socket.nio.NioChannelOption) r3
            boolean r3 = io.netty.channel.socket.nio.NioChannelOption.setOption(r0, r3, r4)
            return r3
        L14:
            boolean r3 = super.setOption(r3, r4)
            return r3
    }

    @Override // io.netty.channel.socket.DefaultDatagramChannelConfig, io.netty.channel.socket.DatagramChannelConfig
    public io.netty.channel.socket.DatagramChannelConfig setTimeToLive(int r2) {
            r1 = this;
            java.lang.Object r0 = io.netty.channel.socket.nio.NioDatagramChannelConfig.IP_MULTICAST_TTL
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setOption0(r0, r2)
            return r1
    }
}
