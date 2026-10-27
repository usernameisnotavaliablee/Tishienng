package io.netty.handler.proxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Socks5ProxyHandler extends io.netty.handler.proxy.ProxyHandler {
    private static final java.lang.String AUTH_PASSWORD = "password";
    private static final io.netty.handler.codec.socksx.v5.Socks5InitialRequest INIT_REQUEST_NO_AUTH = null;
    private static final io.netty.handler.codec.socksx.v5.Socks5InitialRequest INIT_REQUEST_PASSWORD = null;
    private static final java.lang.String PROTOCOL = "socks5";
    private java.lang.String decoderName;
    private java.lang.String encoderName;
    private final java.lang.String password;
    private final java.lang.String username;

    static {
            io.netty.handler.codec.socksx.v5.DefaultSocks5InitialRequest r0 = new io.netty.handler.codec.socksx.v5.DefaultSocks5InitialRequest
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r1 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.NO_AUTH
            java.util.List r2 = java.util.Collections.singletonList(r1)
            r0.<init>(r2)
            io.netty.handler.proxy.Socks5ProxyHandler.INIT_REQUEST_NO_AUTH = r0
            io.netty.handler.codec.socksx.v5.DefaultSocks5InitialRequest r0 = new io.netty.handler.codec.socksx.v5.DefaultSocks5InitialRequest
            r2 = 2
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod[] r2 = new io.netty.handler.codec.socksx.v5.Socks5AuthMethod[r2]
            r3 = 0
            r2[r3] = r1
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r1 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.PASSWORD
            r3 = 1
            r2[r3] = r1
            java.util.List r1 = java.util.Arrays.asList(r2)
            r0.<init>(r1)
            io.netty.handler.proxy.Socks5ProxyHandler.INIT_REQUEST_PASSWORD = r0
            return
    }

    public Socks5ProxyHandler(java.net.SocketAddress r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public Socks5ProxyHandler(java.net.SocketAddress r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            if (r3 == 0) goto Ld
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld
            r3 = r2
        Ld:
            if (r4 == 0) goto L16
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L16
            r4 = r2
        L16:
            r1.username = r3
            r1.password = r4
            return
    }

    private void sendConnectCommand(io.netty.channel.ChannelHandlerContext r6) throws java.lang.Exception {
            r5 = this;
            java.net.SocketAddress r0 = r5.destinationAddress()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            boolean r1 = r0.isUnresolved()
            if (r1 == 0) goto L13
            io.netty.handler.codec.socksx.v5.Socks5AddressType r1 = io.netty.handler.codec.socksx.v5.Socks5AddressType.DOMAIN
            java.lang.String r2 = r0.getHostString()
            goto L2c
        L13:
            java.net.InetAddress r1 = r0.getAddress()
            java.lang.String r2 = r1.getHostAddress()
            boolean r1 = io.netty.util.NetUtil.isValidIpV4Address(r2)
            if (r1 == 0) goto L24
            io.netty.handler.codec.socksx.v5.Socks5AddressType r1 = io.netty.handler.codec.socksx.v5.Socks5AddressType.IPv4
            goto L2c
        L24:
            boolean r1 = io.netty.util.NetUtil.isValidIpV6Address(r2)
            if (r1 == 0) goto L49
            io.netty.handler.codec.socksx.v5.Socks5AddressType r1 = io.netty.handler.codec.socksx.v5.Socks5AddressType.IPv6
        L2c:
            io.netty.channel.ChannelPipeline r6 = r6.pipeline()
            java.lang.String r3 = r5.decoderName
            io.netty.handler.codec.socksx.v5.Socks5CommandResponseDecoder r4 = new io.netty.handler.codec.socksx.v5.Socks5CommandResponseDecoder
            r4.<init>()
            r6.replace(r3, r3, r4)
            io.netty.handler.codec.socksx.v5.DefaultSocks5CommandRequest r6 = new io.netty.handler.codec.socksx.v5.DefaultSocks5CommandRequest
            io.netty.handler.codec.socksx.v5.Socks5CommandType r3 = io.netty.handler.codec.socksx.v5.Socks5CommandType.CONNECT
            int r0 = r0.getPort()
            r6.<init>(r3, r1, r2, r0)
            r5.sendToProxyServer(r6)
            return
        L49:
            io.netty.handler.proxy.ProxyConnectException r6 = new io.netty.handler.proxy.ProxyConnectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown address type: "
            r0.append(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r5.exceptionMessage(r0)
            r6.<init>(r0)
            throw r6
    }

    private io.netty.handler.codec.socksx.v5.Socks5AuthMethod socksAuthMethod() {
            r1 = this;
            java.lang.String r0 = r1.username
            if (r0 != 0) goto Lb
            java.lang.String r0 = r1.password
            if (r0 != 0) goto Lb
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r0 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.NO_AUTH
            return r0
        Lb:
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r0 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.PASSWORD
            return r0
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected void addCodec(io.netty.channel.ChannelHandlerContext r4) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.ChannelPipeline r0 = r4.pipeline()
            java.lang.String r4 = r4.name()
            io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder r1 = new io.netty.handler.codec.socksx.v5.Socks5InitialResponseDecoder
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
            io.netty.handler.codec.socksx.v5.Socks5ClientEncoder r2 = io.netty.handler.codec.socksx.v5.Socks5ClientEncoder.DEFAULT
            r0.addBefore(r4, r1, r2)
            return
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    public java.lang.String authScheme() {
            r2 = this;
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r0 = r2.socksAuthMethod()
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r1 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.PASSWORD
            if (r0 != r1) goto Lb
            java.lang.String r0 = "password"
            return r0
        Lb:
            java.lang.String r0 = "none"
            return r0
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected boolean handleResponse(io.netty.channel.ChannelHandlerContext r5, java.lang.Object r6) throws java.lang.Exception {
            r4 = this;
            boolean r0 = r6 instanceof io.netty.handler.codec.socksx.v5.Socks5InitialResponse
            r1 = 0
            if (r0 == 0) goto L6d
            io.netty.handler.codec.socksx.v5.Socks5InitialResponse r6 = (io.netty.handler.codec.socksx.v5.Socks5InitialResponse) r6
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r0 = r4.socksAuthMethod()
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r2 = r6.authMethod()
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r3 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.NO_AUTH
            if (r2 == r3) goto L39
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r2 = r6.authMethod()
            if (r2 != r0) goto L1a
            goto L39
        L1a:
            io.netty.handler.proxy.ProxyConnectException r5 = new io.netty.handler.proxy.ProxyConnectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected authMethod: "
            r0.append(r1)
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r6 = r6.authMethod()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r4.exceptionMessage(r6)
            r5.<init>(r6)
            throw r5
        L39:
            if (r0 != r3) goto L3f
            r4.sendConnectCommand(r5)
            goto L66
        L3f:
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r6 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.PASSWORD
            if (r0 != r6) goto L67
            io.netty.channel.ChannelPipeline r5 = r5.pipeline()
            java.lang.String r6 = r4.decoderName
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder r0 = new io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponseDecoder
            r0.<init>()
            r5.replace(r6, r6, r0)
            io.netty.handler.codec.socksx.v5.DefaultSocks5PasswordAuthRequest r5 = new io.netty.handler.codec.socksx.v5.DefaultSocks5PasswordAuthRequest
            java.lang.String r6 = r4.username
            java.lang.String r0 = ""
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r6 = r0
        L5b:
            java.lang.String r2 = r4.password
            if (r2 == 0) goto L60
            r0 = r2
        L60:
            r5.<init>(r6, r0)
            r4.sendToProxyServer(r5)
        L66:
            return r1
        L67:
            java.lang.Error r5 = new java.lang.Error
            r5.<init>()
            throw r5
        L6d:
            boolean r0 = r6 instanceof io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponse
            if (r0 == 0) goto L9e
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponse r6 = (io.netty.handler.codec.socksx.v5.Socks5PasswordAuthResponse) r6
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus r0 = r6.status()
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus r2 = io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus.SUCCESS
            if (r0 != r2) goto L7f
            r4.sendConnectCommand(r5)
            return r1
        L7f:
            io.netty.handler.proxy.ProxyConnectException r5 = new io.netty.handler.proxy.ProxyConnectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "authStatus: "
            r0.append(r1)
            io.netty.handler.codec.socksx.v5.Socks5PasswordAuthStatus r6 = r6.status()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r4.exceptionMessage(r6)
            r5.<init>(r6)
            throw r5
        L9e:
            io.netty.handler.codec.socksx.v5.Socks5CommandResponse r6 = (io.netty.handler.codec.socksx.v5.Socks5CommandResponse) r6
            io.netty.handler.codec.socksx.v5.Socks5CommandStatus r5 = r6.status()
            io.netty.handler.codec.socksx.v5.Socks5CommandStatus r0 = io.netty.handler.codec.socksx.v5.Socks5CommandStatus.SUCCESS
            if (r5 != r0) goto Laa
            r5 = 1
            return r5
        Laa:
            io.netty.handler.proxy.ProxyConnectException r5 = new io.netty.handler.proxy.ProxyConnectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "status: "
            r0.append(r1)
            io.netty.handler.codec.socksx.v5.Socks5CommandStatus r6 = r6.status()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r4.exceptionMessage(r6)
            r5.<init>(r6)
            throw r5
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected java.lang.Object newInitialMessage(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r2 = r1.socksAuthMethod()
            io.netty.handler.codec.socksx.v5.Socks5AuthMethod r0 = io.netty.handler.codec.socksx.v5.Socks5AuthMethod.PASSWORD
            if (r2 != r0) goto Lb
            io.netty.handler.codec.socksx.v5.Socks5InitialRequest r2 = io.netty.handler.proxy.Socks5ProxyHandler.INIT_REQUEST_PASSWORD
            return r2
        Lb:
            io.netty.handler.codec.socksx.v5.Socks5InitialRequest r2 = io.netty.handler.proxy.Socks5ProxyHandler.INIT_REQUEST_NO_AUTH
            return r2
    }

    public java.lang.String password() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    public java.lang.String protocol() {
            r1 = this;
            java.lang.String r0 = "socks5"
            return r0
    }

    @Override // io.netty.handler.proxy.ProxyHandler
    protected void removeDecoder(io.netty.channel.ChannelHandlerContext r2) throws java.lang.Exception {
            r1 = this;
            io.netty.channel.ChannelPipeline r2 = r2.pipeline()
            java.lang.String r0 = r1.decoderName
            io.netty.channel.ChannelHandlerContext r0 = r2.context(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = r1.decoderName
            r2.remove(r0)
        L11:
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
