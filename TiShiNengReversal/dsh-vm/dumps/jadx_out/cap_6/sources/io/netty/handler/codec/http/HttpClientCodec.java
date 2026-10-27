package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HttpClientCodec extends io.netty.channel.CombinedChannelDuplexHandler<io.netty.handler.codec.http.HttpResponseDecoder, io.netty.handler.codec.http.HttpRequestEncoder> implements io.netty.handler.codec.http.HttpClientUpgradeHandler.SourceCodec {
    private boolean done;
    private final boolean failOnMissingResponse;
    private final boolean parseHttpAfterConnectRequest;
    private final java.util.Queue<io.netty.handler.codec.http.HttpMethod> queue;
    private final java.util.concurrent.atomic.AtomicLong requestResponseCounter;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.HttpClientCodec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Decoder extends io.netty.handler.codec.http.HttpResponseDecoder {
        final /* synthetic */ io.netty.handler.codec.http.HttpClientCodec this$0;

        Decoder(io.netty.handler.codec.http.HttpClientCodec r1, int r2, int r3, int r4, boolean r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3, r4, r5)
                return
        }

        Decoder(io.netty.handler.codec.http.HttpClientCodec r1, int r2, int r3, int r4, boolean r5, int r6) {
                r0 = this;
                r0.this$0 = r1
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return
        }

        private void decrement(java.lang.Object r1) {
                r0 = this;
                if (r1 != 0) goto L3
                goto L10
            L3:
                boolean r1 = r1 instanceof io.netty.handler.codec.http.LastHttpContent
                if (r1 == 0) goto L10
                io.netty.handler.codec.http.HttpClientCodec r1 = r0.this$0
                java.util.concurrent.atomic.AtomicLong r1 = io.netty.handler.codec.http.HttpClientCodec.access$400(r1)
                r1.decrementAndGet()
            L10:
                return
        }

        @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
        public void channelInactive(io.netty.channel.ChannelHandlerContext r6) throws java.lang.Exception {
                r5 = this;
                super.channelInactive(r6)
                io.netty.handler.codec.http.HttpClientCodec r0 = r5.this$0
                boolean r0 = io.netty.handler.codec.http.HttpClientCodec.access$300(r0)
                if (r0 == 0) goto L39
                io.netty.handler.codec.http.HttpClientCodec r0 = r5.this$0
                java.util.concurrent.atomic.AtomicLong r0 = io.netty.handler.codec.http.HttpClientCodec.access$400(r0)
                long r0 = r0.get()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L39
                io.netty.handler.codec.PrematureChannelClosureException r2 = new io.netty.handler.codec.PrematureChannelClosureException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "channel gone inactive with "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = " missing response(s)"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                r6.fireExceptionCaught(r2)
            L39:
                return
        }

        @Override // io.netty.handler.codec.http.HttpObjectDecoder, io.netty.handler.codec.ByteToMessageDecoder
        protected void decode(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, java.util.List<java.lang.Object> r4) throws java.lang.Exception {
                r1 = this;
                io.netty.handler.codec.http.HttpClientCodec r0 = r1.this$0
                boolean r0 = io.netty.handler.codec.http.HttpClientCodec.access$100(r0)
                if (r0 == 0) goto L17
                int r2 = r1.actualReadableBytes()
                if (r2 != 0) goto Lf
                goto L36
            Lf:
                io.netty.buffer.ByteBuf r2 = r3.readBytes(r2)
                r4.add(r2)
                return
            L17:
                int r0 = r4.size()
                super.decode(r2, r3, r4)
                io.netty.handler.codec.http.HttpClientCodec r2 = r1.this$0
                boolean r2 = io.netty.handler.codec.http.HttpClientCodec.access$300(r2)
                if (r2 == 0) goto L36
                int r2 = r4.size()
            L2a:
                if (r0 >= r2) goto L36
                java.lang.Object r3 = r4.get(r0)
                r1.decrement(r3)
                int r0 = r0 + 1
                goto L2a
            L36:
                return
        }

        @Override // io.netty.handler.codec.http.HttpObjectDecoder
        protected boolean isContentAlwaysEmpty(io.netty.handler.codec.http.HttpMessage r6) {
                r5 = this;
                r0 = r6
                io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
                io.netty.handler.codec.http.HttpResponseStatus r0 = r0.status()
                int r0 = r0.code()
                r1 = 100
                if (r0 == r1) goto L64
                r1 = 101(0x65, float:1.42E-43)
                if (r0 != r1) goto L14
                goto L64
            L14:
                io.netty.handler.codec.http.HttpClientCodec r1 = r5.this$0
                java.util.Queue r1 = io.netty.handler.codec.http.HttpClientCodec.access$200(r1)
                java.lang.Object r1 = r1.poll()
                io.netty.handler.codec.http.HttpMethod r1 = (io.netty.handler.codec.http.HttpMethod) r1
                java.lang.String r2 = r1.name()
                r3 = 0
                char r2 = r2.charAt(r3)
                r3 = 67
                r4 = 1
                if (r2 == r3) goto L3c
                r0 = 72
                if (r2 == r0) goto L33
                goto L5f
            L33:
                io.netty.handler.codec.http.HttpMethod r0 = io.netty.handler.codec.http.HttpMethod.HEAD
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L5f
                return r4
            L3c:
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L5f
                io.netty.handler.codec.http.HttpMethod r0 = io.netty.handler.codec.http.HttpMethod.CONNECT
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L5f
                io.netty.handler.codec.http.HttpClientCodec r6 = r5.this$0
                boolean r6 = io.netty.handler.codec.http.HttpClientCodec.access$500(r6)
                if (r6 != 0) goto L5e
                io.netty.handler.codec.http.HttpClientCodec r6 = r5.this$0
                io.netty.handler.codec.http.HttpClientCodec.access$102(r6, r4)
                io.netty.handler.codec.http.HttpClientCodec r6 = r5.this$0
                java.util.Queue r6 = io.netty.handler.codec.http.HttpClientCodec.access$200(r6)
                r6.clear()
            L5e:
                return r4
            L5f:
                boolean r6 = super.isContentAlwaysEmpty(r6)
                return r6
            L64:
                boolean r6 = super.isContentAlwaysEmpty(r6)
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class Encoder extends io.netty.handler.codec.http.HttpRequestEncoder {
        final /* synthetic */ io.netty.handler.codec.http.HttpClientCodec this$0;
        boolean upgraded;

        private Encoder(io.netty.handler.codec.http.HttpClientCodec r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ Encoder(io.netty.handler.codec.http.HttpClientCodec r1, io.netty.handler.codec.http.HttpClientCodec.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.handler.codec.http.HttpObjectEncoder, io.netty.handler.codec.MessageToMessageEncoder
        protected void encode(io.netty.channel.ChannelHandlerContext r3, java.lang.Object r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
                r2 = this;
                boolean r0 = r2.upgraded
                if (r0 == 0) goto Lc
                java.lang.Object r3 = io.netty.util.ReferenceCountUtil.retain(r4)
                r5.add(r3)
                return
            Lc:
                boolean r0 = r4 instanceof io.netty.handler.codec.http.HttpRequest
                if (r0 == 0) goto L28
                io.netty.handler.codec.http.HttpClientCodec r0 = r2.this$0
                boolean r0 = io.netty.handler.codec.http.HttpClientCodec.access$100(r0)
                if (r0 != 0) goto L28
                io.netty.handler.codec.http.HttpClientCodec r0 = r2.this$0
                java.util.Queue r0 = io.netty.handler.codec.http.HttpClientCodec.access$200(r0)
                r1 = r4
                io.netty.handler.codec.http.HttpRequest r1 = (io.netty.handler.codec.http.HttpRequest) r1
                io.netty.handler.codec.http.HttpMethod r1 = r1.method()
                r0.offer(r1)
            L28:
                super.encode(r3, r4, r5)
                io.netty.handler.codec.http.HttpClientCodec r3 = r2.this$0
                boolean r3 = io.netty.handler.codec.http.HttpClientCodec.access$300(r3)
                if (r3 == 0) goto L48
                io.netty.handler.codec.http.HttpClientCodec r3 = r2.this$0
                boolean r3 = io.netty.handler.codec.http.HttpClientCodec.access$100(r3)
                if (r3 != 0) goto L48
                boolean r3 = r4 instanceof io.netty.handler.codec.http.LastHttpContent
                if (r3 == 0) goto L48
                io.netty.handler.codec.http.HttpClientCodec r3 = r2.this$0
                java.util.concurrent.atomic.AtomicLong r3 = io.netty.handler.codec.http.HttpClientCodec.access$400(r3)
                r3.incrementAndGet()
            L48:
                return
        }
    }

    public HttpClientCodec() {
            r3 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1 = 0
            r2 = 4096(0x1000, float:5.74E-42)
            r3.<init>(r2, r0, r0, r1)
            return
    }

    public HttpClientCodec(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public HttpClientCodec(int r7, int r8, int r9, boolean r10) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public HttpClientCodec(int r8, int r9, int r10, boolean r11, boolean r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public HttpClientCodec(int r9, int r10, int r11, boolean r12, boolean r13, int r14) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public HttpClientCodec(int r9, int r10, int r11, boolean r12, boolean r13, int r14, boolean r15) {
            r8 = this;
            r8.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r8.queue = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r8.requestResponseCounter = r0
            io.netty.handler.codec.http.HttpClientCodec$Decoder r1 = new io.netty.handler.codec.http.HttpClientCodec$Decoder
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            io.netty.handler.codec.http.HttpClientCodec$Encoder r9 = new io.netty.handler.codec.http.HttpClientCodec$Encoder
            r10 = 0
            r9.<init>(r8, r10)
            r8.init(r1, r9)
            r2.parseHttpAfterConnectRequest = r15
            r2.failOnMissingResponse = r12
            return
    }

    public HttpClientCodec(int r8, int r9, int r10, boolean r11, boolean r12, boolean r13) {
            r7 = this;
            r7.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r7.queue = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r7.requestResponseCounter = r0
            io.netty.handler.codec.http.HttpClientCodec$Decoder r1 = new io.netty.handler.codec.http.HttpClientCodec$Decoder
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            io.netty.handler.codec.http.HttpClientCodec$Encoder r8 = new io.netty.handler.codec.http.HttpClientCodec$Encoder
            r9 = 0
            r8.<init>(r7, r9)
            r7.init(r1, r8)
            r2.failOnMissingResponse = r11
            r2.parseHttpAfterConnectRequest = r13
            return
    }

    static /* synthetic */ boolean access$100(io.netty.handler.codec.http.HttpClientCodec r0) {
            boolean r0 = r0.done
            return r0
    }

    static /* synthetic */ boolean access$102(io.netty.handler.codec.http.HttpClientCodec r0, boolean r1) {
            r0.done = r1
            return r1
    }

    static /* synthetic */ java.util.Queue access$200(io.netty.handler.codec.http.HttpClientCodec r0) {
            java.util.Queue<io.netty.handler.codec.http.HttpMethod> r0 = r0.queue
            return r0
    }

    static /* synthetic */ boolean access$300(io.netty.handler.codec.http.HttpClientCodec r0) {
            boolean r0 = r0.failOnMissingResponse
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicLong access$400(io.netty.handler.codec.http.HttpClientCodec r0) {
            java.util.concurrent.atomic.AtomicLong r0 = r0.requestResponseCounter
            return r0
    }

    static /* synthetic */ boolean access$500(io.netty.handler.codec.http.HttpClientCodec r0) {
            boolean r0 = r0.parseHttpAfterConnectRequest
            return r0
    }

    public boolean isSingleDecode() {
            r1 = this;
            io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler()
            io.netty.handler.codec.http.HttpResponseDecoder r0 = (io.netty.handler.codec.http.HttpResponseDecoder) r0
            boolean r0 = r0.isSingleDecode()
            return r0
    }

    @Override // io.netty.handler.codec.http.HttpClientUpgradeHandler.SourceCodec
    public void prepareUpgradeFrom(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            io.netty.channel.ChannelOutboundHandler r2 = r1.outboundHandler()
            io.netty.handler.codec.http.HttpClientCodec$Encoder r2 = (io.netty.handler.codec.http.HttpClientCodec.Encoder) r2
            r0 = 1
            r2.upgraded = r0
            return
    }

    public void setSingleDecode(boolean r2) {
            r1 = this;
            io.netty.channel.ChannelInboundHandler r0 = r1.inboundHandler()
            io.netty.handler.codec.http.HttpResponseDecoder r0 = (io.netty.handler.codec.http.HttpResponseDecoder) r0
            r0.setSingleDecode(r2)
            return
    }

    @Override // io.netty.handler.codec.http.HttpClientUpgradeHandler.SourceCodec
    public void upgradeFrom(io.netty.channel.ChannelHandlerContext r1) {
            r0 = this;
            io.netty.channel.ChannelPipeline r1 = r1.pipeline()
            r1.remove(r0)
            return
    }
}
