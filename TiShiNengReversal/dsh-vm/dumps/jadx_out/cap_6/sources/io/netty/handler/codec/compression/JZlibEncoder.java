package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class JZlibEncoder extends io.netty.handler.codec.compression.ZlibEncoder {
    private volatile io.netty.channel.ChannelHandlerContext ctx;
    private volatile boolean finished;
    private final int wrapperOverhead;
    private final com.jcraft.jzlib.Deflater z;




    public JZlibEncoder() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public JZlibEncoder(int r2) {
            r1 = this;
            io.netty.handler.codec.compression.ZlibWrapper r0 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            r1.<init>(r0, r2)
            return
    }

    public JZlibEncoder(int r4, int r5, int r6, byte[] r7) {
            r3 = this;
            r3.<init>()
            com.jcraft.jzlib.Deflater r0 = new com.jcraft.jzlib.Deflater
            r0.<init>()
            r3.z = r0
            if (r4 < 0) goto L80
            r1 = 9
            if (r4 > r1) goto L80
            if (r5 < r1) goto L64
            r2 = 15
            if (r5 > r2) goto L64
            r2 = 1
            if (r6 < r2) goto L48
            if (r6 > r1) goto L48
            if (r7 == 0) goto L40
            com.jcraft.jzlib.JZlib$WrapperType r1 = com.jcraft.jzlib.JZlib.W_ZLIB
            int r4 = r0.deflateInit(r4, r5, r6, r1)
            if (r4 == 0) goto L2b
            java.lang.String r5 = "initialization failure"
            io.netty.handler.codec.compression.ZlibUtil.fail(r0, r5, r4)
            goto L37
        L2b:
            int r4 = r7.length
            int r4 = r0.deflateSetDictionary(r7, r4)
            if (r4 == 0) goto L37
            java.lang.String r5 = "failed to set the dictionary"
            io.netty.handler.codec.compression.ZlibUtil.fail(r0, r5, r4)
        L37:
            io.netty.handler.codec.compression.ZlibWrapper r4 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB
            int r4 = io.netty.handler.codec.compression.ZlibUtil.wrapperOverhead(r4)
            r3.wrapperOverhead = r4
            return
        L40:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "dictionary"
            r4.<init>(r5)
            throw r4
        L48:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "memLevel: "
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = " (expected: 1-9)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L64:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "windowBits: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = " (expected: 9-15)"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L80:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "compressionLevel: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = " (expected: 0-9)"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    public JZlibEncoder(int r3, byte[] r4) {
            r2 = this;
            r0 = 15
            r1 = 8
            r2.<init>(r3, r0, r1, r4)
            return
    }

    public JZlibEncoder(io.netty.handler.codec.compression.ZlibWrapper r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r2, r0)
            return
    }

    public JZlibEncoder(io.netty.handler.codec.compression.ZlibWrapper r3, int r4) {
            r2 = this;
            r0 = 15
            r1 = 8
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public JZlibEncoder(io.netty.handler.codec.compression.ZlibWrapper r4, int r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            com.jcraft.jzlib.Deflater r0 = new com.jcraft.jzlib.Deflater
            r0.<init>()
            r3.z = r0
            if (r5 < 0) goto L93
            r1 = 9
            if (r5 > r1) goto L93
            if (r6 < r1) goto L77
            r2 = 15
            if (r6 > r2) goto L77
            r2 = 1
            if (r7 < r2) goto L5b
            if (r7 > r1) goto L5b
            if (r4 == 0) goto L53
            io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB_OR_NONE
            if (r4 == r1) goto L37
            com.jcraft.jzlib.JZlib$WrapperType r1 = io.netty.handler.codec.compression.ZlibUtil.convertWrapperType(r4)
            int r5 = r0.init(r5, r6, r7, r1)
            if (r5 == 0) goto L30
            java.lang.String r6 = "initialization failure"
            io.netty.handler.codec.compression.ZlibUtil.fail(r0, r6, r5)
        L30:
            int r4 = io.netty.handler.codec.compression.ZlibUtil.wrapperOverhead(r4)
            r3.wrapperOverhead = r4
            return
        L37:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "wrapper '"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = "' is not allowed for compression."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L53:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "wrapper"
            r4.<init>(r5)
            throw r4
        L5b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "memLevel: "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = " (expected: 1-9)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L77:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "windowBits: "
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = " (expected: 9-15)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L93:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "compressionLevel: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = " (expected: 0-9)"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    public JZlibEncoder(byte[] r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r0, r2)
            return
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$000(io.netty.handler.codec.compression.JZlibEncoder r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx()
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelFuture access$100(io.netty.handler.codec.compression.JZlibEncoder r0, io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) {
            io.netty.channel.ChannelFuture r0 = r0.finishEncode(r1, r2)
            return r0
    }

    private io.netty.channel.ChannelHandlerContext ctx() {
            r2 = this;
            io.netty.channel.ChannelHandlerContext r0 = r2.ctx
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "not added to a pipeline"
            r0.<init>(r1)
            throw r0
    }

    private io.netty.channel.ChannelFuture finishEncode(io.netty.channel.ChannelHandlerContext r7, io.netty.channel.ChannelPromise r8) {
            r6 = this;
            boolean r0 = r6.finished
            if (r0 == 0) goto L8
            r8.setSuccess()
            return r8
        L8:
            r0 = 1
            r6.finished = r0
            r1 = 0
            com.jcraft.jzlib.Deflater r2 = r6.z     // Catch: java.lang.Throwable -> L4f
            byte[] r3 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES     // Catch: java.lang.Throwable -> L4f
            r2.next_in = r3     // Catch: java.lang.Throwable -> L4f
            com.jcraft.jzlib.Deflater r2 = r6.z     // Catch: java.lang.Throwable -> L4f
            r3 = 0
            r2.next_in_index = r3     // Catch: java.lang.Throwable -> L4f
            com.jcraft.jzlib.Deflater r2 = r6.z     // Catch: java.lang.Throwable -> L4f
            r2.avail_in = r3     // Catch: java.lang.Throwable -> L4f
            r2 = 32
            byte[] r4 = new byte[r2]     // Catch: java.lang.Throwable -> L4f
            com.jcraft.jzlib.Deflater r5 = r6.z     // Catch: java.lang.Throwable -> L4f
            r5.next_out = r4     // Catch: java.lang.Throwable -> L4f
            com.jcraft.jzlib.Deflater r5 = r6.z     // Catch: java.lang.Throwable -> L4f
            r5.next_out_index = r3     // Catch: java.lang.Throwable -> L4f
            com.jcraft.jzlib.Deflater r5 = r6.z     // Catch: java.lang.Throwable -> L4f
            r5.avail_out = r2     // Catch: java.lang.Throwable -> L4f
            com.jcraft.jzlib.Deflater r2 = r6.z     // Catch: java.lang.Throwable -> L4f
            r5 = 4
            int r2 = r2.deflate(r5)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L51
            if (r2 == r0) goto L51
            com.jcraft.jzlib.Deflater r7 = r6.z     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "compression failure"
            io.netty.handler.codec.compression.CompressionException r7 = io.netty.handler.codec.compression.ZlibUtil.deflaterException(r7, r0, r2)     // Catch: java.lang.Throwable -> L4f
            r8.setFailure(r7)     // Catch: java.lang.Throwable -> L4f
            com.jcraft.jzlib.Deflater r7 = r6.z
            r7.deflateEnd()
            com.jcraft.jzlib.Deflater r7 = r6.z
            r7.next_in = r1
            com.jcraft.jzlib.Deflater r7 = r6.z
            r7.next_out = r1
            return r8
        L4f:
            r7 = move-exception
            goto L74
        L51:
            com.jcraft.jzlib.Deflater r0 = r6.z     // Catch: java.lang.Throwable -> L4f
            int r0 = r0.next_out_index     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L60
            com.jcraft.jzlib.Deflater r0 = r6.z     // Catch: java.lang.Throwable -> L4f
            int r0 = r0.next_out_index     // Catch: java.lang.Throwable -> L4f
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.wrappedBuffer(r4, r3, r0)     // Catch: java.lang.Throwable -> L4f
            goto L62
        L60:
            io.netty.buffer.ByteBuf r0 = io.netty.buffer.Unpooled.EMPTY_BUFFER     // Catch: java.lang.Throwable -> L4f
        L62:
            com.jcraft.jzlib.Deflater r2 = r6.z
            r2.deflateEnd()
            com.jcraft.jzlib.Deflater r2 = r6.z
            r2.next_in = r1
            com.jcraft.jzlib.Deflater r2 = r6.z
            r2.next_out = r1
            io.netty.channel.ChannelFuture r7 = r7.writeAndFlush(r0, r8)
            return r7
        L74:
            com.jcraft.jzlib.Deflater r8 = r6.z
            r8.deflateEnd()
            com.jcraft.jzlib.Deflater r8 = r6.z
            r8.next_in = r1
            com.jcraft.jzlib.Deflater r8 = r6.z
            r8.next_out = r1
            throw r7
    }

    @Override // io.netty.handler.codec.compression.ZlibEncoder
    public io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx()
            io.netty.channel.Channel r0 = r0.channel()
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.close(r0)
            return r0
    }

    @Override // io.netty.handler.codec.compression.ZlibEncoder
    public io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            io.netty.channel.ChannelHandlerContext r0 = r3.ctx()
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L13
            io.netty.channel.ChannelFuture r4 = r3.finishEncode(r0, r4)
            return r4
        L13:
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            io.netty.handler.codec.compression.JZlibEncoder$1 r2 = new io.netty.handler.codec.compression.JZlibEncoder$1
            r2.<init>(r3, r0, r4)
            r1.execute(r2)
            return r0
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r4, io.netty.channel.ChannelPromise r5) {
            r3 = this;
            io.netty.channel.ChannelPromise r0 = r4.newPromise()
            io.netty.channel.ChannelFuture r0 = r3.finishEncode(r4, r0)
            io.netty.handler.codec.compression.JZlibEncoder$2 r1 = new io.netty.handler.codec.compression.JZlibEncoder$2
            r1.<init>(r3, r4, r5)
            r0.addListener(r1)
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L26
            io.netty.util.concurrent.EventExecutor r0 = r4.executor()
            io.netty.handler.codec.compression.JZlibEncoder$3 r1 = new io.netty.handler.codec.compression.JZlibEncoder$3
            r1.<init>(r3, r4, r5)
            r4 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0.schedule(r1, r4, r2)
        L26:
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r7, io.netty.buffer.ByteBuf r8, io.netty.buffer.ByteBuf r9) throws java.lang.Exception {
            r6 = this;
            boolean r7 = r6.finished
            if (r7 == 0) goto L8
            r9.writeBytes(r8)
            return
        L8:
            int r7 = r8.readableBytes()
            if (r7 != 0) goto Lf
            return
        Lf:
            r0 = 0
            boolean r1 = r8.hasArray()     // Catch: java.lang.Throwable -> L30
            com.jcraft.jzlib.Deflater r2 = r6.z     // Catch: java.lang.Throwable -> L30
            r2.avail_in = r7     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L33
            com.jcraft.jzlib.Deflater r1 = r6.z     // Catch: java.lang.Throwable -> L30
            byte[] r2 = r8.array()     // Catch: java.lang.Throwable -> L30
            r1.next_in = r2     // Catch: java.lang.Throwable -> L30
            com.jcraft.jzlib.Deflater r1 = r6.z     // Catch: java.lang.Throwable -> L30
            int r2 = r8.arrayOffset()     // Catch: java.lang.Throwable -> L30
            int r3 = r8.readerIndex()     // Catch: java.lang.Throwable -> L30
            int r2 = r2 + r3
            r1.next_in_index = r2     // Catch: java.lang.Throwable -> L30
            goto L45
        L30:
            r7 = move-exception
            goto Lb5
        L33:
            byte[] r1 = new byte[r7]     // Catch: java.lang.Throwable -> L30
            int r2 = r8.readerIndex()     // Catch: java.lang.Throwable -> L30
            r8.getBytes(r2, r1)     // Catch: java.lang.Throwable -> L30
            com.jcraft.jzlib.Deflater r2 = r6.z     // Catch: java.lang.Throwable -> L30
            r2.next_in = r1     // Catch: java.lang.Throwable -> L30
            com.jcraft.jzlib.Deflater r1 = r6.z     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r1.next_in_index = r2     // Catch: java.lang.Throwable -> L30
        L45:
            com.jcraft.jzlib.Deflater r1 = r6.z     // Catch: java.lang.Throwable -> L30
            int r1 = r1.next_in_index     // Catch: java.lang.Throwable -> L30
            double r2 = (double) r7     // Catch: java.lang.Throwable -> L30
            r4 = 4607186922399644778(0x3ff004189374bc6a, double:1.001)
            double r2 = r2 * r4
            double r2 = java.lang.Math.ceil(r2)     // Catch: java.lang.Throwable -> L30
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L30
            int r7 = r7 + 12
            int r2 = r6.wrapperOverhead     // Catch: java.lang.Throwable -> L30
            int r7 = r7 + r2
            r9.ensureWritable(r7)     // Catch: java.lang.Throwable -> L30
            com.jcraft.jzlib.Deflater r2 = r6.z     // Catch: java.lang.Throwable -> L30
            r2.avail_out = r7     // Catch: java.lang.Throwable -> L30
            com.jcraft.jzlib.Deflater r7 = r6.z     // Catch: java.lang.Throwable -> L30
            byte[] r2 = r9.array()     // Catch: java.lang.Throwable -> L30
            r7.next_out = r2     // Catch: java.lang.Throwable -> L30
            com.jcraft.jzlib.Deflater r7 = r6.z     // Catch: java.lang.Throwable -> L30
            int r2 = r9.arrayOffset()     // Catch: java.lang.Throwable -> L30
            int r3 = r9.writerIndex()     // Catch: java.lang.Throwable -> L30
            int r2 = r2 + r3
            r7.next_out_index = r2     // Catch: java.lang.Throwable -> L30
            com.jcraft.jzlib.Deflater r7 = r6.z     // Catch: java.lang.Throwable -> L30
            int r7 = r7.next_out_index     // Catch: java.lang.Throwable -> L30
            com.jcraft.jzlib.Deflater r2 = r6.z     // Catch: java.lang.Throwable -> Lab
            r3 = 2
            int r2 = r2.deflate(r3)     // Catch: java.lang.Throwable -> Lab
            com.jcraft.jzlib.Deflater r3 = r6.z     // Catch: java.lang.Throwable -> L30
            int r3 = r3.next_in_index     // Catch: java.lang.Throwable -> L30
            int r3 = r3 - r1
            r8.skipBytes(r3)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L93
            com.jcraft.jzlib.Deflater r8 = r6.z     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "compression failure"
            io.netty.handler.codec.compression.ZlibUtil.fail(r8, r1, r2)     // Catch: java.lang.Throwable -> L30
        L93:
            com.jcraft.jzlib.Deflater r8 = r6.z     // Catch: java.lang.Throwable -> L30
            int r8 = r8.next_out_index     // Catch: java.lang.Throwable -> L30
            int r8 = r8 - r7
            if (r8 <= 0) goto La2
            int r7 = r9.writerIndex()     // Catch: java.lang.Throwable -> L30
            int r7 = r7 + r8
            r9.writerIndex(r7)     // Catch: java.lang.Throwable -> L30
        La2:
            com.jcraft.jzlib.Deflater r7 = r6.z
            r7.next_in = r0
            com.jcraft.jzlib.Deflater r7 = r6.z
            r7.next_out = r0
            return
        Lab:
            r7 = move-exception
            com.jcraft.jzlib.Deflater r9 = r6.z     // Catch: java.lang.Throwable -> L30
            int r9 = r9.next_in_index     // Catch: java.lang.Throwable -> L30
            int r9 = r9 - r1
            r8.skipBytes(r9)     // Catch: java.lang.Throwable -> L30
            throw r7     // Catch: java.lang.Throwable -> L30
        Lb5:
            com.jcraft.jzlib.Deflater r8 = r6.z
            r8.next_in = r0
            com.jcraft.jzlib.Deflater r8 = r6.z
            r8.next_out = r0
            throw r7
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.buffer.ByteBuf r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBuf r2 = (io.netty.buffer.ByteBuf) r2
            r0.encode2(r1, r2, r3)
            return
    }

    @Override // io.netty.channel.ChannelHandlerAdapter, io.netty.channel.ChannelHandler
    public void handlerAdded(io.netty.channel.ChannelHandlerContext r1) throws java.lang.Exception {
            r0 = this;
            r0.ctx = r1
            return
    }

    @Override // io.netty.handler.codec.compression.ZlibEncoder
    public boolean isClosed() {
            r1 = this;
            boolean r0 = r1.finished
            return r0
    }
}
