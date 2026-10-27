package io.netty.handler.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChunkedNioStream implements io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> {
    private final java.nio.ByteBuffer byteBuffer;
    private final int chunkSize;
    private final java.nio.channels.ReadableByteChannel in;
    private long offset;

    public ChunkedNioStream(java.nio.channels.ReadableByteChannel r2) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    public ChunkedNioStream(java.nio.channels.ReadableByteChannel r3, int r4) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L32
            if (r4 <= 0) goto L16
            r2.in = r3
            r0 = 0
            r2.offset = r0
            r2.chunkSize = r4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r4)
            r2.byteBuffer = r3
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "chunkSize: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " (expected: a positive integer)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L32:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "in"
            r3.<init>(r4)
            throw r3
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public void close() throws java.lang.Exception {
            r1 = this;
            java.nio.channels.ReadableByteChannel r0 = r1.in
            r0.close()
            return
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public boolean isEndOfInput() throws java.lang.Exception {
            r6 = this;
            java.nio.ByteBuffer r0 = r6.byteBuffer
            int r0 = r0.position()
            r1 = 0
            if (r0 <= 0) goto La
            return r1
        La:
            java.nio.channels.ReadableByteChannel r0 = r6.in
            boolean r0 = r0.isOpen()
            r2 = 1
            if (r0 == 0) goto L25
            java.nio.channels.ReadableByteChannel r0 = r6.in
            java.nio.ByteBuffer r3 = r6.byteBuffer
            int r0 = r0.read(r3)
            if (r0 >= 0) goto L1e
            return r2
        L1e:
            long r2 = r6.offset
            long r4 = (long) r0
            long r2 = r2 + r4
            r6.offset = r2
            return r1
        L25:
            return r2
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long length() {
            r2 = this;
            r0 = -1
            return r0
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long progress() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    public io.netty.buffer.ByteBuf readChunk(io.netty.buffer.ByteBufAllocator r7) throws java.lang.Exception {
            r6 = this;
            boolean r0 = r6.isEndOfInput()
            if (r0 == 0) goto L8
            r7 = 0
            return r7
        L8:
            java.nio.ByteBuffer r0 = r6.byteBuffer
            int r0 = r0.position()
        Le:
            java.nio.channels.ReadableByteChannel r1 = r6.in
            java.nio.ByteBuffer r2 = r6.byteBuffer
            int r1 = r1.read(r2)
            if (r1 >= 0) goto L19
            goto L24
        L19:
            int r0 = r0 + r1
            long r2 = r6.offset
            long r4 = (long) r1
            long r2 = r2 + r4
            r6.offset = r2
            int r1 = r6.chunkSize
            if (r0 != r1) goto Le
        L24:
            java.nio.ByteBuffer r0 = r6.byteBuffer
            r0.flip()
            java.nio.ByteBuffer r0 = r6.byteBuffer
            int r0 = r0.remaining()
            io.netty.buffer.ByteBuf r7 = r7.buffer(r0)
            java.nio.ByteBuffer r0 = r6.byteBuffer     // Catch: java.lang.Throwable -> L3e
            r7.writeBytes(r0)     // Catch: java.lang.Throwable -> L3e
            java.nio.ByteBuffer r0 = r6.byteBuffer     // Catch: java.lang.Throwable -> L3e
            r0.clear()     // Catch: java.lang.Throwable -> L3e
            return r7
        L3e:
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

    public long transferredBytes() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }
}
