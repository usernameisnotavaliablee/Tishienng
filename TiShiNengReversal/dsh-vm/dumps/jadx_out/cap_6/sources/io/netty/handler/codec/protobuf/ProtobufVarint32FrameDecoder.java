package io.netty.handler.codec.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ProtobufVarint32FrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    public ProtobufVarint32FrameDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int readRawVarint32(io.netty.buffer.ByteBuf r3) {
            boolean r0 = r3.isReadable()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r3.markReaderIndex()
            byte r0 = r3.readByte()
            if (r0 < 0) goto L12
            return r0
        L12:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            boolean r2 = r3.isReadable()
            if (r2 != 0) goto L1e
            r3.resetReaderIndex()
            return r1
        L1e:
            byte r2 = r3.readByte()
            if (r2 < 0) goto L28
            int r3 = r2 << 7
        L26:
            r3 = r3 | r0
            return r3
        L28:
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r2 << 7
            r0 = r0 | r2
            boolean r2 = r3.isReadable()
            if (r2 != 0) goto L37
            r3.resetReaderIndex()
            return r1
        L37:
            byte r2 = r3.readByte()
            if (r2 < 0) goto L40
            int r3 = r2 << 14
            goto L26
        L40:
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r2 << 14
            r0 = r0 | r2
            boolean r2 = r3.isReadable()
            if (r2 != 0) goto L4f
            r3.resetReaderIndex()
            return r1
        L4f:
            byte r2 = r3.readByte()
            if (r2 < 0) goto L58
            int r3 = r2 << 21
            goto L26
        L58:
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r2 << 21
            r0 = r0 | r2
            boolean r2 = r3.isReadable()
            if (r2 != 0) goto L67
            r3.resetReaderIndex()
            return r1
        L67:
            byte r3 = r3.readByte()
            int r1 = r3 << 28
            r0 = r0 | r1
            if (r3 < 0) goto L71
            return r0
        L71:
            io.netty.handler.codec.CorruptedFrameException r3 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.String r0 = "malformed varint."
            r3.<init>(r0)
            throw r3
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            r4.markReaderIndex()
            int r3 = r4.readerIndex()
            int r0 = readRawVarint32(r4)
            int r1 = r4.readerIndex()
            if (r3 != r1) goto L12
            return
        L12:
            if (r0 < 0) goto L26
            int r3 = r4.readableBytes()
            if (r3 >= r0) goto L1e
            r4.resetReaderIndex()
            return
        L1e:
            io.netty.buffer.ByteBuf r3 = r4.readRetainedSlice(r0)
            r5.add(r3)
            return
        L26:
            io.netty.handler.codec.CorruptedFrameException r3 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "negative length: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }
}
