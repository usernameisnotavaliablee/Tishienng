package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FastLzFrameEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.buffer.ByteBuf> {
    private final java.util.zip.Checksum checksum;
    private final int level;

    public FastLzFrameEncoder() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public FastLzFrameEncoder(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FastLzFrameEncoder(int r8, java.util.zip.Checksum r9) {
            r7 = this;
            r0 = 0
            r7.<init>(r0)
            if (r8 == 0) goto L35
            r1 = 1
            if (r8 == r1) goto L35
            r2 = 2
            if (r8 != r2) goto Ld
            goto L35
        Ld:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r0] = r8
            r6[r1] = r3
            r6[r2] = r4
            r8 = 3
            r6[r8] = r5
            java.lang.String r8 = "level: %d (expected: %d or %d or %d)"
            java.lang.String r8 = java.lang.String.format(r8, r6)
            r9.<init>(r8)
            throw r9
        L35:
            r7.level = r8
            r7.checksum = r9
            return
    }

    public FastLzFrameEncoder(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.zip.Adler32 r2 = new java.util.zip.Adler32
            r2.<init>()
            goto L9
        L8:
            r2 = 0
        L9:
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r17, io.netty.buffer.ByteBuf r18, io.netty.buffer.ByteBuf r19) throws java.lang.Exception {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            java.util.zip.Checksum r3 = r0.checksum
        L8:
            boolean r4 = r1.isReadable()
            if (r4 != 0) goto Lf
            return
        Lf:
            int r4 = r1.readerIndex()
            int r5 = r1.readableBytes()
            r6 = 65535(0xffff, float:9.1834E-41)
            int r9 = java.lang.Math.min(r5, r6)
            int r5 = r2.writerIndex()
            r6 = 4607066(0x464c5a, float:6.455875E-39)
            r2.setMedium(r5, r6)
            int r6 = r5 + 4
            if (r3 == 0) goto L2e
            r7 = 4
            goto L2f
        L2e:
            r7 = 0
        L2f:
            int r14 = r6 + r7
            r7 = 32
            if (r9 >= r7) goto L79
            int r7 = r14 + 2
            int r7 = r7 + r9
            r2.ensureWritable(r7)
            byte[] r7 = r2.array()
            int r8 = r2.arrayOffset()
            int r8 = r8 + r14
            int r8 = r8 + 2
            if (r3 == 0) goto L71
            boolean r10 = r1.hasArray()
            if (r10 == 0) goto L58
            byte[] r10 = r1.array()
            int r11 = r1.arrayOffset()
            int r11 = r11 + r4
            goto L5e
        L58:
            byte[] r10 = new byte[r9]
            r1.getBytes(r4, r10)
            r11 = 0
        L5e:
            r3.reset()
            r3.update(r10, r11, r9)
            r15 = r14
            long r13 = r3.getValue()
            int r4 = (int) r13
            r2.setInt(r6, r4)
            java.lang.System.arraycopy(r10, r11, r7, r8, r9)
            goto L75
        L71:
            r15 = r14
            r1.getBytes(r4, r7, r8, r9)
        L75:
            r6 = r9
            r14 = r15
            r4 = 0
            goto Lca
        L79:
            r15 = r14
            boolean r7 = r1.hasArray()
            if (r7 == 0) goto L8a
            byte[] r7 = r1.array()
            int r8 = r1.arrayOffset()
            int r8 = r8 + r4
            goto L90
        L8a:
            byte[] r7 = new byte[r9]
            r1.getBytes(r4, r7)
            r8 = 0
        L90:
            if (r3 == 0) goto La0
            r3.reset()
            r3.update(r7, r8, r9)
            long r10 = r3.getValue()
            int r4 = (int) r10
            r2.setInt(r6, r4)
        La0:
            int r4 = io.netty.handler.codec.compression.FastLz.calculateOutputBufferLength(r9)
            int r14 = r15 + 4
            int r14 = r14 + r4
            r2.ensureWritable(r14)
            byte[] r10 = r2.array()
            int r4 = r2.arrayOffset()
            int r4 = r4 + r15
            int r11 = r4 + 4
            int r12 = r0.level
            int r6 = io.netty.handler.codec.compression.FastLz.compress(r7, r8, r9, r10, r11, r12)
            if (r6 >= r9) goto Lc4
            r2.setShort(r15, r6)
            int r14 = r15 + 2
            r4 = 1
            goto Lca
        Lc4:
            int r4 = r4 + 2
            java.lang.System.arraycopy(r7, r8, r10, r4, r9)
            goto L75
        Lca:
            r2.setShort(r14, r9)
            int r5 = r5 + 3
            if (r3 == 0) goto Ld4
            r13 = 16
            goto Ld5
        Ld4:
            r13 = 0
        Ld5:
            r4 = r4 | r13
            r2.setByte(r5, r4)
            int r14 = r14 + 2
            int r14 = r14 + r6
            r2.writerIndex(r14)
            r1.skipBytes(r9)
            goto L8
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
