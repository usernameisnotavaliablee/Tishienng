package io.netty.handler.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChunkedNioFile implements io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> {
    private final int chunkSize;
    private final long endOffset;
    private final java.nio.channels.FileChannel in;
    private long offset;
    private final long startOffset;

    public ChunkedNioFile(java.io.File r2) throws java.io.IOException {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.nio.channels.FileChannel r2 = r0.getChannel()
            r1.<init>(r2)
            return
    }

    public ChunkedNioFile(java.io.File r2, int r3) throws java.io.IOException {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.nio.channels.FileChannel r2 = r0.getChannel()
            r1.<init>(r2, r3)
            return
    }

    public ChunkedNioFile(java.nio.channels.FileChannel r2) throws java.io.IOException {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    public ChunkedNioFile(java.nio.channels.FileChannel r8, int r9) throws java.io.IOException {
            r7 = this;
            r2 = 0
            long r4 = r8.size()
            r0 = r7
            r1 = r8
            r6 = r9
            r0.<init>(r1, r2, r4, r6)
            return
    }

    public ChunkedNioFile(java.nio.channels.FileChannel r6, long r7, long r9, int r11) throws java.io.IOException {
            r5 = this;
            r5.<init>()
            if (r6 == 0) goto L74
            java.lang.String r0 = " (expected: 0 or greater)"
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L5a
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r4 < 0) goto L40
            if (r11 <= 0) goto L24
            if (r3 == 0) goto L18
            r6.position(r7)
        L18:
            r5.in = r6
            r5.chunkSize = r11
            r5.startOffset = r7
            r5.offset = r7
            long r7 = r7 + r9
            r5.endOffset = r7
            return
        L24:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "chunkSize: "
            r7.append(r8)
            r7.append(r11)
            java.lang.String r8 = " (expected: a positive integer)"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "length: "
            r7.append(r8)
            r7.append(r9)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L5a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "offset: "
            r9.append(r10)
            r9.append(r7)
            r9.append(r0)
            java.lang.String r7 = r9.toString()
            r6.<init>(r7)
            throw r6
        L74:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "in"
            r6.<init>(r7)
            throw r6
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public void close() throws java.lang.Exception {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.in
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
            if (r4 >= 0) goto L13
            java.nio.channels.FileChannel r0 = r5.in
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
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
            long r0 = java.lang.Math.min(r4, r2)
            int r1 = (int) r0
            io.netty.buffer.ByteBuf r7 = r7.buffer(r1)
            r0 = 0
        L18:
            java.nio.channels.FileChannel r2 = r6.in     // Catch: java.lang.Throwable -> L2d
            int r3 = r1 - r0
            int r2 = r7.writeBytes(r2, r3)     // Catch: java.lang.Throwable -> L2d
            if (r2 >= 0) goto L23
            goto L26
        L23:
            int r0 = r0 + r2
            if (r0 != r1) goto L18
        L26:
            long r1 = r6.offset     // Catch: java.lang.Throwable -> L2d
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L2d
            long r1 = r1 + r3
            r6.offset = r1     // Catch: java.lang.Throwable -> L2d
            return r7
        L2d:
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
