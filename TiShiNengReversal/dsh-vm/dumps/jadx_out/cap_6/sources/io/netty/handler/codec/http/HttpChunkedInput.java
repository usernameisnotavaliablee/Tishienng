package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HttpChunkedInput implements io.netty.handler.stream.ChunkedInput<io.netty.handler.codec.http.HttpContent> {
    private final io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> input;
    private final io.netty.handler.codec.http.LastHttpContent lastHttpContent;
    private boolean sentLastChunk;

    public HttpChunkedInput(io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r1) {
            r0 = this;
            r0.<init>()
            r0.input = r1
            io.netty.handler.codec.http.LastHttpContent r1 = io.netty.handler.codec.http.LastHttpContent.EMPTY_LAST_CONTENT
            r0.lastHttpContent = r1
            return
    }

    public HttpChunkedInput(io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r1, io.netty.handler.codec.http.LastHttpContent r2) {
            r0 = this;
            r0.<init>()
            r0.input = r1
            r0.lastHttpContent = r2
            return
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public void close() throws java.lang.Exception {
            r1 = this;
            io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r0 = r1.input
            r0.close()
            return
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public boolean isEndOfInput() throws java.lang.Exception {
            r1 = this;
            io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r0 = r1.input
            boolean r0 = r0.isEndOfInput()
            if (r0 == 0) goto Lb
            boolean r0 = r1.sentLastChunk
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long length() {
            r2 = this;
            io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r0 = r2.input
            long r0 = r0.length()
            return r0
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long progress() {
            r2 = this;
            io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r0 = r2.input
            long r0 = r0.progress()
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    public io.netty.handler.codec.http.HttpContent readChunk(io.netty.buffer.ByteBufAllocator r3) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r0 = r2.input
            boolean r0 = r0.isEndOfInput()
            r1 = 0
            if (r0 == 0) goto L14
            boolean r3 = r2.sentLastChunk
            if (r3 == 0) goto Le
            return r1
        Le:
            r3 = 1
            r2.sentLastChunk = r3
            io.netty.handler.codec.http.LastHttpContent r3 = r2.lastHttpContent
            return r3
        L14:
            io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r0 = r2.input
            java.lang.Object r3 = r0.readChunk(r3)
            io.netty.buffer.ByteBuf r3 = (io.netty.buffer.ByteBuf) r3
            if (r3 != 0) goto L1f
            return r1
        L1f:
            io.netty.handler.codec.http.DefaultHttpContent r0 = new io.netty.handler.codec.http.DefaultHttpContent
            r0.<init>(r3)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    @java.lang.Deprecated
    public io.netty.handler.codec.http.HttpContent readChunk(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.handler.codec.http.HttpContent r1 = r0.readChunk(r1)
            return r1
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent readChunk(io.netty.buffer.ByteBufAllocator r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = r0.readChunk(r1)
            return r1
    }

    @Override // io.netty.handler.stream.ChunkedInput
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.HttpContent readChunk(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.HttpContent r1 = r0.readChunk(r1)
            return r1
    }
}
