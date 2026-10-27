package io.netty.channel.udt.nio;

import io.netty.channel.udt.UdtChannel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class NioUdtProvider<T extends io.netty.channel.udt.UdtChannel> implements io.netty.channel.ChannelFactory<T> {
    public static final io.netty.channel.ChannelFactory<io.netty.channel.udt.UdtServerChannel> BYTE_ACCEPTOR = null;
    public static final io.netty.channel.ChannelFactory<io.netty.channel.udt.UdtChannel> BYTE_CONNECTOR = null;
    public static final java.nio.channels.spi.SelectorProvider BYTE_PROVIDER = null;
    public static final io.netty.channel.ChannelFactory<io.netty.channel.udt.UdtChannel> BYTE_RENDEZVOUS = null;
    public static final io.netty.channel.ChannelFactory<io.netty.channel.udt.UdtServerChannel> MESSAGE_ACCEPTOR = null;
    public static final io.netty.channel.ChannelFactory<io.netty.channel.udt.UdtChannel> MESSAGE_CONNECTOR = null;
    public static final java.nio.channels.spi.SelectorProvider MESSAGE_PROVIDER = null;
    public static final io.netty.channel.ChannelFactory<io.netty.channel.udt.UdtChannel> MESSAGE_RENDEZVOUS = null;
    private final com.barchart.udt.nio.KindUDT kind;
    private final com.barchart.udt.TypeUDT type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.udt.nio.NioUdtProvider$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$barchart$udt$TypeUDT = null;
        static final /* synthetic */ int[] $SwitchMap$com$barchart$udt$nio$KindUDT = null;

        static {
                com.barchart.udt.nio.KindUDT[] r0 = com.barchart.udt.nio.KindUDT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.channel.udt.nio.NioUdtProvider.AnonymousClass1.$SwitchMap$com$barchart$udt$nio$KindUDT = r0
                r1 = 1
                com.barchart.udt.nio.KindUDT r2 = com.barchart.udt.nio.KindUDT.ACCEPTOR     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.channel.udt.nio.NioUdtProvider.AnonymousClass1.$SwitchMap$com$barchart$udt$nio$KindUDT     // Catch: java.lang.NoSuchFieldError -> L1d
                com.barchart.udt.nio.KindUDT r3 = com.barchart.udt.nio.KindUDT.CONNECTOR     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r2 = io.netty.channel.udt.nio.NioUdtProvider.AnonymousClass1.$SwitchMap$com$barchart$udt$nio$KindUDT     // Catch: java.lang.NoSuchFieldError -> L28
                com.barchart.udt.nio.KindUDT r3 = com.barchart.udt.nio.KindUDT.RENDEZVOUS     // Catch: java.lang.NoSuchFieldError -> L28
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r4 = 3
                r2[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                com.barchart.udt.TypeUDT[] r2 = com.barchart.udt.TypeUDT.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                io.netty.channel.udt.nio.NioUdtProvider.AnonymousClass1.$SwitchMap$com$barchart$udt$TypeUDT = r2
                com.barchart.udt.TypeUDT r3 = com.barchart.udt.TypeUDT.DATAGRAM     // Catch: java.lang.NoSuchFieldError -> L39
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = io.netty.channel.udt.nio.NioUdtProvider.AnonymousClass1.$SwitchMap$com$barchart$udt$TypeUDT     // Catch: java.lang.NoSuchFieldError -> L43
                com.barchart.udt.TypeUDT r2 = com.barchart.udt.TypeUDT.STREAM     // Catch: java.lang.NoSuchFieldError -> L43
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            io.netty.channel.udt.nio.NioUdtProvider r0 = new io.netty.channel.udt.nio.NioUdtProvider
            com.barchart.udt.TypeUDT r1 = com.barchart.udt.TypeUDT.STREAM
            com.barchart.udt.nio.KindUDT r2 = com.barchart.udt.nio.KindUDT.ACCEPTOR
            r0.<init>(r1, r2)
            io.netty.channel.udt.nio.NioUdtProvider.BYTE_ACCEPTOR = r0
            io.netty.channel.udt.nio.NioUdtProvider r0 = new io.netty.channel.udt.nio.NioUdtProvider
            com.barchart.udt.TypeUDT r1 = com.barchart.udt.TypeUDT.STREAM
            com.barchart.udt.nio.KindUDT r2 = com.barchart.udt.nio.KindUDT.CONNECTOR
            r0.<init>(r1, r2)
            io.netty.channel.udt.nio.NioUdtProvider.BYTE_CONNECTOR = r0
            com.barchart.udt.nio.SelectorProviderUDT r0 = com.barchart.udt.nio.SelectorProviderUDT.STREAM
            io.netty.channel.udt.nio.NioUdtProvider.BYTE_PROVIDER = r0
            io.netty.channel.udt.nio.NioUdtProvider r0 = new io.netty.channel.udt.nio.NioUdtProvider
            com.barchart.udt.TypeUDT r1 = com.barchart.udt.TypeUDT.STREAM
            com.barchart.udt.nio.KindUDT r2 = com.barchart.udt.nio.KindUDT.RENDEZVOUS
            r0.<init>(r1, r2)
            io.netty.channel.udt.nio.NioUdtProvider.BYTE_RENDEZVOUS = r0
            io.netty.channel.udt.nio.NioUdtProvider r0 = new io.netty.channel.udt.nio.NioUdtProvider
            com.barchart.udt.TypeUDT r1 = com.barchart.udt.TypeUDT.DATAGRAM
            com.barchart.udt.nio.KindUDT r2 = com.barchart.udt.nio.KindUDT.ACCEPTOR
            r0.<init>(r1, r2)
            io.netty.channel.udt.nio.NioUdtProvider.MESSAGE_ACCEPTOR = r0
            io.netty.channel.udt.nio.NioUdtProvider r0 = new io.netty.channel.udt.nio.NioUdtProvider
            com.barchart.udt.TypeUDT r1 = com.barchart.udt.TypeUDT.DATAGRAM
            com.barchart.udt.nio.KindUDT r2 = com.barchart.udt.nio.KindUDT.CONNECTOR
            r0.<init>(r1, r2)
            io.netty.channel.udt.nio.NioUdtProvider.MESSAGE_CONNECTOR = r0
            com.barchart.udt.nio.SelectorProviderUDT r0 = com.barchart.udt.nio.SelectorProviderUDT.DATAGRAM
            io.netty.channel.udt.nio.NioUdtProvider.MESSAGE_PROVIDER = r0
            io.netty.channel.udt.nio.NioUdtProvider r0 = new io.netty.channel.udt.nio.NioUdtProvider
            com.barchart.udt.TypeUDT r1 = com.barchart.udt.TypeUDT.DATAGRAM
            com.barchart.udt.nio.KindUDT r2 = com.barchart.udt.nio.KindUDT.RENDEZVOUS
            r0.<init>(r1, r2)
            io.netty.channel.udt.nio.NioUdtProvider.MESSAGE_RENDEZVOUS = r0
            return
    }

    private NioUdtProvider(com.barchart.udt.TypeUDT r1, com.barchart.udt.nio.KindUDT r2) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.kind = r2
            return
    }

    public static com.barchart.udt.nio.ChannelUDT channelUDT(io.netty.channel.Channel r1) {
            boolean r0 = r1 instanceof io.netty.channel.udt.nio.NioUdtByteAcceptorChannel
            if (r0 == 0) goto Lb
            io.netty.channel.udt.nio.NioUdtByteAcceptorChannel r1 = (io.netty.channel.udt.nio.NioUdtByteAcceptorChannel) r1
            com.barchart.udt.nio.ServerSocketChannelUDT r1 = r1.javaChannel()
            return r1
        Lb:
            boolean r0 = r1 instanceof io.netty.channel.udt.nio.NioUdtByteRendezvousChannel
            if (r0 == 0) goto L16
            io.netty.channel.udt.nio.NioUdtByteRendezvousChannel r1 = (io.netty.channel.udt.nio.NioUdtByteRendezvousChannel) r1
            com.barchart.udt.nio.SocketChannelUDT r1 = r1.javaChannel()
            return r1
        L16:
            boolean r0 = r1 instanceof io.netty.channel.udt.nio.NioUdtByteConnectorChannel
            if (r0 == 0) goto L21
            io.netty.channel.udt.nio.NioUdtByteConnectorChannel r1 = (io.netty.channel.udt.nio.NioUdtByteConnectorChannel) r1
            com.barchart.udt.nio.SocketChannelUDT r1 = r1.javaChannel()
            return r1
        L21:
            boolean r0 = r1 instanceof io.netty.channel.udt.nio.NioUdtMessageAcceptorChannel
            if (r0 == 0) goto L2c
            io.netty.channel.udt.nio.NioUdtMessageAcceptorChannel r1 = (io.netty.channel.udt.nio.NioUdtMessageAcceptorChannel) r1
            com.barchart.udt.nio.ServerSocketChannelUDT r1 = r1.javaChannel()
            return r1
        L2c:
            boolean r0 = r1 instanceof io.netty.channel.udt.nio.NioUdtMessageRendezvousChannel
            if (r0 == 0) goto L37
            io.netty.channel.udt.nio.NioUdtMessageRendezvousChannel r1 = (io.netty.channel.udt.nio.NioUdtMessageRendezvousChannel) r1
            com.barchart.udt.nio.SocketChannelUDT r1 = r1.javaChannel()
            return r1
        L37:
            boolean r0 = r1 instanceof io.netty.channel.udt.nio.NioUdtMessageConnectorChannel
            if (r0 == 0) goto L42
            io.netty.channel.udt.nio.NioUdtMessageConnectorChannel r1 = (io.netty.channel.udt.nio.NioUdtMessageConnectorChannel) r1
            com.barchart.udt.nio.SocketChannelUDT r1 = r1.javaChannel()
            return r1
        L42:
            r1 = 0
            return r1
    }

    static com.barchart.udt.nio.ServerSocketChannelUDT newAcceptorChannelUDT(com.barchart.udt.TypeUDT r2) {
            com.barchart.udt.nio.SelectorProviderUDT r2 = com.barchart.udt.nio.SelectorProviderUDT.from(r2)     // Catch: java.io.IOException -> L9
            com.barchart.udt.nio.ServerSocketChannelUDT r2 = r2.openServerSocketChannel()     // Catch: java.io.IOException -> L9
            return r2
        L9:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            java.lang.String r1 = "failed to open a server socket channel"
            r0.<init>(r1, r2)
            throw r0
    }

    static com.barchart.udt.nio.SocketChannelUDT newConnectorChannelUDT(com.barchart.udt.TypeUDT r2) {
            com.barchart.udt.nio.SelectorProviderUDT r2 = com.barchart.udt.nio.SelectorProviderUDT.from(r2)     // Catch: java.io.IOException -> L9
            com.barchart.udt.nio.SocketChannelUDT r2 = r2.openSocketChannel()     // Catch: java.io.IOException -> L9
            return r2
        L9:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            java.lang.String r1 = "failed to open a socket channel"
            r0.<init>(r1, r2)
            throw r0
    }

    static com.barchart.udt.nio.RendezvousChannelUDT newRendezvousChannelUDT(com.barchart.udt.TypeUDT r2) {
            com.barchart.udt.nio.SelectorProviderUDT r2 = com.barchart.udt.nio.SelectorProviderUDT.from(r2)     // Catch: java.io.IOException -> L9
            com.barchart.udt.nio.RendezvousChannelUDT r2 = r2.openRendezvousChannel()     // Catch: java.io.IOException -> L9
            return r2
        L9:
            r2 = move-exception
            io.netty.channel.ChannelException r0 = new io.netty.channel.ChannelException
            java.lang.String r1 = "failed to open a rendezvous channel"
            r0.<init>(r1, r2)
            throw r0
    }

    public static com.barchart.udt.SocketUDT socketUDT(io.netty.channel.Channel r0) {
            com.barchart.udt.nio.ChannelUDT r0 = channelUDT(r0)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.barchart.udt.SocketUDT r0 = r0.socketUDT()
            return r0
    }

    public com.barchart.udt.nio.KindUDT kind() {
            r1 = this;
            com.barchart.udt.nio.KindUDT r0 = r1.kind
            return r0
    }

    @Override // io.netty.channel.ChannelFactory, io.netty.bootstrap.ChannelFactory
    public /* bridge */ /* synthetic */ io.netty.channel.Channel newChannel() {
            r1 = this;
            io.netty.channel.udt.UdtChannel r0 = r1.newChannel()
            return r0
    }

    @Override // io.netty.channel.ChannelFactory, io.netty.bootstrap.ChannelFactory
    public T newChannel() {
            r5 = this;
            int[] r0 = io.netty.channel.udt.nio.NioUdtProvider.AnonymousClass1.$SwitchMap$com$barchart$udt$nio$KindUDT
            com.barchart.udt.nio.KindUDT r1 = r5.kind
            int r1 = r1.ordinal()
            r0 = r0[r1]
            java.lang.String r1 = "wrong type="
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L90
            if (r0 == r2) goto L5f
            r4 = 3
            if (r0 != r4) goto L46
            int[] r0 = io.netty.channel.udt.nio.NioUdtProvider.AnonymousClass1.$SwitchMap$com$barchart$udt$TypeUDT
            com.barchart.udt.TypeUDT r4 = r5.type
            int r4 = r4.ordinal()
            r0 = r0[r4]
            if (r0 == r3) goto L40
            if (r0 != r2) goto L29
            io.netty.channel.udt.nio.NioUdtByteRendezvousChannel r0 = new io.netty.channel.udt.nio.NioUdtByteRendezvousChannel
            r0.<init>()
            return r0
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            com.barchart.udt.TypeUDT r1 = r5.type
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L40:
            io.netty.channel.udt.nio.NioUdtMessageRendezvousChannel r0 = new io.netty.channel.udt.nio.NioUdtMessageRendezvousChannel
            r0.<init>()
            return r0
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "wrong kind="
            r1.append(r2)
            com.barchart.udt.nio.KindUDT r2 = r5.kind
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5f:
            int[] r0 = io.netty.channel.udt.nio.NioUdtProvider.AnonymousClass1.$SwitchMap$com$barchart$udt$TypeUDT
            com.barchart.udt.TypeUDT r4 = r5.type
            int r4 = r4.ordinal()
            r0 = r0[r4]
            if (r0 == r3) goto L8a
            if (r0 != r2) goto L73
            io.netty.channel.udt.nio.NioUdtByteConnectorChannel r0 = new io.netty.channel.udt.nio.NioUdtByteConnectorChannel
            r0.<init>()
            return r0
        L73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            com.barchart.udt.TypeUDT r1 = r5.type
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L8a:
            io.netty.channel.udt.nio.NioUdtMessageConnectorChannel r0 = new io.netty.channel.udt.nio.NioUdtMessageConnectorChannel
            r0.<init>()
            return r0
        L90:
            int[] r0 = io.netty.channel.udt.nio.NioUdtProvider.AnonymousClass1.$SwitchMap$com$barchart$udt$TypeUDT
            com.barchart.udt.TypeUDT r4 = r5.type
            int r4 = r4.ordinal()
            r0 = r0[r4]
            if (r0 == r3) goto Lbb
            if (r0 != r2) goto La4
            io.netty.channel.udt.nio.NioUdtByteAcceptorChannel r0 = new io.netty.channel.udt.nio.NioUdtByteAcceptorChannel
            r0.<init>()
            return r0
        La4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            com.barchart.udt.TypeUDT r1 = r5.type
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lbb:
            io.netty.channel.udt.nio.NioUdtMessageAcceptorChannel r0 = new io.netty.channel.udt.nio.NioUdtMessageAcceptorChannel
            r0.<init>()
            return r0
    }

    public com.barchart.udt.TypeUDT type() {
            r1 = this;
            com.barchart.udt.TypeUDT r0 = r1.type
            return r0
    }
}
