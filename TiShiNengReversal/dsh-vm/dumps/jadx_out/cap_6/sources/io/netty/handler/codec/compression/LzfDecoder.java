package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class LzfDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private static final short MAGIC_NUMBER = 23126;
    private int chunkLength;
    private io.netty.handler.codec.compression.LzfDecoder.State currentState;
    private com.ning.compress.lzf.ChunkDecoder decoder;
    private boolean isCompressed;
    private int originalLength;
    private com.ning.compress.BufferRecycler recycler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.LzfDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State = null;

        static {
                io.netty.handler.codec.compression.LzfDecoder$State[] r0 = io.netty.handler.codec.compression.LzfDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.LzfDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State = r0
                io.netty.handler.codec.compression.LzfDecoder$State r1 = io.netty.handler.codec.compression.LzfDecoder.State.INIT_BLOCK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.compression.LzfDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.LzfDecoder$State r1 = io.netty.handler.codec.compression.LzfDecoder.State.INIT_ORIGINAL_LENGTH     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.compression.LzfDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.compression.LzfDecoder$State r1 = io.netty.handler.codec.compression.LzfDecoder.State.DECOMPRESS_DATA     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.compression.LzfDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.compression.LzfDecoder$State r1 = io.netty.handler.codec.compression.LzfDecoder.State.CORRUPTED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.handler.codec.compression.LzfDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.compression.LzfDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.compression.LzfDecoder.State CORRUPTED = null;
        public static final io.netty.handler.codec.compression.LzfDecoder.State DECOMPRESS_DATA = null;
        public static final io.netty.handler.codec.compression.LzfDecoder.State INIT_BLOCK = null;
        public static final io.netty.handler.codec.compression.LzfDecoder.State INIT_ORIGINAL_LENGTH = null;

        static {
                io.netty.handler.codec.compression.LzfDecoder$State r0 = new io.netty.handler.codec.compression.LzfDecoder$State
                java.lang.String r1 = "INIT_BLOCK"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.compression.LzfDecoder.State.INIT_BLOCK = r0
                io.netty.handler.codec.compression.LzfDecoder$State r1 = new io.netty.handler.codec.compression.LzfDecoder$State
                java.lang.String r3 = "INIT_ORIGINAL_LENGTH"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.compression.LzfDecoder.State.INIT_ORIGINAL_LENGTH = r1
                io.netty.handler.codec.compression.LzfDecoder$State r3 = new io.netty.handler.codec.compression.LzfDecoder$State
                java.lang.String r5 = "DECOMPRESS_DATA"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.compression.LzfDecoder.State.DECOMPRESS_DATA = r3
                io.netty.handler.codec.compression.LzfDecoder$State r5 = new io.netty.handler.codec.compression.LzfDecoder$State
                java.lang.String r7 = "CORRUPTED"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.compression.LzfDecoder.State.CORRUPTED = r5
                r7 = 4
                io.netty.handler.codec.compression.LzfDecoder$State[] r7 = new io.netty.handler.codec.compression.LzfDecoder.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.netty.handler.codec.compression.LzfDecoder.State.$VALUES = r7
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.compression.LzfDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.compression.LzfDecoder$State> r0 = io.netty.handler.codec.compression.LzfDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.compression.LzfDecoder$State r1 = (io.netty.handler.codec.compression.LzfDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.compression.LzfDecoder.State[] values() {
                io.netty.handler.codec.compression.LzfDecoder$State[] r0 = io.netty.handler.codec.compression.LzfDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.compression.LzfDecoder$State[] r0 = (io.netty.handler.codec.compression.LzfDecoder.State[]) r0
                return r0
        }
    }

    public LzfDecoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public LzfDecoder(boolean r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.compression.LzfDecoder$State r0 = io.netty.handler.codec.compression.LzfDecoder.State.INIT_BLOCK
            r1.currentState = r0
            if (r2 == 0) goto Le
            com.ning.compress.lzf.ChunkDecoder r2 = com.ning.compress.lzf.util.ChunkDecoderFactory.safeInstance()
            goto L12
        Le:
            com.ning.compress.lzf.ChunkDecoder r2 = com.ning.compress.lzf.util.ChunkDecoderFactory.optimalInstance()
        L12:
            r1.decoder = r2
            com.ning.compress.BufferRecycler r2 = com.ning.compress.BufferRecycler.instance()
            r1.recycler = r2
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r12, io.netty.buffer.ByteBuf r13, java.util.List<java.lang.Object> r14) throws java.lang.Exception {
            r11 = this;
            int[] r0 = io.netty.handler.codec.compression.LzfDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State     // Catch: java.lang.Exception -> L1f
            io.netty.handler.codec.compression.LzfDecoder$State r1 = r11.currentState     // Catch: java.lang.Exception -> L1f
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L1f
            r0 = r0[r1]     // Catch: java.lang.Exception -> L1f
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L29
            if (r0 == r2) goto L77
            if (r0 == r1) goto L88
            r12 = 4
            if (r0 != r12) goto L23
            int r12 = r13.readableBytes()     // Catch: java.lang.Exception -> L1f
            r13.skipBytes(r12)     // Catch: java.lang.Exception -> L1f
            return
        L1f:
            r0 = move-exception
            r12 = r0
            goto L10b
        L23:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L1f
            r12.<init>()     // Catch: java.lang.Exception -> L1f
            throw r12     // Catch: java.lang.Exception -> L1f
        L29:
            int r0 = r13.readableBytes()     // Catch: java.lang.Exception -> L1f
            r5 = 5
            if (r0 >= r5) goto L31
            goto L90
        L31:
            int r0 = r13.readUnsignedShort()     // Catch: java.lang.Exception -> L1f
            r5 = 23126(0x5a56, float:3.2406E-41)
            if (r0 != r5) goto L103
            byte r0 = r13.readByte()     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L68
            if (r0 != r4) goto L48
            r11.isCompressed = r4     // Catch: java.lang.Exception -> L1f
            io.netty.handler.codec.compression.LzfDecoder$State r1 = io.netty.handler.codec.compression.LzfDecoder.State.INIT_ORIGINAL_LENGTH     // Catch: java.lang.Exception -> L1f
            r11.currentState = r1     // Catch: java.lang.Exception -> L1f
            goto L6e
        L48:
            io.netty.handler.codec.compression.DecompressionException r12 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L1f
            java.lang.String r13 = "unknown type of chunk: %d (expected: %d or %d)"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1f
            r1[r3] = r14     // Catch: java.lang.Exception -> L1f
            r1[r4] = r0     // Catch: java.lang.Exception -> L1f
            r1[r2] = r5     // Catch: java.lang.Exception -> L1f
            java.lang.String r13 = java.lang.String.format(r13, r1)     // Catch: java.lang.Exception -> L1f
            r12.<init>(r13)     // Catch: java.lang.Exception -> L1f
            throw r12     // Catch: java.lang.Exception -> L1f
        L68:
            r11.isCompressed = r3     // Catch: java.lang.Exception -> L1f
            io.netty.handler.codec.compression.LzfDecoder$State r1 = io.netty.handler.codec.compression.LzfDecoder.State.DECOMPRESS_DATA     // Catch: java.lang.Exception -> L1f
            r11.currentState = r1     // Catch: java.lang.Exception -> L1f
        L6e:
            int r1 = r13.readUnsignedShort()     // Catch: java.lang.Exception -> L1f
            r11.chunkLength = r1     // Catch: java.lang.Exception -> L1f
            if (r0 == r4) goto L77
            goto L90
        L77:
            int r0 = r13.readableBytes()     // Catch: java.lang.Exception -> L1f
            if (r0 >= r2) goto L7e
            goto L90
        L7e:
            int r0 = r13.readUnsignedShort()     // Catch: java.lang.Exception -> L1f
            r11.originalLength = r0     // Catch: java.lang.Exception -> L1f
            io.netty.handler.codec.compression.LzfDecoder$State r0 = io.netty.handler.codec.compression.LzfDecoder.State.DECOMPRESS_DATA     // Catch: java.lang.Exception -> L1f
            r11.currentState = r0     // Catch: java.lang.Exception -> L1f
        L88:
            int r0 = r11.chunkLength     // Catch: java.lang.Exception -> L1f
            int r1 = r13.readableBytes()     // Catch: java.lang.Exception -> L1f
            if (r1 >= r0) goto L91
        L90:
            return
        L91:
            int r1 = r11.originalLength     // Catch: java.lang.Exception -> L1f
            boolean r2 = r11.isCompressed     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto Lf5
            int r2 = r13.readerIndex()     // Catch: java.lang.Exception -> L1f
            boolean r4 = r13.hasArray()     // Catch: java.lang.Exception -> L1f
            if (r4 == 0) goto Lad
            byte[] r3 = r13.array()     // Catch: java.lang.Exception -> L1f
            int r4 = r13.arrayOffset()     // Catch: java.lang.Exception -> L1f
            int r2 = r2 + r4
            r7 = r2
            r6 = r3
            goto Lb8
        Lad:
            com.ning.compress.BufferRecycler r4 = r11.recycler     // Catch: java.lang.Exception -> L1f
            byte[] r4 = r4.allocInputBuffer(r0)     // Catch: java.lang.Exception -> L1f
            r13.getBytes(r2, r4, r3, r0)     // Catch: java.lang.Exception -> L1f
            r6 = r4
            r7 = 0
        Lb8:
            io.netty.buffer.ByteBufAllocator r12 = r12.alloc()     // Catch: java.lang.Exception -> L1f
            io.netty.buffer.ByteBuf r12 = r12.heapBuffer(r1, r1)     // Catch: java.lang.Exception -> L1f
            byte[] r8 = r12.array()     // Catch: java.lang.Exception -> L1f
            int r2 = r12.arrayOffset()     // Catch: java.lang.Exception -> L1f
            int r3 = r12.writerIndex()     // Catch: java.lang.Exception -> L1f
            int r9 = r2 + r3
            com.ning.compress.lzf.ChunkDecoder r5 = r11.decoder     // Catch: java.lang.Throwable -> Lef
            int r10 = r9 + r1
            r5.decodeChunk(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lef
            int r2 = r12.writerIndex()     // Catch: java.lang.Throwable -> Lef
            int r2 = r2 + r1
            r12.writerIndex(r2)     // Catch: java.lang.Throwable -> Lef
            r14.add(r12)     // Catch: java.lang.Throwable -> Lef
            r13.skipBytes(r0)     // Catch: java.lang.Throwable -> Lef
            boolean r12 = r13.hasArray()     // Catch: java.lang.Exception -> L1f
            if (r12 != 0) goto Lfe
            com.ning.compress.BufferRecycler r12 = r11.recycler     // Catch: java.lang.Exception -> L1f
            r12.releaseInputBuffer(r6)     // Catch: java.lang.Exception -> L1f
            goto Lfe
        Lef:
            r0 = move-exception
            r13 = r0
            r12.release()     // Catch: java.lang.Exception -> L1f
            throw r13     // Catch: java.lang.Exception -> L1f
        Lf5:
            if (r0 <= 0) goto Lfe
            io.netty.buffer.ByteBuf r12 = r13.readRetainedSlice(r0)     // Catch: java.lang.Exception -> L1f
            r14.add(r12)     // Catch: java.lang.Exception -> L1f
        Lfe:
            io.netty.handler.codec.compression.LzfDecoder$State r12 = io.netty.handler.codec.compression.LzfDecoder.State.INIT_BLOCK     // Catch: java.lang.Exception -> L1f
            r11.currentState = r12     // Catch: java.lang.Exception -> L1f
            return
        L103:
            io.netty.handler.codec.compression.DecompressionException r12 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L1f
            java.lang.String r13 = "unexpected block identifier"
            r12.<init>(r13)     // Catch: java.lang.Exception -> L1f
            throw r12     // Catch: java.lang.Exception -> L1f
        L10b:
            io.netty.handler.codec.compression.LzfDecoder$State r13 = io.netty.handler.codec.compression.LzfDecoder.State.CORRUPTED
            r11.currentState = r13
            r13 = 0
            r11.decoder = r13
            r11.recycler = r13
            throw r12
    }
}
