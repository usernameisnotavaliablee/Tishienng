package io.netty.handler.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChunkedFile implements io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> {
    private final int chunkSize;
    private final long endOffset;
    private final java.io.RandomAccessFile file;
    private long offset;
    private final long startOffset;

    public ChunkedFile(java.io.File r2) throws java.io.IOException {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    public ChunkedFile(java.io.File r3, int r4) throws java.io.IOException {
            r2 = this;
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            r2.<init>(r0, r4)
            return
    }

    public ChunkedFile(java.io.RandomAccessFile r2) throws java.io.IOException {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    public ChunkedFile(java.io.RandomAccessFile r8, int r9) throws java.io.IOException {
            r7 = this;
            r2 = 0
            long r4 = r8.length()
            r0 = r7
            r1 = r8
            r6 = r9
            r0.<init>(r1, r2, r4, r6)
            return
    }

    public ChunkedFile(java.io.RandomAccessFile r5, long r6, long r8, int r10) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L72
            java.lang.String r0 = " (expected: 0 or greater)"
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 < 0) goto L58
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 < 0) goto L3e
            if (r10 <= 0) goto L22
            r4.file = r5
            r4.startOffset = r6
            r4.offset = r6
            long r8 = r8 + r6
            r4.endOffset = r8
            r4.chunkSize = r10
            r5.seek(r6)
            return
        L22:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "chunkSize: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r7 = " (expected: a positive integer)"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L3e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "length: "
            r6.append(r7)
            r6.append(r8)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "offset: "
            r8.append(r9)
            r8.append(r6)
            r8.append(r0)
            java.lang.String r6 = r8.toString()
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "file"
            r5.<init>(r6)
            throw r5
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public void close() throws java.lang.Exception {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.file
            r0.close()
            return
    }

    public long currentOffset() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }

    public long endOffset() {
            r2 = this;
            long r0 = r2.endOffset
            return r0
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public boolean isEndOfInput() throws java.lang.Exception {
            r5 = this;
            long r0 = r5.offset
            long r2 = r5.endOffset
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L17
            java.io.RandomAccessFile r0 = r5.file
            java.nio.channels.FileChannel r0 = r0.getChannel()
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long length() {
            r4 = this;
            long r0 = r4.endOffset
            long r2 = r4.startOffset
            long r0 = r0 - r2
            return r0
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long progress() {
            r4 = this;
            long r0 = r4.offset
            long r2 = r4.startOffset
            long r0 = r0 - r2
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    public io.netty.buffer.ByteBuf readChunk(io.netty.buffer.ByteBufAllocator r7) throws java.lang.Exception {
            r6 = this;
            long r0 = r6.offset
            long r2 = r6.endOffset
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto La
            r7 = 0
            return r7
        La:
            int r4 = r6.chunkSize
            long r4 = (long) r4
            long r2 = r2 - r0
            long r2 = java.lang.Math.min(r4, r2)
            int r3 = (int) r2
            io.netty.buffer.ByteBuf r7 = r7.heapBuffer(r3)
            java.io.RandomAccessFile r2 = r6.file     // Catch: java.lang.Throwable -> L2c
            byte[] r4 = r7.array()     // Catch: java.lang.Throwable -> L2c
            int r5 = r7.arrayOffset()     // Catch: java.lang.Throwable -> L2c
            r2.readFully(r4, r5, r3)     // Catch: java.lang.Throwable -> L2c
            r7.writerIndex(r3)     // Catch: java.lang.Throwable -> L2c
            long r2 = (long) r3     // Catch: java.lang.Throwable -> L2c
            long r0 = r0 + r2
            r6.offset = r0     // Catch: java.lang.Throwable -> L2c
            return r7
        L2c:
            r0 = move-exception
            r7.release()
            throw r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    @java.lang.Deprecated
    public io.netty.buffer.ByteBuf readChunk(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.buffer.ByteBuf r1 = r0.readChunk(r1)
            return r1
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readChunk(io.netty.buffer.ByteBufAllocator r1) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.readChunk(r1)
            return r1
    }

    @Override // io.netty.handler.stream.ChunkedInput
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf readChunk(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r1 = r0.readChunk(r1)
            return r1
    }

    public long startOffset() {
            r2 = this;
            long r0 = r2.startOffset
            return r0
    }
}
