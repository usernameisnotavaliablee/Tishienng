package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HttpServerCodec extends io.netty.channel.CombinedChannelDuplexHandler<io.netty.handler.codec.http.HttpRequestDecoder, io.netty.handler.codec.http.HttpResponseEncoder> implements io.netty.handler.codec.http.HttpServerUpgradeHandler.SourceCodec {
    private final java.util.Queue<io.netty.handler.codec.http.HttpMethod> queue;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.HttpServerCodec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class HttpServerRequestDecoder extends io.netty.handler.codec.http.HttpRequestDecoder {
        final /* synthetic */ io.netty.handler.codec.http.HttpServerCodec this$0;

        HttpServerRequestDecoder(io.netty.handler.codec.http.HttpServerCodec r1, int r2, int r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3, r4)
                return
        }

        HttpServerRequestDecoder(io.netty.handler.codec.http.HttpServerCodec r1, int r2, int r3, int r4, boolean r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3, r4, r5)
                return
        }

        HttpServerRequestDecoder(io.netty.handler.codec.http.HttpServerCodec r1, int r2, int r3, int r4, boolean r5, int r6) {
                r0 = this;
                r0.this$0 = r1
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        @Override // io.netty.handler.codec.http.HttpObjectDecoder, io.netty.handler.codec.ByteToMessageDecoder
        protected void decode(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
                r2 = this;
                int r0 = r5.size()
                super.decode(r3, r4, r5)
                int r3 = r5.size()
            Lb:
                if (r0 >= r3) goto L27
                java.lang.Object r4 = r5.get(r0)
                boolean r1 = r4 instanceof io.netty.handler.codec.http.HttpRequest
                if (r1 == 0) goto L24
                io.netty.handler.codec.http.HttpServerCodec r1 = r2.this$0
                java.util.Queue r1 = io.netty.handler.codec.http.HttpServerCodec.access$100(r1)
                io.netty.handler.codec.http.HttpRequest r4 = (io.netty.handler.codec.http.HttpRequest) r4
                io.netty.handler.codec.http.HttpMethod r4 = r4.method()
                r1.add(r4)
            L24:
                int r0 = r0 + 1
                goto Lb
            L27:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class HttpServerResponseEncoder extends io.netty.handler.codec.http.HttpResponseEncoder {
        private io.netty.handler.codec.http.HttpMethod method;
        final /* synthetic */ io.netty.handler.codec.http.HttpServerCodec this$0;

        private HttpServerResponseEncoder(io.netty.handler.codec.http.HttpServerCodec r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ HttpServerResponseEncoder(io.netty.handler.codec.http.HttpServerCodec r1, io.netty.handler.codec.http.HttpServerCodec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.handler.codec.http.HttpResponseEncoder, io.netty.handler.codec.http.HttpObjectEncoder
        protected /* bridge */ /* synthetic */ boolean isContentAlwaysEmpty(io.netty.handler.codec.http.HttpResponse r1) {
                r0 = this;
                io.netty.handler.codec.http.HttpResponse r1 = (io.netty.handler.codec.http.HttpResponse) r1
                boolean r1 = r0.isContentAlwaysEmpty2(r1)
                return r1
        }

        @Override // io.netty.handler.codec.http.HttpResponseEncoder
        /* renamed from: isContentAlwaysEmpty, reason: avoid collision after fix types in other method */
        protected boolean isContentAlwaysEmpty2(io.netty.handler.codec.http.HttpResponse r3) {
                r2 = this;
                io.netty.handler.codec.http.HttpServerCodec r0 = r2.this$0
                java.util.Queue r0 = io.netty.handler.codec.http.HttpServerCodec.access$100(r0)
                java.lang.Object r0 = r0.poll()
                io.netty.handler.codec.http.HttpMethod r0 = (io.netty.handler.codec.http.HttpMethod) r0
                r2.method = r0
                io.netty.handler.codec.http.HttpMethod r1 = io.netty.handler.codec.http.HttpMethod.HEAD
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L1f
                boolean r3 = super.isContentAlwaysEmpty2(r3)
                if (r3 == 0) goto L1d
                goto L1f
            L1d:
                r3 = 0
                return r3
            L1f:
                r3 = 1
                return r3
        }

        @Override // io.netty.handler.codec.http.HttpResponseEncoder, io.netty.handler.codec.http.HttpObjectEncoder
        protected /* bridge */ /* synthetic */ void sanitizeHeadersBeforeEncode(io.netty.handler.codec.http.HttpResponse r1, boolean r2) {
                r0 = this;
                io.netty.handler.codec.http.HttpResponse r1 = (io.netty.handler.codec.http.HttpResponse) r1
                r0.sanitizeHeadersBeforeEncode2(r1, r2)
                return
        }

        @Override // io.netty.handler.codec.http.HttpResponseEncoder
        /* renamed from: sanitizeHeadersBeforeEncode, reason: avoid collision after fix types in other method */
        protected void sanitizeHeadersBeforeEncode2(io.netty.handler.codec.http.HttpResponse r3, boolean r4) {
                r2 = this;
                if (r4 != 0) goto L22
                io.netty.handler.codec.http.HttpMethod r0 = io.netty.handler.codec.http.HttpMethod.CONNECT
                io.netty.handler.codec.http.HttpMethod r1 = r2.method
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L22
                io.netty.handler.codec.http.HttpResponseStatus r0 = r3.status()
                io.netty.handler.codec.http.HttpStatusClass r0 = r0.codeClass()
                io.netty.handler.codec.http.HttpStatusClass r1 = io.netty.handler.codec.http.HttpStatusClass.SUCCESS
                if (r0 != r1) goto L22
                io.netty.handler.codec.http.HttpHeaders r3 = r3.headers()
                io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
                r3.remove(r4)
                return
            L22:
                super.sanitizeHeadersBeforeEncode2(r3, r4)
                return
        }
    }

    public HttpServerCodec() {
            r2 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r0, r1, r1)
            return
    }

    public HttpServerCodec(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.queue = r0
            io.netty.handler.codec.http.HttpServerCodec$HttpServerRequestDecoder r0 = new io.netty.handler.codec.http.HttpServerCodec$HttpServerRequestDecoder
            r0.<init>(r1, r2, r3, r4)
            io.netty.handler.codec.http.HttpServerCodec$HttpServerResponseEncoder r2 = new io.netty.handler.codec.http.HttpServerCodec$HttpServerResponseEncoder
            r3 = 0
            r2.<init>(r1, r3)
            r1.init(r0, r2)
            return
    }

    public HttpServerCodec(int r8, int r9, int r10, boolean r11) {
            r7 = this;
            r7.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r7.queue = r0
            io.netty.handler.codec.http.HttpServerCodec$HttpServerRequestDecoder r1 = new io.netty.handler.codec.http.HttpServerCodec$HttpServerRequestDecoder
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.netty.handler.codec.http.HttpServerCodec$HttpServerResponseEncoder r8 = new io.netty.handler.codec.http.HttpServerCodec$HttpServerResponseEncoder
            r9 = 0
            r8.<init>(r7, r9)
            r7.init(r1, r8)
            return
    }

    public HttpServerCodec(int r9, int r10, int r11, boolean r12, int r13) {
            r8 = this;
            r8.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r8.queue = r0
            io.netty.handler.codec.http.HttpServerCodec$HttpServerRequestDecoder r1 = new io.netty.handler.codec.http.HttpServerCodec$HttpServerRequestDecoder
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            io.netty.handler.codec.http.HttpServerCodec$HttpServerResponseEncoder r9 = new io.netty.handler.codec.http.HttpServerCodec$HttpServerResponseEncoder
            r10 = 0
            r9.<init>(r8, r10)
            r8.init(r1, r9)
            return
    }

    static /* synthetic */ java.util.Queue access$100(io.netty.handler.codec.http.HttpServerCodec r0) {
            java.util.Queue<io.netty.handler.codec.http.HttpMethod> r0 = r0.queue
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpServerUpgradeHandler.SourceCodec
    public void upgradeFrom(io.netty.channel.ChannelHandlerContext r1) {
            r0 = this;
            io.netty.channel.ChannelPipeline r1 = r1.pipeline()
            r1.remove(r0)
            return
    }
}
