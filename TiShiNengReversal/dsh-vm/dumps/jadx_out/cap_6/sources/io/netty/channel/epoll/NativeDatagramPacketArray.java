package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class NativeDatagramPacketArray implements io.netty.channel.ChannelOutboundBuffer.MessageProcessor {
    private int count;
    private final io.netty.channel.unix.IovArray iovArray;
    private final io.netty.channel.epoll.NativeDatagramPacketArray.NativeDatagramPacket[] packets;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class NativeDatagramPacket {
        private byte[] addr;
        private int count;
        private long memoryAddress;
        private int port;
        private int scopeId;

        NativeDatagramPacket() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void access$000(io.netty.channel.epoll.NativeDatagramPacketArray.NativeDatagramPacket r0, long r1, int r3, java.net.InetSocketAddress r4) {
                r0.init(r1, r3, r4)
                return
        }

        private void init(long r1, int r3, java.net.InetSocketAddress r4) {
                r0 = this;
                r0.memoryAddress = r1
                r0.count = r3
                java.net.InetAddress r1 = r4.getAddress()
                boolean r2 = r1 instanceof java.net.Inet6Address
                if (r2 == 0) goto L1b
                byte[] r2 = r1.getAddress()
                r0.addr = r2
                java.net.Inet6Address r1 = (java.net.Inet6Address) r1
                int r1 = r1.getScopeId()
                r0.scopeId = r1
                goto L28
            L1b:
                byte[] r1 = r1.getAddress()
                byte[] r1 = io.netty.channel.unix.NativeInetAddress.ipv4MappedIpv6Address(r1)
                r0.addr = r1
                r1 = 0
                r0.scopeId = r1
            L28:
                int r1 = r4.getPort()
                r0.port = r1
                return
        }
    }

    NativeDatagramPacketArray() {
            r3 = this;
            r3.<init>()
            int r0 = io.netty.channel.unix.Limits.UIO_MAX_IOV
            io.netty.channel.epoll.NativeDatagramPacketArray$NativeDatagramPacket[] r0 = new io.netty.channel.epoll.NativeDatagramPacketArray.NativeDatagramPacket[r0]
            r3.packets = r0
            io.netty.channel.unix.IovArray r0 = new io.netty.channel.unix.IovArray
            r0.<init>()
            r3.iovArray = r0
            r0 = 0
        L11:
            io.netty.channel.epoll.NativeDatagramPacketArray$NativeDatagramPacket[] r1 = r3.packets
            int r2 = r1.length
            if (r0 >= r2) goto L20
            io.netty.channel.epoll.NativeDatagramPacketArray$NativeDatagramPacket r2 = new io.netty.channel.epoll.NativeDatagramPacketArray$NativeDatagramPacket
            r2.<init>()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L11
        L20:
            return
    }

    boolean add(io.netty.channel.socket.DatagramPacket r8) {
            r7 = this;
            int r0 = r7.count
            io.netty.channel.epoll.NativeDatagramPacketArray$NativeDatagramPacket[] r1 = r7.packets
            int r1 = r1.length
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            java.lang.Object r0 = r8.content()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            int r1 = r0.readableBytes()
            r3 = 1
            if (r1 != 0) goto L17
            return r3
        L17:
            io.netty.channel.epoll.NativeDatagramPacketArray$NativeDatagramPacket[] r1 = r7.packets
            int r4 = r7.count
            r1 = r1[r4]
            java.net.SocketAddress r8 = r8.recipient()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            io.netty.channel.unix.IovArray r4 = r7.iovArray
            int r4 = r4.count()
            io.netty.channel.unix.IovArray r5 = r7.iovArray
            boolean r0 = r5.add(r0)
            if (r0 != 0) goto L32
            return r2
        L32:
            io.netty.channel.unix.IovArray r0 = r7.iovArray
            long r5 = r0.memoryAddress(r4)
            io.netty.channel.unix.IovArray r0 = r7.iovArray
            int r0 = r0.count()
            int r0 = r0 - r4
            io.netty.channel.epoll.NativeDatagramPacketArray.NativeDatagramPacket.access$000(r1, r5, r0, r8)
            int r8 = r7.count
            int r8 = r8 + r3
            r7.count = r8
            return r3
    }

    void clear() {
            r1 = this;
            r0 = 0
            r1.count = r0
            io.netty.channel.unix.IovArray r0 = r1.iovArray
            r0.clear()
            return
    }

    int count() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    io.netty.channel.epoll.NativeDatagramPacketArray.NativeDatagramPacket[] packets() {
            r1 = this;
            io.netty.channel.epoll.NativeDatagramPacketArray$NativeDatagramPacket[] r0 = r1.packets
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundBuffer.MessageProcessor
    public boolean processMessage(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.channel.socket.DatagramPacket
            if (r0 == 0) goto Le
            io.netty.channel.socket.DatagramPacket r2 = (io.netty.channel.socket.DatagramPacket) r2
            boolean r2 = r1.add(r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    void release() {
            r1 = this;
            io.netty.channel.unix.IovArray r0 = r1.iovArray
            r0.release()
            return
    }
}
