package io.netty.handler.codec.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ProtobufVarint32LengthFieldPrepender extends io.netty.handler.codec.MessageToByteEncoder<io.netty.buffer.ByteBuf> {
    public ProtobufVarint32LengthFieldPrepender() {
            r0 = this;
            r0.<init>()
            return
    }

    static int computeRawVarint32Size(int r1) {
            r0 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r1
            if (r0 != 0) goto L13
            r1 = 3
            return r1
        L13:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            r1 = 4
            return r1
        L1a:
            r1 = 5
            return r1
    }

    static void writeRawVarint32(io.netty.buffer.ByteBuf r1, int r2) {
        L0:
            r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L8
            r1.writeByte(r2)
            return
        L8:
            r0 = r2 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.8E-43)
            r1.writeByte(r0)
            int r2 = r2 >>> 7
            goto L0
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r2, io.netty.buffer.ByteBuf r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r1 = this;
            int r2 = r3.readableBytes()
            int r0 = computeRawVarint32Size(r2)
            int r0 = r0 + r2
            r4.ensureWritable(r0)
            writeRawVarint32(r4, r2)
            int r0 = r3.readerIndex()
            r4.writeBytes(r3, r0, r2)
            return
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
