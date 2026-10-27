package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class WebSocketClientHandshaker {
    protected static final int DEFAULT_FORCE_CLOSE_TIMEOUT_MILLIS = 10000;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker> FORCE_CLOSE_INIT_UPDATER = null;
    private static final java.lang.String HTTPS_SCHEME_PREFIX = null;
    private static final java.lang.String HTTP_SCHEME_PREFIX = null;
    private final boolean absoluteUpgradeUrl;
    private volatile java.lang.String actualSubprotocol;
    protected final io.netty.handler.codec.http.HttpHeaders customHeaders;
    private final java.lang.String expectedSubprotocol;
    private volatile boolean forceCloseComplete;
    private volatile int forceCloseInit;
    private volatile long forceCloseTimeoutMillis;
    private volatile boolean handshakeComplete;
    private final int maxFramePayloadLength;
    private final java.net.URI uri;
    private final io.netty.handler.codec.http.websocketx.WebSocketVersion version;






    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.handler.codec.http.HttpScheme r1 = io.netty.handler.codec.http.HttpScheme.HTTP
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.HTTP_SCHEME_PREFIX = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            io.netty.handler.codec.http.HttpScheme r2 = io.netty.handler.codec.http.HttpScheme.HTTPS
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.HTTPS_SCHEME_PREFIX = r0
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker> r0 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.class
            java.lang.String r1 = "forceCloseInit"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.FORCE_CLOSE_INIT_UPDATER = r0
            return
    }

    protected WebSocketClientHandshaker(java.net.URI r9, io.netty.handler.codec.http.websocketx.WebSocketVersion r10, java.lang.String r11, io.netty.handler.codec.http.HttpHeaders r12, int r13) {
            r8 = this;
            r6 = 10000(0x2710, double:4.9407E-320)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    protected WebSocketClientHandshaker(java.net.URI r10, io.netty.handler.codec.http.websocketx.WebSocketVersion r11, java.lang.String r12, io.netty.handler.codec.http.HttpHeaders r13, int r14, long r15) {
            r9 = this;
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    protected WebSocketClientHandshaker(java.net.URI r3, io.netty.handler.codec.http.websocketx.WebSocketVersion r4, java.lang.String r5, io.netty.handler.codec.http.HttpHeaders r6, int r7, long r8, boolean r10) {
            r2 = this;
            r2.<init>()
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.forceCloseTimeoutMillis = r0
            r2.uri = r3
            r2.version = r4
            r2.expectedSubprotocol = r5
            r2.customHeaders = r6
            r2.maxFramePayloadLength = r7
            r2.forceCloseTimeoutMillis = r8
            r2.absoluteUpgradeUrl = r10
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater access$000() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater<io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker> r0 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.FORCE_CLOSE_INIT_UPDATER
            return r0
    }

    static /* synthetic */ boolean access$102(io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker r0, boolean r1) {
            r0.forceCloseComplete = r1
            return r1
    }

    private void applyForceCloseTimeout(io.netty.channel.Channel r7, io.netty.channel.ChannelFuture r8) {
            r6 = this;
            long r4 = r6.forceCloseTimeoutMillis
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1e
            boolean r0 = r7.isActive()
            if (r0 == 0) goto L1e
            int r0 = r6.forceCloseInit
            if (r0 == 0) goto L13
            goto L1e
        L13:
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$5 r0 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$5
            r3 = r6
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4)
            r8.addListener(r0)
        L1e:
            return
    }

    private void setActualSubprotocol(java.lang.String r1) {
            r0 = this;
            r0.actualSubprotocol = r1
            return
    }

    private void setHandshakeComplete() {
            r1 = this;
            r0 = 1
            r1.handshakeComplete = r0
            return
    }

    static java.lang.CharSequence websocketHostValue(java.net.URI r4) {
            int r0 = r4.getPort()
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.String r4 = r4.getHost()
            return r4
        Lc:
            java.lang.String r1 = r4.getHost()
            java.lang.String r4 = r4.getScheme()
            io.netty.handler.codec.http.HttpScheme r2 = io.netty.handler.codec.http.HttpScheme.HTTP
            int r3 = r2.port()
            if (r0 != r3) goto L38
            io.netty.util.AsciiString r2 = r2.name()
            boolean r2 = r2.contentEquals(r4)
            if (r2 != 0) goto L5c
            io.netty.handler.codec.http.websocketx.WebSocketScheme r2 = io.netty.handler.codec.http.websocketx.WebSocketScheme.WS
            io.netty.util.AsciiString r2 = r2.name()
            boolean r4 = r2.contentEquals(r4)
            if (r4 == 0) goto L33
            goto L5c
        L33:
            java.lang.String r4 = io.netty.util.NetUtil.toSocketAddressString(r1, r0)
            return r4
        L38:
            io.netty.handler.codec.http.HttpScheme r2 = io.netty.handler.codec.http.HttpScheme.HTTPS
            int r3 = r2.port()
            if (r0 != r3) goto L5d
            io.netty.util.AsciiString r2 = r2.name()
            boolean r2 = r2.contentEquals(r4)
            if (r2 != 0) goto L5c
            io.netty.handler.codec.http.websocketx.WebSocketScheme r2 = io.netty.handler.codec.http.websocketx.WebSocketScheme.WSS
            io.netty.util.AsciiString r2 = r2.name()
            boolean r4 = r2.contentEquals(r4)
            if (r4 == 0) goto L57
            goto L5c
        L57:
            java.lang.String r4 = io.netty.util.NetUtil.toSocketAddressString(r1, r0)
            return r4
        L5c:
            return r1
        L5d:
            java.lang.String r4 = io.netty.util.NetUtil.toSocketAddressString(r1, r0)
            return r4
    }

    static java.lang.CharSequence websocketOriginValue(java.net.URI r4) {
            java.lang.String r0 = r4.getScheme()
            int r1 = r4.getPort()
            io.netty.handler.codec.http.websocketx.WebSocketScheme r2 = io.netty.handler.codec.http.websocketx.WebSocketScheme.WSS
            io.netty.util.AsciiString r3 = r2.name()
            boolean r3 = r3.contentEquals(r0)
            if (r3 != 0) goto L32
            io.netty.handler.codec.http.HttpScheme r3 = io.netty.handler.codec.http.HttpScheme.HTTPS
            io.netty.util.AsciiString r3 = r3.name()
            boolean r3 = r3.contentEquals(r0)
            if (r3 != 0) goto L32
            if (r0 != 0) goto L29
            int r0 = r2.port()
            if (r1 != r0) goto L29
            goto L32
        L29:
            java.lang.String r0 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.HTTP_SCHEME_PREFIX
            io.netty.handler.codec.http.websocketx.WebSocketScheme r2 = io.netty.handler.codec.http.websocketx.WebSocketScheme.WS
            int r2 = r2.port()
            goto L38
        L32:
            java.lang.String r0 = io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker.HTTPS_SCHEME_PREFIX
            int r2 = r2.port()
        L38:
            java.lang.String r4 = r4.getHost()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r3)
            if (r1 == r2) goto L5b
            r2 = -1
            if (r1 == r2) goto L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r4 = io.netty.util.NetUtil.toSocketAddressString(r4, r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public java.lang.String actualSubprotocol() {
            r1 = this;
            java.lang.String r0 = r1.actualSubprotocol
            return r0
    }

    public io.netty.channel.ChannelFuture close(io.netty.channel.Channel r2, io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r3) {
            r1 = this;
            if (r2 == 0) goto Lb
            io.netty.channel.ChannelPromise r0 = r2.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.close(r2, r3, r0)
            return r2
        Lb:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "channel"
            r2.<init>(r3)
            throw r2
    }

    public io.netty.channel.ChannelFuture close(io.netty.channel.Channel r1, io.netty.handler.codec.http.websocketx.CloseWebSocketFrame r2, io.netty.channel.ChannelPromise r3) {
            r0 = this;
            if (r1 == 0) goto L9
            r1.writeAndFlush(r2, r3)
            r0.applyForceCloseTimeout(r1, r3)
            return r3
        L9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "channel"
            r1.<init>(r2)
            throw r1
    }

    public java.lang.String expectedSubprotocol() {
            r1 = this;
            java.lang.String r0 = r1.expectedSubprotocol
            return r0
    }

    public final void finishHandshake(io.netty.channel.Channel r6, io.netty.handler.codec.http.FullHttpResponse r7) {
            r5 = this;
            r5.verify(r7)
            io.netty.handler.codec.http.HttpHeaders r7 = r7.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL
            java.lang.String r7 = r7.get(r0)
            if (r7 == 0) goto L14
            java.lang.String r7 = r7.trim()
            goto L15
        L14:
            r7 = 0
        L15:
            java.lang.String r0 = r5.expectedSubprotocol
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            java.lang.String r0 = ""
        L1c:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2a
            if (r7 != 0) goto L2a
            java.lang.String r7 = r5.expectedSubprotocol
            r5.setActualSubprotocol(r7)
            goto L52
        L2a:
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto Ld5
            if (r7 == 0) goto Ld5
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto Ld5
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 0
        L41:
            if (r3 >= r1) goto Ld5
            r4 = r0[r3]
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto Ld1
            r5.setActualSubprotocol(r7)
        L52:
            r5.setHandshakeComplete()
            io.netty.channel.ChannelPipeline r7 = r6.pipeline()
            java.lang.Class<io.netty.handler.codec.http.HttpContentDecompressor> r0 = io.netty.handler.codec.http.HttpContentDecompressor.class
            io.netty.channel.ChannelHandler r0 = r7.get(r0)
            io.netty.handler.codec.http.HttpContentDecompressor r0 = (io.netty.handler.codec.http.HttpContentDecompressor) r0
            if (r0 == 0) goto L66
            r7.remove(r0)
        L66:
            java.lang.Class<io.netty.handler.codec.http.HttpObjectAggregator> r0 = io.netty.handler.codec.http.HttpObjectAggregator.class
            io.netty.channel.ChannelHandler r0 = r7.get(r0)
            io.netty.handler.codec.http.HttpObjectAggregator r0 = (io.netty.handler.codec.http.HttpObjectAggregator) r0
            if (r0 == 0) goto L73
            r7.remove(r0)
        L73:
            java.lang.Class<io.netty.handler.codec.http.HttpResponseDecoder> r0 = io.netty.handler.codec.http.HttpResponseDecoder.class
            io.netty.channel.ChannelHandlerContext r0 = r7.context(r0)
            java.lang.String r1 = "ws-decoder"
            if (r0 != 0) goto Lae
            java.lang.Class<io.netty.handler.codec.http.HttpClientCodec> r0 = io.netty.handler.codec.http.HttpClientCodec.class
            io.netty.channel.ChannelHandlerContext r0 = r7.context(r0)
            if (r0 == 0) goto La6
            io.netty.channel.ChannelHandler r2 = r0.handler()
            io.netty.handler.codec.http.HttpClientCodec r2 = (io.netty.handler.codec.http.HttpClientCodec) r2
            r2.removeOutboundHandler()
            java.lang.String r0 = r0.name()
            io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder r3 = r5.newWebsocketDecoder()
            r7.addAfter(r0, r1, r3)
            io.netty.channel.EventLoop r6 = r6.eventLoop()
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$2 r0 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$2
            r0.<init>(r5, r7, r2)
            r6.execute(r0)
            return
        La6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "ChannelPipeline does not contain a HttpRequestEncoder or HttpClientCodec"
            r6.<init>(r7)
            throw r6
        Lae:
            java.lang.Class<io.netty.handler.codec.http.HttpRequestEncoder> r2 = io.netty.handler.codec.http.HttpRequestEncoder.class
            io.netty.channel.ChannelHandler r3 = r7.get(r2)
            if (r3 == 0) goto Lb9
            r7.remove(r2)
        Lb9:
            java.lang.String r2 = r0.name()
            io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder r3 = r5.newWebsocketDecoder()
            r7.addAfter(r2, r1, r3)
            io.netty.channel.EventLoop r6 = r6.eventLoop()
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$3 r1 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$3
            r1.<init>(r5, r7, r0)
            r6.execute(r1)
            return
        Ld1:
            int r3 = r3 + 1
            goto L41
        Ld5:
            io.netty.handler.codec.http.websocketx.WebSocketHandshakeException r6 = new io.netty.handler.codec.http.websocketx.WebSocketHandshakeException
            java.lang.String r0 = r5.expectedSubprotocol
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r7 = 1
            r1[r7] = r0
            java.lang.String r7 = "Invalid subprotocol. Actual: %s. Expected one of: %s"
            java.lang.String r7 = java.lang.String.format(r7, r1)
            r6.<init>(r7)
            throw r6
    }

    public long forceCloseTimeoutMillis() {
            r2 = this;
            long r0 = r2.forceCloseTimeoutMillis
            return r0
    }

    public io.netty.channel.ChannelFuture handshake(io.netty.channel.Channel r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            io.netty.channel.ChannelPromise r0 = r2.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.handshake(r2, r0)
            return r2
        Lb:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "channel"
            r2.<init>(r0)
            throw r2
    }

    public final io.netty.channel.ChannelFuture handshake(io.netty.channel.Channel r3, io.netty.channel.ChannelPromise r4) {
            r2 = this;
            io.netty.channel.ChannelPipeline r0 = r3.pipeline()
            java.lang.Class<io.netty.handler.codec.http.HttpResponseDecoder> r1 = io.netty.handler.codec.http.HttpResponseDecoder.class
            io.netty.channel.ChannelHandler r1 = r0.get(r1)
            io.netty.handler.codec.http.HttpResponseDecoder r1 = (io.netty.handler.codec.http.HttpResponseDecoder) r1
            if (r1 != 0) goto L23
            java.lang.Class<io.netty.handler.codec.http.HttpClientCodec> r1 = io.netty.handler.codec.http.HttpClientCodec.class
            io.netty.channel.ChannelHandler r0 = r0.get(r1)
            io.netty.handler.codec.http.HttpClientCodec r0 = (io.netty.handler.codec.http.HttpClientCodec) r0
            if (r0 != 0) goto L23
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "ChannelPipeline does not contain a HttpResponseDecoder or HttpClientCodec"
            r3.<init>(r0)
            r4.setFailure(r3)
            return r4
        L23:
            io.netty.handler.codec.http.FullHttpRequest r0 = r2.newHandshakeRequest()
            io.netty.channel.ChannelFuture r3 = r3.writeAndFlush(r0)
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$1 r0 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$1
            r0.<init>(r2, r4)
            r3.addListener(r0)
            return r4
    }

    protected boolean isForceCloseComplete() {
            r1 = this;
            boolean r0 = r1.forceCloseComplete
            return r0
    }

    public boolean isHandshakeComplete() {
            r1 = this;
            boolean r0 = r1.handshakeComplete
            return r0
    }

    public int maxFramePayloadLength() {
            r1 = this;
            int r0 = r1.maxFramePayloadLength
            return r0
    }

    protected abstract io.netty.handler.codec.http.FullHttpRequest newHandshakeRequest();

    protected abstract io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder newWebSocketEncoder();

    protected abstract io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder newWebsocketDecoder();

    public final io.netty.channel.ChannelFuture processHandshake(io.netty.channel.Channel r2, io.netty.handler.codec.http.HttpResponse r3) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r2.newPromise()
            io.netty.channel.ChannelFuture r2 = r1.processHandshake(r2, r3, r0)
            return r2
    }

    public final io.netty.channel.ChannelFuture processHandshake(io.netty.channel.Channel r6, io.netty.handler.codec.http.HttpResponse r7, io.netty.channel.ChannelPromise r8) {
            r5 = this;
            boolean r0 = r7 instanceof io.netty.handler.codec.http.FullHttpResponse
            if (r0 == 0) goto L12
            io.netty.handler.codec.http.FullHttpResponse r7 = (io.netty.handler.codec.http.FullHttpResponse) r7     // Catch: java.lang.Throwable -> Ld
            r5.finishHandshake(r6, r7)     // Catch: java.lang.Throwable -> Ld
            r8.setSuccess()     // Catch: java.lang.Throwable -> Ld
            return r8
        Ld:
            r6 = move-exception
            r8.setFailure(r6)
            goto L58
        L12:
            io.netty.channel.ChannelPipeline r0 = r6.pipeline()
            java.lang.Class<io.netty.handler.codec.http.HttpResponseDecoder> r1 = io.netty.handler.codec.http.HttpResponseDecoder.class
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            if (r1 != 0) goto L32
            java.lang.Class<io.netty.handler.codec.http.HttpClientCodec> r1 = io.netty.handler.codec.http.HttpClientCodec.class
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            if (r1 != 0) goto L32
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "ChannelPipeline does not contain a HttpResponseDecoder or HttpClientCodec"
            r6.<init>(r7)
            io.netty.channel.ChannelPromise r6 = r8.setFailure(r6)
            return r6
        L32:
            java.lang.String r2 = r1.name()
            io.netty.handler.codec.http.HttpObjectAggregator r3 = new io.netty.handler.codec.http.HttpObjectAggregator
            r4 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r4)
            java.lang.String r4 = "httpAggregator"
            r0.addAfter(r2, r4, r3)
            io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$4 r2 = new io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker$4
            r2.<init>(r5, r6, r8)
            java.lang.String r6 = "handshaker"
            r0.addAfter(r4, r6, r2)
            java.lang.Object r6 = io.netty.util.ReferenceCountUtil.retain(r7)     // Catch: java.lang.Throwable -> L54
            r1.fireChannelRead(r6)     // Catch: java.lang.Throwable -> L54
            return r8
        L54:
            r6 = move-exception
            r8.setFailure(r6)
        L58:
            return r8
    }

    public io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker setForceCloseTimeoutMillis(long r1) {
            r0 = this;
            r0.forceCloseTimeoutMillis = r1
            return r0
    }

    protected java.lang.String upgradeUrl(java.net.URI r3) {
            r2 = this;
            boolean r0 = r2.absoluteUpgradeUrl
            if (r0 == 0) goto L9
            java.lang.String r3 = r3.toString()
            return r3
        L9:
            java.lang.String r0 = r3.getRawPath()
            java.lang.String r3 = r3.getRawQuery()
            if (r3 == 0) goto L2d
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 63
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
        L2d:
            if (r0 == 0) goto L37
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L36
            goto L37
        L36:
            return r0
        L37:
            java.lang.String r3 = "/"
            return r3
    }

    public java.net.URI uri() {
            r1 = this;
            java.net.URI r0 = r1.uri
            return r0
    }

    protected abstract void verify(io.netty.handler.codec.http.FullHttpResponse r1);

    public io.netty.handler.codec.http.websocketx.WebSocketVersion version() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = r1.version
            return r0
    }
}
