package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class LinuxSocket extends io.netty.channel.unix.Socket {
    static final java.net.InetAddress INET6_ANY = null;
    private static final java.net.InetAddress INET_ANY = null;
    private static final long MAX_UINT32_T = 4294967295L;

    static {
            java.lang.String r0 = "::"
            java.net.InetAddress r0 = unsafeInetAddrByName(r0)
            io.netty.channel.epoll.LinuxSocket.INET6_ANY = r0
            java.lang.String r0 = "0.0.0.0"
            java.net.InetAddress r0 = unsafeInetAddrByName(r0)
            io.netty.channel.epoll.LinuxSocket.INET_ANY = r0
            return
    }

    LinuxSocket(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static java.net.InetAddress deriveInetAddress(java.net.NetworkInterface r3, boolean r4) {
            if (r4 == 0) goto L5
            java.net.InetAddress r0 = io.netty.channel.epoll.LinuxSocket.INET6_ANY
            goto L7
        L5:
            java.net.InetAddress r0 = io.netty.channel.epoll.LinuxSocket.INET_ANY
        L7:
            if (r3 == 0) goto L1e
            java.util.Enumeration r3 = r3.getInetAddresses()
        Ld:
            boolean r1 = r3.hasMoreElements()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r3.nextElement()
            java.net.InetAddress r1 = (java.net.InetAddress) r1
            boolean r2 = r1 instanceof java.net.Inet6Address
            if (r2 != r4) goto Ld
            return r1
        L1e:
            return r0
    }

    private io.netty.channel.socket.InternetProtocolFamily family() {
            r1 = this;
            boolean r0 = r1.ipv6
            if (r0 == 0) goto L7
            io.netty.channel.socket.InternetProtocolFamily r0 = io.netty.channel.socket.InternetProtocolFamily.IPv6
            return r0
        L7:
            io.netty.channel.socket.InternetProtocolFamily r0 = io.netty.channel.socket.InternetProtocolFamily.IPv4
            return r0
    }

    private static native int getInterface(int r0, boolean r1);

    private static native int getIpMulticastLoop(int r0, boolean r1) throws java.io.IOException;

    private static native io.netty.channel.unix.PeerCredentials getPeerCredentials(int r0) throws java.io.IOException;

    private static native int getSoBusyPoll(int r0) throws java.io.IOException;

    private static native int getTcpDeferAccept(int r0) throws java.io.IOException;

    private static native void getTcpInfo(int r0, long[] r1) throws java.io.IOException;

    private static native int getTcpKeepCnt(int r0) throws java.io.IOException;

    private static native int getTcpKeepIdle(int r0) throws java.io.IOException;

    private static native int getTcpKeepIntvl(int r0) throws java.io.IOException;

    private static native int getTcpNotSentLowAt(int r0) throws java.io.IOException;

    private static native int getTcpUserTimeout(int r0) throws java.io.IOException;

    private static native int getTimeToLive(int r0) throws java.io.IOException;

    private static java.net.InetAddress inetAddress(int r5) {
            int r0 = r5 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r1 = r5 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            int r2 = r5 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3 = 4
            byte[] r3 = new byte[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            r0 = 3
            r3[r0] = r5
            java.net.InetAddress r5 = java.net.InetAddress.getByAddress(r3)     // Catch: java.net.UnknownHostException -> L26
            return r5
        L26:
            r5 = 0
            return r5
    }

    private static int interfaceIndex(java.net.InetAddress r2) throws java.io.IOException {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L12
            java.net.NetworkInterface r2 = java.net.NetworkInterface.getByInetAddress(r2)
            if (r2 == 0) goto L12
            int r2 = r2.getIndex()
            return r2
        L12:
            r2 = -1
            return r2
    }

    private static int interfaceIndex(java.net.NetworkInterface r2) {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Lc
            int r2 = r2.getIndex()
            return r2
        Lc:
            r2 = -1
            return r2
    }

    private static native int isIpFreeBind(int r0) throws java.io.IOException;

    private static native int isIpRecvOrigDestAddr(int r0) throws java.io.IOException;

    private static native int isIpTransparent(int r0) throws java.io.IOException;

    private static native int isTcpCork(int r0) throws java.io.IOException;

    private static native int isTcpFastOpenConnect(int r0) throws java.io.IOException;

    private static native int isTcpQuickAck(int r0) throws java.io.IOException;

    private static native void joinGroup(int r0, boolean r1, byte[] r2, byte[] r3, int r4, int r5) throws java.io.IOException;

    private static native void joinSsmGroup(int r0, boolean r1, byte[] r2, byte[] r3, int r4, int r5, byte[] r6) throws java.io.IOException;

    private static native void leaveGroup(int r0, boolean r1, byte[] r2, byte[] r3, int r4, int r5) throws java.io.IOException;

    private static native void leaveSsmGroup(int r0, boolean r1, byte[] r2, byte[] r3, int r4, int r5, byte[] r6) throws java.io.IOException;

    public static io.netty.channel.epoll.LinuxSocket newSocketDgram() {
            boolean r0 = io.netty.channel.unix.Socket.isIPv6Preferred()
            io.netty.channel.epoll.LinuxSocket r0 = newSocketDgram(r0)
            return r0
    }

    public static io.netty.channel.epoll.LinuxSocket newSocketDgram(boolean r1) {
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            int r1 = io.netty.channel.unix.Socket.newSocketDgram0(r1)
            r0.<init>(r1)
            return r0
    }

    public static io.netty.channel.epoll.LinuxSocket newSocketDomain() {
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            int r1 = io.netty.channel.unix.Socket.newSocketDomain0()
            r0.<init>(r1)
            return r0
    }

    public static io.netty.channel.epoll.LinuxSocket newSocketStream() {
            boolean r0 = io.netty.channel.unix.Socket.isIPv6Preferred()
            io.netty.channel.epoll.LinuxSocket r0 = newSocketStream(r0)
            return r0
    }

    public static io.netty.channel.epoll.LinuxSocket newSocketStream(boolean r1) {
            io.netty.channel.epoll.LinuxSocket r0 = new io.netty.channel.epoll.LinuxSocket
            int r1 = io.netty.channel.unix.Socket.newSocketStream0(r1)
            r0.<init>(r1)
            return r0
    }

    private static native long sendFile(int r0, io.netty.channel.DefaultFileRegion r1, long r2, long r4, long r6) throws java.io.IOException;

    private static native void setInterface(int r0, boolean r1, byte[] r2, int r3, int r4) throws java.io.IOException;

    private static native void setIpFreeBind(int r0, int r1) throws java.io.IOException;

    private static native void setIpMulticastLoop(int r0, boolean r1, int r2) throws java.io.IOException;

    private static native void setIpRecvOrigDestAddr(int r0, int r1) throws java.io.IOException;

    private static native void setIpTransparent(int r0, int r1) throws java.io.IOException;

    private static native void setSoBusyPoll(int r0, int r1) throws java.io.IOException;

    private static native void setTcpCork(int r0, int r1) throws java.io.IOException;

    private static native void setTcpDeferAccept(int r0, int r1) throws java.io.IOException;

    private static native void setTcpFastOpen(int r0, int r1) throws java.io.IOException;

    private static native void setTcpFastOpenConnect(int r0, int r1) throws java.io.IOException;

    private static native void setTcpKeepCnt(int r0, int r1) throws java.io.IOException;

    private static native void setTcpKeepIdle(int r0, int r1) throws java.io.IOException;

    private static native void setTcpKeepIntvl(int r0, int r1) throws java.io.IOException;

    private static native void setTcpMd5Sig(int r0, boolean r1, byte[] r2, int r3, byte[] r4) throws java.io.IOException;

    private static native void setTcpNotSentLowAt(int r0, int r1) throws java.io.IOException;

    private static native void setTcpQuickAck(int r0, int r1) throws java.io.IOException;

    private static native void setTcpUserTimeout(int r0, int r1) throws java.io.IOException;

    private static native void setTimeToLive(int r0, int r1) throws java.io.IOException;

    private static java.net.InetAddress unsafeInetAddrByName(java.lang.String r1) {
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch: java.net.UnknownHostException -> L5
            return r1
        L5:
            r1 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            r0.<init>(r1)
            throw r0
    }

    java.net.InetAddress getInterface() throws java.io.IOException {
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

    java.net.NetworkInterface getNetworkInterface() throws java.io.IOException {
            r4 = this;
            int r0 = r4.intValue()
            boolean r1 = r4.ipv6
            int r0 = getInterface(r0, r1)
            boolean r1 = r4.ipv6
            r2 = 0
            if (r1 == 0) goto L1c
            int r1 = io.netty.util.internal.PlatformDependent.javaVersion()
            r3 = 7
            if (r1 < r3) goto L1b
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByIndex(r0)
            return r0
        L1b:
            return r2
        L1c:
            java.net.InetAddress r0 = inetAddress(r0)
            if (r0 == 0) goto L27
            java.net.NetworkInterface r0 = java.net.NetworkInterface.getByInetAddress(r0)
            return r0
        L27:
            return r2
    }

    io.netty.channel.unix.PeerCredentials getPeerCredentials() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            io.netty.channel.unix.PeerCredentials r0 = getPeerCredentials(r0)
            return r0
    }

    int getSoBusyPoll() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = getSoBusyPoll(r0)
            return r0
    }

    int getTcpDeferAccept() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = getTcpDeferAccept(r0)
            return r0
    }

    void getTcpInfo(io.netty.channel.epoll.EpollTcpInfo r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            long[] r2 = r2.info
            getTcpInfo(r0, r2)
            return
    }

    int getTcpKeepCnt() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = getTcpKeepCnt(r0)
            return r0
    }

    int getTcpKeepIdle() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = getTcpKeepIdle(r0)
            return r0
    }

    int getTcpKeepIntvl() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = getTcpKeepIntvl(r0)
            return r0
    }

    long getTcpNotSentLowAt() throws java.io.IOException {
            r4 = this;
            int r0 = r4.intValue()
            int r0 = getTcpNotSentLowAt(r0)
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    int getTcpUserTimeout() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = getTcpUserTimeout(r0)
            return r0
    }

    int getTimeToLive() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = getTimeToLive(r0)
            return r0
    }

    boolean isIpFreeBind() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = isIpFreeBind(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    boolean isIpRecvOrigDestAddr() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = isIpRecvOrigDestAddr(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    boolean isIpTransparent() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = isIpTransparent(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    boolean isLoopbackModeDisabled() throws java.io.IOException {
            r2 = this;
            int r0 = r2.intValue()
            boolean r1 = r2.ipv6
            int r0 = getIpMulticastLoop(r0, r1)
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    boolean isTcpCork() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = isTcpCork(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    boolean isTcpFastOpenConnect() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = isTcpFastOpenConnect(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    boolean isTcpQuickAck() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = isTcpQuickAck(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    void joinGroup(java.net.InetAddress r19, java.net.NetworkInterface r20, java.net.InetAddress r21) throws java.io.IOException {
            r18 = this;
            r0 = r18
            io.netty.channel.unix.NativeInetAddress r1 = io.netty.channel.unix.NativeInetAddress.newInstance(r19)
            r2 = r19
            boolean r2 = r2 instanceof java.net.Inet6Address
            r3 = r20
            java.net.InetAddress r2 = deriveInetAddress(r3, r2)
            io.netty.channel.unix.NativeInetAddress r2 = io.netty.channel.unix.NativeInetAddress.newInstance(r2)
            if (r21 == 0) goto L38
            io.netty.channel.unix.NativeInetAddress r4 = io.netty.channel.unix.NativeInetAddress.newInstance(r21)
            int r5 = r0.intValue()
            boolean r6 = r0.ipv6
            byte[] r7 = r1.address()
            byte[] r8 = r2.address()
            int r9 = r1.scopeId()
            int r10 = interfaceIndex(r3)
            byte[] r11 = r4.address()
            joinSsmGroup(r5, r6, r7, r8, r9, r10, r11)
            return
        L38:
            int r12 = r0.intValue()
            boolean r13 = r0.ipv6
            byte[] r14 = r1.address()
            byte[] r15 = r2.address()
            int r16 = r1.scopeId()
            int r17 = interfaceIndex(r3)
            joinGroup(r12, r13, r14, r15, r16, r17)
            return
    }

    void leaveGroup(java.net.InetAddress r19, java.net.NetworkInterface r20, java.net.InetAddress r21) throws java.io.IOException {
            r18 = this;
            r0 = r18
            io.netty.channel.unix.NativeInetAddress r1 = io.netty.channel.unix.NativeInetAddress.newInstance(r19)
            r2 = r19
            boolean r2 = r2 instanceof java.net.Inet6Address
            r3 = r20
            java.net.InetAddress r2 = deriveInetAddress(r3, r2)
            io.netty.channel.unix.NativeInetAddress r2 = io.netty.channel.unix.NativeInetAddress.newInstance(r2)
            if (r21 == 0) goto L38
            io.netty.channel.unix.NativeInetAddress r4 = io.netty.channel.unix.NativeInetAddress.newInstance(r21)
            int r5 = r0.intValue()
            boolean r6 = r0.ipv6
            byte[] r7 = r1.address()
            byte[] r8 = r2.address()
            int r9 = r1.scopeId()
            int r10 = interfaceIndex(r3)
            byte[] r11 = r4.address()
            leaveSsmGroup(r5, r6, r7, r8, r9, r10, r11)
            return
        L38:
            int r12 = r0.intValue()
            boolean r13 = r0.ipv6
            byte[] r14 = r1.address()
            byte[] r15 = r2.address()
            int r16 = r1.scopeId()
            int r17 = interfaceIndex(r3)
            leaveGroup(r12, r13, r14, r15, r16, r17)
            return
    }

    long sendFile(io.netty.channel.DefaultFileRegion r9, long r10, long r12, long r14) throws java.io.IOException {
            r8 = this;
            r9.open()
            int r0 = r8.intValue()
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            long r9 = sendFile(r0, r1, r2, r4, r6)
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L16
            return r9
        L16:
            java.lang.String r11 = "sendfile"
            int r10 = (int) r9
            int r9 = io.netty.channel.unix.Errors.ioResult(r11, r10)
            long r9 = (long) r9
            return r9
    }

    int sendmmsg(io.netty.channel.epoll.NativeDatagramPacketArray.NativeDatagramPacket[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.intValue()
            boolean r1 = r2.ipv6
            int r3 = io.netty.channel.epoll.Native.sendmmsg(r0, r1, r3, r4, r5)
            return r3
    }

    void setInterface(java.net.InetAddress r5) throws java.io.IOException {
            r4 = this;
            io.netty.channel.unix.NativeInetAddress r0 = io.netty.channel.unix.NativeInetAddress.newInstance(r5)
            int r1 = r4.intValue()
            boolean r2 = r4.ipv6
            byte[] r3 = r0.address()
            int r0 = r0.scopeId()
            int r5 = interfaceIndex(r5)
            setInterface(r1, r2, r3, r0, r5)
            return
    }

    void setIpFreeBind(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setIpFreeBind(r0, r2)
            return
    }

    void setIpRecvOrigDestAddr(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setIpRecvOrigDestAddr(r0, r2)
            return
    }

    void setIpTransparent(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setIpTransparent(r0, r2)
            return
    }

    void setLoopbackModeDisabled(boolean r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.intValue()
            boolean r1 = r2.ipv6
            r3 = r3 ^ 1
            setIpMulticastLoop(r0, r1, r3)
            return
    }

    void setNetworkInterface(java.net.NetworkInterface r5) throws java.io.IOException {
            r4 = this;
            io.netty.channel.socket.InternetProtocolFamily r0 = r4.family()
            io.netty.channel.socket.InternetProtocolFamily r1 = io.netty.channel.socket.InternetProtocolFamily.IPv6
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.net.InetAddress r0 = deriveInetAddress(r5, r0)
            io.netty.channel.socket.InternetProtocolFamily r1 = r4.family()
            io.netty.channel.socket.InternetProtocolFamily r2 = io.netty.channel.socket.InternetProtocolFamily.IPv4
            if (r1 != r2) goto L1a
            java.net.InetAddress r1 = io.netty.channel.epoll.LinuxSocket.INET_ANY
            goto L1c
        L1a:
            java.net.InetAddress r1 = io.netty.channel.epoll.LinuxSocket.INET6_ANY
        L1c:
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3c
            io.netty.channel.unix.NativeInetAddress r0 = io.netty.channel.unix.NativeInetAddress.newInstance(r0)
            int r1 = r4.intValue()
            boolean r2 = r4.ipv6
            byte[] r3 = r0.address()
            int r0 = r0.scopeId()
            int r5 = interfaceIndex(r5)
            setInterface(r1, r2, r3, r0, r5)
            return
        L3c:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NetworkInterface does not support "
            r0.append(r1)
            io.netty.channel.socket.InternetProtocolFamily r1 = r4.family()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    void setSoBusyPoll(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setSoBusyPoll(r0, r2)
            return
    }

    void setTcpCork(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpCork(r0, r2)
            return
    }

    void setTcpDeferAccept(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpDeferAccept(r0, r2)
            return
    }

    void setTcpFastOpen(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpFastOpen(r0, r2)
            return
    }

    void setTcpFastOpenConnect(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpFastOpenConnect(r0, r2)
            return
    }

    void setTcpKeepCnt(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpKeepCnt(r0, r2)
            return
    }

    void setTcpKeepIdle(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpKeepIdle(r0, r2)
            return
    }

    void setTcpKeepIntvl(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpKeepIntvl(r0, r2)
            return
    }

    void setTcpMd5Sig(java.net.InetAddress r4, byte[] r5) throws java.io.IOException {
            r3 = this;
            io.netty.channel.unix.NativeInetAddress r4 = io.netty.channel.unix.NativeInetAddress.newInstance(r4)
            int r0 = r3.intValue()
            boolean r1 = r3.ipv6
            byte[] r2 = r4.address()
            int r4 = r4.scopeId()
            setTcpMd5Sig(r0, r1, r2, r4, r5)
            return
    }

    void setTcpNotSentLowAt(long r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L18
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L18
            int r0 = r3.intValue()
            int r5 = (int) r4
            setTcpNotSentLowAt(r0, r5)
            return
        L18:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "tcpNotSentLowAt must be a uint32_t"
            r4.<init>(r5)
            throw r4
    }

    void setTcpQuickAck(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpQuickAck(r0, r2)
            return
    }

    void setTcpUserTimeout(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpUserTimeout(r0, r2)
            return
    }

    void setTimeToLive(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTimeToLive(r0, r2)
            return
    }
}
