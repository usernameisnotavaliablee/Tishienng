package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Socket extends io.netty.channel.unix.FileDescriptor {
    private static final java.util.concurrent.atomic.AtomicBoolean INITIALIZED = null;
    public static final int UDS_SUN_PATH_SIZE = 0;
    protected final boolean ipv6;

    static {
            int r0 = io.netty.channel.unix.LimitsStaticallyReferencedJniMethods.udsSunPathSize()
            io.netty.channel.unix.Socket.UDS_SUN_PATH_SIZE = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            io.netty.channel.unix.Socket.INITIALIZED = r0
            return
    }

    public Socket(int r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = isIPv6(r1)
            r0.ipv6 = r1
            return
    }

    private static native int accept(int r0, byte[] r1);

    private static native int bind(int r0, boolean r1, byte[] r2, int r3, int r4);

    private static native int bindDomainSocket(int r0, byte[] r1);

    private static native int connect(int r0, boolean r1, byte[] r2, int r3, int r4);

    private static native int connectDomainSocket(int r0, byte[] r1);

    private static native int disconnect(int r0, boolean r1);

    private static native int finishConnect(int r0);

    private static native int getReceiveBufferSize(int r0) throws java.io.IOException;

    private static native int getSendBufferSize(int r0) throws java.io.IOException;

    private static native int getSoError(int r0) throws java.io.IOException;

    private static native int getSoLinger(int r0) throws java.io.IOException;

    private static native int getTrafficClass(int r0, boolean r1) throws java.io.IOException;

    public static void initialize() {
            java.util.concurrent.atomic.AtomicBoolean r0 = io.netty.channel.unix.Socket.INITIALIZED
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L11
            boolean r0 = io.netty.util.NetUtil.isIpV4StackPreferred()
            initialize(r0)
        L11:
            return
    }

    private static native void initialize(boolean r0);

    private static native int isBroadcast(int r0) throws java.io.IOException;

    private static native boolean isIPv6(int r0);

    public static native boolean isIPv6Preferred();

    private static native int isKeepAlive(int r0) throws java.io.IOException;

    private static native int isReuseAddress(int r0) throws java.io.IOException;

    private static native int isReusePort(int r0) throws java.io.IOException;

    private static native int isTcpNoDelay(int r0) throws java.io.IOException;

    private static native int listen(int r0, int r1);

    private static native byte[] localAddress(int r0);

    public static io.netty.channel.unix.Socket newSocketDgram() {
            io.netty.channel.unix.Socket r0 = new io.netty.channel.unix.Socket
            int r1 = newSocketDgram0()
            r0.<init>(r1)
            return r0
    }

    protected static int newSocketDgram0() {
            boolean r0 = isIPv6Preferred()
            int r0 = newSocketDgram0(r0)
            return r0
    }

    protected static int newSocketDgram0(boolean r2) {
            int r2 = newSocketDgramFd(r2)
            if (r2 < 0) goto L7
            return r2
        L7:
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            java.lang.String r1 = "newSocketDgram"
            io.netty.channel.unix.Errors$NativeIoException r2 = io.netty.channel.unix.Errors.newIOException(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    private static native int newSocketDgramFd(boolean r0);

    public static io.netty.channel.unix.Socket newSocketDomain() {
            io.netty.channel.unix.Socket r0 = new io.netty.channel.unix.Socket
            int r1 = newSocketDomain0()
            r0.<init>(r1)
            return r0
    }

    protected static int newSocketDomain0() {
            int r0 = newSocketDomainFd()
            if (r0 < 0) goto L7
            return r0
        L7:
            io.netty.channel.ChannelException r1 = new io.netty.channel.ChannelException
            java.lang.String r2 = "newSocketDomain"
            io.netty.channel.unix.Errors$NativeIoException r0 = io.netty.channel.unix.Errors.newIOException(r2, r0)
            r1.<init>(r0)
            throw r1
    }

    private static native int newSocketDomainFd();

    public static io.netty.channel.unix.Socket newSocketStream() {
            io.netty.channel.unix.Socket r0 = new io.netty.channel.unix.Socket
            int r1 = newSocketStream0()
            r0.<init>(r1)
            return r0
    }

    protected static int newSocketStream0() {
            boolean r0 = isIPv6Preferred()
            int r0 = newSocketStream0(r0)
            return r0
    }

    protected static int newSocketStream0(boolean r2) {
            int r2 = newSocketStreamFd(r2)
            if (r2 < 0) goto L7
            return r2
        L7:
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            java.lang.String r1 = "newSocketStream"
            io.netty.channel.unix.Errors$NativeIoException r2 = io.netty.channel.unix.Errors.newIOException(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    private static native int newSocketStreamFd(boolean r0);

    private static native int recvFd(int r0);

    private static native io.netty.channel.unix.DatagramSocketAddress recvFrom(int r0, java.nio.ByteBuffer r1, int r2, int r3) throws java.io.IOException;

    private static native io.netty.channel.unix.DatagramSocketAddress recvFromAddress(int r0, long r1, int r3, int r4) throws java.io.IOException;

    private static native byte[] remoteAddress(int r0);

    private static native int sendFd(int r0, int r1);

    private static native int sendTo(int r0, boolean r1, java.nio.ByteBuffer r2, int r3, int r4, byte[] r5, int r6, int r7);

    private static native int sendToAddress(int r0, boolean r1, long r2, int r4, int r5, byte[] r6, int r7, int r8);

    private static native int sendToAddresses(int r0, boolean r1, long r2, int r4, byte[] r5, int r6, int r7);

    private static native void setBroadcast(int r0, int r1) throws java.io.IOException;

    private static native void setKeepAlive(int r0, int r1) throws java.io.IOException;

    private static native void setReceiveBufferSize(int r0, int r1) throws java.io.IOException;

    private static native void setReuseAddress(int r0, int r1) throws java.io.IOException;

    private static native void setReusePort(int r0, int r1) throws java.io.IOException;

    private static native void setSendBufferSize(int r0, int r1) throws java.io.IOException;

    private static native void setSoLinger(int r0, int r1) throws java.io.IOException;

    private static native void setTcpNoDelay(int r0, int r1) throws java.io.IOException;

    private static native void setTrafficClass(int r0, boolean r1, int r2) throws java.io.IOException;

    private static native int shutdown(int r0, boolean r1, boolean r2);

    public final int accept(byte[] r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r2 = accept(r0, r2)
            if (r2 < 0) goto L9
            return r2
        L9:
            int r0 = io.netty.channel.unix.Errors.ERRNO_EAGAIN_NEGATIVE
            if (r2 == r0) goto L19
            int r0 = io.netty.channel.unix.Errors.ERRNO_EWOULDBLOCK_NEGATIVE
            if (r2 != r0) goto L12
            goto L19
        L12:
            java.lang.String r0 = "accept"
            io.netty.channel.unix.Errors$NativeIoException r2 = io.netty.channel.unix.Errors.newIOException(r0, r2)
            throw r2
        L19:
            r2 = -1
            return r2
    }

    public final void bind(java.net.SocketAddress r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof java.net.InetSocketAddress
            java.lang.String r1 = "bind"
            if (r0 == 0) goto L28
            java.net.InetSocketAddress r6 = (java.net.InetSocketAddress) r6
            java.net.InetAddress r0 = r6.getAddress()
            io.netty.channel.unix.NativeInetAddress r0 = io.netty.channel.unix.NativeInetAddress.newInstance(r0)
            int r2 = r5.fd
            boolean r3 = r5.ipv6
            byte[] r4 = r0.address
            int r0 = r0.scopeId
            int r6 = r6.getPort()
            int r6 = bind(r2, r3, r4, r0, r6)
            if (r6 < 0) goto L23
            goto L40
        L23:
            io.netty.channel.unix.Errors$NativeIoException r6 = io.netty.channel.unix.Errors.newIOException(r1, r6)
            throw r6
        L28:
            boolean r0 = r6 instanceof io.netty.channel.unix.DomainSocketAddress
            if (r0 == 0) goto L46
            io.netty.channel.unix.DomainSocketAddress r6 = (io.netty.channel.unix.DomainSocketAddress) r6
            int r0 = r5.fd
            java.lang.String r6 = r6.path()
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.UTF_8
            byte[] r6 = r6.getBytes(r2)
            int r6 = bindDomainSocket(r0, r6)
            if (r6 < 0) goto L41
        L40:
            return
        L41:
            io.netty.channel.unix.Errors$NativeIoException r6 = io.netty.channel.unix.Errors.newIOException(r1, r6)
            throw r6
        L46:
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected SocketAddress implementation "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    public final boolean connect(java.net.SocketAddress r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof java.net.InetSocketAddress
            if (r0 == 0) goto L1f
            java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5
            java.net.InetAddress r0 = r5.getAddress()
            io.netty.channel.unix.NativeInetAddress r0 = io.netty.channel.unix.NativeInetAddress.newInstance(r0)
            int r1 = r4.fd
            boolean r2 = r4.ipv6
            byte[] r3 = r0.address
            int r0 = r0.scopeId
            int r5 = r5.getPort()
            int r5 = connect(r1, r2, r3, r0, r5)
            goto L35
        L1f:
            boolean r0 = r5 instanceof io.netty.channel.unix.DomainSocketAddress
            if (r0 == 0) goto L44
            io.netty.channel.unix.DomainSocketAddress r5 = (io.netty.channel.unix.DomainSocketAddress) r5
            int r0 = r4.fd
            java.lang.String r5 = r5.path()
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            byte[] r5 = r5.getBytes(r1)
            int r5 = connectDomainSocket(r0, r5)
        L35:
            if (r5 >= 0) goto L42
            int r0 = io.netty.channel.unix.Errors.ERRNO_EINPROGRESS_NEGATIVE
            if (r5 != r0) goto L3d
            r5 = 0
            return r5
        L3d:
            java.lang.String r0 = "connect"
            io.netty.channel.unix.Errors.throwConnectException(r0, r5)
        L42:
            r5 = 1
            return r5
        L44:
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected SocketAddress implementation "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public final void disconnect() throws java.io.IOException {
            r2 = this;
            int r0 = r2.fd
            boolean r1 = r2.ipv6
            int r0 = disconnect(r0, r1)
            if (r0 >= 0) goto Lf
            java.lang.String r1 = "disconnect"
            io.netty.channel.unix.Errors.throwConnectException(r1, r0)
        Lf:
            return
    }

    public final boolean finishConnect() throws java.io.IOException {
            r2 = this;
            int r0 = r2.fd
            int r0 = finishConnect(r0)
            if (r0 >= 0) goto L13
            int r1 = io.netty.channel.unix.Errors.ERRNO_EINPROGRESS_NEGATIVE
            if (r0 != r1) goto Le
            r0 = 0
            return r0
        Le:
            java.lang.String r1 = "finishConnect"
            io.netty.channel.unix.Errors.throwConnectException(r1, r0)
        L13:
            r0 = 1
            return r0
    }

    public final int getReceiveBufferSize() throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r0 = getReceiveBufferSize(r0)
            return r0
    }

    public final int getSendBufferSize() throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r0 = getSendBufferSize(r0)
            return r0
    }

    public final int getSoError() throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r0 = getSoError(r0)
            return r0
    }

    public final int getSoLinger() throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r0 = getSoLinger(r0)
            return r0
    }

    public final int getTrafficClass() throws java.io.IOException {
            r2 = this;
            int r0 = r2.fd
            boolean r1 = r2.ipv6
            int r0 = getTrafficClass(r0, r1)
            return r0
    }

    public final boolean isBroadcast() throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r0 = isBroadcast(r0)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean isInputShutdown() {
            r1 = this;
            int r0 = r1.state
            boolean r0 = io.netty.channel.unix.FileDescriptor.isInputShutdown(r0)
            return r0
    }

    public final boolean isKeepAlive() throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r0 = isKeepAlive(r0)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean isOutputShutdown() {
            r1 = this;
            int r0 = r1.state
            boolean r0 = io.netty.channel.unix.FileDescriptor.isOutputShutdown(r0)
            return r0
    }

    public final boolean isReuseAddress() throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r0 = isReuseAddress(r0)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean isReusePort() throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r0 = isReusePort(r0)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean isShutdown() {
            r2 = this;
            int r0 = r2.state
            boolean r1 = io.netty.channel.unix.FileDescriptor.isInputShutdown(r0)
            if (r1 == 0) goto L10
            boolean r0 = io.netty.channel.unix.FileDescriptor.isOutputShutdown(r0)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final boolean isTcpNoDelay() throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r0 = isTcpNoDelay(r0)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void listen(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r2 = listen(r0, r2)
            if (r2 < 0) goto L9
            return
        L9:
            java.lang.String r0 = "listen"
            io.netty.channel.unix.Errors$NativeIoException r2 = io.netty.channel.unix.Errors.newIOException(r0, r2)
            throw r2
    }

    public final java.net.InetSocketAddress localAddress() {
            r3 = this;
            int r0 = r3.fd
            byte[] r0 = localAddress(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r1 = 0
            int r2 = r0.length
            java.net.InetSocketAddress r0 = io.netty.channel.unix.NativeInetAddress.address(r0, r1, r2)
            return r0
    }

    public final int recvFd() throws java.io.IOException {
            r2 = this;
            int r0 = r2.fd
            int r0 = recvFd(r0)
            if (r0 <= 0) goto L9
            return r0
        L9:
            if (r0 != 0) goto Ld
            r0 = -1
            return r0
        Ld:
            int r1 = io.netty.channel.unix.Errors.ERRNO_EAGAIN_NEGATIVE
            if (r0 == r1) goto L1d
            int r1 = io.netty.channel.unix.Errors.ERRNO_EWOULDBLOCK_NEGATIVE
            if (r0 != r1) goto L16
            goto L1d
        L16:
            java.lang.String r1 = "recvFd"
            io.netty.channel.unix.Errors$NativeIoException r0 = io.netty.channel.unix.Errors.newIOException(r1, r0)
            throw r0
        L1d:
            r0 = 0
            return r0
    }

    public final io.netty.channel.unix.DatagramSocketAddress recvFrom(java.nio.ByteBuffer r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            io.netty.channel.unix.DatagramSocketAddress r2 = recvFrom(r0, r2, r3, r4)
            return r2
    }

    public final io.netty.channel.unix.DatagramSocketAddress recvFromAddress(long r2, int r4, int r5) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            io.netty.channel.unix.DatagramSocketAddress r2 = recvFromAddress(r0, r2, r4, r5)
            return r2
    }

    public final java.net.InetSocketAddress remoteAddress() {
            r3 = this;
            int r0 = r3.fd
            byte[] r0 = remoteAddress(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r1 = 0
            int r2 = r0.length
            java.net.InetSocketAddress r0 = io.netty.channel.unix.NativeInetAddress.address(r0, r1, r2)
            return r0
    }

    public final int sendFd(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            int r2 = sendFd(r0, r2)
            if (r2 < 0) goto L9
            return r2
        L9:
            int r0 = io.netty.channel.unix.Errors.ERRNO_EAGAIN_NEGATIVE
            if (r2 == r0) goto L19
            int r0 = io.netty.channel.unix.Errors.ERRNO_EWOULDBLOCK_NEGATIVE
            if (r2 != r0) goto L12
            goto L19
        L12:
            java.lang.String r0 = "sendFd"
            io.netty.channel.unix.Errors$NativeIoException r2 = io.netty.channel.unix.Errors.newIOException(r0, r2)
            throw r2
        L19:
            r2 = -1
            return r2
    }

    public final int sendTo(java.nio.ByteBuffer r10, int r11, int r12, java.net.InetAddress r13, int r14) throws java.io.IOException {
            r9 = this;
            boolean r0 = r13 instanceof java.net.Inet6Address
            if (r0 == 0) goto L11
            byte[] r0 = r13.getAddress()
            java.net.Inet6Address r13 = (java.net.Inet6Address) r13
            int r13 = r13.getScopeId()
            r7 = r13
        Lf:
            r6 = r0
            goto L1c
        L11:
            byte[] r13 = r13.getAddress()
            byte[] r0 = io.netty.channel.unix.NativeInetAddress.ipv4MappedIpv6Address(r13)
            r13 = 0
            r7 = 0
            goto Lf
        L1c:
            int r1 = r9.fd
            boolean r2 = r9.ipv6
            r3 = r10
            r4 = r11
            r5 = r12
            r8 = r14
            int r10 = sendTo(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 < 0) goto L2b
            return r10
        L2b:
            int r11 = io.netty.channel.unix.Errors.ERROR_ECONNREFUSED_NEGATIVE
            if (r10 == r11) goto L36
            java.lang.String r11 = "sendTo"
            int r10 = io.netty.channel.unix.Errors.ioResult(r11, r10)
            return r10
        L36:
            java.net.PortUnreachableException r10 = new java.net.PortUnreachableException
            java.lang.String r11 = "sendTo failed"
            r10.<init>(r11)
            throw r10
    }

    public final int sendToAddress(long r12, int r14, int r15, java.net.InetAddress r16, int r17) throws java.io.IOException {
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof java.net.Inet6Address
            if (r1 == 0) goto L13
            byte[] r1 = r0.getAddress()
            java.net.Inet6Address r0 = (java.net.Inet6Address) r0
            int r0 = r0.getScopeId()
            r9 = r0
        L11:
            r8 = r1
            goto L1e
        L13:
            byte[] r0 = r0.getAddress()
            byte[] r1 = io.netty.channel.unix.NativeInetAddress.ipv4MappedIpv6Address(r0)
            r0 = 0
            r9 = 0
            goto L11
        L1e:
            int r2 = r11.fd
            boolean r3 = r11.ipv6
            r4 = r12
            r6 = r14
            r7 = r15
            r10 = r17
            int r12 = sendToAddress(r2, r3, r4, r6, r7, r8, r9, r10)
            if (r12 < 0) goto L2e
            return r12
        L2e:
            int r13 = io.netty.channel.unix.Errors.ERROR_ECONNREFUSED_NEGATIVE
            if (r12 == r13) goto L39
            java.lang.String r13 = "sendToAddress"
            int r12 = io.netty.channel.unix.Errors.ioResult(r13, r12)
            return r12
        L39:
            java.net.PortUnreachableException r12 = new java.net.PortUnreachableException
            java.lang.String r13 = "sendToAddress failed"
            r12.<init>(r13)
            throw r12
    }

    public final int sendToAddresses(long r10, int r12, java.net.InetAddress r13, int r14) throws java.io.IOException {
            r9 = this;
            boolean r0 = r13 instanceof java.net.Inet6Address
            if (r0 == 0) goto L11
            byte[] r0 = r13.getAddress()
            java.net.Inet6Address r13 = (java.net.Inet6Address) r13
            int r13 = r13.getScopeId()
            r7 = r13
        Lf:
            r6 = r0
            goto L1c
        L11:
            byte[] r13 = r13.getAddress()
            byte[] r0 = io.netty.channel.unix.NativeInetAddress.ipv4MappedIpv6Address(r13)
            r13 = 0
            r7 = 0
            goto Lf
        L1c:
            int r1 = r9.fd
            boolean r2 = r9.ipv6
            r3 = r10
            r5 = r12
            r8 = r14
            int r10 = sendToAddresses(r1, r2, r3, r5, r6, r7, r8)
            if (r10 < 0) goto L2a
            return r10
        L2a:
            int r11 = io.netty.channel.unix.Errors.ERROR_ECONNREFUSED_NEGATIVE
            if (r10 == r11) goto L35
            java.lang.String r11 = "sendToAddresses"
            int r10 = io.netty.channel.unix.Errors.ioResult(r11, r10)
            return r10
        L35:
            java.net.PortUnreachableException r10 = new java.net.PortUnreachableException
            java.lang.String r11 = "sendToAddresses failed"
            r10.<init>(r11)
            throw r10
    }

    public final void setBroadcast(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            setBroadcast(r0, r2)
            return
    }

    public final void setKeepAlive(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            setKeepAlive(r0, r2)
            return
    }

    public final void setReceiveBufferSize(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            setReceiveBufferSize(r0, r2)
            return
    }

    public final void setReuseAddress(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            setReuseAddress(r0, r2)
            return
    }

    public final void setReusePort(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            setReusePort(r0, r2)
            return
    }

    public final void setSendBufferSize(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            setSendBufferSize(r0, r2)
            return
    }

    public final void setSoLinger(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            setSoLinger(r0, r2)
            return
    }

    public final void setTcpNoDelay(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.fd
            setTcpNoDelay(r0, r2)
            return
    }

    public final void setTrafficClass(int r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.fd
            boolean r1 = r2.ipv6
            setTrafficClass(r0, r1, r3)
            return
    }

    public final void shutdown() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.shutdown(r0, r0)
            return
    }

    public final void shutdown(boolean r4, boolean r5) throws java.io.IOException {
            r3 = this;
        L0:
            int r0 = r3.state
            boolean r1 = io.netty.channel.unix.FileDescriptor.isClosed(r0)
            if (r1 != 0) goto L39
            if (r4 == 0) goto L15
            boolean r1 = io.netty.channel.unix.FileDescriptor.isInputShutdown(r0)
            if (r1 != 0) goto L15
            int r1 = io.netty.channel.unix.FileDescriptor.inputShutdown(r0)
            goto L16
        L15:
            r1 = r0
        L16:
            if (r5 == 0) goto L22
            boolean r2 = io.netty.channel.unix.FileDescriptor.isOutputShutdown(r1)
            if (r2 != 0) goto L22
            int r1 = io.netty.channel.unix.FileDescriptor.outputShutdown(r1)
        L22:
            if (r1 != r0) goto L25
            goto L38
        L25:
            boolean r0 = r3.casState(r0, r1)
            if (r0 == 0) goto L0
            int r0 = r3.fd
            int r4 = shutdown(r0, r4, r5)
            if (r4 >= 0) goto L38
            java.lang.String r5 = "shutdown"
            io.netty.channel.unix.Errors.ioResult(r5, r4)
        L38:
            return
        L39:
            java.nio.channels.ClosedChannelException r4 = new java.nio.channels.ClosedChannelException
            r4.<init>()
            throw r4
    }

    @Override // io.netty.channel.unix.FileDescriptor
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Socket{fd="
            r0.append(r1)
            int r1 = r2.fd
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
