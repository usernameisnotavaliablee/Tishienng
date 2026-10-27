package io.netty.handler.codec.http.websocketx;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class WebSocketChunkedInput implements io.netty.handler.stream.ChunkedInput<io.netty.handler.codec.http.websocketx.WebSocketFrame> {
    private final io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> input;
    private final int rsv;

    public WebSocketChunkedInput(io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public WebSocketChunkedInput(io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "input"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.stream.ChunkedInput r2 = (io.netty.handler.stream.ChunkedInput) r2
            r1.input = r2
            r1.rsv = r3
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
    public io.netty.handler.codec.http.websocketx.WebSocketFrame readChunk(io.netty.buffer.ByteBufAllocator r4) throws java.lang.Exception {
            r3 = this;
            io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r0 = r3.input
            java.lang.Object r4 = r0.readChunk(r4)
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            if (r4 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame r0 = new io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame
            io.netty.handler.stream.ChunkedInput<io.netty.buffer.ByteBuf> r1 = r3.input
            boolean r1 = r1.isEndOfInput()
            int r2 = r3.rsv
            r0.<init>(r1, r2, r4)
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    @java.lang.Deprecated
    public io.netty.handler.codec.http.websocketx.WebSocketFrame readChunk(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = r0.readChunk(r1)
            return r1
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame readChunk(io.netty.buffer.ByteBufAllocator r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = r0.readChunk(r1)
            return r1
    }

    @Override // io.netty.handler.stream.ChunkedInput
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ io.netty.handler.codec.http.websocketx.WebSocketFrame readChunk(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.http.websocketx.WebSocketFrame r1 = r0.readChunk(r1)
            return r1
    }
}
