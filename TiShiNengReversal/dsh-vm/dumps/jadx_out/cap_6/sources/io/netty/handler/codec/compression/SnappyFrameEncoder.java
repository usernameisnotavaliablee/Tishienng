package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SnappyFrameEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.buffer.ByteBuf> {
    private static final int MIN_COMPRESSIBLE_LENGTH = 18;
    private static final byte[] STREAM_START = null;
    private final io.netty.handler.codec.compression.Snappy snappy;
    private boolean started;

    static {
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-1, 6, 0, 0, 115, 78, 97, 80, 112, 89} // fill-array
            io.netty.handler.codec.compression.SnappyFrameEncoder.STREAM_START = r0
            return
    }

    public SnappyFrameEncoder() {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.compression.Snappy r0 = new io.netty.handler.codec.compression.Snappy
            r0.<init>()
            r1.snappy = r0
            return
    }

    private static void calculateAndWriteChecksum(io.netty.buffer.ByteBuf r0, io.netty.buffer.ByteBuf r1) {
            int r0 = io.netty.handler.codec.compression.Snappy.calculateChecksum(r0)
            r1.writeIntLE(r0)
            return
    }

    private static void setChunkLength(io.netty.buffer.ByteBuf r2, int r3) {
            int r0 = r2.writerIndex()
            int r0 = r0 - r3
            int r0 = r0 + (-3)
            int r1 = r0 >>> 24
            if (r1 != 0) goto Lf
            r2.setMediumLE(r3, r0)
            return
        Lf:
            io.netty.handler.codec.compression.CompressionException r2 = new io.netty.handler.codec.compression.CompressionException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "compressed data too large: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static void writeChunkLength(io.netty.buffer.ByteBuf r0, int r1) {
            r0.writeMediumLE(r1)
            return
    }

    private static void writeUnencodedChunk(io.netty.buffer.ByteBuf r1, io.netty.buffer.ByteBuf r2, int r3) {
            r0 = 1
            r2.writeByte(r0)
            int r0 = r3 + 4
            writeChunkLength(r2, r0)
            calculateAndWriteChecksum(r1, r2)
            r2.writeBytes(r1, r3)
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r7, io.netty.buffer.ByteBuf r8, io.netty.buffer.ByteBuf r9) throws java.lang.Exception {
            r6 = this;
            boolean r7 = r8.isReadable()
            if (r7 != 0) goto L7
            return
        L7:
            boolean r7 = r6.started
            r0 = 1
            if (r7 != 0) goto L13
            r6.started = r0
            byte[] r7 = io.netty.handler.codec.compression.SnappyFrameEncoder.STREAM_START
            r9.writeBytes(r7)
        L13:
            int r7 = r8.readableBytes()
            r1 = 18
            if (r7 <= r1) goto L54
        L1b:
            int r2 = r9.writerIndex()
            int r2 = r2 + r0
            if (r7 >= r1) goto L2a
            io.netty.buffer.ByteBuf r8 = r8.readSlice(r7)
            writeUnencodedChunk(r8, r9, r7)
            return
        L2a:
            r3 = 0
            r9.writeInt(r3)
            r3 = 32767(0x7fff, float:4.5916E-41)
            if (r7 <= r3) goto L44
            io.netty.buffer.ByteBuf r4 = r8.readSlice(r3)
            calculateAndWriteChecksum(r4, r9)
            io.netty.handler.codec.compression.Snappy r5 = r6.snappy
            r5.encode(r4, r9, r3)
            setChunkLength(r9, r2)
            int r7 = r7 + (-32767)
            goto L1b
        L44:
            io.netty.buffer.ByteBuf r8 = r8.readSlice(r7)
            calculateAndWriteChecksum(r8, r9)
            io.netty.handler.codec.compression.Snappy r0 = r6.snappy
            r0.encode(r8, r9, r7)
            setChunkLength(r9, r2)
            return
        L54:
            writeUnencodedChunk(r8, r9, r7)
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
