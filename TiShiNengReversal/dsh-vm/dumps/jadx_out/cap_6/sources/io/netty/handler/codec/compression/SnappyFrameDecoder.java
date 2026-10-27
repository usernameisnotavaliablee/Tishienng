package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SnappyFrameDecoder extends io.netty.handler.codec.ByteToMessageDecoder {
    private static final int MAX_UNCOMPRESSED_DATA_SIZE = 65540;
    private static final int SNAPPY_IDENTIFIER_LEN = 6;
    private boolean corrupted;
    private final io.netty.handler.codec.compression.Snappy snappy;
    private boolean started;
    private final boolean validateChecksums;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.SnappyFrameDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$SnappyFrameDecoder$ChunkType = null;

        static {
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType[] r0 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.SnappyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$SnappyFrameDecoder$ChunkType = r0
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.STREAM_IDENTIFIER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.compression.SnappyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$SnappyFrameDecoder$ChunkType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.RESERVED_SKIPPABLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.compression.SnappyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$SnappyFrameDecoder$ChunkType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.RESERVED_UNSKIPPABLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.compression.SnappyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$SnappyFrameDecoder$ChunkType     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.UNCOMPRESSED_DATA     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.compression.SnappyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$SnappyFrameDecoder$ChunkType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.COMPRESSED_DATA     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum ChunkType extends java.lang.Enum<io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType> {
        private static final /* synthetic */ io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType[] $VALUES = null;
        public static final io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType COMPRESSED_DATA = null;
        public static final io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType RESERVED_SKIPPABLE = null;
        public static final io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType RESERVED_UNSKIPPABLE = null;
        public static final io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType STREAM_IDENTIFIER = null;
        public static final io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType UNCOMPRESSED_DATA = null;

        static {
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r0 = new io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType
                java.lang.String r1 = "STREAM_IDENTIFIER"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.STREAM_IDENTIFIER = r0
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = new io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType
                java.lang.String r3 = "COMPRESSED_DATA"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.COMPRESSED_DATA = r1
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r3 = new io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType
                java.lang.String r5 = "UNCOMPRESSED_DATA"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.UNCOMPRESSED_DATA = r3
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r5 = new io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType
                java.lang.String r7 = "RESERVED_UNSKIPPABLE"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.RESERVED_UNSKIPPABLE = r5
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r7 = new io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType
                java.lang.String r9 = "RESERVED_SKIPPABLE"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.RESERVED_SKIPPABLE = r7
                r9 = 5
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType[] r9 = new io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.$VALUES = r9
                return
        }

        ChunkType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType> r0 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = (io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType) r1
                return r1
        }

        public static io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType[] values() {
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType[] r0 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType[] r0 = (io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType[]) r0
                return r0
        }
    }

    public SnappyFrameDecoder() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public SnappyFrameDecoder(boolean r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.compression.Snappy r0 = new io.netty.handler.codec.compression.Snappy
            r0.<init>()
            r1.snappy = r0
            r1.validateChecksums = r2
            return
    }

    private static void checkByte(byte r0, byte r1) {
            if (r0 != r1) goto L3
            return
        L3:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r1 = "Unexpected stream identifier contents. Mismatched snappy protocol version?"
            r0.<init>(r1)
            throw r0
    }

    private static io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType mapChunkType(byte r1) {
            if (r1 != 0) goto L5
            io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.COMPRESSED_DATA
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.UNCOMPRESSED_DATA
            return r1
        Lb:
            r0 = -1
            if (r1 != r0) goto L11
            io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.STREAM_IDENTIFIER
            return r1
        L11:
            r0 = 128(0x80, float:1.8E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L19
            io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.RESERVED_SKIPPABLE
            return r1
        L19:
            io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r1 = io.netty.handler.codec.compression.SnappyFrameDecoder.ChunkType.RESERVED_UNSKIPPABLE
            return r1
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r9, io.netty.buffer.ByteBuf r10, java.util.List<java.lang.Object> r11) throws java.lang.Exception {
            r8 = this;
            boolean r0 = r8.corrupted
            if (r0 == 0) goto Lc
            int r9 = r10.readableBytes()
            r10.skipBytes(r9)
            return
        Lc:
            r0 = 1
            int r1 = r10.readerIndex()     // Catch: java.lang.Exception -> L94
            int r2 = r10.readableBytes()     // Catch: java.lang.Exception -> L94
            r3 = 4
            if (r2 >= r3) goto L1a
            goto L11a
        L1a:
            short r4 = r10.getUnsignedByte(r1)     // Catch: java.lang.Exception -> L94
            byte r5 = (byte) r4     // Catch: java.lang.Exception -> L94
            io.netty.handler.codec.compression.SnappyFrameDecoder$ChunkType r5 = mapChunkType(r5)     // Catch: java.lang.Exception -> L94
            int r1 = r1 + r0
            int r1 = r10.getUnsignedMediumLE(r1)     // Catch: java.lang.Exception -> L94
            int[] r6 = io.netty.handler.codec.compression.SnappyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$SnappyFrameDecoder$ChunkType     // Catch: java.lang.Exception -> L94
            int r5 = r5.ordinal()     // Catch: java.lang.Exception -> L94
            r5 = r6[r5]     // Catch: java.lang.Exception -> L94
            r6 = 5
            if (r5 == r0) goto L113
            r7 = 2
            if (r5 == r7) goto Lff
            r7 = 3
            if (r5 == r7) goto Le4
            if (r5 == r3) goto La5
            if (r5 == r6) goto L3f
            goto L11a
        L3f:
            boolean r4 = r8.started     // Catch: java.lang.Exception -> L94
            if (r4 == 0) goto L9d
            int r4 = r1 + 4
            if (r2 >= r4) goto L49
            goto L11a
        L49:
            r10.skipBytes(r3)     // Catch: java.lang.Exception -> L94
            int r2 = r10.readIntLE()     // Catch: java.lang.Exception -> L94
            io.netty.buffer.ByteBufAllocator r9 = r9.alloc()     // Catch: java.lang.Exception -> L94
            io.netty.buffer.ByteBuf r9 = r9.buffer()     // Catch: java.lang.Exception -> L94
            boolean r4 = r8.validateChecksums     // Catch: java.lang.Throwable -> L7a
            if (r4 == 0) goto L81
            int r4 = r10.writerIndex()     // Catch: java.lang.Throwable -> L7a
            int r5 = r10.readerIndex()     // Catch: java.lang.Throwable -> L7c
            int r5 = r5 + r1
            int r5 = r5 - r3
            r10.writerIndex(r5)     // Catch: java.lang.Throwable -> L7c
            io.netty.handler.codec.compression.Snappy r1 = r8.snappy     // Catch: java.lang.Throwable -> L7c
            r1.decode(r10, r9)     // Catch: java.lang.Throwable -> L7c
            r10.writerIndex(r4)     // Catch: java.lang.Throwable -> L7a
            int r10 = r9.writerIndex()     // Catch: java.lang.Throwable -> L7a
            r1 = 0
            io.netty.handler.codec.compression.Snappy.validateChecksum(r2, r9, r1, r10)     // Catch: java.lang.Throwable -> L7a
            goto L8b
        L7a:
            r10 = move-exception
            goto L97
        L7c:
            r11 = move-exception
            r10.writerIndex(r4)     // Catch: java.lang.Throwable -> L7a
            throw r11     // Catch: java.lang.Throwable -> L7a
        L81:
            io.netty.handler.codec.compression.Snappy r2 = r8.snappy     // Catch: java.lang.Throwable -> L7a
            int r1 = r1 - r3
            io.netty.buffer.ByteBuf r10 = r10.readSlice(r1)     // Catch: java.lang.Throwable -> L7a
            r2.decode(r10, r9)     // Catch: java.lang.Throwable -> L7a
        L8b:
            r11.add(r9)     // Catch: java.lang.Throwable -> L7a
            io.netty.handler.codec.compression.Snappy r9 = r8.snappy     // Catch: java.lang.Exception -> L94
            r9.reset()     // Catch: java.lang.Exception -> L94
            return
        L94:
            r9 = move-exception
            goto L17e
        L97:
            if (r9 == 0) goto L9c
            r9.release()     // Catch: java.lang.Exception -> L94
        L9c:
            throw r10     // Catch: java.lang.Exception -> L94
        L9d:
            io.netty.handler.codec.compression.DecompressionException r9 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L94
            java.lang.String r10 = "Received COMPRESSED_DATA tag before STREAM_IDENTIFIER"
            r9.<init>(r10)     // Catch: java.lang.Exception -> L94
            throw r9     // Catch: java.lang.Exception -> L94
        La5:
            boolean r9 = r8.started     // Catch: java.lang.Exception -> L94
            if (r9 == 0) goto Ldc
            r9 = 65540(0x10004, float:9.1841E-41)
            if (r1 > r9) goto Ld4
            int r9 = r1 + 4
            if (r2 >= r9) goto Lb3
            goto L11a
        Lb3:
            r10.skipBytes(r3)     // Catch: java.lang.Exception -> L94
            boolean r9 = r8.validateChecksums     // Catch: java.lang.Exception -> L94
            if (r9 == 0) goto Lc8
            int r9 = r10.readIntLE()     // Catch: java.lang.Exception -> L94
            int r2 = r10.readerIndex()     // Catch: java.lang.Exception -> L94
            int r4 = r1 + (-4)
            io.netty.handler.codec.compression.Snappy.validateChecksum(r9, r10, r2, r4)     // Catch: java.lang.Exception -> L94
            goto Lcb
        Lc8:
            r10.skipBytes(r3)     // Catch: java.lang.Exception -> L94
        Lcb:
            int r1 = r1 - r3
            io.netty.buffer.ByteBuf r9 = r10.readRetainedSlice(r1)     // Catch: java.lang.Exception -> L94
            r11.add(r9)     // Catch: java.lang.Exception -> L94
            return
        Ld4:
            io.netty.handler.codec.compression.DecompressionException r9 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L94
            java.lang.String r10 = "Received UNCOMPRESSED_DATA larger than 65540 bytes"
            r9.<init>(r10)     // Catch: java.lang.Exception -> L94
            throw r9     // Catch: java.lang.Exception -> L94
        Ldc:
            io.netty.handler.codec.compression.DecompressionException r9 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L94
            java.lang.String r10 = "Received UNCOMPRESSED_DATA tag before STREAM_IDENTIFIER"
            r9.<init>(r10)     // Catch: java.lang.Exception -> L94
            throw r9     // Catch: java.lang.Exception -> L94
        Le4:
            io.netty.handler.codec.compression.DecompressionException r9 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L94
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L94
            r10.<init>()     // Catch: java.lang.Exception -> L94
            java.lang.String r11 = "Found reserved unskippable chunk type: 0x"
            r10.append(r11)     // Catch: java.lang.Exception -> L94
            java.lang.String r11 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Exception -> L94
            r10.append(r11)     // Catch: java.lang.Exception -> L94
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L94
            r9.<init>(r10)     // Catch: java.lang.Exception -> L94
            throw r9     // Catch: java.lang.Exception -> L94
        Lff:
            boolean r9 = r8.started     // Catch: java.lang.Exception -> L94
            if (r9 == 0) goto L10b
            int r1 = r1 + r3
            if (r2 >= r1) goto L107
            goto L11a
        L107:
            r10.skipBytes(r1)     // Catch: java.lang.Exception -> L94
            return
        L10b:
            io.netty.handler.codec.compression.DecompressionException r9 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L94
            java.lang.String r10 = "Received RESERVED_SKIPPABLE tag before STREAM_IDENTIFIER"
            r9.<init>(r10)     // Catch: java.lang.Exception -> L94
            throw r9     // Catch: java.lang.Exception -> L94
        L113:
            r9 = 6
            if (r1 != r9) goto L167
            r11 = 10
            if (r2 >= r11) goto L11b
        L11a:
            return
        L11b:
            r10.skipBytes(r3)     // Catch: java.lang.Exception -> L94
            int r11 = r10.readerIndex()     // Catch: java.lang.Exception -> L94
            r10.skipBytes(r9)     // Catch: java.lang.Exception -> L94
            int r9 = r11 + 1
            byte r1 = r10.getByte(r11)     // Catch: java.lang.Exception -> L94
            r2 = 115(0x73, float:1.61E-43)
            checkByte(r1, r2)     // Catch: java.lang.Exception -> L94
            int r1 = r11 + 2
            byte r9 = r10.getByte(r9)     // Catch: java.lang.Exception -> L94
            r2 = 78
            checkByte(r9, r2)     // Catch: java.lang.Exception -> L94
            int r9 = r11 + 3
            byte r1 = r10.getByte(r1)     // Catch: java.lang.Exception -> L94
            r2 = 97
            checkByte(r1, r2)     // Catch: java.lang.Exception -> L94
            int r1 = r11 + 4
            byte r9 = r10.getByte(r9)     // Catch: java.lang.Exception -> L94
            r2 = 80
            checkByte(r9, r2)     // Catch: java.lang.Exception -> L94
            int r11 = r11 + r6
            byte r9 = r10.getByte(r1)     // Catch: java.lang.Exception -> L94
            r1 = 112(0x70, float:1.57E-43)
            checkByte(r9, r1)     // Catch: java.lang.Exception -> L94
            byte r9 = r10.getByte(r11)     // Catch: java.lang.Exception -> L94
            r10 = 89
            checkByte(r9, r10)     // Catch: java.lang.Exception -> L94
            r8.started = r0     // Catch: java.lang.Exception -> L94
            return
        L167:
            io.netty.handler.codec.compression.DecompressionException r9 = new io.netty.handler.codec.compression.DecompressionException     // Catch: java.lang.Exception -> L94
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L94
            r10.<init>()     // Catch: java.lang.Exception -> L94
            java.lang.String r11 = "Unexpected length of stream identifier: "
            r10.append(r11)     // Catch: java.lang.Exception -> L94
            r10.append(r1)     // Catch: java.lang.Exception -> L94
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L94
            r9.<init>(r10)     // Catch: java.lang.Exception -> L94
            throw r9     // Catch: java.lang.Exception -> L94
        L17e:
            r8.corrupted = r0
            throw r9
    }
}
