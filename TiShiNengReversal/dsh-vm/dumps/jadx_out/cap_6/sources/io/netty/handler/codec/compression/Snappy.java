package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Snappy {
    private static final int COPY_1_BYTE_OFFSET = 1;
    private static final int COPY_2_BYTE_OFFSET = 2;
    private static final int COPY_4_BYTE_OFFSET = 3;
    private static final int LITERAL = 0;
    private static final int MAX_HT_SIZE = 16384;
    private static final int MIN_COMPRESSIBLE_BYTES = 15;
    private static final int NOT_ENOUGH_INPUT = -1;
    private static final int PREAMBLE_NOT_FULL = -1;
    private io.netty.handler.codec.compression.Snappy.State state;
    private byte tag;
    private int written;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.Snappy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$Snappy$State = null;

        static {
                io.netty.handler.codec.compression.Snappy$State[] r0 = io.netty.handler.codec.compression.Snappy.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.Snappy.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Snappy$State = r0
                io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.compression.Snappy.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Snappy$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_PREAMBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.compression.Snappy.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Snappy$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_TAG     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.compression.Snappy.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Snappy$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_LITERAL     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.compression.Snappy.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Snappy$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_COPY     // Catch: java.lang.NoSuchFieldError -> L3e
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
    private enum State extends java.lang.Enum<io.netty.handler.codec.compression.Snappy.State> {
        private static final /* synthetic */ io.netty.handler.codec.compression.Snappy.State[] $VALUES = null;
        public static final io.netty.handler.codec.compression.Snappy.State READING_COPY = null;
        public static final io.netty.handler.codec.compression.Snappy.State READING_LITERAL = null;
        public static final io.netty.handler.codec.compression.Snappy.State READING_PREAMBLE = null;
        public static final io.netty.handler.codec.compression.Snappy.State READING_TAG = null;
        public static final io.netty.handler.codec.compression.Snappy.State READY = null;

        static {
                io.netty.handler.codec.compression.Snappy$State r0 = new io.netty.handler.codec.compression.Snappy$State
                java.lang.String r1 = "READY"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.compression.Snappy.State.READY = r0
                io.netty.handler.codec.compression.Snappy$State r1 = new io.netty.handler.codec.compression.Snappy$State
                java.lang.String r3 = "READING_PREAMBLE"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.compression.Snappy.State.READING_PREAMBLE = r1
                io.netty.handler.codec.compression.Snappy$State r3 = new io.netty.handler.codec.compression.Snappy$State
                java.lang.String r5 = "READING_TAG"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.compression.Snappy.State.READING_TAG = r3
                io.netty.handler.codec.compression.Snappy$State r5 = new io.netty.handler.codec.compression.Snappy$State
                java.lang.String r7 = "READING_LITERAL"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.compression.Snappy.State.READING_LITERAL = r5
                io.netty.handler.codec.compression.Snappy$State r7 = new io.netty.handler.codec.compression.Snappy$State
                java.lang.String r9 = "READING_COPY"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.compression.Snappy.State.READING_COPY = r7
                r9 = 5
                io.netty.handler.codec.compression.Snappy$State[] r9 = new io.netty.handler.codec.compression.Snappy.State[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                io.netty.handler.codec.compression.Snappy.State.$VALUES = r9
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.compression.Snappy.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.compression.Snappy$State> r0 = io.netty.handler.codec.compression.Snappy.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.compression.Snappy$State r1 = (io.netty.handler.codec.compression.Snappy.State) r1
                return r1
        }

        public static io.netty.handler.codec.compression.Snappy.State[] values() {
                io.netty.handler.codec.compression.Snappy$State[] r0 = io.netty.handler.codec.compression.Snappy.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.compression.Snappy$State[] r0 = (io.netty.handler.codec.compression.Snappy.State[]) r0
                return r0
        }
    }

    public Snappy() {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READY
            r1.state = r0
            return
    }

    private static int bitsToEncode(int r1) {
            int r1 = java.lang.Integer.highestOneBit(r1)
            r0 = 0
        L5:
            int r1 = r1 >> 1
            if (r1 == 0) goto Lc
            int r0 = r0 + 1
            goto L5
        Lc:
            return r0
    }

    static int calculateChecksum(io.netty.buffer.ByteBuf r2) {
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            int r2 = calculateChecksum(r2, r0, r1)
            return r2
    }

    static int calculateChecksum(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            io.netty.handler.codec.compression.Crc32c r0 = new io.netty.handler.codec.compression.Crc32c
            r0.<init>()
            r0.update(r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            long r1 = r0.getValue()     // Catch: java.lang.Throwable -> L15
            int r2 = (int) r1     // Catch: java.lang.Throwable -> L15
            int r1 = maskChecksum(r2)     // Catch: java.lang.Throwable -> L15
            r0.reset()
            return r1
        L15:
            r1 = move-exception
            r0.reset()
            throw r1
    }

    private static int decodeCopyWith1ByteOffset(byte r2, io.netty.buffer.ByteBuf r3, io.netty.buffer.ByteBuf r4, int r5) {
            boolean r0 = r3.isReadable()
            if (r0 != 0) goto L8
            r2 = -1
            return r2
        L8:
            int r0 = r4.writerIndex()
            r1 = r2 & 28
            int r1 = r1 >> 2
            int r1 = r1 + 4
            r2 = r2 & 224(0xe0, float:3.14E-43)
            int r2 = r2 << 8
            int r2 = r2 >> 5
            short r3 = r3.readUnsignedByte()
            r2 = r2 | r3
            validateOffset(r2, r5)
            r4.markReaderIndex()
            if (r2 >= r1) goto L40
            int r3 = r1 / r2
        L27:
            if (r3 <= 0) goto L34
            int r5 = r0 - r2
            r4.readerIndex(r5)
            r4.readBytes(r4, r2)
            int r3 = r3 + (-1)
            goto L27
        L34:
            int r3 = r1 % r2
            if (r3 == 0) goto L47
            int r0 = r0 - r2
            r4.readerIndex(r0)
            r4.readBytes(r4, r3)
            goto L47
        L40:
            int r0 = r0 - r2
            r4.readerIndex(r0)
            r4.readBytes(r4, r1)
        L47:
            r4.resetReaderIndex()
            return r1
    }

    private static int decodeCopyWith2ByteOffset(byte r2, io.netty.buffer.ByteBuf r3, io.netty.buffer.ByteBuf r4, int r5) {
            int r0 = r3.readableBytes()
            r1 = 2
            if (r0 >= r1) goto L9
            r2 = -1
            return r2
        L9:
            int r0 = r4.writerIndex()
            int r2 = r2 >> r1
            r2 = r2 & 63
            int r2 = r2 + 1
            int r3 = r3.readUnsignedShortLE()
            validateOffset(r3, r5)
            r4.markReaderIndex()
            if (r3 >= r2) goto L39
            int r5 = r2 / r3
        L20:
            if (r5 <= 0) goto L2d
            int r1 = r0 - r3
            r4.readerIndex(r1)
            r4.readBytes(r4, r3)
            int r5 = r5 + (-1)
            goto L20
        L2d:
            int r5 = r2 % r3
            if (r5 == 0) goto L40
            int r0 = r0 - r3
            r4.readerIndex(r0)
            r4.readBytes(r4, r5)
            goto L40
        L39:
            int r0 = r0 - r3
            r4.readerIndex(r0)
            r4.readBytes(r4, r2)
        L40:
            r4.resetReaderIndex()
            return r2
    }

    private static int decodeCopyWith4ByteOffset(byte r2, io.netty.buffer.ByteBuf r3, io.netty.buffer.ByteBuf r4, int r5) {
            int r0 = r3.readableBytes()
            r1 = 4
            if (r0 >= r1) goto L9
            r2 = -1
            return r2
        L9:
            int r0 = r4.writerIndex()
            int r2 = r2 >> 2
            r2 = r2 & 63
            int r2 = r2 + 1
            int r3 = r3.readIntLE()
            validateOffset(r3, r5)
            r4.markReaderIndex()
            if (r3 >= r2) goto L3a
            int r5 = r2 / r3
        L21:
            if (r5 <= 0) goto L2e
            int r1 = r0 - r3
            r4.readerIndex(r1)
            r4.readBytes(r4, r3)
            int r5 = r5 + (-1)
            goto L21
        L2e:
            int r5 = r2 % r3
            if (r5 == 0) goto L41
            int r0 = r0 - r3
            r4.readerIndex(r0)
            r4.readBytes(r4, r5)
            goto L41
        L3a:
            int r0 = r0 - r3
            r4.readerIndex(r0)
            r4.readBytes(r4, r2)
        L41:
            r4.resetReaderIndex()
            return r2
    }

    static int decodeLiteral(byte r2, io.netty.buffer.ByteBuf r3, io.netty.buffer.ByteBuf r4) {
            r3.markReaderIndex()
            r0 = 2
            int r2 = r2 >> r0
            r2 = r2 & 63
            r1 = -1
            switch(r2) {
                case 60: goto L32;
                case 61: goto L26;
                case 62: goto L19;
                case 63: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L3d
        Lc:
            int r2 = r3.readableBytes()
            r0 = 4
            if (r2 >= r0) goto L14
            return r1
        L14:
            int r2 = r3.readIntLE()
            goto L3d
        L19:
            int r2 = r3.readableBytes()
            r0 = 3
            if (r2 >= r0) goto L21
            return r1
        L21:
            int r2 = r3.readUnsignedMediumLE()
            goto L3d
        L26:
            int r2 = r3.readableBytes()
            if (r2 >= r0) goto L2d
            return r1
        L2d:
            int r2 = r3.readUnsignedShortLE()
            goto L3d
        L32:
            boolean r2 = r3.isReadable()
            if (r2 != 0) goto L39
            return r1
        L39:
            short r2 = r3.readUnsignedByte()
        L3d:
            int r2 = r2 + 1
            int r0 = r3.readableBytes()
            if (r0 >= r2) goto L49
            r3.resetReaderIndex()
            return r1
        L49:
            r4.writeBytes(r3, r2)
            return r2
    }

    private static void encodeCopy(io.netty.buffer.ByteBuf r2, int r3, int r4) {
        L0:
            r0 = 68
            r1 = 64
            if (r4 < r0) goto Lc
            encodeCopyWithOffset(r2, r3, r1)
            int r4 = r4 + (-64)
            goto L0
        Lc:
            if (r4 <= r1) goto L15
            r0 = 60
            encodeCopyWithOffset(r2, r3, r0)
            int r4 = r4 + (-60)
        L15:
            encodeCopyWithOffset(r2, r3, r4)
            return
    }

    private static void encodeCopyWithOffset(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            r0 = 12
            if (r3 >= r0) goto L1c
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 >= r0) goto L1c
            int r3 = r3 + (-4)
            int r3 = r3 << 2
            r3 = r3 | 1
            int r0 = r2 >> 8
            int r0 = r0 << 5
            r3 = r3 | r0
            r1.writeByte(r3)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.writeByte(r2)
            return
        L1c:
            int r3 = r3 + (-1)
            int r3 = r3 << 2
            r3 = r3 | 2
            r1.writeByte(r3)
            r3 = r2 & 255(0xff, float:3.57E-43)
            r1.writeByte(r3)
            int r2 = r2 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.writeByte(r2)
            return
    }

    static void encodeLiteral(io.netty.buffer.ByteBuf r4, io.netty.buffer.ByteBuf r5, int r6) {
            r0 = 61
            if (r6 >= r0) goto Lc
            int r0 = r6 + (-1)
            int r0 = r0 << 2
            r5.writeByte(r0)
            goto L2c
        Lc:
            int r0 = r6 + (-1)
            int r1 = bitsToEncode(r0)
            int r1 = r1 / 8
            int r2 = r1 + 1
            int r1 = r1 + 60
            int r1 = r1 << 2
            r5.writeByte(r1)
            r1 = 0
        L1e:
            if (r1 >= r2) goto L2c
            int r3 = r1 * 8
            int r3 = r0 >> r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            r5.writeByte(r3)
            int r1 = r1 + 1
            goto L1e
        L2c:
            r5.writeBytes(r4, r6)
            return
    }

    private static int findMatchingLength(io.netty.buffer.ByteBuf r3, int r4, int r5, int r6) {
            r0 = 0
        L1:
            int r1 = r6 + (-4)
            if (r5 > r1) goto L16
            int r1 = r3.getInt(r5)
            int r2 = r4 + r0
            int r2 = r3.getInt(r2)
            if (r1 != r2) goto L16
            int r5 = r5 + 4
            int r0 = r0 + 4
            goto L1
        L16:
            if (r5 >= r6) goto L29
            int r1 = r4 + r0
            byte r1 = r3.getByte(r1)
            byte r2 = r3.getByte(r5)
            if (r1 != r2) goto L29
            int r5 = r5 + 1
            int r0 = r0 + 1
            goto L16
        L29:
            return r0
    }

    private static short[] getHashTable(int r2) {
            r0 = 256(0x100, float:3.59E-43)
        L2:
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 >= r1) goto Lb
            if (r0 >= r2) goto Lb
            int r0 = r0 << 1
            goto L2
        Lb:
            short[] r2 = new short[r0]
            return r2
    }

    private static int hash(io.netty.buffer.ByteBuf r0, int r1, int r2) {
            int r0 = r0.getInt(r1)
            r1 = 506832829(0x1e35a7bd, float:9.616748E-21)
            int r0 = r0 * r1
            int r0 = r0 >>> r2
            return r0
    }

    static int maskChecksum(int r1) {
            int r0 = r1 >> 15
            int r1 = r1 << 17
            r1 = r1 | r0
            r0 = -1568478504(0xffffffffa282ead8, float:-3.548522E-18)
            int r1 = r1 + r0
            return r1
    }

    private static int readPreamble(io.netty.buffer.ByteBuf r6) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            boolean r3 = r6.isReadable()
            if (r3 == 0) goto L28
            short r3 = r6.readUnsignedByte()
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r2 + 1
            int r2 = r2 * 7
            int r2 = r4 << r2
            r1 = r1 | r2
            r2 = r3 & 128(0x80, float:1.8E-43)
            if (r2 != 0) goto L1b
            return r1
        L1b:
            r2 = 4
            if (r5 >= r2) goto L20
            r2 = r5
            goto L3
        L20:
            io.netty.handler.codec.compression.DecompressionException r6 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r0 = "Preamble is greater than 4 bytes"
            r6.<init>(r0)
            throw r6
        L28:
            return r0
    }

    static void validateChecksum(int r2, io.netty.buffer.ByteBuf r3) {
            int r0 = r3.readerIndex()
            int r1 = r3.readableBytes()
            validateChecksum(r2, r3, r0, r1)
            return
    }

    static void validateChecksum(int r1, io.netty.buffer.ByteBuf r2, int r3, int r4) {
            int r2 = calculateChecksum(r2, r3, r4)
            if (r2 != r1) goto L7
            return
        L7:
            io.netty.handler.codec.compression.DecompressionException r3 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "mismatching checksum: "
            r4.append(r0)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r4.append(r2)
            java.lang.String r2 = " (expected: "
            r4.append(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r4.append(r1)
            r1 = 41
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
    }

    private static void validateOffset(int r0, int r1) {
            if (r0 == 0) goto L17
            if (r0 < 0) goto Lf
            if (r0 > r1) goto L7
            return
        L7:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r1 = "Offset exceeds size of chunk"
            r0.<init>(r1)
            throw r0
        Lf:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r1 = "Offset is greater than maximum value supported by this implementation"
            r0.<init>(r1)
            throw r0
        L17:
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.String r1 = "Offset is less than minimum permissible value"
            r0.<init>(r1)
            throw r0
    }

    public void decode(io.netty.buffer.ByteBuf r7, io.netty.buffer.ByteBuf r8) {
            r6 = this;
        L0:
            boolean r0 = r7.isReadable()
            if (r0 == 0) goto Lb1
            int[] r0 = io.netty.handler.codec.compression.Snappy.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Snappy$State
            io.netty.handler.codec.compression.Snappy$State r1 = r6.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 3
            if (r0 == r2) goto L74
            if (r0 == r1) goto L78
            if (r0 == r4) goto L8d
            r5 = 4
            if (r0 == r5) goto L62
            r5 = 5
            if (r0 == r5) goto L21
            goto L0
        L21:
            byte r0 = r6.tag
            r5 = r0 & 3
            if (r5 == r2) goto L50
            if (r5 == r1) goto L3e
            if (r5 == r4) goto L2c
            goto L0
        L2c:
            int r1 = r6.written
            int r0 = decodeCopyWith4ByteOffset(r0, r7, r8, r1)
            if (r0 == r3) goto Lb1
            io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r1
            int r1 = r6.written
            int r1 = r1 + r0
            r6.written = r1
            goto L0
        L3e:
            int r1 = r6.written
            int r0 = decodeCopyWith2ByteOffset(r0, r7, r8, r1)
            if (r0 == r3) goto Lb1
            io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r1
            int r1 = r6.written
            int r1 = r1 + r0
            r6.written = r1
            goto L0
        L50:
            int r1 = r6.written
            int r0 = decodeCopyWith1ByteOffset(r0, r7, r8, r1)
            if (r0 == r3) goto Lb1
            io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r1
            int r1 = r6.written
            int r1 = r1 + r0
            r6.written = r1
            goto L0
        L62:
            byte r0 = r6.tag
            int r0 = decodeLiteral(r0, r7, r8)
            if (r0 == r3) goto Lb1
            io.netty.handler.codec.compression.Snappy$State r1 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r1
            int r1 = r6.written
            int r1 = r1 + r0
            r6.written = r1
            goto L0
        L74:
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READING_PREAMBLE
            r6.state = r0
        L78:
            int r0 = readPreamble(r7)
            if (r0 != r3) goto L7f
            goto Lb1
        L7f:
            if (r0 != 0) goto L86
            io.netty.handler.codec.compression.Snappy$State r7 = io.netty.handler.codec.compression.Snappy.State.READY
            r6.state = r7
            return
        L86:
            r8.ensureWritable(r0)
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READING_TAG
            r6.state = r0
        L8d:
            boolean r0 = r7.isReadable()
            if (r0 != 0) goto L94
            goto Lb1
        L94:
            byte r0 = r7.readByte()
            r6.tag = r0
            r0 = r0 & r4
            if (r0 == 0) goto Lab
            if (r0 == r2) goto La5
            if (r0 == r1) goto La5
            if (r0 == r4) goto La5
            goto L0
        La5:
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READING_COPY
            r6.state = r0
            goto L0
        Lab:
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READING_LITERAL
            r6.state = r0
            goto L0
        Lb1:
            return
    }

    public void encode(io.netty.buffer.ByteBuf r13, io.netty.buffer.ByteBuf r14, int r15) {
            r12 = this;
            r0 = 0
        L1:
            int r1 = r0 * 7
            int r1 = r15 >>> r1
            r2 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r2 == 0) goto L13
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.8E-43)
            r14.writeByte(r1)
            int r0 = r0 + 1
            goto L1
        L13:
            r14.writeByte(r1)
            int r0 = r13.readerIndex()
            short[] r1 = getHashTable(r15)
            int r2 = r1.length
            int r2 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r2 = r2 + 1
            int r3 = r15 - r0
            r4 = 15
            if (r3 < r4) goto La6
            int r3 = r0 + 1
            int r4 = hash(r13, r3, r2)
            r5 = r0
        L32:
            r6 = 32
        L34:
            int r7 = r6 + 1
            int r6 = r6 >> 5
            int r6 = r6 + r3
            int r8 = r15 + (-4)
            if (r6 <= r8) goto L3f
        L3d:
            r0 = r5
            goto La6
        L3f:
            int r9 = hash(r13, r6, r2)
            short r10 = r1[r4]
            int r10 = r10 + r0
            int r11 = r3 - r0
            short r11 = (short) r11
            r1[r4] = r11
            int r4 = r13.getInt(r3)
            int r11 = r13.getInt(r10)
            if (r4 != r11) goto La2
            int r4 = r3 - r5
            encodeLiteral(r13, r14, r4)
        L5a:
            int r4 = r10 + 4
            int r5 = r3 + 4
            int r4 = findMatchingLength(r13, r4, r5, r15)
            int r4 = r4 + 4
            int r5 = r3 + r4
            int r3 = r3 - r10
            encodeCopy(r14, r3, r4)
            int r3 = r13.readerIndex()
            int r3 = r3 + r4
            r13.readerIndex(r3)
            int r3 = r5 + (-1)
            if (r5 < r8) goto L77
            goto L3d
        L77:
            int r3 = hash(r13, r3, r2)
            int r4 = r5 - r0
            int r6 = r4 + (-1)
            short r6 = (short) r6
            r1[r3] = r6
            int r3 = hash(r13, r5, r2)
            short r6 = r1[r3]
            int r10 = r0 + r6
            short r4 = (short) r4
            r1[r3] = r4
            int r3 = r13.getInt(r5)
            int r4 = r13.getInt(r10)
            if (r3 == r4) goto La0
            int r3 = r5 + 1
            int r4 = hash(r13, r3, r2)
            int r3 = r5 + 1
            goto L32
        La0:
            r3 = r5
            goto L5a
        La2:
            r3 = r6
            r6 = r7
            r4 = r9
            goto L34
        La6:
            if (r0 >= r15) goto Lac
            int r15 = r15 - r0
            encodeLiteral(r13, r14, r15)
        Lac:
            return
    }

    public void reset() {
            r1 = this;
            io.netty.handler.codec.compression.Snappy$State r0 = io.netty.handler.codec.compression.Snappy.State.READY
            r1.state = r0
            r0 = 0
            r1.tag = r0
            r1.written = r0
            return
    }
}
