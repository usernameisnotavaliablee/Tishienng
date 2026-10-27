package io.netty.handler.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Socks4ProxyHandler extends io.netty.handler.proxy.ProxyHandler {
    private static final java.lang.String AUTH_USERNAME = "username";
    private static final java.lang.String PROTOCOL = "socks4";
    private java.lang.String decoderName;
    private java.lang.String encoderName;
    private final java.lang.String username;

    public Socks4ProxyHandler(java.net.SocketAddress r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Socks4ProxyHandler(java.net.SocketAddress r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto Lc
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lc
            r2 = 0
        Lc:
            r0.username = r2
            return
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected void addCodec(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.ChannelPipeline r0 = r4.pipeline()
            java.lang.String r4 = r4.name()
            io.netty.handler.codec.socksx.v4.Socks4ClientDecoder r1 = new io.netty.handler.codec.socksx.v4.Socks4ClientDecoder
            r1.<init>()
            r2 = 0
            r0.addBefore(r4, r2, r1)
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            java.lang.String r1 = r1.name()
            r3.decoderName = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.decoderName
            r1.append(r2)
            java.lang.String r2 = ".encoder"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.encoderName = r1
            io.netty.handler.codec.socksx.v4.Socks4ClientEncoder r2 = io.netty.handler.codec.socksx.v4.Socks4ClientEncoder.INSTANCE
            r0.addBefore(r4, r1, r2)
            return
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    public java.lang.String authScheme() {
            r1 = this;
            java.lang.String r0 = r1.username
            if (r0 == 0) goto L7
            java.lang.String r0 = "username"
            return r0
        L7:
            java.lang.String r0 = "none"
            return r0
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected boolean handleResponse(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.socksx.v4.Socks4CommandResponse r4 = (io.netty.handler.codec.socksx.v4.Socks4CommandResponse) r4
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r3 = r4.status()
            io.netty.handler.codec.socksx.v4.Socks4CommandStatus r4 = io.netty.handler.codec.socksx.v4.Socks4CommandStatus.SUCCESS
            if (r3 != r4) goto Lc
            r3 = 1
            return r3
        Lc:
            io.netty.handler.proxy.ProxyConnectException r4 = new io.netty.handler.proxy.ProxyConnectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "status: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r2.exceptionMessage(r3)
            r4.<init>(r3)
            throw r4
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected java.lang.Object newInitialMessage(io.netty.channel.ChannelHandlerContext r5) throws java.lang.Exception {
            r4 = this;
            java.net.SocketAddress r5 = r4.destinationAddress()
            java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5
            boolean r0 = r5.isUnresolved()
            if (r0 == 0) goto L11
            java.lang.String r0 = r5.getHostString()
            goto L19
        L11:
            java.net.InetAddress r0 = r5.getAddress()
            java.lang.String r0 = r0.getHostAddress()
        L19:
            io.netty.handler.codec.socksx.v4.DefaultSocks4CommandRequest r1 = new io.netty.handler.codec.socksx.v4.DefaultSocks4CommandRequest
            io.netty.handler.codec.socksx.v4.Socks4CommandType r2 = io.netty.handler.codec.socksx.v4.Socks4CommandType.CONNECT
            int r5 = r5.getPort()
            java.lang.String r3 = r4.username
            if (r3 == 0) goto L26
            goto L28
        L26:
            java.lang.String r3 = ""
        L28:
            r1.<init>(r2, r0, r5, r3)
            return r1
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    public java.lang.String protocol() {
            r1 = this;
            java.lang.String r0 = "socks4"
            return r0
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected void removeDecoder(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.ChannelPipeline r2 = r2.pipeline()
            java.lang.String r0 = r1.decoderName
            r2.remove(r0)
            return
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected void removeEncoder(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.ChannelPipeline r2 = r2.pipeline()
            java.lang.String r0 = r1.encoderName
            r2.remove(r0)
            return
    }

    public java.lang.String username() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }
}
