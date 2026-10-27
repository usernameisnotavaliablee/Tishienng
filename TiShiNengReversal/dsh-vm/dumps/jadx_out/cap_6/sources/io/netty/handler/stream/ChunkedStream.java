package io.netty.handler.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ChunkedStream implements io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> {
    static final int DEFAULT_CHUNK_SIZE = 8192;
    private final int chunkSize;
    private boolean closed;
    private final java.io.PushbackInputStream in;
    private long offset;

    public ChunkedStream(java.io.InputStream r2) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    public ChunkedStream(java.io.InputStream r3, int r4) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L36
            if (r4 <= 0) goto L1a
            boolean r0 = r3 instanceof java.io.PushbackInputStream
            if (r0 == 0) goto L10
            java.io.PushbackInputStream r3 = (java.io.PushbackInputStream) r3
            r2.in = r3
            goto L17
        L10:
            java.io.PushbackInputStream r0 = new java.io.PushbackInputStream
            r0.<init>(r3)
            r2.in = r0
        L17:
            r2.chunkSize = r4
            return
        L1a:
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
        L36:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "in"
            r3.<init>(r4)
            throw r3
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public void close() throws java.lang.Exception {
            r1 = this;
            r0 = 1
            r1.closed = r0
            java.io.PushbackInputStream r0 = r1.in
            r0.close()
            return
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public boolean isEndOfInput() throws java.lang.Exception {
            r2 = this;
            boolean r0 = r2.closed
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.io.PushbackInputStream r0 = r2.in
            int r0 = r0.read()
            if (r0 >= 0) goto Lf
            return r1
        Lf:
            java.io.PushbackInputStream r1 = r2.in
            r1.unread(r0)
            r0 = 0
            return r0
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
    public io.netty.buffer.ByteBuf readChunk(io.netty.buffer.ByteBufAllocator r6) throws java.lang.Exception {
            r5 = this;
            boolean r0 = r5.isEndOfInput()
            if (r0 == 0) goto L8
            r6 = 0
            return r6
        L8:
            java.io.PushbackInputStream r0 = r5.in
            int r0 = r0.available()
            if (r0 > 0) goto L13
            int r0 = r5.chunkSize
            goto L1f
        L13:
            int r0 = r5.chunkSize
            java.io.PushbackInputStream r1 = r5.in
            int r1 = r1.available()
            int r0 = java.lang.Math.min(r0, r1)
        L1f:
            io.netty.buffer.ByteBuf r6 = r6.buffer(r0)
            long r1 = r5.offset     // Catch: java.lang.Throwable -> L30
            java.io.PushbackInputStream r3 = r5.in     // Catch: java.lang.Throwable -> L30
            int r0 = r6.writeBytes(r3, r0)     // Catch: java.lang.Throwable -> L30
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L30
            long r1 = r1 + r3
            r5.offset = r1     // Catch: java.lang.Throwable -> L30
            return r6
        L30:
            r0 = move-exception
            r6.release()
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
