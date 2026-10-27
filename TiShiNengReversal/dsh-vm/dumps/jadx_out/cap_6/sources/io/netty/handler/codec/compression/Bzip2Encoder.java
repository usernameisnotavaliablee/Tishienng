package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Bzip2Encoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.buffer.ByteBuf> {
    private io.netty.handler.codec.compression.Bzip2BlockCompressor blockCompressor;
    private volatile io.netty.channel.ChannelHandlerContext ctx;
    private io.netty.handler.codec.compression.Bzip2Encoder.State currentState;
    private volatile boolean finished;
    private final int streamBlockSize;
    private int streamCRC;
    private final io.netty.handler.codec.compression.Bzip2BitWriter writer;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.Bzip2Encoder$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$Bzip2Encoder$State = null;

        static {
                io.netty.handler.codec.compression.Bzip2Encoder$State[] r0 = io.netty.handler.codec.compression.Bzip2Encoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.Bzip2Encoder.AnonymousClass4.$SwitchMap$io$netty$handler$codec$compression$Bzip2Encoder$State = r0
                io.netty.handler.codec.compression.Bzip2Encoder$State r1 = io.netty.handler.codec.compression.Bzip2Encoder.State.INIT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Encoder.AnonymousClass4.$SwitchMap$io$netty$handler$codec$compression$Bzip2Encoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.Bzip2Encoder$State r1 = io.netty.handler.codec.compression.Bzip2Encoder.State.INIT_BLOCK     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Encoder.AnonymousClass4.$SwitchMap$io$netty$handler$codec$compression$Bzip2Encoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.compression.Bzip2Encoder$State r1 = io.netty.handler.codec.compression.Bzip2Encoder.State.WRITE_DATA     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Encoder.AnonymousClass4.$SwitchMap$io$netty$handler$codec$compression$Bzip2Encoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.compression.Bzip2Encoder$State r1 = io.netty.handler.codec.compression.Bzip2Encoder.State.CLOSE_BLOCK     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass4() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.handler.codec.compression.Bzip2Encoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.compression.Bzip2Encoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.compression.Bzip2Encoder.State CLOSE_BLOCK = null;
        public static final io.netty.handler.codec.compression.Bzip2Encoder.State INIT = null;
        public static final io.netty.handler.codec.compression.Bzip2Encoder.State INIT_BLOCK = null;
        public static final io.netty.handler.codec.compression.Bzip2Encoder.State WRITE_DATA = null;

        static {
                io.netty.handler.codec.compression.Bzip2Encoder$State r0 = new io.netty.handler.codec.compression.Bzip2Encoder$State
                java.lang.String r1 = "INIT"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.compression.Bzip2Encoder.State.INIT = r0
                io.netty.handler.codec.compression.Bzip2Encoder$State r1 = new io.netty.handler.codec.compression.Bzip2Encoder$State
                java.lang.String r3 = "INIT_BLOCK"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.compression.Bzip2Encoder.State.INIT_BLOCK = r1
                io.netty.handler.codec.compression.Bzip2Encoder$State r3 = new io.netty.handler.codec.compression.Bzip2Encoder$State
                java.lang.String r5 = "WRITE_DATA"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.compression.Bzip2Encoder.State.WRITE_DATA = r3
                io.netty.handler.codec.compression.Bzip2Encoder$State r5 = new io.netty.handler.codec.compression.Bzip2Encoder$State
                java.lang.String r7 = "CLOSE_BLOCK"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.compression.Bzip2Encoder.State.CLOSE_BLOCK = r5
                r7 = 4
                io.netty.handler.codec.compression.Bzip2Encoder$State[] r7 = new io.netty.handler.codec.compression.Bzip2Encoder.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.netty.handler.codec.compression.Bzip2Encoder.State.$VALUES = r7
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.compression.Bzip2Encoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.compression.Bzip2Encoder$State> r0 = io.netty.handler.codec.compression.Bzip2Encoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.compression.Bzip2Encoder$State r1 = (io.netty.handler.codec.compression.Bzip2Encoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.compression.Bzip2Encoder.State[] values() {
                io.netty.handler.codec.compression.Bzip2Encoder$State[] r0 = io.netty.handler.codec.compression.Bzip2Encoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.compression.Bzip2Encoder$State[] r0 = (io.netty.handler.codec.compression.Bzip2Encoder.State[]) r0
                return r0
        }
    }

    public Bzip2Encoder() {
            r1 = this;
            r0 = 9
            r1.<init>(r0)
            return
    }

    public Bzip2Encoder(int r4) {
            r3 = this;
            r3.<init>()
            io.netty.handler.codec.compression.Bzip2Encoder$State r0 = io.netty.handler.codec.compression.Bzip2Encoder.State.INIT
            r3.currentState = r0
            io.netty.handler.codec.compression.Bzip2BitWriter r0 = new io.netty.handler.codec.compression.Bzip2BitWriter
            r0.<init>()
            r3.writer = r0
            r0 = 1
            if (r4 < r0) goto L1d
            r0 = 9
            if (r4 > r0) goto L1d
            r0 = 100000(0x186a0, float:1.4013E-40)
            int r4 = r4 * r0
            r3.streamBlockSize = r4
            return
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "blockSizeMultiplier: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (expected: 1-9)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    static /* synthetic */ io.netty.channel.ChannelHandlerContext access$000(io.netty.handler.codec.compression.Bzip2Encoder r0) {
            io.netty.channel.ChannelHandlerContext r0 = r0.ctx()
            return r0
    }

    static /* synthetic */ io.netty.channel.ChannelFuture access$100(io.netty.handler.codec.compression.Bzip2Encoder r0, io.netty.channel.ChannelHandlerContext r1, io.netty.channel.ChannelPromise r2) {
            io.netty.channel.ChannelFuture r0 = r0.finishEncode(r1, r2)
            return r0
    }

    private void closeBlock(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.compression.Bzip2BlockCompressor r0 = r2.blockCompressor
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L19
            r0.close(r3)
            int r3 = r0.crc()
            int r0 = r2.streamCRC
            int r1 = r0 << 1
            int r0 = r0 >>> 31
            r0 = r0 | r1
            r3 = r3 ^ r0
            r2.streamCRC = r3
        L19:
            return
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

    private io.netty.channel.ChannelFuture finishEncode(io.netty.channel.ChannelHandlerContext r8, io.netty.channel.ChannelPromise r9) {
            r7 = this;
            boolean r0 = r7.finished
            if (r0 == 0) goto L8
            r9.setSuccess()
            return r9
        L8:
            r0 = 1
            r7.finished = r0
            io.netty.buffer.ByteBufAllocator r0 = r8.alloc()
            io.netty.buffer.ByteBuf r0 = r0.buffer()
            r7.closeBlock(r0)
            int r1 = r7.streamCRC
            io.netty.handler.codec.compression.Bzip2BitWriter r2 = r7.writer
            r3 = 1536581(0x177245, double:7.59172E-318)
            r5 = 0
            r6 = 24
            r2.writeBits(r0, r6, r3)     // Catch: java.lang.Throwable -> L36
            r3 = 3690640(0x385090, double:1.8234184E-317)
            r2.writeBits(r0, r6, r3)     // Catch: java.lang.Throwable -> L36
            r2.writeInt(r0, r1)     // Catch: java.lang.Throwable -> L36
            r2.flush(r0)     // Catch: java.lang.Throwable -> L36
            r7.blockCompressor = r5
            io.netty.channel.ChannelFuture r8 = r8.writeAndFlush(r0, r9)
            return r8
        L36:
            r8 = move-exception
            r7.blockCompressor = r5
            throw r8
    }

    public io.netty.channel.ChannelFuture close() {
            r1 = this;
            io.netty.channel.ChannelHandlerContext r0 = r1.ctx()
            io.netty.channel.ChannelPromise r0 = r0.newPromise()
            io.netty.channel.ChannelFuture r0 = r1.close(r0)
            return r0
    }

    public io.netty.channel.ChannelFuture close(io.netty.channel.ChannelPromise r4) {
            r3 = this;
            io.netty.channel.ChannelHandlerContext r0 = r3.ctx()
            io.netty.util.concurrent.EventExecutor r1 = r0.executor()
            boolean r2 = r1.inEventLoop()
            if (r2 == 0) goto L13
            io.netty.channel.ChannelFuture r4 = r3.finishEncode(r0, r4)
            return r4
        L13:
            io.netty.handler.codec.compression.Bzip2Encoder$1 r0 = new io.netty.handler.codec.compression.Bzip2Encoder$1
            r0.<init>(r3, r4)
            r1.execute(r0)
            return r4
    }

    @Override // io.netty.channel.ChannelOutboundHandlerAdapter, io.netty.channel.ChannelOutboundHandler
    public void close(io.netty.channel.ChannelHandlerContext r4, io.netty.channel.ChannelPromise r5) throws java.lang.Exception {
            r3 = this;
            io.netty.channel.ChannelPromise r0 = r4.newPromise()
            io.netty.channel.ChannelFuture r0 = r3.finishEncode(r4, r0)
            io.netty.handler.codec.compression.Bzip2Encoder$2 r1 = new io.netty.handler.codec.compression.Bzip2Encoder$2
            r1.<init>(r3, r4, r5)
            r0.addListener(r1)
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L26
            io.netty.util.concurrent.EventExecutor r0 = r4.executor()
            io.netty.handler.codec.compression.Bzip2Encoder$3 r1 = new io.netty.handler.codec.compression.Bzip2Encoder$3
            r1.<init>(r3, r4, r5)
            r4 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0.schedule(r1, r4, r2)
        L26:
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, io.netty.buffer.ByteBuf r5) throws java.lang.Exception {
            r2 = this;
            boolean r3 = r2.finished
            if (r3 == 0) goto L8
            r5.writeBytes(r4)
            return
        L8:
            int[] r3 = io.netty.handler.codec.compression.Bzip2Encoder.AnonymousClass4.$SwitchMap$io$netty$handler$codec$compression$Bzip2Encoder$State
            io.netty.handler.codec.compression.Bzip2Encoder$State r0 = r2.currentState
            int r0 = r0.ordinal()
            r3 = r3[r0]
            r0 = 1
            r1 = 4
            if (r3 == r0) goto L25
            r0 = 2
            if (r3 == r0) goto L3d
            r0 = 3
            if (r3 == r0) goto L4c
            if (r3 != r1) goto L1f
            goto L7e
        L1f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L25:
            r5.ensureWritable(r1)
            r3 = 4348520(0x425a68, float:6.093574E-39)
            r5.writeMedium(r3)
            int r3 = r2.streamBlockSize
            r0 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r3 / r0
            int r3 = r3 + 48
            r5.writeByte(r3)
            io.netty.handler.codec.compression.Bzip2Encoder$State r3 = io.netty.handler.codec.compression.Bzip2Encoder.State.INIT_BLOCK
            r2.currentState = r3
        L3d:
            io.netty.handler.codec.compression.Bzip2BlockCompressor r3 = new io.netty.handler.codec.compression.Bzip2BlockCompressor
            io.netty.handler.codec.compression.Bzip2BitWriter r0 = r2.writer
            int r1 = r2.streamBlockSize
            r3.<init>(r0, r1)
            r2.blockCompressor = r3
            io.netty.handler.codec.compression.Bzip2Encoder$State r3 = io.netty.handler.codec.compression.Bzip2Encoder.State.WRITE_DATA
            r2.currentState = r3
        L4c:
            boolean r3 = r4.isReadable()
            if (r3 != 0) goto L53
            goto L79
        L53:
            io.netty.handler.codec.compression.Bzip2BlockCompressor r3 = r2.blockCompressor
            int r0 = r4.readableBytes()
            int r1 = r3.availableSize()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r4.readerIndex()
            int r0 = r3.write(r4, r1, r0)
            r4.skipBytes(r0)
            boolean r3 = r3.isFull()
            if (r3 != 0) goto L7a
            boolean r3 = r4.isReadable()
            if (r3 == 0) goto L79
            goto L8
        L79:
            return
        L7a:
            io.netty.handler.codec.compression.Bzip2Encoder$State r3 = io.netty.handler.codec.compression.Bzip2Encoder.State.CLOSE_BLOCK
            r2.currentState = r3
        L7e:
            r2.closeBlock(r5)
            io.netty.handler.codec.compression.Bzip2Encoder$State r3 = io.netty.handler.codec.compression.Bzip2Encoder.State.INIT_BLOCK
            r2.currentState = r3
            goto L8
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

    public boolean isClosed() {
            r1 = this;
            boolean r0 = r1.finished
            return r0
    }
}
