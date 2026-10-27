package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2ServerUpgradeCodec implements io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeCodec {
    private static final io.netty.channel.ChannelHandler[] EMPTY_HANDLERS = null;
    private static final java.util.List<java.lang.CharSequence> REQUIRED_UPGRADE_HEADERS = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.handler.codec.http2.Http2ConnectionHandler connectionHandler;
    private final io.netty.handler.codec.http2.Http2FrameReader frameReader;
    private final java.lang.String handlerName;
    private final io.netty.channel.ChannelHandler[] handlers;
    private io.netty.handler.codec.http2.Http2Settings settings;


    static {
            java.lang.Class<io.netty.handler.codec.http2.Http2ServerUpgradeCodec> r0 = io.netty.handler.codec.http2.Http2ServerUpgradeCodec.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.codec.http2.Http2ServerUpgradeCodec.logger = r0
            java.lang.CharSequence r0 = io.netty.handler.codec.http2.Http2CodecUtil.HTTP_UPGRADE_SETTINGS_HEADER
            java.util.List r0 = java.util.Collections.singletonList(r0)
            io.netty.handler.codec.http2.Http2ServerUpgradeCodec.REQUIRED_UPGRADE_HEADERS = r0
            r0 = 0
            io.netty.channel.ChannelHandler[] r0 = new io.netty.channel.ChannelHandler[r0]
            io.netty.handler.codec.http2.Http2ServerUpgradeCodec.EMPTY_HANDLERS = r0
            return
    }

    public Http2ServerUpgradeCodec(io.netty.handler.codec.http2.Http2ConnectionHandler r3) {
            r2 = this;
            r0 = 0
            io.netty.channel.ChannelHandler[] r1 = io.netty.handler.codec.http2.Http2ServerUpgradeCodec.EMPTY_HANDLERS
            r2.<init>(r0, r3, r1)
            return
    }

    public Http2ServerUpgradeCodec(io.netty.handler.codec.http2.Http2FrameCodec r2, io.netty.channel.ChannelHandler... r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public Http2ServerUpgradeCodec(io.netty.handler.codec.http2.Http2MultiplexCodec r3) {
            r2 = this;
            r0 = 0
            io.netty.channel.ChannelHandler[] r1 = io.netty.handler.codec.http2.Http2ServerUpgradeCodec.EMPTY_HANDLERS
            r2.<init>(r0, r3, r1)
            return
    }

    public Http2ServerUpgradeCodec(java.lang.String r2, io.netty.handler.codec.http2.Http2ConnectionHandler r3) {
            r1 = this;
            io.netty.channel.ChannelHandler[] r0 = io.netty.handler.codec.http2.Http2ServerUpgradeCodec.EMPTY_HANDLERS
            r1.<init>(r2, r3, r0)
            return
    }

    private Http2ServerUpgradeCodec(java.lang.String r1, io.netty.handler.codec.http2.Http2ConnectionHandler r2, io.netty.channel.ChannelHandler... r3) {
            r0 = this;
            r0.<init>()
            r0.handlerName = r1
            r0.connectionHandler = r2
            r0.handlers = r3
            io.netty.handler.codec.http2.DefaultHttp2FrameReader r1 = new io.netty.handler.codec.http2.DefaultHttp2FrameReader
            r1.<init>()
            r0.frameReader = r1
            return
    }

    public Http2ServerUpgradeCodec(java.lang.String r2, io.netty.handler.codec.http2.Http2MultiplexCodec r3) {
            r1 = this;
            io.netty.channel.ChannelHandler[] r0 = io.netty.handler.codec.http2.Http2ServerUpgradeCodec.EMPTY_HANDLERS
            r1.<init>(r2, r3, r0)
            return
    }

    private static io.netty.buffer.ByteBuf createSettingsFrame(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5) {
            io.netty.buffer.ByteBufAllocator r4 = r4.alloc()
            int r0 = r5.readableBytes()
            int r0 = r0 + 9
            io.netty.buffer.ByteBuf r4 = r4.buffer(r0)
            int r0 = r5.readableBytes()
            io.netty.handler.codec.http2.Http2Flags r1 = new io.netty.handler.codec.http2.Http2Flags
            r1.<init>()
            r2 = 0
            r3 = 4
            io.netty.handler.codec.http2.Http2CodecUtil.writeFrameHeader(r4, r0, r3, r1, r2)
            r4.writeBytes(r5)
            r5.release()
            return r4
    }

    private io.netty.handler.codec.http2.Http2Settings decodeSettings(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            io.netty.handler.codec.http2.Http2Settings r0 = new io.netty.handler.codec.http2.Http2Settings     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            io.netty.handler.codec.http2.Http2FrameReader r1 = r3.frameReader     // Catch: java.lang.Throwable -> L13
            io.netty.handler.codec.http2.Http2ServerUpgradeCodec$1 r2 = new io.netty.handler.codec.http2.Http2ServerUpgradeCodec$1     // Catch: java.lang.Throwable -> L13
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L13
            r1.readFrame(r4, r5, r2)     // Catch: java.lang.Throwable -> L13
            r5.release()
            return r0
        L13:
            r4 = move-exception
            r5.release()
            throw r4
    }

    private io.netty.handler.codec.http2.Http2Settings decodeSettingsHeader(io.netty.channel.ChannelHandlerContext r3, java.lang.CharSequence r4) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.buffer.ByteBufAllocator r0 = r3.alloc()
            java.nio.CharBuffer r4 = java.nio.CharBuffer.wrap(r4)
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            io.netty.buffer.ByteBuf r4 = io.netty.buffer.ByteBufUtil.encodeString(r0, r4, r1)
            io.netty.handler.codec.base64.Base64Dialect r0 = io.netty.handler.codec.base64.Base64Dialect.URL_SAFE     // Catch: java.lang.Throwable -> L20
            io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.base64.Base64.decode(r4, r0)     // Catch: java.lang.Throwable -> L20
            io.netty.buffer.ByteBuf r0 = createSettingsFrame(r3, r0)     // Catch: java.lang.Throwable -> L20
            io.netty.handler.codec.http2.Http2Settings r3 = r2.decodeSettings(r3, r0)     // Catch: java.lang.Throwable -> L20
            r4.release()
            return r3
        L20:
            r3 = move-exception
            r4.release()
            throw r3
    }

    @Override // io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeCodec
    public boolean prepareUpgradeResponse(io.netty.channel.ChannelHandlerContext r4, io.netty.handler.codec.http.FullHttpRequest r5, io.netty.handler.codec.http.HttpHeaders r6) {
            r3 = this;
            r6 = 0
            io.netty.handler.codec.http.HttpHeaders r5 = r5.headers()     // Catch: java.lang.Throwable -> L25
            java.lang.CharSequence r0 = io.netty.handler.codec.http2.Http2CodecUtil.HTTP_UPGRADE_SETTINGS_HEADER     // Catch: java.lang.Throwable -> L25
            java.util.List r5 = r5.getAll(r0)     // Catch: java.lang.Throwable -> L25
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L27
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L25
            r2 = 1
            if (r1 > r2) goto L27
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L25
            io.netty.handler.codec.http2.Http2Settings r4 = r3.decodeSettingsHeader(r4, r5)     // Catch: java.lang.Throwable -> L25
            r3.settings = r4     // Catch: java.lang.Throwable -> L25
            return r2
        L25:
            r4 = move-exception
            goto L43
        L27:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r5.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "There must be 1 and only 1 "
            r5.append(r1)     // Catch: java.lang.Throwable -> L25
            r5.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = " header."
            r5.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L25
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L25
            throw r4     // Catch: java.lang.Throwable -> L25
        L43:
            io.netty.util.internal.logging.InternalLogger r5 = io.netty.handler.codec.http2.Http2ServerUpgradeCodec.logger
            java.lang.String r0 = "Error during upgrade to HTTP/2"
            r5.info(r0, r4)
            return r6
    }

    @Override // io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeCodec
    public java.util.Collection<java.lang.CharSequence> requiredUpgradeHeaders() {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = io.netty.handler.codec.http2.Http2ServerUpgradeCodec.REQUIRED_UPGRADE_HEADERS
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpServerUpgradeHandler.UpgradeCodec
    public void upgradeTo(io.netty.channel.ChannelHandlerContext r5, io.netty.handler.codec.http.FullHttpRequest r6) {
            r4 = this;
            io.netty.channel.ChannelPipeline r6 = r5.pipeline()     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            java.lang.String r0 = r5.name()     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            java.lang.String r1 = r4.handlerName     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            io.netty.handler.codec.http2.Http2ConnectionHandler r2 = r4.connectionHandler     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            r6.addAfter(r0, r1, r2)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            io.netty.channel.ChannelHandler[] r6 = r4.handlers     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            if (r6 == 0) goto L39
            io.netty.channel.ChannelPipeline r6 = r5.pipeline()     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            io.netty.handler.codec.http2.Http2ConnectionHandler r0 = r4.connectionHandler     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            io.netty.channel.ChannelHandlerContext r6 = r6.context(r0)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            java.lang.String r6 = r6.name()     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            io.netty.channel.ChannelHandler[] r0 = r4.handlers     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            int r0 = r0.length     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            int r0 = r0 + (-1)
        L26:
            if (r0 < 0) goto L39
            io.netty.channel.ChannelPipeline r1 = r5.pipeline()     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            io.netty.channel.ChannelHandler[] r2 = r4.handlers     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            r2 = r2[r0]     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            r3 = 0
            r1.addAfter(r6, r3, r2)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            int r0 = r0 + (-1)
            goto L26
        L37:
            r6 = move-exception
            goto L41
        L39:
            io.netty.handler.codec.http2.Http2ConnectionHandler r6 = r4.connectionHandler     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            io.netty.handler.codec.http2.Http2Settings r0 = r4.settings     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            r6.onHttpServerUpgrade(r0)     // Catch: io.netty.handler.codec.http2.Http2Exception -> L37
            return
        L41:
            r5.fireExceptionCaught(r6)
            r5.close()
            return
    }
}
