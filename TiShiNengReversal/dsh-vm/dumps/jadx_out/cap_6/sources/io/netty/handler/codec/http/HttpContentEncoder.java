package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class HttpContentEncoder extends io.netty.handler.codec.MessageToMessageCodec<io.netty.handler.codec.http.HttpRequest, io.netty.handler.codec.http.HttpObject> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CONTINUE_CODE = 0;
    private static final java.lang.CharSequence ZERO_LENGTH_CONNECT = null;
    private static final java.lang.CharSequence ZERO_LENGTH_HEAD = null;
    private final java.util.Queue<java.lang.CharSequence> acceptEncodingQueue;
    private io.netty.channel.embedded.EmbeddedChannel encoder;
    private io.netty.handler.codec.http.HttpContentEncoder.State state;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.http.HttpContentEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http$HttpContentEncoder$State = null;

        static {
                io.netty.handler.codec.http.HttpContentEncoder$State[] r0 = io.netty.handler.codec.http.HttpContentEncoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.http.HttpContentEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpContentEncoder$State = r0
                io.netty.handler.codec.http.HttpContentEncoder$State r1 = io.netty.handler.codec.http.HttpContentEncoder.State.AWAIT_HEADERS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.http.HttpContentEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpContentEncoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.http.HttpContentEncoder$State r1 = io.netty.handler.codec.http.HttpContentEncoder.State.AWAIT_CONTENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.http.HttpContentEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpContentEncoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.http.HttpContentEncoder$State r1 = io.netty.handler.codec.http.HttpContentEncoder.State.PASS_THROUGH     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Result {
        private final io.netty.channel.embedded.EmbeddedChannel contentEncoder;
        private final java.lang.String targetContentEncoding;

        public Result(java.lang.String r1, io.netty.channel.embedded.EmbeddedChannel r2) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto L14
                if (r2 == 0) goto Lc
                r0.targetContentEncoding = r1
                r0.contentEncoder = r2
                return
            Lc:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "contentEncoder"
                r1.<init>(r2)
                throw r1
            L14:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "targetContentEncoding"
                r1.<init>(r2)
                throw r1
        }

        public io.netty.channel.embedded.EmbeddedChannel contentEncoder() {
                r1 = this;
                io.netty.channel.embedded.EmbeddedChannel r0 = r1.contentEncoder
                return r0
        }

        public java.lang.String targetContentEncoding() {
                r1 = this;
                java.lang.String r0 = r1.targetContentEncoding
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.handler.codec.http.HttpContentEncoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.http.HttpContentEncoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.http.HttpContentEncoder.State AWAIT_CONTENT = null;
        public static final io.netty.handler.codec.http.HttpContentEncoder.State AWAIT_HEADERS = null;
        public static final io.netty.handler.codec.http.HttpContentEncoder.State PASS_THROUGH = null;

        static {
                io.netty.handler.codec.http.HttpContentEncoder$State r0 = new io.netty.handler.codec.http.HttpContentEncoder$State
                java.lang.String r1 = "PASS_THROUGH"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http.HttpContentEncoder.State.PASS_THROUGH = r0
                io.netty.handler.codec.http.HttpContentEncoder$State r1 = new io.netty.handler.codec.http.HttpContentEncoder$State
                java.lang.String r3 = "AWAIT_HEADERS"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http.HttpContentEncoder.State.AWAIT_HEADERS = r1
                io.netty.handler.codec.http.HttpContentEncoder$State r3 = new io.netty.handler.codec.http.HttpContentEncoder$State
                java.lang.String r5 = "AWAIT_CONTENT"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http.HttpContentEncoder.State.AWAIT_CONTENT = r3
                r5 = 3
                io.netty.handler.codec.http.HttpContentEncoder$State[] r5 = new io.netty.handler.codec.http.HttpContentEncoder.State[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.http.HttpContentEncoder.State.$VALUES = r5
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http.HttpContentEncoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.HttpContentEncoder$State> r0 = io.netty.handler.codec.http.HttpContentEncoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.HttpContentEncoder$State r1 = (io.netty.handler.codec.http.HttpContentEncoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.http.HttpContentEncoder.State[] values() {
                io.netty.handler.codec.http.HttpContentEncoder$State[] r0 = io.netty.handler.codec.http.HttpContentEncoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.HttpContentEncoder$State[] r0 = (io.netty.handler.codec.http.HttpContentEncoder.State[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "HEAD"
            io.netty.handler.codec.http.HttpContentEncoder.ZERO_LENGTH_HEAD = r0
            java.lang.String r0 = "CONNECT"
            io.netty.handler.codec.http.HttpContentEncoder.ZERO_LENGTH_CONNECT = r0
            io.netty.handler.codec.http.HttpResponseStatus r0 = io.netty.handler.codec.http.HttpResponseStatus.CONTINUE
            int r0 = r0.code()
            io.netty.handler.codec.http.HttpContentEncoder.CONTINUE_CODE = r0
            return
    }

    public HttpContentEncoder() {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.acceptEncodingQueue = r0
            io.netty.handler.codec.http.HttpContentEncoder$State r0 = io.netty.handler.codec.http.HttpContentEncoder.State.AWAIT_HEADERS
            r1.state = r0
            return
    }

    private void cleanup() {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.encoder
            if (r0 == 0) goto La
            r0.finishAndReleaseAll()
            r0 = 0
            r1.encoder = r0
        La:
            return
    }

    private void cleanupSafely(io.netty.channel.ChannelHandlerContext r2) {
            r1 = this;
            r1.cleanup()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            r2.fireExceptionCaught(r0)
            return
    }

    private void encode(io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) {
            r3 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r3.encoder
            io.netty.buffer.ByteBuf r4 = r4.retain()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r0.writeOutbound(r1)
            r3.fetchEncoderOutput(r5)
            return
    }

    private boolean encodeContent(io.netty.handler.codec.http.HttpContent r3, java.util.List<java.lang.Object> r4) {
            r2 = this;
            io.netty.buffer.ByteBuf r0 = r3.content()
            r2.encode(r0, r4)
            boolean r0 = r3 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r0 == 0) goto L2c
            r2.finishEncode(r4)
            io.netty.handler.codec.http.LastHttpContent r3 = (io.netty.handler.codec.http.LastHttpContent) r3
            io.netty.handler.codec.http.HttpHeaders r3 = r3.trailingHeaders()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L20
            io.netty.handler.codec.http.LastHttpContent r3 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT
            r4.add(r3)
            goto L2a
        L20:
            io.netty.handler.codec.http.ComposedLastHttpContent r0 = new io.netty.handler.codec.http.ComposedLastHttpContent
            io.netty.handler.codec.DecoderResult r1 = io.netty.handler.codec.DecoderResult.SUCCESS
            r0.<init>(r3, r1)
            r4.add(r0)
        L2a:
            r3 = 1
            return r3
        L2c:
            r3 = 0
            return r3
    }

    private void encodeFullResponse(io.netty.handler.codec.http.HttpResponse r4, io.netty.handler.codec.http.HttpContent r5, java.util.List<java.lang.Object> r6) {
            r3 = this;
            int r0 = r6.size()
            r3.encodeContent(r5, r6)
            boolean r5 = io.netty.handler.codec.http.HttpUtil.isContentLengthSet(r4)
            if (r5 == 0) goto L2f
            r5 = 0
        Le:
            int r1 = r6.size()
            if (r0 >= r1) goto L2a
            java.lang.Object r1 = r6.get(r0)
            boolean r2 = r1 instanceof io.netty.handler.codec.http.HttpContent
            if (r2 == 0) goto L27
            io.netty.handler.codec.http.HttpContent r1 = (io.netty.handler.codec.http.HttpContent) r1
            io.netty.buffer.ByteBuf r1 = r1.content()
            int r1 = r1.readableBytes()
            int r5 = r5 + r1
        L27:
            int r0 = r0 + 1
            goto Le
        L2a:
            long r5 = (long) r5
            io.netty.handler.codec.http.HttpUtil.setContentLength(r4, r5)
            return
        L2f:
            io.netty.handler.codec.http.HttpHeaders r4 = r4.headers()
            io.netty.util.AsciiString r5 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderValues.CHUNKED
            r4.set(r5, r6)
            return
    }

    private static void ensureContent(io.netty.handler.codec.http.HttpObject r3) {
            boolean r0 = r3 instanceof io.netty.handler.codec.http.HttpContent
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected message type: "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " (expected: "
            r1.append(r3)
            java.lang.Class<io.netty.handler.codec.http.HttpContent> r3 = io.netty.handler.codec.http.HttpContent.class
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static void ensureHeaders(io.netty.handler.codec.http.HttpObject r3) {
            boolean r0 = r3 instanceof io.netty.handler.codec.http.HttpResponse
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected message type: "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " (expected: "
            r1.append(r3)
            java.lang.Class<io.netty.handler.codec.http.HttpResponse> r3 = io.netty.handler.codec.http.HttpResponse.class
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private void fetchEncoderOutput(java.util.List<java.lang.Object> r3) {
            r2 = this;
        L0:
            io.netty.channel.embedded.EmbeddedChannel r0 = r2.encoder
            java.lang.Object r0 = r0.readOutbound()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            boolean r1 = r0.isReadable()
            if (r1 != 0) goto L15
            r0.release()
            goto L0
        L15:
            io.netty.handler.codec.http.DefaultHttpContent r1 = new io.netty.handler.codec.http.DefaultHttpContent
            r1.<init>(r0)
            r3.add(r1)
            goto L0
    }

    private void finishEncode(java.util.List<java.lang.Object> r2) {
            r1 = this;
            io.netty.channel.embedded.EmbeddedChannel r0 = r1.encoder
            boolean r0 = r0.finish()
            if (r0 == 0) goto Lb
            r1.fetchEncoderOutput(r2)
        Lb:
            r2 = 0
            r1.encoder = r2
            return
    }

    private static boolean isPassthru(io.netty.handler.codec.http.HttpVersion r2, int r3, java.lang.CharSequence r4) {
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 < r0) goto L1d
            r1 = 204(0xcc, float:2.86E-43)
            if (r3 == r1) goto L1d
            r1 = 304(0x130, float:4.26E-43)
            if (r3 == r1) goto L1d
            java.lang.CharSequence r1 = io.netty.handler.codec.http.HttpContentEncoder.ZERO_LENGTH_HEAD
            if (r4 == r1) goto L1d
            java.lang.CharSequence r1 = io.netty.handler.codec.http.HttpContentEncoder.ZERO_LENGTH_CONNECT
            if (r4 != r1) goto L16
            if (r3 == r0) goto L1d
        L16:
            io.netty.handler.codec.http.HttpVersion r3 = io.netty.handler.codec.http.HttpVersion.HTTP_1_0
            if (r2 != r3) goto L1b
            goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    @Override // io.netty.handler.codec.MessageToMessageCodec
    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.HttpContent
            if (r0 != 0) goto Lb
            boolean r2 = r2 instanceof io.netty.handler.codec.http.HttpResponse
            if (r2 == 0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }

    protected abstract io.netty.handler.codec.http.HttpContentEncoder.Result beginEncode(io.netty.handler.codec.http.HttpResponse r1, java.lang.String r2) throws java.lang.Exception;

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.cleanupSafely(r1)
            super.channelInactive(r1)
            return
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r3, io.netty.handler.codec.http.HttpRequest r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.http.HttpHeaders r3 = r4.headers()
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderNames.ACCEPT_ENCODING
            java.lang.String r3 = r3.get(r0)
            if (r3 != 0) goto Le
            java.lang.String r3 = io.netty.handler.codec.http.HttpContentDecoder.IDENTITY
        Le:
            io.netty.handler.codec.http.HttpMethod r0 = r4.method()
            io.netty.handler.codec.http.HttpMethod r1 = io.netty.handler.codec.http.HttpMethod.HEAD
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1d
            java.lang.CharSequence r3 = io.netty.handler.codec.http.HttpContentEncoder.ZERO_LENGTH_HEAD
            goto L27
        L1d:
            io.netty.handler.codec.http.HttpMethod r1 = io.netty.handler.codec.http.HttpMethod.CONNECT
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
            java.lang.CharSequence r3 = io.netty.handler.codec.http.HttpContentEncoder.ZERO_LENGTH_CONNECT
        L27:
            java.util.Queue<java.lang.CharSequence> r0 = r2.acceptEncodingQueue
            r0.add(r3)
            java.lang.Object r3 = io.netty.util.ReferenceCountUtil.retain(r4)
            r5.add(r3)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageCodec
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.HttpRequest r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpRequest r2 = (io.netty.handler.codec.http.HttpRequest) r2
            r0.decode2(r1, r2, r3)
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r5, io.netty.handler.codec.http.HttpObject r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
            r4 = this;
            boolean r5 = r6 instanceof io.netty.handler.codec.http.HttpResponse
            r0 = 1
            if (r5 == 0) goto Lb
            boolean r5 = r6 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r5 == 0) goto Lb
            r5 = 1
            goto Lc
        Lb:
            r5 = 0
        Lc:
            int[] r1 = io.netty.handler.codec.http.HttpContentEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpContentEncoder$State
            io.netty.handler.codec.http.HttpContentEncoder$State r2 = r4.state
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r0) goto L33
            r5 = 2
            if (r1 == r5) goto Lf9
            r5 = 3
            if (r1 == r5) goto L20
            goto L108
        L20:
            ensureContent(r6)
            java.lang.Object r5 = io.netty.util.ReferenceCountUtil.retain(r6)
            r7.add(r5)
            boolean r5 = r6 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r5 == 0) goto L108
            io.netty.handler.codec.http.HttpContentEncoder$State r5 = io.netty.handler.codec.http.HttpContentEncoder.State.AWAIT_HEADERS
            r4.state = r5
            return
        L33:
            ensureHeaders(r6)
            r0 = r6
            io.netty.handler.codec.http.HttpResponse r0 = (io.netty.handler.codec.http.HttpResponse) r0
            io.netty.handler.codec.http.HttpResponseStatus r1 = r0.status()
            int r1 = r1.code()
            int r2 = io.netty.handler.codec.http.HttpContentEncoder.CONTINUE_CODE
            if (r1 != r2) goto L47
            r2 = 0
            goto L51
        L47:
            java.util.Queue<java.lang.CharSequence> r2 = r4.acceptEncodingQueue
            java.lang.Object r2 = r2.poll()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L109
        L51:
            io.netty.handler.codec.http.HttpVersion r3 = r0.protocolVersion()
            boolean r1 = isPassthru(r3, r1, r2)
            if (r1 == 0) goto L6d
            if (r5 == 0) goto L65
            java.lang.Object r5 = io.netty.util.ReferenceCountUtil.retain(r0)
            r7.add(r5)
            return
        L65:
            r7.add(r0)
            io.netty.handler.codec.http.HttpContentEncoder$State r5 = io.netty.handler.codec.http.HttpContentEncoder.State.PASS_THROUGH
            r4.state = r5
            return
        L6d:
            if (r5 == 0) goto L84
            r1 = r0
            io.netty.buffer.ByteBufHolder r1 = (io.netty.buffer.ByteBufHolder) r1
            io.netty.buffer.ByteBuf r1 = r1.content()
            boolean r1 = r1.isReadable()
            if (r1 != 0) goto L84
            java.lang.Object r5 = io.netty.util.ReferenceCountUtil.retain(r0)
            r7.add(r5)
            return
        L84:
            java.lang.String r1 = r2.toString()
            io.netty.handler.codec.http.HttpContentEncoder$Result r1 = r4.beginEncode(r0, r1)
            if (r1 != 0) goto La0
            if (r5 == 0) goto L98
            java.lang.Object r5 = io.netty.util.ReferenceCountUtil.retain(r0)
            r7.add(r5)
            return
        L98:
            r7.add(r0)
            io.netty.handler.codec.http.HttpContentEncoder$State r5 = io.netty.handler.codec.http.HttpContentEncoder.State.PASS_THROUGH
            r4.state = r5
            return
        La0:
            io.netty.channel.embedded.EmbeddedChannel r2 = r1.contentEncoder()
            r4.encoder = r2
            io.netty.handler.codec.http.HttpHeaders r2 = r0.headers()
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_ENCODING
            java.lang.String r1 = r1.targetContentEncoding()
            r2.set(r3, r1)
            if (r5 == 0) goto Ld9
            io.netty.handler.codec.http.DefaultHttpResponse r5 = new io.netty.handler.codec.http.DefaultHttpResponse
            io.netty.handler.codec.http.HttpVersion r6 = r0.protocolVersion()
            io.netty.handler.codec.http.HttpResponseStatus r1 = r0.status()
            r5.<init>(r6, r1)
            io.netty.handler.codec.http.HttpHeaders r6 = r5.headers()
            io.netty.handler.codec.http.HttpHeaders r1 = r0.headers()
            r6.set(r1)
            r7.add(r5)
            ensureContent(r0)
            io.netty.handler.codec.http.HttpContent r0 = (io.netty.handler.codec.http.HttpContent) r0
            r4.encodeFullResponse(r5, r0, r7)
            return
        Ld9:
            io.netty.handler.codec.http.HttpHeaders r5 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r5.remove(r1)
            io.netty.handler.codec.http.HttpHeaders r5 = r0.headers()
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderNames.TRANSFER_ENCODING
            io.netty.util.AsciiString r2 = io.netty.handler.codec.http.HttpHeaderValues.CHUNKED
            r5.set(r1, r2)
            r7.add(r0)
            io.netty.handler.codec.http.HttpContentEncoder$State r5 = io.netty.handler.codec.http.HttpContentEncoder.State.AWAIT_CONTENT
            r4.state = r5
            boolean r5 = r6 instanceof io.netty.handler.codec.http.HttpContent
            if (r5 != 0) goto Lf9
            goto L108
        Lf9:
            ensureContent(r6)
            io.netty.handler.codec.http.HttpContent r6 = (io.netty.handler.codec.http.HttpContent) r6
            boolean r5 = r4.encodeContent(r6, r7)
            if (r5 == 0) goto L108
            io.netty.handler.codec.http.HttpContentEncoder$State r5 = io.netty.handler.codec.http.HttpContentEncoder.State.AWAIT_HEADERS
            r4.state = r5
        L108:
            return
        L109:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "cannot send more responses than requests"
            r5.<init>(r6)
            throw r5
    }

    @Override // io.netty.handler.codec.MessageToMessageCodec
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.http.HttpObject r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpObject r2 = (io.netty.handler.codec.http.HttpObject) r2
            r0.encode2(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerRemoved(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.cleanupSafely(r1)
            super.handlerRemoved(r1)
            return
    }
}
