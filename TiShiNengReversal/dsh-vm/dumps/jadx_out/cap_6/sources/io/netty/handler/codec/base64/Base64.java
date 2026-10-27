package io.netty.handler.codec.base64;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Base64 {
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    private static final int MAX_LINE_LENGTH = 76;
    private static final byte NEW_LINE = 10;
    private static final byte WHITE_SPACE_ENC = -5;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.base64.Base64$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Decoder implements io.netty.util.ByteProcessor {

        /* renamed from: b4, reason: collision with root package name */
        private final byte[] f49b4;
        private int b4Posn;
        private byte[] decodabet;
        private io.netty.buffer.ByteBuf dest;
        private int outBuffPosn;
        private byte sbiCrop;
        private byte sbiDecode;

        private Decoder() {
                r1 = this;
                r1.<init>()
                r0 = 4
                byte[] r0 = new byte[r0]
                r1.f49b4 = r0
                return
        }

        /* synthetic */ Decoder(io.netty.handler.codec.base64.Base64.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private static int decode4to3(byte[] r8, io.netty.buffer.ByteBuf r9, int r10, byte[] r11) {
                r0 = 0
                r0 = r8[r0]
                r1 = 1
                r2 = r8[r1]
                r3 = 2
                r4 = r8[r3]
                java.lang.String r5 = "not encoded in Base64"
                r6 = 61
                if (r4 != r6) goto L25
                r8 = r11[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L1f
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r8 = r8 << r3
                r11 = r11[r2]     // Catch: java.lang.IndexOutOfBoundsException -> L1f
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 >>> 4
                r8 = r8 | r11
                r9.setByte(r10, r8)
                return r1
            L1f:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r8.<init>(r5)
                throw r8
            L25:
                r1 = 3
                r8 = r8[r1]
                if (r8 != r6) goto L6d
                r8 = r11[r2]
                java.nio.ByteOrder r1 = r9.order()     // Catch: java.lang.IndexOutOfBoundsException -> L67
                java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN     // Catch: java.lang.IndexOutOfBoundsException -> L67
                if (r1 != r2) goto L4c
                r0 = r11[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L67
                r0 = r0 & 63
                int r0 = r0 << r3
                r1 = r8 & 240(0xf0, float:3.36E-43)
                int r1 = r1 >> 4
                r0 = r0 | r1
                int r0 = r0 << 8
                r8 = r8 & 15
                int r8 = r8 << 4
                r8 = r8 | r0
                r11 = r11[r4]     // Catch: java.lang.IndexOutOfBoundsException -> L67
                r11 = r11 & 252(0xfc, float:3.53E-43)
                int r11 = r11 >>> r3
                r8 = r8 | r11
                goto L63
            L4c:
                r0 = r11[r0]     // Catch: java.lang.IndexOutOfBoundsException -> L67
                r0 = r0 & 63
                int r0 = r0 << r3
                r1 = r8 & 240(0xf0, float:3.36E-43)
                int r1 = r1 >> 4
                r0 = r0 | r1
                r8 = r8 & 15
                int r8 = r8 << 4
                r11 = r11[r4]     // Catch: java.lang.IndexOutOfBoundsException -> L67
                r11 = r11 & 252(0xfc, float:3.53E-43)
                int r11 = r11 >>> r3
                r8 = r8 | r11
                int r8 = r8 << 8
                r8 = r8 | r0
            L63:
                r9.setShort(r10, r8)
                return r3
            L67:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r8.<init>(r5)
                throw r8
            L6d:
                java.nio.ByteOrder r6 = r9.order()     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                if (r6 != r7) goto L8f
                r0 = r11[r0]     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                r0 = r0 & 63
                int r0 = r0 << 18
                r2 = r11[r2]     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r2 = r2 << 12
                r0 = r0 | r2
                r2 = r11[r4]     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r2 = r2 << 6
                r0 = r0 | r2
                r8 = r11[r8]     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                r8 = r8 & 255(0xff, float:3.57E-43)
            L8d:
                r8 = r8 | r0
                goto Lb3
            L8f:
                r2 = r11[r2]     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                r4 = r11[r4]     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                r0 = r11[r0]     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                r0 = r0 & 63
                int r0 = r0 << r3
                r3 = r2 & 15
                int r3 = r3 << 12
                r0 = r0 | r3
                r2 = r2 & 240(0xf0, float:3.36E-43)
                int r2 = r2 >>> 4
                r0 = r0 | r2
                r2 = r4 & 3
                int r2 = r2 << 22
                r0 = r0 | r2
                r2 = r4 & 252(0xfc, float:3.53E-43)
                int r2 = r2 << 6
                r0 = r0 | r2
                r8 = r11[r8]     // Catch: java.lang.IndexOutOfBoundsException -> Lb7
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r8 = r8 << 16
                goto L8d
            Lb3:
                r9.setMedium(r10, r8)
                return r1
            Lb7:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                r8.<init>(r5)
                throw r8
        }

        io.netty.buffer.ByteBuf decode(io.netty.buffer.ByteBuf r2, int r3, int r4, io.netty.buffer.ByteBufAllocator r5, io.netty.handler.codec.base64.Base64Dialect r6) {
                r1 = this;
                int r0 = io.netty.handler.codec.base64.Base64.decodedBufferSize(r4)
                io.netty.buffer.ByteBuf r5 = r5.buffer(r0)
                java.nio.ByteOrder r0 = r2.order()
                io.netty.buffer.ByteBuf r5 = r5.order(r0)
                r1.dest = r5
                byte[] r5 = io.netty.handler.codec.base64.Base64.access$100(r6)
                r1.decodabet = r5
                r2.forEachByte(r3, r4, r1)     // Catch: java.lang.Throwable -> L25
                io.netty.buffer.ByteBuf r2 = r1.dest     // Catch: java.lang.Throwable -> L25
                int r3 = r1.outBuffPosn     // Catch: java.lang.Throwable -> L25
                r4 = 0
                io.netty.buffer.ByteBuf r2 = r2.slice(r4, r3)     // Catch: java.lang.Throwable -> L25
                return r2
            L25:
                r2 = move-exception
                io.netty.buffer.ByteBuf r3 = r1.dest
                r3.release()
                io.netty.util.internal.PlatformDependent.throwException(r2)
                r2 = 0
                return r2
        }

        public boolean process(byte r5) throws java.lang.Exception {
                r4 = this;
                r0 = r5 & 127(0x7f, float:1.78E-43)
                byte r0 = (byte) r0
                r4.sbiCrop = r0
                byte[] r1 = r4.decodabet
                r2 = r1[r0]
                r4.sbiDecode = r2
                r3 = -5
                if (r2 < r3) goto L35
                r5 = -1
                if (r2 < r5) goto L33
                byte[] r5 = r4.f49b4
                int r2 = r4.b4Posn
                int r3 = r2 + 1
                r4.b4Posn = r3
                r5[r2] = r0
                r0 = 3
                if (r3 <= r0) goto L33
                int r0 = r4.outBuffPosn
                io.netty.buffer.ByteBuf r2 = r4.dest
                int r5 = decode4to3(r5, r2, r0, r1)
                int r0 = r0 + r5
                r4.outBuffPosn = r0
                r5 = 0
                r4.b4Posn = r5
                byte r0 = r4.sbiCrop
                r1 = 61
                if (r0 != r1) goto L33
                return r5
            L33:
                r5 = 1
                return r5
            L35:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "invalid bad Base64 input character: "
                r1.append(r2)
                r5 = r5 & 255(0xff, float:3.57E-43)
                short r5 = (short) r5
                r1.append(r5)
                java.lang.String r5 = " (decimal)"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }
    }

    private Base64() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ byte[] access$100(io.netty.handler.codec.base64.Base64Dialect r0) {
            byte[] r0 = decodabet(r0)
            return r0
    }

    private static byte[] alphabet(io.netty.handler.codec.base64.Base64Dialect r1) {
            if (r1 == 0) goto L5
            byte[] r1 = r1.alphabet
            return r1
        L5:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "dialect"
            r1.<init>(r0)
            throw r1
    }

    private static boolean breakLines(io.netty.handler.codec.base64.Base64Dialect r1) {
            if (r1 == 0) goto L5
            boolean r1 = r1.breakLinesByDefault
            return r1
        L5:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "dialect"
            r1.<init>(r0)
            throw r1
    }

    private static byte[] decodabet(io.netty.handler.codec.base64.Base64Dialect r1) {
            if (r1 == 0) goto L5
            byte[] r1 = r1.decodabet
            return r1
        L5:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "dialect"
            r1.<init>(r0)
            throw r1
    }

    public static io.netty.buffer.ByteBuf decode(io.netty.buffer.ByteBuf r1) {
            io.netty.handler.codec.base64.Base64Dialect r0 = io.netty.handler.codec.base64.Base64Dialect.STANDARD
            io.netty.buffer.ByteBuf r1 = decode(r1, r0)
            return r1
    }

    public static io.netty.buffer.ByteBuf decode(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            io.netty.handler.codec.base64.Base64Dialect r0 = io.netty.handler.codec.base64.Base64Dialect.STANDARD
            io.netty.buffer.ByteBuf r1 = decode(r1, r2, r3, r0)
            return r1
    }

    public static io.netty.buffer.ByteBuf decode(io.netty.buffer.ByteBuf r1, int r2, int r3, io.netty.handler.codec.base64.Base64Dialect r4) {
            io.netty.buffer.ByteBufAllocator r0 = r1.alloc()
            io.netty.buffer.ByteBuf r1 = decode(r1, r2, r3, r4, r0)
            return r1
    }

    public static io.netty.buffer.ByteBuf decode(io.netty.buffer.ByteBuf r6, int r7, int r8, io.netty.handler.codec.base64.Base64Dialect r9, io.netty.buffer.ByteBufAllocator r10) {
            if (r6 == 0) goto L1c
            if (r9 == 0) goto L14
            io.netty.handler.codec.base64.Base64$Decoder r0 = new io.netty.handler.codec.base64.Base64$Decoder
            r1 = 0
            r0.<init>(r1)
            r1 = r6
            r2 = r7
            r3 = r8
            r5 = r9
            r4 = r10
            io.netty.buffer.ByteBuf r6 = r0.decode(r1, r2, r3, r4, r5)
            return r6
        L14:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "dialect"
            r6.<init>(r7)
            throw r6
        L1c:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "src"
            r6.<init>(r7)
            throw r6
    }

    public static io.netty.buffer.ByteBuf decode(io.netty.buffer.ByteBuf r2, io.netty.handler.codec.base64.Base64Dialect r3) {
            if (r2 == 0) goto L16
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            io.netty.buffer.ByteBuf r3 = decode(r2, r0, r1, r3)
            int r0 = r2.writerIndex()
            r2.readerIndex(r0)
            return r3
        L16:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "src"
            r2.<init>(r3)
            throw r2
    }

    static int decodedBufferSize(int r1) {
            int r0 = r1 >>> 2
            int r1 = r1 - r0
            return r1
    }

    public static io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBuf r1) {
            io.netty.handler.codec.base64.Base64Dialect r0 = io.netty.handler.codec.base64.Base64Dialect.STANDARD
            io.netty.buffer.ByteBuf r1 = encode(r1, r0)
            return r1
    }

    public static io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            io.netty.handler.codec.base64.Base64Dialect r0 = io.netty.handler.codec.base64.Base64Dialect.STANDARD
            io.netty.buffer.ByteBuf r1 = encode(r1, r2, r3, r0)
            return r1
    }

    public static io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBuf r1, int r2, int r3, io.netty.handler.codec.base64.Base64Dialect r4) {
            boolean r0 = breakLines(r4)
            io.netty.buffer.ByteBuf r1 = encode(r1, r2, r3, r0, r4)
            return r1
    }

    public static io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBuf r1, int r2, int r3, boolean r4) {
            io.netty.handler.codec.base64.Base64Dialect r0 = io.netty.handler.codec.base64.Base64Dialect.STANDARD
            io.netty.buffer.ByteBuf r1 = encode(r1, r2, r3, r4, r0)
            return r1
    }

    public static io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBuf r6, int r7, int r8, boolean r9, io.netty.handler.codec.base64.Base64Dialect r10) {
            io.netty.buffer.ByteBufAllocator r5 = r6.alloc()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            io.netty.buffer.ByteBuf r6 = encode(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBuf r9, int r10, int r11, boolean r12, io.netty.handler.codec.base64.Base64Dialect r13, io.netty.buffer.ByteBufAllocator r14) {
            if (r9 == 0) goto L65
            if (r13 == 0) goto L5d
            int r0 = encodedBufferSize(r11, r12)
            io.netty.buffer.ByteBuf r14 = r14.buffer(r0)
            java.nio.ByteOrder r0 = r9.order()
            io.netty.buffer.ByteBuf r4 = r14.order(r0)
            byte[] r6 = alphabet(r13)
            int r13 = r11 + (-2)
            r14 = 0
            r0 = 0
            r5 = 0
            r7 = 0
        L1e:
            r8 = 10
            if (r0 >= r13) goto L3f
            int r2 = r0 + r10
            r3 = 3
            r1 = r9
            encode3to4(r1, r2, r3, r4, r5, r6)
            int r7 = r7 + 4
            if (r12 == 0) goto L39
            r9 = 76
            if (r7 != r9) goto L39
            int r9 = r5 + 4
            r4.setByte(r9, r8)
            int r5 = r5 + 1
            r7 = 0
        L39:
            int r0 = r0 + 3
            int r5 = r5 + 4
            r9 = r1
            goto L1e
        L3f:
            r1 = r9
            if (r0 >= r11) goto L4b
            int r2 = r0 + r10
            int r3 = r11 - r0
            encode3to4(r1, r2, r3, r4, r5, r6)
            int r5 = r5 + 4
        L4b:
            r9 = 1
            if (r5 <= r9) goto L58
            int r9 = r5 + (-1)
            byte r9 = r4.getByte(r9)
            if (r9 != r8) goto L58
            int r5 = r5 + (-1)
        L58:
            io.netty.buffer.ByteBuf r9 = r4.slice(r14, r5)
            return r9
        L5d:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "dialect"
            r9.<init>(r10)
            throw r9
        L65:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "src"
            r9.<init>(r10)
            throw r9
    }

    public static io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBuf r1, io.netty.handler.codec.base64.Base64Dialect r2) {
            boolean r0 = breakLines(r2)
            io.netty.buffer.ByteBuf r1 = encode(r1, r0, r2)
            return r1
    }

    public static io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBuf r1, boolean r2) {
            io.netty.handler.codec.base64.Base64Dialect r0 = io.netty.handler.codec.base64.Base64Dialect.STANDARD
            io.netty.buffer.ByteBuf r1 = encode(r1, r2, r0)
            return r1
    }

    public static io.netty.buffer.ByteBuf encode(io.netty.buffer.ByteBuf r2, boolean r3, io.netty.handler.codec.base64.Base64Dialect r4) {
            if (r2 == 0) goto L16
            int r0 = r2.readerIndex()
            int r1 = r2.readableBytes()
            io.netty.buffer.ByteBuf r3 = encode(r2, r0, r1, r3, r4)
            int r4 = r2.writerIndex()
            r2.readerIndex(r4)
            return r3
        L16:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "src"
            r2.<init>(r3)
            throw r2
    }

    private static void encode3to4(io.netty.buffer.ByteBuf r5, int r6, int r7, io.netty.buffer.ByteBuf r8, int r9, byte[] r10) {
            java.nio.ByteOrder r0 = r5.order()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 != r1) goto L30
            if (r7 == r4) goto L24
            if (r7 == r3) goto L1b
            if (r7 > 0) goto L12
            goto L2c
        L12:
            int r5 = r5.getMedium(r6)
            int r2 = toIntBE(r5)
            goto L2c
        L1b:
            short r5 = r5.getShort(r6)
            int r2 = toIntBE(r5)
            goto L2c
        L24:
            byte r5 = r5.getByte(r6)
            int r2 = toInt(r5)
        L2c:
            encode3to4BigEndian(r2, r7, r8, r9, r10)
            return
        L30:
            if (r7 == r4) goto L49
            if (r7 == r3) goto L40
            if (r7 > 0) goto L37
            goto L51
        L37:
            int r5 = r5.getMedium(r6)
            int r2 = toIntLE(r5)
            goto L51
        L40:
            short r5 = r5.getShort(r6)
            int r2 = toIntLE(r5)
            goto L51
        L49:
            byte r5 = r5.getByte(r6)
            int r2 = toInt(r5)
        L51:
            encode3to4LittleEndian(r2, r7, r8, r9, r10)
            return
    }

    private static void encode3to4BigEndian(int r1, int r2, io.netty.buffer.ByteBuf r3, int r4, byte[] r5) {
            r0 = 1
            if (r2 == r0) goto L49
            r0 = 2
            if (r2 == r0) goto L2b
            r0 = 3
            if (r2 == r0) goto La
            return
        La:
            int r2 = r1 >>> 18
            r2 = r5[r2]
            int r2 = r2 << 24
            int r0 = r1 >>> 12
            r0 = r0 & 63
            r0 = r5[r0]
            int r0 = r0 << 16
            r2 = r2 | r0
            int r0 = r1 >>> 6
            r0 = r0 & 63
            r0 = r5[r0]
            int r0 = r0 << 8
            r2 = r2 | r0
            r1 = r1 & 63
            r1 = r5[r1]
            r1 = r1 | r2
            r3.setInt(r4, r1)
            return
        L2b:
            int r2 = r1 >>> 18
            r2 = r5[r2]
            int r2 = r2 << 24
            int r0 = r1 >>> 12
            r0 = r0 & 63
            r0 = r5[r0]
            int r0 = r0 << 16
            r2 = r2 | r0
            int r1 = r1 >>> 6
            r1 = r1 & 63
            r1 = r5[r1]
            int r1 = r1 << 8
            r1 = r1 | r2
            r1 = r1 | 61
            r3.setInt(r4, r1)
            return
        L49:
            int r2 = r1 >>> 18
            r2 = r5[r2]
            int r2 = r2 << 24
            int r1 = r1 >>> 12
            r1 = r1 & 63
            r1 = r5[r1]
            int r1 = r1 << 16
            r1 = r1 | r2
            r1 = r1 | 15677(0x3d3d, float:2.1968E-41)
            r3.setInt(r4, r1)
            return
    }

    private static void encode3to4LittleEndian(int r1, int r2, io.netty.buffer.ByteBuf r3, int r4, byte[] r5) {
            r0 = 1
            if (r2 == r0) goto L48
            r0 = 2
            if (r2 == r0) goto L2b
            r0 = 3
            if (r2 == r0) goto La
            return
        La:
            int r2 = r1 >>> 18
            r2 = r5[r2]
            int r0 = r1 >>> 12
            r0 = r0 & 63
            r0 = r5[r0]
            int r0 = r0 << 8
            r2 = r2 | r0
            int r0 = r1 >>> 6
            r0 = r0 & 63
            r0 = r5[r0]
            int r0 = r0 << 16
            r2 = r2 | r0
            r1 = r1 & 63
            r1 = r5[r1]
            int r1 = r1 << 24
            r1 = r1 | r2
            r3.setInt(r4, r1)
            return
        L2b:
            int r2 = r1 >>> 18
            r2 = r5[r2]
            int r0 = r1 >>> 12
            r0 = r0 & 63
            r0 = r5[r0]
            int r0 = r0 << 8
            r2 = r2 | r0
            int r1 = r1 >>> 6
            r1 = r1 & 63
            r1 = r5[r1]
            int r1 = r1 << 16
            r1 = r1 | r2
            r2 = 1023410176(0x3d000000, float:0.03125)
            r1 = r1 | r2
            r3.setInt(r4, r1)
            return
        L48:
            int r2 = r1 >>> 18
            r2 = r5[r2]
            int r1 = r1 >>> 12
            r1 = r1 & 63
            r1 = r5[r1]
            int r1 = r1 << 8
            r1 = r1 | r2
            r2 = 1027407872(0x3d3d0000, float:0.046142578)
            r1 = r1 | r2
            r3.setInt(r4, r1)
            return
    }

    static int encodedBufferSize(int r6, boolean r7) {
            long r0 = (long) r6
            r6 = 2
            long r0 = r0 << r6
            r2 = 3
            long r0 = r0 / r2
            long r2 = r2 + r0
            r4 = -4
            long r2 = r2 & r4
            if (r7 == 0) goto L10
            r6 = 76
            long r0 = r0 / r6
            long r2 = r2 + r0
        L10:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L19
            int r6 = (int) r2
            return r6
        L19:
            r6 = 2147483647(0x7fffffff, float:NaN)
            return r6
    }

    private static int toInt(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            return r0
    }

    private static int toIntBE(int r1) {
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            return r1
    }

    private static int toIntBE(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = r1 << 8
            return r1
    }

    private static int toIntLE(int r2) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r2 = r2 & r1
            int r2 = r2 >>> 16
            r2 = r2 | r0
            return r2
    }

    private static int toIntLE(short r2) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r1 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r1
            r2 = r2 | r0
            return r2
    }
}
