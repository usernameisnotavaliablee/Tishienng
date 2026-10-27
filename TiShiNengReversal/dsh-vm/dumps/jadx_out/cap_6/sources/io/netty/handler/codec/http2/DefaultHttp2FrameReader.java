package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHttp2FrameReader implements io.netty.handler.codec.http2.Http2FrameReader, io.netty.handler.codec.http2.Http2FrameSizePolicy, io.netty.handler.codec.http2.Http2FrameReader.Configuration {
    private io.netty.handler.codec.http2.Http2Flags flags;
    private byte frameType;
    private io.netty.handler.codec.http2.DefaultHttp2FrameReader.HeadersContinuation headersContinuation;
    private final io.netty.handler.codec.http2.Http2HeadersDecoder headersDecoder;
    private int maxFrameSize;
    private int payloadLength;
    private boolean readError;
    private boolean readingHeaders;
    private int streamId;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected class HeadersBlockBuilder {
        private io.netty.buffer.ByteBuf headerBlock;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2FrameReader this$0;

        protected HeadersBlockBuilder(io.netty.handler.codec.http2.DefaultHttp2FrameReader r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private void headerSizeExceeded() throws io.netty.handler.codec.http2.Http2Exception {
                r2 = this;
                r2.close()
                io.netty.handler.codec.http2.DefaultHttp2FrameReader r0 = r2.this$0
                io.netty.handler.codec.http2.Http2HeadersDecoder r0 = io.netty.handler.codec.http2.DefaultHttp2FrameReader.access$100(r0)
                io.netty.handler.codec.http2.Http2HeadersDecoder$Configuration r0 = r0.configuration()
                long r0 = r0.maxHeaderListSizeGoAway()
                io.netty.handler.codec.http2.Http2CodecUtil.headerListSizeExceeded(r0)
                return
        }

        final void addFragment(io.netty.buffer.ByteBuf r6, int r7, io.netty.buffer.ByteBufAllocator r8, boolean r9) throws io.netty.handler.codec.http2.Http2Exception {
                r5 = this;
                io.netty.buffer.ByteBuf r0 = r5.headerBlock
                if (r0 != 0) goto L2e
                long r0 = (long) r7
                io.netty.handler.codec.http2.DefaultHttp2FrameReader r2 = r5.this$0
                io.netty.handler.codec.http2.Http2HeadersDecoder r2 = io.netty.handler.codec.http2.DefaultHttp2FrameReader.access$100(r2)
                io.netty.handler.codec.http2.Http2HeadersDecoder$Configuration r2 = r2.configuration()
                long r2 = r2.maxHeaderListSizeGoAway()
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L1a
                r5.headerSizeExceeded()
            L1a:
                if (r9 == 0) goto L23
                io.netty.buffer.ByteBuf r6 = r6.readRetainedSlice(r7)
                r5.headerBlock = r6
                return
            L23:
                io.netty.buffer.ByteBuf r8 = r8.buffer(r7)
                io.netty.buffer.ByteBuf r6 = r8.writeBytes(r6, r7)
                r5.headerBlock = r6
                return
            L2e:
                io.netty.handler.codec.http2.DefaultHttp2FrameReader r9 = r5.this$0
                io.netty.handler.codec.http2.Http2HeadersDecoder r9 = io.netty.handler.codec.http2.DefaultHttp2FrameReader.access$100(r9)
                io.netty.handler.codec.http2.Http2HeadersDecoder$Configuration r9 = r9.configuration()
                long r0 = r9.maxHeaderListSizeGoAway()
                long r2 = (long) r7
                long r0 = r0 - r2
                io.netty.buffer.ByteBuf r9 = r5.headerBlock
                int r9 = r9.readableBytes()
                long r2 = (long) r9
                int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r9 >= 0) goto L4c
                r5.headerSizeExceeded()
            L4c:
                io.netty.buffer.ByteBuf r9 = r5.headerBlock
                boolean r9 = r9.isWritable(r7)
                if (r9 == 0) goto L5a
                io.netty.buffer.ByteBuf r8 = r5.headerBlock
                r8.writeBytes(r6, r7)
                return
            L5a:
                io.netty.buffer.ByteBuf r9 = r5.headerBlock
                int r9 = r9.readableBytes()
                int r9 = r9 + r7
                io.netty.buffer.ByteBuf r8 = r8.buffer(r9)
                io.netty.buffer.ByteBuf r9 = r5.headerBlock
                io.netty.buffer.ByteBuf r9 = r8.writeBytes(r9)
                r9.writeBytes(r6, r7)
                io.netty.buffer.ByteBuf r6 = r5.headerBlock
                r6.release()
                r5.headerBlock = r8
                return
        }

        void close() {
                r2 = this;
                io.netty.buffer.ByteBuf r0 = r2.headerBlock
                r1 = 0
                if (r0 == 0) goto La
                r0.release()
                r2.headerBlock = r1
            La:
                io.netty.handler.codec.http2.DefaultHttp2FrameReader r0 = r2.this$0
                io.netty.handler.codec.http2.DefaultHttp2FrameReader.access$302(r0, r1)
                return
        }

        io.netty.handler.codec.http2.Http2Headers headers() throws io.netty.handler.codec.http2.Http2Exception {
                r3 = this;
                io.netty.handler.codec.http2.DefaultHttp2FrameReader r0 = r3.this$0     // Catch: java.lang.Throwable -> L16
                io.netty.handler.codec.http2.Http2HeadersDecoder r0 = io.netty.handler.codec.http2.DefaultHttp2FrameReader.access$100(r0)     // Catch: java.lang.Throwable -> L16
                io.netty.handler.codec.http2.DefaultHttp2FrameReader r1 = r3.this$0     // Catch: java.lang.Throwable -> L16
                int r1 = io.netty.handler.codec.http2.DefaultHttp2FrameReader.access$200(r1)     // Catch: java.lang.Throwable -> L16
                io.netty.buffer.ByteBuf r2 = r3.headerBlock     // Catch: java.lang.Throwable -> L16
                io.netty.handler.codec.http2.Http2Headers r0 = r0.decodeHeaders(r1, r2)     // Catch: java.lang.Throwable -> L16
                r3.close()
                return r0
            L16:
                r0 = move-exception
                r3.close()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class HeadersContinuation {
        private final io.netty.handler.codec.http2.DefaultHttp2FrameReader.HeadersBlockBuilder builder;
        final /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2FrameReader this$0;

        private HeadersContinuation(io.netty.handler.codec.http2.DefaultHttp2FrameReader r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersBlockBuilder r0 = new io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersBlockBuilder
                r0.<init>(r2)
                r1.builder = r0
                return
        }

        /* synthetic */ HeadersContinuation(io.netty.handler.codec.http2.DefaultHttp2FrameReader r1, io.netty.handler.codec.http2.DefaultHttp2FrameReader.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        final void close() {
                r1 = this;
                io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersBlockBuilder r0 = r1.builder
                r0.close()
                return
        }

        abstract int getStreamId();

        final io.netty.handler.codec.http2.DefaultHttp2FrameReader.HeadersBlockBuilder headersBlockBuilder() {
                r1 = this;
                io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersBlockBuilder r0 = r1.builder
                return r0
        }

        abstract void processFragment(boolean r1, io.netty.buffer.ByteBuf r2, int r3, io.netty.handler.codec.http2.Http2FrameListener r4) throws io.netty.handler.codec.http2.Http2Exception;
    }

    public DefaultHttp2FrameReader() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public DefaultHttp2FrameReader(io.netty.handler.codec.http2.Http2HeadersDecoder r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.readingHeaders = r0
            r1.headersDecoder = r2
            r2 = 16384(0x4000, float:2.2959E-41)
            r1.maxFrameSize = r2
            return
    }

    public DefaultHttp2FrameReader(boolean r2) {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2HeadersDecoder r0 = new io.netty.handler.codec.http2.DefaultHttp2HeadersDecoder
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    static /* synthetic */ io.netty.handler.codec.http2.Http2HeadersDecoder access$100(io.netty.handler.codec.http2.DefaultHttp2FrameReader r0) {
            io.netty.handler.codec.http2.Http2HeadersDecoder r0 = r0.headersDecoder
            return r0
    }

    static /* synthetic */ int access$200(io.netty.handler.codec.http2.DefaultHttp2FrameReader r0) {
            int r0 = r0.streamId
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.http2.DefaultHttp2FrameReader.HeadersContinuation access$302(io.netty.handler.codec.http2.DefaultHttp2FrameReader r0, io.netty.handler.codec.http2.DefaultHttp2FrameReader.HeadersContinuation r1) {
            r0.headersContinuation = r1
            return r1
    }

    private void closeHeadersContinuation() {
            r1 = this;
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersContinuation r0 = r1.headersContinuation
            if (r0 == 0) goto La
            r0.close()
            r0 = 0
            r1.headersContinuation = r0
        La:
            return
    }

    private static int lengthWithoutTrailingPadding(int r0, int r1) {
            if (r1 != 0) goto L3
            return r0
        L3:
            int r1 = r1 + (-1)
            int r0 = r0 - r1
            return r0
    }

    private void processHeaderState(io.netty.buffer.ByteBuf r5) throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            int r0 = r5.readableBytes()
            r1 = 9
            if (r0 >= r1) goto L9
            return
        L9:
            int r0 = r5.readUnsignedMedium()
            r4.payloadLength = r0
            int r1 = r4.maxFrameSize
            r2 = 0
            if (r0 > r1) goto L5e
            byte r0 = r5.readByte()
            r4.frameType = r0
            io.netty.handler.codec.http2.Http2Flags r0 = new io.netty.handler.codec.http2.Http2Flags
            short r1 = r5.readUnsignedByte()
            r0.<init>(r1)
            r4.flags = r0
            int r5 = io.netty.handler.codec.http2.Http2CodecUtil.readUnsignedInt(r5)
            r4.streamId = r5
            r4.readingHeaders = r2
            byte r5 = r4.frameType
            switch(r5) {
                case 0: goto L5a;
                case 1: goto L56;
                case 2: goto L52;
                case 3: goto L4e;
                case 4: goto L4a;
                case 5: goto L46;
                case 6: goto L42;
                case 7: goto L3e;
                case 8: goto L3a;
                case 9: goto L36;
                default: goto L32;
            }
        L32:
            r4.verifyUnknownFrame()
            return
        L36:
            r4.verifyContinuationFrame()
            return
        L3a:
            r4.verifyWindowUpdateFrame()
            return
        L3e:
            r4.verifyGoAwayFrame()
            return
        L42:
            r4.verifyPingFrame()
            return
        L46:
            r4.verifyPushPromiseFrame()
            return
        L4a:
            r4.verifySettingsFrame()
            return
        L4e:
            r4.verifyRstStreamFrame()
            return
        L52:
            r4.verifyPriorityFrame()
            return
        L56:
            r4.verifyHeadersFrame()
            return
        L5a:
            r4.verifyDataFrame()
            return
        L5e:
            io.netty.handler.codec.http2.Http2Error r5 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r4.maxFrameSize
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r0 = 1
            r3[r0] = r1
            java.lang.String r0 = "Frame length: %d exceeds maximum: %d"
            io.netty.handler.codec.http2.Http2Exception r5 = io.netty.handler.codec.http2.Http2Exception.connectionError(r5, r0, r3)
            throw r5
    }

    private void processPayloadState(io.netty.channel.ChannelHandlerContext r4, io.netty.buffer.ByteBuf r5, io.netty.handler.codec.http2.Http2FrameListener r6) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            int r0 = r5.readableBytes()
            int r1 = r3.payloadLength
            if (r0 >= r1) goto L9
            return
        L9:
            int r0 = r5.readerIndex()
            int r1 = r3.payloadLength
            int r0 = r0 + r1
            r1 = 1
            r3.readingHeaders = r1
            byte r1 = r3.frameType
            switch(r1) {
                case 0: goto L44;
                case 1: goto L40;
                case 2: goto L3c;
                case 3: goto L38;
                case 4: goto L34;
                case 5: goto L30;
                case 6: goto L28;
                case 7: goto L24;
                case 8: goto L20;
                case 9: goto L1c;
                default: goto L18;
            }
        L18:
            r3.readUnknownFrame(r4, r5, r0, r6)
            goto L47
        L1c:
            r3.readContinuationFrame(r5, r0, r6)
            goto L47
        L20:
            r3.readWindowUpdateFrame(r4, r5, r6)
            goto L47
        L24:
            readGoAwayFrame(r4, r5, r0, r6)
            goto L47
        L28:
            long r1 = r5.readLong()
            r3.readPingFrame(r4, r1, r6)
            goto L47
        L30:
            r3.readPushPromiseFrame(r4, r5, r0, r6)
            goto L47
        L34:
            r3.readSettingsFrame(r4, r5, r6)
            goto L47
        L38:
            r3.readRstStreamFrame(r4, r5, r6)
            goto L47
        L3c:
            r3.readPriorityFrame(r4, r5, r6)
            goto L47
        L40:
            r3.readHeadersFrame(r4, r5, r0, r6)
            goto L47
        L44:
            r3.readDataFrame(r4, r5, r0, r6)
        L47:
            r5.readerIndex(r0)
            return
    }

    private void readContinuationFrame(io.netty.buffer.ByteBuf r4, int r5, io.netty.handler.codec.http2.Http2FrameListener r6) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersContinuation r0 = r3.headersContinuation
            io.netty.handler.codec.http2.Http2Flags r1 = r3.flags
            boolean r1 = r1.endOfHeaders()
            int r2 = r4.readerIndex()
            int r5 = r5 - r2
            r0.processFragment(r1, r4, r5, r6)
            io.netty.handler.codec.http2.Http2Flags r4 = r3.flags
            boolean r4 = r4.endOfHeaders()
            r3.resetHeadersContinuationIfEnd(r4)
            return
    }

    private void readDataFrame(io.netty.channel.ChannelHandlerContext r7, io.netty.buffer.ByteBuf r8, int r9, io.netty.handler.codec.http2.Http2FrameListener r10) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            int r4 = r6.readPadding(r8)
            r6.verifyPadding(r4)
            int r0 = r8.readerIndex()
            int r9 = r9 - r0
            int r9 = lengthWithoutTrailingPadding(r9, r4)
            io.netty.buffer.ByteBuf r3 = r8.readSlice(r9)
            int r2 = r6.streamId
            io.netty.handler.codec.http2.Http2Flags r8 = r6.flags
            boolean r5 = r8.endOfStream()
            r1 = r7
            r0 = r10
            r0.onDataRead(r1, r2, r3, r4, r5)
            return
    }

    private static void readGoAwayFrame(io.netty.channel.ChannelHandlerContext r6, io.netty.buffer.ByteBuf r7, int r8, io.netty.handler.codec.http2.Http2FrameListener r9) throws io.netty.handler.codec.http2.Http2Exception {
            int r2 = io.netty.handler.codec.http2.Http2CodecUtil.readUnsignedInt(r7)
            long r3 = r7.readUnsignedInt()
            int r0 = r7.readerIndex()
            int r8 = r8 - r0
            io.netty.buffer.ByteBuf r5 = r7.readSlice(r8)
            r1 = r6
            r0 = r9
            r0.onGoAwayRead(r1, r2, r3, r5)
            return
    }

    private void readHeadersFrame(io.netty.channel.ChannelHandlerContext r15, io.netty.buffer.ByteBuf r16, int r17, io.netty.handler.codec.http2.Http2FrameListener r18) throws io.netty.handler.codec.http2.Http2Exception {
            r14 = this;
            r0 = r16
            r1 = r18
            int r4 = r14.streamId
            io.netty.handler.codec.http2.Http2Flags r7 = r14.flags
            int r6 = r14.readPadding(r0)
            r14.verifyPadding(r6)
            io.netty.handler.codec.http2.Http2Flags r2 = r14.flags
            boolean r2 = r2.priorityPresent()
            if (r2 == 0) goto L70
            long r2 = r0.readUnsignedInt()
            r8 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r8 = r8 & r2
            r10 = 0
            r5 = 0
            r12 = 1
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 == 0) goto L2b
            r8 = 1
            goto L2c
        L2b:
            r8 = 0
        L2c:
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = r2 & r9
            int r3 = (int) r2
            int r2 = r14.streamId
            if (r3 == r2) goto L65
            short r2 = r0.readUnsignedByte()
            int r2 = r2 + r12
            short r2 = (short) r2
            int r5 = r0.readerIndex()
            int r5 = r17 - r5
            int r11 = lengthWithoutTrailingPadding(r5, r6)
            r10 = r7
            r7 = r2
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$1 r2 = new io.netty.handler.codec.http2.DefaultHttp2FrameReader$1
            r5 = r15
            r9 = r6
            r6 = r3
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r14.headersContinuation = r2
            io.netty.handler.codec.http2.Http2Flags r4 = r14.flags
            boolean r4 = r4.endOfHeaders()
            r2.processFragment(r4, r0, r11, r1)
            io.netty.handler.codec.http2.Http2Flags r0 = r14.flags
            boolean r0 = r0.endOfHeaders()
            r14.resetHeadersContinuationIfEnd(r0)
            return
        L65:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r1 = "A stream cannot depend on itself."
            java.lang.Object[] r4 = new java.lang.Object[r5]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.streamError(r2, r0, r1, r4)
            throw r0
        L70:
            r10 = r7
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$2 r2 = new io.netty.handler.codec.http2.DefaultHttp2FrameReader$2
            r3 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r14.headersContinuation = r2
            int r2 = r0.readerIndex()
            int r2 = r17 - r2
            int r2 = lengthWithoutTrailingPadding(r2, r6)
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersContinuation r4 = r14.headersContinuation
            io.netty.handler.codec.http2.Http2Flags r5 = r14.flags
            boolean r5 = r5.endOfHeaders()
            r4.processFragment(r5, r0, r2, r1)
            io.netty.handler.codec.http2.Http2Flags r0 = r14.flags
            boolean r0 = r0.endOfHeaders()
            r14.resetHeadersContinuationIfEnd(r0)
            return
    }

    private int readPadding(io.netty.buffer.ByteBuf r2) {
            r1 = this;
            io.netty.handler.codec.http2.Http2Flags r0 = r1.flags
            boolean r0 = r0.paddingPresent()
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            short r2 = r2.readUnsignedByte()
            int r2 = r2 + 1
            return r2
    }

    private void readPingFrame(io.netty.channel.ChannelHandlerContext r2, long r3, io.netty.handler.codec.http2.Http2FrameListener r5) throws io.netty.handler.codec.http2.Http2Exception {
            r1 = this;
            io.netty.handler.codec.http2.Http2Flags r0 = r1.flags
            boolean r0 = r0.ack()
            if (r0 == 0) goto Lc
            r5.onPingAckRead(r2, r3)
            return
        Lc:
            r5.onPingRead(r2, r3)
            return
    }

    private void readPriorityFrame(io.netty.channel.ChannelHandlerContext r17, io.netty.buffer.ByteBuf r18, io.netty.handler.codec.http2.Http2FrameListener r19) throws io.netty.handler.codec.http2.Http2Exception {
            r16 = this;
            r0 = r16
            long r1 = r18.readUnsignedInt()
            r3 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = r3 & r1
            r5 = 0
            r7 = 0
            r8 = 1
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L16
            r15 = 1
            goto L17
        L16:
            r15 = 0
        L17:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r1 = r1 & r3
            int r13 = (int) r1
            int r1 = r0.streamId
            if (r13 == r1) goto L30
            short r1 = r18.readUnsignedByte()
            int r1 = r1 + r8
            short r14 = (short) r1
            int r12 = r0.streamId
            r11 = r17
            r10 = r19
            r10.onPriorityRead(r11, r12, r13, r14, r15)
            return
        L30:
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r3 = "A stream cannot depend on itself."
            java.lang.Object[] r4 = new java.lang.Object[r7]
            io.netty.handler.codec.http2.Http2Exception r1 = io.netty.handler.codec.http2.Http2Exception.streamError(r1, r2, r3, r4)
            throw r1
    }

    private void readPushPromiseFrame(io.netty.channel.ChannelHandlerContext r7, io.netty.buffer.ByteBuf r8, int r9, io.netty.handler.codec.http2.Http2FrameListener r10) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            int r2 = r6.streamId
            int r5 = r6.readPadding(r8)
            r6.verifyPadding(r5)
            int r4 = io.netty.handler.codec.http2.Http2CodecUtil.readUnsignedInt(r8)
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$3 r0 = new io.netty.handler.codec.http2.DefaultHttp2FrameReader$3
            r1 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r1.headersContinuation = r0
            int r7 = r8.readerIndex()
            int r9 = r9 - r7
            int r7 = lengthWithoutTrailingPadding(r9, r5)
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersContinuation r9 = r1.headersContinuation
            io.netty.handler.codec.http2.Http2Flags r0 = r1.flags
            boolean r0 = r0.endOfHeaders()
            r9.processFragment(r0, r8, r7, r10)
            io.netty.handler.codec.http2.Http2Flags r7 = r1.flags
            boolean r7 = r7.endOfHeaders()
            r6.resetHeadersContinuationIfEnd(r7)
            return
    }

    private void readRstStreamFrame(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, io.netty.handler.codec.http2.Http2FrameListener r5) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            long r0 = r4.readUnsignedInt()
            int r4 = r2.streamId
            r5.onRstStreamRead(r3, r4, r0)
            return
    }

    private void readSettingsFrame(io.netty.channel.ChannelHandlerContext r8, io.netty.buffer.ByteBuf r9, io.netty.handler.codec.http2.Http2FrameListener r10) throws io.netty.handler.codec.http2.Http2Exception {
            r7 = this;
            io.netty.handler.codec.http2.Http2Flags r0 = r7.flags
            boolean r0 = r0.ack()
            if (r0 == 0) goto Lc
            r10.onSettingsAckRead(r8)
            return
        Lc:
            int r0 = r7.payloadLength
            int r0 = r0 / 6
            io.netty.handler.codec.http2.Http2Settings r1 = new io.netty.handler.codec.http2.Http2Settings
            r1.<init>()
            r2 = 0
            r3 = 0
        L17:
            if (r3 >= r0) goto L5a
            int r4 = r9.readUnsignedShort()
            char r4 = (char) r4
            long r5 = r9.readUnsignedInt()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.IllegalArgumentException -> L2c
            r1.put(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L2c
            int r3 = r3 + 1
            goto L17
        L2c:
            r8 = move-exception
            r9 = 4
            if (r4 == r9) goto L4d
            r9 = 5
            if (r4 == r9) goto L40
            io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r10 = r8.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.connectionError(r9, r8, r10, r0)
            throw r8
        L40:
            io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r10 = r8.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.connectionError(r9, r8, r10, r0)
            throw r8
        L4d:
            io.netty.handler.codec.http2.Http2Error r9 = io.netty.handler.codec.http2.Http2Error.FLOW_CONTROL_ERROR
            java.lang.String r10 = r8.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            io.netty.handler.codec.http2.Http2Exception r8 = io.netty.handler.codec.http2.Http2Exception.connectionError(r9, r8, r10, r0)
            throw r8
        L5a:
            r10.onSettingsRead(r8, r1)
            return
    }

    private void readUnknownFrame(io.netty.channel.ChannelHandlerContext r7, io.netty.buffer.ByteBuf r8, int r9, io.netty.handler.codec.http2.Http2FrameListener r10) throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            int r0 = r8.readerIndex()
            int r9 = r9 - r0
            io.netty.buffer.ByteBuf r5 = r8.readSlice(r9)
            byte r2 = r6.frameType
            int r3 = r6.streamId
            io.netty.handler.codec.http2.Http2Flags r4 = r6.flags
            r1 = r7
            r0 = r10
            r0.onUnknownFrame(r1, r2, r3, r4, r5)
            return
    }

    private void readWindowUpdateFrame(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, io.netty.handler.codec.http2.Http2FrameListener r5) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            int r4 = io.netty.handler.codec.http2.Http2CodecUtil.readUnsignedInt(r4)
            if (r4 == 0) goto Lc
            int r0 = r2.streamId
            r5.onWindowUpdateRead(r3, r0, r4)
            return
        Lc:
            int r3 = r2.streamId
            io.netty.handler.codec.http2.Http2Error r4 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r5
            java.lang.String r5 = "Received WINDOW_UPDATE with delta 0 for stream: %d"
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.streamError(r3, r4, r5, r0)
            throw r3
    }

    private void resetHeadersContinuationIfEnd(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.closeHeadersContinuation()
        L5:
            return
    }

    private void verifyAssociatedWithAStream() throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            int r0 = r4.streamId
            if (r0 == 0) goto L5
            return
        L5:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            byte r1 = r4.frameType
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "Frame of type %s must be associated with a stream."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r1, r2)
            throw r0
    }

    private void verifyContinuationFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r6 = this;
            r6.verifyAssociatedWithAStream()
            int r0 = r6.payloadLength
            r6.verifyPayloadLength(r0)
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersContinuation r0 = r6.headersContinuation
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L56
            int r3 = r6.streamId
            int r0 = r0.getStreamId()
            if (r3 != r0) goto L36
            int r0 = r6.payloadLength
            io.netty.handler.codec.http2.Http2Flags r3 = r6.flags
            int r3 = r3.getPaddingPresenceFieldLength()
            if (r0 < r3) goto L21
            return
        L21:
            int r0 = r6.streamId
            io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            int r4 = r6.payloadLength
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r4
            java.lang.String r1 = "Frame length %d too small for padding."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.streamError(r0, r3, r1, r2)
            throw r0
        L36:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersContinuation r3 = r6.headersContinuation
            int r3 = r3.getStreamId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r6.streamId
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r3
            r5[r2] = r4
            java.lang.String r1 = "Continuation stream ID does not match pending headers. Expected %d, but received %d."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r1, r5)
            throw r0
        L56:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            byte r3 = r6.frameType
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r3
            java.lang.String r1 = "Received %s frame but not currently processing headers."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r1, r2)
            throw r0
    }

    private void verifyDataFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r5 = this;
            r5.verifyAssociatedWithAStream()
            r5.verifyNotProcessingHeaders()
            int r0 = r5.payloadLength
            r5.verifyPayloadLength(r0)
            int r0 = r5.payloadLength
            io.netty.handler.codec.http2.Http2Flags r1 = r5.flags
            int r1 = r1.getPaddingPresenceFieldLength()
            if (r0 < r1) goto L16
            return
        L16:
            int r0 = r5.streamId
            io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            int r2 = r5.payloadLength
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "Frame length %d too small."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.streamError(r0, r1, r2, r3)
            throw r0
    }

    private void verifyGoAwayFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            r4.verifyNotProcessingHeaders()
            int r0 = r4.payloadLength
            r4.verifyPayloadLength(r0)
            int r0 = r4.streamId
            r1 = 0
            if (r0 != 0) goto L26
            int r0 = r4.payloadLength
            r2 = 8
            if (r0 < r2) goto L14
            return
        L14:
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r0
            java.lang.String r0 = "Frame length %d too small."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r2, r0, r3)
            throw r0
        L26:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r2 = "A stream ID must be zero."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r1)
            throw r0
    }

    private void verifyHeadersFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            r4.verifyAssociatedWithAStream()
            r4.verifyNotProcessingHeaders()
            int r0 = r4.payloadLength
            r4.verifyPayloadLength(r0)
            io.netty.handler.codec.http2.Http2Flags r0 = r4.flags
            int r0 = r0.getPaddingPresenceFieldLength()
            io.netty.handler.codec.http2.Http2Flags r1 = r4.flags
            int r1 = r1.getNumPriorityBytes()
            int r0 = r0 + r1
            int r1 = r4.payloadLength
            if (r1 < r0) goto L1d
            return
        L1d:
            int r0 = r4.streamId
            io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Frame length too small."
            r2.append(r3)
            int r3 = r4.payloadLength
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.streamError(r0, r1, r2, r3)
            throw r0
    }

    private void verifyNotProcessingHeaders() throws io.netty.handler.codec.http2.Http2Exception {
            r5 = this;
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersContinuation r0 = r5.headersContinuation
            if (r0 != 0) goto L5
            return
        L5:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            byte r1 = r5.frameType
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            io.netty.handler.codec.http2.DefaultHttp2FrameReader$HeadersContinuation r2 = r5.headersContinuation
            int r2 = r2.getStreamId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "Received frame of type %s while processing headers on stream %d."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r1, r3)
            throw r0
    }

    private void verifyPadding(int r3) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            int r0 = r2.payloadLength
            int r3 = lengthWithoutTrailingPadding(r0, r3)
            if (r3 < 0) goto L9
            return
        L9:
            io.netty.handler.codec.http2.Http2Error r3 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Frame payload too small for padding."
            io.netty.handler.codec.http2.Http2Exception r3 = io.netty.handler.codec.http2.Http2Exception.connectionError(r3, r1, r0)
            throw r3
    }

    private void verifyPayloadLength(int r4) throws io.netty.handler.codec.http2.Http2Exception {
            r3 = this;
            int r0 = r3.maxFrameSize
            if (r4 > r0) goto L5
            return
        L5:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Total payload length %d exceeds max frame length."
            io.netty.handler.codec.http2.Http2Exception r4 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r4, r1)
            throw r4
    }

    private void verifyPingFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            r4.verifyNotProcessingHeaders()
            int r0 = r4.streamId
            r1 = 0
            if (r0 != 0) goto L21
            int r0 = r4.payloadLength
            r2 = 8
            if (r0 != r2) goto Lf
            return
        Lf:
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r0
            java.lang.String r0 = "Frame length %d incorrect size for ping."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r2, r0, r3)
            throw r0
        L21:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r2 = "A stream ID must be zero."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r1)
            throw r0
    }

    private void verifyPriorityFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r5 = this;
            r5.verifyAssociatedWithAStream()
            r5.verifyNotProcessingHeaders()
            int r0 = r5.payloadLength
            r1 = 5
            if (r0 != r1) goto Lc
            return
        Lc:
            int r1 = r5.streamId
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "Invalid frame length %d."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.streamError(r1, r2, r0, r3)
            throw r0
    }

    private void verifyPushPromiseFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r5 = this;
            r5.verifyNotProcessingHeaders()
            int r0 = r5.payloadLength
            r5.verifyPayloadLength(r0)
            io.netty.handler.codec.http2.Http2Flags r0 = r5.flags
            int r0 = r0.getPaddingPresenceFieldLength()
            int r0 = r0 + 4
            int r1 = r5.payloadLength
            if (r1 < r0) goto L15
            return
        L15:
            int r0 = r5.streamId
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "Frame length %d too small."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.streamError(r0, r2, r1, r3)
            throw r0
    }

    private void verifyRstStreamFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            r4.verifyAssociatedWithAStream()
            r4.verifyNotProcessingHeaders()
            int r0 = r4.payloadLength
            r1 = 4
            if (r0 != r1) goto Lc
            return
        Lc:
            io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "Invalid frame length %d."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r1, r0, r2)
            throw r0
    }

    private void verifySettingsFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            r4.verifyNotProcessingHeaders()
            int r0 = r4.payloadLength
            r4.verifyPayloadLength(r0)
            int r0 = r4.streamId
            r1 = 0
            if (r0 != 0) goto L3e
            io.netty.handler.codec.http2.Http2Flags r0 = r4.flags
            boolean r0 = r0.ack()
            if (r0 == 0) goto L25
            int r0 = r4.payloadLength
            if (r0 > 0) goto L1a
            goto L25
        L1a:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.String r2 = "Ack settings frame must have an empty payload."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r1)
            throw r0
        L25:
            int r0 = r4.payloadLength
            int r2 = r0 % 6
            if (r2 > 0) goto L2c
            return
        L2c:
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r0
            java.lang.String r0 = "Frame length %d invalid."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r2, r0, r3)
            throw r0
        L3e:
            io.netty.handler.codec.http2.Http2Error r0 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            java.lang.String r2 = "A stream ID must be zero."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r0, r2, r1)
            throw r0
    }

    private static void verifyStreamOrConnectionId(int r2, java.lang.String r3) throws io.netty.handler.codec.http2.Http2Exception {
            if (r2 < 0) goto L3
            return
        L3:
            io.netty.handler.codec.http2.Http2Error r2 = io.netty.handler.codec.http2.Http2Error.PROTOCOL_ERROR
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "%s must be >= 0"
            io.netty.handler.codec.http2.Http2Exception r2 = io.netty.handler.codec.http2.Http2Exception.connectionError(r2, r3, r0)
            throw r2
    }

    private void verifyUnknownFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r0 = this;
            r0.verifyNotProcessingHeaders()
            return
    }

    private void verifyWindowUpdateFrame() throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            r4.verifyNotProcessingHeaders()
            int r0 = r4.streamId
            java.lang.String r1 = "Stream ID"
            verifyStreamOrConnectionId(r0, r1)
            int r0 = r4.payloadLength
            r1 = 4
            if (r0 != r1) goto L10
            return
        L10:
            io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "Invalid frame length %d."
            io.netty.handler.codec.http2.Http2Exception r0 = io.netty.handler.codec.http2.Http2Exception.connectionError(r1, r0, r2)
            throw r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            r0.closeHeadersContinuation()
            return
    }

    @Override // io.netty.handler.codec.http2.Http2FrameReader
    public io.netty.handler.codec.http2.Http2FrameReader.Configuration configuration() {
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameReader.Configuration
    public io.netty.handler.codec.http2.Http2FrameSizePolicy frameSizePolicy() {
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameReader.Configuration
    public io.netty.handler.codec.http2.Http2HeadersDecoder.Configuration headersConfiguration() {
            r1 = this;
            io.netty.handler.codec.http2.Http2HeadersDecoder r0 = r1.headersDecoder
            io.netty.handler.codec.http2.Http2HeadersDecoder$Configuration r0 = r0.configuration()
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameSizePolicy
    public int maxFrameSize() {
            r1 = this;
            int r0 = r1.maxFrameSize
            return r0
    }

    @Override // io.netty.handler.codec.http2.Http2FrameSizePolicy
    public void maxFrameSize(int r5) throws io.netty.handler.codec.http2.Http2Exception {
            r4 = this;
            boolean r0 = io.netty.handler.codec.http2.Http2CodecUtil.isMaxFrameSizeValid(r5)
            if (r0 == 0) goto L9
            r4.maxFrameSize = r5
            return
        L9:
            int r0 = r4.streamId
            io.netty.handler.codec.http2.Http2Error r1 = io.netty.handler.codec.http2.Http2Error.FRAME_SIZE_ERROR
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "Invalid MAX_FRAME_SIZE specified in sent settings: %d"
            io.netty.handler.codec.http2.Http2Exception r5 = io.netty.handler.codec.http2.Http2Exception.streamError(r0, r1, r5, r2)
            throw r5
    }

    @Override // io.netty.handler.codec.http2.Http2FrameReader
    public void readFrame(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, io.netty.handler.codec.http2.Http2FrameListener r5) throws io.netty.handler.codec.http2.Http2Exception {
            r2 = this;
            boolean r0 = r2.readError
            if (r0 == 0) goto Lc
            int r3 = r4.readableBytes()
            r4.skipBytes(r3)
            return
        Lc:
            r0 = 1
            boolean r1 = r2.readingHeaders     // Catch: java.lang.Throwable -> L19 java.lang.RuntimeException -> L1b io.netty.handler.codec.http2.Http2Exception -> L1d
            if (r1 == 0) goto L1f
            r2.processHeaderState(r4)     // Catch: java.lang.Throwable -> L19 java.lang.RuntimeException -> L1b io.netty.handler.codec.http2.Http2Exception -> L1d
            boolean r1 = r2.readingHeaders     // Catch: java.lang.Throwable -> L19 java.lang.RuntimeException -> L1b io.netty.handler.codec.http2.Http2Exception -> L1d
            if (r1 == 0) goto L1f
            goto L2d
        L19:
            r3 = move-exception
            goto L2e
        L1b:
            r3 = move-exception
            goto L34
        L1d:
            r3 = move-exception
            goto L37
        L1f:
            r2.processPayloadState(r3, r4, r5)     // Catch: java.lang.Throwable -> L19 java.lang.RuntimeException -> L1b io.netty.handler.codec.http2.Http2Exception -> L1d
            boolean r1 = r2.readingHeaders     // Catch: java.lang.Throwable -> L19 java.lang.RuntimeException -> L1b io.netty.handler.codec.http2.Http2Exception -> L1d
            if (r1 != 0) goto L27
            goto L2d
        L27:
            boolean r0 = r4.isReadable()     // Catch: java.lang.Throwable -> L19 java.lang.RuntimeException -> L1b io.netty.handler.codec.http2.Http2Exception -> L1d
            if (r0 != 0) goto Lc
        L2d:
            return
        L2e:
            r2.readError = r0
            io.netty.util.internal.PlatformDependent.throwException(r3)
            return
        L34:
            r2.readError = r0
            throw r3
        L37:
            boolean r4 = io.netty.handler.codec.http2.Http2Exception.isStreamError(r3)
            r4 = r4 ^ r0
            r2.readError = r4
            throw r3
    }
}
