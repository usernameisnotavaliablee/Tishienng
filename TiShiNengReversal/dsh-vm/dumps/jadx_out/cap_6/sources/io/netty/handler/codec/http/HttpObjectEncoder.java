package io.netty.handler.codec.http;

import io.netty.handler.codec.http.HttpMessage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class HttpObjectEncoder<H extends io.netty.handler.codec.http.HttpMessage> extends io.netty.handler.codec.MessageToMessageEncoder<java.lang.Object> {
    private static final io.netty.buffer.ByteBuf CRLF_BUF = null;
    static final int CRLF_SHORT = 3338;
    private static final float HEADERS_WEIGHT_HISTORICAL = 0.8f;
    private static final float HEADERS_WEIGHT_NEW = 0.2f;
    private static final int ST_CONTENT_ALWAYS_EMPTY = 3;
    private static final int ST_CONTENT_CHUNK = 2;
    private static final int ST_CONTENT_NON_CHUNK = 1;
    private static final int ST_INIT = 0;
    private static final float TRAILERS_WEIGHT_HISTORICAL = 0.8f;
    private static final float TRAILERS_WEIGHT_NEW = 0.2f;
    private static final byte[] ZERO_CRLF_CRLF = null;
    private static final io.netty.buffer.ByteBuf ZERO_CRLF_CRLF_BUF = null;
    private static final int ZERO_CRLF_MEDIUM = 3149066;
    private float headersEncodedSizeAccumulator;
    private int state;
    private float trailersEncodedSizeAccumulator;

    static {
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [48, 13, 10, 13, 10} // fill-array
            io.netty.handler.codec.http.HttpObjectEncoder.ZERO_CRLF_CRLF = r0
            r1 = 2
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.directBuffer(r1)
            r2 = 13
            io.netty.buffer.ByteBuf r1 = r1.writeByte(r2)
            r2 = 10
            io.netty.buffer.ByteBuf r1 = r1.writeByte(r2)
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.unreleasableBuffer(r1)
            io.netty.handler.codec.http.HttpObjectEncoder.CRLF_BUF = r1
            int r1 = r0.length
            io.netty.buffer.ByteBuf r1 = io.netty.buffer.Unpooled.directBuffer(r1)
            io.netty.buffer.ByteBuf r0 = r1.writeBytes(r0)
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.unreleasableBuffer(r0)
            io.netty.handler.codec.http.HttpObjectEncoder.ZERO_CRLF_CRLF_BUF = r0
            return
    }

    public HttpObjectEncoder() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.state = r0
            r0 = 1132462080(0x43800000, float:256.0)
            r1.headersEncodedSizeAccumulator = r0
            r1.trailersEncodedSizeAccumulator = r0
            return
    }

    private static long contentLength(java.lang.Object r3) {
            boolean r0 = r3 instanceof io.netty.handler.codec.http.HttpContent
            if (r0 == 0) goto L10
            io.netty.handler.codec.http.HttpContent r3 = (io.netty.handler.codec.http.HttpContent) r3
            io.netty.buffer.ByteBuf r3 = r3.content()
            int r3 = r3.readableBytes()
            long r0 = (long) r3
            return r0
        L10:
            boolean r0 = r3 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto L1c
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3
            int r3 = r3.readableBytes()
            long r0 = (long) r3
            return r0
        L1c:
            boolean r0 = r3 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto L27
            io.netty.channel.FileRegion r3 = (io.netty.channel.FileRegion) r3
            long r0 = r3.count()
            return r0
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected message type: "
            r1.append(r2)
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static java.lang.Object encodeAndRetain(java.lang.Object r3) {
            boolean r0 = r3 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto Lb
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3
            io.netty.buffer.ByteBuf r3 = r3.retain()
            return r3
        Lb:
            boolean r0 = r3 instanceof io.netty.handler.codec.http.HttpContent
            if (r0 == 0) goto L1a
            io.netty.handler.codec.http.HttpContent r3 = (io.netty.handler.codec.http.HttpContent) r3
            io.netty.buffer.ByteBuf r3 = r3.content()
            io.netty.buffer.ByteBuf r3 = r3.retain()
            return r3
        L1a:
            boolean r0 = r3 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto L25
            io.netty.channel.FileRegion r3 = (io.netty.channel.FileRegion) r3
            io.netty.channel.FileRegion r3 = r3.retain()
            return r3
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected message type: "
            r1.append(r2)
            java.lang.String r3 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @java.lang.Deprecated
    protected static void encodeAscii(java.lang.String r1, io.netty.buffer.ByteBuf r2) {
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            r2.writeCharSequence(r1, r0)
            return
    }

    private void encodeChunkedContent(io.netty.channel.ChannelHandlerContext r5, java.lang.Object r6, long r7, java.util.List<java.lang.Object> r9) {
            r4 = this;
            r0 = 0
            r2 = 3338(0xd0a, float:4.678E-42)
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 <= 0) goto L35
            java.lang.String r7 = java.lang.Long.toHexString(r7)
            io.netty.buffer.ByteBufAllocator r8 = r5.alloc()
            int r0 = r7.length()
            int r0 = r0 + 2
            io.netty.buffer.ByteBuf r8 = r8.buffer(r0)
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            r8.writeCharSequence(r7, r0)
            io.netty.buffer.ByteBufUtil.writeShortBE(r8, r2)
            r9.add(r8)
            java.lang.Object r7 = encodeAndRetain(r6)
            r9.add(r7)
            io.netty.buffer.ByteBuf r7 = io.netty.handler.codec.http.HttpObjectEncoder.CRLF_BUF
            io.netty.buffer.ByteBuf r7 = r7.duplicate()
            r9.add(r7)
        L35:
            boolean r7 = r6 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r7 == 0) goto L82
            io.netty.handler.codec.http.LastHttpContent r6 = (io.netty.handler.codec.http.LastHttpContent) r6
            io.netty.handler.codec.http.HttpHeaders r6 = r6.trailingHeaders()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L4f
            io.netty.buffer.ByteBuf r5 = io.netty.handler.codec.http.HttpObjectEncoder.ZERO_CRLF_CRLF_BUF
            io.netty.buffer.ByteBuf r5 = r5.duplicate()
            r9.add(r5)
            return
        L4f:
            io.netty.buffer.ByteBufAllocator r5 = r5.alloc()
            float r7 = r4.trailersEncodedSizeAccumulator
            int r7 = (int) r7
            io.netty.buffer.ByteBuf r5 = r5.buffer(r7)
            r7 = 3149066(0x300d0a, float:4.412781E-39)
            io.netty.buffer.ByteBufUtil.writeMediumBE(r5, r7)
            r4.encodeHeaders(r6, r5)
            io.netty.buffer.ByteBufUtil.writeShortBE(r5, r2)
            int r6 = r5.readableBytes()
            int r6 = padSizeForAccumulation(r6)
            float r6 = (float) r6
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            float r6 = r6 * r7
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            float r8 = r4.trailersEncodedSizeAccumulator
            float r8 = r8 * r7
            float r6 = r6 + r8
            r4.trailersEncodedSizeAccumulator = r6
            r9.add(r5)
            return
        L82:
            if (r3 != 0) goto L8b
            java.lang.Object r5 = encodeAndRetain(r6)
            r9.add(r5)
        L8b:
            return
    }

    private static int padSizeForAccumulation(int r0) {
            int r0 = r0 << 2
            int r0 = r0 / 3
            return r0
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.http.HttpObject
            if (r0 != 0) goto Lf
            boolean r0 = r2 instanceof io.netty.buffer.ByteBuf
            if (r0 != 0) goto Lf
            boolean r2 = r2 instanceof io.netty.channel.FileRegion
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected void encode(io.netty.channel.ChannelHandlerContext r11, java.lang.Object r12, java.util.List<java.lang.Object> r13) throws java.lang.Exception {
            r10 = this;
            boolean r0 = r12 instanceof io.netty.handler.codec.http.HttpMessage
            r1 = 2
            java.lang.String r2 = "unexpected message type: "
            r3 = 0
            r4 = 1
            r5 = 3
            if (r0 == 0) goto L82
            int r0 = r10.state
            if (r0 != 0) goto L5f
            r0 = r12
            io.netty.handler.codec.http.HttpMessage r0 = (io.netty.handler.codec.http.HttpMessage) r0
            io.netty.buffer.ByteBufAllocator r6 = r11.alloc()
            float r7 = r10.headersEncodedSizeAccumulator
            int r7 = (int) r7
            io.netty.buffer.ByteBuf r6 = r6.buffer(r7)
            r10.encodeInitialLine(r6, r0)
            boolean r7 = r10.isContentAlwaysEmpty(r0)
            if (r7 == 0) goto L27
            r7 = 3
            goto L30
        L27:
            boolean r7 = io.netty.handler.codec.http.HttpUtil.isTransferEncodingChunked(r0)
            if (r7 == 0) goto L2f
            r7 = 2
            goto L30
        L2f:
            r7 = 1
        L30:
            r10.state = r7
            if (r7 != r5) goto L36
            r7 = 1
            goto L37
        L36:
            r7 = 0
        L37:
            r10.sanitizeHeadersBeforeEncode(r0, r7)
            io.netty.handler.codec.http.HttpHeaders r0 = r0.headers()
            r10.encodeHeaders(r0, r6)
            r0 = 3338(0xd0a, float:4.678E-42)
            io.netty.buffer.ByteBufUtil.writeShortBE(r6, r0)
            int r0 = r6.readableBytes()
            int r0 = padSizeForAccumulation(r0)
            float r0 = (float) r0
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r7
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            float r8 = r10.headersEncodedSizeAccumulator
            float r8 = r8 * r7
            float r0 = r0 + r8
            r10.headersEncodedSizeAccumulator = r0
            goto L83
        L5f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            java.lang.String r12 = io.netty.util.internal.StringUtil.simpleClassName(r12)
            r13.append(r12)
            java.lang.String r12 = ", state: "
            r13.append(r12)
            int r12 = r10.state
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        L82:
            r6 = 0
        L83:
            boolean r0 = r12 instanceof io.netty.buffer.ByteBuf
            if (r0 == 0) goto L98
            r7 = r12
            io.netty.buffer.ByteBuf r7 = (io.netty.buffer.ByteBuf) r7
            boolean r8 = r7.isReadable()
            if (r8 != 0) goto L98
            io.netty.buffer.ByteBuf r11 = r7.retain()
            r13.add(r11)
            return
        L98:
            boolean r7 = r12 instanceof io.netty.handler.codec.http.HttpContent
            if (r7 != 0) goto Lac
            if (r0 != 0) goto Lac
            boolean r0 = r12 instanceof io.netty.channel.FileRegion
            if (r0 == 0) goto La3
            goto Lac
        La3:
            if (r6 == 0) goto La9
            r13.add(r6)
            return
        La9:
            r4 = r10
            goto L11e
        Lac:
            int r0 = r10.state
            if (r0 == 0) goto L11f
            if (r0 == r4) goto Ld2
            if (r0 == r1) goto Lc0
            if (r0 != r5) goto Lba
            r4 = r10
            r11 = r12
            r9 = r13
            goto L10d
        Lba:
            java.lang.Error r11 = new java.lang.Error
            r11.<init>()
            throw r11
        Lc0:
            if (r6 == 0) goto Lc5
            r13.add(r6)
        Lc5:
            long r7 = contentLength(r12)
            r4 = r10
            r5 = r11
            r6 = r12
            r9 = r13
            r4.encodeChunkedContent(r5, r6, r7, r9)
            r11 = r6
            goto L118
        Ld2:
            r4 = r10
            r11 = r12
            r9 = r13
            long r12 = contentLength(r11)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10d
            if (r6 == 0) goto Lfa
            int r0 = r6.writableBytes()
            long r0 = (long) r0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto Lfa
            if (r7 == 0) goto Lfa
            r12 = r11
            io.netty.handler.codec.http.HttpContent r12 = (io.netty.handler.codec.http.HttpContent) r12
            io.netty.buffer.ByteBuf r12 = r12.content()
            r6.writeBytes(r12)
            r9.add(r6)
            goto L106
        Lfa:
            if (r6 == 0) goto Lff
            r9.add(r6)
        Lff:
            java.lang.Object r12 = encodeAndRetain(r11)
            r9.add(r12)
        L106:
            boolean r12 = r11 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r12 == 0) goto L118
            r4.state = r3
            goto L118
        L10d:
            if (r6 == 0) goto L113
            r9.add(r6)
            goto L118
        L113:
            io.netty.buffer.ByteBuf r12 = io.netty.buffer.Unpooled.EMPTY_BUFFER
            r9.add(r12)
        L118:
            boolean r11 = r11 instanceof io.netty.handler.codec.http.LastHttpContent
            if (r11 == 0) goto L11e
            r4.state = r3
        L11e:
            return
        L11f:
            r4 = r10
            r11 = r12
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            java.lang.String r11 = io.netty.util.internal.StringUtil.simpleClassName(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
    }

    protected void encodeHeaders(io.netty.handler.codec.http.HttpHeaders r3, io.netty.buffer.ByteBuf r4) {
            r2 = this;
            java.util.Iterator r3 = r3.iteratorCharSequence()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            io.netty.handler.codec.http.HttpHeadersEncoder.encoderHeader(r1, r0, r4)
            goto L4
        L20:
            return
    }

    protected abstract void encodeInitialLine(io.netty.buffer.ByteBuf r1, H r2) throws java.lang.Exception;

    protected boolean isContentAlwaysEmpty(H r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected void sanitizeHeadersBeforeEncode(H r1, boolean r2) {
            r0 = this;
            return
    }
}
