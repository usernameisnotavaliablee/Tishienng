package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class FastLzFrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private final java.util.zip.Checksum checksum;
    private int chunkLength;
    private int currentChecksum;
    private io.netty.handler.codec.compression.FastLzFrameDecoder.State currentState;
    private boolean hasChecksum;
    private boolean isCompressed;
    private int originalLength;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.FastLzFrameDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State = null;

        static {
                io.netty.handler.codec.compression.FastLzFrameDecoder$State[] r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.FastLzFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State = r0
                io.netty.handler.codec.compression.FastLzFrameDecoder$State r1 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.INIT_BLOCK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.FastLzFrameDecoder$State r1 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.INIT_BLOCK_PARAMS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.compression.FastLzFrameDecoder$State r1 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.DECOMPRESS_DATA     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.compression.FastLzFrameDecoder$State r1 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.CORRUPTED     // Catch: java.lang.NoSuchFieldError -> L33
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
    private enum State extends java.lang.Enum<io.netty.handler.codec.compression.FastLzFrameDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.compression.FastLzFrameDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.compression.FastLzFrameDecoder.State CORRUPTED = null;
        public static final io.netty.handler.codec.compression.FastLzFrameDecoder.State DECOMPRESS_DATA = null;
        public static final io.netty.handler.codec.compression.FastLzFrameDecoder.State INIT_BLOCK = null;
        public static final io.netty.handler.codec.compression.FastLzFrameDecoder.State INIT_BLOCK_PARAMS = null;

        static {
                io.netty.handler.codec.compression.FastLzFrameDecoder$State r0 = new io.netty.handler.codec.compression.FastLzFrameDecoder$State
                java.lang.String r1 = "INIT_BLOCK"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.compression.FastLzFrameDecoder.State.INIT_BLOCK = r0
                io.netty.handler.codec.compression.FastLzFrameDecoder$State r1 = new io.netty.handler.codec.compression.FastLzFrameDecoder$State
                java.lang.String r3 = "INIT_BLOCK_PARAMS"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.compression.FastLzFrameDecoder.State.INIT_BLOCK_PARAMS = r1
                io.netty.handler.codec.compression.FastLzFrameDecoder$State r3 = new io.netty.handler.codec.compression.FastLzFrameDecoder$State
                java.lang.String r5 = "DECOMPRESS_DATA"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.compression.FastLzFrameDecoder.State.DECOMPRESS_DATA = r3
                io.netty.handler.codec.compression.FastLzFrameDecoder$State r5 = new io.netty.handler.codec.compression.FastLzFrameDecoder$State
                java.lang.String r7 = "CORRUPTED"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.compression.FastLzFrameDecoder.State.CORRUPTED = r5
                r7 = 4
                io.netty.handler.codec.compression.FastLzFrameDecoder$State[] r7 = new io.netty.handler.codec.compression.FastLzFrameDecoder.State[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.netty.handler.codec.compression.FastLzFrameDecoder.State.$VALUES = r7
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.compression.FastLzFrameDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.compression.FastLzFrameDecoder$State> r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.compression.FastLzFrameDecoder$State r1 = (io.netty.handler.codec.compression.FastLzFrameDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.compression.FastLzFrameDecoder.State[] values() {
                io.netty.handler.codec.compression.FastLzFrameDecoder$State[] r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.compression.FastLzFrameDecoder$State[] r0 = (io.netty.handler.codec.compression.FastLzFrameDecoder.State[]) r0
                return r0
        }
    }

    public FastLzFrameDecoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public FastLzFrameDecoder(java.util.zip.Checksum r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.compression.FastLzFrameDecoder$State r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.INIT_BLOCK
            r1.currentState = r0
            r1.checksum = r2
            return
    }

    public FastLzFrameDecoder(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L8
            java.util.zip.Adler32 r1 = new java.util.zip.Adler32
            r1.<init>()
            goto L9
        L8:
            r1 = 0
        L9:
            r0.<init>(r1)
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r12, io.netty.buffer.ByteBuf r13, java.util.List<java.lang.Object> r14) throws java.lang.Exception {
            r11 = this;
            int[] r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State     // Catch: java.lang.Exception -> L1f
            io.netty.handler.codec.compression.FastLzFrameDecoder$State r1 = r11.currentState     // Catch: java.lang.Exception -> L1f
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L1f
            r0 = r0[r1]     // Catch: java.lang.Exception -> L1f
            r1 = 4
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r3) goto L29
            if (r0 == r2) goto L54
            r5 = 3
            if (r0 == r5) goto L88
            if (r0 != r1) goto L23
            int r12 = r13.readableBytes()     // Catch: java.lang.Exception -> L1f
            r13.skipBytes(r12)     // Catch: java.lang.Exception -> L1f
            return
        L1f:
            r0 = move-exception
            r12 = r0
            goto L152
        L23:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L1f
            r12.<init>()     // Catch: java.lang.Exception -> L1f
            throw r12     // Catch: java.lang.Exception -> L1f
        L29:
            int r0 = r13.readableBytes()     // Catch: java.lang.Exception -> L1f
            if (r0 >= r1) goto L30
            goto L90
        L30:
            int r0 = r13.readUnsignedMedium()     // Catch: java.lang.Exception -> L1f
            r5 = 4607066(0x464c5a, float:6.455875E-39)
            if (r0 != r5) goto L14a
            byte r0 = r13.readByte()     // Catch: java.lang.Exception -> L1f
            r5 = r0 & 1
            if (r5 != r3) goto L43
            r5 = 1
            goto L44
        L43:
            r5 = 0
        L44:
            r11.isCompressed = r5     // Catch: java.lang.Exception -> L1f
            r5 = 16
            r0 = r0 & r5
            if (r0 != r5) goto L4d
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            r11.hasChecksum = r0     // Catch: java.lang.Exception -> L1f
            io.netty.handler.codec.compression.FastLzFrameDecoder$State r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.INIT_BLOCK_PARAMS     // Catch: java.lang.Exception -> L1f
            r11.currentState = r0     // Catch: java.lang.Exception -> L1f
        L54:
            int r0 = r13.readableBytes()     // Catch: java.lang.Exception -> L1f
            boolean r5 = r11.isCompressed     // Catch: java.lang.Exception -> L1f
            if (r5 == 0) goto L5e
            r5 = 2
            goto L5f
        L5e:
            r5 = 0
        L5f:
            int r5 = r5 + r2
            boolean r6 = r11.hasChecksum     // Catch: java.lang.Exception -> L1f
            if (r6 == 0) goto L65
            goto L66
        L65:
            r1 = 0
        L66:
            int r5 = r5 + r1
            if (r0 >= r5) goto L6a
            goto L90
        L6a:
            if (r6 == 0) goto L71
            int r0 = r13.readInt()     // Catch: java.lang.Exception -> L1f
            goto L72
        L71:
            r0 = 0
        L72:
            r11.currentChecksum = r0     // Catch: java.lang.Exception -> L1f
            int r0 = r13.readUnsignedShort()     // Catch: java.lang.Exception -> L1f
            r11.chunkLength = r0     // Catch: java.lang.Exception -> L1f
            boolean r1 = r11.isCompressed     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L82
            int r0 = r13.readUnsignedShort()     // Catch: java.lang.Exception -> L1f
        L82:
            r11.originalLength = r0     // Catch: java.lang.Exception -> L1f
            io.netty.handler.codec.compression.FastLzFrameDecoder$State r0 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.DECOMPRESS_DATA     // Catch: java.lang.Exception -> L1f
            r11.currentState = r0     // Catch: java.lang.Exception -> L1f
        L88:
            int r7 = r11.chunkLength     // Catch: java.lang.Exception -> L1f
            int r0 = r13.readableBytes()     // Catch: java.lang.Exception -> L1f
            if (r0 >= r7) goto L91
        L90:
            return
        L91:
            int r0 = r13.readerIndex()     // Catch: java.lang.Exception -> L1f
            int r10 = r11.originalLength     // Catch: java.lang.Exception -> L1f
            if (r10 == 0) goto Lb1
            io.netty.buffer.ByteBufAllocator r12 = r12.alloc()     // Catch: java.lang.Exception -> L1f
            io.netty.buffer.ByteBuf r12 = r12.heapBuffer(r10, r10)     // Catch: java.lang.Exception -> L1f
            byte[] r1 = r12.array()     // Catch: java.lang.Exception -> L1f
            int r5 = r12.arrayOffset()     // Catch: java.lang.Exception -> L1f
            int r6 = r12.writerIndex()     // Catch: java.lang.Exception -> L1f
            int r5 = r5 + r6
            r9 = r5
        Laf:
            r8 = r1
            goto Lb6
        Lb1:
            byte[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES     // Catch: java.lang.Exception -> L1f
            r12 = 0
            r9 = 0
            goto Laf
        Lb6:
            boolean r1 = r11.isCompressed     // Catch: java.lang.Throwable -> Lcc
            if (r1 == 0) goto Lf8
            boolean r1 = r13.hasArray()     // Catch: java.lang.Throwable -> Lcc
            if (r1 == 0) goto Ld0
            byte[] r1 = r13.array()     // Catch: java.lang.Throwable -> Lcc
            int r5 = r13.arrayOffset()     // Catch: java.lang.Throwable -> Lcc
            int r5 = r5 + r0
            r6 = r5
        Lca:
            r5 = r1
            goto Ld7
        Lcc:
            r0 = move-exception
            r13 = r0
            goto L144
        Ld0:
            byte[] r1 = new byte[r7]     // Catch: java.lang.Throwable -> Lcc
            r13.getBytes(r0, r1)     // Catch: java.lang.Throwable -> Lcc
            r6 = 0
            goto Lca
        Ld7:
            int r0 = io.netty.handler.codec.compression.FastLz.decompress(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lcc
            if (r10 != r0) goto Lde
            goto Lfb
        Lde:
            io.netty.handler.codec.compression.DecompressionException r13 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r14 = "stream corrupted: originalLength(%d) and actual length(%d) mismatch"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lcc
            r2[r4] = r1     // Catch: java.lang.Throwable -> Lcc
            r2[r3] = r0     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r14 = java.lang.String.format(r14, r2)     // Catch: java.lang.Throwable -> Lcc
            r13.<init>(r14)     // Catch: java.lang.Throwable -> Lcc
            throw r13     // Catch: java.lang.Throwable -> Lcc
        Lf8:
            r13.getBytes(r0, r8, r9, r7)     // Catch: java.lang.Throwable -> Lcc
        Lfb:
            java.util.zip.Checksum r0 = r11.checksum     // Catch: java.lang.Throwable -> Lcc
            boolean r1 = r11.hasChecksum     // Catch: java.lang.Throwable -> Lcc
            if (r1 == 0) goto L12f
            if (r0 == 0) goto L12f
            r0.reset()     // Catch: java.lang.Throwable -> Lcc
            r0.update(r8, r9, r10)     // Catch: java.lang.Throwable -> Lcc
            long r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lcc
            int r1 = (int) r0     // Catch: java.lang.Throwable -> Lcc
            int r0 = r11.currentChecksum     // Catch: java.lang.Throwable -> Lcc
            if (r1 != r0) goto L113
            goto L12f
        L113:
            io.netty.handler.codec.compression.DecompressionException r13 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r14 = "stream corrupted: mismatching checksum: %d (expected: %d)"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lcc
            int r1 = r11.currentChecksum     // Catch: java.lang.Throwable -> Lcc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lcc
            r2[r4] = r0     // Catch: java.lang.Throwable -> Lcc
            r2[r3] = r1     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r14 = java.lang.String.format(r14, r2)     // Catch: java.lang.Throwable -> Lcc
            r13.<init>(r14)     // Catch: java.lang.Throwable -> Lcc
            throw r13     // Catch: java.lang.Throwable -> Lcc
        L12f:
            if (r12 == 0) goto L13c
            int r0 = r12.writerIndex()     // Catch: java.lang.Throwable -> Lcc
            int r0 = r0 + r10
            r12.writerIndex(r0)     // Catch: java.lang.Throwable -> Lcc
            r14.add(r12)     // Catch: java.lang.Throwable -> Lcc
        L13c:
            r13.skipBytes(r7)     // Catch: java.lang.Throwable -> Lcc
            io.netty.handler.codec.compression.FastLzFrameDecoder$State r13 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.INIT_BLOCK     // Catch: java.lang.Throwable -> Lcc
            r11.currentState = r13     // Catch: java.lang.Throwable -> Lcc
            return
        L144:
            if (r12 == 0) goto L149
            r12.release()     // Catch: java.lang.Exception -> L1f
        L149:
            throw r13     // Catch: java.lang.Exception -> L1f
        L14a:
            io.netty.handler.codec.compression.DecompressionException r12 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L1f
            java.lang.String r13 = "unexpected block identifier"
            r12.<init>(r13)     // Catch: java.lang.Exception -> L1f
            throw r12     // Catch: java.lang.Exception -> L1f
        L152:
            io.netty.handler.codec.compression.FastLzFrameDecoder$State r13 = io.netty.handler.codec.compression.FastLzFrameDecoder.State.CORRUPTED
            r11.currentState = r13
            throw r12
    }
}
