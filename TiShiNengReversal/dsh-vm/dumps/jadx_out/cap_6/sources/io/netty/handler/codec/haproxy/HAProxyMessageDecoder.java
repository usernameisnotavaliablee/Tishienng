package io.netty.handler.codec.haproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HAProxyMessageDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private static final byte[] BINARY_PREFIX = null;
    private static final int BINARY_PREFIX_LENGTH = 0;
    private static final io.netty.handler.codec.ProtocolDetectionResult<io.netty.handler.codec.haproxy.HAProxyProtocolVersion> DETECTION_RESULT_V1 = null;
    private static final io.netty.handler.codec.ProtocolDetectionResult<io.netty.handler.codec.haproxy.HAProxyProtocolVersion> DETECTION_RESULT_V2 = null;
    private static final byte[] TEXT_PREFIX = null;
    private static final int V1_MAX_LENGTH = 108;
    private static final int V2_MAX_LENGTH = 65551;
    private static final int V2_MAX_TLV = 65319;
    private static final int V2_MIN_LENGTH = 232;
    private int discardedBytes;
    private boolean discarding;
    private final boolean failFast;
    private boolean finished;
    private io.netty.handler.codec.haproxy.HAProxyMessageDecoder.HeaderExtractor headerExtractor;
    private final int v2MaxHeaderSize;
    private int version;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class HeaderExtractor {
        private final int maxHeaderSize;
        final /* synthetic */ io.netty.handler.codec.haproxy.HAProxyMessageDecoder this$0;

        protected HeaderExtractor(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.maxHeaderSize = r2
                return
        }

        protected abstract int delimiterLength(io.netty.buffer.ByteBuf r1, int r2);

        public io.netty.buffer.ByteBuf extract(io.netty.channel.ChannelHandlerContext r6, io.netty.buffer.ByteBuf r7) throws java.lang.Exception {
                r5 = this;
                int r0 = r5.findEndOfHeader(r7)
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r1 = r5.this$0
                boolean r1 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$000(r1)
                java.lang.String r2 = "over "
                r3 = 0
                if (r1 != 0) goto L6e
                if (r0 < 0) goto L35
                int r1 = r7.readerIndex()
                int r1 = r0 - r1
                int r2 = r5.maxHeaderSize
                if (r1 <= r2) goto L29
                int r2 = r5.delimiterLength(r7, r0)
                int r0 = r0 + r2
                r7.readerIndex(r0)
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r7 = r5.this$0
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$100(r7, r6, r1)
                return r3
            L29:
                io.netty.buffer.ByteBuf r6 = r7.readSlice(r1)
                int r0 = r5.delimiterLength(r7, r0)
                r7.skipBytes(r0)
                return r6
            L35:
                int r0 = r7.readableBytes()
                int r1 = r5.maxHeaderSize
                if (r0 <= r1) goto L6d
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r1 = r5.this$0
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$202(r1, r0)
                r7.skipBytes(r0)
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r7 = r5.this$0
                r0 = 1
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$002(r7, r0)
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r7 = r5.this$0
                boolean r7 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$300(r7)
                if (r7 == 0) goto L6d
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r7 = r5.this$0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r1 = r5.this$0
                int r1 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$200(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$400(r7, r6, r0)
            L6d:
                return r3
            L6e:
                if (r0 < 0) goto Lac
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r1 = r5.this$0
                int r1 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$200(r1)
                int r1 = r1 + r0
                int r4 = r7.readerIndex()
                int r1 = r1 - r4
                int r4 = r5.delimiterLength(r7, r0)
                int r0 = r0 + r4
                r7.readerIndex(r0)
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r7 = r5.this$0
                r0 = 0
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$202(r7, r0)
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r7 = r5.this$0
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$002(r7, r0)
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r7 = r5.this$0
                boolean r7 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$300(r7)
                if (r7 != 0) goto Lc1
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r7 = r5.this$0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$400(r7, r6, r0)
                goto Lc1
            Lac:
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder r6 = r5.this$0
                int r0 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$200(r6)
                int r1 = r7.readableBytes()
                int r0 = r0 + r1
                io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$202(r6, r0)
                int r6 = r7.readableBytes()
                r7.skipBytes(r6)
            Lc1:
                return r3
        }

        protected abstract int findEndOfHeader(io.netty.buffer.ByteBuf r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class LineHeaderExtractor extends io.netty.handler.codec.haproxy.HAProxyMessageDecoder.HeaderExtractor {
        final /* synthetic */ io.netty.handler.codec.haproxy.HAProxyMessageDecoder this$0;

        LineHeaderExtractor(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // io.netty.handler.codec.haproxy.HAProxyMessageDecoder.HeaderExtractor
        protected int delimiterLength(io.netty.buffer.ByteBuf r1, int r2) {
                r0 = this;
                byte r1 = r1.getByte(r2)
                r2 = 13
                if (r1 != r2) goto La
                r1 = 2
                return r1
            La:
                r1 = 1
                return r1
        }

        @Override // io.netty.handler.codec.haproxy.HAProxyMessageDecoder.HeaderExtractor
        protected int findEndOfHeader(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                int r1 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$500(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class StructHeaderExtractor extends io.netty.handler.codec.haproxy.HAProxyMessageDecoder.HeaderExtractor {
        final /* synthetic */ io.netty.handler.codec.haproxy.HAProxyMessageDecoder this$0;

        StructHeaderExtractor(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // io.netty.handler.codec.haproxy.HAProxyMessageDecoder.HeaderExtractor
        protected int delimiterLength(io.netty.buffer.ByteBuf r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // io.netty.handler.codec.haproxy.HAProxyMessageDecoder.HeaderExtractor
        protected int findEndOfHeader(io.netty.buffer.ByteBuf r1) {
                r0 = this;
                int r1 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.access$600(r1)
                return r1
        }
    }

    static {
            r0 = 12
            byte[] r0 = new byte[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [13, 10, 13, 10, 0, 13, 10, 81, 85, 73, 84, 10} // fill-array
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder.BINARY_PREFIX = r0
            r1 = 5
            byte[] r1 = new byte[r1]
            r1 = {x0030: FILL_ARRAY_DATA , data: [80, 82, 79, 88, 89} // fill-array
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder.TEXT_PREFIX = r1
            int r0 = r0.length
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder.BINARY_PREFIX_LENGTH = r0
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r0 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.V1
            io.netty.handler.codec.ProtocolDetectionResult r0 = io.netty.handler.codec.ProtocolDetectionResult.detected(r0)
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder.DETECTION_RESULT_V1 = r0
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r0 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.V2
            io.netty.handler.codec.ProtocolDetectionResult r0 = io.netty.handler.codec.ProtocolDetectionResult.detected(r0)
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder.DETECTION_RESULT_V2 = r0
            return
    }

    public HAProxyMessageDecoder() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public HAProxyMessageDecoder(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public HAProxyMessageDecoder(int r4, boolean r5) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.version = r0
            r0 = 1
            r1 = 232(0xe8, float:3.25E-43)
            if (r4 >= r0) goto Le
            r3.v2MaxHeaderSize = r1
            goto L21
        Le:
            r0 = 65319(0xff27, float:9.1531E-41)
            r2 = 65551(0x1000f, float:9.1857E-41)
            if (r4 <= r0) goto L19
            r3.v2MaxHeaderSize = r2
            goto L21
        L19:
            int r4 = r4 + r1
            if (r4 <= r2) goto L1f
            r3.v2MaxHeaderSize = r2
            goto L21
        L1f:
            r3.v2MaxHeaderSize = r4
        L21:
            r3.failFast = r5
            return
    }

    public HAProxyMessageDecoder(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.version = r0
            r0 = 65551(0x1000f, float:9.1857E-41)
            r1.v2MaxHeaderSize = r0
            r1.failFast = r2
            return
    }

    static /* synthetic */ boolean access$000(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r0) {
            boolean r0 = r0.discarding
            return r0
    }

    static /* synthetic */ boolean access$002(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r0, boolean r1) {
            r0.discarding = r1
            return r1
    }

    static /* synthetic */ void access$100(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r0, io.netty.channel.ChannelHandlerContext r1, int r2) {
            r0.failOverLimit(r1, r2)
            return
    }

    static /* synthetic */ int access$200(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r0) {
            int r0 = r0.discardedBytes
            return r0
    }

    static /* synthetic */ int access$202(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r0, int r1) {
            r0.discardedBytes = r1
            return r1
    }

    static /* synthetic */ boolean access$300(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r0) {
            boolean r0 = r0.failFast
            return r0
    }

    static /* synthetic */ void access$400(io.netty.handler.codec.haproxy.HAProxyMessageDecoder r0, io.netty.channel.ChannelHandlerContext r1, java.lang.String r2) {
            r0.failOverLimit(r1, r2)
            return
    }

    static /* synthetic */ int access$500(io.netty.buffer.ByteBuf r0) {
            int r0 = findEndOfLine(r0)
            return r0
    }

    static /* synthetic */ int access$600(io.netty.buffer.ByteBuf r0) {
            int r0 = findEndOfHeader(r0)
            return r0
    }

    private io.netty.buffer.ByteBuf decodeLine(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder$HeaderExtractor r0 = r2.headerExtractor
            if (r0 != 0) goto Ld
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder$LineHeaderExtractor r0 = new io.netty.handler.codec.haproxy.HAProxyMessageDecoder$LineHeaderExtractor
            r1 = 108(0x6c, float:1.51E-43)
            r0.<init>(r2, r1)
            r2.headerExtractor = r0
        Ld:
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder$HeaderExtractor r0 = r2.headerExtractor
            io.netty.buffer.ByteBuf r3 = r0.extract(r3, r4)
            return r3
    }

    private io.netty.buffer.ByteBuf decodeStruct(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder$HeaderExtractor r0 = r2.headerExtractor
            if (r0 != 0) goto Ld
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder$StructHeaderExtractor r0 = new io.netty.handler.codec.haproxy.HAProxyMessageDecoder$StructHeaderExtractor
            int r1 = r2.v2MaxHeaderSize
            r0.<init>(r2, r1)
            r2.headerExtractor = r0
        Ld:
            io.netty.handler.codec.haproxy.HAProxyMessageDecoder$HeaderExtractor r0 = r2.headerExtractor
            io.netty.buffer.ByteBuf r3 = r0.extract(r3, r4)
            return r3
    }

    public static io.netty.handler.codec.ProtocolDetectionResult<io.netty.handler.codec.haproxy.HAProxyProtocolVersion> detectProtocol(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.readableBytes()
            r1 = 12
            if (r0 >= r1) goto Ld
            io.netty.handler.codec.ProtocolDetectionResult r2 = io.netty.handler.codec.ProtocolDetectionResult.needsMoreData()
            return r2
        Ld:
            int r0 = r2.readerIndex()
            byte[] r1 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.BINARY_PREFIX
            boolean r1 = match(r1, r2, r0)
            if (r1 == 0) goto L1c
            io.netty.handler.codec.ProtocolDetectionResult<io.netty.handler.codec.haproxy.HAProxyProtocolVersion> r2 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.DETECTION_RESULT_V2
            return r2
        L1c:
            byte[] r1 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.TEXT_PREFIX
            boolean r2 = match(r1, r2, r0)
            if (r2 == 0) goto L27
            io.netty.handler.codec.ProtocolDetectionResult<io.netty.handler.codec.haproxy.HAProxyProtocolVersion> r2 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.DETECTION_RESULT_V1
            return r2
        L27:
            io.netty.handler.codec.ProtocolDetectionResult r2 = io.netty.handler.codec.ProtocolDetectionResult.invalid()
            return r2
    }

    private void fail(io.netty.channel.ChannelHandlerContext r2, java.lang.String r3, java.lang.Exception r4) {
            r1 = this;
            r0 = 1
            r1.finished = r0
            r2.close()
            if (r3 == 0) goto L11
            if (r4 != 0) goto Lb
            goto L11
        Lb:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r2 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            r2.<init>(r3, r4)
            goto L26
        L11:
            if (r3 != 0) goto L21
            if (r4 == 0) goto L1b
            io.netty.handler.codec.haproxy.HAProxyProtocolException r2 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            r2.<init>(r4)
            goto L26
        L1b:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r2 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            r2.<init>()
            goto L26
        L21:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r2 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            r2.<init>(r3)
        L26:
            throw r2
    }

    private void failOverLimit(io.netty.channel.ChannelHandlerContext r1, int r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.failOverLimit(r1, r2)
            return
    }

    private void failOverLimit(io.netty.channel.ChannelHandlerContext r4, java.lang.String r5) {
            r3 = this;
            int r0 = r3.version
            r1 = 1
            if (r0 != r1) goto L8
            r0 = 108(0x6c, float:1.51E-43)
            goto La
        L8:
            int r0 = r3.v2MaxHeaderSize
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "header length ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") exceeds the allowed maximum ("
            r1.append(r5)
            r1.append(r0)
            r5 = 41
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0 = 0
            r3.fail(r4, r5, r0)
            return
    }

    private static int findEndOfHeader(io.netty.buffer.ByteBuf r4) {
            int r0 = r4.readableBytes()
            r1 = -1
            r2 = 16
            if (r0 >= r2) goto La
            return r1
        La:
            int r3 = r4.readerIndex()
            int r3 = r3 + 14
            int r4 = r4.getUnsignedShort(r3)
            int r4 = r4 + r2
            if (r0 < r4) goto L18
            return r4
        L18:
            return r1
    }

    private static int findEndOfLine(io.netty.buffer.ByteBuf r4) {
            int r0 = r4.writerIndex()
            int r1 = r4.readerIndex()
        L8:
            if (r1 >= r0) goto L24
            byte r2 = r4.getByte(r1)
            r3 = 13
            if (r2 != r3) goto L21
            int r2 = r0 + (-1)
            if (r1 >= r2) goto L21
            int r2 = r1 + 1
            byte r2 = r4.getByte(r2)
            r3 = 10
            if (r2 != r3) goto L21
            return r1
        L21:
            int r1 = r1 + 1
            goto L8
        L24:
            r4 = -1
            return r4
    }

    private static int findVersion(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.readableBytes()
            r1 = 13
            if (r0 >= r1) goto La
            r2 = -1
            return r2
        La:
            int r0 = r2.readerIndex()
            byte[] r1 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.BINARY_PREFIX
            boolean r1 = match(r1, r2, r0)
            if (r1 == 0) goto L1e
            int r1 = io.netty.handler.codec.haproxy.HAProxyMessageDecoder.BINARY_PREFIX_LENGTH
            int r0 = r0 + r1
            byte r2 = r2.getByte(r0)
            return r2
        L1e:
            r2 = 1
            return r2
    }

    private static boolean match(byte[] r4, io.netty.buffer.ByteBuf r5, int r6) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length
            if (r1 >= r2) goto L13
            int r2 = r6 + r1
            byte r2 = r5.getByte(r2)
            r3 = r4[r1]
            if (r2 == r3) goto L10
            return r0
        L10:
            int r1 = r1 + 1
            goto L2
        L13:
            r4 = 1
            return r4
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder, io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelRead(io.netty.channel.ChannelHandlerContext r1, java.lang.Object r2) throws java.lang.Exception {
            r0 = this;
            super.channelRead(r1, r2)
            boolean r2 = r0.finished
            if (r2 == 0) goto Le
            io.netty.channel.ChannelPipeline r1 = r1.pipeline()
            r1.remove(r0)
        Le:
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected final void decode(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            int r0 = r2.version
            r1 = -1
            if (r0 != r1) goto Le
            int r0 = findVersion(r4)
            r2.version = r0
            if (r0 != r1) goto Le
            goto L40
        Le:
            int r0 = r2.version
            r1 = 1
            if (r0 != r1) goto L18
            io.netty.buffer.ByteBuf r4 = r2.decodeLine(r3, r4)
            goto L1c
        L18:
            io.netty.buffer.ByteBuf r4 = r2.decodeStruct(r3, r4)
        L1c:
            if (r4 == 0) goto L40
            r2.finished = r1
            int r0 = r2.version     // Catch: io.netty.handler.codec.haproxy.HAProxyProtocolException -> L32
            if (r0 != r1) goto L34
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII     // Catch: io.netty.handler.codec.haproxy.HAProxyProtocolException -> L32
            java.lang.String r4 = r4.toString(r0)     // Catch: io.netty.handler.codec.haproxy.HAProxyProtocolException -> L32
            io.netty.handler.codec.haproxy.HAProxyMessage r4 = io.netty.handler.codec.haproxy.HAProxyMessage.decodeHeader(r4)     // Catch: io.netty.handler.codec.haproxy.HAProxyProtocolException -> L32
            r5.add(r4)     // Catch: io.netty.handler.codec.haproxy.HAProxyProtocolException -> L32
            return
        L32:
            r4 = move-exception
            goto L3c
        L34:
            io.netty.handler.codec.haproxy.HAProxyMessage r4 = io.netty.handler.codec.haproxy.HAProxyMessage.decodeHeader(r4)     // Catch: io.netty.handler.codec.haproxy.HAProxyProtocolException -> L32
            r5.add(r4)     // Catch: io.netty.handler.codec.haproxy.HAProxyProtocolException -> L32
            return
        L3c:
            r5 = 0
            r2.fail(r3, r5, r4)
        L40:
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    public boolean isSingleDecode() {
            r1 = this;
            r0 = 1
            return r0
    }
}
