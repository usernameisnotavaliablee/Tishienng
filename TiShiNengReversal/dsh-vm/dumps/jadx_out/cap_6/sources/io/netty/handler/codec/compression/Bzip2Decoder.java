package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Bzip2Decoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private int blockCRC;
    private io.netty.handler.codec.compression.Bzip2BlockDecompressor blockDecompressor;
    private int blockSize;
    private io.netty.handler.codec.compression.Bzip2Decoder.State currentState;
    private io.netty.handler.codec.compression.Bzip2HuffmanStageDecoder huffmanStageDecoder;
    private final io.netty.handler.codec.compression.Bzip2BitReader reader;
    private int streamCRC;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.Bzip2Decoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State = null;

        static {
                io.netty.handler.codec.compression.Bzip2Decoder$State[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State = r0
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.INIT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.INIT_BLOCK     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.INIT_BLOCK_PARAMS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_HUFFMAN_USED_MAP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_HUFFMAN_USED_BITMAPS     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_SELECTORS_NUMBER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_SELECTORS     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_HUFFMAN_LENGTH     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State     // Catch: java.lang.NoSuchFieldError -> L6c
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.DECODE_HUFFMAN_DATA     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.EOF     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.handler.codec.compression.Bzip2Decoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.compression.Bzip2Decoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State DECODE_HUFFMAN_DATA = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State EOF = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State INIT = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State INIT_BLOCK = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State INIT_BLOCK_PARAMS = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State RECEIVE_HUFFMAN_LENGTH = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State RECEIVE_HUFFMAN_USED_BITMAPS = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State RECEIVE_HUFFMAN_USED_MAP = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State RECEIVE_SELECTORS = null;
        public static final io.netty.handler.codec.compression.Bzip2Decoder.State RECEIVE_SELECTORS_NUMBER = null;

        static {
                io.netty.handler.codec.compression.Bzip2Decoder$State r0 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                java.lang.String r1 = "INIT"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.compression.Bzip2Decoder.State.INIT = r0
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                java.lang.String r3 = "INIT_BLOCK"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.compression.Bzip2Decoder.State.INIT_BLOCK = r1
                io.netty.handler.codec.compression.Bzip2Decoder$State r3 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                java.lang.String r5 = "INIT_BLOCK_PARAMS"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.compression.Bzip2Decoder.State.INIT_BLOCK_PARAMS = r3
                io.netty.handler.codec.compression.Bzip2Decoder$State r5 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                java.lang.String r7 = "RECEIVE_HUFFMAN_USED_MAP"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_HUFFMAN_USED_MAP = r5
                io.netty.handler.codec.compression.Bzip2Decoder$State r7 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                java.lang.String r9 = "RECEIVE_HUFFMAN_USED_BITMAPS"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_HUFFMAN_USED_BITMAPS = r7
                io.netty.handler.codec.compression.Bzip2Decoder$State r9 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                java.lang.String r11 = "RECEIVE_SELECTORS_NUMBER"
                r12 = 5
                r9.<init>(r11, r12)
                io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_SELECTORS_NUMBER = r9
                io.netty.handler.codec.compression.Bzip2Decoder$State r11 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                java.lang.String r13 = "RECEIVE_SELECTORS"
                r14 = 6
                r11.<init>(r13, r14)
                io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_SELECTORS = r11
                io.netty.handler.codec.compression.Bzip2Decoder$State r13 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                java.lang.String r15 = "RECEIVE_HUFFMAN_LENGTH"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_HUFFMAN_LENGTH = r13
                io.netty.handler.codec.compression.Bzip2Decoder$State r15 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                r17 = 7
                java.lang.String r2 = "DECODE_HUFFMAN_DATA"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                io.netty.handler.codec.compression.Bzip2Decoder.State.DECODE_HUFFMAN_DATA = r15
                io.netty.handler.codec.compression.Bzip2Decoder$State r2 = new io.netty.handler.codec.compression.Bzip2Decoder$State
                r19 = 8
                java.lang.String r4 = "EOF"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                io.netty.handler.codec.compression.Bzip2Decoder.State.EOF = r2
                r4 = 10
                io.netty.handler.codec.compression.Bzip2Decoder$State[] r4 = new io.netty.handler.codec.compression.Bzip2Decoder.State[r4]
                r4[r16] = r0
                r4[r18] = r1
                r4[r20] = r3
                r4[r8] = r5
                r4[r10] = r7
                r4[r12] = r9
                r4[r14] = r11
                r4[r17] = r13
                r4[r19] = r15
                r4[r6] = r2
                io.netty.handler.codec.compression.Bzip2Decoder.State.$VALUES = r4
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.compression.Bzip2Decoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.compression.Bzip2Decoder$State> r0 = io.netty.handler.codec.compression.Bzip2Decoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.compression.Bzip2Decoder$State r1 = (io.netty.handler.codec.compression.Bzip2Decoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.compression.Bzip2Decoder.State[] values() {
                io.netty.handler.codec.compression.Bzip2Decoder$State[] r0 = io.netty.handler.codec.compression.Bzip2Decoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.compression.Bzip2Decoder$State[] r0 = (io.netty.handler.codec.compression.Bzip2Decoder.State[]) r0
                return r0
        }
    }

    public Bzip2Decoder() {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.compression.Bzip2Decoder$State r0 = io.netty.handler.codec.compression.Bzip2Decoder.State.INIT
            r1.currentState = r0
            io.netty.handler.codec.compression.Bzip2BitReader r0 = new io.netty.handler.codec.compression.Bzip2BitReader
            r0.<init>()
            r1.reader = r0
            return
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r17, io.netty.buffer.ByteBuf r18, java.util.List<java.lang.Object> r19) throws java.lang.Exception {
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0.isReadable()
            if (r2 != 0) goto Lc
            goto L201
        Lc:
            io.netty.handler.codec.compression.Bzip2BitReader r8 = r1.reader
            r8.setByteBuf(r0)
        L11:
            int[] r2 = io.netty.handler.codec.compression.Bzip2Decoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Bzip2Decoder$State
            io.netty.handler.codec.compression.Bzip2Decoder$State r3 = r1.currentState
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r9 = 6
            r3 = 24
            r10 = 16
            r11 = 0
            r12 = 1
            switch(r2) {
                case 1: goto L33;
                case 2: goto L5e;
                case 3: goto La3;
                case 4: goto Lc4;
                case 5: goto Ld8;
                case 6: goto L137;
                case 7: goto L155;
                case 8: goto L180;
                case 9: goto L1f3;
                case 10: goto L2b;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            int r2 = r0.readableBytes()
            r0.skipBytes(r2)
            return
        L33:
            int r2 = r0.readableBytes()
            r4 = 4
            if (r2 >= r4) goto L3c
            goto L201
        L3c:
            int r2 = r0.readUnsignedMedium()
            r4 = 4348520(0x425a68, float:6.093574E-39)
            if (r2 != r4) goto L26e
            byte r2 = r0.readByte()
            int r2 = r2 + (-48)
            if (r2 < r12) goto L266
            r4 = 9
            if (r2 > r4) goto L266
            r4 = 100000(0x186a0, float:1.4013E-40)
            int r2 = r2 * r4
            r1.blockSize = r2
            r1.streamCRC = r11
            io.netty.handler.codec.compression.Bzip2Decoder$State r2 = io.netty.handler.codec.compression.Bzip2Decoder.State.INIT_BLOCK
            r1.currentState = r2
        L5e:
            r2 = 10
            boolean r2 = r8.hasReadableBytes(r2)
            if (r2 != 0) goto L68
            goto L201
        L68:
            int r2 = r8.readBits(r3)
            int r4 = r8.readBits(r3)
            r5 = 1536581(0x177245, float:2.153209E-39)
            if (r2 != r5) goto L8f
            r5 = 3690640(0x385090, float:5.171688E-39)
            if (r4 != r5) goto L8f
            int r2 = r8.readInt()
            int r3 = r1.streamCRC
            if (r2 != r3) goto L87
            io.netty.handler.codec.compression.Bzip2Decoder$State r2 = io.netty.handler.codec.compression.Bzip2Decoder.State.EOF
            r1.currentState = r2
            goto L11
        L87:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r2 = "stream CRC error"
            r0.<init>(r2)
            throw r0
        L8f:
            r5 = 3227993(0x314159, float:4.523382E-39)
            if (r2 != r5) goto L25e
            r2 = 2511705(0x265359, float:3.519648E-39)
            if (r4 != r2) goto L25e
            int r2 = r8.readInt()
            r1.blockCRC = r2
            io.netty.handler.codec.compression.Bzip2Decoder$State r2 = io.netty.handler.codec.compression.Bzip2Decoder.State.INIT_BLOCK_PARAMS
            r1.currentState = r2
        La3:
            r2 = 25
            boolean r2 = r8.hasReadableBits(r2)
            if (r2 != 0) goto Lad
            goto L201
        Lad:
            boolean r6 = r8.readBoolean()
            int r7 = r8.readBits(r3)
            io.netty.handler.codec.compression.Bzip2BlockDecompressor r3 = new io.netty.handler.codec.compression.Bzip2BlockDecompressor
            int r4 = r1.blockSize
            int r5 = r1.blockCRC
            r3.<init>(r4, r5, r6, r7, r8)
            r1.blockDecompressor = r3
            io.netty.handler.codec.compression.Bzip2Decoder$State r2 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_HUFFMAN_USED_MAP
            r1.currentState = r2
        Lc4:
            boolean r2 = r8.hasReadableBits(r10)
            if (r2 != 0) goto Lcc
            goto L201
        Lcc:
            io.netty.handler.codec.compression.Bzip2BlockDecompressor r2 = r1.blockDecompressor
            int r3 = r8.readBits(r10)
            r2.huffmanInUse16 = r3
            io.netty.handler.codec.compression.Bzip2Decoder$State r2 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_HUFFMAN_USED_BITMAPS
            r1.currentState = r2
        Ld8:
            io.netty.handler.codec.compression.Bzip2BlockDecompressor r2 = r1.blockDecompressor
            int r3 = r2.huffmanInUse16
            int r4 = java.lang.Integer.bitCount(r3)
            byte[] r5 = r2.huffmanSymbolMap
            int r6 = r4 * 16
            r7 = 3
            int r6 = r6 + r7
            boolean r6 = r8.hasReadableBits(r6)
            if (r6 != 0) goto Lee
            goto L201
        Lee:
            if (r4 <= 0) goto L118
            r4 = 0
            r6 = 0
        Lf2:
            if (r4 >= r10) goto L119
            r13 = 32768(0x8000, float:4.5918E-41)
            int r13 = r13 >>> r4
            r13 = r13 & r3
            if (r13 == 0) goto L113
            int r13 = r4 << 4
            r14 = 0
        Lfe:
            if (r14 >= r10) goto L113
            boolean r15 = r8.readBoolean()
            if (r15 == 0) goto L10c
            int r15 = r6 + 1
            byte r10 = (byte) r13
            r5[r6] = r10
            r6 = r15
        L10c:
            int r14 = r14 + 1
            int r13 = r13 + 1
            r10 = 16
            goto Lfe
        L113:
            int r4 = r4 + 1
            r10 = 16
            goto Lf2
        L118:
            r6 = 0
        L119:
            int r3 = r6 + 1
            r2.huffmanEndOfBlockSymbol = r3
            int r2 = r8.readBits(r7)
            r3 = 2
            if (r2 < r3) goto L256
            if (r2 > r9) goto L256
            int r6 = r6 + 2
            r3 = 258(0x102, float:3.62E-43)
            if (r6 > r3) goto L24e
            io.netty.handler.codec.compression.Bzip2HuffmanStageDecoder r3 = new io.netty.handler.codec.compression.Bzip2HuffmanStageDecoder
            r3.<init>(r8, r2, r6)
            r1.huffmanStageDecoder = r3
            io.netty.handler.codec.compression.Bzip2Decoder$State r2 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_SELECTORS_NUMBER
            r1.currentState = r2
        L137:
            r2 = 15
            boolean r3 = r8.hasReadableBits(r2)
            if (r3 != 0) goto L141
            goto L201
        L141:
            int r2 = r8.readBits(r2)
            if (r2 < r12) goto L246
            r3 = 18002(0x4652, float:2.5226E-41)
            if (r2 > r3) goto L246
            io.netty.handler.codec.compression.Bzip2HuffmanStageDecoder r3 = r1.huffmanStageDecoder
            byte[] r2 = new byte[r2]
            r3.selectors = r2
            io.netty.handler.codec.compression.Bzip2Decoder$State r2 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_SELECTORS
            r1.currentState = r2
        L155:
            io.netty.handler.codec.compression.Bzip2HuffmanStageDecoder r2 = r1.huffmanStageDecoder
            byte[] r3 = r2.selectors
            int r4 = r3.length
            io.netty.handler.codec.compression.Bzip2MoveToFrontTable r5 = r2.tableMTF
            int r6 = r2.currentSelector
        L15e:
            if (r6 >= r4) goto L17c
            boolean r7 = r8.hasReadableBits(r9)
            if (r7 != 0) goto L169
            r2.currentSelector = r6
            return
        L169:
            r7 = 0
        L16a:
            boolean r10 = r8.readBoolean()
            if (r10 == 0) goto L173
            int r7 = r7 + 1
            goto L16a
        L173:
            byte r7 = r5.indexToFront(r7)
            r3[r6] = r7
            int r6 = r6 + 1
            goto L15e
        L17c:
            io.netty.handler.codec.compression.Bzip2Decoder$State r2 = io.netty.handler.codec.compression.Bzip2Decoder.State.RECEIVE_HUFFMAN_LENGTH
            r1.currentState = r2
        L180:
            io.netty.handler.codec.compression.Bzip2HuffmanStageDecoder r2 = r1.huffmanStageDecoder
            int r3 = r2.totalTables
            byte[][] r4 = r2.tableCodeLengths
            int r5 = r2.alphabetSize
            int r6 = r2.currentLength
            boolean r7 = r2.modifyLength
            int r9 = r2.currentGroup
        L18e:
            if (r9 >= r3) goto L1e0
            r10 = 5
            boolean r13 = r8.hasReadableBits(r10)
            if (r13 != 0) goto L19a
            r10 = 0
        L198:
            r11 = 1
            goto L1e1
        L19a:
            if (r6 >= 0) goto L1a0
            int r6 = r8.readBits(r10)
        L1a0:
            int r10 = r2.currentAlpha
        L1a2:
            r13 = -1
            if (r10 >= r5) goto L1d9
            boolean r14 = r8.isReadable()
            if (r14 != 0) goto L1ac
            goto L198
        L1ac:
            if (r7 != 0) goto L1bd
            boolean r14 = r8.readBoolean()
            if (r14 == 0) goto L1b5
            goto L1bd
        L1b5:
            r13 = r4[r9]
            byte r14 = (byte) r6
            r13[r10] = r14
            int r10 = r10 + 1
            goto L1a2
        L1bd:
            boolean r7 = r8.isReadable()
            if (r7 != 0) goto L1c5
            r7 = 1
            goto L198
        L1c5:
            boolean r7 = r8.readBoolean()
            if (r7 == 0) goto L1cd
            r7 = -1
            goto L1ce
        L1cd:
            r7 = 1
        L1ce:
            int r6 = r6 + r7
            boolean r7 = r8.isReadable()
            if (r7 != 0) goto L1d7
            r7 = 0
            goto L198
        L1d7:
            r7 = 0
            goto L1ac
        L1d9:
            r2.currentAlpha = r11
            int r9 = r9 + 1
            r6 = -1
            r7 = 0
            goto L18e
        L1e0:
            r10 = 0
        L1e1:
            if (r11 == 0) goto L1ec
            r2.currentGroup = r9
            r2.currentLength = r6
            r2.currentAlpha = r10
            r2.modifyLength = r7
            return
        L1ec:
            r2.createHuffmanDecodingTables()
            io.netty.handler.codec.compression.Bzip2Decoder$State r2 = io.netty.handler.codec.compression.Bzip2Decoder.State.DECODE_HUFFMAN_DATA
            r1.currentState = r2
        L1f3:
            io.netty.handler.codec.compression.Bzip2BlockDecompressor r2 = r1.blockDecompressor
            int r3 = r0.readerIndex()
            io.netty.handler.codec.compression.Bzip2HuffmanStageDecoder r4 = r1.huffmanStageDecoder
            boolean r4 = r2.decodeHuffmanData(r4)
            if (r4 != 0) goto L202
        L201:
            return
        L202:
            int r4 = r0.readerIndex()
            if (r4 != r3) goto L211
            boolean r3 = r0.isReadable()
            if (r3 == 0) goto L211
            r8.refill()
        L211:
            int r3 = r2.blockLength()
            io.netty.buffer.ByteBufAllocator r4 = r17.alloc()
            io.netty.buffer.ByteBuf r3 = r4.buffer(r3)
        L21d:
            int r4 = r2.read()     // Catch: java.lang.Throwable -> L227
            if (r4 < 0) goto L229
            r3.writeByte(r4)     // Catch: java.lang.Throwable -> L227
            goto L21d
        L227:
            r0 = move-exception
            goto L242
        L229:
            int r2 = r2.checkCRC()     // Catch: java.lang.Throwable -> L227
            int r4 = r1.streamCRC     // Catch: java.lang.Throwable -> L227
            int r5 = r4 << 1
            int r4 = r4 >>> 31
            r4 = r4 | r5
            r2 = r2 ^ r4
            r1.streamCRC = r2     // Catch: java.lang.Throwable -> L227
            r2 = r19
            r2.add(r3)     // Catch: java.lang.Throwable -> L227
            io.netty.handler.codec.compression.Bzip2Decoder$State r3 = io.netty.handler.codec.compression.Bzip2Decoder.State.INIT_BLOCK
            r1.currentState = r3
            goto L11
        L242:
            r3.release()
            throw r0
        L246:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r2 = "incorrect selectors number"
            r0.<init>(r2)
            throw r0
        L24e:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r2 = "incorrect alphabet size"
            r0.<init>(r2)
            throw r0
        L256:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r2 = "incorrect huffman groups number"
            r0.<init>(r2)
            throw r0
        L25e:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r2 = "bad block header"
            r0.<init>(r2)
            throw r0
        L266:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r2 = "block size is invalid"
            r0.<init>(r2)
            throw r0
        L26e:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r2 = "Unexpected stream identifier contents. Mismatched bzip2 protocol version?"
            r0.<init>(r2)
            throw r0
    }

    public boolean isClosed() {
            r2 = this;
            io.netty.handler.codec.compression.Bzip2Decoder$State r0 = r2.currentState
            io.netty.handler.codec.compression.Bzip2Decoder$State r1 = io.netty.handler.codec.compression.Bzip2Decoder.State.EOF
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
