package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Http2ClientUpgradeCodec implements io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeCodec {
    private static final java.util.List<java.lang.CharSequence> UPGRADE_HEADERS = null;
    private final io.netty.handler.codec.http2.Http2ConnectionHandler connectionHandler;
    private final java.lang.String handlerName;
    private final io.netty.channel.ChannelHandler upgradeToHandler;

    static {
            java.lang.CharSequence r0 = io.netty.handler.codec.http2.Http2CodecUtil.HTTP_UPGRADE_SETTINGS_HEADER
            java.util.List r0 = java.util.Collections.singletonList(r0)
            io.netty.handler.codec.http2.Http2ClientUpgradeCodec.UPGRADE_HEADERS = r0
            return
    }

    public Http2ClientUpgradeCodec(io.netty.handler.codec.http2.Http2ConnectionHandler r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public Http2ClientUpgradeCodec(io.netty.handler.codec.http2.Http2FrameCodec r2, io.netty.channel.ChannelHandler r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public Http2ClientUpgradeCodec(java.lang.String r1, io.netty.handler.codec.http2.Http2ConnectionHandler r2) {
            r0 = this;
            r0.<init>(r1, r2, r2)
            return
    }

    private Http2ClientUpgradeCodec(java.lang.String r1, io.netty.handler.codec.http2.Http2ConnectionHandler r2, io.netty.channel.ChannelHandler r3) {
            r0 = this;
            r0.<init>()
            r0.handlerName = r1
            java.lang.String r1 = "connectionHandler"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
            io.netty.handler.codec.http2.Http2ConnectionHandler r1 = (io.netty.handler.codec.http2.Http2ConnectionHandler) r1
            r0.connectionHandler = r1
            java.lang.String r1 = "upgradeToHandler"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            io.netty.channel.ChannelHandler r1 = (io.netty.channel.ChannelHandler) r1
            r0.upgradeToHandler = r1
            return
    }

    public Http2ClientUpgradeCodec(java.lang.String r1, io.netty.handler.codec.http2.Http2FrameCodec r2, io.netty.channel.ChannelHandler r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private java.lang.CharSequence getSettingsHeaderValue(io.netty.channel.ChannelHandlerContext r6) {
            r5 = this;
            r0 = 0
            io.netty.handler.codec.http2.Http2ConnectionHandler r1 = r5.connectionHandler     // Catch: java.lang.Throwable -> L5a
            io.netty.handler.codec.http2.Http2ConnectionDecoder r1 = r1.decoder()     // Catch: java.lang.Throwable -> L5a
            io.netty.handler.codec.http2.Http2Settings r1 = r1.localSettings()     // Catch: java.lang.Throwable -> L5a
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L5a
            int r2 = r2 * 6
            io.netty.buffer.ByteBufAllocator r6 = r6.alloc()     // Catch: java.lang.Throwable -> L5a
            io.netty.buffer.ByteBuf r6 = r6.buffer(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.Iterable r1 = r1.entries()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
        L21:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L42
            io.netty.util.collection.CharObjectMap$PrimitiveEntry r2 = (io.netty.util.collection.CharObjectMap.PrimitiveEntry) r2     // Catch: java.lang.Throwable -> L42
            char r3 = r2.key()     // Catch: java.lang.Throwable -> L42
            r6.writeChar(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.value()     // Catch: java.lang.Throwable -> L42
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L42
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L42
            r6.writeInt(r2)     // Catch: java.lang.Throwable -> L42
            goto L21
        L42:
            r1 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L5c
        L47:
            io.netty.handler.codec.base64.Base64Dialect r1 = io.netty.handler.codec.base64.Base64Dialect.URL_SAFE     // Catch: java.lang.Throwable -> L42
            io.netty.buffer.ByteBuf r0 = io.netty.handler.codec.base64.Base64.encode(r6, r1)     // Catch: java.lang.Throwable -> L42
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r0.toString(r1)     // Catch: java.lang.Throwable -> L42
            io.netty.util.ReferenceCountUtil.release(r6)
            io.netty.util.ReferenceCountUtil.release(r0)
            return r1
        L5a:
            r1 = move-exception
            r6 = r0
        L5c:
            io.netty.util.ReferenceCountUtil.release(r0)
            io.netty.util.ReferenceCountUtil.release(r6)
            throw r1
    }

    @Override // io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeCodec
    public java.lang.CharSequence protocol() {
            r1 = this;
            java.lang.CharSequence r0 = io.netty.handler.codec.http2.Http2CodecUtil.HTTP_UPGRADE_PROTOCOL_NAME
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeCodec
    public java.util.Collection<java.lang.CharSequence> setUpgradeHeaders(io.netty.channel.ChannelHandlerContext r2, io.netty.handler.codec.http.HttpRequest r3) {
            r1 = this;
            java.lang.CharSequence r2 = r1.getSettingsHeaderValue(r2)
            io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
            java.lang.CharSequence r0 = io.netty.handler.codec.http2.Http2CodecUtil.HTTP_UPGRADE_SETTINGS_HEADER
            r3.set(r0, r2)
            java.util.List<java.lang.CharSequence> r2 = io.netty.handler.codec.http2.Http2ClientUpgradeCodec.UPGRADE_HEADERS
            return r2
    }

    @Override // io.netty.handler.codec.http.HttpClientUpgradeHandler.UpgradeCodec
    public void upgradeTo(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http.FullHttpResponse r4) throws java.lang.Exception {
            r2 = this;
            io.netty.channel.ChannelPipeline r4 = r3.pipeline()
            java.lang.String r3 = r3.name()
            java.lang.String r0 = r2.handlerName
            io.netty.channel.ChannelHandler r1 = r2.upgradeToHandler
            r4.addAfter(r3, r0, r1)
            io.netty.handler.codec.http2.Http2ConnectionHandler r3 = r2.connectionHandler
            r3.onHttpClientUpgrade()
            return
    }
}
