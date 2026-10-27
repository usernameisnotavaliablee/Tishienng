package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpContentDecompressor extends io.netty.handler.codec.http.HttpContentDecoder {
    private final boolean strict;

    public HttpContentDecompressor() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public HttpContentDecompressor(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.strict = r1
            return
    }

    @Override // io.netty.handler.codec.http.HttpContentDecoder
    protected io.netty.channel.embedded.EmbeddedChannel newContentDecoder(java.lang.String r7) throws java.lang.Exception {
            r6 = this;
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.GZIP
            boolean r0 = r0.contentEqualsIgnoreCase(r7)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L5f
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.X_GZIP
            boolean r0 = r0.contentEqualsIgnoreCase(r7)
            if (r0 == 0) goto L13
            goto L5f
        L13:
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.DEFLATE
            boolean r0 = r0.contentEqualsIgnoreCase(r7)
            if (r0 != 0) goto L26
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.X_DEFLATE
            boolean r7 = r0.contentEqualsIgnoreCase(r7)
            if (r7 == 0) goto L24
            goto L26
        L24:
            r7 = 0
            return r7
        L26:
            boolean r7 = r6.strict
            if (r7 == 0) goto L2d
            io.netty.handler.codec.compression.ZlibWrapper r7 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            goto L2f
        L2d:
            io.netty.handler.codec.compression.ZlibWrapper r7 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB_OR_NONE
        L2f:
            io.netty.channel.embedded.EmbeddedChannel r0 = new io.netty.channel.embedded.EmbeddedChannel
            io.netty.channel.ChannelHandlerContext r3 = r6.ctx
            io.netty.channel.Channel r3 = r3.channel()
            io.netty.channel.ChannelId r3 = r3.id()
            io.netty.channel.ChannelHandlerContext r4 = r6.ctx
            io.netty.channel.Channel r4 = r4.channel()
            io.netty.channel.ChannelMetadata r4 = r4.metadata()
            boolean r4 = r4.hasDisconnect()
            io.netty.channel.ChannelHandlerContext r5 = r6.ctx
            io.netty.channel.Channel r5 = r5.channel()
            io.netty.channel.ChannelConfig r5 = r5.config()
            io.netty.handler.codec.compression.ZlibDecoder r7 = io.netty.handler.codec.compression.ZlibCodecFactory.newZlibDecoder(r7)
            io.netty.channel.ChannelHandler[] r2 = new io.netty.channel.ChannelHandler[r2]
            r2[r1] = r7
            r0.<init>(r3, r4, r5, r2)
            return r0
        L5f:
            io.netty.channel.embedded.EmbeddedChannel r7 = new io.netty.channel.embedded.EmbeddedChannel
            io.netty.channel.ChannelHandlerContext r0 = r6.ctx
            io.netty.channel.Channel r0 = r0.channel()
            io.netty.channel.ChannelId r0 = r0.id()
            io.netty.channel.ChannelHandlerContext r3 = r6.ctx
            io.netty.channel.Channel r3 = r3.channel()
            io.netty.channel.ChannelMetadata r3 = r3.metadata()
            boolean r3 = r3.hasDisconnect()
            io.netty.channel.ChannelHandlerContext r4 = r6.ctx
            io.netty.channel.Channel r4 = r4.channel()
            io.netty.channel.ChannelConfig r4 = r4.config()
            io.netty.handler.codec.compression.ZlibWrapper r5 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            io.netty.handler.codec.compression.ZlibDecoder r5 = io.netty.handler.codec.compression.ZlibCodecFactory.newZlibDecoder(r5)
            io.netty.channel.ChannelHandler[] r2 = new io.netty.channel.ChannelHandler[r2]
            r2[r1] = r5
            r7.<init>(r0, r3, r4, r2)
            return r7
    }
}
