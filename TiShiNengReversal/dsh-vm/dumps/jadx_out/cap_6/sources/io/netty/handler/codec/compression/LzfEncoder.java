package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LzfEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.buffer.ByteBuf> {
    private static final int MIN_BLOCK_TO_COMPRESS = 16;
    private final com.ning.compress.lzf.ChunkEncoder encoder;
    private final com.ning.compress.BufferRecycler recycler;

    public LzfEncoder() {
            r2 = this;
            r0 = 0
            r1 = 65535(0xffff, float:9.1834E-41)
            r2.<init>(r0, r1)
            return
    }

    public LzfEncoder(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public LzfEncoder(boolean r2) {
            r1 = this;
            r0 = 65535(0xffff, float:9.1834E-41)
            r1.<init>(r2, r0)
            return
    }

    public LzfEncoder(boolean r5, int r6) {
            r4 = this;
            r0 = 0
            r4.<init>(r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = 16
            if (r6 < r1) goto L21
            if (r6 > r0) goto L21
            if (r5 == 0) goto L14
            com.ning.compress.lzf.ChunkEncoder r5 = com.ning.compress.lzf.util.ChunkEncoderFactory.safeNonAllocatingInstance(r6)
            goto L18
        L14:
            com.ning.compress.lzf.ChunkEncoder r5 = com.ning.compress.lzf.util.ChunkEncoderFactory.optimalNonAllocatingInstance(r6)
        L18:
            r4.encoder = r5
            com.ning.compress.BufferRecycler r5 = com.ning.compress.BufferRecycler.instance()
            r4.recycler = r5
            return
        L21:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "totalLength: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " (expected: "
            r2.append(r6)
            r2.append(r1)
            r6 = 45
            r2.append(r6)
            r2.append(r0)
            r6 = 41
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r7, io.netty.buffer.ByteBuf r8, io.netty.buffer.ByteBuf r9) throws java.lang.Exception {
            r6 = this;
            int r3 = r8.readableBytes()
            int r7 = r8.readerIndex()
            boolean r0 = r8.hasArray()
            if (r0 == 0) goto L1a
            byte[] r0 = r8.array()
            int r1 = r8.arrayOffset()
            int r1 = r1 + r7
            r2 = r1
        L18:
            r1 = r0
            goto L26
        L1a:
            com.ning.compress.BufferRecycler r0 = r6.recycler
            byte[] r0 = r0.allocInputBuffer(r3)
            r1 = 0
            r8.getBytes(r7, r0, r1, r3)
            r2 = 0
            goto L18
        L26:
            int r7 = com.ning.compress.lzf.LZFEncoder.estimateMaxWorkspaceSize(r3)
            r9.ensureWritable(r7)
            byte[] r4 = r9.array()
            int r7 = r9.arrayOffset()
            int r0 = r9.writerIndex()
            int r5 = r7 + r0
            com.ning.compress.lzf.ChunkEncoder r0 = r6.encoder
            int r7 = com.ning.compress.lzf.LZFEncoder.appendEncoded(r0, r1, r2, r3, r4, r5)
            int r7 = r7 - r5
            int r0 = r9.writerIndex()
            int r0 = r0 + r7
            r9.writerIndex(r0)
            r8.skipBytes(r3)
            boolean r7 = r8.hasArray()
            if (r7 != 0) goto L58
            com.ning.compress.BufferRecycler r7 = r6.recycler
            r7.releaseInputBuffer(r1)
        L58:
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
