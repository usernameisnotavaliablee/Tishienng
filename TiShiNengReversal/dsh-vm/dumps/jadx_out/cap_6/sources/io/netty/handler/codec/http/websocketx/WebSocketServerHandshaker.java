package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class WebSocketServerHandshaker {
    public static final java.lang.String SUB_PROTOCOL_WILDCARD = "*";
    protected static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig decoderConfig;
    private java.lang.String selectedSubprotocol;
    private final java.lang.String[] subprotocols;
    private final java.lang.String uri;
    private final io.netty.handler.codec.http.websocketx.WebSocketVersion version;



    static {
            java.lang.Class<io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker> r0 = io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker.logger = r0
            return
    }

    protected WebSocketServerHandshaker(io.netty.handler.codec.http.websocketx.WebSocketVersion r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r0 = io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig.newBuilder()
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig$Builder r5 = r0.maxFramePayloadLength(r5)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r5 = r5.build()
            r1.<init>(r2, r3, r4, r5)
            return
    }

    protected WebSocketServerHandshaker(io.netty.handler.codec.http.websocketx.WebSocketVersion r1, java.lang.String r2, java.lang.String r3, io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r4) {
            r0 = this;
            r0.<init>()
            r0.version = r1
            r0.uri = r2
            if (r3 == 0) goto L21
            java.lang.String r1 = ","
            java.lang.String[] r1 = r3.split(r1)
            r2 = 0
        L10:
            int r3 = r1.length
            if (r2 >= r3) goto L1e
            r3 = r1[r2]
            java.lang.String r3 = r3.trim()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L1e:
            r0.subprotocols = r1
            goto L25
        L21:
            java.lang.String[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS
            r0.subprotocols = r1
        L25:
            java.lang.String r1 = "decoderConfig"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r1)
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r1 = (io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig) r1
            r0.decoderConfig = r1
            return
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
            if (r1 == 0) goto Ld
            io.netty.channel.ChannelFuture r1 = r1.writeAndFlush(r2, r3)
            io.netty.channel.ChannelFutureListener r2 = io.netty.channel.ChannelFutureListener.CLOSE
            io.netty.channel.ChannelFuture r1 = r1.addListener(r2)
            return r1
        Ld:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "channel"
            r1.<init>(r2)
            throw r1
    }

    public io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig decoderConfig() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r0 = r1.decoderConfig
            return r0
    }

    public io.netty.channel.ChannelFuture handshake(io.netty.channel.Channel r3, io.netty.handler.codec.http.FullHttpRequest r4) {
            r2 = this;
            r0 = 0
            io.netty.channel.ChannelPromise r1 = r3.newPromise()
            io.netty.channel.ChannelFuture r3 = r2.handshake(r3, r4, r0, r1)
            return r3
    }

    public final io.netty.channel.ChannelFuture handshake(io.netty.channel.Channel r6, io.netty.handler.codec.http.FullHttpRequest r7, io.netty.handler.codec.http.HttpHeaders r8, io.netty.channel.ChannelPromise r9) {
            r5 = this;
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker.logger
            boolean r1 = r0.isDebugEnabled()
            if (r1 == 0) goto L11
            java.lang.String r1 = "{} WebSocket version {} server handshake"
            io.netty.handler.codec.http.websocketx.WebSocketVersion r2 = r5.version()
            r0.debug(r1, r6, r2)
        L11:
            io.netty.handler.codec.http.FullHttpResponse r7 = r5.newHandshakeResponse(r7, r8)
            io.netty.channel.ChannelPipeline r8 = r6.pipeline()
            java.lang.Class<io.netty.handler.codec.http.HttpObjectAggregator> r0 = io.netty.handler.codec.http.HttpObjectAggregator.class
            io.netty.channel.ChannelHandler r1 = r8.get(r0)
            if (r1 == 0) goto L24
            r8.remove(r0)
        L24:
            java.lang.Class<io.netty.handler.codec.http.HttpContentCompressor> r0 = io.netty.handler.codec.http.HttpContentCompressor.class
            io.netty.channel.ChannelHandler r1 = r8.get(r0)
            if (r1 == 0) goto L2f
            r8.remove(r0)
        L2f:
            java.lang.Class<io.netty.handler.codec.http.HttpRequestDecoder> r0 = io.netty.handler.codec.http.HttpRequestDecoder.class
            io.netty.channel.ChannelHandlerContext r0 = r8.context(r0)
            java.lang.String r1 = "wsdecoder"
            java.lang.String r2 = "wsencoder"
            if (r0 != 0) goto L69
            java.lang.Class<io.netty.handler.codec.http.HttpServerCodec> r0 = io.netty.handler.codec.http.HttpServerCodec.class
            io.netty.channel.ChannelHandlerContext r0 = r8.context(r0)
            if (r0 != 0) goto L4e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "No HttpDecoder and no HttpServerCodec in the pipeline"
            r6.<init>(r7)
            r9.setFailure(r6)
            return r9
        L4e:
            java.lang.String r3 = r0.name()
            io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder r4 = r5.newWebSocketEncoder()
            r8.addBefore(r3, r2, r4)
            java.lang.String r2 = r0.name()
            io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder r3 = r5.newWebsocketDecoder()
            r8.addBefore(r2, r1, r3)
            java.lang.String r8 = r0.name()
            goto L86
        L69:
            java.lang.String r0 = r0.name()
            io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder r3 = r5.newWebsocketDecoder()
            r8.replace(r0, r1, r3)
            java.lang.Class<io.netty.handler.codec.http.HttpResponseEncoder> r0 = io.netty.handler.codec.http.HttpResponseEncoder.class
            io.netty.channel.ChannelHandlerContext r0 = r8.context(r0)
            java.lang.String r0 = r0.name()
            io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder r1 = r5.newWebSocketEncoder()
            r8.addBefore(r0, r2, r1)
            r8 = r0
        L86:
            io.netty.channel.ChannelFuture r6 = r6.writeAndFlush(r7)
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker$1 r7 = new io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker$1
            r7.<init>(r5, r8, r9)
            r6.addListener(r7)
            return r9
    }

    public io.netty.channel.ChannelFuture handshake(io.netty.channel.Channel r3, io.netty.handler.codec.http.HttpRequest r4) {
            r2 = this;
            r0 = 0
            io.netty.channel.ChannelPromise r1 = r3.newPromise()
            io.netty.channel.ChannelFuture r3 = r2.handshake(r3, r4, r0, r1)
            return r3
    }

    public final io.netty.channel.ChannelFuture handshake(io.netty.channel.Channel r6, io.netty.handler.codec.http.HttpRequest r7, io.netty.handler.codec.http.HttpHeaders r8, io.netty.channel.ChannelPromise r9) {
            r5 = this;
            boolean r0 = r7 instanceof io.netty.handler.codec.http.FullHttpRequest
            if (r0 == 0) goto Lb
            io.netty.handler.codec.http.FullHttpRequest r7 = (io.netty.handler.codec.http.FullHttpRequest) r7
            io.netty.channel.ChannelFuture r6 = r5.handshake(r6, r7, r8, r9)
            return r6
        Lb:
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker.logger
            boolean r1 = r0.isDebugEnabled()
            if (r1 == 0) goto L1c
            java.lang.String r1 = "{} WebSocket version {} server handshake"
            io.netty.handler.codec.http.websocketx.WebSocketVersion r2 = r5.version()
            r0.debug(r1, r6, r2)
        L1c:
            io.netty.channel.ChannelPipeline r0 = r6.pipeline()
            java.lang.Class<io.netty.handler.codec.http.HttpRequestDecoder> r1 = io.netty.handler.codec.http.HttpRequestDecoder.class
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            if (r1 != 0) goto L3b
            java.lang.Class<io.netty.handler.codec.http.HttpServerCodec> r1 = io.netty.handler.codec.http.HttpServerCodec.class
            io.netty.channel.ChannelHandlerContext r1 = r0.context(r1)
            if (r1 != 0) goto L3b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "No HttpDecoder and no HttpServerCodec in the pipeline"
            r6.<init>(r7)
            r9.setFailure(r6)
            return r9
        L3b:
            java.lang.String r2 = r1.name()
            io.netty.handler.codec.http.HttpObjectAggregator r3 = new io.netty.handler.codec.http.HttpObjectAggregator
            r4 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r4)
            java.lang.String r4 = "httpAggregator"
            r0.addAfter(r2, r4, r3)
            io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker$2 r2 = new io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker$2
            r2.<init>(r5, r6, r8, r9)
            java.lang.String r6 = "handshaker"
            r0.addAfter(r4, r6, r2)
            java.lang.Object r6 = io.netty.util.ReferenceCountUtil.retain(r7)     // Catch: java.lang.Throwable -> L5d
            r1.fireChannelRead(r6)     // Catch: java.lang.Throwable -> L5d
            return r9
        L5d:
            r6 = move-exception
            r9.setFailure(r6)
            return r9
    }

    public int maxFramePayloadLength() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketDecoderConfig r0 = r1.decoderConfig
            int r0 = r0.maxFramePayloadLength()
            return r0
    }

    protected abstract io.netty.handler.codec.http.FullHttpResponse newHandshakeResponse(io.netty.handler.codec.http.FullHttpRequest r1, io.netty.handler.codec.http.HttpHeaders r2);

    protected abstract io.netty.handler.codec.http.websocketx.WebSocketFrameEncoder newWebSocketEncoder();

    protected abstract io.netty.handler.codec.http.websocketx.WebSocketFrameDecoder newWebsocketDecoder();

    protected java.lang.String selectSubprotocol(java.lang.String r11) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L3a
            java.lang.String[] r1 = r10.subprotocols
            int r1 = r1.length
            if (r1 != 0) goto L9
            goto L3a
        L9:
            java.lang.String r1 = ","
            java.lang.String[] r11 = r11.split(r1)
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L12:
            if (r3 >= r1) goto L3a
            r4 = r11[r3]
            java.lang.String r4 = r4.trim()
            java.lang.String[] r5 = r10.subprotocols
            int r6 = r5.length
            r7 = 0
        L1e:
            if (r7 >= r6) goto L37
            r8 = r5[r7]
            java.lang.String r9 = "*"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L34
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L31
            goto L34
        L31:
            int r7 = r7 + 1
            goto L1e
        L34:
            r10.selectedSubprotocol = r4
            return r4
        L37:
            int r3 = r3 + 1
            goto L12
        L3a:
            return r0
    }

    public java.lang.String selectedSubprotocol() {
            r1 = this;
            java.lang.String r0 = r1.selectedSubprotocol
            return r0
    }

    public java.util.Set<java.lang.String> subprotocols() {
            r2 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.String[] r1 = r2.subprotocols
            java.util.Collections.addAll(r0, r1)
            return r0
    }

    public java.lang.String uri() {
            r1 = this;
            java.lang.String r0 = r1.uri
            return r0
    }

    public io.netty.handler.codec.http.websocketx.WebSocketVersion version() {
            r1 = this;
            io.netty.handler.codec.http.websocketx.WebSocketVersion r0 = r1.version
            return r0
    }
}
