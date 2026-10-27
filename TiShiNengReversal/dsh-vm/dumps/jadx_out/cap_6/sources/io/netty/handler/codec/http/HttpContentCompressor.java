package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpContentCompressor extends io.netty.handler.codec.http.HttpContentEncoder {
    private final int compressionLevel;
    private final int contentSizeThreshold;
    private io.netty.channel.ChannelHandlerContext ctx;
    private final int memLevel;
    private final int windowBits;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.HttpContentCompressor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$ZlibWrapper = null;

        static {
                io.netty.handler.codec.compression.ZlibWrapper[] r0 = io.netty.handler.codec.compression.ZlibWrapper.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http.HttpContentCompressor.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper = r0
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.GZIP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http.HttpContentCompressor.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public HttpContentCompressor() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public HttpContentCompressor(int r4) {
            r3 = this;
            r0 = 8
            r1 = 0
            r2 = 15
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public HttpContentCompressor(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public HttpContentCompressor(int r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            if (r3 < 0) goto L73
            r0 = 9
            if (r3 > r0) goto L73
            if (r4 < r0) goto L57
            r1 = 15
            if (r4 > r1) goto L57
            r1 = 1
            if (r5 < r1) goto L3b
            if (r5 > r0) goto L3b
            if (r6 < 0) goto L1f
            r2.compressionLevel = r3
            r2.windowBits = r4
            r2.memLevel = r5
            r2.contentSizeThreshold = r6
            return
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "contentSizeThreshold: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = " (expected: non negative number)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "memLevel: "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r5 = " (expected: 1-9)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L57:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "windowBits: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " (expected: 9-15)"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L73:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "compressionLevel: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " (expected: 0-9)"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // io.netty.handler.codec.http.HttpContentEncoder
    protected io.netty.handler.codec.http.HttpContentEncoder.Result beginEncode(io.netty.handler.codec.http.HttpResponse r10, java.lang.String r11) throws java.lang.Exception {
            r9 = this;
            int r0 = r9.contentSizeThreshold
            r1 = 0
            if (r0 <= 0) goto L19
            boolean r0 = r10 instanceof io.netty.handler.codec.http.HttpContent
            if (r0 == 0) goto L19
            r0 = r10
            io.netty.handler.codec.http.HttpContent r0 = (io.netty.handler.codec.http.HttpContent) r0
            io.netty.buffer.ByteBuf r0 = r0.content()
            int r0 = r0.readableBytes()
            int r2 = r9.contentSizeThreshold
            if (r0 >= r2) goto L19
            return r1
        L19:
            io.netty.handler.codec.http.HttpHeaders r10 = r10.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_ENCODING
            java.lang.String r10 = r10.get(r0)
            if (r10 == 0) goto L26
            return r1
        L26:
            io.netty.handler.codec.compression.ZlibWrapper r10 = r9.determineWrapper(r11)
            if (r10 != 0) goto L2d
            return r1
        L2d:
            int[] r11 = io.netty.handler.codec.http.HttpContentCompressor.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper
            int r0 = r10.ordinal()
            r11 = r11[r0]
            r0 = 1
            if (r11 == r0) goto L44
            r1 = 2
            if (r11 != r1) goto L3e
            java.lang.String r11 = "deflate"
            goto L46
        L3e:
            java.lang.Error r10 = new java.lang.Error
            r10.<init>()
            throw r10
        L44:
            java.lang.String r11 = "gzip"
        L46:
            io.netty.handler.codec.http.HttpContentEncoder$Result r1 = new io.netty.handler.codec.http.HttpContentEncoder$Result
            io.netty.channel.embedded.EmbeddedChannel r2 = new io.netty.channel.embedded.EmbeddedChannel
            io.netty.channel.ChannelHandlerContext r3 = r9.ctx
            io.netty.channel.Channel r3 = r3.channel()
            io.netty.channel.ChannelId r3 = r3.id()
            io.netty.channel.ChannelHandlerContext r4 = r9.ctx
            io.netty.channel.Channel r4 = r4.channel()
            io.netty.channel.ChannelMetadata r4 = r4.metadata()
            boolean r4 = r4.hasDisconnect()
            io.netty.channel.ChannelHandlerContext r5 = r9.ctx
            io.netty.channel.Channel r5 = r5.channel()
            io.netty.channel.ChannelConfig r5 = r5.config()
            int r6 = r9.compressionLevel
            int r7 = r9.windowBits
            int r8 = r9.memLevel
            io.netty.handler.codec.compression.ZlibEncoder r10 = io.netty.handler.codec.compression.ZlibCodecFactory.newZlibEncoder(r10, r6, r7, r8)
            io.netty.channel.ChannelHandler[] r0 = new io.netty.channel.ChannelHandler[r0]
            r6 = 0
            r0[r6] = r10
            r2.<init>(r3, r4, r5, r0)
            r1.<init>(r11, r2)
            return r1
    }

    protected io.netty.handler.codec.compression.ZlibWrapper determineWrapper(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = ","
            java.lang.String[] r11 = r11.split(r0)
            int r0 = r11.length
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L10:
            r6 = 0
            if (r2 >= r0) goto L55
            r7 = r11[r2]
            r8 = 61
            int r8 = r7.indexOf(r8)
            r9 = -1
            if (r8 == r9) goto L2b
            int r8 = r8 + 1
            java.lang.String r8 = r7.substring(r8)     // Catch: java.lang.NumberFormatException -> L29
            float r6 = java.lang.Float.parseFloat(r8)     // Catch: java.lang.NumberFormatException -> L29
            goto L2d
        L29:
            goto L2d
        L2b:
            r6 = 1065353216(0x3f800000, float:1.0)
        L2d:
            java.lang.String r8 = "*"
            boolean r8 = r7.contains(r8)
            if (r8 == 0) goto L37
            r5 = r6
            goto L52
        L37:
            java.lang.String r8 = "gzip"
            boolean r8 = r7.contains(r8)
            if (r8 == 0) goto L45
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L45
            r3 = r6
            goto L52
        L45:
            java.lang.String r8 = "deflate"
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L52
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 <= 0) goto L52
            r4 = r6
        L52:
            int r2 = r2 + 1
            goto L10
        L55:
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 > 0) goto L72
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L5e
            goto L72
        L5e:
            int r11 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r11 <= 0) goto L70
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 != 0) goto L69
            io.netty.handler.codec.compression.ZlibWrapper r11 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            return r11
        L69:
            int r11 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r11 != 0) goto L70
            io.netty.handler.codec.compression.ZlibWrapper r11 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            return r11
        L70:
            r11 = 0
            return r11
        L72:
            int r11 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r11 < 0) goto L79
            io.netty.handler.codec.compression.ZlibWrapper r11 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            return r11
        L79:
            io.netty.handler.codec.compression.ZlibWrapper r11 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            return r11
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.ctx = r1
            return
    }
}
