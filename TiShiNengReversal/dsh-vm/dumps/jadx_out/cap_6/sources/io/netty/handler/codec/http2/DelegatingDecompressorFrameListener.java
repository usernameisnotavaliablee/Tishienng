package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DelegatingDecompressorFrameListener extends io.netty.handler.codec.http2.Http2FrameListenerDecorator {
    private final io.netty.handler.codec.http2.Http2Connection connection;
    private boolean flowControllerInitialized;
    private final io.netty.handler.codec.http2.Http2Connection.PropertyKey propertyKey;
    private final boolean strict;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ConsumedBytesConverter implements io.netty.handler.codec.http2.Http2LocalFlowController {
        private final io.netty.handler.codec.http2.Http2LocalFlowController flowController;
        final /* synthetic */ io.netty.handler.codec.http2.DelegatingDecompressorFrameListener this$0;

        ConsumedBytesConverter(io.netty.handler.codec.http2.DelegatingDecompressorFrameListener r1, io.netty.handler.codec.http2.Http2LocalFlowController r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.String r1 = "flowController"
                java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r1)
                io.netty.handler.codec.http2.Http2LocalFlowController r1 = (io.netty.handler.codec.http2.Http2LocalFlowController) r1
                r0.flowController = r1
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FlowController
        public void channelHandlerContext(io.netty.channel.ChannelHandlerContext r2) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController
                r0.channelHandlerContext(r2)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2LocalFlowController
        public boolean consumeBytes(io.netty.handler.codec.http2.Http2Stream r4, int r5) throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                io.netty.handler.codec.http2.DelegatingDecompressorFrameListener r0 = r3.this$0
                io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$Http2Decompressor r0 = r0.decompressor(r4)
                if (r0 == 0) goto L10
                int r1 = r4.id()
                int r5 = r0.consumeBytes(r1, r5)
            L10:
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r3.flowController     // Catch: java.lang.Throwable -> L17 io.netty.handler.codec.http2.Http2Exception -> L19
                boolean r4 = r0.consumeBytes(r4, r5)     // Catch: java.lang.Throwable -> L17 io.netty.handler.codec.http2.Http2Exception -> L19
                return r4
            L17:
                r5 = move-exception
                goto L1b
            L19:
                r4 = move-exception
                goto L2b
            L1b:
                int r4 = r4.id()
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "Error while returning bytes to flow control window"
                io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.streamError(r4, r0, r5, r2, r1)
                throw r4
            L2b:
                throw r4
        }

        @Override // io.netty.handler.codec.http2.Http2LocalFlowController
        public io.netty.handler.codec.http2.Http2LocalFlowController frameWriter(io.netty.handler.codec.http2.Http2FrameWriter r2) {
                r1 = this;
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController
                io.netty.handler.codec.http2.Http2LocalFlowController r2 = r0.frameWriter(r2)
                return r2
        }

        @Override // io.netty.handler.codec.http2.Http2FlowController
        public void incrementWindowSize(io.netty.handler.codec.http2.Http2Stream r2, int r3) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController
                r0.incrementWindowSize(r2, r3)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2FlowController
        public int initialWindowSize() {
                r1 = this;
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController
                int r0 = r0.initialWindowSize()
                return r0
        }

        @Override // io.netty.handler.codec.http2.Http2LocalFlowController
        public int initialWindowSize(io.netty.handler.codec.http2.Http2Stream r2) {
                r1 = this;
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController
                int r2 = r0.initialWindowSize(r2)
                return r2
        }

        @Override // io.netty.handler.codec.http2.Http2FlowController
        public void initialWindowSize(int r2) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController
                r0.initialWindowSize(r2)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2LocalFlowController
        public void receiveFlowControlledFrame(io.netty.handler.codec.http2.Http2Stream r2, io.netty.buffer.ByteBuf r3, int r4, boolean r5) throws io.netty.handler.codec.http2.Http2Exception {
                r1 = this;
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController
                r0.receiveFlowControlledFrame(r2, r3, r4, r5)
                return
        }

        @Override // io.netty.handler.codec.http2.Http2LocalFlowController
        public int unconsumedBytes(io.netty.handler.codec.http2.Http2Stream r2) {
                r1 = this;
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController
                int r2 = r0.unconsumedBytes(r2)
                return r2
        }

        @Override // io.netty.handler.codec.http2.Http2FlowController
        public int windowSize(io.netty.handler.codec.http2.Http2Stream r2) {
                r1 = this;
                io.netty.handler.codec.http2.Http2LocalFlowController r0 = r1.flowController
                int r2 = r0.windowSize(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Http2Decompressor {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private int compressed;
        private int decompressed;
        private final io.netty.channel.embedded.EmbeddedChannel decompressor;

        static {
                return
        }

        Http2Decompressor(io.netty.channel.embedded.EmbeddedChannel r1) {
                r0 = this;
                r0.<init>()
                r0.decompressor = r1
                return
        }

        int consumeBytes(int r11, int r12) throws io.netty.handler.codec.http2.Http2Exception {
                r10 = this;
                java.lang.String r0 = "decompressedBytes"
                io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r12, r0)
                int r0 = r10.decompressed
                int r1 = r0 - r12
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 < 0) goto L5e
                double r6 = (double) r12
                double r0 = (double) r0
                double r6 = r6 / r0
                int r0 = r10.compressed
                double r8 = (double) r0
                double r8 = r8 * r6
                double r6 = java.lang.Math.ceil(r8)
                int r1 = (int) r6
                int r0 = java.lang.Math.min(r0, r1)
                int r1 = r10.compressed
                int r6 = r1 - r0
                if (r6 < 0) goto L2f
                int r11 = r10.decompressed
                int r11 = r11 - r12
                r10.decompressed = r11
                int r1 = r1 - r0
                r10.compressed = r1
                return r0
            L2f:
                io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                int r7 = r10.decompressed
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                int r8 = r10.compressed
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r9 = 5
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r9[r5] = r6
                r9[r4] = r12
                r9[r3] = r7
                r9[r2] = r8
                r12 = 4
                r9[r12] = r0
                java.lang.String r12 = "overflow when converting decompressed bytes to compressed bytes for stream %d.decompressedBytes: %d decompressed: %d compressed: %d consumedCompressed: %d"
                io.netty.handler.codec.http2.Http2Exception r11 = io.netty.handler.codec.http2.Http2Exception.streamError(r11, r1, r12, r9)
                throw r11
            L5e:
                io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                int r6 = r10.decompressed
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r1
                r2[r4] = r6
                r2[r3] = r12
                java.lang.String r12 = "Attempting to return too many bytes for stream %d. decompressed: %d decompressedBytes: %d"
                io.netty.handler.codec.http2.Http2Exception r11 = io.netty.handler.codec.http2.Http2Exception.streamError(r11, r0, r12, r2)
                throw r11
        }

        io.netty.channel.embedded.EmbeddedChannel decompressor() {
                r1 = this;
                io.netty.channel.embedded.EmbeddedChannel r0 = r1.decompressor
                return r0
        }

        void incrementCompressedBytes(int r2) {
                r1 = this;
                int r0 = r1.compressed
                int r0 = r0 + r2
                r1.compressed = r0
                return
        }

        void incrementDecompressedBytes(int r2) {
                r1 = this;
                int r0 = r1.decompressed
                int r0 = r0 + r2
                r1.decompressed = r0
                return
        }
    }

    public DelegatingDecompressorFrameListener(io.netty.handler.codec.http2.Http2Connection r2, io.netty.handler.codec.http2.Http2FrameListener r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public DelegatingDecompressorFrameListener(io.netty.handler.codec.http2.Http2Connection r1, io.netty.handler.codec.http2.Http2FrameListener r2, boolean r3) {
            r0 = this;
            r0.<init>(r2)
            r0.connection = r1
            r0.strict = r3
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r2 = r1.newKey()
            r0.propertyKey = r2
            io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$1 r2 = new io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$1
            r2.<init>(r0)
            r1.addListener(r2)
            return
    }

    static /* synthetic */ void access$000(io.netty.handler.codec.http2.DelegatingDecompressorFrameListener.Http2Decompressor r0) {
            cleanup(r0)
            return
    }

    private static void cleanup(io.netty.handler.codec.http2.DelegatingDecompressorFrameListener.Http2Decompressor r0) {
            io.netty.channel.embedded.EmbeddedChannel r0 = r0.decompressor()
            r0.finishAndReleaseAll()
            return
    }

    private void initDecompressor(io.netty.channel.ChannelHandlerContext r3, int r4, io.netty.handler.codec.http2.Http2Headers r5, boolean r6) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r2.connection
            io.netty.handler.codec.http2.Http2Stream r4 = r0.stream(r4)
            if (r4 != 0) goto L9
            goto L68
        L9:
            io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$Http2Decompressor r0 = r2.decompressor(r4)
            if (r0 != 0) goto L40
            if (r6 != 0) goto L40
            io.netty.util.AsciiString r6 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_ENCODING
            java.lang.Object r1 = r5.get(r6)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 != 0) goto L1d
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.IDENTITY
        L1d:
            io.netty.channel.embedded.EmbeddedChannel r3 = r2.newContentDecompressor(r3, r1)
            if (r3 == 0) goto L40
            io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$Http2Decompressor r0 = new io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$Http2Decompressor
            r0.<init>(r3)
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r3 = r2.propertyKey
            r4.setProperty(r3, r0)
            java.lang.CharSequence r3 = r2.getTargetContentEncoding(r1)
            io.netty.util.AsciiString r4 = io.netty.handler.codec.http.HttpHeaderValues.IDENTITY
            boolean r4 = r4.contentEqualsIgnoreCase(r3)
            if (r4 == 0) goto L3d
            r5.remove(r6)
            goto L40
        L3d:
            r5.set(r6, r3)
        L40:
            if (r0 == 0) goto L68
            io.netty.util.AsciiString r3 = io.netty.handler.codec.http.HttpHeaderNames.CONTENT_LENGTH
            r5.remove(r3)
            boolean r3 = r2.flowControllerInitialized
            if (r3 != 0) goto L68
            r3 = 1
            r2.flowControllerInitialized = r3
            io.netty.handler.codec.http2.Http2Connection r3 = r2.connection
            io.netty.handler.codec.http2.Http2Connection$Endpoint r3 = r3.local()
            io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$ConsumedBytesConverter r4 = new io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$ConsumedBytesConverter
            io.netty.handler.codec.http2.Http2Connection r5 = r2.connection
            io.netty.handler.codec.http2.Http2Connection$Endpoint r5 = r5.local()
            io.netty.handler.codec.http2.Http2FlowController r5 = r5.flowController()
            io.netty.handler.codec.http2.Http2LocalFlowController r5 = (io.netty.handler.codec.http2.Http2LocalFlowController) r5
            r4.<init>(r2, r5)
            r3.flowController(r4)
        L68:
            return
    }

    private static io.netty.buffer.ByteBuf nextReadableBuf(io.netty.channel.embedded.EmbeddedChannel r2) {
        L0:
            java.lang.Object r0 = r2.readInbound()
            io.netty.buffer.ByteBuf r0 = (io.netty.buffer.ByteBuf) r0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            boolean r1 = r0.isReadable()
            if (r1 != 0) goto L14
            r0.release()
            goto L0
        L14:
            return r0
    }

    io.netty.handler.codec.http2.DelegatingDecompressorFrameListener.Http2Decompressor decompressor(io.netty.handler.codec.http2.Http2Stream r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            io.netty.handler.codec.http2.Http2Connection$PropertyKey r0 = r1.propertyKey
            java.lang.Object r2 = r2.getProperty(r0)
            io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$Http2Decompressor r2 = (io.netty.handler.codec.http2.DelegatingDecompressorFrameListener.Http2Decompressor) r2
            return r2
    }

    protected java.lang.CharSequence getTargetContentEncoding(java.lang.CharSequence r1) throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            io.netty.util.AsciiString r1 = io.netty.handler.codec.http.HttpHeaderValues.IDENTITY
            return r1
    }

    protected io.netty.channel.embedded.EmbeddedChannel newContentDecompressor(io.netty.channel.ChannelHandlerContext r6, java.lang.CharSequence r7) throws io.netty.handler.codec.http2.Http2Exception {
            r5 = this;
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.GZIP
            boolean r0 = r0.contentEqualsIgnoreCase(r7)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L59
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.X_GZIP
            boolean r0 = r0.contentEqualsIgnoreCase(r7)
            if (r0 == 0) goto L13
            goto L59
        L13:
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.DEFLATE
            boolean r0 = r0.contentEqualsIgnoreCase(r7)
            if (r0 != 0) goto L26
            io.netty.util.AsciiString r0 = io.netty.handler.codec.http.HttpHeaderValues.X_DEFLATE
            boolean r7 = r0.contentEqualsIgnoreCase(r7)
            if (r7 == 0) goto L24
            goto L26
        L24:
            r6 = 0
            return r6
        L26:
            boolean r7 = r5.strict
            if (r7 == 0) goto L2d
            io.netty.handler.codec.compression.ZlibWrapper r7 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            goto L2f
        L2d:
            io.netty.handler.codec.compression.ZlibWrapper r7 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB_OR_NONE
        L2f:
            io.netty.channel.embedded.EmbeddedChannel r0 = new io.netty.channel.embedded.EmbeddedChannel
            io.netty.channel.Channel r3 = r6.channel()
            io.netty.channel.ChannelId r3 = r3.id()
            io.netty.channel.Channel r4 = r6.channel()
            io.netty.channel.ChannelMetadata r4 = r4.metadata()
            boolean r4 = r4.hasDisconnect()
            io.netty.channel.Channel r6 = r6.channel()
            io.netty.channel.ChannelConfig r6 = r6.config()
            io.netty.handler.codec.compression.ZlibDecoder r7 = io.netty.handler.codec.compression.ZlibCodecFactory.newZlibDecoder(r7)
            io.netty.channel.ChannelHandler[] r2 = new io.netty.channel.ChannelHandler[r2]
            r2[r1] = r7
            r0.<init>(r3, r4, r6, r2)
            return r0
        L59:
            io.netty.channel.embedded.EmbeddedChannel r7 = new io.netty.channel.embedded.EmbeddedChannel
            io.netty.channel.Channel r0 = r6.channel()
            io.netty.channel.ChannelId r0 = r0.id()
            io.netty.channel.Channel r3 = r6.channel()
            io.netty.channel.ChannelMetadata r3 = r3.metadata()
            boolean r3 = r3.hasDisconnect()
            io.netty.channel.Channel r6 = r6.channel()
            io.netty.channel.ChannelConfig r6 = r6.config()
            io.netty.handler.codec.compression.ZlibWrapper r4 = io.netty.handler.codec.compression.ZlibWrapper.GZIP
            io.netty.handler.codec.compression.ZlibDecoder r4 = io.netty.handler.codec.compression.ZlibCodecFactory.newZlibDecoder(r4)
            io.netty.channel.ChannelHandler[] r2 = new io.netty.channel.ChannelHandler[r2]
            r2[r1] = r4
            r7.<init>(r0, r3, r6, r2)
            return r7
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListenerDecorator, io.netty.handler.codec.http2.Http2FrameListener
    public int onDataRead(io.netty.channel.ChannelHandlerContext r10, int r11, io.netty.buffer.ByteBuf r12, int r13, boolean r14) throws io.netty.handler.codec.http2.Http2Exception {
            r9 = this;
            io.netty.handler.codec.http2.Http2Connection r0 = r9.connection
            io.netty.handler.codec.http2.Http2Stream r1 = r0.stream(r11)
            io.netty.handler.codec.http2.DelegatingDecompressorFrameListener$Http2Decompressor r0 = r9.decompressor(r1)
            if (r0 != 0) goto L18
            io.netty.handler.codec.http2.Http2FrameListener r2 = r9.listener
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            int r10 = r2.onDataRead(r3, r4, r5, r6, r7)
            return r10
        L18:
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r10 = r14
            io.netty.channel.embedded.EmbeddedChannel r11 = r0.decompressor()
            int r12 = r5.readableBytes()
            int r12 = r12 + r6
            r0.incrementCompressedBytes(r12)
            r13 = 1
            r14 = 0
            io.netty.buffer.ByteBuf r2 = r5.retain()     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            r5[r14] = r2     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            r11.writeInbound(r5)     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            io.netty.buffer.ByteBuf r2 = nextReadableBuf(r11)     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            if (r2 != 0) goto L51
            if (r10 == 0) goto L51
            boolean r5 = r11.finish()     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            if (r5 == 0) goto L51
            io.netty.buffer.ByteBuf r2 = nextReadableBuf(r11)     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            goto L51
        L49:
            r0 = move-exception
            r10 = r0
            goto Lb5
        L4d:
            r0 = move-exception
            r10 = r0
            goto Lce
        L51:
            if (r2 != 0) goto L61
            if (r10 == 0) goto L5d
            io.netty.handler.codec.http2.Http2FrameListener r2 = r9.listener     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            io.netty.buffer.ByteBuf r5 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            r7 = 1
            r2.onDataRead(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
        L5d:
            r0.incrementDecompressedBytes(r12)     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            return r12
        L61:
            io.netty.handler.codec.http2.Http2Connection r12 = r9.connection     // Catch: java.lang.Throwable -> Laf
            io.netty.handler.codec.http2.Http2Connection$Endpoint r12 = r12.local()     // Catch: java.lang.Throwable -> Laf
            io.netty.handler.codec.http2.Http2FlowController r12 = r12.flowController()     // Catch: java.lang.Throwable -> Laf
            io.netty.handler.codec.http2.Http2LocalFlowController r12 = (io.netty.handler.codec.http2.Http2LocalFlowController) r12     // Catch: java.lang.Throwable -> Laf
            r0.incrementDecompressedBytes(r6)     // Catch: java.lang.Throwable -> Laf
            r5 = r2
        L71:
            io.netty.buffer.ByteBuf r2 = nextReadableBuf(r11)     // Catch: java.lang.Throwable -> L8f
            if (r2 != 0) goto L7b
            if (r10 == 0) goto L7b
            r7 = 1
            goto L7c
        L7b:
            r7 = 0
        L7c:
            if (r7 == 0) goto L8d
            boolean r8 = r11.finish()     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8d
            io.netty.buffer.ByteBuf r2 = nextReadableBuf(r11)     // Catch: java.lang.Throwable -> L8f
            if (r2 != 0) goto L8c
            r7 = 1
            goto L8d
        L8c:
            r7 = 0
        L8d:
            r8 = r2
            goto L93
        L8f:
            r0 = move-exception
            r10 = r0
            r2 = r5
            goto Lb1
        L93:
            int r2 = r5.readableBytes()     // Catch: java.lang.Throwable -> L8f
            r0.incrementDecompressedBytes(r2)     // Catch: java.lang.Throwable -> L8f
            io.netty.handler.codec.http2.Http2FrameListener r2 = r9.listener     // Catch: java.lang.Throwable -> L8f
            int r2 = r2.onDataRead(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8f
            r12.consumeBytes(r1, r2)     // Catch: java.lang.Throwable -> L8f
            if (r8 != 0) goto La9
            r5.release()     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            return r14
        La9:
            r5.release()     // Catch: java.lang.Throwable -> L8f
            r5 = r8
            r6 = 0
            goto L71
        Laf:
            r0 = move-exception
            r10 = r0
        Lb1:
            r2.release()     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
            throw r10     // Catch: java.lang.Throwable -> L49 io.netty.handler.codec.http2.Http2Exception -> L4d
        Lb5:
            int r11 = r1.id()
            io.netty.handler.codec.http2.Http2Error r12 = io.netty.handler.codec.http2.Http2Error.INTERNAL_ERROR
            int r0 = r1.id()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r14] = r0
            java.lang.String r14 = "Decompressor error detected while delegating data read on streamId %d"
            io.netty.handler.codec.http2.Http2Exception r10 = io.netty.handler.codec.http2.Http2Exception.streamError(r11, r12, r10, r14, r13)
            throw r10
        Lce:
            throw r10
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListenerDecorator, io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(io.netty.channel.ChannelHandlerContext r10, int r11, io.netty.handler.codec.http2.Http2Headers r12, int r13, short r14, boolean r15, int r16, boolean r17) throws io.netty.handler.codec.http2.Http2Exception {
            r9 = this;
            r8 = r17
            r9.initDecompressor(r10, r11, r12, r8)
            io.netty.handler.codec.http2.Http2FrameListener r0 = r9.listener
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.onHeadersRead(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameListenerDecorator, io.netty.handler.codec.http2.Http2FrameListener
    public void onHeadersRead(io.netty.channel.ChannelHandlerContext r7, int r8, io.netty.handler.codec.http2.Http2Headers r9, int r10, boolean r11) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            r6.initDecompressor(r7, r8, r9, r11)
            io.netty.handler.codec.http2.Http2FrameListener r0 = r6.listener
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onHeadersRead(r1, r2, r3, r4, r5)
            return
    }
}
